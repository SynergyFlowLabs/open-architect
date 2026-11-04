package androidx.compose.foundation.internal;

import android.os.Parcel;
import android.util.Base64;
import androidx.compose.runtime.internal.w0;
import androidx.compose.ui.graphics.o3;
import androidx.compose.ui.graphics.q0;
import androidx.compose.ui.text.c3;
import androidx.compose.ui.text.font.r0;
import androidx.compose.ui.text.font.v0;
import androidx.compose.ui.text.style.k;
import androidx.compose.ui.text.style.q;
import androidx.compose.ui.unit.b0;
import androidx.compose.ui.unit.z;
import com.rabbitmq.client.k0;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nClipboardUtils.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ClipboardUtils.android.kt\nandroidx/compose/foundation/internal/EncodeHelper\n+ 2 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,557:1\n65#2:558\n69#2:561\n60#3:559\n70#3:562\n22#4:560\n22#4:563\n*S KotlinDebug\n*F\n+ 1 ClipboardUtils.android.kt\nandroidx/compose/foundation/internal/EncodeHelper\n*L\n270#1:558\n271#1:561\n270#1:559\n271#1:562\n270#1:560\n271#1:563\n*E\n"})
public final class d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f15683b = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private Parcel f15684a = Parcel.obtain();

    public final void a(byte b10) {
        this.f15684a.writeByte(b10);
    }

    public final void b(float f10) {
        this.f15684a.writeFloat(f10);
    }

    public final void c(int i10) {
        this.f15684a.writeInt(i10);
    }

    public final void d(@NotNull o3 o3Var) {
        m(o3Var.f());
        b(Float.intBitsToFloat((int) (o3Var.h() >> 32)));
        b(Float.intBitsToFloat((int) (o3Var.h() & k0.f265952a)));
        b(o3Var.d());
    }

    public final void e(@NotNull c3 c3Var) {
        long jM = c3Var.m();
        q0.a aVar = q0.f38131b;
        if (!q0.y(jM, aVar.u())) {
            a((byte) 1);
            m(c3Var.m());
        }
        long jQ = c3Var.q();
        z.a aVar2 = z.f42728b;
        if (!z.j(jQ, aVar2.b())) {
            a((byte) 2);
            j(c3Var.q());
        }
        v0 v0VarT = c3Var.t();
        if (v0VarT != null) {
            a((byte) 3);
            f(v0VarT);
        }
        androidx.compose.ui.text.font.q0 q0VarR = c3Var.r();
        if (q0VarR != null) {
            int iJ = q0VarR.j();
            a((byte) 4);
            o(iJ);
        }
        r0 r0VarS = c3Var.s();
        if (r0VarS != null) {
            int iM = r0VarS.m();
            a((byte) 5);
            l(iM);
        }
        String strP = c3Var.p();
        if (strP != null) {
            a((byte) 6);
            i(strP);
        }
        if (!z.j(c3Var.u(), aVar2.b())) {
            int i10 = 4 << 7;
            a((byte) 7);
            j(c3Var.u());
        }
        androidx.compose.ui.text.style.a aVarK = c3Var.k();
        if (aVarK != null) {
            float fK = aVarK.k();
            a((byte) 8);
            k(fK);
        }
        q qVarA = c3Var.A();
        if (qVarA != null) {
            a((byte) 9);
            h(qVarA);
        }
        if (!q0.y(c3Var.j(), aVar.u())) {
            a((byte) 10);
            m(c3Var.j());
        }
        k kVarY = c3Var.y();
        if (kVarY != null) {
            a((byte) 11);
            g(kVarY);
        }
        o3 o3VarX = c3Var.x();
        if (o3VarX != null) {
            a(com.google.common.base.c.f116461n);
            d(o3VarX);
        }
    }

    public final void f(@NotNull v0 v0Var) {
        c(v0Var.O());
    }

    public final void g(@NotNull k kVar) {
        c(kVar.e());
    }

    public final void h(@NotNull q qVar) {
        b(qVar.d());
        b(qVar.e());
    }

    public final void i(@NotNull String str) {
        this.f15684a.writeString(str);
    }

    public final void j(long j10) {
        long jM = z.m(j10);
        b0.a aVar = b0.f42661b;
        byte b10 = 0;
        if (!b0.g(jM, aVar.c())) {
            if (b0.g(jM, aVar.b())) {
                b10 = 1;
            } else if (b0.g(jM, aVar.a())) {
                b10 = 2;
            }
        }
        a(b10);
        if (b0.g(z.m(j10), aVar.c())) {
            return;
        }
        b(z.n(j10));
    }

    public final void k(float f10) {
        b(f10);
    }

    public final void l(int i10) {
        r0.a aVar = r0.f41699b;
        byte b10 = 0;
        if (!r0.h(i10, aVar.b())) {
            if (r0.h(i10, aVar.a())) {
                b10 = 1;
            } else if (r0.h(i10, aVar.d())) {
                b10 = 2;
            } else if (r0.h(i10, aVar.c())) {
                b10 = 3;
            }
        }
        a(b10);
    }

    public final void m(long j10) {
        n(j10);
    }

    public final void n(long j10) {
        this.f15684a.writeLong(j10);
    }

    public final void o(int i10) {
        androidx.compose.ui.text.font.q0.a aVar = androidx.compose.ui.text.font.q0.f41690b;
        byte b10 = 0;
        if (!androidx.compose.ui.text.font.q0.f(i10, aVar.c()) && androidx.compose.ui.text.font.q0.f(i10, aVar.a())) {
            b10 = 1;
        }
        a(b10);
    }

    @NotNull
    public final String p() {
        boolean z10 = true | false;
        return Base64.encodeToString(this.f15684a.marshall(), 0);
    }

    public final void q() {
        this.f15684a.recycle();
        this.f15684a = Parcel.obtain();
    }
}
