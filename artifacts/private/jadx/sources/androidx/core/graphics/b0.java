package androidx.core.graphics;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import androidx.annotation.NonNull;
import androidx.annotation.b1;
import androidx.annotation.w0;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes2.dex */
@w0(21)
@b1({b1.a.LIBRARY_GROUP_PREFIX})
class b0 extends g0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f47697d = "TypefaceCompatApi21Impl";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f47698e = "android.graphics.FontFamily";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f47699f = "addFontWeightStyle";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f47700g = "createFromFamiliesWithDefault";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static Class<?> f47701h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static Constructor<?> f47702i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static Method f47703j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static Method f47704k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static boolean f47705l;

    b0() {
    }

    private static boolean p(Object obj, String str, int i10, boolean z10) throws NoSuchMethodException {
        s();
        try {
            return ((Boolean) f47703j.invoke(obj, str, Integer.valueOf(i10), Boolean.valueOf(z10))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e10) {
            throw new RuntimeException(e10);
        }
    }

    private static Typeface q(Object obj) throws NoSuchMethodException {
        s();
        try {
            Object objNewInstance = Array.newInstance(f47701h, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) f47704k.invoke(null, objNewInstance);
        } catch (IllegalAccessException | InvocationTargetException e10) {
            throw new RuntimeException(e10);
        }
    }

    private File r(@NonNull ParcelFileDescriptor parcelFileDescriptor) {
        try {
            String str = Os.readlink("/proc/self/fd/" + parcelFileDescriptor.getFd());
            if (OsConstants.S_ISREG(Os.stat(str).st_mode)) {
                return new File(str);
            }
        } catch (ErrnoException unused) {
        }
        return null;
    }

    private static void s() throws NoSuchMethodException {
        Method method;
        Class<?> cls;
        Method method2;
        if (f47705l) {
            return;
        }
        f47705l = true;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName(f47698e);
            Constructor<?> constructor2 = cls.getConstructor(null);
            method2 = cls.getMethod(f47699f, String.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod(f47700g, Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            method = null;
            cls = null;
            method2 = null;
        }
        f47702i = constructor;
        f47701h = cls;
        f47703j = method2;
        f47704k = method;
    }

    private static Object t() throws NoSuchMethodException {
        s();
        try {
            return f47702i.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e10) {
            throw new RuntimeException(e10);
        }
    }

    @Override // androidx.core.graphics.g0
    public Typeface b(Context context, androidx.core.content.res.f.d dVar, Resources resources, int i10) throws NoSuchMethodException {
        Object objT = t();
        for (androidx.core.content.res.f.e eVar : dVar.a()) {
            File fileE = h0.e(context);
            if (fileE == null) {
                return null;
            }
            try {
                if (!h0.c(fileE, resources, eVar.b())) {
                    fileE.delete();
                    return null;
                }
                if (!p(objT, fileE.getPath(), eVar.e(), eVar.f())) {
                    fileE.delete();
                    return null;
                }
                fileE.delete();
            } catch (RuntimeException unused) {
                fileE.delete();
                return null;
            } catch (Throwable th2) {
                fileE.delete();
                throw th2;
            }
        }
        return q(objT);
    }

    @Override // androidx.core.graphics.g0
    public Typeface d(Context context, CancellationSignal cancellationSignal, @NonNull androidx.core.provider.h.c[] cVarArr, int i10) {
        Typeface typefaceF;
        if (cVarArr.length < 1) {
            return null;
        }
        androidx.core.provider.h.c cVarM = m(cVarArr, i10);
        try {
            ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(cVarM.d(), "r", cancellationSignal);
            if (parcelFileDescriptorOpenFileDescriptor == null) {
                if (parcelFileDescriptorOpenFileDescriptor != null) {
                    parcelFileDescriptorOpenFileDescriptor.close();
                }
                return null;
            }
            try {
                File fileR = r(parcelFileDescriptorOpenFileDescriptor);
                if (fileR == null || !fileR.canRead()) {
                    FileInputStream fileInputStream = new FileInputStream(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
                    try {
                        typefaceF = super.f(context, fileInputStream);
                        fileInputStream.close();
                    } catch (Throwable th2) {
                        try {
                            fileInputStream.close();
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                        throw th2;
                    }
                } else {
                    typefaceF = Typeface.createFromFile(fileR);
                }
                parcelFileDescriptorOpenFileDescriptor.close();
                return typefaceF;
            } catch (Throwable th4) {
                try {
                    parcelFileDescriptorOpenFileDescriptor.close();
                } catch (Throwable th5) {
                    th4.addSuppressed(th5);
                }
                throw th4;
            }
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // androidx.core.graphics.g0
    @NonNull
    Typeface h(@NonNull Context context, @NonNull Typeface typeface, int i10, boolean z10) {
        Typeface typefaceH;
        try {
            typefaceH = j0.b(typeface, i10, z10);
        } catch (RuntimeException unused) {
            typefaceH = null;
        }
        if (typefaceH == null) {
            typefaceH = super.h(context, typeface, i10, z10);
        }
        return typefaceH;
    }
}
