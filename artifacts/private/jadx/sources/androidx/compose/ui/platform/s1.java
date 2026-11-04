package androidx.compose.ui.platform;

import android.os.Parcel;
import android.util.Base64;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nAndroidClipboardManager.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidClipboardManager.android.kt\nandroidx/compose/ui/platform/DecodeHelper\n+ 2 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,601:1\n30#2:602\n53#3,3:603\n*S KotlinDebug\n*F\n+ 1 AndroidClipboardManager.android.kt\nandroidx/compose/ui/platform/DecodeHelper\n*L\n497#1:602\n497#1:603,3\n*E\n"})
public final class s1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f40878b = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Parcel f40879a;

    public s1(@NotNull String str) {
        Parcel parcelObtain = Parcel.obtain();
        this.f40879a = parcelObtain;
        byte[] bArrDecode = Base64.decode(str, 0);
        parcelObtain.unmarshall(bArrDecode, 0, bArrDecode.length);
        parcelObtain.setDataPosition(0);
    }

    private final int a() {
        return this.f40879a.dataAvail();
    }

    private final float b() {
        return androidx.compose.ui.text.style.a.e(e());
    }

    private final byte c() {
        return this.f40879a.readByte();
    }

    private final float e() {
        return this.f40879a.readFloat();
    }

    private final int i() {
        return this.f40879a.readInt();
    }

    private final androidx.compose.ui.graphics.o3 j() {
        long jD = d();
        float fE = e();
        return new androidx.compose.ui.graphics.o3(jD, n0.g.g((((long) Float.floatToRawIntBits(e())) & com.rabbitmq.client.k0.f265952a) | (Float.floatToRawIntBits(fE) << 32)), e(), null);
    }

    private final String l() {
        return this.f40879a.readString();
    }

    private final androidx.compose.ui.text.style.k m() {
        int i10 = i();
        androidx.compose.ui.text.style.k.a aVar = androidx.compose.ui.text.style.k.f42215b;
        boolean z10 = (aVar.b().e() & i10) != 0;
        boolean z11 = (i10 & aVar.f().e()) != 0;
        if (z10 && z11) {
            return aVar.a(CollectionsKt.listOf((Object[]) new androidx.compose.ui.text.style.k[]{aVar.b(), aVar.f()}));
        }
        if (z10) {
            return aVar.b();
        }
        return z11 ? aVar.f() : aVar.d();
    }

    private final androidx.compose.ui.text.style.q n() {
        return new androidx.compose.ui.text.style.q(e(), e());
    }

    private final long p() {
        return kotlin.y1.n(this.f40879a.readLong());
    }

    public final long d() {
        return androidx.compose.ui.graphics.f.a(androidx.compose.ui.graphics.q0.f38131b, this.f40879a.readLong());
    }

    public final int f() {
        byte bC = c();
        if (bC != 0 && bC == 1) {
            return androidx.compose.ui.text.font.q0.f41690b.a();
        }
        return androidx.compose.ui.text.font.q0.f41690b.c();
    }

    public final int g() {
        byte bC = c();
        if (bC == 0) {
            return androidx.compose.ui.text.font.r0.f41699b.b();
        }
        if (bC == 1) {
            return androidx.compose.ui.text.font.r0.f41699b.a();
        }
        if (bC == 3) {
            return androidx.compose.ui.text.font.r0.f41699b.c();
        }
        return bC == 2 ? androidx.compose.ui.text.font.r0.f41699b.d() : androidx.compose.ui.text.font.r0.f41699b.b();
    }

    @NotNull
    public final androidx.compose.ui.text.font.v0 h() {
        return new androidx.compose.ui.text.font.v0(i());
    }

    @NotNull
    public final androidx.compose.ui.text.c3 k() {
        c3 c3Var = new c3(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 16383, null);
        while (this.f40879a.dataAvail() > 1) {
            byte bC = c();
            if (bC != 1) {
                if (bC != 2) {
                    if (bC != 3) {
                        if (bC != 4) {
                            if (bC != 5) {
                                if (bC != 6) {
                                    if (bC != 7) {
                                        if (bC != 8) {
                                            if (bC != 9) {
                                                if (bC != 10) {
                                                    if (bC != 11) {
                                                        if (bC == 12) {
                                                            if (a() < 20) {
                                                                break;
                                                            }
                                                            c3Var.z(j());
                                                        } else {
                                                            continue;
                                                        }
                                                    } else {
                                                        if (a() < 4) {
                                                            break;
                                                        }
                                                        c3Var.A(m());
                                                    }
                                                } else {
                                                    if (a() < 8) {
                                                        break;
                                                    }
                                                    c3Var.o(d());
                                                }
                                            } else {
                                                if (a() < 8) {
                                                    break;
                                                }
                                                c3Var.B(n());
                                            }
                                        } else {
                                            if (a() < 4) {
                                                break;
                                            }
                                            c3Var.p(androidx.compose.ui.text.style.a.d(b()));
                                        }
                                    } else {
                                        if (a() < 5) {
                                            break;
                                        }
                                        c3Var.x(o());
                                    }
                                } else {
                                    c3Var.s(l());
                                }
                            } else {
                                if (a() < 1) {
                                    break;
                                }
                                c3Var.v(androidx.compose.ui.text.font.r0.e(g()));
                            }
                        } else {
                            if (a() < 1) {
                                break;
                            }
                            c3Var.u(androidx.compose.ui.text.font.q0.c(f()));
                        }
                    } else {
                        if (a() < 4) {
                            break;
                        }
                        c3Var.w(h());
                    }
                } else {
                    if (a() < 5) {
                        break;
                    }
                    c3Var.t(o());
                }
            } else {
                if (a() < 8) {
                    break;
                }
                c3Var.q(d());
            }
        }
        return c3Var.C();
    }

    public final long o() {
        long jA;
        byte bC = c();
        if (bC == 1) {
            jA = androidx.compose.ui.unit.b0.f42661b.b();
        } else {
            jA = bC == 2 ? androidx.compose.ui.unit.b0.f42661b.a() : androidx.compose.ui.unit.b0.f42661b.c();
        }
        return androidx.compose.ui.unit.b0.g(jA, androidx.compose.ui.unit.b0.f42661b.c()) ? androidx.compose.ui.unit.z.f42728b.b() : androidx.compose.ui.unit.a0.a(e(), jA);
    }
}
