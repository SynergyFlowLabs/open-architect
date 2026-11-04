package com.badlogic.gdx.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.UUID;
import java.util.zip.CRC32;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* JADX INFO: loaded from: classes3.dex */
public class z0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f95915b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f95916c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static boolean f95917d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static boolean f95918e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static boolean f95919f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static boolean f95920g = System.getProperty("os.arch").startsWith("arm");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static boolean f95921h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static String f95922i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final HashSet<String> f95923j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f95924a;

    static {
        f95915b = System.getProperty("os.name").contains("Windows");
        f95916c = System.getProperty("os.name").contains("Linux");
        f95917d = System.getProperty("os.name").contains("Mac");
        int i10 = 2 << 0;
        f95918e = false;
        f95919f = false;
        f95921h = System.getProperty("os.arch").equals("amd64") || System.getProperty("os.arch").equals("x86_64");
        f95922i = System.getProperty("sun.arch.abi") != null ? System.getProperty("sun.arch.abi") : "";
        String property = System.getProperty("java.runtime.name");
        if (property != null && property.contains("Android Runtime")) {
            f95919f = true;
            f95915b = false;
            f95916c = false;
            f95917d = false;
            f95921h = false;
        }
        if (!f95919f && !f95915b && !f95916c && !f95917d) {
            f95918e = true;
            f95921h = false;
        }
        f95923j = new HashSet<>();
    }

    public z0() {
    }

    private boolean a(File file) {
        try {
            Method method = File.class.getMethod("canExecute", null);
            if (((Boolean) method.invoke(file, null)).booleanValue()) {
                return true;
            }
            Class cls = Boolean.TYPE;
            File.class.getMethod("setExecutable", cls, cls).invoke(file, Boolean.TRUE, Boolean.FALSE);
            return ((Boolean) method.invoke(file, null)).booleanValue();
        } catch (Exception unused) {
            return false;
        }
    }

    private boolean b(File file) {
        File parentFile = file.getParentFile();
        if (!file.exists()) {
            parentFile.mkdirs();
            if (!parentFile.isDirectory()) {
                return false;
            }
        } else {
            if (!file.canWrite() || !a(file)) {
                return false;
            }
            file = new File(parentFile, UUID.randomUUID().toString());
        }
        try {
            new FileOutputStream(file).close();
            if (a(file)) {
                file.delete();
                return true;
            }
            file.delete();
            return false;
        } catch (Throwable unused) {
            file.delete();
            return false;
        }
    }

    private File e(String str, String str2, File file) throws IOException {
        String strC;
        if (file.exists()) {
            try {
                strC = c(new FileInputStream(file));
            } catch (FileNotFoundException unused) {
                strC = null;
            }
        } else {
            strC = null;
        }
        if (strC == null || !strC.equals(str2)) {
            try {
                InputStream inputStreamK = k(str);
                file.getParentFile().mkdirs();
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                byte[] bArr = new byte[4096];
                while (true) {
                    int i10 = inputStreamK.read(bArr);
                    if (i10 == -1) {
                        break;
                    }
                    fileOutputStream.write(bArr, 0, i10);
                }
                inputStreamK.close();
                fileOutputStream.close();
            } catch (IOException e10) {
                throw new t("Error extracting file: " + str + "\nTo: " + file.getAbsolutePath(), e10);
            }
        }
        return file;
    }

    private File f(String str, String str2) {
        File file = new File(System.getProperty("java.io.tmpdir") + "/libgdx" + System.getProperty("user.name") + "/" + str, str2);
        if (!b(file)) {
            try {
                File fileCreateTempFile = File.createTempFile(str, null);
                if (fileCreateTempFile.delete()) {
                    File file2 = new File(fileCreateTempFile, str2);
                    if (b(file2)) {
                        return file2;
                    }
                }
            } catch (IOException unused) {
            }
            File file3 = new File(System.getProperty("user.home") + "/.libgdx/" + str, str2);
            if (b(file3)) {
                return file3;
            }
            File file4 = new File(".temp/" + str, str2);
            if (b(file4)) {
                return file4;
            }
        }
        return file;
    }

    private Throwable h(String str, String str2, File file) {
        try {
            System.load(e(str, str2, file).getAbsolutePath());
            return null;
        } catch (Throwable th2) {
            return th2;
        }
    }

    private void i(String str) {
        String strC = c(k(str));
        String name = new File(str).getName();
        Throwable thH = h(str, strC, new File(System.getProperty("java.io.tmpdir") + "/libgdx" + System.getProperty("user.name") + "/" + strC, name));
        if (thH == null) {
            return;
        }
        try {
            File fileCreateTempFile = File.createTempFile(strC, null);
            if (fileCreateTempFile.delete() && h(str, strC, fileCreateTempFile) == null) {
                return;
            }
        } catch (Throwable unused) {
        }
        if (h(str, strC, new File(System.getProperty("user.home") + "/.libgdx/" + strC, name)) == null) {
            return;
        }
        if (h(str, strC, new File(".temp/" + strC, name)) == null) {
            return;
        }
        File file = new File(System.getProperty("java.library.path"), str);
        if (!file.exists()) {
            throw new t(thH);
        }
        System.load(file.getAbsolutePath());
    }

    private InputStream k(String str) {
        if (this.f95924a == null) {
            InputStream resourceAsStream = z0.class.getResourceAsStream("/" + str);
            if (resourceAsStream != null) {
                return resourceAsStream;
            }
            throw new t("Unable to read file for extraction: " + str);
        }
        try {
            ZipFile zipFile = new ZipFile(this.f95924a);
            ZipEntry entry = zipFile.getEntry(str);
            if (entry != null) {
                return zipFile.getInputStream(entry);
            }
            throw new t("Couldn't find '" + str + "' in JAR: " + this.f95924a);
        } catch (IOException e10) {
            throw new t("Error reading '" + str + "' in JAR: " + this.f95924a, e10);
        }
    }

    public String c(InputStream inputStream) {
        if (inputStream == null) {
            throw new IllegalArgumentException("input cannot be null.");
        }
        CRC32 crc32 = new CRC32();
        byte[] bArr = new byte[4096];
        while (true) {
            try {
                int i10 = inputStream.read(bArr);
                if (i10 == -1) {
                    break;
                }
                crc32.update(bArr, 0, i10);
            } catch (Exception unused) {
                e1.a(inputStream);
            }
        }
        return Long.toString(crc32.getValue(), 16);
    }

    public File d(String str, String str2) throws IOException {
        try {
            String strC = c(k(str));
            if (str2 == null) {
                str2 = strC;
            }
            return e(str, strC, f(str2, new File(str).getName()));
        } catch (RuntimeException e10) {
            File file = new File(System.getProperty("java.library.path"), str);
            if (file.exists()) {
                return file;
            }
            throw e10;
        }
    }

    public synchronized void g(String str) {
        try {
            if (f95918e) {
                return;
            }
            String strJ = j(str);
            HashSet<String> hashSet = f95923j;
            if (hashSet.contains(strJ)) {
                return;
            }
            try {
                if (f95919f) {
                    System.loadLibrary(strJ);
                } else {
                    i(strJ);
                }
                hashSet.add(strJ);
            } catch (Throwable th2) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Couldn't load shared library '");
                sb2.append(strJ);
                sb2.append("' for target: ");
                sb2.append(System.getProperty("os.name"));
                sb2.append(f95921h ? ", 64-bit" : ", 32-bit");
                throw new t(sb2.toString(), th2);
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    public String j(String str) {
        String str2;
        if (f95915b) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append(f95921h ? "64.dll" : ".dll");
            return sb2.toString();
        }
        if (!f95916c) {
            if (!f95917d) {
                return str;
            }
            StringBuilder sb3 = new StringBuilder();
            sb3.append("lib");
            sb3.append(str);
            sb3.append(f95921h ? "64.dylib" : ".dylib");
            return sb3.toString();
        }
        StringBuilder sb4 = new StringBuilder();
        sb4.append("lib");
        sb4.append(str);
        if (f95920g) {
            str2 = "arm" + f95922i;
        } else {
            str2 = "";
        }
        sb4.append(str2);
        sb4.append(f95921h ? "64.so" : ".so");
        return sb4.toString();
    }

    public z0(String str) {
        this.f95924a = str;
    }
}
