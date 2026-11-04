package com.devtodev.core.utils;

import android.content.Context;
import com.devtodev.core.data.consts.RequestParams;
import com.devtodev.core.logic.DataStorage;
import com.devtodev.core.logic.SDKClient;
import com.devtodev.core.utils.log.CoreLog;
import com.facebook.appevents.p;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.StreamCorruptedException;
import java.lang.reflect.InvocationTargetException;
import java.util.Locale;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public class IOUtils {
    public static final String TAG = "IOUtils";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String[] f98344a = {p.f99189d0, "1", "2", androidx.exifinterface.media.a.f51345a5, "4", "5", "6", "7", "8", "9", androidx.media3.exoplayer.upstream.h.f65998l, "b", "c", "d", "e", RequestParams.F};

    private static <T> T a(Class<T> cls) {
        cls.getName();
        try {
            return cls.getConstructor(null).newInstance(null);
        } catch (IllegalAccessException e10) {
            CoreLog.e("DevToDev", "", e10);
            return null;
        } catch (InstantiationException e11) {
            CoreLog.e("DevToDev", "", e11);
            return null;
        } catch (NoSuchMethodException e12) {
            CoreLog.e("DevToDev", "", e12);
            return null;
        } catch (InvocationTargetException e13) {
            CoreLog.e("DevToDev", "", e13);
            return null;
        }
    }

    public static synchronized boolean deleteStorage(Context context, String str) {
        try {
            String absolutePath = context.getFilesDir().getAbsolutePath();
            String applicationKey = SDKClient.getInstance().getApplicationKey();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(absolutePath);
            String str2 = File.separator;
            sb2.append(str2);
            sb2.append(str);
            sb2.append("1");
            File file = new File(sb2.toString());
            if (!file.exists()) {
                CoreLog.d("DevToDev", "Old storage not found, try delete new...");
                file = new File(absolutePath + str2 + applicationKey + str2 + str + "1");
            }
            if (!file.exists()) {
                return false;
            }
            return file.delete();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public static boolean isStorageExist(Context context, String str) {
        return new File(context.getFilesDir().getAbsolutePath() + File.separator + (str + "1")).exists();
    }

    public static synchronized DataStorage loadDataStorage(Context context) {
        DataStorage dataStorage;
        try {
            int i10 = 0;
            dataStorage = (DataStorage) loadStorage(context, DataStorage.class, DataStorage.NAME, false);
            if (dataStorage.getLevel() == 1) {
                FileInputStream fileInputStream = null;
                try {
                    try {
                        try {
                            FileInputStream fileInputStream2 = new FileInputStream(new File(context.getFilesDir().getAbsolutePath() + File.separator + "b1"));
                            try {
                                byte[] bArr = new byte[fileInputStream2.available()];
                                while (i10 != -1) {
                                    i10 = fileInputStream2.read(bArr);
                                    String strA = a(bArr);
                                    int iIndexOf = strA.indexOf("7870");
                                    dataStorage.setLevel(a(strA.substring(iIndexOf + 4, iIndexOf + 12)));
                                }
                                fileInputStream2.close();
                            } catch (Exception e10) {
                                e = e10;
                                fileInputStream = fileInputStream2;
                                e.printStackTrace();
                                if (fileInputStream != null) {
                                    fileInputStream.close();
                                }
                                return dataStorage;
                            } catch (Throwable th2) {
                                th = th2;
                                fileInputStream = fileInputStream2;
                                if (fileInputStream != null) {
                                    try {
                                        fileInputStream.close();
                                    } catch (IOException e11) {
                                        e11.printStackTrace();
                                    }
                                }
                                throw th;
                            }
                        } catch (IOException e12) {
                            e12.printStackTrace();
                        }
                    } catch (Exception e13) {
                        e = e13;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            }
        } catch (Throwable th4) {
            throw th4;
        }
        return dataStorage;
    }

    /* JADX WARN: Code duplicated, block: B:105:0x0159 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static synchronized <T> T loadStorage(Context context, Class<T> cls, String str, boolean z10) throws ClassNotFoundException, IOException {
        String str2;
        String str3;
        FileInputStream fileInputStream;
        Exception e10;
        ObjectInputStream objectInputStream;
        Object object;
        try {
            try {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(context.getFilesDir().getAbsolutePath());
                String str4 = File.separator;
                sb2.append(str4);
                sb2.append(str);
                sb2.append("1");
                File file = new File(sb2.toString());
                if (file.exists()) {
                    fileInputStream = new FileInputStream(file);
                } else {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(context.getFilesDir().getAbsolutePath());
                    sb3.append(str4);
                    if (z10) {
                        str2 = SDKClient.getInstance().getApplicationKey() + str4;
                    } else {
                        str2 = "";
                    }
                    sb3.append(str2);
                    new File(sb3.toString()).mkdirs();
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(context.getFilesDir().getAbsolutePath());
                    sb4.append(str4);
                    if (z10) {
                        str3 = SDKClient.getInstance().getApplicationKey() + str4;
                    } else {
                        str3 = "";
                    }
                    sb4.append(str3);
                    sb4.append(str);
                    sb4.append("1");
                    File file2 = new File(sb4.toString());
                    if (!file2.exists()) {
                        file2.createNewFile();
                        return (T) a(cls);
                    }
                    fileInputStream = new FileInputStream(file2);
                }
                ObjectInputStream objectInputStream2 = null;
                try {
                    if (fileInputStream.available() > 0) {
                        objectInputStream = new ObjectInputStream(fileInputStream);
                        try {
                            object = objectInputStream.readObject();
                            objectInputStream2 = objectInputStream;
                        } catch (Exception e11) {
                            e10 = e11;
                            try {
                                e10.getMessage();
                                if (objectInputStream != null) {
                                    try {
                                        objectInputStream.close();
                                    } catch (IOException e12) {
                                        e12.getMessage();
                                    }
                                }
                                fileInputStream.close();
                            } catch (Throwable th2) {
                                th = th2;
                                objectInputStream2 = objectInputStream;
                                objectInputStream = objectInputStream2;
                                if (objectInputStream != null) {
                                    try {
                                        objectInputStream.close();
                                    } catch (IOException e13) {
                                        e13.getMessage();
                                        throw th;
                                    }
                                }
                                fileInputStream.close();
                                throw th;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            if (objectInputStream != null) {
                                objectInputStream.close();
                            }
                            fileInputStream.close();
                            throw th;
                        }
                    } else {
                        object = null;
                    }
                    if (objectInputStream2 != null) {
                        try {
                            objectInputStream2.close();
                        } catch (IOException e14) {
                            e14.getMessage();
                        }
                    }
                    fileInputStream.close();
                    objectInputStream2 = object;
                } catch (Exception e15) {
                    e10 = e15;
                    objectInputStream = null;
                } catch (Throwable th4) {
                    th = th4;
                    objectInputStream = objectInputStream2;
                    if (objectInputStream != null) {
                        objectInputStream.close();
                    }
                    fileInputStream.close();
                    throw th;
                }
                try {
                    Objects.toString(objectInputStream2);
                    if (objectInputStream2 == null) {
                        return (T) a(cls);
                    }
                    return cls.cast(objectInputStream2);
                } catch (ClassCastException e16) {
                    e16.getMessage();
                    return (T) a(cls);
                }
            } catch (Throwable th5) {
                throw th5;
            }
        } catch (FileNotFoundException e17) {
            e17.getMessage();
            return (T) a(cls);
        } catch (Exception e18) {
            e18.getMessage();
            return (T) a(cls);
        }
    }

    /* JADX WARN: Not initialized variable reg: 3, insn: 0x0039: MOVE (r1 I:??[OBJECT, ARRAY]) = (r3 I:??[OBJECT, ARRAY]), block:B:20:0x0039 */
    public static synchronized String loadString(File file) {
        FileInputStream fileInputStream;
        ObjectInputStream objectInputStream;
        ObjectInputStream objectInputStream2;
        ObjectInputStream objectInputStream3 = null;
        try {
            try {
                try {
                    fileInputStream = new FileInputStream(file);
                    try {
                        objectInputStream = new ObjectInputStream(fileInputStream);
                        try {
                            Object object = objectInputStream.readObject();
                            if (object instanceof String) {
                                String str = (String) object;
                                try {
                                    objectInputStream.close();
                                    fileInputStream.close();
                                } catch (IOException e10) {
                                    CoreLog.e("DevToDev", "IOException while cleaning up", e10);
                                }
                                return str;
                            }
                            objectInputStream.close();
                            fileInputStream.close();
                        } catch (FileNotFoundException unused) {
                            CoreLog.e("DevToDev", "Couldn't open " + file.getName());
                            if (objectInputStream != null) {
                                objectInputStream.close();
                            }
                            if (fileInputStream != null) {
                                fileInputStream.close();
                            }
                        } catch (StreamCorruptedException unused2) {
                            CoreLog.e("DevToDev", "StreamCorruptedException");
                            if (objectInputStream != null) {
                                objectInputStream.close();
                            }
                            if (fileInputStream != null) {
                                fileInputStream.close();
                            }
                        } catch (IOException unused3) {
                            CoreLog.e("DevToDev", "IOException while reading");
                            if (objectInputStream != null) {
                                objectInputStream.close();
                            }
                            if (fileInputStream != null) {
                                fileInputStream.close();
                            }
                        } catch (ClassNotFoundException unused4) {
                            CoreLog.e("DevToDev", "ClassNotFoundException");
                            if (objectInputStream != null) {
                                objectInputStream.close();
                            }
                            if (fileInputStream != null) {
                                fileInputStream.close();
                            }
                        }
                    } catch (FileNotFoundException unused5) {
                        objectInputStream = null;
                    } catch (StreamCorruptedException unused6) {
                        objectInputStream = null;
                    } catch (IOException unused7) {
                        objectInputStream = null;
                    } catch (ClassNotFoundException unused8) {
                        objectInputStream = null;
                    } catch (Throwable th2) {
                        th = th2;
                        if (objectInputStream3 != null) {
                            try {
                                objectInputStream3.close();
                            } catch (IOException e11) {
                                CoreLog.e("DevToDev", "IOException while cleaning up", e11);
                                throw th;
                            }
                        }
                        if (fileInputStream != null) {
                            fileInputStream.close();
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    objectInputStream3 = objectInputStream2;
                }
            } catch (FileNotFoundException unused9) {
                fileInputStream = null;
                objectInputStream = null;
            } catch (StreamCorruptedException unused10) {
                fileInputStream = null;
                objectInputStream = null;
            } catch (IOException unused11) {
                fileInputStream = null;
                objectInputStream = null;
            } catch (ClassNotFoundException unused12) {
                fileInputStream = null;
                objectInputStream = null;
            } catch (Throwable th4) {
                th = th4;
                fileInputStream = null;
            }
        } catch (IOException e12) {
            CoreLog.e("DevToDev", "IOException while cleaning up", e12);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11, types: [java.io.ObjectOutputStream] */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v9 */
    public static synchronized boolean saveStorage(Context context, Object obj, String str, boolean z10) {
        String str2;
        String string;
        ?? r11;
        FileOutputStream fileOutputStream;
        Throwable th2;
        ObjectOutputStream objectOutputStream;
        IOException e10;
        try {
            CoreLog.d("DevToDev", "Start save " + str);
            if (obj == null) {
                CoreLog.d("DevToDev", str + ": nothing to save");
                return false;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(context.getFilesDir().getAbsolutePath());
            String str3 = File.separator;
            sb2.append(str3);
            if (z10) {
                str2 = SDKClient.getInstance().getApplicationKey() + str3;
            } else {
                str2 = "";
            }
            sb2.append(str2);
            sb2.append(str);
            sb2.append("1");
            File file = new File(sb2.toString());
            StringBuilder sb3 = new StringBuilder();
            sb3.append(context.getFilesDir().getAbsolutePath());
            sb3.append(str3);
            if (z10) {
                StringBuilder sb4 = new StringBuilder();
                String applicationKey = SDKClient.getInstance().getApplicationKey();
                sb4.append(applicationKey);
                sb4.append(str3);
                string = sb4.toString();
                r11 = applicationKey;
            } else {
                string = "";
                r11 = z10;
            }
            sb3.append(string);
            new File(sb3.toString()).mkdirs();
            ?? r10 = 0;
            try {
                fileOutputStream = new FileOutputStream(file);
            } catch (Exception e11) {
                e11.printStackTrace();
                fileOutputStream = null;
            }
            try {
                if (fileOutputStream == null) {
                    return false;
                }
                try {
                    objectOutputStream = new ObjectOutputStream(fileOutputStream);
                    try {
                        objectOutputStream.writeObject(obj);
                        objectOutputStream.reset();
                        try {
                            fileOutputStream.close();
                        } catch (IOException e12) {
                            e12.printStackTrace();
                        }
                        try {
                            objectOutputStream.close();
                        } catch (IOException e13) {
                            e13.printStackTrace();
                        }
                        return true;
                    } catch (IOException e14) {
                        e10 = e14;
                        CoreLog.e("DevToDev", e10.getMessage());
                        try {
                            fileOutputStream.close();
                        } catch (IOException e15) {
                            e15.printStackTrace();
                        }
                        if (objectOutputStream != null) {
                            try {
                                objectOutputStream.close();
                            } catch (IOException e16) {
                                e16.printStackTrace();
                            }
                        }
                        return false;
                    }
                } catch (IOException e17) {
                    objectOutputStream = null;
                    e10 = e17;
                } catch (Throwable th3) {
                    th2 = th3;
                    try {
                        fileOutputStream.close();
                    } catch (IOException e18) {
                        e18.printStackTrace();
                    }
                    if (r10 == 0) {
                        throw th2;
                    }
                    try {
                        r10.close();
                        throw th2;
                    } catch (IOException e19) {
                        e19.printStackTrace();
                        throw th2;
                    }
                }
            } catch (Throwable th4) {
                th2 = th4;
                r10 = r11;
            }
        } catch (Throwable th5) {
            throw th5;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v22 */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r6v5 */
    public static synchronized void saveString(Context context, String str, String str2) {
        ?? r10;
        IOException e10;
        FileOutputStream fileOutputStream;
        ObjectOutputStream objectOutputStream = null;
        try {
            try {
                try {
                    FileOutputStream fileOutputStreamOpenFileOutput = context.openFileOutput(str, 0);
                    try {
                        ObjectOutputStream objectOutputStream2 = new ObjectOutputStream(fileOutputStreamOpenFileOutput);
                        try {
                            objectOutputStream2.writeObject(str2);
                            try {
                                objectOutputStream2.close();
                                context = fileOutputStreamOpenFileOutput;
                                if (fileOutputStreamOpenFileOutput != null) {
                                    fileOutputStreamOpenFileOutput.close();
                                    context = fileOutputStreamOpenFileOutput;
                                }
                            } catch (IOException e11) {
                                CoreLog.e("DevToDev", "IOException while cleaning up");
                                e11.printStackTrace();
                                context = e11;
                            }
                        } catch (IOException e12) {
                            e10 = e12;
                            objectOutputStream = objectOutputStream2;
                            fileOutputStream = fileOutputStreamOpenFileOutput;
                            CoreLog.e("DevToDev", "Couldn't open " + str + "1 for writing");
                            e10.printStackTrace();
                            if (objectOutputStream != null) {
                                try {
                                    objectOutputStream.close();
                                } catch (IOException e13) {
                                    CoreLog.e("DevToDev", "IOException while cleaning up");
                                    e13.printStackTrace();
                                    context = e13;
                                }
                            }
                            context = fileOutputStream;
                            if (fileOutputStream != null) {
                                fileOutputStream.close();
                                context = fileOutputStream;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            objectOutputStream = objectOutputStream2;
                            r10 = fileOutputStreamOpenFileOutput;
                            if (objectOutputStream != null) {
                                try {
                                    objectOutputStream.close();
                                } catch (IOException e14) {
                                    CoreLog.e("DevToDev", "IOException while cleaning up");
                                    e14.printStackTrace();
                                    throw th;
                                }
                            }
                            if (r10 != 0) {
                                r10.close();
                            }
                            throw th;
                        }
                    } catch (IOException e15) {
                        e10 = e15;
                        fileOutputStream = fileOutputStreamOpenFileOutput;
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            } catch (IOException e16) {
                e10 = e16;
                fileOutputStream = null;
            } catch (Throwable th4) {
                th = th4;
                r10 = 0;
            }
        } catch (Throwable th5) {
            th = th5;
            r10 = context;
        }
    }

    private static int a(String str) {
        return Integer.parseInt(str.toUpperCase(Locale.getDefault()), 16);
    }

    private static String a(byte b10) {
        byte b11 = (byte) ((b10 >>> 4) & 15);
        byte b12 = (byte) (b10 & com.google.common.base.c.f116464q);
        StringBuilder sb2 = new StringBuilder();
        String[] strArr = f98344a;
        sb2.append(strArr[b11]);
        sb2.append(strArr[b12]);
        return sb2.toString();
    }

    private static String a(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder(bArr.length * 2);
        for (byte b10 : bArr) {
            sb2.append(a(b10));
        }
        return sb2.toString();
    }
}
