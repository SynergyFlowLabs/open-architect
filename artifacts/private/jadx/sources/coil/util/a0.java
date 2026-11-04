package coil.util;

import android.content.Context;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Utils.kt\ncoil/util/SingletonDiskCache\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,302:1\n1#2:303\n*E\n"})
public final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a0 f87806a = new a0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final String f87807b = "image_cache";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private static coil.disk.a f87808c;

    private a0() {
    }

    @NotNull
    public final synchronized coil.disk.a a(@NotNull Context context) {
        coil.disk.a aVarA;
        aVarA = f87808c;
        if (aVarA == null) {
            aVarA = new coil.disk.a.C0815a().c(kotlin.io.l.l0(l.u(context), f87807b)).a();
            f87808c = aVarA;
        }
        return aVarA;
    }
}
