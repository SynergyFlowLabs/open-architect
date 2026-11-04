package com.devtodev.analytics.internal.migrator;

import android.content.Context;
import com.devtodev.analytics.internal.logger.Logger;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
class IOUtils {
    static final String STORE_FOR_UDID = "store_for_udid";
    private final Context context;
    private final String key;
    private IStamp stamp = new Stamp();

    public IOUtils(String str, Context context) {
        this.key = str;
        this.context = context;
    }

    private Object getDataStorage(Object obj, String str) {
        try {
            HashMap map = (HashMap) obj;
            if (map.size() > 0) {
                Iterator it = map.keySet().iterator();
                while (it.hasNext()) {
                    if (str.equals(it.next().toString())) {
                        Object obj2 = map.get(str);
                        if (obj2.getClass().getSimpleName().equals("DataStorage")) {
                            return obj2;
                        }
                    }
                }
            }
        } catch (Exception e10) {
            Logger.INSTANCE.error("[Migration]", e10);
        }
        return null;
    }

    private Object getFieldValue(Object obj, String str) throws IllegalAccessException, NoSuchFieldException {
        Field declaredField = obj.getClass().getDeclaredField(str);
        declaredField.setAccessible(true);
        return declaredField.get(obj);
    }

    private void getFromDataStorage(Object obj) throws IllegalAccessException, NoSuchFieldException {
        Object fieldValue;
        String string = obj.toString();
        this.stamp.takeLevel(string);
        for (Field field : obj.getClass().getDeclaredFields()) {
            if (field != null && (fieldValue = getFieldValue(obj, field.getName())) != null) {
                if (this.stamp.UserCardIsEmpty().booleanValue()) {
                    Field[] declaredFields = fieldValue.getClass().getDeclaredFields();
                    if (declaredFields.length > 0) {
                        for (Field field2 : declaredFields) {
                            Object fieldValue2 = getFieldValue(fieldValue, field2.getName());
                            if (fieldValue2 instanceof ConcurrentHashMap) {
                                this.stamp.takePeopleCard(fieldValue2);
                            }
                        }
                    }
                }
                if (fieldValue instanceof ArrayList) {
                    ArrayList<?> arrayList = (ArrayList) fieldValue;
                    if (this.stamp.tutorialJsonIsEmpty().booleanValue()) {
                        this.stamp.takeTutorialData(arrayList);
                    }
                    if (this.stamp.ordersJsonIsEmpty().booleanValue()) {
                        this.stamp.getOrderData(arrayList);
                    }
                } else if (this.stamp.UserIdIsNull().booleanValue()) {
                    this.stamp.takeUserId(string, fieldValue);
                }
            }
        }
    }

    public static String loadUDIDLocally(Context context) {
        File fileStreamPath = context.getFileStreamPath(STORE_FOR_UDID);
        if (fileStreamPath.exists()) {
            return com.devtodev.core.utils.IOUtils.loadString(fileStreamPath);
        }
        return null;
    }

    private Object tryGetHashMap(Object obj) throws IllegalAccessException {
        for (Field field : obj.getClass().getDeclaredFields()) {
            field.setAccessible(true);
            Object obj2 = field.get(obj);
            if (obj2 != null && obj2.getClass().getSimpleName().equals("HashMap")) {
                return obj2;
            }
        }
        return null;
    }

    public JSONObject extractDataInJson(Object obj) {
        Object dataStorage;
        try {
            this.stamp.takeActiveUser(obj);
            if (this.stamp.activeUserIsNull()) {
                return new JSONObject();
            }
            String activeUser = this.stamp.getActiveUser();
            for (Field field : obj.getClass().getDeclaredFields()) {
                if (field != null) {
                    field.setAccessible(true);
                    Object obj2 = field.get(obj);
                    if (obj2 != null) {
                        if (this.stamp.trackingStatusIsNull().booleanValue() && (obj2 instanceof Integer)) {
                            this.stamp.takeTrackingStatus((Integer) obj2);
                        }
                        Object objTryGetHashMap = tryGetHashMap(obj);
                        if (objTryGetHashMap != null && (dataStorage = getDataStorage(objTryGetHashMap, activeUser)) != null) {
                            getFromDataStorage(dataStorage);
                        }
                    }
                }
            }
            return this.stamp.getAllData();
        } catch (Exception e10) {
            Logger.INSTANCE.error("[Migration]", e10);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:56:0x0131  */
    public synchronized Object loadStorage(String str, boolean z10) {
        FileInputStream fileInputStream;
        Throwable th2;
        ObjectInputStream objectInputStream;
        Object object;
        String str2;
        String str3;
        ObjectInputStream objectInputStream2 = null;
        try {
            try {
                try {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(this.context.getFilesDir().getAbsolutePath());
                    String str4 = File.separator;
                    sb2.append(str4);
                    sb2.append(str);
                    sb2.append("1");
                    File file = new File(sb2.toString());
                    if (file.exists()) {
                        fileInputStream = new FileInputStream(file);
                    } else {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(this.context.getFilesDir().getAbsolutePath());
                        sb3.append(str4);
                        if (z10) {
                            str2 = this.key + str4;
                        } else {
                            str2 = "";
                        }
                        sb3.append(str2);
                        new File(sb3.toString()).mkdirs();
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append(this.context.getFilesDir().getAbsolutePath());
                        sb4.append(str4);
                        if (z10) {
                            str3 = this.key + str4;
                        } else {
                            str3 = "";
                        }
                        sb4.append(str3);
                        sb4.append(str);
                        sb4.append("1");
                        File file2 = new File(sb4.toString());
                        fileInputStream = file2.exists() ? new FileInputStream(file2) : null;
                    }
                } catch (FileNotFoundException e10) {
                    Logger.INSTANCE.error("File not found ", e10);
                }
            } catch (Exception e11) {
                Logger.INSTANCE.error("Exception while read file ", e11);
            }
            if (fileInputStream != null) {
                try {
                    if (fileInputStream.available() > 0) {
                        objectInputStream = new ObjectInputStream(fileInputStream);
                        try {
                            object = objectInputStream.readObject();
                        } catch (Exception unused) {
                            if (objectInputStream != null) {
                                try {
                                    objectInputStream.close();
                                } catch (IOException e12) {
                                    e = e12;
                                    object = null;
                                    Logger.INSTANCE.error("[Migration]", e);
                                }
                            }
                            object = null;
                        } catch (Throwable th3) {
                            th2 = th3;
                            objectInputStream2 = objectInputStream;
                            if (objectInputStream2 != null) {
                                try {
                                    objectInputStream2.close();
                                } catch (IOException e13) {
                                    Logger.INSTANCE.error("[Migration]", e13);
                                    throw th2;
                                }
                            }
                            fileInputStream.close();
                            throw th2;
                        }
                    } else {
                        objectInputStream = null;
                        object = null;
                    }
                } catch (Exception unused2) {
                    objectInputStream = null;
                } catch (Throwable th4) {
                    th2 = th4;
                }
            } else {
                objectInputStream = null;
                object = null;
            }
            if (objectInputStream != null) {
                try {
                    objectInputStream.close();
                } catch (IOException e14) {
                    e = e14;
                    Logger.INSTANCE.error("[Migration]", e);
                }
            }
            if (fileInputStream != null) {
                fileInputStream.close();
            }
        } catch (Throwable th5) {
            throw th5;
        }
        if (object != null) {
            return object;
        }
        return null;
    }
}
