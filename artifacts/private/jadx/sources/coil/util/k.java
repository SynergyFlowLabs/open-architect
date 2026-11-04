package coil.util;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import kotlin.k0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@oj.i(name = "-Requests")
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final coil.request.c f87836a = new coil.request.c(null, null, null, null, null, null, null, false, false, null, null, null, null, null, null, 32767, null);

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f87837a;

        static {
            int[] iArr = new int[coil.size.e.values().length];
            try {
                iArr[coil.size.e.EXACT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[coil.size.e.INEXACT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[coil.size.e.AUTOMATIC.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f87837a = iArr;
        }
    }

    public static final boolean a(@NotNull coil.request.i iVar) {
        int i10 = a.f87837a[iVar.H().ordinal()];
        if (i10 == 1) {
            return false;
        }
        if (i10 == 2) {
            return true;
        }
        if (i10 != 3) {
            throw new k0();
        }
        if (iVar.q().o() == null && (iVar.K() instanceof coil.size.d)) {
            return true;
        }
        return (iVar.M() instanceof coil.target.d) && (iVar.K() instanceof coil.size.l) && (((coil.target.d) iVar.M()).getView() instanceof ImageView) && ((coil.target.d) iVar.M()).getView() == ((coil.size.l) iVar.K()).getView();
    }

    @NotNull
    public static final coil.request.c b() {
        return f87836a;
    }

    @Nullable
    public static final Drawable c(@NotNull coil.request.i iVar, @Nullable Drawable drawable, @androidx.annotation.v @Nullable Integer num, @Nullable Drawable drawable2) {
        if (drawable != null) {
            return drawable;
        }
        if (num == null) {
            return drawable2;
        }
        if (num.intValue() == 0) {
            return null;
        }
        return d.a(iVar.l(), num.intValue());
    }
}
