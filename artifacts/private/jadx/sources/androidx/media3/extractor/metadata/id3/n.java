package androidx.media3.extractor.metadata.id3;

import androidx.annotation.p0;
import androidx.media3.common.q0;
import androidx.media3.common.util.b1;
import androidx.media3.common.util.k1;
import com.google.common.collect.l6;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
@b1
public final class n extends i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @p0
    public final String f67589b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Deprecated
    public final String f67590c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final l6<String> f67591d;

    public n(String str, @p0 String str2, List<String> list) {
        super(str);
        androidx.media3.common.util.a.a(!list.isEmpty());
        this.f67589b = str2;
        l6<String> l6VarW = l6.w(list);
        this.f67591d = l6VarW;
        this.f67590c = l6VarW.get(0);
    }

    private static List<Integer> b(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            if (str.length() >= 10) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(8, 10))));
                return arrayList;
            }
            if (str.length() >= 7) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                return arrayList;
            }
            if (str.length() >= 4) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
            }
            return arrayList;
        } catch (NumberFormatException unused) {
            return new ArrayList();
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // androidx.media3.common.r0.a
    public void a(q0.b bVar) {
        String str = this.f67574a;
        str.getClass();
        byte b10 = -1;
        int i10 = 6 & (-1);
        switch (str.hashCode()) {
            case 82815:
                if (str.equals("TAL")) {
                    b10 = 0;
                }
                break;
            case 82878:
                if (str.equals("TCM")) {
                    b10 = 1;
                }
                break;
            case 82897:
                if (str.equals("TDA")) {
                    b10 = 2;
                }
                break;
            case 83253:
                if (str.equals("TP1")) {
                    b10 = 3;
                }
                break;
            case 83254:
                if (str.equals("TP2")) {
                    b10 = 4;
                }
                break;
            case 83255:
                if (str.equals("TP3")) {
                    b10 = 5;
                }
                break;
            case 83341:
                if (str.equals("TRK")) {
                    b10 = 6;
                }
                break;
            case 83378:
                if (str.equals("TT2")) {
                    b10 = 7;
                }
                break;
            case 83536:
                if (str.equals("TXT")) {
                    b10 = 8;
                }
                break;
            case 83552:
                if (str.equals("TYE")) {
                    b10 = 9;
                }
                break;
            case 2567331:
                if (str.equals("TALB")) {
                    b10 = 10;
                }
                break;
            case 2569357:
                if (str.equals("TCOM")) {
                    b10 = 11;
                }
                break;
            case 2569358:
                if (str.equals("TCON")) {
                    b10 = com.google.common.base.c.f116461n;
                }
                break;
            case 2569891:
                if (str.equals("TDAT")) {
                    b10 = com.google.common.base.c.f116462o;
                }
                break;
            case 2570401:
                if (str.equals("TDRC")) {
                    b10 = com.google.common.base.c.f116463p;
                }
                break;
            case 2570410:
                if (str.equals("TDRL")) {
                    b10 = com.google.common.base.c.f116464q;
                }
                break;
            case 2571565:
                if (str.equals("TEXT")) {
                    b10 = com.google.common.base.c.f116465r;
                }
                break;
            case 2575251:
                if (str.equals("TIT2")) {
                    b10 = 17;
                }
                break;
            case 2581512:
                if (str.equals("TPE1")) {
                    b10 = com.google.common.base.c.f116468u;
                }
                break;
            case 2581513:
                if (str.equals("TPE2")) {
                    b10 = 19;
                }
                break;
            case 2581514:
                if (str.equals("TPE3")) {
                    b10 = com.google.common.base.c.f116471x;
                }
                break;
            case 2583398:
                if (str.equals("TRCK")) {
                    b10 = com.google.common.base.c.f116472y;
                }
                break;
            case 2590194:
                if (str.equals("TYER")) {
                    b10 = com.google.common.base.c.f116473z;
                }
                break;
        }
        try {
            switch (b10) {
                case 0:
                case 10:
                    bVar.P(this.f67591d.get(0));
                    break;
                case 1:
                case 11:
                    bVar.V(this.f67591d.get(0));
                    break;
                case 2:
                case 13:
                    String str2 = this.f67591d.get(0);
                    bVar.j0(Integer.valueOf(Integer.parseInt(str2.substring(2, 4)))).i0(Integer.valueOf(Integer.parseInt(str2.substring(0, 2))));
                    break;
                case 3:
                case 18:
                    bVar.Q(this.f67591d.get(0));
                    break;
                case 4:
                case 19:
                    bVar.O(this.f67591d.get(0));
                    break;
                case 5:
                case 20:
                    bVar.W(this.f67591d.get(0));
                    break;
                case 6:
                case 21:
                    String[] strArrL2 = k1.l2(this.f67591d.get(0), "/");
                    bVar.u0(Integer.valueOf(Integer.parseInt(strArrL2[0]))).t0(strArrL2.length > 1 ? Integer.valueOf(Integer.parseInt(strArrL2[1])) : null);
                    break;
                case 7:
                case 17:
                    bVar.r0(this.f67591d.get(0));
                    break;
                case 8:
                case 16:
                    bVar.w0(this.f67591d.get(0));
                    break;
                case 9:
                case 22:
                    bVar.k0(Integer.valueOf(Integer.parseInt(this.f67591d.get(0))));
                    break;
                case 12:
                    Integer numG = com.google.common.primitives.l.G(this.f67591d.get(0));
                    if (numG != null) {
                        String strA = j.a(numG.intValue());
                        if (strA != null) {
                            bVar.d0(strA);
                        }
                    } else {
                        bVar.d0(this.f67591d.get(0));
                    }
                    break;
                case 14:
                    List<Integer> listB = b(this.f67591d.get(0));
                    int size = listB.size();
                    if (size != 1) {
                        if (size != 2) {
                            if (size == 3) {
                                bVar.i0(listB.get(2));
                            }
                        }
                        bVar.j0(listB.get(1));
                    }
                    bVar.k0(listB.get(0));
                    break;
                case 15:
                    List<Integer> listB2 = b(this.f67591d.get(0));
                    int size2 = listB2.size();
                    if (size2 != 1) {
                        if (size2 != 2) {
                            if (size2 == 3) {
                                bVar.l0(listB2.get(2));
                            }
                        }
                        bVar.m0(listB2.get(1));
                    }
                    bVar.n0(listB2.get(0));
                    break;
                default:
                    break;
            }
        } catch (NumberFormatException | StringIndexOutOfBoundsException unused) {
        }
    }

    public boolean equals(@p0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && n.class == obj.getClass()) {
            n nVar = (n) obj;
            if (Objects.equals(this.f67574a, nVar.f67574a) && Objects.equals(this.f67589b, nVar.f67589b) && this.f67591d.equals(nVar.f67591d)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (527 + this.f67574a.hashCode()) * 31;
        String str = this.f67589b;
        return ((iHashCode + (str != null ? str.hashCode() : 0)) * 31) + this.f67591d.hashCode();
    }

    @Override // androidx.media3.extractor.metadata.id3.i
    public String toString() {
        return this.f67574a + ": description=" + this.f67589b + ": values=" + this.f67591d;
    }

    @z7.m(imports = {"com.google.common.collect.ImmutableList"}, replacement = "this(id, description, ImmutableList.of(value))")
    @Deprecated
    public n(String str, @p0 String str2, String str3) {
        this(str, str2, l6.G(str3));
    }
}
