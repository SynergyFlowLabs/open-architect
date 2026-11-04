package com.activeandroid;

import android.content.Context;
import com.activeandroid.serializer.CalendarSerializer;
import com.activeandroid.serializer.FileSerializer;
import com.activeandroid.serializer.SqlDateSerializer;
import com.activeandroid.serializer.TypeSerializer;
import com.activeandroid.serializer.UtilDateSerializer;
import com.activeandroid.util.ReflectionUtils;
import dalvik.system.DexFile;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final class ModelInfo {
    private Map<Class<? extends Model>, TableInfo> mTableInfos = new HashMap();
    private Map<Class<?>, TypeSerializer> mTypeSerializers = new HashMap<Class<?>, TypeSerializer>() { // from class: com.activeandroid.ModelInfo.1
        {
            put(Calendar.class, new CalendarSerializer());
            put(Date.class, new SqlDateSerializer());
            put(java.util.Date.class, new UtilDateSerializer());
            put(File.class, new FileSerializer());
        }
    };

    public ModelInfo(Configuration configuration) {
        if (loadModelFromMetaData(configuration)) {
            return;
        }
        try {
            scanForModel(configuration.getContext());
        } catch (IOException unused) {
        }
    }

    private boolean loadModelFromMetaData(Configuration configuration) {
        if (!configuration.isValid()) {
            return false;
        }
        List<Class<? extends Model>> modelClasses = configuration.getModelClasses();
        if (modelClasses != null) {
            for (Class<? extends Model> cls : modelClasses) {
                this.mTableInfos.put(cls, new TableInfo(cls));
            }
        }
        List<Class<? extends TypeSerializer>> typeSerializers = configuration.getTypeSerializers();
        if (typeSerializers != null) {
            Iterator<Class<? extends TypeSerializer>> it = typeSerializers.iterator();
            while (it.hasNext()) {
                try {
                    TypeSerializer typeSerializerNewInstance = it.next().newInstance();
                    this.mTypeSerializers.put(typeSerializerNewInstance.getDeserializedType(), typeSerializerNewInstance);
                } catch (IllegalAccessException | InstantiationException unused) {
                }
            }
        }
        return true;
    }

    private void scanForModel(Context context) throws IOException {
        String packageName = context.getPackageName();
        String str = context.getApplicationInfo().sourceDir;
        ArrayList arrayList = new ArrayList();
        if (str == null || new File(str).isDirectory()) {
            Enumeration<URL> resources = Thread.currentThread().getContextClassLoader().getResources("");
            while (resources.hasMoreElements()) {
                String file = resources.nextElement().getFile();
                if (file.contains("bin") || file.contains("classes")) {
                    arrayList.add(file);
                }
            }
        } else {
            Enumeration<String> enumerationEntries = new DexFile(str).entries();
            while (enumerationEntries.hasMoreElements()) {
                arrayList.add(enumerationEntries.nextElement());
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            scanForModelClasses(new File((String) it.next()), packageName, context.getClassLoader());
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0068 A[Catch: ClassNotFoundException | IllegalAccessException | InstantiationException -> 0x008b, TryCatch #0 {ClassNotFoundException | IllegalAccessException | InstantiationException -> 0x008b, blocks: (B:15:0x005c, B:17:0x0068, B:19:0x0074, B:21:0x007b), top: B:25:0x005c }] */
    /* JADX WARN: Code duplicated, block: B:19:0x0074 A[Catch: ClassNotFoundException | IllegalAccessException | InstantiationException -> 0x008b, TryCatch #0 {ClassNotFoundException | IllegalAccessException | InstantiationException -> 0x008b, blocks: (B:15:0x005c, B:17:0x0068, B:19:0x0074, B:21:0x007b), top: B:25:0x005c }] */
    /* JADX WARN: Code duplicated, block: B:21:0x007b A[Catch: ClassNotFoundException | IllegalAccessException | InstantiationException -> 0x008b, TRY_LEAVE, TryCatch #0 {ClassNotFoundException | IllegalAccessException | InstantiationException -> 0x008b, blocks: (B:15:0x005c, B:17:0x0068, B:19:0x0074, B:21:0x007b), top: B:25:0x005c }] */
    private void scanForModelClasses(File file, String str, ClassLoader classLoader) {
        Class<?> cls;
        String strReplace;
        int iLastIndexOf;
        if (file.isDirectory()) {
            for (File file2 : file.listFiles()) {
                scanForModelClasses(file2, str, classLoader);
            }
        } else {
            String name = file.getName();
            if (file.getPath().equals(name)) {
                cls = Class.forName(name, false, classLoader);
                if (ReflectionUtils.isModel(cls)) {
                    this.mTableInfos.put((Class<? extends Model>) cls, new TableInfo(cls));
                } else if (ReflectionUtils.isTypeSerializer(cls)) {
                    TypeSerializer typeSerializer = (TypeSerializer) cls.newInstance();
                    this.mTypeSerializers.put(typeSerializer.getDeserializedType(), typeSerializer);
                }
            } else {
                String path = file.getPath();
                if (path.endsWith(".class") && (iLastIndexOf = (strReplace = path.substring(0, path.length() - 6).replace(System.getProperty("file.separator"), ".")).lastIndexOf(str)) >= 0) {
                    name = strReplace.substring(iLastIndexOf);
                    try {
                        cls = Class.forName(name, false, classLoader);
                        if (ReflectionUtils.isModel(cls)) {
                            this.mTableInfos.put((Class<? extends Model>) cls, new TableInfo(cls));
                        } else if (ReflectionUtils.isTypeSerializer(cls)) {
                            TypeSerializer typeSerializer2 = (TypeSerializer) cls.newInstance();
                            this.mTypeSerializers.put(typeSerializer2.getDeserializedType(), typeSerializer2);
                        }
                    } catch (ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
                    }
                }
            }
        }
    }

    public TableInfo getTableInfo(Class<? extends Model> cls) {
        return this.mTableInfos.get(cls);
    }

    public Collection<TableInfo> getTableInfos() {
        return this.mTableInfos.values();
    }

    public TypeSerializer getTypeSerializer(Class<?> cls) {
        return this.mTypeSerializers.get(cls);
    }
}
