package com.github.luben.zstd.util;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes4.dex */
public enum a {
    ;


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f103055a = "ZstdNativePath";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f103056b = "ZstdTempFolder";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f103057c = "zstd-jni-1.5.7-4";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f103058d = "libzstd-jni-1.5.7-4";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f103059e = "Unsupported OS/arch, cannot find " + t() + " or load " + f103057c + " from system libraries. Please try building from source the jar or providing " + f103058d + " in your system.";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static AtomicBoolean f103060f = new AtomicBoolean(false);

    /* JADX INFO: renamed from: com.github.luben.zstd.util.a$a, reason: collision with other inner class name */
    class C0932a implements PrivilegedAction<Void> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f103062a;

        C0932a(String str) {
            this.f103062a = str;
        }

        @Override // java.security.PrivilegedAction
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void run() {
            System.loadLibrary(this.f103062a);
            return null;
        }
    }

    class b implements PrivilegedAction<Void> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f103063a;

        b(String str) {
            this.f103063a = str;
        }

        @Override // java.security.PrivilegedAction
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void run() {
            System.load(this.f103063a);
            return null;
        }
    }

    public static synchronized void k() {
        f103060f.set(true);
    }

    public static synchronized boolean l() {
        try {
        } catch (Throwable th2) {
            throw th2;
        }
        return f103060f.get();
    }

    private static String n() {
        if (!s().contains("os_x") && !s().contains("darwin")) {
            return s().contains("win") ? "dll" : "so";
        }
        return "dylib";
    }

    public static synchronized void o() {
        try {
            String property = System.getProperty(f103056b);
            if (property == null) {
                p(null);
            } else {
                p(new File(property));
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:77:0x017e A[Catch: all -> 0x002b, IOException -> 0x018e, TryCatch #4 {all -> 0x002b, blocks: (B:4:0x0004, B:8:0x0010, B:10:0x0020, B:20:0x0046, B:22:0x004e, B:51:0x00eb, B:53:0x00f1, B:54:0x00f4, B:56:0x00fb, B:75:0x0178, B:77:0x017e, B:79:0x0183, B:81:0x018a, B:83:0x018f, B:26:0x005e, B:27:0x0088, B:16:0x002f), top: B:92:0x0004, inners: #3, #14 }] */
    public static synchronized void p(File file) {
        FileOutputStream fileOutputStream;
        Throwable th2;
        File fileCreateTempFile;
        try {
            if (f103060f.get()) {
                return;
            }
            String strT = t();
            String property = System.getProperty(f103055a);
            if (property != null) {
                r(property);
                f103060f.set(true);
                return;
            }
            try {
                Class.forName("org.osgi.framework.BundleEvent");
                q(f103058d);
                f103060f.set(true);
            } catch (Throwable unused) {
                InputStream resourceAsStream = a.class.getResourceAsStream(strT);
                if (resourceAsStream == null) {
                    try {
                        q(f103057c);
                        f103060f.set(true);
                        return;
                    } catch (UnsatisfiedLinkError e10) {
                        UnsatisfiedLinkError unsatisfiedLinkError = new UnsatisfiedLinkError(e10.getMessage() + "\n" + f103059e);
                        unsatisfiedLinkError.setStackTrace(e10.getStackTrace());
                        throw unsatisfiedLinkError;
                    }
                }
                File file2 = null;
                FileOutputStream fileOutputStream2 = null;
                try {
                    fileCreateTempFile = File.createTempFile(f103058d, "." + n(), file);
                    try {
                        fileCreateTempFile.deleteOnExit();
                        fileOutputStream = new FileOutputStream(fileCreateTempFile);
                        try {
                            try {
                                byte[] bArr = new byte[4096];
                                while (true) {
                                    int i10 = resourceAsStream.read(bArr);
                                    if (i10 == -1) {
                                        try {
                                            break;
                                        } catch (IOException unused2) {
                                            fileOutputStream2 = fileOutputStream;
                                        }
                                    } else {
                                        fileOutputStream.write(bArr, 0, i10);
                                    }
                                }
                                fileOutputStream.flush();
                                fileOutputStream.close();
                                try {
                                    r(fileCreateTempFile.getAbsolutePath());
                                } catch (UnsatisfiedLinkError e11) {
                                    try {
                                        q(f103057c);
                                    } catch (UnsatisfiedLinkError e12) {
                                        UnsatisfiedLinkError unsatisfiedLinkError2 = new UnsatisfiedLinkError(e11.getMessage() + "\n" + e12.getMessage() + "\n" + f103059e);
                                        unsatisfiedLinkError2.setStackTrace(e12.getStackTrace());
                                        throw unsatisfiedLinkError2;
                                    }
                                }
                                f103060f.set(true);
                                try {
                                    resourceAsStream.close();
                                    if (fileOutputStream2 != null) {
                                        fileOutputStream2.close();
                                    }
                                    if (fileCreateTempFile.exists()) {
                                        fileCreateTempFile.delete();
                                    }
                                } catch (IOException unused3) {
                                }
                            } catch (Throwable th3) {
                                th2 = th3;
                                try {
                                    resourceAsStream.close();
                                    if (fileOutputStream != null) {
                                        fileOutputStream.close();
                                    }
                                    if (fileCreateTempFile != null && fileCreateTempFile.exists()) {
                                        fileCreateTempFile.delete();
                                    }
                                } catch (IOException unused4) {
                                }
                                throw th2;
                            }
                        } catch (IOException e13) {
                            e = e13;
                            file2 = fileCreateTempFile;
                            try {
                                ExceptionInInitializerError exceptionInInitializerError = new ExceptionInInitializerError("Cannot unpack libzstd-jni-1.5.7-4: " + e.getMessage());
                                exceptionInInitializerError.setStackTrace(e.getStackTrace());
                                throw exceptionInInitializerError;
                            } catch (Throwable th4) {
                                File file3 = file2;
                                th2 = th4;
                                fileCreateTempFile = file3;
                                resourceAsStream.close();
                                if (fileOutputStream != null) {
                                    fileOutputStream.close();
                                }
                                if (fileCreateTempFile != null) {
                                    fileCreateTempFile.delete();
                                }
                                throw th2;
                            }
                        }
                    } catch (IOException e14) {
                        e = e14;
                        fileOutputStream = null;
                    } catch (Throwable th5) {
                        fileOutputStream = null;
                        th2 = th5;
                    }
                } catch (IOException e15) {
                    e = e15;
                    fileOutputStream = null;
                } catch (Throwable th6) {
                    fileOutputStream = null;
                    th2 = th6;
                    fileCreateTempFile = null;
                }
            }
        } catch (Throwable th7) {
            throw th7;
        }
    }

    private static void q(String str) {
        AccessController.doPrivileged(new C0932a(str));
    }

    private static void r(String str) {
        AccessController.doPrivileged(new b(str));
    }

    private static String s() {
        String strReplace = System.getProperty("os.name").toLowerCase().replace(' ', '_');
        if (strReplace.startsWith("win")) {
            return "win";
        }
        return strReplace.startsWith("mac") ? "darwin" : strReplace;
    }

    private static String t() {
        String strS = s();
        String property = System.getProperty("os.arch");
        if (strS.equals("darwin") && property.equals("amd64")) {
            property = "x86_64";
        }
        return "/" + strS + "/" + property + "/" + f103058d + "." + n();
    }
}
