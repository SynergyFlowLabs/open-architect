package androidx.multidex;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import dalvik.system.BaseDexClassLoader;
import dalvik.system.DexFile;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.zip.ZipFile;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final String f70567a = "MultiDex";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f70568b = "secondary-dexes";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f70569c = "code_cache";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f70570d = "secondary-dexes";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f70571e = 20;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f70572f = 4;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f70573g = 2;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f70574h = 1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f70575i = "";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final Set<File> f70576j = new HashSet();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final boolean f70577k = o(System.getProperty("java.vm.version"));

    private static final class a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final int f70578b = 4;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final InterfaceC0622a f70579a;

        /* JADX INFO: renamed from: androidx.multidex.b$a$a, reason: collision with other inner class name */
        private interface InterfaceC0622a {
            Object a(File file, DexFile dexFile) throws IllegalAccessException, InstantiationException, IOException, IllegalArgumentException, InvocationTargetException;
        }

        /* JADX INFO: renamed from: androidx.multidex.b$a$b, reason: collision with other inner class name */
        private static class C0623b implements InterfaceC0622a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final Constructor<?> f70580a;

            C0623b(Class<?> cls) throws NoSuchMethodException, SecurityException {
                Constructor<?> constructor = cls.getConstructor(File.class, ZipFile.class, DexFile.class);
                this.f70580a = constructor;
                constructor.setAccessible(true);
            }

            @Override // androidx.multidex.b.a.InterfaceC0622a
            public Object a(File file, DexFile dexFile) throws IllegalAccessException, InstantiationException, IOException, IllegalArgumentException, InvocationTargetException {
                return this.f70580a.newInstance(file, new ZipFile(file), dexFile);
            }
        }

        private static class c implements InterfaceC0622a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final Constructor<?> f70581a;

            c(Class<?> cls) throws NoSuchMethodException, SecurityException {
                Constructor<?> constructor = cls.getConstructor(File.class, File.class, DexFile.class);
                this.f70581a = constructor;
                constructor.setAccessible(true);
            }

            @Override // androidx.multidex.b.a.InterfaceC0622a
            public Object a(File file, DexFile dexFile) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
                return this.f70581a.newInstance(file, file, dexFile);
            }
        }

        private static class d implements InterfaceC0622a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final Constructor<?> f70582a;

            d(Class<?> cls) throws NoSuchMethodException, SecurityException {
                Constructor<?> constructor = cls.getConstructor(File.class, Boolean.TYPE, File.class, DexFile.class);
                this.f70582a = constructor;
                constructor.setAccessible(true);
            }

            @Override // androidx.multidex.b.a.InterfaceC0622a
            public Object a(File file, DexFile dexFile) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
                return this.f70582a.newInstance(file, Boolean.FALSE, file, dexFile);
            }
        }

        private a() throws NoSuchMethodException, ClassNotFoundException, SecurityException {
            InterfaceC0622a dVar;
            Class<?> cls = Class.forName("dalvik.system.DexPathList$Element");
            try {
                try {
                    dVar = new C0623b(cls);
                } catch (NoSuchMethodException unused) {
                    dVar = new c(cls);
                }
            } catch (NoSuchMethodException unused2) {
                dVar = new d(cls);
            }
            this.f70579a = dVar;
        }

        static void a(ClassLoader classLoader, List<? extends File> list) throws IllegalAccessException, NoSuchFieldException, NoSuchMethodException, InstantiationException, IOException, SecurityException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException {
            Object obj = b.g(classLoader, "pathList").get(classLoader);
            Object[] objArrB = new a().b(list);
            try {
                b.f(obj, "dexElements", objArrB);
            } catch (NoSuchFieldException unused) {
                b.f(obj, "pathElements", objArrB);
            }
        }

        private Object[] b(List<? extends File> list) throws IllegalAccessException, InstantiationException, IOException, SecurityException, IllegalArgumentException, InvocationTargetException {
            int size = list.size();
            Object[] objArr = new Object[size];
            for (int i10 = 0; i10 < size; i10++) {
                File file = list.get(i10);
                objArr[i10] = this.f70579a.a(file, DexFile.loadDex(file.getPath(), c(file), 0));
            }
            return objArr;
        }

        private static String c(File file) {
            File parentFile = file.getParentFile();
            String name = file.getName();
            return new File(parentFile, name.substring(0, name.length() - f70578b) + ".dex").getPath();
        }
    }

    /* JADX INFO: renamed from: androidx.multidex.b$b, reason: collision with other inner class name */
    private static final class C0624b {
        private C0624b() {
        }

        static void a(ClassLoader classLoader, List<? extends File> list, File file) throws IllegalAccessException, NoSuchFieldException, NoSuchMethodException, IOException, IllegalArgumentException, InvocationTargetException {
            IOException[] iOExceptionArr;
            Object obj = b.g(classLoader, "pathList").get(classLoader);
            ArrayList<IOException> arrayList = new ArrayList();
            b.f(obj, "dexElements", b(obj, new ArrayList(list), file, arrayList));
            if (arrayList.size() > 0) {
                for (IOException iOException : arrayList) {
                }
                Field fieldG = b.g(obj, "dexElementsSuppressedExceptions");
                IOException[] iOExceptionArr2 = (IOException[]) fieldG.get(obj);
                if (iOExceptionArr2 == null) {
                    iOExceptionArr = (IOException[]) arrayList.toArray(new IOException[arrayList.size()]);
                } else {
                    IOException[] iOExceptionArr3 = new IOException[arrayList.size() + iOExceptionArr2.length];
                    arrayList.toArray(iOExceptionArr3);
                    System.arraycopy(iOExceptionArr2, 0, iOExceptionArr3, arrayList.size(), iOExceptionArr2.length);
                    iOExceptionArr = iOExceptionArr3;
                }
                fieldG.set(obj, iOExceptionArr);
                IOException iOException2 = new IOException("I/O exception during makeDexElement");
                iOException2.initCause((Throwable) arrayList.get(0));
                throw iOException2;
            }
        }

        private static Object[] b(Object obj, ArrayList<File> arrayList, File file, ArrayList<IOException> arrayList2) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return (Object[]) b.h(obj, "makeDexElements", ArrayList.class, File.class, ArrayList.class).invoke(obj, arrayList, file, arrayList2);
        }
    }

    private static final class c {
        private c() {
        }

        static void a(ClassLoader classLoader, List<? extends File> list) throws IllegalAccessException, NoSuchFieldException, IOException, IllegalArgumentException {
            int size = list.size();
            Field fieldG = b.g(classLoader, "path");
            StringBuilder sb2 = new StringBuilder((String) fieldG.get(classLoader));
            String[] strArr = new String[size];
            File[] fileArr = new File[size];
            ZipFile[] zipFileArr = new ZipFile[size];
            DexFile[] dexFileArr = new DexFile[size];
            ListIterator<? extends File> listIterator = list.listIterator();
            while (listIterator.hasNext()) {
                File next = listIterator.next();
                String absolutePath = next.getAbsolutePath();
                sb2.append(AbstractJsonLexerKt.COLON);
                sb2.append(absolutePath);
                int iPreviousIndex = listIterator.previousIndex();
                strArr[iPreviousIndex] = absolutePath;
                fileArr[iPreviousIndex] = next;
                zipFileArr[iPreviousIndex] = new ZipFile(next);
                dexFileArr[iPreviousIndex] = DexFile.loadDex(absolutePath, absolutePath + ".dex", 0);
            }
            fieldG.set(classLoader, sb2.toString());
            b.f(classLoader, "mPaths", strArr);
            b.f(classLoader, "mFiles", fileArr);
            b.f(classLoader, "mZips", zipFileArr);
            b.f(classLoader, "mDexs", dexFileArr);
        }
    }

    private b() {
    }

    private static void d(Context context) throws Exception {
        File file = new File(context.getFilesDir(), "secondary-dexes");
        if (file.isDirectory()) {
            file.getPath();
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles == null) {
                file.getPath();
                return;
            }
            for (File file2 : fileArrListFiles) {
                file2.getPath();
                file2.length();
                if (file2.delete()) {
                    file2.getPath();
                } else {
                    file2.getPath();
                }
            }
            if (file.delete()) {
                file.getPath();
            } else {
                file.getPath();
            }
        }
    }

    private static void e(Context context, File file, File file2, String str, String str2, boolean z10) throws IllegalAccessException, NoSuchFieldException, NoSuchMethodException, InstantiationException, IOException, SecurityException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException {
        Set<File> set = f70576j;
        synchronized (set) {
            try {
                if (set.contains(file)) {
                    return;
                }
                set.add(file);
                System.getProperty("java.vm.version");
                ClassLoader classLoaderJ = j(context);
                if (classLoaderJ == null) {
                    return;
                }
                try {
                    d(context);
                } catch (Throwable unused) {
                }
                File fileK = k(context, file2, str);
                d dVar = new d(file, fileK);
                try {
                    try {
                        n(classLoaderJ, fileK, dVar.h(context, str2, false));
                    } catch (IOException e10) {
                        if (!z10) {
                            throw e10;
                        }
                        n(classLoaderJ, fileK, dVar.h(context, str2, true));
                    }
                    try {
                        dVar.close();
                        e = null;
                    } catch (IOException e11) {
                        e = e11;
                    }
                    if (e != null) {
                        throw e;
                    }
                } catch (Throwable th2) {
                    try {
                        dVar.close();
                    } catch (IOException unused2) {
                    }
                    throw th2;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void f(Object obj, String str, Object[] objArr) throws IllegalAccessException, NoSuchFieldException, IllegalArgumentException {
        Field fieldG = g(obj, str);
        Object[] objArr2 = (Object[]) fieldG.get(obj);
        Object[] objArr3 = (Object[]) Array.newInstance(objArr2.getClass().getComponentType(), objArr2.length + objArr.length);
        System.arraycopy(objArr2, 0, objArr3, 0, objArr2.length);
        System.arraycopy(objArr, 0, objArr3, objArr2.length, objArr.length);
        fieldG.set(obj, objArr3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Field g(Object obj, String str) throws NoSuchFieldException {
        for (Class<?> superclass = obj.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
            try {
                Field declaredField = superclass.getDeclaredField(str);
                if (!declaredField.isAccessible()) {
                    declaredField.setAccessible(true);
                }
                return declaredField;
            } catch (NoSuchFieldException unused) {
            }
        }
        throw new NoSuchFieldException("Field " + str + " not found in " + obj.getClass());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Method h(Object obj, String str, Class<?>... clsArr) throws NoSuchMethodException {
        for (Class<?> superclass = obj.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
            try {
                Method declaredMethod = superclass.getDeclaredMethod(str, clsArr);
                if (!declaredMethod.isAccessible()) {
                    declaredMethod.setAccessible(true);
                }
                return declaredMethod;
            } catch (NoSuchMethodException unused) {
            }
        }
        throw new NoSuchMethodException("Method " + str + " with parameters " + Arrays.asList(clsArr) + " not found in " + obj.getClass());
    }

    private static ApplicationInfo i(Context context) {
        try {
            return context.getApplicationInfo();
        } catch (RuntimeException unused) {
            return null;
        }
    }

    private static ClassLoader j(Context context) {
        try {
            ClassLoader classLoader = context.getClassLoader();
            if (classLoader instanceof BaseDexClassLoader) {
                return classLoader;
            }
            return null;
        } catch (RuntimeException unused) {
        }
    }

    private static File k(Context context, File file, String str) throws IOException {
        File file2 = new File(file, f70569c);
        try {
            p(file2);
        } catch (IOException unused) {
            file2 = new File(context.getFilesDir(), f70569c);
            p(file2);
        }
        File file3 = new File(file2, str);
        p(file3);
        return file3;
    }

    public static void l(Context context) {
        if (f70577k) {
            return;
        }
        try {
            ApplicationInfo applicationInfoI = i(context);
            if (applicationInfoI == null) {
                return;
            }
            e(context, new File(applicationInfoI.sourceDir), new File(applicationInfoI.dataDir), "secondary-dexes", "", true);
        } catch (Exception e10) {
            throw new RuntimeException("MultiDex installation failed (" + e10.getMessage() + ").");
        }
    }

    public static void m(Context context, Context context2) {
        ApplicationInfo applicationInfoI;
        if (f70577k) {
            return;
        }
        try {
            ApplicationInfo applicationInfoI2 = i(context);
            if (applicationInfoI2 == null || (applicationInfoI = i(context2)) == null) {
                return;
            }
            String str = context.getPackageName() + ".";
            File file = new File(applicationInfoI.dataDir);
            e(context2, new File(applicationInfoI2.sourceDir), file, str + "secondary-dexes", str, false);
            e(context2, new File(applicationInfoI.sourceDir), file, "secondary-dexes", "", false);
        } catch (Exception e10) {
            throw new RuntimeException("MultiDex installation failed (" + e10.getMessage() + ").");
        }
    }

    private static void n(ClassLoader classLoader, File file, List<? extends File> list) throws IllegalAccessException, NoSuchFieldException, NoSuchMethodException, InstantiationException, IOException, SecurityException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException {
        if (!list.isEmpty()) {
            C0624b.a(classLoader, list, file);
        }
    }

    static boolean o(String str) {
        if (str == null) {
            return false;
        }
        StringTokenizer stringTokenizer = new StringTokenizer(str, ".");
        String strNextToken = stringTokenizer.hasMoreTokens() ? stringTokenizer.nextToken() : null;
        String strNextToken2 = stringTokenizer.hasMoreTokens() ? stringTokenizer.nextToken() : null;
        if (strNextToken == null || strNextToken2 == null) {
            return false;
        }
        try {
            int i10 = Integer.parseInt(strNextToken);
            return i10 > 2 || (i10 == 2 && Integer.parseInt(strNextToken2) >= 1);
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    private static void p(File file) throws IOException {
        file.mkdir();
        if (file.isDirectory()) {
            return;
        }
        File parentFile = file.getParentFile();
        if (parentFile == null) {
            file.getPath();
        } else {
            file.getPath();
            parentFile.isDirectory();
            parentFile.isFile();
            parentFile.exists();
            parentFile.canRead();
            parentFile.canWrite();
        }
        throw new IOException("Failed to create directory " + file.getPath());
    }
}
