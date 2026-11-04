package androidx.compose.ui.platform;

import android.os.Parcel;
import android.util.Base64;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nAndroidClipboardManager.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidClipboardManager.android.kt\nandroidx/compose/ui/platform/EncodeHelper\n+ 2 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,601:1\n65#2:602\n69#2:605\n60#3:603\n70#3:606\n22#4:604\n22#4:607\n*S KotlinDebug\n*F\n+ 1 AndroidClipboardManager.android.kt\nandroidx/compose/ui/platform/EncodeHelper\n*L\n315#1:602\n316#1:605\n315#1:603\n316#1:606\n315#1:604\n316#1:607\n*E\n"})
public final class b2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f40317b = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private Parcel f40318a = Parcel.obtain();

    public final void a(byte b10) {
        this.f40318a.writeByte(b10);
    }

    public final void b(float f10) {
        this.f40318a.writeFloat(f10);
    }

    public final void c(int i10) {
        this.f40318a.writeInt(i10);
    }

    public final void d(@NotNull androidx.compose.ui.graphics.o3 o3Var) {
        m(o3Var.f());
        b(Float.intBitsToFloat((int) (o3Var.h() >> 32)));
        b(Float.intBitsToFloat((int) (o3Var.h() & com.rabbitmq.client.k0.f265952a)));
        b(o3Var.d());
    }

    public final void e(@NotNull androidx.compose.ui.text.c3 c3Var) {
        long jM = c3Var.m();
        androidx.compose.ui.graphics.q0.a aVar = androidx.compose.ui.graphics.q0.f38131b;
        if (!androidx.compose.ui.graphics.q0.y(jM, aVar.u())) {
            a((byte) 1);
            m(c3Var.m());
        }
        long jQ = c3Var.q();
        androidx.compose.ui.unit.z.a aVar2 = androidx.compose.ui.unit.z.f42728b;
        if (!androidx.compose.ui.unit.z.j(jQ, aVar2.b())) {
            a((byte) 2);
            j(c3Var.q());
        }
        androidx.compose.ui.text.font.v0 v0VarT = c3Var.t();
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
        androidx.compose.ui.text.font.r0 r0VarS = c3Var.s();
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
        if (!androidx.compose.ui.unit.z.j(c3Var.u(), aVar2.b())) {
            a((byte) 7);
            j(c3Var.u());
        }
        androidx.compose.ui.text.style.a aVarK = c3Var.k();
        if (aVarK != null) {
            float fK = aVarK.k();
            a((byte) 8);
            k(fK);
        }
        androidx.compose.ui.text.style.q qVarA = c3Var.A();
        if (qVarA != null) {
            a((byte) 9);
            h(qVarA);
        }
        if (!androidx.compose.ui.graphics.q0.y(c3Var.j(), aVar.u())) {
            a((byte) 10);
            m(c3Var.j());
        }
        androidx.compose.ui.text.style.k kVarY = c3Var.y();
        if (kVarY != null) {
            a((byte) 11);
            g(kVarY);
        }
        androidx.compose.ui.graphics.o3 o3VarX = c3Var.x();
        if (o3VarX != null) {
            a(com.google.common.base.c.f116461n);
            d(o3VarX);
        }
    }

    public final void f(@NotNull androidx.compose.ui.text.font.v0 v0Var) {
        c(v0Var.O());
    }

    public final void g(@NotNull androidx.compose.ui.text.style.k kVar) {
        c(kVar.e());
    }

    public final void h(@NotNull androidx.compose.ui.text.style.q qVar) {
        b(qVar.d());
        b(qVar.e());
    }

    public final void i(@NotNull String str) {
        this.f40318a.writeString(str);
    }

    public final void j(long j10) {
        long jM = androidx.compose.ui.unit.z.m(j10);
        androidx.compose.ui.unit.b0.a aVar = androidx.compose.ui.unit.b0.f42661b;
        byte b10 = 0;
        if (!androidx.compose.ui.unit.b0.g(jM, aVar.c())) {
            if (androidx.compose.ui.unit.b0.g(jM, aVar.b())) {
                b10 = 1;
            } else if (androidx.compose.ui.unit.b0.g(jM, aVar.a())) {
                b10 = 2;
            }
        }
        a(b10);
        if (androidx.compose.ui.unit.b0.g(androidx.compose.ui.unit.z.m(j10), aVar.c())) {
            return;
        }
        b(androidx.compose.ui.unit.z.n(j10));
    }

    public final void k(float f10) {
        b(f10);
    }

    public final void l(int i10) {
        androidx.compose.ui.text.font.r0.a aVar = androidx.compose.ui.text.font.r0.f41699b;
        byte b10 = 0;
        if (!androidx.compose.ui.text.font.r0.h(i10, aVar.b())) {
            if (androidx.compose.ui.text.font.r0.h(i10, aVar.a())) {
                b10 = 1;
            } else if (androidx.compose.ui.text.font.r0.h(i10, aVar.d())) {
                b10 = 2;
            } else if (androidx.compose.ui.text.font.r0.h(i10, aVar.c())) {
                b10 = 3;
            }
        }
        a(b10);
    }

    public final void m(long j10) {
        n(kotlin.y1.n(androidx.compose.ui.graphics.f.b(j10)));
    }

    public final void n(long j10) {
        this.f40318a.writeLong(j10);
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
        return Base64.encodeToString(this.f40318a.marshall(), 0);
    }

    public final void q() {
        this.f40318a.recycle();
        this.f40318a = Parcel.obtain();
    }
}
