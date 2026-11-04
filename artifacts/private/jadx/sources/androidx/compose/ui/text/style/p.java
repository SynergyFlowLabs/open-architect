package androidx.compose.ui.text.style;

import androidx.compose.runtime.internal.w0;
import androidx.compose.ui.graphics.i0;
import androidx.compose.ui.graphics.m3;
import androidx.compose.ui.graphics.q0;
import androidx.compose.ui.graphics.s3;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.k0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public interface p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f42231a = a.f42232a;

    @SourceDebugExtension({"SMAP\nTextForegroundStyle.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextForegroundStyle.kt\nandroidx/compose/ui/text/style/TextForegroundStyle$Companion\n+ 2 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n*L\n1#1,147:1\n635#2:148\n*S KotlinDebug\n*F\n+ 1 TextForegroundStyle.kt\nandroidx/compose/ui/text/style/TextForegroundStyle$Companion\n*L\n78#1:148\n*E\n"})
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f42232a = new a();

        private a() {
        }

        @NotNull
        public final p a(@Nullable i0 i0Var, float f10) {
            if (i0Var == null) {
                return b.f42233b;
            }
            if (i0Var instanceof s3) {
                return b(m.c(((s3) i0Var).c(), f10));
            }
            if (i0Var instanceof m3) {
                return new c((m3) i0Var, f10);
            }
            throw new k0();
        }

        @NotNull
        public final p b(long j10) {
            if (j10 == 16) {
                return b.f42233b;
            }
            int i10 = 5 | 0;
            return new d(j10, null);
        }
    }

    @w0(parameters = 1)
    public static final class b implements p {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final b f42233b = new b();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f42234c = 0;

        private b() {
        }

        @Override // androidx.compose.ui.text.style.p
        @Nullable
        public i0 o0() {
            return null;
        }

        @Override // androidx.compose.ui.text.style.p
        public float r() {
            return Float.NaN;
        }

        @Override // androidx.compose.ui.text.style.p
        public long u() {
            return q0.f38131b.u();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static float a(p pVar) {
        return ((c) pVar).r();
    }

    /* JADX INFO: Access modifiers changed from: private */
    static p f(p pVar) {
        return pVar;
    }

    @NotNull
    default p b(@NotNull Function0<? extends p> function0) {
        return !Intrinsics.areEqual(this, b.f42233b) ? this : function0.invoke();
    }

    @NotNull
    default p c(@NotNull p pVar) {
        boolean z10 = pVar instanceof c;
        if (z10 && (this instanceof c)) {
            c cVar = (c) pVar;
            return new c(cVar.k(), m.d(cVar.r(), new Function0() { // from class: androidx.compose.ui.text.style.n
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Float.valueOf(p.a(this.f42229a));
                }
            }));
        }
        if (!z10 || (this instanceof c)) {
            return (z10 || !(this instanceof c)) ? pVar.b(new Function0() { // from class: androidx.compose.ui.text.style.o
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return p.f(this.f42230a);
                }
            }) : this;
        }
        return pVar;
    }

    @Nullable
    i0 o0();

    float r();

    long u();
}
