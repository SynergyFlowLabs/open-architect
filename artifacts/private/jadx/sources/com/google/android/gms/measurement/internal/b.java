package com.google.android.gms.measurement.internal;

import android.util.Log;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes4.dex */
final class b extends c {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final com.google.android.gms.internal.measurement.j4 f109762g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final /* synthetic */ e f109763h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    b(e eVar, String str, int i10, com.google.android.gms.internal.measurement.j4 j4Var) {
        super(str, i10);
        Objects.requireNonNull(eVar);
        this.f109763h = eVar;
        this.f109762g = j4Var;
    }

    @Override // com.google.android.gms.measurement.internal.c
    final int a() {
        return this.f109762g.F();
    }

    @Override // com.google.android.gms.measurement.internal.c
    final boolean b() {
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.c
    final boolean c() {
        return this.f109762g.K();
    }

    /* JADX WARN: Code duplicated, block: B:100:0x028f  */
    /* JADX WARN: Code duplicated, block: B:105:0x029d  */
    /* JADX WARN: Code duplicated, block: B:107:0x02a3  */
    /* JADX WARN: Code duplicated, block: B:108:0x02b2  */
    /* JADX WARN: Code duplicated, block: B:110:0x02b8  */
    /* JADX WARN: Code duplicated, block: B:112:0x02c0  */
    /* JADX WARN: Code duplicated, block: B:115:0x02cc  */
    /* JADX WARN: Code duplicated, block: B:121:0x0316 A[EDGE_INSN: B:121:0x0316->B:124:0x0358 BREAK  A[LOOP:0: B:40:0x00fa->B:45:0x0127]] */
    /* JADX WARN: Code duplicated, block: B:122:0x0336 A[EDGE_INSN: B:122:0x0336->B:124:0x0358 BREAK  A[LOOP:0: B:40:0x00fa->B:45:0x0127]] */
    /* JADX WARN: Code duplicated, block: B:158:0x012f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:159:0x0110 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:160:0x01c3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:161:0x0152 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:162:0x0170 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:163:0x0158 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:164:0x018e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:165:0x01a0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:166:0x0176 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:168:0x013c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:172:0x0356 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:173:0x01f0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:174:0x0252 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:175:0x0215 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:176:0x0358 A[EDGE_INSN: B:176:0x0358->B:124:0x0358 BREAK  A[LOOP:0: B:40:0x00fa->B:45:0x0127], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:177:0x024e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:178:0x0358 A[EDGE_INSN: B:178:0x0358->B:124:0x0358 BREAK  A[LOOP:0: B:40:0x00fa->B:45:0x0127], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:179:0x0295 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:180:0x020f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:181:0x0299 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:182:0x025c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:183:0x0256 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:184:0x0314 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:185:0x02f6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:186:0x02d6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:187:0x0358 A[EDGE_INSN: B:187:0x0358->B:124:0x0358 BREAK  A[LOOP:0: B:40:0x00fa->B:45:0x0127], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:188:0x02d2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:190:0x01cb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:191:0x01cb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:192:0x01cb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:39:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:42:0x0100  */
    /* JADX WARN: Code duplicated, block: B:45:0x0127 A[LOOP:0: B:40:0x00fa->B:45:0x0127, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:49:0x0142  */
    /* JADX WARN: Code duplicated, block: B:55:0x0162  */
    /* JADX WARN: Code duplicated, block: B:56:0x016b  */
    /* JADX WARN: Code duplicated, block: B:62:0x0180  */
    /* JADX WARN: Code duplicated, block: B:63:0x0189  */
    /* JADX WARN: Code duplicated, block: B:67:0x0194  */
    /* JADX WARN: Code duplicated, block: B:72:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:77:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:81:0x0207  */
    /* JADX WARN: Code duplicated, block: B:86:0x0236  */
    /* JADX WARN: Code duplicated, block: B:89:0x0248  */
    /* JADX WARN: Code duplicated, block: B:97:0x027d  */
    /* JADX WARN: Multi-variable type inference failed */
    final boolean k(Long l10, Long l11, com.google.android.gms.internal.measurement.y6 y6Var, long j10, b0 b0Var, boolean z10) {
        HashSet hashSet;
        Iterator it;
        androidx.collection.a aVar;
        Iterator it2;
        Iterator it3;
        com.google.android.gms.internal.measurement.l4 l4Var;
        boolean z11;
        String strL;
        V v10;
        Boolean boolG;
        Boolean boolH;
        String str;
        Boolean boolI;
        com.google.android.gms.internal.measurement.c7 c7Var;
        Long lValueOf;
        Double dValueOf;
        com.google.android.gms.internal.measurement.l4 l4Var2;
        com.google.android.gms.internal.measurement.jf.a();
        e eVar = this.f109763h;
        h7 h7Var = eVar.f110184a;
        k kVarW = h7Var.w();
        String str2 = this.f109800a;
        boolean zH = kVarW.H(str2, z4.G0);
        com.google.android.gms.internal.measurement.j4 j4Var = this.f109762g;
        long j11 = j4Var.P() ? b0Var.f109768e : j10;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        Boolean bool = null;
        if (Log.isLoggable(h7Var.a().z(), 2)) {
            h7Var.a().w().d("Evaluating filter. audience, filter, event", Integer.valueOf(this.f109801b), j4Var.E() ? Integer.valueOf(j4Var.F()) : null, h7Var.D().a(j4Var.G()));
            h7Var.a().w().b("Filter definition", eVar.f110700b.K0().L(j4Var));
        }
        if (!j4Var.E() || j4Var.F() > 256) {
            h7Var.a().r().c("Invalid event filter ID. appId, id", w5.x(str2), String.valueOf(j4Var.E() ? Integer.valueOf(j4Var.F()) : null));
            return false;
        }
        Object[] objArr = j4Var.M() || j4Var.N() || j4Var.P();
        if (z10 && objArr != true) {
            h7Var.a().w().c("Event filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID", Integer.valueOf(this.f109801b), j4Var.E() ? Integer.valueOf(j4Var.F()) : null);
            return true;
        }
        String strH = y6Var.H();
        if (!j4Var.K()) {
            hashSet = new HashSet();
            it = j4Var.H().iterator();
            while (true) {
                if (it.hasNext()) {
                    aVar = new androidx.collection.a();
                    it2 = y6Var.E().iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            it3 = j4Var.H().iterator();
                            while (true) {
                                if (it3.hasNext()) {
                                    bool = Boolean.TRUE;
                                    break;
                                }
                                l4Var = (com.google.android.gms.internal.measurement.l4) it3.next();
                                if (l4Var.I() || !l4Var.J()) {
                                    z11 = false;
                                } else {
                                    z11 = true;
                                }
                                strL = l4Var.L();
                                if (strL.isEmpty()) {
                                    v10 = aVar.get(strL);
                                    if (v10 instanceof Long) {
                                        if (v10 instanceof Double) {
                                            if (v10 instanceof String) {
                                                if (v10 == 0) {
                                                    h7Var.a().r().c("Unknown param type. event, param", h7Var.D().a(strH), h7Var.D().b(strL));
                                                    break;
                                                }
                                                h7Var.a().w().c("Missing param for filter. event, param", h7Var.D().a(strH), h7Var.D().b(strL));
                                                bool = Boolean.FALSE;
                                                break;
                                            }
                                            if (l4Var.E()) {
                                                if (l4Var.G()) {
                                                    h7Var.a().r().c("No filter for String param. event, param", h7Var.D().a(strH), h7Var.D().b(strL));
                                                    break;
                                                }
                                                str = (String) v10;
                                                if (ve.O(str)) {
                                                    h7Var.a().r().c("Invalid param value for number filter. event, param", h7Var.D().a(strH), h7Var.D().b(strL));
                                                    break;
                                                }
                                                boolI = c.i(str, l4Var.H());
                                            } else {
                                                boolI = c.f((String) v10, l4Var.F(), h7Var.a());
                                            }
                                            if (boolI != null) {
                                                break;
                                            }
                                            if (boolI.booleanValue() == z11) {
                                                bool = Boolean.FALSE;
                                                break;
                                            }
                                        } else {
                                            if (l4Var.G()) {
                                                h7Var.a().r().c("No number filter for double param. event, param", h7Var.D().a(strH), h7Var.D().b(strL));
                                                break;
                                            }
                                            boolH = c.h(((Double) v10).doubleValue(), l4Var.H());
                                            if (boolH != null) {
                                                break;
                                            }
                                            if (boolH.booleanValue() == z11) {
                                                bool = Boolean.FALSE;
                                                break;
                                            }
                                        }
                                    } else {
                                        if (l4Var.G()) {
                                            h7Var.a().r().c("No number filter for long param. event, param", h7Var.D().a(strH), h7Var.D().b(strL));
                                            break;
                                        }
                                        boolG = c.g(((Long) v10).longValue(), l4Var.H());
                                        if (boolG != null) {
                                            break;
                                        }
                                        if (boolG.booleanValue() == z11) {
                                            bool = Boolean.FALSE;
                                            break;
                                        }
                                    }
                                } else {
                                    h7Var.a().r().b("Event has empty param name. event", h7Var.D().a(strH));
                                    break;
                                }
                            }
                        } else {
                            c7Var = (com.google.android.gms.internal.measurement.c7) it2.next();
                            if (!hashSet.contains(c7Var.F())) {
                                if (c7Var.I()) {
                                    if (c7Var.M()) {
                                        if (c7Var.G()) {
                                            h7Var.a().r().c("Unknown value for param. event, param", h7Var.D().a(strH), h7Var.D().b(c7Var.F()));
                                            break;
                                        }
                                        aVar.put(c7Var.F(), c7Var.H());
                                    } else {
                                        String strF = c7Var.F();
                                        if (c7Var.M()) {
                                            dValueOf = Double.valueOf(c7Var.N());
                                        } else {
                                            dValueOf = null;
                                        }
                                        aVar.put(strF, dValueOf);
                                    }
                                } else {
                                    String strF2 = c7Var.F();
                                    if (c7Var.I()) {
                                        lValueOf = Long.valueOf(c7Var.J());
                                    } else {
                                        lValueOf = null;
                                    }
                                    aVar.put(strF2, lValueOf);
                                }
                            }
                        }
                    }
                } else {
                    l4Var2 = (com.google.android.gms.internal.measurement.l4) it.next();
                    if (l4Var2.L().isEmpty()) {
                        h7Var.a().r().b("null or empty param name in filter. event", h7Var.D().a(strH));
                        break;
                    }
                    hashSet.add(l4Var2.L());
                }
            }
        } else {
            Boolean boolG2 = c.g(j11, j4Var.L());
            if (boolG2 != null) {
                if (boolG2.booleanValue()) {
                    hashSet = new HashSet();
                    it = j4Var.H().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            aVar = new androidx.collection.a();
                            it2 = y6Var.E().iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    it3 = j4Var.H().iterator();
                                    while (true) {
                                        if (it3.hasNext()) {
                                            bool = Boolean.TRUE;
                                            break;
                                        }
                                        l4Var = (com.google.android.gms.internal.measurement.l4) it3.next();
                                        if (l4Var.I()) {
                                            z11 = false;
                                        } else {
                                            z11 = false;
                                        }
                                        strL = l4Var.L();
                                        if (strL.isEmpty()) {
                                            v10 = aVar.get(strL);
                                            if (v10 instanceof Long) {
                                                if (v10 instanceof Double) {
                                                    if (v10 instanceof String) {
                                                        if (v10 == 0) {
                                                            h7Var.a().r().c("Unknown param type. event, param", h7Var.D().a(strH), h7Var.D().b(strL));
                                                            break;
                                                        }
                                                        h7Var.a().w().c("Missing param for filter. event, param", h7Var.D().a(strH), h7Var.D().b(strL));
                                                        bool = Boolean.FALSE;
                                                        break;
                                                    }
                                                    if (l4Var.E()) {
                                                        if (l4Var.G()) {
                                                            h7Var.a().r().c("No filter for String param. event, param", h7Var.D().a(strH), h7Var.D().b(strL));
                                                            break;
                                                        }
                                                        str = (String) v10;
                                                        if (ve.O(str)) {
                                                            h7Var.a().r().c("Invalid param value for number filter. event, param", h7Var.D().a(strH), h7Var.D().b(strL));
                                                            break;
                                                        }
                                                        boolI = c.i(str, l4Var.H());
                                                    } else {
                                                        boolI = c.f((String) v10, l4Var.F(), h7Var.a());
                                                    }
                                                    if (boolI != null) {
                                                        break;
                                                        break;
                                                    }
                                                    if (boolI.booleanValue() == z11) {
                                                        bool = Boolean.FALSE;
                                                        break;
                                                    }
                                                } else if (l4Var.G()) {
                                                    boolH = c.h(((Double) v10).doubleValue(), l4Var.H());
                                                    if (boolH != null) {
                                                        break;
                                                        break;
                                                    }
                                                    if (boolH.booleanValue() == z11) {
                                                        bool = Boolean.FALSE;
                                                        break;
                                                    }
                                                } else {
                                                    h7Var.a().r().c("No number filter for double param. event, param", h7Var.D().a(strH), h7Var.D().b(strL));
                                                    break;
                                                }
                                            } else if (l4Var.G()) {
                                                boolG = c.g(((Long) v10).longValue(), l4Var.H());
                                                if (boolG != null) {
                                                    break;
                                                    break;
                                                }
                                                if (boolG.booleanValue() == z11) {
                                                    bool = Boolean.FALSE;
                                                    break;
                                                }
                                            } else {
                                                h7Var.a().r().c("No number filter for long param. event, param", h7Var.D().a(strH), h7Var.D().b(strL));
                                                break;
                                            }
                                        } else {
                                            h7Var.a().r().b("Event has empty param name. event", h7Var.D().a(strH));
                                            break;
                                        }
                                    }
                                } else {
                                    c7Var = (com.google.android.gms.internal.measurement.c7) it2.next();
                                    if (!hashSet.contains(c7Var.F())) {
                                        if (c7Var.I()) {
                                            if (c7Var.M()) {
                                                if (c7Var.G()) {
                                                    h7Var.a().r().c("Unknown value for param. event, param", h7Var.D().a(strH), h7Var.D().b(c7Var.F()));
                                                    break;
                                                }
                                                aVar.put(c7Var.F(), c7Var.H());
                                            } else {
                                                String strF3 = c7Var.F();
                                                if (c7Var.M()) {
                                                    dValueOf = Double.valueOf(c7Var.N());
                                                } else {
                                                    dValueOf = null;
                                                }
                                                aVar.put(strF3, dValueOf);
                                            }
                                        } else {
                                            String strF4 = c7Var.F();
                                            if (c7Var.I()) {
                                                lValueOf = Long.valueOf(c7Var.J());
                                            } else {
                                                lValueOf = null;
                                            }
                                            aVar.put(strF4, lValueOf);
                                        }
                                    }
                                }
                            }
                        } else {
                            l4Var2 = (com.google.android.gms.internal.measurement.l4) it.next();
                            if (l4Var2.L().isEmpty()) {
                                h7Var.a().r().b("null or empty param name in filter. event", h7Var.D().a(strH));
                                break;
                            }
                            hashSet.add(l4Var2.L());
                        }
                    }
                } else {
                    bool = Boolean.FALSE;
                }
            }
        }
        h7Var.a().w().b("Event filter result", bool == null ? AbstractJsonLexerKt.NULL : bool);
        if (bool == null) {
            return false;
        }
        Boolean bool2 = Boolean.TRUE;
        this.f109802c = bool2;
        if (!bool.booleanValue()) {
            return true;
        }
        this.f109803d = bool2;
        if (objArr != false && y6Var.I()) {
            Long lValueOf2 = Long.valueOf(y6Var.J());
            if (j4Var.N()) {
                if (zH && j4Var.K()) {
                    lValueOf2 = l10;
                }
                this.f109805f = lValueOf2;
            } else {
                if (zH && j4Var.K()) {
                    lValueOf2 = l11;
                }
                this.f109804e = lValueOf2;
            }
        }
        return true;
    }
}
