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
import androidx.compose.ui.unit.a0;
import androidx.compose.ui.unit.b0;
import androidx.compose.ui.unit.z;
import com.rabbitmq.client.k0;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.y1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nClipboardUtils.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ClipboardUtils.android.kt\nandroidx/compose/foundation/internal/DecodeHelper\n+ 2 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,557:1\n30#2:558\n53#3,3:559\n*S KotlinDebug\n*F\n+ 1 ClipboardUtils.android.kt\nandroidx/compose/foundation/internal/DecodeHelper\n*L\n451#1:558\n451#1:559,3\n*E\n"})
public final class c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f15681b = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Parcel f15682a;

    public c(@NotNull String str) {
        Parcel parcelObtain = Parcel.obtain();
        this.f15682a = parcelObtain;
        byte[] bArrDecode = Base64.decode(str, 0);
        parcelObtain.unmarshall(bArrDecode, 0, bArrDecode.length);
        parcelObtain.setDataPosition(0);
    }

    private final int a() {
        return this.f15682a.dataAvail();
    }

    private final float b() {
        return androidx.compose.ui.text.style.a.e(e());
    }

    private final byte c() {
        return this.f15682a.readByte();
    }

    private final float e() {
        return this.f15682a.readFloat();
    }

    private final int i() {
        return this.f15682a.readInt();
    }

    private final o3 j() {
        long jD = d();
        float fE = e();
        return new o3(jD, n0.g.g((((long) Float.floatToRawIntBits(e())) & k0.f265952a) | (Float.floatToRawIntBits(fE) << 32)), e(), null);
    }

    private final String l() {
        return this.f15682a.readString();
    }

    private final k m() {
        int i10 = i();
        k.a aVar = k.f42215b;
        int i11 = 0 << 1;
        boolean z10 = (aVar.b().e() & i10) != 0;
        boolean z11 = (i10 & aVar.f().e()) != 0;
        if (z10 && z11) {
            return aVar.a(CollectionsKt.listOf((Object[]) new k[]{aVar.b(), aVar.f()}));
        }
        if (z10) {
            return aVar.b();
        }
        return z11 ? aVar.f() : aVar.d();
    }

    private final q n() {
        return new q(e(), e());
    }

    private final long p() {
        return y1.n(this.f15682a.readLong());
    }

    public final long d() {
        return androidx.compose.ui.graphics.f.a(q0.f38131b, this.f15682a.readLong());
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
            return r0.f41699b.b();
        }
        if (bC == 1) {
            return r0.f41699b.a();
        }
        if (bC == 3) {
            return r0.f41699b.c();
        }
        return bC == 2 ? r0.f41699b.d() : r0.f41699b.b();
    }

    @NotNull
    public final v0 h() {
        return new v0(i());
    }

    @NotNull
    public final c3 k() {
        g gVar = new g(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 16383, null);
        while (this.f15682a.dataAvail() > 1) {
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
                                                            gVar.z(j());
                                                        } else {
                                                            continue;
                                                        }
                                                    } else {
                                                        if (a() < 4) {
                                                            break;
                                                        }
                                                        gVar.A(m());
                                                    }
                                                } else {
                                                    if (a() < 8) {
                                                        break;
                                                    }
                                                    gVar.o(d());
                                                }
                                            } else {
                                                if (a() < 8) {
                                                    break;
                                                }
                                                gVar.B(n());
                                            }
                                        } else {
                                            if (a() < 4) {
                                                break;
                                            }
                                            gVar.p(androidx.compose.ui.text.style.a.d(b()));
                                        }
                                    } else {
                                        if (a() < 5) {
                                            break;
                                        }
                                        gVar.x(o());
                                    }
                                } else {
                                    gVar.s(l());
                                }
                            } else {
                                if (a() < 1) {
                                    break;
                                }
                                gVar.v(r0.e(g()));
                            }
                        } else {
                            if (a() < 1) {
                                break;
                            }
                            gVar.u(androidx.compose.ui.text.font.q0.c(f()));
                        }
                    } else {
                        if (a() < 4) {
                            break;
                        }
                        gVar.w(h());
                    }
                } else {
                    if (a() < 5) {
                        break;
                    }
                    gVar.t(o());
                }
            } else {
                if (a() < 8) {
                    break;
                }
                gVar.q(d());
            }
        }
        return gVar.C();
    }

    public final long o() {
        long jA;
        byte bC = c();
        if (bC == 1) {
            jA = b0.f42661b.b();
        } else {
            jA = bC == 2 ? b0.f42661b.a() : b0.f42661b.c();
        }
        return b0.g(jA, b0.f42661b.c()) ? z.f42728b.b() : a0.a(e(), jA);
    }
}
