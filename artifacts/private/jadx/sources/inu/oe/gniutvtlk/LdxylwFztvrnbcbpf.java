package inu.oe.gniutvtlk;

import android.app.Application;
import android.content.Context;
import android.content.pm.InstallSourceInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.os.Build;
import android.os.Environment;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import androidx.media3.extractor.metadata.dvbsi.b;
import com.planner5d.library.engine.input.f;
import com.planner5d.planner5d.n;
import com.rabbitmq.client.impl.k;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Map;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import me.relex.circleindicator.a;
import org.lsposed.hiddenapibypass.HiddenApiBypass;

/* JADX INFO: loaded from: classes14.dex */
public class LdxylwFztvrnbcbpf extends Application implements InvocationHandler {
    private Object baseObject;

    static {
        killPM(n.f264530b, "MIIDczCCAlugAwIBAgIEJkLO4TANBgkqhkiG9w0BAQsFADBpMQswCQYDVQQGEwJMVDEQMA4GA1UECBMHVmlsbml1czEQMA4GA1UEBxMHVmlsbml1czETMBEGA1UEChMKUGxhbm5lciA1RDEMMAoGA1UECxMDVUFCMRMwEQYDVQQDEwpQbGFubmVyIDVEMCAXDTE1MDQwODEzMjE0NVoYDzIxMTQwMzE1MTMyMTQ1WjBpMQswCQYDVQQGEwJMVDEQMA4GA1UECBMHVmlsbml1czEQMA4GA1UEBxMHVmlsbml1czETMBEGA1UEChMKUGxhbm5lciA1RDEMMAoGA1UECxMDVUFCMRMwEQYDVQQDEwpQbGFubmVyIDVEMIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAjrSFelAxjAudJ8mzDODxhkdcysq319xSI+mljFxvCSYpPuRzU3HQDHXY9kVV8lIr11ZfPC8SBqXQMOb/8NaWom/wsiQZwvsfW+CvwDm6Uy1Vned5CEClkA3fuid8RCU6Zth4rwUPPPsPvyrnK/izUt/RXiR+8ouUBIp446k5EuSZEEQpe8xodwPYROG3RZcoNOuVQkb8fJNTiLwm2XzWOnVwZQRnq6W/+YYwHOOYpB2cz2wFDnYvRVONrlW+deBwDlDyH7+ABpMjJBX0jTpqelJO1jcOPhNIjj8P9fis9+loSrnx7F3x8wRa9W/Vv1IqPKetaXqk6T8Oe1gAe3wyUwIDAQABoyEwHzAdBgNVHQ4EFgQU9m+JjfjaGPqCbZKfLKWPTXfkXLYwDQYJKoZIhvcNAQELBQADggEBAGjxB609ftHH95xCkNEcuLVpfFsueLomnrnEyZ+EnGWYD55MniZoiQ53NeWClb76ej9Atw+ozsmS42fFXDch5vXDNpEncOd7r0BH56KRc+71qm8LdKziQKP+nm+pw3hGubtfWe0DrXWLj4rg8mT8Ctlb9soRnrd4u8SXev/I3VookeqfIjB7SK37OASUIugbEO9HZ0ozyEE6mE1GIQT3hz/HjO4qVeYIXE90lNvC8YtC3RWzr6QsNirurFuuqa1Wz2sRy6BuTZz2qF/fLXVia+ru8Krbt8tfLOCAxy/hzkW0trqQwljsefiiXkM3KEzP5ixXTEGS3/ssKKg9fz+h7nY=");
        killOpen(n.f264530b);
    }

    private static Field findField(Class<?> cls, String str) throws NoSuchFieldException {
        try {
            Field declaredField = cls.getDeclaredField(str);
            declaredField.setAccessible(true);
            return declaredField;
        } catch (NoSuchFieldException e10) {
            while (true) {
                cls = cls.getSuperclass();
                if (cls == null || cls.equals(Object.class)) {
                    break;
                }
                try {
                    Field declaredField2 = cls.getDeclaredField(str);
                    declaredField2.setAccessible(true);
                    return declaredField2;
                } catch (NoSuchFieldException unused) {
                }
            }
            throw e10;
        }
    }

    private static String getApkPath(String str) {
        String str2;
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("/proc/self/maps"));
            do {
                try {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        bufferedReader.close();
                        return null;
                    }
                    String[] strArrSplit = line.split("\\s+");
                    str2 = strArrSplit[strArrSplit.length - 1];
                } catch (Throwable th2) {
                    try {
                        bufferedReader.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
                throw new RuntimeException(e);
            } while (!isApkPath(str, str2));
            bufferedReader.close();
            return str2;
        } catch (Exception e10) {
            throw new RuntimeException(e10);
        }
    }

    private static File getDataFile(String str) {
        String name = Environment.getExternalStorageDirectory().getName();
        if (name.matches("\\d+")) {
            File file = new File("/data/user/" + name + "/" + str);
            if (file.canWrite()) {
                return file;
            }
        }
        return new File("/data/data/" + str);
    }

    private static native void hookApkPath(String str, String str2);

    private void initProxy(Context context) {
        try {
            Class<?> cls = Class.forName("android.app.ActivityThread");
            int i10 = 6 | 0;
            Object objInvoke = cls.getDeclaredMethod("currentActivityThread", new Class[0]).invoke((Object) null, new Object[0]);
            Field declaredField = cls.getDeclaredField("sPackageManager");
            declaredField.setAccessible(true);
            this.baseObject = declaredField.get(objInvoke);
            Class<?> cls2 = Class.forName("android.content.pm.IPackageManager");
            Object objNewProxyInstance = Proxy.newProxyInstance(cls2.getClassLoader(), new Class[]{cls2}, this);
            declaredField.set(objInvoke, objNewProxyInstance);
            PackageManager packageManager = context.getPackageManager();
            Field declaredField2 = packageManager.getClass().getDeclaredField("mPM");
            declaredField2.setAccessible(true);
            declaredField2.set(packageManager, objNewProxyInstance);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    private static boolean isApkPath(String str, String str2) {
        if (str2.startsWith("/") && str2.endsWith(".apk")) {
            String[] strArrSplit = str2.substring(1).split("/", 6);
            int length = strArrSplit.length;
            if (length != 4) {
                int i10 = 4 | 5;
                if (length == 5) {
                    if (!strArrSplit[0].equals("data") && strArrSplit[1].equals("app") && strArrSplit[length - 1].equals("base.apk")) {
                        return strArrSplit[length - 2].startsWith(str);
                    }
                    if (strArrSplit[0].equals("mnt") && strArrSplit[1].equals("asec") && strArrSplit[length - 1].equals("pkg.apk")) {
                        return strArrSplit[length - 2].startsWith(str);
                    }
                } else if (length == 3) {
                    if (strArrSplit[0].equals("data") && strArrSplit[1].equals("app")) {
                        return strArrSplit[2].startsWith(str);
                    }
                } else if (length == 6 && strArrSplit[0].equals("mnt") && strArrSplit[1].equals("expand") && strArrSplit[3].equals("app") && strArrSplit[5].equals("base.apk")) {
                    return strArrSplit[4].endsWith(str);
                }
            } else {
                if (!strArrSplit[0].equals("data")) {
                }
                if (strArrSplit[0].equals("mnt")) {
                    return strArrSplit[length - 2].startsWith(str);
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:61:0x00ae A[EXC_TOP_SPLITTER, SYNTHETIC] */
    private static void killOpen(String str) {
        try {
            System.loadLibrary("SignatureKiller");
            String apkPath = getApkPath(str);
            if (apkPath == null) {
                System.err.println("Get apk path failed");
                return;
            }
            File file = new File(apkPath);
            File file2 = new File(getDataFile(str), "origin.apk");
            try {
                ZipFile zipFile = new ZipFile(file);
                try {
                    ZipEntry entry = zipFile.getEntry("assets/SignatureKiller/origin.apk");
                    if (entry == null) {
                        System.err.println("Entry not found: assets/SignatureKiller/origin.apk");
                        zipFile.close();
                        return;
                    }
                    if (!file2.exists() || file2.length() != entry.getSize()) {
                        InputStream inputStream = zipFile.getInputStream(entry);
                        try {
                            FileOutputStream fileOutputStream = new FileOutputStream(file2);
                            try {
                                byte[] bArr = new byte[102400];
                                while (true) {
                                    int i10 = inputStream.read(bArr);
                                    if (i10 == -1) {
                                        break;
                                    } else {
                                        fileOutputStream.write(bArr, 0, i10);
                                    }
                                    if (inputStream != null) {
                                        try {
                                            inputStream.close();
                                        } catch (Throwable th2) {
                                            th.addSuppressed(th2);
                                        }
                                    }
                                    throw th;
                                }
                                fileOutputStream.close();
                                if (inputStream != null) {
                                    inputStream.close();
                                }
                            } catch (Throwable th3) {
                                try {
                                    fileOutputStream.close();
                                } catch (Throwable th4) {
                                    th3.addSuppressed(th4);
                                }
                                throw th3;
                            }
                        } catch (Throwable th5) {
                            if (inputStream != null) {
                                inputStream.close();
                            }
                            throw th5;
                        }
                    }
                    zipFile.close();
                    hookApkPath(file.getAbsolutePath(), file2.getAbsolutePath());
                    return;
                } catch (Throwable th6) {
                    try {
                        zipFile.close();
                    } catch (Throwable th7) {
                        th6.addSuppressed(th7);
                    }
                    throw th6;
                }
            } catch (IOException e10) {
                throw new RuntimeException(e10);
            }
            throw new RuntimeException(e10);
        } catch (Throwable unused) {
            System.err.println("Load SignatureKiller library failed");
        }
    }

    private static void killPM(final String str, String str2) {
        final Signature signature = new Signature(Base64.decode(str2, 2));
        final Parcelable.Creator creator = PackageInfo.CREATOR;
        try {
            findField(PackageInfo.class, "CREATOR").set(null, new Parcelable.Creator<PackageInfo>() { // from class: inu.oe.gniutvtlk.LdxylwFztvrnbcbpf.1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public PackageInfo createFromParcel(Parcel parcel) {
                    Signature[] apkContentsSigners;
                    PackageInfo packageInfo = (PackageInfo) creator.createFromParcel(parcel);
                    if (packageInfo.packageName.equals(str)) {
                        if (packageInfo.signatures != null && packageInfo.signatures.length > 0) {
                            packageInfo.signatures[0] = signature;
                        }
                        if (Build.VERSION.SDK_INT >= 28 && packageInfo.signingInfo != null && (apkContentsSigners = packageInfo.signingInfo.getApkContentsSigners()) != null && apkContentsSigners.length > 0) {
                            apkContentsSigners[0] = signature;
                        }
                    }
                    return packageInfo;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public PackageInfo[] newArray(int i10) {
                    return (PackageInfo[]) creator.newArray(i10);
                }
            });
            if (Build.VERSION.SDK_INT >= 28) {
                HiddenApiBypass.addHiddenApiExemptions("Landroid/os/Parcel;", "Landroid/content/pm", "Landroid/app");
            }
            try {
                Object obj = findField(PackageManager.class, "sPackageInfoCache").get(null);
                obj.getClass().getMethod("clear", new Class[0]).invoke(obj, new Object[0]);
            } catch (Throwable unused) {
            }
            try {
                ((Map) findField(Parcel.class, "mCreators").get(null)).clear();
            } catch (Throwable unused2) {
            }
            try {
                ((Map) findField(Parcel.class, "sPairedCreators").get(null)).clear();
            } catch (Throwable unused3) {
            }
        } catch (Exception e10) {
            throw new RuntimeException(e10);
        }
    }

    @Override // android.content.ContextWrapper
    protected void attachBaseContext(Context context) {
        initProxy(context);
        super.attachBaseContext(context);
    }

    @Override // java.lang.reflect.InvocationHandler
    public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
        int i10 = 4 | 6;
        if (new String(new byte[]{(byte) f.b.f160733u1, (byte) 101, (byte) b.f67479d, (byte) 73, (byte) 110, (byte) 115, (byte) b.f67479d, (byte) 97, (byte) 108, (byte) 108, (byte) 83, (byte) k.b.p.f265340a, (byte) a.f332619e, (byte) 114, (byte) 99, (byte) 101, (byte) 73, (byte) 110, (byte) 102, (byte) k.b.p.f265340a}).equals(method.getName()) && n.f264530b.equals(String.valueOf(objArr[0]))) {
            return new InstallSourceInfo("com.androeed.vending", (SigningInfo) null, (String) null, "com.androeed.vending");
        }
        return new String(new byte[]{(byte) f.b.f160733u1, (byte) 101, (byte) b.f67479d, (byte) 73, (byte) 110, (byte) 115, (byte) b.f67479d, (byte) 97, (byte) 108, (byte) 108, (byte) 101, (byte) 114, (byte) 80, (byte) 97, (byte) 99, (byte) f.b.f160745y1, (byte) 97, (byte) f.b.f160733u1, (byte) 101, (byte) 78, (byte) 97, (byte) 109, (byte) 101}).equals(method.getName()) ? "com.androeed.vending" : method.invoke(this.baseObject, objArr);
    }
}
