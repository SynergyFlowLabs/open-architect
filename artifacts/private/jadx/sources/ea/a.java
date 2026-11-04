package ea;

import androidx.collection.g3;
import androidx.media3.exoplayer.audio.s0;
import androidx.media3.exoplayer.c4;
import com.ionspin.kotlin.bignum.integer.c;
import com.ionspin.kotlin.bignum.integer.h;
import com.ionspin.kotlin.bignum.integer.k;
import com.ionspin.kotlin.bignum.integer.util.b;
import com.rabbitmq.client.k0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.UCollectionsKt;
import kotlin.collections.unsigned.UArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.l0;
import kotlin.n1;
import kotlin.q1;
import kotlin.r1;
import kotlin.ranges.r;
import kotlin.text.StringsKt;
import kotlin.text.d0;
import kotlin.u1;
import kotlin.v1;
import kotlin.y1;
import kotlin.z1;
import kotlinx.coroutines.internal.h0;
import okhttp3.internal.connection.f;
import okhttp3.internal.ws.g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@SourceDebugExtension({"SMAP\nBigInteger63Arithmetic.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BigInteger63Arithmetic.kt\ncom/ionspin/kotlin/bignum/integer/base63/array/BigInteger63Arithmetic\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _UArrays.kt\nkotlin/collections/unsigned/UArraysKt___UArraysKt\n+ 4 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,2398:1\n539#1,7:2400\n1#2:2399\n3751#3:2407\n1174#4,2:2408\n*S KotlinDebug\n*F\n+ 1 BigInteger63Arithmetic.kt\ncom/ionspin/kotlin/bignum/integer/base63/array/BigInteger63Arithmetic\n*L\n516#1:2400,7\n1326#1:2407\n1938#1:2408,2\n*E\n"})
public final class a implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f274713a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final long[] f274714b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private static final long[] f274715c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private static final long[] f274716d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private static final long[] f274717e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private static final long[] f274718f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private static final long[] f274719g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f274720h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f274721i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final long f274722j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    private static final long[] f274723k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final long f274724l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final long f274725m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final long f274726n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f274727o = 120;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f274728p = 15000;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final boolean f274729q = false;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    private static final C1897a f274730r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    private static final z1[] f274731s;

    /* JADX INFO: renamed from: ea.a$a, reason: collision with other inner class name */
    public static final class C1897a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final long[] f274732a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f274733b;

        public /* synthetic */ C1897a(long[] jArr, boolean z10, DefaultConstructorMarker defaultConstructorMarker) {
            this(jArr, z10);
        }

        public static /* synthetic */ C1897a d(C1897a c1897a, long[] jArr, boolean z10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                jArr = c1897a.f274732a;
            }
            if ((i10 & 2) != 0) {
                z10 = c1897a.f274733b;
            }
            return c1897a.c(jArr, z10);
        }

        @NotNull
        public final long[] a() {
            return this.f274732a;
        }

        public final boolean b() {
            return this.f274733b;
        }

        @NotNull
        public final C1897a c(@NotNull long[] unsignedValue, boolean z10) {
            Intrinsics.checkNotNullParameter(unsignedValue, "unsignedValue");
            return new C1897a(unsignedValue, z10, null);
        }

        public final boolean e() {
            return this.f274733b;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1897a)) {
                return false;
            }
            C1897a c1897a = (C1897a) obj;
            return z1.s(this.f274732a, c1897a.f274732a) && this.f274733b == c1897a.f274733b;
        }

        @NotNull
        public final long[] f() {
            return this.f274732a;
        }

        public int hashCode() {
            return (z1.A(this.f274732a) * 31) + Boolean.hashCode(this.f274733b);
        }

        @NotNull
        public String toString() {
            return "SignedULongArray(unsignedValue=" + ((Object) z1.F(this.f274732a)) + ", sign=" + this.f274733b + ')';
        }

        private C1897a(long[] unsignedValue, boolean z10) {
            Intrinsics.checkNotNullParameter(unsignedValue, "unsignedValue");
            this.f274732a = unsignedValue;
            this.f274733b = z10;
        }
    }

    static {
        a aVar = new a();
        f274713a = aVar;
        f274714b = new long[0];
        f274715c = new long[]{0};
        f274716d = new long[]{1};
        f274717e = new long[]{2};
        f274718f = new long[]{10};
        f274719g = new long[]{3074457345618258603L};
        f274720h = 63;
        f274721i = 63;
        f274722j = Long.MAX_VALUE;
        f274723k = new long[]{Long.MAX_VALUE};
        f274724l = k0.f265952a;
        f274725m = 9223372032559808512L;
        f274726n = Long.MIN_VALUE;
        f274730r = new C1897a(aVar.B(), true, null);
        f274731s = new z1[]{z1.d(new long[]{1}), z1.d(new long[]{10}), z1.d(new long[]{100}), z1.d(new long[]{1000}), z1.d(new long[]{10000}), z1.d(new long[]{s0.f63372z}), z1.d(new long[]{1000000}), z1.d(new long[]{10000000}), z1.d(new long[]{100000000}), z1.d(new long[]{1000000000}), z1.d(new long[]{f.f334128w}), z1.d(new long[]{100000000000L}), z1.d(new long[]{c4.f63520s}), z1.d(new long[]{10000000000000L}), z1.d(new long[]{100000000000000L}), z1.d(new long[]{1000000000000000L}), z1.d(new long[]{10000000000000000L}), z1.d(new long[]{100000000000000000L}), z1.d(new long[]{1000000000000000000L}), z1.d(new long[]{776627963145224192L, 1}), z1.d(new long[]{7766279631452241920L, 10}), z1.d(new long[]{3875820019684212736L, 108}), z1.d(new long[]{1864712049423024128L, 1084}), z1.d(new long[]{200376420520689664L, 10842}), z1.d(new long[]{2003764205206896640L, 108420}), z1.d(new long[]{1590897978359414784L, 1084202}), z1.d(new long[]{6685607746739372032L, 10842021}), z1.d(new long[]{2292473209410289664L, 108420217}), z1.d(new long[]{4477988020393345024L, 1084202172}), z1.d(new long[]{7886392056514347008L, 10842021724L}), z1.d(new long[]{5076944270305263616L, 108420217248L}), z1.d(new long[]{4652582518778757120L, 1084202172485L}), z1.d(new long[]{408965003513692160L, 10842021724855L}), z1.d(new long[]{4089650035136921600L, 108420217248550L}), z1.d(new long[]{4003012203950112768L, 1084202172485504L}), z1.d(new long[]{3136633892082024448L, 10842021724855044L}), z1.d(new long[]{3696222810255917056L, 108420217248550443L}), z1.d(new long[]{68739955140067328L, 1084202172485504434L}), z1.d(new long[]{687399551400673280L, 1618649688000268532L, 1}), z1.d(new long[]{6873995514006732800L, 6963124843147909512L, 11}), z1.d(new long[]{4176350882083897344L, 5067644173495664471L, 117}), z1.d(new long[]{4870020673419870208L, 4559581550682765674L, 1175}), z1.d(new long[]{2583346549924823040L, 8702327359408553513L, 11754}), z1.d(new long[]{7386721425538678784L, 4012925262392552860L, 117549}), z1.d(new long[]{80237960548581376L, 3235764476506425376L, 1175494}), z1.d(new long[]{802379605485813760L, 4687528654499926336L, 11754943}), z1.d(new long[]{8023796054858137600L, 758426360725384320L, 117549435}), z1.d(new long[]{6450984253743169536L, 7584263607253843208L, 1175494350}), z1.d(new long[]{9169610316303040512L, 2055659777700225622L, 11754943508L}), z1.d(new long[]{8685754831337422848L, 2109853703292704613L, 117549435082L}), z1.d(new long[]{3847199981681246208L, 2651792959217494523L, 1175494350822L}), z1.d(new long[]{1578511669393358848L, 8071185518465393618L, 11754943508222L}), z1.d(new long[]{6561744657078812672L, 6924878889815729717L, 117549435082228L}), z1.d(new long[]{1053842312804696064L, 4685184640173866521L, 1175494350822287L}), z1.d(new long[]{1315051091192184832L, 734986217464786171L, 11754943508222875L}), z1.d(new long[]{3927138875067072512L, 7349862174647861711L, 117549435082228750L}), z1.d(new long[]{2377900603251621888L, 8935017488495186458L, 1175494350822287507L}), z1.d(new long[]{5332261958806667264L, 6339826553258882310L, 2531571471368099271L, 1}), z1.d(new long[]{7205759403792793600L, 8058033311460168257L, 6868970639971441100L, 12}), z1.d(new long[]{7493989779944505344L, 6793356819763476113L, 4126102141730980352L, 127}), z1.d(new long[]{1152921504606846976L, 3369963939651330482L, 4367533269890700295L, 1274}), z1.d(new long[]{h0.f315065r, 6029523285948977397L, 6781844551487899721L, 12744}), z1.d(new long[]{4611686018427387904L, 4955000638361119124L, 3254841256895566560L, 127447}), z1.d(new long[]{0, 3433146199337312205L, 4878296458391338181L, 1274473}), z1.d(new long[]{0, 6661345882808794626L, 2666104399639502773L, 12744735}), z1.d(new long[]{0, 2049854570104515604L, 8214299922685476121L, 127447352}), z1.d(new long[]{0, 2051801627335604424L, 8356022932016554748L, 1274473528}), z1.d(new long[]{0, 2071272199646492624L, 549880988472565210L, 12744735289L}), z1.d(new long[]{0, 2265977922755374624L, 5498809884725652102L, 127447352890L}), z1.d(new long[]{0, 4213035153844194624L, 8871238662982641982L, 1274473528905L}), z1.d(new long[]{0, 5236863391022843008L, 5702038298133437552L, 12744735289059L}), z1.d(new long[]{0, 6251773725954551040L, 1680150760205720677L, 127447352890596L}), z1.d(new long[]{0, 7177505038416855552L, 7578135565202430968L, 1274473528905961L}), z1.d(new long[]{0, 7211446126185124864L, 1994379357186103223L, 12744735289059618L}), z1.d(new long[]{0, 7550857003867817984L, 1497049498151480621L, 127447352890596182L}), z1.d(new long[]{0, 1721593743839973376L, 5747122944660030410L, 1274473528905961821L}), z1.d(new long[]{0, 7992565401544957952L, 2130997225471649253L, 3521363252204842408L, 1}), z1.d(new long[]{0, 6138677720611373056L, 2863228181006940922L, 7543516411484096658L, 13}), z1.d(new long[]{0, 6046544984985075712L, 962165699505081802L, 1648187820002760119L, 138}), z1.d(new long[]{0, 5125217628722102272L, 398284958196042218L, 7258506163172825383L, 1381}), z1.d(new long[]{0, 5135316102947143680L, 3982849581960422185L, 8021457373744823174L, 13817}), z1.d(new long[]{0, 5236300845197557760L, 2935007672185118623L, 6427597442610025280L, 138178}), z1.d(new long[]{0, 6246148267701698560L, 1679960611286858811L, 8935742204971597955L, 1381786}), z1.d(new long[]{0, 7121250455888330752L, 7576234076013812308L, 6347073718022997279L, 13817869}), z1.d(new long[]{0, 6648900300899876864L, 1975364465299916623L, 8130504959101317950L, 138178696}), z1.d(new long[]{0, 1925398751015337984L, 1306900579289614621L, 7518073296174973038L, 1381786968}), z1.d(new long[]{0, 807243436443828224L, 3845633756041370404L, 1393756666911523917L, 13817869688L}), z1.d(new long[]{0, 8072434364438282240L, 1562849412994600808L, 4714194632260463366L, 138178696881L}), z1.d(new long[]{0, 6937367349544615936L, 6405122093091232280L, 1025086138330754621L, 1381786968815L}), z1.d(new long[]{0, 4810069237462728704L, 8710988709783667959L, 1027489346452770408L, 13817869688151L}), z1.d(new long[]{0, 1983832190353408000L, 4099538766143697323L, 1051521427672928281L, 138178696881511L}), z1.d(new long[]{0, 1391577829824528384L, 4101899514017870000L, 1291842239874507006L, 1381786968815111L}), z1.d(new long[]{0, 4692406261390508032L, 4125506992759596769L, 3695050361890294256L, 13817869688151111L}), z1.d(new long[]{0, 807202429631201280L, 4361581780176864463L, 57015471483839332L, 138178696881511114L}), z1.d(new long[]{0, 8072024296312012800L, 6722329654349541398L, 570154714838393324L, 1381786968815111140L}), z1.d(new long[]{0, 6933266668281921536L, 2659692285511983332L, 5701547148383933247L, 4594497651296335592L, 1}), z1.d(new long[]{0, 4769062424835784704L, 8150178781410281711L, 1675239262710677624L, 9051488365544252694L, 14}), z1.d(new long[]{0, 1573764064083968000L, 7714811519264610651L, 7529020590252000440L, 7504535323749544669L, 149}), z1.d(new long[]{0, 6514268603984904192L, 3361138897807900047L, 1503229607681797944L, 1258376942657240234L, 1498}), z1.d(new long[]{0, 579081781865611264L, 5941272867514673053L, 5808924039963203635L, 3360397389717626533L, 14981}), z1.d(new long[]{0, 5790817818656112640L, 4072496454018075682L, 2749008178503381508L, 5933857786611937912L, 149813})};
    }

    private a() {
    }

    private final Pair<z1, z1> B1(long[] jArr, int i10) {
        long[] jArrP0;
        int iV = (z1.v(jArr) - 1) - i10;
        long[] jArrK = z1.k(ArraysKt.copyOfRange(jArr, iV + 1, z1.v(jArr)));
        long[] jArrK2 = z1.k(ArraysKt.copyOfRange(jArr, 0, iV));
        Pair<z1, z1> pairN0 = n0(jArrK);
        long[] jArrG = pairN0.component1().G();
        long[] jArrG2 = pairN0.component2().G();
        int i11 = iV * 63;
        if (!z1.s(jArrG, k1(o(), i11))) {
            long[] jArrK1 = k1(jArrG2, i10);
            long[] jArrV1 = v1(jArrK2, jArrG);
            if (f0(jArrK1, jArrV1) > 0) {
                jArrP0 = P0(jArrK1, jArrV1);
            } else {
                jArrG = P0(jArrG, o());
                jArrP0 = P0(jArrK1, v1(jArrK2, jArrG));
            }
        } else if (f0(jArrK2, E()) == 0) {
            jArrP0 = E();
        } else {
            jArrG = P0(jArrG, o());
            jArrP0 = P0(jArr, k1(jArrK2, i11));
        }
        return new Pair<>(z1.d(jArrG), z1.d(jArrP0));
    }

    private final boolean J0(long[] jArr) {
        if (z1.s(jArr, E())) {
            return true;
        }
        if ((z1.v(jArr) != 1 || z1.t(jArr, 0) != 0) && z1.v(jArr) - l0(jArr) != 0) {
            return false;
        }
        return true;
    }

    private final long[] L0(long[] jArr, long[] jArr2, int i10, int i11) {
        boolean z10 = true;
        DefaultConstructorMarker defaultConstructorMarker = null;
        C1897a c1897a = new C1897a(jArr, z10, defaultConstructorMarker);
        C1897a c1897a2 = new C1897a(jArr2, z10, defaultConstructorMarker);
        int iMax = (Math.max(i10, i11) + 1) / 2;
        long[] jArrO = o();
        int i12 = f274721i;
        long[] jArrQ0 = Q0(k1(jArrO, iMax * i12), 1L);
        C1897a c1897aB = b(c1897a, jArrQ0);
        C1897a c1897aL1 = l1(c1897a, iMax * i12);
        C1897a c1897aB2 = b(c1897a2, jArrQ0);
        C1897a c1897aL2 = l1(c1897a2, iMax * i12);
        C1897a c1897aU1 = u1(c1897aL1, c1897aL2);
        C1897a c1897aU2 = u1(c1897aB, c1897aB2);
        return Y0(Y0(j1(c1897aU1, i12 * 2 * iMax), j1(O0(O0(u1(Y0(c1897aL1, c1897aB), Y0(c1897aL2, c1897aB2)), c1897aU1), c1897aU2), i12 * iMax)), c1897aU2).f();
    }

    private final long[] S0(long[] jArr, long[] jArr2, int i10, int i11) {
        if (!J0(jArr) && !J0(jArr2)) {
            if ((i10 >= 120 || i11 >= 120) && (i10 <= 15000 || i11 < 15000)) {
                return L0(jArr, jArr2, i10, i11);
            }
            return (i10 < 15000 || i11 < 15000) ? W(jArr, jArr2, i10, i11) : y1(jArr, jArr2);
        }
        return E();
    }

    private final long[] W(long[] jArr, long[] jArr2, int i10, int i11) {
        long[] jArrE = E();
        int iV = z1.v(jArr2);
        int i12 = 0;
        int i13 = 0;
        while (i12 < iV) {
            long jT = z1.t(jArr2, i12);
            int i14 = i13 + 1;
            if (i13 <= i11) {
                a aVar = f274713a;
                jArrE = aVar.Z0(jArrE, aVar.k1(aVar.S(jArr, jT), i13 * aVar.a()));
            }
            i12++;
            i13 = i14;
        }
        return jArrE;
    }

    private final long[] Z(long[] jArr, long[] jArr2) {
        while (!UArraysKt.m1003contentEqualslec5QzE(jArr, jArr2)) {
            if (J0(jArr)) {
                return jArr2;
            }
            if (J0(jArr2)) {
                break;
            }
            if (J0(i(jArr, o()))) {
                if (J0(i(jArr2, o()))) {
                    return k1(Z(m1(jArr, 1), m1(jArr2, 1)), 1);
                }
                jArr = m1(jArr, 1);
            } else if (J0(i(jArr2, o()))) {
                jArr2 = m1(jArr2, 1);
            } else if (H(jArr, jArr2) == 1) {
                jArr = m1(v(jArr, jArr2), 1);
            } else {
                long[] jArrM1 = m1(v(jArr2, jArr), 1);
                jArr2 = jArr;
                jArr = jArrM1;
            }
        }
        return jArr;
    }

    private final boolean b1(int i10, int i11, long[] jArr, long[] jArr2, int i12, int i13) {
        return (y1.n(z1.t(jArr, i12 - 1) & 6917529027641081856L) == 0 && y1.n(z1.t(jArr2, i13 - 1) & 6917529027641081856L) == 0) ? false : true;
    }

    private final Pair<z1, z1> i1(long[] jArr) {
        int iV = z1.v(jArr);
        int iFloor = (int) Math.floor(((double) (iV - 1)) / ((double) 4));
        if (iFloor == 0) {
            return X(jArr);
        }
        int i10 = iV / 4;
        int i11 = iV % 4;
        int i12 = iFloor * 63;
        int i13 = iV - ((i10 * 3) + i11);
        int i14 = iV - ((i10 * 2) + i11);
        long[] jArrK = z1.k(ArraysKt.copyOfRange(jArr, i13, i14));
        long[] jArrK2 = z1.k(ArraysKt.copyOfRange(jArr, 0, i13));
        Pair<z1, z1> pairI1 = i1(z1.k(ArraysKt.copyOfRange(jArr, i14, iV)));
        long[] jArrG = pairI1.component1().G();
        Pair<z1, z1> pairT0 = t0(Z0(k1(pairI1.component2().G(), i12), jArrK), k1(jArrG, 1));
        long[] jArrG2 = pairT0.component1().G();
        return new Pair<>(z1.d(Z0(k1(jArrG, i12), jArrG2)), z1.d(P0(Z0(k1(pairT0.component2().G(), i12), jArrK2), v1(jArrG2, jArrG2))));
    }

    private final C1897a n1(C1897a c1897a, C1897a c1897a2) {
        DefaultConstructorMarker defaultConstructorMarker = null;
        if (c1897a.e() ^ c1897a2.e()) {
            return f0(c1897a.f(), c1897a2.f()) > 0 ? new C1897a(P0(c1897a.f(), c1897a2.f()), c1897a.e(), defaultConstructorMarker) : new C1897a(P0(c1897a2.f(), c1897a.f()), c1897a2.e(), defaultConstructorMarker);
        }
        return new C1897a(Z0(c1897a.f(), c1897a2.f()), c1897a.e(), defaultConstructorMarker);
    }

    private final void o0(long[] jArr, long[] jArr2) {
    }

    private final C1897a o1(C1897a c1897a, C1897a c1897a2) {
        return new C1897a(r0(c1897a.f(), c1897a2.f()), !(c1897a.e() ^ c1897a2.e()), null);
    }

    private final C1897a p1(C1897a c1897a, C1897a c1897a2) {
        return new C1897a(v1(c1897a.f(), c1897a2.f()), !(c1897a.e() ^ c1897a2.e()), null);
    }

    private final C1897a q1(C1897a c1897a, C1897a c1897a2) {
        return new C1897a(f1(c1897a.f(), c1897a2.f()), !(c1897a.e() ^ c1897a2.e()), null);
    }

    private final C1897a r1(C1897a c1897a, C1897a c1897a2) {
        return n1(c1897a, C1897a.d(c1897a2, null, !c1897a2.e(), 1, null));
    }

    private final long[] u0(long[] jArr, long[] jArr2) {
        while (true) {
            long[] jArr3 = jArr2;
            long[] jArr4 = jArr;
            jArr = jArr3;
            if (J0(jArr)) {
                return jArr4;
            }
            jArr2 = f1(jArr4, jArr);
        }
    }

    @Override // com.ionspin.kotlin.bignum.integer.c
    @NotNull
    public long[] A(short s10) {
        return new long[]{y1.n(((long) s10) & g.f334653t)};
    }

    public final long A0() {
        return f274722j;
    }

    public final int A1(long j10) {
        return W0(j10);
    }

    @Override // com.ionspin.kotlin.bignum.integer.c
    @NotNull
    public long[] B() {
        return f274717e;
    }

    @NotNull
    public final long[] B0() {
        return f274723k;
    }

    @Override // com.ionspin.kotlin.bignum.integer.c
    @NotNull
    public long[] C() {
        return f274714b;
    }

    public final long C0() {
        return f274725m;
    }

    @Override // com.ionspin.kotlin.bignum.integer.c
    @NotNull
    public long[] D(@NotNull String number, int i10) {
        Intrinsics.checkNotNullParameter(number, "number");
        long[] jArrE = E();
        String lowerCase = number.toLowerCase();
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        int i11 = 0 >> 0;
        for (int i12 = 0; i12 < lowerCase.length(); i12++) {
            char cCharAt = lowerCase.charAt(i12);
            a aVar = f274713a;
            jArrE = aVar.a1(aVar.w1(jArrE, y1.n(i10)), y1.n(b.a(cCharAt, i10)));
        }
        return h1(jArrE);
    }

    public final long D0() {
        return f274724l;
    }

    @Override // com.ionspin.kotlin.bignum.integer.c
    @NotNull
    public long[] E() {
        return f274715c;
    }

    public final long E0() {
        return f274726n;
    }

    @Override // com.ionspin.kotlin.bignum.integer.c
    @NotNull
    public long[] F(@NotNull long[] first, @NotNull long[] second) {
        long[] jArrK;
        Intrinsics.checkNotNullParameter(first, "first");
        Intrinsics.checkNotNullParameter(second, "second");
        if (J0(first)) {
            return second;
        }
        if (J0(second)) {
            return first;
        }
        int iV = z1.v(first) - l0(first);
        int iV2 = z1.v(second) - l0(second);
        k kVar = iV > iV2 ? new k(Integer.valueOf(z1.v(first)), Integer.valueOf(z1.v(second)), z1.d(first), z1.d(second), Integer.valueOf(iV), Integer.valueOf(iV2)) : new k(Integer.valueOf(z1.v(second)), Integer.valueOf(z1.v(first)), z1.d(second), z1.d(first), Integer.valueOf(iV2), Integer.valueOf(iV));
        int iIntValue = ((Number) kVar.a()).intValue();
        ((Number) kVar.b()).intValue();
        boolean z10 = (y1.n(z1.t(((z1) kVar.c()).G(), ((Number) kVar.e()).intValue() - 1) & 6917529027641081856L) == 0 && y1.n(z1.t(((z1) kVar.d()).G(), ((Number) kVar.f()).intValue() - 1) & 6917529027641081856L) == 0) ? false : true;
        if (z10) {
            int i10 = iIntValue + 1;
            long[] jArr = new long[i10];
            for (int i11 = 0; i11 < i10; i11++) {
                jArr[i11] = 0;
            }
            jArrK = z1.k(jArr);
        } else {
            long[] jArr2 = new long[iIntValue];
            for (int i12 = 0; i12 < iIntValue; i12++) {
                jArr2[i12] = 0;
            }
            jArrK = z1.k(jArr2);
        }
        c(jArrK, 0, first, second);
        return z10 ? h1(jArrK) : jArrK;
    }

    @NotNull
    public final z1[] F0() {
        return f274731s;
    }

    @Override // com.ionspin.kotlin.bignum.integer.c
    @NotNull
    public long[] G(@NotNull long[] operand) {
        Intrinsics.checkNotNullParameter(operand, "operand");
        int iE = e(z1.t(operand, z1.v(operand) - 1));
        long jN = y1.n(~y1.n(y1.n(y1.n(1 << (iE + 1)) - y1.n(1L)) << (a() - iE)));
        int iV = z1.v(operand);
        long[] jArr = new long[iV];
        int i10 = 0;
        while (i10 < iV) {
            jArr[i10] = i10 < z1.v(operand) + (-2) ? y1.n(y1.n(~z1.t(operand, i10)) & f274722j) : y1.n(y1.n(~z1.t(operand, i10)) & jN);
            i10++;
        }
        return z1.k(jArr);
    }

    @NotNull
    public final long[] G0() {
        return f274719g;
    }

    @Override // com.ionspin.kotlin.bignum.integer.c
    public int H(@NotNull long[] first, @NotNull long[] second) {
        Intrinsics.checkNotNullParameter(first, "first");
        Intrinsics.checkNotNullParameter(second, "second");
        return g0(first, second, z1.v(first) - l0(first), z1.v(second) - l0(second));
    }

    @NotNull
    public final C1897a H0() {
        return f274730r;
    }

    @Override // com.ionspin.kotlin.bignum.integer.c
    @NotNull
    public long[] I(@NotNull long[] first, @NotNull long[] second) {
        Intrinsics.checkNotNullParameter(first, "first");
        Intrinsics.checkNotNullParameter(second, "second");
        return S0(first, second, z1.v(first) - l0(first), z1.v(second) - l0(second));
    }

    public final int I0() {
        return f274721i;
    }

    @Override // com.ionspin.kotlin.bignum.integer.c
    @NotNull
    public long[] J(@NotNull long[] operand, @NotNull long[] mask) {
        Intrinsics.checkNotNullParameter(operand, "operand");
        Intrinsics.checkNotNullParameter(mask, "mask");
        if (z1.v(operand) < z1.v(mask)) {
            return J(mask, operand);
        }
        int iV = z1.v(operand);
        long[] jArr = new long[iV];
        int i10 = 0;
        while (i10 < iV) {
            jArr[i10] = i10 < z1.v(mask) ? y1.n(z1.t(operand, i10) ^ z1.t(mask, i10)) : y1.n(z1.t(operand, i10));
            i10++;
        }
        return h1(z1.k(jArr));
    }

    @Override // com.ionspin.kotlin.bignum.integer.c
    @NotNull
    public long[] K(byte b10) {
        return new long[]{y1.n(((long) b10) & 255)};
    }

    @NotNull
    public final long[] K0(@NotNull long[] firstUnsigned, @NotNull long[] secondUnsigned) {
        Intrinsics.checkNotNullParameter(firstUnsigned, "firstUnsigned");
        Intrinsics.checkNotNullParameter(secondUnsigned, "secondUnsigned");
        return L0(firstUnsigned, secondUnsigned, z1.v(firstUnsigned) - l0(firstUnsigned), z1.v(secondUnsigned) - l0(secondUnsigned));
    }

    @Override // com.ionspin.kotlin.bignum.integer.c
    @NotNull
    public Pair<z1, z1> L(@NotNull long[] operand) {
        Intrinsics.checkNotNullParameter(operand, "operand");
        return n0(operand);
    }

    @Override // com.ionspin.kotlin.bignum.integer.c
    @NotNull
    public long[] M(@NotNull long[] operand, int i10) {
        long jN;
        Intrinsics.checkNotNullParameter(operand, "operand");
        if (z1.B(operand) || i10 == 0) {
            return operand;
        }
        int iV = z1.v(operand) - l0(operand);
        int iA = i10 % a();
        int iA2 = i10 / a();
        if (iA2 >= iV) {
            return E();
        }
        if (iA == 0) {
            z1.k(ArraysKt.copyOfRange(operand, iV - iA2, iV));
        }
        if (iV > 1 && iV - iA2 == 1) {
            return new long[]{y1.n(z1.t(operand, iV - 1) >>> iA)};
        }
        int i11 = iV - iA2;
        if (i11 == 0) {
            return E();
        }
        long[] jArr = new long[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            if (i12 >= 0 && i12 < (iV - 1) - iA2) {
                int i13 = i12 + iA2;
                jN = y1.n(y1.n(z1.t(operand, i13) >>> iA) | y1.n(y1.n(z1.t(operand, i13 + 1) << (f274713a.a() - iA)) & f274722j));
            } else {
                if (i12 != (iV - 1) - iA2) {
                    throw new RuntimeException("Invalid case " + i12);
                }
                jN = y1.n(z1.t(operand, i12 + iA2) >>> iA);
            }
            jArr[i12] = jN;
        }
        return z1.k(jArr);
    }

    @NotNull
    public final long[] M0(@NotNull long[] first, @NotNull long[] second) {
        Intrinsics.checkNotNullParameter(first, "first");
        Intrinsics.checkNotNullParameter(second, "second");
        return f0(first, second) > 0 ? first : second;
    }

    @Override // com.ionspin.kotlin.bignum.integer.c
    @NotNull
    public long[] N(@NotNull long[] base, long j10) {
        Intrinsics.checkNotNullParameter(base, "base");
        if (j10 == 0) {
            return o();
        }
        if (j10 == 1) {
            return base;
        }
        if (z1.v(base) == 1 && z1.t(base, 0) == 10) {
            z1[] z1VarArr = f274731s;
            if (j10 < z1VarArr.length) {
                return z1VarArr[(int) j10].G();
            }
        }
        z1.v(base);
        l0(base);
        long[] jArrO = o();
        while (j10 > 1) {
            long j11 = 2;
            if (j10 % j11 == 0) {
                base = v1(base, base);
                j10 /= j11;
            } else {
                jArrO = v1(base, jArrO);
                base = v1(base, base);
                j10 = (j10 - 1) / j11;
            }
        }
        return v1(jArrO, base);
    }

    @NotNull
    public final long[] N0(@NotNull long[] first, @NotNull long[] second) {
        Intrinsics.checkNotNullParameter(first, "first");
        Intrinsics.checkNotNullParameter(second, "second");
        return f0(first, second) < 0 ? first : second;
    }

    @Override // com.ionspin.kotlin.bignum.integer.c
    @NotNull
    public long[] O(byte b10) {
        int i10 = 5 << 1;
        return new long[]{y1.n(Math.abs((int) b10))};
    }

    @NotNull
    public final C1897a O0(@NotNull C1897a c1897a, @NotNull C1897a other) {
        Intrinsics.checkNotNullParameter(c1897a, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        return r1(c1897a, other);
    }

    @Override // com.ionspin.kotlin.bignum.integer.c
    @NotNull
    public long[] P(@NotNull byte[] source) {
        List<y1> listEmptyList;
        Intrinsics.checkNotNullParameter(source, "source");
        byte[] uByteArray = UCollectionsKt.toUByteArray(CollectionsKt.flatten(CollectionsKt.reversed(CollectionsKt.chunked(r1.d(r1.k(ArraysKt.plus(r1.i(8 - (r1.v(source) % 8)), source))), 8))));
        int iV = r1.v(uByteArray) / 8;
        int iV2 = r1.v(uByteArray) % 8;
        long[] jArrI = z1.i(iV + 1);
        for (int i10 = 0; i10 < iV; i10++) {
            for (int i11 = 0; i11 < 8; i11++) {
                z1.D(jArrI, i10, y1.n(z1.t(jArrI, i10) | y1.n(y1.n(((long) r1.t(uByteArray, (i10 * 8) + i11)) & 255) << (56 - (i11 * 8)))));
            }
        }
        for (int i12 = 0; i12 < iV2; i12++) {
            z1.D(jArrI, z1.v(jArrI) - 1, y1.n(z1.t(jArrI, z1.v(jArrI) - 1) | y1.n(y1.n(((long) r1.t(uByteArray, (iV * 8) + i12)) & 255) << (((iV2 - 1) * 8) - (i12 * 8)))));
        }
        for (int lastIndex = ArraysKt.getLastIndex(jArrI); -1 < lastIndex; lastIndex--) {
            if (z1.t(jArrI, lastIndex) != 0) {
                listEmptyList = UArraysKt.m1563taker7IrZao(jArrI, lastIndex + 1);
                return i0(UCollectionsKt.toULongArray(listEmptyList));
            }
        }
        listEmptyList = CollectionsKt.emptyList();
        return i0(UCollectionsKt.toULongArray(listEmptyList));
    }

    @NotNull
    public final long[] P0(@NotNull long[] minus, @NotNull long[] other) {
        Intrinsics.checkNotNullParameter(minus, "$this$minus");
        Intrinsics.checkNotNullParameter(other, "other");
        return v(minus, other);
    }

    @Override // com.ionspin.kotlin.bignum.integer.c
    @NotNull
    public Pair<z1, z1> Q(@NotNull long[] first, @NotNull long[] second) {
        Intrinsics.checkNotNullParameter(first, "first");
        Intrinsics.checkNotNullParameter(second, "second");
        return d(first, second);
    }

    @NotNull
    public final long[] Q0(@NotNull long[] minus, long j10) {
        Intrinsics.checkNotNullParameter(minus, "$this$minus");
        return v(minus, new long[]{j10});
    }

    @Override // com.ionspin.kotlin.bignum.integer.c
    @NotNull
    public long[] R(@NotNull long[] operand, @NotNull long[] mask) {
        Intrinsics.checkNotNullParameter(operand, "operand");
        Intrinsics.checkNotNullParameter(mask, "mask");
        int iV = z1.v(operand);
        long[] jArr = new long[iV];
        int i10 = 0;
        while (i10 < iV) {
            jArr[i10] = i10 < z1.v(mask) ? y1.n(z1.t(operand, i10) | z1.t(mask, i10)) : z1.t(operand, i10);
            i10++;
        }
        return h1(z1.k(jArr));
    }

    @NotNull
    public final long[] R0(long j10, long j11) {
        if (j10 == 0 || j11 == 0) {
            return new long[]{0};
        }
        long j12 = f274724l;
        long jN = y1.n(j10 & j12);
        long jN2 = y1.n(j10 >>> 32);
        long jN3 = y1.n(j11 & j12);
        long jN4 = y1.n(j11 >>> 32);
        long jN5 = y1.n(jN * jN3);
        long jN6 = y1.n(jN5 >>> 63);
        long j13 = f274722j;
        long jN7 = y1.n(jN5 & j13);
        long jN8 = y1.n(y1.n(jN * jN4) + y1.n(jN3 * jN2));
        long jN9 = y1.n(jN6 + y1.n(jN8 >>> 31));
        long jN10 = y1.n(jN7 + y1.n(y1.n(jN8 << 32) & j13));
        return h1(new long[]{y1.n(jN10 & j13), y1.n(y1.n(jN9 + y1.n(jN10 >>> 63)) + y1.n(y1.n(jN2 * jN4) << 1))});
    }

    @NotNull
    public final long[] S(@NotNull long[] first, long j10) {
        Intrinsics.checkNotNullParameter(first, "first");
        return U(first, j10, z1.v(first) - l0(first));
    }

    @NotNull
    public final long[] T(@NotNull long[] result, int i10, int i11, @NotNull long[] first, long j10) {
        Intrinsics.checkNotNullParameter(result, "result");
        Intrinsics.checkNotNullParameter(first, "first");
        throw new l0(null, 1, null);
    }

    @NotNull
    public final n1<z1, z1, Integer> T0(@NotNull long[] dividend, @NotNull long[] divisor) {
        Intrinsics.checkNotNullParameter(dividend, "dividend");
        Intrinsics.checkNotNullParameter(divisor, "divisor");
        int iE = e(z1.t(divisor, z1.v(divisor) - 1));
        return new n1<>(z1.d(k1(dividend, iE)), z1.d(k1(divisor, iE)), Integer.valueOf(iE));
    }

    @NotNull
    public final long[] U(@NotNull long[] first, long j10, int i10) {
        Intrinsics.checkNotNullParameter(first, "first");
        long jN = y1.n(f274724l & j10);
        long jN2 = y1.n(j10 >>> 32);
        int iF = f(first) + a0(j10);
        long[] jArrI = z1.i(iF % 63 != 0 ? (iF / 63) + 1 : iF / 63);
        int i11 = 0;
        int i12 = 0;
        long jN3 = 0;
        while (i11 < i10) {
            long jN4 = y1.n(z1.t(first, i11) & f274724l);
            long jN5 = y1.n(z1.t(first, i11) >>> 32);
            i11++;
            long jN6 = y1.n(jN4 * jN);
            long jN7 = y1.n(jN6 >>> 63);
            long j11 = f274722j;
            long jN8 = y1.n(jN3 + y1.n(jN6 & j11));
            long jN9 = y1.n(jN7 + y1.n(jN8 >>> 63));
            long jN10 = y1.n(jN8 & j11);
            long jN11 = y1.n(y1.n(jN4 * jN2) + y1.n(jN * jN5));
            long jN12 = y1.n(jN9 + y1.n(jN11 >>> 31));
            long jN13 = y1.n(jN10 + y1.n(y1.n(jN11 << 32) & j11));
            long jN14 = y1.n(jN12 + y1.n(jN13 >>> 63));
            z1.D(jArrI, i12, y1.n(jN13 & j11));
            jN3 = y1.n(jN14 + y1.n(y1.n(jN5 * jN2) << 1));
            i12++;
        }
        if (jN3 != 0) {
            z1.D(jArrI, i12, jN3);
        }
        return jArrI;
    }

    @NotNull
    public final Pair<z1, Integer> U0(@NotNull long[] operand) {
        Intrinsics.checkNotNullParameter(operand, "operand");
        int iE = e(z1.t(operand, z1.v(operand) - 1));
        return new Pair<>(z1.d(k1(operand, iE)), Integer.valueOf(iE));
    }

    @NotNull
    public final long[] V(@NotNull long[] first, @NotNull long[] second) {
        Intrinsics.checkNotNullParameter(first, "first");
        Intrinsics.checkNotNullParameter(second, "second");
        return W(first, second, z1.v(first) - l0(first), z1.v(second) - l0(second));
    }

    public final int V0(long j10) {
        int i10 = 32;
        long jN = y1.n(j10 >>> 32);
        if (jN != 0) {
            j10 = jN;
        } else {
            i10 = 64;
        }
        long jN2 = y1.n(j10 >>> 16);
        if (jN2 != 0) {
            i10 -= 16;
            j10 = jN2;
        }
        long jN3 = y1.n(j10 >>> 8);
        if (jN3 != 0) {
            i10 -= 8;
            j10 = jN3;
        }
        long jN4 = y1.n(j10 >>> 4);
        if (jN4 != 0) {
            i10 -= 4;
            j10 = jN4;
        }
        long jN5 = y1.n(j10 >>> 2);
        if (jN5 != 0) {
            i10 -= 2;
            j10 = jN5;
        }
        return y1.n(j10 >>> 1) != 0 ? i10 - 2 : i10 - ((int) j10);
    }

    public final int W0(long j10) {
        int i10;
        long jN = y1.n(j10 << 32);
        long j11 = f274722j;
        long jN2 = y1.n(jN & j11);
        if (jN2 != 0) {
            i10 = 31;
            j10 = jN2;
        } else {
            i10 = 63;
        }
        long jN3 = y1.n(y1.n(j10 << 16) & j11);
        if (jN3 != 0) {
            i10 -= 16;
            j10 = jN3;
        }
        long jN4 = y1.n(y1.n(j10 << 8) & j11);
        if (jN4 != 0) {
            i10 -= 8;
            j10 = jN4;
        }
        long jN5 = y1.n(y1.n(j10 << 4) & j11);
        if (jN5 != 0) {
            i10 -= 4;
            j10 = jN5;
        }
        long jN6 = y1.n(y1.n(j10 << 2) & j11);
        if (jN6 != 0) {
            i10 -= 2;
            j10 = jN6;
        }
        return y1.n(y1.n(j10 << 1) & j11) != 0 ? i10 - 2 : i10 - ((int) j10);
    }

    @NotNull
    public final Pair<z1, z1> X(@NotNull long[] operand) {
        Intrinsics.checkNotNullParameter(operand, "operand");
        long[] jArrS1 = s1(operand);
        return new Pair<>(z1.d(jArrS1), z1.d(P0(operand, v1(jArrS1, jArrS1))));
    }

    @NotNull
    public final long[] X0(@NotNull long[] first, @NotNull long[] second) {
        Intrinsics.checkNotNullParameter(first, "first");
        Intrinsics.checkNotNullParameter(second, "second");
        if (J0(first)) {
            return second;
        }
        if (J0(second)) {
            return first;
        }
        int iV = z1.v(first) - l0(first);
        int iV2 = z1.v(second) - l0(second);
        k kVar = iV > iV2 ? new k(Integer.valueOf(z1.v(first)), Integer.valueOf(z1.v(second)), z1.d(first), z1.d(second), Integer.valueOf(iV), Integer.valueOf(iV2)) : new k(Integer.valueOf(z1.v(second)), Integer.valueOf(z1.v(first)), z1.d(second), z1.d(first), Integer.valueOf(iV2), Integer.valueOf(iV));
        int iIntValue = ((Number) kVar.a()).intValue();
        ((Number) kVar.b()).intValue();
        long[] jArrG = ((z1) kVar.c()).G();
        long[] jArrG2 = ((z1) kVar.d()).G();
        int iIntValue2 = ((Number) kVar.e()).intValue();
        int iIntValue3 = ((Number) kVar.f()).intValue();
        int i10 = iIntValue2 + 1;
        long[] jArr = new long[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            jArr[i11] = 0;
        }
        long[] jArrK = z1.k(jArr);
        int i12 = 0;
        long jN = 0;
        while (i12 < iIntValue3) {
            long jN2 = y1.n(y1.n(jN + z1.t(jArrG, i12)) + z1.t(jArrG2, i12));
            z1.D(jArrK, i12, y1.n(f274722j & jN2));
            jN = y1.n(jN2 >>> 63);
            i12++;
        }
        while (jN != 0) {
            if (i12 == iIntValue) {
                z1.D(jArrK, iIntValue, jN);
                return jArrK;
            }
            long jN3 = y1.n(jN + z1.t(jArrG, i12));
            z1.D(jArrK, i12, y1.n(f274722j & jN3));
            jN = y1.n(jN3 >>> 63);
            i12++;
        }
        while (i12 < iIntValue2) {
            z1.D(jArrK, i12, z1.t(jArrG, i12));
            i12++;
        }
        if (z1.t(jArrK, z1.v(jArrK) - 1) == 0) {
            return z1.v(jArrK) + (-1) == 0 ? E() : z1.k(ArraysKt.copyOfRange(jArrK, 0, z1.v(jArrK) - 1));
        }
        return jArrK;
    }

    @NotNull
    public final Pair<z1, z1> Y(@NotNull long[] unnormalizedDividend, @NotNull long[] unnormalizedDivisor) {
        Intrinsics.checkNotNullParameter(unnormalizedDividend, "unnormalizedDividend");
        Intrinsics.checkNotNullParameter(unnormalizedDivisor, "unnormalizedDivisor");
        n1<z1, z1, Integer> n1VarT0 = T0(unnormalizedDividend, unnormalizedDivisor);
        long[] jArrG = n1VarT0.a().G();
        long[] jArrG2 = n1VarT0.b().G();
        int iIntValue = n1VarT0.c().intValue();
        int iV = z1.v(jArrG) - z1.v(jArrG2);
        long[] jArrK1 = k1(jArrG2, f274721i * iV);
        int i10 = iV + 1;
        long[] jArr = new long[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            jArr[i11] = 0;
        }
        long[] jArrK = z1.k(jArr);
        if (f0(jArrG, jArrK1) > 0) {
            z1.D(jArrK, iV, 1L);
            jArrG = P0(jArrG, jArrK1);
        }
        E();
        E();
        E();
        E();
        for (int i12 = iV - 1; -1 < i12; i12--) {
            com.ionspin.kotlin.bignum.integer.base32.a aVar = com.ionspin.kotlin.bignum.integer.base32.a.f131082a;
            z1.D(jArrK, i12, z1.t(N0(z0(aVar.C(x1(z1.k(ArraysKt.copyOfRange(jArrG, z1.v(jArrG2) - 1, z1.v(jArrG2) + 1))), x1(new long[]{z1.t(jArrG2, z1.v(jArrG2) - 1)})).getFirst().G()), f274723k), 0));
            long[] jArrK2 = k1(jArrG2, aVar.t0() * i12);
            long[] jArrK3 = k1(w1(jArrG2, z1.t(jArrK, i12)), f274721i * i12);
            if (f0(jArrK3, jArrG) > 0) {
                long[] jArrP0 = P0(jArrK3, jArrG);
                while (f0(jArrP0, jArrK3) > 0) {
                    z1.D(jArrK, i12, y1.n(z1.t(jArrK, i12) - y1.n(1L)));
                    jArrP0 = P0(jArrP0, jArrK2);
                }
                jArrG = k1(P0(jArrG, w1(jArrG2, z1.t(jArrK, i12))), com.ionspin.kotlin.bignum.integer.base32.a.f131082a.t0() * i12);
            } else {
                jArrG = P0(jArrG, jArrK3);
            }
        }
        return new Pair<>(z1.d(h1(jArrK)), z1.d(p0(jArrG, iIntValue)));
    }

    @NotNull
    public final C1897a Y0(@NotNull C1897a c1897a, @NotNull C1897a other) {
        Intrinsics.checkNotNullParameter(c1897a, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        return n1(c1897a, other);
    }

    @NotNull
    public final long[] Z0(@NotNull long[] plus, @NotNull long[] other) {
        Intrinsics.checkNotNullParameter(plus, "$this$plus");
        Intrinsics.checkNotNullParameter(other, "other");
        return F(plus, other);
    }

    @Override // com.ionspin.kotlin.bignum.integer.c
    public int a() {
        return f274720h;
    }

    public final int a0(long j10) {
        return 63 - e(j10);
    }

    @NotNull
    public final long[] a1(@NotNull long[] plus, long j10) {
        Intrinsics.checkNotNullParameter(plus, "$this$plus");
        return F(plus, new long[]{j10});
    }

    @NotNull
    public final C1897a b(@NotNull C1897a and, @NotNull long[] operand) {
        Intrinsics.checkNotNullParameter(and, "$this$and");
        Intrinsics.checkNotNullParameter(operand, "operand");
        return new C1897a(i(and.f(), operand), and.e(), null);
    }

    public final int b0(@NotNull long[] value) {
        Intrinsics.checkNotNullParameter(value, "value");
        if (J0(value)) {
            return 0;
        }
        return c0(z1.t(value, z1.v(value) - 1)) + ((z1.v(value) - 1) * 64);
    }

    public final void c(@NotNull long[] resultArray, int i10, @NotNull long[] first, @NotNull long[] second) {
        Intrinsics.checkNotNullParameter(resultArray, "resultArray");
        Intrinsics.checkNotNullParameter(first, "first");
        Intrinsics.checkNotNullParameter(second, "second");
        int i11 = 0;
        if (J0(first)) {
            ArraysKt.copyInto(first, resultArray, i10, 0, z1.v(first));
            return;
        }
        if (J0(second)) {
            ArraysKt.copyInto(second, resultArray, i10, 0, z1.v(second));
            return;
        }
        int iV = z1.v(first) - l0(first);
        int iV2 = z1.v(second) - l0(second);
        k kVar = iV > iV2 ? new k(Integer.valueOf(z1.v(first)), Integer.valueOf(z1.v(second)), z1.d(first), z1.d(second), Integer.valueOf(iV), Integer.valueOf(iV2)) : new k(Integer.valueOf(z1.v(second)), Integer.valueOf(z1.v(first)), z1.d(second), z1.d(first), Integer.valueOf(iV2), Integer.valueOf(iV));
        int iIntValue = ((Number) kVar.a()).intValue();
        ((Number) kVar.b()).intValue();
        long[] jArrG = ((z1) kVar.c()).G();
        long[] jArrG2 = ((z1) kVar.d()).G();
        int iIntValue2 = ((Number) kVar.e()).intValue();
        int iIntValue3 = ((Number) kVar.f()).intValue();
        long jN = 0;
        while (i11 < iIntValue3) {
            long jN2 = y1.n(y1.n(jN + z1.t(jArrG, i11)) + z1.t(jArrG2, i11));
            z1.D(resultArray, i11 + i10, y1.n(f274722j & jN2));
            jN = y1.n(jN2 >>> 63);
            i11++;
        }
        while (jN != 0) {
            if (i11 == iIntValue) {
                z1.D(resultArray, iIntValue + i10, jN);
                return;
            }
            long jN3 = y1.n(jN + z1.t(jArrG, i11));
            z1.D(resultArray, i11, y1.n(f274722j & jN3));
            jN = y1.n(jN3 >>> 63);
            i11++;
        }
        while (i11 < iIntValue2) {
            z1.D(resultArray, i11 + i10, z1.t(jArrG, i11));
            i11++;
        }
    }

    public final int c0(long j10) {
        return 64 - V0(j10);
    }

    @NotNull
    public final long[] c1(@NotNull long[] original, int i10, long j10) {
        Intrinsics.checkNotNullParameter(original, "original");
        int iV = z1.v(original) + i10;
        long[] jArr = new long[iV];
        int i11 = 0;
        while (i11 < iV) {
            jArr[i11] = i11 < i10 ? j10 : z1.t(original, i11 - i10);
            i11++;
        }
        return z1.k(jArr);
    }

    @NotNull
    public final Pair<z1, z1> d(@NotNull long[] unnormalizedDividend, @NotNull long[] unnormalizedDivisor) {
        long[] jArrE;
        Intrinsics.checkNotNullParameter(unnormalizedDividend, "unnormalizedDividend");
        Intrinsics.checkNotNullParameter(unnormalizedDivisor, "unnormalizedDivisor");
        if (f0(unnormalizedDivisor, unnormalizedDividend) > 0) {
            return new Pair<>(z1.d(E()), z1.d(unnormalizedDividend));
        }
        if (z1.v(unnormalizedDivisor) == 1 && z1.v(unnormalizedDividend) == 1) {
            return new Pair<>(z1.d(h1(new long[]{Long.divideUnsigned(z1.t(unnormalizedDividend, 0), z1.t(unnormalizedDivisor, 0))})), z1.d(h1(new long[]{Long.remainderUnsigned(z1.t(unnormalizedDividend, 0), z1.t(unnormalizedDivisor, 0))})));
        }
        if (f(unnormalizedDividend) - f(unnormalizedDivisor) == 0) {
            return new Pair<>(z1.d(o()), z1.d(P0(unnormalizedDividend, unnormalizedDivisor)));
        }
        n1<z1, z1, Integer> n1VarT0 = T0(unnormalizedDividend, unnormalizedDivisor);
        long[] jArrG = n1VarT0.a().G();
        long[] jArrG2 = n1VarT0.b().G();
        int iIntValue = n1VarT0.c().intValue();
        int iV = z1.v(jArrG);
        int iV2 = z1.v(jArrG2);
        int iV3 = z1.v(jArrG2) - l0(jArrG2);
        int i10 = iV - iV2;
        long[] jArrI = z1.i(i10);
        long[] jArrK1 = k1(jArrG2, a() * i10);
        long j10 = 1;
        if (f0(jArrG, jArrK1) >= 0) {
            jArrI = z1.i(i10 + 1);
            z1.D(jArrI, i10, 1L);
            jArrG = P0(jArrG, jArrK1);
        }
        int i11 = i10 - 1;
        while (-1 < i11) {
            int i12 = iV2 + i11;
            if (i12 < z1.v(jArrG)) {
                jArrE = a1(k1(new long[]{z1.t(jArrG, i12)}, a()), z1.t(jArrG, i12 - 1));
            } else {
                jArrE = i12 == z1.v(jArrG) ? new long[]{z1.t(jArrG, i12 - 1)} : E();
            }
            long j11 = j10;
            long[] jArrZ0 = z0(com.ionspin.kotlin.bignum.integer.base32.a.f131082a.C(x1(jArrE), x1(new long[]{z1.t(jArrG2, iV2 - 1)})).getFirst().G());
            long jT = f274722j;
            if (e0(jArrZ0, y1.n(jT - j11)) < 0) {
                jT = z1.t(jArrZ0, 0);
            }
            z1.D(jArrI, i11, jT);
            long[] jArrK2 = k1(U(jArrG2, z1.t(jArrI, i11), iV3), a() * i11);
            while (f0(jArrK2, jArrG) > 0) {
                z1.D(jArrI, i11, y1.n(z1.t(jArrI, i11) - y1.n(j11)));
                jArrK2 = k1(U(jArrG2, z1.t(jArrI, i11), iV3), a() * i11);
            }
            jArrG = P0(jArrG, jArrK2);
            i11--;
            j10 = j11;
        }
        long j12 = j10;
        while (f0(jArrG, jArrG2) >= 0) {
            jArrI = a1(jArrI, j12);
            jArrG = P0(jArrG, jArrG2);
        }
        return new Pair<>(z1.d(h1(jArrI)), z1.d(p0(jArrG, iIntValue)));
    }

    public final void d0(@NotNull long[] first, @NotNull long[] second) {
        Intrinsics.checkNotNullParameter(first, "first");
        Intrinsics.checkNotNullParameter(second, "second");
    }

    @NotNull
    public final Pair<z1, z1> d1(@NotNull long[] first, @NotNull long[] second) {
        int i10;
        Intrinsics.checkNotNullParameter(first, "first");
        Intrinsics.checkNotNullParameter(second, "second");
        if (z1.v(first) < z1.v(second)) {
            throw new RuntimeException("Invalid division: " + z1.v(first) + " words / " + z1.v(second) + " words");
        }
        int iV = z1.v(second) == 1 ? 1 : z1.v(second) - 1;
        int iV2 = (z1.v(first) - z1.v(second)) + 1;
        int iV3 = z1.v(second) + iV2;
        long[] jArr = new long[iV3];
        int i11 = 0;
        int i12 = 0;
        while (true) {
            long jT = 0;
            if (i12 >= iV3) {
                break;
            }
            if (i12 >= iV2) {
                jT = z1.t(second, i12 - iV2);
            }
            jArr[i12] = jT;
            i12++;
        }
        long[] jArrV1 = v1(first, n0(z1.k(jArr)).getFirst().G());
        if (e0(jArrV1, 0L) == 0) {
            return new Pair<>(z1.d(E()), z1.d(first));
        }
        if (z1.v(jArrV1) == 1) {
            if (e0(jArrV1, y1.n(f274722j - 1)) >= 0) {
                jArrV1 = Z0(jArrV1, o());
            }
            i10 = iV2;
        } else {
            i10 = iV2;
            if (Long.compareUnsigned(z1.t(jArrV1, z1.v(jArrV1) - z1.v(second)), f274722j) >= 0) {
                int iV4 = z1.v(jArrV1);
                long[] jArr2 = new long[iV4];
                while (i11 < iV4) {
                    jArr2[i11] = i11 == z1.v(jArrV1) - 1 ? y1.n(z1.t(jArrV1, z1.v(jArrV1) - 1) + 1) : 0L;
                    i11++;
                }
                jArrV1 = z1.k(jArr2);
            }
        }
        long[] jArrK = z1.k(ArraysKt.copyOfRange(jArrV1, (iV * 2) + i10, z1.v(jArrV1)));
        return new Pair<>(z1.d(jArrK), z1.d(P0(first, v1(jArrK, second))));
    }

    @Override // com.ionspin.kotlin.bignum.integer.c
    public int e(long j10) {
        int i10;
        long jN = y1.n(j10 >>> 32);
        if (jN != 0) {
            i10 = 31;
            j10 = jN;
        } else {
            i10 = 63;
        }
        long jN2 = y1.n(j10 >>> 16);
        if (jN2 != 0) {
            i10 -= 16;
            j10 = jN2;
        }
        long jN3 = y1.n(j10 >>> 8);
        if (jN3 != 0) {
            i10 -= 8;
            j10 = jN3;
        }
        long jN4 = y1.n(j10 >>> 4);
        if (jN4 != 0) {
            i10 -= 4;
            j10 = jN4;
        }
        long jN5 = y1.n(j10 >>> 2);
        if (jN5 != 0) {
            i10 -= 2;
            j10 = jN5;
        }
        return y1.n(j10 >>> 1) != 0 ? i10 - 2 : i10 - ((int) j10);
    }

    public final int e0(@NotNull long[] compareTo, long j10) {
        Intrinsics.checkNotNullParameter(compareTo, "$this$compareTo");
        return H(compareTo, new long[]{j10});
    }

    @NotNull
    public final C1897a e1(@NotNull C1897a c1897a, @NotNull C1897a other) {
        Intrinsics.checkNotNullParameter(c1897a, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        return q1(c1897a, other);
    }

    @Override // com.ionspin.kotlin.bignum.integer.c
    public int f(@NotNull long[] value) {
        Intrinsics.checkNotNullParameter(value, "value");
        if (J0(value)) {
            return 0;
        }
        int iV = (z1.v(value) - l0(value)) - 1;
        return a0(z1.t(value, iV)) + (iV * 63);
    }

    public final int f0(@NotNull long[] compareTo, @NotNull long[] other) {
        Intrinsics.checkNotNullParameter(compareTo, "$this$compareTo");
        Intrinsics.checkNotNullParameter(other, "other");
        return H(compareTo, other);
    }

    @NotNull
    public final long[] f1(@NotNull long[] rem, @NotNull long[] other) {
        Intrinsics.checkNotNullParameter(rem, "$this$rem");
        Intrinsics.checkNotNullParameter(other, "other");
        return Q(rem, other).getSecond().G();
    }

    @Override // com.ionspin.kotlin.bignum.integer.c
    @NotNull
    public long[] g(@NotNull byte[] source) {
        Intrinsics.checkNotNullParameter(source, "source");
        return P(r1.k(source));
    }

    public final int g0(@NotNull long[] first, @NotNull long[] second, int i10, int i11) {
        boolean z10;
        boolean z11;
        Intrinsics.checkNotNullParameter(first, "first");
        Intrinsics.checkNotNullParameter(second, "second");
        if (i10 > i11) {
            return 1;
        }
        if (i11 > i10) {
            return -1;
        }
        int i12 = i10 - 1;
        while (true) {
            if (i12 < 0) {
                z10 = true;
                z11 = false;
                break;
            }
            if (Long.compareUnsigned(z1.t(first, i12), z1.t(second, i12)) > 0) {
                z11 = true;
                z10 = false;
                break;
            }
            if (Long.compareUnsigned(z1.t(first, i12), z1.t(second, i12)) < 0) {
                z10 = false;
                z11 = false;
                break;
            }
            i12--;
        }
        if (z10) {
            return 0;
        }
        return z11 ? 1 : -1;
    }

    @NotNull
    public final long[] g1(@NotNull long[] rem, long j10) {
        Intrinsics.checkNotNullParameter(rem, "$this$rem");
        return Q(rem, new long[]{j10}).getSecond().G();
    }

    @Override // com.ionspin.kotlin.bignum.integer.c
    @NotNull
    public Pair<z1, z1> h(@NotNull long[] operand) {
        Intrinsics.checkNotNullParameter(operand, "operand");
        return i1(operand);
    }

    @NotNull
    public final long[] h0(@NotNull int[] operand) {
        Intrinsics.checkNotNullParameter(operand, "operand");
        if (v1.v(operand) == 0) {
            return E();
        }
        if (v1.v(operand) == 1) {
            return new long[]{y1.n(((long) v1.t(operand, 0)) & k0.f265952a)};
        }
        int iN = com.ionspin.kotlin.bignum.integer.base32.a.f131082a.N(operand);
        int i10 = iN % 63 == 0 ? iN / 63 : (iN / 63) + 1;
        long[] jArrI = z1.i(i10);
        for (int i11 = 0; i11 < i10; i11++) {
            int i12 = i11 % 32;
            int i13 = (i11 * 2) - (i11 / 32);
            if (i10 == 2) {
                z1.D(jArrI, 0, y1.n(y1.n(((long) v1.t(operand, 0)) & k0.f265952a) | y1.n(y1.n(y1.n(((long) v1.t(operand, 1)) & k0.f265952a) << 32) & f274725m)));
                if (v1.v(operand) == 4) {
                    z1.D(jArrI, 1, y1.n(y1.n(y1.n(y1.n(((long) v1.t(operand, 1)) & k0.f265952a) >>> 31) | y1.n(y1.n(((long) v1.t(operand, 2)) & k0.f265952a) << 1)) | y1.n(y1.n(((long) v1.t(operand, 3)) & k0.f265952a) << 33)));
                } else if (v1.v(operand) > 2) {
                    z1.D(jArrI, 1, y1.n(y1.n(y1.n(((long) v1.t(operand, 1)) & k0.f265952a) >>> 31) | y1.n(y1.n(((long) v1.t(operand, 2)) & k0.f265952a) << 1)));
                } else {
                    z1.D(jArrI, 1, y1.n(y1.n(((long) v1.t(operand, 1)) & k0.f265952a) >>> 31));
                }
            } else if (i11 == 0) {
                z1.D(jArrI, i11, y1.n(y1.n(((long) v1.t(operand, 0)) & k0.f265952a) | y1.n(y1.n(y1.n(((long) v1.t(operand, 1)) & k0.f265952a) << 32) & f274725m)));
            } else if (1 <= i11 && i11 < i10 - 1) {
                z1.D(jArrI, i11, y1.n(y1.n(y1.n(y1.n(((long) v1.t(operand, i13 + 1)) & k0.f265952a) << (i12 + 32)) & f274725m) | y1.n(y1.n(y1.n(((long) v1.t(operand, i13 - 1)) & k0.f265952a) >>> (32 - i12)) | y1.n(y1.n(((long) v1.t(operand, i13)) & k0.f265952a) << i12))));
            } else if (i11 == i10 - 1) {
                if (i13 < v1.v(operand)) {
                    z1.D(jArrI, i11, y1.n(y1.n(y1.n(((long) v1.t(operand, i13)) & k0.f265952a) << i12) | y1.n(y1.n(((long) v1.t(operand, i13 - 1)) & k0.f265952a) >>> (32 - i12))));
                } else {
                    z1.D(jArrI, i11, y1.n(y1.n(((long) v1.t(operand, i13 - 1)) & k0.f265952a) >>> (32 - i12)));
                }
            }
        }
        return jArrI;
    }

    @NotNull
    public final long[] h1(@NotNull long[] bigInteger) {
        Intrinsics.checkNotNullParameter(bigInteger, "bigInteger");
        int iV = z1.v(bigInteger) - l0(bigInteger);
        if (iV == 0) {
            return E();
        }
        return z1.v(bigInteger) == iV ? bigInteger : z1.k(ArraysKt.copyOfRange(bigInteger, 0, iV));
    }

    @Override // com.ionspin.kotlin.bignum.integer.c
    @NotNull
    public long[] i(@NotNull long[] operand, @NotNull long[] mask) {
        Intrinsics.checkNotNullParameter(operand, "operand");
        Intrinsics.checkNotNullParameter(mask, "mask");
        Pair pair = z1.v(operand) > z1.v(mask) ? new Pair(z1.d(operand), z1.d(mask)) : new Pair(z1.d(mask), z1.d(operand));
        ((z1) pair.component1()).G();
        int iV = z1.v(((z1) pair.component2()).G());
        long[] jArr = new long[iV];
        for (int i10 = 0; i10 < iV; i10++) {
            jArr[i10] = y1.n(z1.t(operand, i10) & z1.t(mask, i10));
        }
        return z1.k(jArr);
    }

    @NotNull
    public final long[] i0(@NotNull long[] operand) {
        Intrinsics.checkNotNullParameter(operand, "operand");
        if (z1.v(operand) == 0) {
            return E();
        }
        if (z1.v(operand) == 1) {
            long[] jArrI = z1.i(2);
            z1.D(jArrI, 0, y1.n(z1.t(operand, 0) & f274722j));
            z1.D(jArrI, 1, y1.n(z1.t(operand, 0) >>> 63));
            return jArrI;
        }
        int iB0 = b0(operand);
        int i10 = iB0 % 63 == 0 ? iB0 / 63 : (iB0 / 63) + 1;
        if (i10 == 2) {
            long[] jArrI2 = z1.i(2);
            z1.D(jArrI2, 0, y1.n(z1.t(operand, 0) & f274722j));
            z1.D(jArrI2, 1, y1.n(y1.n(z1.t(operand, 1) << 1) | y1.n(z1.t(operand, 0) >>> 63)));
            return jArrI2;
        }
        long[] jArrI3 = z1.i(i10);
        for (int i11 = 0; i11 < i10; i11++) {
            int i12 = i11 % 64;
            int i13 = i11 - (i11 / 64);
            if (i11 == 0) {
                z1.D(jArrI3, i11, y1.n(z1.t(operand, 0) & f274722j));
            } else if (1 <= i11 && i11 < i10 - 1) {
                z1.D(jArrI3, i11, i12 > 0 ? y1.n(y1.n(y1.n(z1.t(operand, i13 - 1) >>> (64 - i12)) | y1.n(z1.t(operand, i13) << i12)) & f274722j) : y1.n(y1.n(z1.t(operand, i13) << i12) & f274722j));
            } else if (i11 == i10 - 1) {
                if (i13 < z1.v(operand)) {
                    z1.D(jArrI3, i11, i12 > 0 ? y1.n(y1.n(y1.n(z1.t(operand, i13 - 1) >>> (64 - i12)) | y1.n(z1.t(operand, i13) << i12)) & f274722j) : y1.n(y1.n(z1.t(operand, i13) << i12) & f274722j));
                } else {
                    z1.D(jArrI3, i11, i12 > 0 ? y1.n(z1.t(operand, i13 - 1) >>> (64 - i12)) : 0L);
                }
            }
        }
        return jArrI3;
    }

    @Override // com.ionspin.kotlin.bignum.integer.c
    public int j(@NotNull long[] value) {
        Intrinsics.checkNotNullParameter(value, "value");
        if (J0(value)) {
            return 0;
        }
        ArrayList arrayList = new ArrayList();
        int iV = z1.v(value);
        for (int i10 = 0; i10 < iV; i10++) {
            long jT = z1.t(value, i10);
            if (jT != 0) {
                break;
            }
            arrayList.add(y1.c(jT));
        }
        int size = arrayList.size();
        if (size == z1.v(value)) {
            return 0;
        }
        return A1(z1.t(value, size)) + (size * 63);
    }

    @NotNull
    public final int[] j0(@NotNull long[] operand) {
        Intrinsics.checkNotNullParameter(operand, "operand");
        long[] jArrK0 = k0(operand);
        int[] iArrI = v1.i(z1.v(jArrK0) * 2);
        int iV = z1.v(jArrK0);
        for (int i10 = 0; i10 < iV; i10++) {
            int i11 = i10 * 2;
            v1.D(iArrI, i11, u1.n((int) y1.n(z1.t(jArrK0, i10) & y1.n(((long) com.ionspin.kotlin.bignum.integer.base32.a.f131082a.n0()) & k0.f265952a))));
            v1.D(iArrI, i11 + 1, u1.n((int) y1.n(z1.t(jArrK0, i10) >>> 32)));
        }
        return com.ionspin.kotlin.bignum.integer.base32.a.f131082a.S0(iArrI);
    }

    @NotNull
    public final C1897a j1(@NotNull C1897a c1897a, int i10) {
        Intrinsics.checkNotNullParameter(c1897a, "<this>");
        return new C1897a(k1(c1897a.f(), i10), c1897a.e(), null);
    }

    @Override // com.ionspin.kotlin.bignum.integer.c
    @NotNull
    public byte[] k(@NotNull long[] operand) {
        Intrinsics.checkNotNullParameter(operand, "operand");
        long[] jArrK = z1.k(ArraysKt.reversedArray(k0(operand)));
        byte[] bArrI = r1.i(z1.v(jArrK) * 8);
        int iV = z1.v(jArrK);
        for (int i10 = 0; i10 < iV; i10++) {
            ArraysKt.copyInto(com.ionspin.kotlin.bignum.integer.util.a.k(z1.t(jArrK, i10)), bArrI, i10 * 8, 0, 8);
        }
        ArrayList arrayList = new ArrayList();
        int iV2 = r1.v(bArrI);
        boolean z10 = false;
        for (int i11 = 0; i11 < iV2; i11++) {
            byte bT = r1.t(bArrI, i11);
            if (z10) {
                arrayList.add(q1.c(bT));
            } else if (u1.n(bT & 255) != 0) {
                arrayList.add(q1.c(bT));
                z10 = true;
            }
        }
        return UCollectionsKt.toUByteArray(arrayList);
    }

    @NotNull
    public final long[] k0(@NotNull long[] operand) {
        Intrinsics.checkNotNullParameter(operand, "operand");
        if (J0(operand)) {
            return E();
        }
        int iF = f(operand);
        int i10 = iF % 64 == 0 ? iF / 64 : (iF / 64) + 1;
        long[] jArrI = z1.i(i10);
        for (int i11 = 0; i11 < i10; i11++) {
            int i12 = i11 % 63;
            int i13 = (i11 / 63) + i11;
            int i14 = i13 + 1;
            if (i14 < z1.v(operand)) {
                z1.D(jArrI, i11, y1.n(y1.n(z1.t(operand, i14) << (63 - i12)) | y1.n(z1.t(operand, i13) >>> i12)));
            } else {
                z1.D(jArrI, i11, y1.n(z1.t(operand, i13) >>> i12));
            }
        }
        return h1(jArrI);
    }

    @NotNull
    public final long[] k1(@NotNull long[] shl, int i10) {
        Intrinsics.checkNotNullParameter(shl, "$this$shl");
        return w(shl, i10);
    }

    @Override // com.ionspin.kotlin.bignum.integer.c
    public long l(@NotNull long[] operand) {
        Intrinsics.checkNotNullParameter(operand, "operand");
        double dCeil = Math.ceil(((double) (f(operand) - 1)) * com.ionspin.kotlin.bignum.integer.a.f131059e.I());
        long[] jArrR0 = r0(operand, N(m(), (long) dCeil));
        long j10 = 0;
        while (H(jArrR0, E()) != 0) {
            jArrR0 = r0(jArrR0, m());
            j10++;
        }
        return j10 + ((long) ((int) dCeil));
    }

    public final int l0(@NotNull long[] bigInteger) {
        Intrinsics.checkNotNullParameter(bigInteger, "bigInteger");
        int iV = z1.v(bigInteger) - 1;
        if (iV <= 0) {
            return 0;
        }
        long jT = z1.t(bigInteger, iV);
        while (jT == 0 && iV > 0) {
            iV--;
            jT = z1.t(bigInteger, iV);
        }
        if (z1.t(bigInteger, iV) == 0) {
            iV--;
        }
        return (z1.v(bigInteger) - iV) - 1;
    }

    @NotNull
    public final C1897a l1(@NotNull C1897a c1897a, int i10) {
        Intrinsics.checkNotNullParameter(c1897a, "<this>");
        return new C1897a(m1(c1897a.f(), i10), c1897a.e(), null);
    }

    @Override // com.ionspin.kotlin.bignum.integer.c
    @NotNull
    public long[] m() {
        return f274718f;
    }

    @NotNull
    public final Pair<z1, z1> m0(@NotNull long[] a10) {
        long[] jArrP0;
        Intrinsics.checkNotNullParameter(a10, "a");
        int iF = f(a10);
        if (iF > 63) {
            iF -= 63;
        }
        if (iF <= 30) {
            long jN = y1.n(1 << (iF * 2));
            long jT = z1.t(a10, 0);
            long jDivideUnsigned = Long.divideUnsigned(jN, jT);
            return new Pair<>(z1.d(new long[]{jDivideUnsigned}), z1.d(new long[]{y1.n(jN - y1.n(jT * jDivideUnsigned))}));
        }
        int iFloor = (int) Math.floor(((double) (iF - 1)) / ((double) 2));
        int i10 = iF - iFloor;
        long[] jArrP1 = P0(k1(o(), iFloor), o());
        long[] jArrM1 = m1(a10, iFloor);
        long[] jArrI = i(a10, jArrP1);
        Pair<z1, z1> pairM0 = m0(jArrM1);
        long[] jArrG = pairM0.component1().G();
        long[] jArrG2 = pairM0.component2().G();
        long[] jArrV1 = v1(jArrI, jArrG);
        long[] jArrK1 = k1(jArrG2, iFloor);
        if (f0(jArrK1, jArrV1) >= 0) {
            jArrP0 = P0(jArrK1, jArrV1);
        } else {
            jArrG = P0(jArrG, o());
            jArrP0 = P0(Z0(jArrK1, a10), jArrV1);
        }
        long[] jArrM2 = m1(v1(jArrG, m1(jArrP0, i10)), i10);
        long[] jArrZ0 = Z0(k1(jArrG, iFloor), jArrM2);
        long[] jArrP2 = P0(k1(jArrP0, iFloor), v1(a10, jArrM2));
        if (f0(jArrP2, a10) >= 0) {
            jArrZ0 = Z0(jArrZ0, o());
            jArrP2 = P0(jArrP2, a10);
            if (f0(jArrP2, a10) >= 0) {
                jArrZ0 = Z0(jArrZ0, o());
                jArrP2 = P0(jArrP2, a10);
            }
        }
        return new Pair<>(z1.d(jArrZ0), z1.d(jArrP2));
    }

    @NotNull
    public final long[] m1(@NotNull long[] shr, int i10) {
        Intrinsics.checkNotNullParameter(shr, "$this$shr");
        return M(shr, i10);
    }

    @Override // com.ionspin.kotlin.bignum.integer.c
    public boolean n(@NotNull long[] operand, long j10) {
        Intrinsics.checkNotNullParameter(operand, "operand");
        long j11 = 63;
        long j12 = j10 / j11;
        if (j12 <= g3.f12256c) {
            return j12 < ((long) z1.v(operand)) && y1.n(z1.t(operand, (int) j12) & y1.n(1 << ((int) (j10 % j11)))) != 0;
        }
        throw new RuntimeException("Invalid bit index, too large, cannot access word (Word position > Int.MAX_VALUE");
    }

    @NotNull
    public final Pair<z1, z1> n0(@NotNull long[] a10) {
        long[] jArrP0;
        Intrinsics.checkNotNullParameter(a10, "a");
        int iV = z1.v(a10);
        int i10 = iV - 1;
        if (i10 <= 2) {
            if (i10 == 0) {
                i10 = 1;
            }
            long[] jArrK1 = k1(o(), i10 * 2 * f274721i);
            long[] jArrR0 = r0(jArrK1, a10);
            return new Pair<>(z1.d(jArrR0), z1.d(P0(jArrK1, v1(jArrR0, a10))));
        }
        int iFloor = (int) Math.floor(((double) (iV - 2)) / ((double) 2));
        int i11 = i10 - iFloor;
        long[] jArrK = z1.k(ArraysKt.copyOfRange(a10, (z1.v(a10) - i11) - 1, z1.v(a10)));
        long[] jArrK2 = z1.k(ArraysKt.copyOfRange(a10, 0, iFloor));
        Pair<z1, z1> pairN0 = n0(jArrK);
        long[] jArrG = pairN0.component1().G();
        long[] jArrG2 = pairN0.component2().G();
        long[] jArrV1 = v1(jArrK2, jArrG);
        int i12 = f274721i;
        long[] jArrK3 = k1(jArrG2, iFloor * i12);
        if (f0(jArrK3, jArrV1) >= 0) {
            jArrP0 = P0(jArrK3, jArrV1);
        } else {
            jArrG = P0(jArrG, o());
            jArrP0 = P0(Z0(jArrK3, a10), jArrV1);
        }
        long[] jArrM1 = m1(v1(jArrG, m1(jArrP0, i11 * i12)), i11 * i12);
        long[] jArrZ0 = Z0(k1(jArrG, iFloor * i12), jArrM1);
        long[] jArrP1 = P0(k1(jArrP0, iFloor * i12), v1(a10, jArrM1));
        if (f0(jArrP1, a10) >= 0) {
            jArrZ0 = Z0(jArrZ0, o());
            jArrP1 = P0(jArrP1, a10);
            if (f0(jArrP1, a10) >= 0) {
                jArrZ0 = Z0(jArrZ0, o());
                jArrP1 = P0(jArrP1, a10);
            }
        }
        return new Pair<>(z1.d(jArrZ0), z1.d(jArrP1));
    }

    @Override // com.ionspin.kotlin.bignum.integer.c
    @NotNull
    public long[] o() {
        return f274716d;
    }

    @Override // com.ionspin.kotlin.bignum.integer.c
    @NotNull
    public byte[] p(@NotNull long[] operand) {
        Intrinsics.checkNotNullParameter(operand, "operand");
        return k(operand);
    }

    @NotNull
    public final long[] p0(@NotNull long[] remainderNormalized, int i10) {
        Intrinsics.checkNotNullParameter(remainderNormalized, "remainderNormalized");
        return m1(remainderNormalized, i10);
    }

    @Override // com.ionspin.kotlin.bignum.integer.c
    @NotNull
    public long[] q(short s10) {
        return new long[]{y1.n(Math.abs((int) s10))};
    }

    @NotNull
    public final C1897a q0(@NotNull C1897a c1897a, @NotNull C1897a other) {
        Intrinsics.checkNotNullParameter(c1897a, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        return o1(c1897a, other);
    }

    @Override // com.ionspin.kotlin.bignum.integer.c
    @NotNull
    public long[] r(@NotNull long[] operand, long j10, boolean z10) {
        Intrinsics.checkNotNullParameter(operand, "operand");
        long j11 = 63;
        long j12 = j10 / j11;
        if (j12 > g3.f12256c) {
            throw new RuntimeException("Invalid bit index, too large, cannot access word (Word position > Int.MAX_VALUE");
        }
        if (j12 >= z1.v(operand)) {
            throw new IndexOutOfBoundsException("Invalid position, addressed word " + j12 + " larger than number of words " + z1.v(operand));
        }
        long jN = y1.n(1 << ((int) (j10 % j11)));
        int iV = z1.v(operand);
        long[] jArr = new long[iV];
        for (int i10 = 0; i10 < iV; i10++) {
            jArr[i10] = i10 == ((int) j12) ? z10 ? y1.n(z1.t(operand, i10) | jN) : y1.n(z1.t(operand, i10) ^ jN) : z1.t(operand, i10);
        }
        return z1.k(jArr);
    }

    @NotNull
    public final long[] r0(@NotNull long[] div, @NotNull long[] other) {
        Intrinsics.checkNotNullParameter(div, "$this$div");
        Intrinsics.checkNotNullParameter(other, "other");
        return Q(div, other).getFirst().G();
    }

    @Override // com.ionspin.kotlin.bignum.integer.c
    @NotNull
    public long[] s(int i10) {
        return new long[]{y1.n(Math.abs(i10))};
    }

    @NotNull
    public final long[] s0(@NotNull long[] div, long j10) {
        Intrinsics.checkNotNullParameter(div, "$this$div");
        return Q(div, new long[]{j10}).getFirst().G();
    }

    @NotNull
    public final long[] s1(@NotNull long[] operand) {
        Intrinsics.checkNotNullParameter(operand, "operand");
        E();
        E();
        long[] jArr = operand;
        while (true) {
            long[] jArrM1 = m1(Z0(jArr, r0(operand, jArr)), 1);
            if (f0(jArrM1, jArr) >= 0) {
                return jArr;
            }
            jArr = jArrM1;
        }
    }

    @Override // com.ionspin.kotlin.bignum.integer.c
    @NotNull
    public long[] t(long j10) {
        return y1.n(f274726n & j10) != 0 ? new long[]{y1.n(j10 & f274722j), 1} : new long[]{j10};
    }

    @NotNull
    public final Pair<z1, z1> t0(@NotNull long[] divrem, @NotNull long[] other) {
        Intrinsics.checkNotNullParameter(divrem, "$this$divrem");
        Intrinsics.checkNotNullParameter(other, "other");
        return Q(divrem, other);
    }

    @NotNull
    public final long[] t1(@NotNull long[] first, @NotNull long[] second, int i10, int i11) {
        Intrinsics.checkNotNullParameter(first, "first");
        Intrinsics.checkNotNullParameter(second, "second");
        int iG0 = g0(first, second, i10, i11);
        int i12 = i11 + 1;
        boolean z10 = iG0 == 1;
        if (iG0 == 0) {
            return E();
        }
        if (i12 == 1 && z1.t(second, 0) == 0) {
            return first;
        }
        if (!z10) {
            throw new RuntimeException("subtract result less than zero");
        }
        h hVar = z10 ? new h(z1.d(first), z1.d(second), Integer.valueOf(i10), Integer.valueOf(i11)) : new h(z1.d(second), z1.d(first), Integer.valueOf(i11), Integer.valueOf(i10));
        long[] jArrG = ((z1) hVar.a()).G();
        long[] jArrG2 = ((z1) hVar.b()).G();
        int iIntValue = ((Number) hVar.c()).intValue();
        int iIntValue2 = ((Number) hVar.d()).intValue();
        long[] jArr = new long[iIntValue];
        for (int i13 = 0; i13 < iIntValue; i13++) {
            jArr[i13] = 0;
        }
        long[] jArrK = z1.k(jArr);
        int i14 = 0;
        long jN = 0;
        while (i14 < iIntValue2) {
            long jN2 = y1.n(y1.n(z1.t(jArrG, i14) - z1.t(jArrG2, i14)) - jN);
            z1.D(jArrK, i14, y1.n(f274722j & jN2));
            jN = y1.n(jN2 >>> 63);
            i14++;
        }
        while (jN != 0) {
            long jN3 = y1.n(z1.t(jArrG, i14) - jN);
            z1.D(jArrK, i14, y1.n(f274722j & jN3));
            jN = y1.n(jN3 >>> 63);
            i14++;
        }
        while (i14 < iIntValue) {
            z1.D(jArrK, i14, z1.t(jArrG, i14));
            i14++;
        }
        return (l0(jArrK) == z1.v(jArrK) - 1 && z1.t(jArrK, 0) == 0) ? E() : h1(jArrK);
    }

    @Override // com.ionspin.kotlin.bignum.integer.c
    @NotNull
    public long[] u(long j10) {
        return j10 == Long.MIN_VALUE ? new long[]{0, 1} : new long[]{y1.n(y1.n(Math.abs(j10)) & f274722j)};
    }

    @NotNull
    public final C1897a u1(@NotNull C1897a c1897a, @NotNull C1897a other) {
        Intrinsics.checkNotNullParameter(c1897a, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        return p1(c1897a, other);
    }

    @Override // com.ionspin.kotlin.bignum.integer.c
    @NotNull
    public long[] v(@NotNull long[] first, @NotNull long[] second) {
        Intrinsics.checkNotNullParameter(first, "first");
        Intrinsics.checkNotNullParameter(second, "second");
        return t1(first, second, z1.v(first) - l0(first), z1.v(second) - l0(second));
    }

    @NotNull
    public final long[] v0(@NotNull long[] operand) {
        Intrinsics.checkNotNullParameter(operand, "operand");
        return UCollectionsKt.toULongArray(UArraysKt.m1501sliceZRhS8yI(I(operand, UCollectionsKt.toULongArray(z1.d(com.ionspin.kotlin.bignum.modular.a.f131134d.d(com.ionspin.kotlin.bignum.integer.a.f131059e.k().i0(z1.v(operand) * 63)).b(3).K().W0().e1()))), ArraysKt.getIndices(operand)));
    }

    @NotNull
    public final long[] v1(@NotNull long[] times, @NotNull long[] other) {
        Intrinsics.checkNotNullParameter(times, "$this$times");
        Intrinsics.checkNotNullParameter(other, "other");
        return I(times, other);
    }

    @Override // com.ionspin.kotlin.bignum.integer.c
    @NotNull
    public long[] w(@NotNull long[] operand, int i10) {
        int iL0;
        long jN;
        Intrinsics.checkNotNullParameter(operand, "operand");
        if (J0(operand) || i10 == 0) {
            return operand;
        }
        if (!z1.B(operand) && z1.v(operand) != (iL0 = l0(operand))) {
            int iV = z1.v(operand) - iL0;
            int iE = e(z1.t(operand, iV - 1));
            int iA = i10 / a();
            int iA2 = i10 % a();
            int i11 = iA2 > iE ? iA + 1 : iA;
            int i12 = 0;
            if (iA2 == 0) {
                int i13 = iV + i11;
                long[] jArr = new long[i13];
                while (i12 < i13) {
                    jArr[i12] = (i12 < 0 || i12 >= iA) ? z1.t(operand, i12 - iA) : 0L;
                    i12++;
                }
                return z1.k(jArr);
            }
            int i14 = iV + i11;
            long[] jArr2 = new long[i14];
            while (i12 < i14) {
                if (i12 >= 0 && i12 < iA) {
                    jN = 0;
                } else if (i12 == iA) {
                    jN = y1.n(y1.n(z1.t(operand, i12 - iA) << iA2) & f274722j);
                } else {
                    int i15 = iA + 1;
                    if (i12 < iV + iA && i15 <= i12) {
                        int i16 = i12 - iA;
                        jN = y1.n(y1.n(y1.n(z1.t(operand, i16) << iA2) & f274722j) | y1.n(z1.t(operand, i16 - 1) >>> (f274713a.a() - iA2)));
                    } else {
                        if (i12 != i14 - 1) {
                            throw new RuntimeException("Invalid case " + i12);
                        }
                        jN = y1.n(z1.t(operand, i12 - i11) >>> (f274713a.a() - iA2));
                    }
                }
                jArr2[i12] = jN;
                i12++;
            }
            return z1.k(jArr2);
        }
        return E();
    }

    @NotNull
    public final long[] w0(@NotNull long[] operand) {
        Intrinsics.checkNotNullParameter(operand, "operand");
        return operand;
    }

    @NotNull
    public final long[] w1(@NotNull long[] times, long j10) {
        Intrinsics.checkNotNullParameter(times, "$this$times");
        return S(times, j10);
    }

    @Override // com.ionspin.kotlin.bignum.integer.c
    @NotNull
    public long[] x(int i10) {
        return new long[]{y1.n(((long) i10) & k0.f265952a)};
    }

    @NotNull
    public final long[] x0(@NotNull long[] original, int i10, long j10) {
        Intrinsics.checkNotNullParameter(original, "original");
        int iV = z1.v(original) + i10;
        long[] jArr = new long[iV];
        int i11 = 0;
        while (i11 < iV) {
            jArr[i11] = i11 < z1.v(original) ? z1.t(original, i11) : j10;
            i11++;
        }
        return z1.k(jArr);
    }

    @NotNull
    public final int[] x1(@NotNull long[] to32Bit) {
        Intrinsics.checkNotNullParameter(to32Bit, "$this$to32Bit");
        return j0(to32Bit);
    }

    @Override // com.ionspin.kotlin.bignum.integer.c
    @NotNull
    public String y(@NotNull long[] operand, int i10) {
        Intrinsics.checkNotNullParameter(operand, "operand");
        long[] jArrCopyOf = Arrays.copyOf(operand, operand.length);
        Intrinsics.checkNotNullExpressionValue(jArrCopyOf, "copyOf(...)");
        long[] jArrK = z1.k(jArrCopyOf);
        long[] jArr = {y1.n(i10)};
        StringBuilder sb2 = new StringBuilder();
        while (!z1.s(jArrK, E())) {
            Pair<z1, z1> pairT0 = t0(jArrK, jArr);
            if (z1.B(pairT0.getSecond().G())) {
                sb2.append(0);
            } else {
                sb2.append(d0.a(z1.t(pairT0.getSecond().G(), 0), i10));
            }
            jArrK = pairT0.getFirst().G();
        }
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return StringsKt.z8(string).toString();
    }

    @NotNull
    public final long[] y0(@NotNull long[] first, @NotNull long[] second) {
        Intrinsics.checkNotNullParameter(first, "first");
        Intrinsics.checkNotNullParameter(second, "second");
        int i10 = 7 << 1;
        throw new l0(null, 1, null);
    }

    @NotNull
    public final long[] y1(@NotNull long[] firstUnchecked, @NotNull long[] secondUnchecked) {
        List listD;
        List listD2;
        Intrinsics.checkNotNullParameter(firstUnchecked, "firstUnchecked");
        Intrinsics.checkNotNullParameter(secondUnchecked, "secondUnchecked");
        if (z1.v(firstUnchecked) % 3 != 0) {
            z1 z1VarD = z1.d(firstUnchecked);
            int iV = (((z1.v(firstUnchecked) + 2) / 3) * 3) - z1.v(firstUnchecked);
            long[] jArr = new long[iV];
            for (int i10 = 0; i10 < iV; i10++) {
                jArr[i10] = 0;
            }
            listD = CollectionsKt.plus((Collection) z1VarD, (Iterable) z1.d(z1.k(jArr)));
        } else {
            listD = z1.d(firstUnchecked);
        }
        long[] uLongArray = UCollectionsKt.toULongArray(listD);
        if (z1.v(secondUnchecked) % 3 != 0) {
            z1 z1VarD2 = z1.d(secondUnchecked);
            int iV2 = (((z1.v(secondUnchecked) + 2) / 3) * 3) - z1.v(secondUnchecked);
            long[] jArr2 = new long[iV2];
            for (int i11 = 0; i11 < iV2; i11++) {
                jArr2[i11] = 0;
            }
            listD2 = CollectionsKt.plus((Collection) z1VarD2, (Iterable) z1.d(z1.k(jArr2)));
        } else {
            listD2 = z1.d(secondUnchecked);
        }
        long[] uLongArray2 = UCollectionsKt.toULongArray(listD2);
        int iV3 = z1.v(uLongArray);
        int iV4 = z1.v(uLongArray2);
        Pair pair = iV3 > iV4 ? new Pair(z1.d(uLongArray), z1.d(x0(uLongArray2, iV3 - iV4, 0L))) : iV3 < iV4 ? new Pair(z1.d(x0(uLongArray, iV4 - iV3, 0L)), z1.d(uLongArray2)) : new Pair(z1.d(uLongArray), z1.d(uLongArray2));
        long[] jArrG = ((z1) pair.component1()).G();
        long[] jArrG2 = ((z1) pair.component2()).G();
        int iMax = (Math.max(z1.v(uLongArray), z1.v(uLongArray2)) + 2) / 3;
        boolean z10 = true;
        DefaultConstructorMarker defaultConstructorMarker = null;
        C1897a c1897a = new C1897a(UCollectionsKt.toULongArray(UArraysKt.m1501sliceZRhS8yI(jArrG, r.W1(0, iMax))), z10, defaultConstructorMarker);
        int i12 = iMax * 2;
        C1897a c1897a2 = new C1897a(UCollectionsKt.toULongArray(UArraysKt.m1501sliceZRhS8yI(jArrG, r.W1(iMax, i12))), z10, defaultConstructorMarker);
        int i13 = iMax * 3;
        C1897a c1897a3 = new C1897a(UCollectionsKt.toULongArray(UArraysKt.m1501sliceZRhS8yI(jArrG, r.W1(i12, i13))), z10, defaultConstructorMarker);
        C1897a c1897a4 = new C1897a(UCollectionsKt.toULongArray(UArraysKt.m1501sliceZRhS8yI(jArrG2, r.W1(0, iMax))), z10, defaultConstructorMarker);
        C1897a c1897a5 = new C1897a(UCollectionsKt.toULongArray(UArraysKt.m1501sliceZRhS8yI(jArrG2, r.W1(iMax, i12))), z10, defaultConstructorMarker);
        C1897a c1897a6 = new C1897a(UCollectionsKt.toULongArray(UArraysKt.m1501sliceZRhS8yI(jArrG2, r.W1(i12, i13))), z10, defaultConstructorMarker);
        C1897a c1897aY0 = Y0(c1897a, c1897a3);
        C1897a c1897aY1 = Y0(c1897aY0, c1897a2);
        C1897a c1897aO0 = O0(c1897aY0, c1897a2);
        C1897a c1897aY2 = Y0(c1897aO0, c1897a3);
        C1897a c1897a7 = f274730r;
        C1897a c1897aO1 = O0(u1(c1897aY2, c1897a7), c1897a);
        C1897a c1897aY3 = Y0(c1897a4, c1897a6);
        C1897a c1897aY4 = Y0(c1897aY3, c1897a5);
        C1897a c1897aO2 = O0(c1897aY3, c1897a5);
        C1897a c1897aO3 = O0(u1(Y0(c1897aO2, c1897a6), c1897a7), c1897a4);
        C1897a c1897aU1 = u1(c1897a, c1897a4);
        C1897a c1897aU2 = u1(c1897aY1, c1897aY4);
        C1897a c1897aU3 = u1(c1897aO0, c1897aO2);
        C1897a c1897aU4 = u1(c1897aO1, c1897aO3);
        C1897a c1897aU5 = u1(c1897a3, c1897a6);
        C1897a c1897aQ0 = q0(O0(c1897aU4, c1897aU2), new C1897a(new long[]{3}, z10, defaultConstructorMarker));
        C1897a c1897aL1 = l1(O0(c1897aU2, c1897aU3), 1);
        C1897a c1897aO4 = O0(c1897aU3, c1897aU1);
        C1897a c1897aY5 = Y0(l1(O0(c1897aO4, c1897aQ0), 1), u1(c1897a7, c1897aU5));
        return Y0(Y0(Y0(Y0(c1897aU1, j1(O0(c1897aL1, c1897aY5), iMax * 63)), j1(O0(Y0(c1897aO4, c1897aL1), c1897aU5), iMax * g.f334652s)), j1(c1897aY5, iMax * 189)), j1(c1897aU5, iMax * com.planner5d.library.engine.input.f.b.V1)).f();
    }

    @Override // com.ionspin.kotlin.bignum.integer.c
    @NotNull
    public long[] z(@NotNull long[] first, @NotNull long[] second) {
        Intrinsics.checkNotNullParameter(first, "first");
        Intrinsics.checkNotNullParameter(second, "second");
        return (z1.v(first) > 150 || z1.v(second) > 150) ? u0(first, second) : Z(first, second);
    }

    @NotNull
    public final long[] z0(@NotNull int[] from32Bit) {
        Intrinsics.checkNotNullParameter(from32Bit, "$this$from32Bit");
        return h0(from32Bit);
    }

    @NotNull
    public final long[] z1(@NotNull long[] firstUnchecked, @NotNull long[] secondUnchecked) {
        Intrinsics.checkNotNullParameter(firstUnchecked, "firstUnchecked");
        Intrinsics.checkNotNullParameter(secondUnchecked, "secondUnchecked");
        throw new l0("An operation is not implemented: ");
    }
}
