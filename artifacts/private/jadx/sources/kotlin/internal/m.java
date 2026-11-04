package kotlin.internal;

import kotlin.a1;
import kotlin.c0;
import kotlin.e1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oj.f
    @NotNull
    public static final l f312513a = new kotlin.internal.jdk8.a();

    @a1
    @e1(version = "1.2")
    public static final boolean a(int i10, int i11, int i12) {
        return c0.f312397g.p(i10, i11, i12);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @f
    private static final /* synthetic */ <T> T b(Object obj) throws ClassNotFoundException {
        try {
            Intrinsics.reifiedOperationMarker(1, androidx.exifinterface.media.a.f51379e5);
            return obj;
        } catch (ClassCastException e10) {
            ClassLoader classLoader = obj.getClass().getClassLoader();
            Intrinsics.reifiedOperationMarker(4, androidx.exifinterface.media.a.f51379e5);
            ClassLoader classLoader2 = Object.class.getClassLoader();
            if (Intrinsics.areEqual(classLoader, classLoader2)) {
                throw e10;
            }
            throw new ClassNotFoundException("Instance class was loaded from a different classloader: " + classLoader + ", base type classloader: " + classLoader2, e10);
        }
    }
}
