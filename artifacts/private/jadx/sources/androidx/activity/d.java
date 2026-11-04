package androidx.activity;

import android.os.Build;
import android.window.BackEvent;
import androidx.annotation.b1;
import androidx.annotation.l1;
import androidx.annotation.w0;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final a f9888e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f9889f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f9890g = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f9891a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f9892b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f9893c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f9894d;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Target({ElementType.TYPE_USE})
    @Retention(RetentionPolicy.SOURCE)
    @jj.f(allowedTargets = {jj.b.TYPE})
    @b1({b1.a.LIBRARY})
    @jj.e(jj.a.SOURCE)
    public @interface b {
    }

    @l1
    public d(float f10, float f11, @androidx.annotation.x(from = 0.0d, to = 1.0d) float f12, int i10) {
        this.f9891a = f10;
        this.f9892b = f11;
        this.f9893c = f12;
        this.f9894d = i10;
    }

    public final float a() {
        return this.f9893c;
    }

    public final int b() {
        return this.f9894d;
    }

    public final float c() {
        return this.f9891a;
    }

    public final float d() {
        return this.f9892b;
    }

    @w0(34)
    @NotNull
    public final BackEvent e() {
        if (Build.VERSION.SDK_INT >= 34) {
            return c.f9793a.a(this.f9891a, this.f9892b, this.f9893c, this.f9894d);
        }
        throw new UnsupportedOperationException("This method is only supported on API level 34+");
    }

    @NotNull
    public String toString() {
        return "BackEventCompat{touchX=" + this.f9891a + ", touchY=" + this.f9892b + ", progress=" + this.f9893c + ", swipeEdge=" + this.f9894d + AbstractJsonLexerKt.END_OBJ;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @w0(34)
    public d(@NotNull BackEvent backEvent) {
        Intrinsics.checkNotNullParameter(backEvent, "backEvent");
        c cVar = c.f9793a;
        this(cVar.d(backEvent), cVar.e(backEvent), cVar.b(backEvent), cVar.c(backEvent));
    }
}
