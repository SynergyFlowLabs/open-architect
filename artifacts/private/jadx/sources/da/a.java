package da;

import androidx.collection.g3;
import androidx.media3.exoplayer.audio.s0;
import androidx.media3.exoplayer.c4;
import com.facebook.appevents.p;
import com.ionspin.kotlin.bignum.integer.e;
import com.ionspin.kotlin.bignum.integer.h;
import com.rabbitmq.client.k0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.UCollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.n1;
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
@SourceDebugExtension({"SMAP\nBigInteger63LinkedListArithmetic.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BigInteger63LinkedListArithmetic.kt\ncom/ionspin/kotlin/bignum/integer/base63/BigInteger63LinkedListArithmetic\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,1397:1\n959#2,7:1398\n378#2,7:1405\n766#2:1413\n857#2,2:1414\n1864#2,3:1416\n1#3:1412\n1174#4,2:1419\n*S KotlinDebug\n*F\n+ 1 BigInteger63LinkedListArithmetic.kt\ncom/ionspin/kotlin/bignum/integer/base63/BigInteger63LinkedListArithmetic\n*L\n144#1:1398,7\n152#1:1405,7\n369#1:1413\n369#1:1414,2\n396#1:1416,3\n1036#1:1419,2\n*E\n"})
public final class a implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f269695a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final List<y1> f269696b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private static final List<y1> f269697c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private static final List<y1> f269698d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private static final List<y1> f269699e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f269700f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f269701g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final long f269702h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final long f269703i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final long f269704j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final long f269705k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f269706l = 120;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f269707m = 15000;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    private static final C1892a f269708n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    private static final List<y1>[] f269709o;

    /* JADX INFO: renamed from: da.a$a, reason: collision with other inner class name */
    public static final class C1892a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final List<y1> f269710a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f269711b;

        public C1892a(@NotNull List<y1> unsignedValue, boolean z10) {
            Intrinsics.checkNotNullParameter(unsignedValue, "unsignedValue");
            this.f269710a = unsignedValue;
            this.f269711b = z10;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ C1892a d(C1892a c1892a, List list, boolean z10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                list = c1892a.f269710a;
            }
            if ((i10 & 2) != 0) {
                z10 = c1892a.f269711b;
            }
            return c1892a.c(list, z10);
        }

        @NotNull
        public final List<y1> a() {
            return this.f269710a;
        }

        public final boolean b() {
            return this.f269711b;
        }

        @NotNull
        public final C1892a c(@NotNull List<y1> unsignedValue, boolean z10) {
            Intrinsics.checkNotNullParameter(unsignedValue, "unsignedValue");
            return new C1892a(unsignedValue, z10);
        }

        public final boolean e() {
            return this.f269711b;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1892a)) {
                return false;
            }
            C1892a c1892a = (C1892a) obj;
            return Intrinsics.areEqual(this.f269710a, c1892a.f269710a) && this.f269711b == c1892a.f269711b;
        }

        @NotNull
        public final List<y1> f() {
            return this.f269710a;
        }

        public int hashCode() {
            return (this.f269710a.hashCode() * 31) + Boolean.hashCode(this.f269711b);
        }

        @NotNull
        public String toString() {
            return "SignedULongArray(unsignedValue=" + this.f269710a + ", sign=" + this.f269711b + ')';
        }
    }

    static {
        a aVar = new a();
        f269695a = aVar;
        f269696b = CollectionsKt.listOf(y1.c(0L));
        f269697c = CollectionsKt.listOf(y1.c(1L));
        f269698d = CollectionsKt.listOf(y1.c(2L));
        f269699e = CollectionsKt.listOf(y1.c(10L));
        f269700f = 63;
        f269701g = 63;
        f269702h = Long.MAX_VALUE;
        f269703i = k0.f265952a;
        f269704j = 9223372032559808512L;
        f269705k = Long.MIN_VALUE;
        f269708n = new C1892a(aVar.p(), true);
        f269709o = new List[]{CollectionsKt.listOf(y1.c(1L)), CollectionsKt.listOf(y1.c(10L)), CollectionsKt.listOf(y1.c(100L)), CollectionsKt.listOf(y1.c(1000L)), CollectionsKt.listOf(y1.c(10000L)), CollectionsKt.listOf(y1.c(s0.f63372z)), CollectionsKt.listOf(y1.c(1000000L)), CollectionsKt.listOf(y1.c(10000000L)), CollectionsKt.listOf(y1.c(100000000L)), CollectionsKt.listOf(y1.c(1000000000L)), CollectionsKt.listOf(y1.c(f.f334128w)), CollectionsKt.listOf(y1.c(100000000000L)), CollectionsKt.listOf(y1.c(c4.f63520s)), CollectionsKt.listOf(y1.c(10000000000000L)), CollectionsKt.listOf(y1.c(100000000000000L)), CollectionsKt.listOf(y1.c(1000000000000000L)), CollectionsKt.listOf(y1.c(10000000000000000L)), CollectionsKt.listOf(y1.c(100000000000000000L)), CollectionsKt.listOf(y1.c(1000000000000000000L)), CollectionsKt.listOf((Object[]) new y1[]{y1.c(776627963145224192L), y1.c(1L)}), CollectionsKt.listOf((Object[]) new y1[]{y1.c(7766279631452241920L), y1.c(10L)}), CollectionsKt.listOf((Object[]) new y1[]{y1.c(3875820019684212736L), y1.c(108L)}), CollectionsKt.listOf((Object[]) new y1[]{y1.c(1864712049423024128L), y1.c(1084L)}), CollectionsKt.listOf((Object[]) new y1[]{y1.c(200376420520689664L), y1.c(10842L)}), CollectionsKt.listOf((Object[]) new y1[]{y1.c(2003764205206896640L), y1.c(108420L)}), CollectionsKt.listOf((Object[]) new y1[]{y1.c(1590897978359414784L), y1.c(1084202L)}), CollectionsKt.listOf((Object[]) new y1[]{y1.c(6685607746739372032L), y1.c(10842021L)}), CollectionsKt.listOf((Object[]) new y1[]{y1.c(2292473209410289664L), y1.c(108420217L)}), CollectionsKt.listOf((Object[]) new y1[]{y1.c(4477988020393345024L), y1.c(1084202172L)}), CollectionsKt.listOf((Object[]) new y1[]{y1.c(7886392056514347008L), y1.c(10842021724L)}), CollectionsKt.listOf((Object[]) new y1[]{y1.c(5076944270305263616L), y1.c(108420217248L)}), CollectionsKt.listOf((Object[]) new y1[]{y1.c(4652582518778757120L), y1.c(1084202172485L)}), CollectionsKt.listOf((Object[]) new y1[]{y1.c(408965003513692160L), y1.c(10842021724855L)}), CollectionsKt.listOf((Object[]) new y1[]{y1.c(4089650035136921600L), y1.c(108420217248550L)}), CollectionsKt.listOf((Object[]) new y1[]{y1.c(4003012203950112768L), y1.c(1084202172485504L)}), CollectionsKt.listOf((Object[]) new y1[]{y1.c(3136633892082024448L), y1.c(10842021724855044L)}), CollectionsKt.listOf((Object[]) new y1[]{y1.c(3696222810255917056L), y1.c(108420217248550443L)}), CollectionsKt.listOf((Object[]) new y1[]{y1.c(68739955140067328L), y1.c(1084202172485504434L)}), CollectionsKt.listOf((Object[]) new y1[]{y1.c(687399551400673280L), y1.c(1618649688000268532L), y1.c(1L)}), CollectionsKt.listOf((Object[]) new y1[]{y1.c(6873995514006732800L), y1.c(6963124843147909512L), y1.c(11L)}), CollectionsKt.listOf((Object[]) new y1[]{y1.c(4176350882083897344L), y1.c(5067644173495664471L), y1.c(117L)}), CollectionsKt.listOf((Object[]) new y1[]{y1.c(4870020673419870208L), y1.c(4559581550682765674L), y1.c(1175L)}), CollectionsKt.listOf((Object[]) new y1[]{y1.c(2583346549924823040L), y1.c(8702327359408553513L), y1.c(11754L)}), CollectionsKt.listOf((Object[]) new y1[]{y1.c(7386721425538678784L), y1.c(4012925262392552860L), y1.c(117549L)}), CollectionsKt.listOf((Object[]) new y1[]{y1.c(80237960548581376L), y1.c(3235764476506425376L), y1.c(1175494L)}), CollectionsKt.listOf((Object[]) new y1[]{y1.c(802379605485813760L), y1.c(4687528654499926336L), y1.c(11754943L)}), CollectionsKt.listOf((Object[]) new y1[]{y1.c(8023796054858137600L), y1.c(758426360725384320L), y1.c(117549435L)}), CollectionsKt.listOf((Object[]) new y1[]{y1.c(6450984253743169536L), y1.c(7584263607253843208L), y1.c(1175494350L)}), CollectionsKt.listOf((Object[]) new y1[]{y1.c(9169610316303040512L), y1.c(2055659777700225622L), y1.c(11754943508L)}), CollectionsKt.listOf((Object[]) new y1[]{y1.c(8685754831337422848L), y1.c(2109853703292704613L), y1.c(117549435082L)}), CollectionsKt.listOf((Object[]) new y1[]{y1.c(3847199981681246208L), y1.c(2651792959217494523L), y1.c(1175494350822L)}), CollectionsKt.listOf((Object[]) new y1[]{y1.c(1578511669393358848L), y1.c(8071185518465393618L), y1.c(11754943508222L)}), CollectionsKt.listOf((Object[]) new y1[]{y1.c(6561744657078812672L), y1.c(6924878889815729717L), y1.c(117549435082228L)}), CollectionsKt.listOf((Object[]) new y1[]{y1.c(1053842312804696064L), y1.c(4685184640173866521L), y1.c(1175494350822287L)}), CollectionsKt.listOf((Object[]) new y1[]{y1.c(1315051091192184832L), y1.c(734986217464786171L), y1.c(11754943508222875L)}), CollectionsKt.listOf((Object[]) new y1[]{y1.c(3927138875067072512L), y1.c(7349862174647861711L), y1.c(117549435082228750L)}), CollectionsKt.listOf((Object[]) new y1[]{y1.c(2377900603251621888L), y1.c(8935017488495186458L), y1.c(1175494350822287507L)}), CollectionsKt.listOf((Object[]) new y1[]{y1.c(5332261958806667264L), y1.c(6339826553258882310L), y1.c(2531571471368099271L), y1.c(1L)}), CollectionsKt.listOf((Object[]) new y1[]{y1.c(7205759403792793600L), y1.c(8058033311460168257L), y1.c(6868970639971441100L), y1.c(12L)}), CollectionsKt.listOf((Object[]) new y1[]{y1.c(7493989779944505344L), y1.c(6793356819763476113L), y1.c(4126102141730980352L), y1.c(127L)}), CollectionsKt.listOf((Object[]) new y1[]{y1.c(1152921504606846976L), y1.c(3369963939651330482L), y1.c(4367533269890700295L), y1.c(1274L)}), CollectionsKt.listOf((Object[]) new y1[]{y1.c(h0.f315065r), y1.c(6029523285948977397L), y1.c(6781844551487899721L), y1.c(12744L)}), CollectionsKt.listOf((Object[]) new y1[]{y1.c(4611686018427387904L), y1.c(4955000638361119124L), y1.c(3254841256895566560L), y1.c(127447L)}), CollectionsKt.listOf((Object[]) new y1[]{y1.c(0L), y1.c(3433146199337312205L), y1.c(4878296458391338181L), y1.c(1274473L)}), CollectionsKt.listOf((Object[]) new y1[]{y1.c(0L), y1.c(6661345882808794626L), y1.c(2666104399639502773L), y1.c(12744735L)}), CollectionsKt.listOf((Object[]) new y1[]{y1.c(0L), y1.c(2049854570104515604L), y1.c(8214299922685476121L), y1.c(127447352L)}), CollectionsKt.listOf((Object[]) new y1[]{y1.c(0L), y1.c(2051801627335604424L), y1.c(8356022932016554748L), y1.c(1274473528L)}), CollectionsKt.listOf((Object[]) new y1[]{y1.c(0L), y1.c(2071272199646492624L), y1.c(549880988472565210L), y1.c(12744735289L)}), CollectionsKt.listOf((Object[]) new y1[]{y1.c(0L), y1.c(2265977922755374624L), y1.c(5498809884725652102L), y1.c(127447352890L)}), CollectionsKt.listOf((Object[]) new y1[]{y1.c(0L), y1.c(4213035153844194624L), y1.c(8871238662982641982L), y1.c(1274473528905L)}), CollectionsKt.listOf((Object[]) new y1[]{y1.c(0L), y1.c(5236863391022843008L), y1.c(5702038298133437552L), y1.c(12744735289059L)}), CollectionsKt.listOf((Object[]) new y1[]{y1.c(0L), y1.c(6251773725954551040L), y1.c(1680150760205720677L), y1.c(127447352890596L)}), CollectionsKt.listOf((Object[]) new y1[]{y1.c(0L), y1.c(7177505038416855552L), y1.c(7578135565202430968L), y1.c(1274473528905961L)}), CollectionsKt.listOf((Object[]) new y1[]{y1.c(0L), y1.c(7211446126185124864L), y1.c(1994379357186103223L), y1.c(12744735289059618L)}), CollectionsKt.listOf((Object[]) new y1[]{y1.c(0L), y1.c(7550857003867817984L), y1.c(1497049498151480621L), y1.c(127447352890596182L)}), CollectionsKt.listOf((Object[]) new y1[]{y1.c(0L), y1.c(1721593743839973376L), y1.c(5747122944660030410L), y1.c(1274473528905961821L)}), CollectionsKt.listOf((Object[]) new y1[]{y1.c(0L), y1.c(7992565401544957952L), y1.c(2130997225471649253L), y1.c(3521363252204842408L), y1.c(1L)}), CollectionsKt.listOf((Object[]) new y1[]{y1.c(0L), y1.c(6138677720611373056L), y1.c(2863228181006940922L), y1.c(7543516411484096658L), y1.c(13L)}), CollectionsKt.listOf((Object[]) new y1[]{y1.c(0L), y1.c(6046544984985075712L), y1.c(962165699505081802L), y1.c(1648187820002760119L), y1.c(138L)}), CollectionsKt.listOf((Object[]) new y1[]{y1.c(0L), y1.c(5125217628722102272L), y1.c(398284958196042218L), y1.c(7258506163172825383L), y1.c(1381L)}), CollectionsKt.listOf((Object[]) new y1[]{y1.c(0L), y1.c(5135316102947143680L), y1.c(3982849581960422185L), y1.c(8021457373744823174L), y1.c(13817L)}), CollectionsKt.listOf((Object[]) new y1[]{y1.c(0L), y1.c(5236300845197557760L), y1.c(2935007672185118623L), y1.c(6427597442610025280L), y1.c(138178L)}), CollectionsKt.listOf((Object[]) new y1[]{y1.c(0L), y1.c(6246148267701698560L), y1.c(1679960611286858811L), y1.c(8935742204971597955L), y1.c(1381786L)}), CollectionsKt.listOf((Object[]) new y1[]{y1.c(0L), y1.c(7121250455888330752L), y1.c(7576234076013812308L), y1.c(6347073718022997279L), y1.c(13817869L)}), CollectionsKt.listOf((Object[]) new y1[]{y1.c(0L), y1.c(6648900300899876864L), y1.c(1975364465299916623L), y1.c(8130504959101317950L), y1.c(138178696L)}), CollectionsKt.listOf((Object[]) new y1[]{y1.c(0L), y1.c(1925398751015337984L), y1.c(1306900579289614621L), y1.c(7518073296174973038L), y1.c(1381786968L)}), CollectionsKt.listOf((Object[]) new y1[]{y1.c(0L), y1.c(807243436443828224L), y1.c(3845633756041370404L), y1.c(1393756666911523917L), y1.c(13817869688L)}), CollectionsKt.listOf((Object[]) new y1[]{y1.c(0L), y1.c(8072434364438282240L), y1.c(1562849412994600808L), y1.c(4714194632260463366L), y1.c(138178696881L)}), CollectionsKt.listOf((Object[]) new y1[]{y1.c(0L), y1.c(6937367349544615936L), y1.c(6405122093091232280L), y1.c(1025086138330754621L), y1.c(1381786968815L)}), CollectionsKt.listOf((Object[]) new y1[]{y1.c(0L), y1.c(4810069237462728704L), y1.c(8710988709783667959L), y1.c(1027489346452770408L), y1.c(13817869688151L)}), CollectionsKt.listOf((Object[]) new y1[]{y1.c(0L), y1.c(1983832190353408000L), y1.c(4099538766143697323L), y1.c(1051521427672928281L), y1.c(138178696881511L)}), CollectionsKt.listOf((Object[]) new y1[]{y1.c(0L), y1.c(1391577829824528384L), y1.c(4101899514017870000L), y1.c(1291842239874507006L), y1.c(1381786968815111L)}), CollectionsKt.listOf((Object[]) new y1[]{y1.c(0L), y1.c(4692406261390508032L), y1.c(4125506992759596769L), y1.c(3695050361890294256L), y1.c(13817869688151111L)}), CollectionsKt.listOf((Object[]) new y1[]{y1.c(0L), y1.c(807202429631201280L), y1.c(4361581780176864463L), y1.c(57015471483839332L), y1.c(138178696881511114L)}), CollectionsKt.listOf((Object[]) new y1[]{y1.c(0L), y1.c(8072024296312012800L), y1.c(6722329654349541398L), y1.c(570154714838393324L), y1.c(1381786968815111140L)}), CollectionsKt.listOf((Object[]) new y1[]{y1.c(0L), y1.c(6933266668281921536L), y1.c(2659692285511983332L), y1.c(5701547148383933247L), y1.c(4594497651296335592L), y1.c(1L)}), CollectionsKt.listOf((Object[]) new y1[]{y1.c(0L), y1.c(4769062424835784704L), y1.c(8150178781410281711L), y1.c(1675239262710677624L), y1.c(9051488365544252694L), y1.c(14L)}), CollectionsKt.listOf((Object[]) new y1[]{y1.c(0L), y1.c(1573764064083968000L), y1.c(7714811519264610651L), y1.c(7529020590252000440L), y1.c(7504535323749544669L), y1.c(149L)}), CollectionsKt.listOf((Object[]) new y1[]{y1.c(0L), y1.c(6514268603984904192L), y1.c(3361138897807900047L), y1.c(1503229607681797944L), y1.c(1258376942657240234L), y1.c(1498L)}), CollectionsKt.listOf((Object[]) new y1[]{y1.c(0L), y1.c(579081781865611264L), y1.c(5941272867514673053L), y1.c(5808924039963203635L), y1.c(3360397389717626533L), y1.c(14981L)}), CollectionsKt.listOf((Object[]) new y1[]{y1.c(0L), y1.c(5790817818656112640L), y1.c(4072496454018075682L), y1.c(2749008178503381508L), y1.c(5933857786611937912L), y1.c(149813L)})};
    }

    private a() {
    }

    private final Pair<List<y1>, List<y1>> G0(List<y1> list) {
        int size = list.size();
        int iFloor = (int) Math.floor(((double) (size - 1)) / ((double) 4));
        if (iFloor == 0) {
            return R(list);
        }
        int i10 = size / 4;
        int i11 = size % 4;
        int i12 = iFloor * 63;
        int i13 = size - ((i10 * 3) + i11);
        int i14 = size - ((i10 * 2) + i11);
        List<y1> listSubList = list.subList(i13, i14);
        List<y1> listSubList2 = list.subList(0, i13);
        Pair<List<y1>, List<y1>> pairG0 = G0(list.subList(i14, size));
        List<y1> listComponent1 = pairG0.component1();
        Pair<List<y1>, List<y1>> pairE0 = e0(z0(I0(pairG0.component2(), i12), listSubList), I0(listComponent1, 1));
        List<y1> listComponent2 = pairE0.component1();
        return new Pair<>(z0(I0(listComponent1, i12), listComponent2), r0(z0(I0(pairE0.component2(), i12), listSubList2), S0(listComponent2, listComponent2)));
    }

    private final C1892a L0(C1892a c1892a, C1892a c1892a2) {
        if (c1892a.e() ^ c1892a2.e()) {
            return U(c1892a.f(), c1892a2.f()) > 0 ? new C1892a(r0(c1892a.f(), c1892a2.f()), c1892a.e()) : new C1892a(r0(c1892a2.f(), c1892a.f()), c1892a2.e());
        }
        return new C1892a(z0(c1892a.f(), c1892a2.f()), c1892a.e());
    }

    private final C1892a M0(C1892a c1892a, C1892a c1892a2) {
        return new C1892a(c0(c1892a.f(), c1892a2.f()), !(c1892a.e() ^ c1892a2.e()));
    }

    private final C1892a N0(C1892a c1892a, C1892a c1892a2) {
        return new C1892a(S0(c1892a.f(), c1892a2.f()), !(c1892a.e() ^ c1892a2.e()));
    }

    private final C1892a O0(C1892a c1892a, C1892a c1892a2) {
        return new C1892a(D0(c1892a.f(), c1892a2.f()), !(c1892a.e() ^ c1892a2.e()));
    }

    private final C1892a P0(C1892a c1892a, C1892a c1892a2) {
        return L0(c1892a, C1892a.d(c1892a2, null, !c1892a2.e(), 1, null));
    }

    private final List<y1> S(List<y1> list, List<y1> list2) {
        while (!Intrinsics.areEqual(list, list2)) {
            if (Intrinsics.areEqual(list, h())) {
                return list2;
            }
            if (Intrinsics.areEqual(list2, h())) {
                break;
            }
            if (Intrinsics.areEqual(x(list, k()), h())) {
                if (Intrinsics.areEqual(x(list2, k()), h())) {
                    return I0(S(K0(list, 1), K0(list2, 1)), 1);
                }
                list = K0(list, 1);
            } else if (Intrinsics.areEqual(x(list2, k()), h())) {
                list2 = K0(list2, 1);
            } else if (u(list, list2) == 1) {
                list = K0(F(list, list2), 1);
            } else {
                List<y1> listK0 = K0(F(list2, list), 1);
                list2 = list;
                list = listK0;
            }
        }
        return list;
    }

    private final List<y1> f0(List<y1> list, List<y1> list2) {
        while (true) {
            List<y1> list3 = list2;
            List<y1> list4 = list;
            list = list3;
            if (Intrinsics.areEqual(list, h())) {
                return list4;
            }
            list2 = D0(list4, list);
        }
    }

    @Override // com.ionspin.kotlin.bignum.integer.e
    @NotNull
    public byte[] A(@NotNull List<y1> operand) {
        Intrinsics.checkNotNullParameter(operand, "operand");
        return ea.a.f274713a.k(UCollectionsKt.toULongArray(operand));
    }

    @NotNull
    public final List<y1> A0(@NotNull List<y1> plus, long j10) {
        Intrinsics.checkNotNullParameter(plus, "$this$plus");
        return w(plus, CollectionsKt.listOf(y1.c(j10)));
    }

    @Override // com.ionspin.kotlin.bignum.integer.e
    @NotNull
    public List<y1> B(@NotNull List<y1> first, @NotNull List<y1> second) {
        Intrinsics.checkNotNullParameter(first, "first");
        Intrinsics.checkNotNullParameter(second, "second");
        return (first.size() > 150 || second.size() > 150) ? f0(first, second) : S(first, second);
    }

    @NotNull
    public final List<y1> B0(@NotNull List<y1> original, int i10, long j10) {
        Intrinsics.checkNotNullParameter(original, "original");
        int size = original.size() + i10;
        ArrayList arrayList = new ArrayList(size);
        int i11 = 0;
        while (i11 < size) {
            arrayList.add(y1.c(i11 < i10 ? j10 : original.get(i11 - i10).z0()));
            i11++;
        }
        return arrayList;
    }

    @Override // com.ionspin.kotlin.bignum.integer.e
    @NotNull
    public List<y1> C(@NotNull List<y1> operand) {
        Intrinsics.checkNotNullParameter(operand, "operand");
        int iE = e(operand.get(operand.size() - 1).z0());
        long jN = y1.n(~y1.n(y1.n(y1.n(1 << (iE + 1)) - y1.n(1L)) << (a() - iE)));
        int size = operand.size();
        ArrayList arrayList = new ArrayList(size);
        int i10 = 0;
        while (i10 < size) {
            arrayList.add(y1.c(i10 < operand.size() + (-2) ? y1.n(y1.n(~operand.get(i10).z0()) & f269702h) : y1.n(y1.n(~operand.get(i10).z0()) & jN)));
            i10++;
        }
        return arrayList;
    }

    @NotNull
    public final C1892a C0(@NotNull C1892a c1892a, @NotNull C1892a other) {
        Intrinsics.checkNotNullParameter(c1892a, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        return O0(c1892a, other);
    }

    @Override // com.ionspin.kotlin.bignum.integer.e
    @NotNull
    public List<y1> D(@NotNull List<y1> base, long j10) {
        Intrinsics.checkNotNullParameter(base, "base");
        if (j10 == 0) {
            return k();
        }
        if (j10 == 1) {
            return base;
        }
        if (base.size() == 1 && base.get(0).z0() == 10) {
            List<y1>[] listArr = f269709o;
            if (j10 < listArr.length) {
                return listArr[(int) j10];
            }
        }
        List<y1> listK = k();
        while (j10 > 1) {
            long j11 = 2;
            if (j10 % j11 == 0) {
                base = S0(base, base);
                j10 /= j11;
            } else {
                listK = S0(base, listK);
                base = S0(base, base);
                j10 = (j10 - 1) / j11;
            }
        }
        return S0(listK, base);
    }

    @NotNull
    public final List<y1> D0(@NotNull List<y1> list, @NotNull List<y1> other) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        return P(list, other).getSecond();
    }

    @Override // com.ionspin.kotlin.bignum.integer.e
    @NotNull
    public List<y1> E(@NotNull List<y1> operand, int i10) {
        long jN;
        Intrinsics.checkNotNullParameter(operand, "operand");
        if (Intrinsics.areEqual(operand, h()) || operand.isEmpty() || i10 == 0) {
            return operand;
        }
        int size = operand.size();
        int iE = e(operand.get(operand.size() - 1).z0());
        int iA = i10 / a();
        int iA2 = i10 % a();
        int i11 = iA2 > iE ? iA + 1 : iA;
        int i12 = 0;
        if (iA2 == 0) {
            int size2 = operand.size() + i11;
            ArrayList arrayList = new ArrayList(size2);
            while (i12 < size2) {
                arrayList.add(y1.c((i12 < 0 || i12 >= iA) ? operand.get(i12 - iA).z0() : 0L));
                i12++;
            }
            return arrayList;
        }
        int size3 = operand.size() + i11;
        ArrayList arrayList2 = new ArrayList(size3);
        while (i12 < size3) {
            if (i12 >= 0 && i12 < iA) {
                jN = 0;
            } else if (i12 == iA) {
                jN = y1.n(y1.n(operand.get(i12 - iA).z0() << iA2) & f269702h);
            } else {
                int i13 = iA + 1;
                if (i12 < size + iA && i13 <= i12) {
                    int i14 = i12 - iA;
                    jN = y1.n(y1.n(y1.n(operand.get(i14).z0() << iA2) & f269702h) | y1.n(operand.get(i14 - 1).z0() >>> (f269695a.a() - iA2)));
                } else {
                    if (i12 != (size + i11) - 1) {
                        throw new RuntimeException("Invalid case " + i12);
                    }
                    jN = y1.n(operand.get(i12 - i11).z0() >>> (f269695a.a() - iA2));
                }
            }
            arrayList2.add(y1.c(jN));
            i12++;
        }
        return arrayList2;
    }

    @NotNull
    public final List<y1> E0(@NotNull List<y1> rem, long j10) {
        Intrinsics.checkNotNullParameter(rem, "$this$rem");
        return P(rem, CollectionsKt.listOf(y1.c(j10))).getSecond();
    }

    @Override // com.ionspin.kotlin.bignum.integer.e
    @NotNull
    public List<y1> F(@NotNull List<y1> first, @NotNull List<y1> second) {
        Intrinsics.checkNotNullParameter(first, "first");
        Intrinsics.checkNotNullParameter(second, "second");
        List<y1> listF0 = F0(first);
        List<y1> listF1 = F0(second);
        int iU = u(listF0, listF1);
        boolean z10 = iU == 1;
        if (iU == 0) {
            return h();
        }
        if (second.size() == 1 && second.get(0).z0() == 0) {
            return first;
        }
        if (!z10) {
            throw new RuntimeException("subtract result less than zero");
        }
        h hVar = z10 ? new h(Integer.valueOf(listF0.size()), Integer.valueOf(listF1.size()), listF0, listF1) : new h(Integer.valueOf(listF1.size()), Integer.valueOf(listF0.size()), listF1, listF0);
        int iIntValue = ((Number) hVar.a()).intValue();
        int iIntValue2 = ((Number) hVar.b()).intValue();
        List list = (List) hVar.c();
        List list2 = (List) hVar.d();
        int i10 = iIntValue + 1;
        ArrayList arrayList = new ArrayList(i10);
        for (int i11 = 0; i11 < i10; i11++) {
            arrayList.add(y1.c(0L));
        }
        int i12 = 0;
        long jN = 0;
        while (i12 < iIntValue2) {
            long jN2 = y1.n(y1.n(((y1) list.get(i12)).z0() - ((y1) list2.get(i12)).z0()) - jN);
            if (y1.n(y1.n(f269705k & jN2) >>> 63) == 1) {
                arrayList.set(i12, y1.c(y1.n(f269702h & jN2)));
            } else {
                arrayList.set(i12, y1.c(y1.n(f269702h & jN2)));
            }
            jN = y1.n(jN2 >>> 63);
            i12++;
        }
        while (jN != 0) {
            long jN3 = y1.n(((y1) list.get(i12)).z0() - jN);
            if (y1.n(y1.n(f269705k & jN3) >>> 63) == 1) {
                arrayList.set(i12, y1.c(y1.n(f269702h & jN3)));
            } else {
                arrayList.set(i12, y1.c(y1.n(jN3 & f269702h)));
                jN3 = 0;
            }
            jN = y1.n(jN3 >>> 63);
            i12++;
        }
        while (i12 < iIntValue) {
            arrayList.set(i12, list.get(i12));
            i12++;
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (((y1) obj).z0() == 0) {
                arrayList2.add(obj);
            }
        }
        return arrayList2.isEmpty() ? new ArrayList(0) : F0(arrayList);
    }

    @NotNull
    public final List<y1> F0(@NotNull List<y1> bigInteger) {
        int iNextIndex;
        Intrinsics.checkNotNullParameter(bigInteger, "bigInteger");
        ListIterator<y1> listIterator = bigInteger.listIterator(bigInteger.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                iNextIndex = -1;
                break;
            }
            if (listIterator.previous().z0() != 0) {
                iNextIndex = listIterator.nextIndex();
                break;
            }
        }
        int i10 = iNextIndex + 1;
        return (i10 == -1 || i10 == 0) ? h() : bigInteger.subList(0, i10);
    }

    @Override // com.ionspin.kotlin.bignum.integer.e
    @NotNull
    public Pair<List<y1>, List<y1>> G(@NotNull List<y1> operand) {
        Intrinsics.checkNotNullParameter(operand, "operand");
        return G0(operand);
    }

    @Override // com.ionspin.kotlin.bignum.integer.e
    @NotNull
    public List<y1> H(@NotNull List<y1> operand, @NotNull List<y1> mask) {
        Intrinsics.checkNotNullParameter(operand, "operand");
        Intrinsics.checkNotNullParameter(mask, "mask");
        int size = operand.size();
        ArrayList arrayList = new ArrayList(size);
        int i10 = 0;
        while (i10 < size) {
            arrayList.add(y1.c(i10 < mask.size() ? y1.n(operand.get(i10).z0() | mask.get(i10).z0()) : operand.get(i10).z0()));
            i10++;
        }
        return F0(arrayList);
    }

    @NotNull
    public final C1892a H0(@NotNull C1892a c1892a, int i10) {
        Intrinsics.checkNotNullParameter(c1892a, "<this>");
        return new C1892a(I0(c1892a.f(), i10), c1892a.e());
    }

    @Override // com.ionspin.kotlin.bignum.integer.e
    @NotNull
    public List<y1> I(@NotNull String number, int i10) {
        Intrinsics.checkNotNullParameter(number, "number");
        List<y1> listH = h();
        String lowerCase = number.toLowerCase();
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        for (int i11 = 0; i11 < lowerCase.length(); i11++) {
            char cCharAt = lowerCase.charAt(i11);
            a aVar = f269695a;
            listH = aVar.A0(aVar.T0(listH, y1.n(i10)), y1.n(com.ionspin.kotlin.bignum.integer.util.b.a(cCharAt, i10)));
        }
        return F0(listH);
    }

    @NotNull
    public final List<y1> I0(@NotNull List<y1> list, int i10) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        return E(list, i10);
    }

    @Override // com.ionspin.kotlin.bignum.integer.e
    @NotNull
    public List<y1> J(@NotNull List<y1> operand, int i10) {
        long jN;
        Intrinsics.checkNotNullParameter(operand, "operand");
        if (operand.isEmpty() || i10 == 0) {
            return operand;
        }
        int iA = i10 % a();
        int iA2 = i10 / a();
        if (iA2 >= operand.size()) {
            return h();
        }
        if (iA == 0) {
            operand.subList(operand.size() - iA2, operand.size());
        }
        if (operand.size() > 1 && operand.size() - iA2 == 1) {
            return CollectionsKt.listOf(y1.c(y1.n(operand.get(operand.size() - 1).z0() >>> iA)));
        }
        int size = operand.size() - iA2;
        ArrayList arrayList = new ArrayList(size);
        for (int i11 = 0; i11 < size; i11++) {
            if (i11 >= 0 && i11 < (operand.size() - 1) - iA2) {
                int i12 = i11 + iA2;
                jN = y1.n(y1.n(operand.get(i12).z0() >>> iA) | y1.n(y1.n(operand.get(i12 + 1).z0() << (f269695a.a() - iA)) & f269702h));
            } else {
                if (i11 != (operand.size() - 1) - iA2) {
                    throw new RuntimeException("Invalid case " + i11);
                }
                jN = y1.n(operand.get(i11 + iA2).z0() >>> iA);
            }
            arrayList.add(y1.c(jN));
        }
        return F0(arrayList);
    }

    @NotNull
    public final C1892a J0(@NotNull C1892a c1892a, int i10) {
        Intrinsics.checkNotNullParameter(c1892a, "<this>");
        return new C1892a(K0(c1892a.f(), i10), c1892a.e());
    }

    @Override // com.ionspin.kotlin.bignum.integer.e
    @NotNull
    public Pair<List<y1>, List<y1>> K(@NotNull List<y1> operand) {
        Intrinsics.checkNotNullParameter(operand, "operand");
        return Z(operand);
    }

    @NotNull
    public final List<y1> K0(@NotNull List<y1> list, int i10) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        return J(list, i10);
    }

    @Override // com.ionspin.kotlin.bignum.integer.e
    @NotNull
    public List<y1> L(@NotNull List<y1> operand, @NotNull List<y1> mask) {
        Intrinsics.checkNotNullParameter(operand, "operand");
        Intrinsics.checkNotNullParameter(mask, "mask");
        int size = operand.size();
        ArrayList arrayList = new ArrayList(size);
        int i10 = 0;
        while (i10 < size) {
            arrayList.add(y1.c(i10 < mask.size() ? y1.n(operand.get(i10).z0() ^ mask.get(i10).z0()) : y1.n(operand.get(i10).z0())));
            i10++;
        }
        return F0(arrayList);
    }

    @Override // com.ionspin.kotlin.bignum.integer.e
    @NotNull
    public byte[] M(@NotNull List<y1> operand) {
        Intrinsics.checkNotNullParameter(operand, "operand");
        return ea.a.f274713a.p(UCollectionsKt.toULongArray(operand));
    }

    @Override // com.ionspin.kotlin.bignum.integer.e
    @NotNull
    public String N(@NotNull List<y1> operand, int i10) {
        Intrinsics.checkNotNullParameter(operand, "operand");
        if (Intrinsics.areEqual(operand, h())) {
            return p.f99189d0;
        }
        List<y1> listListOf = CollectionsKt.listOf(y1.c(y1.n(i10)));
        StringBuilder sb2 = new StringBuilder();
        while (!Intrinsics.areEqual(operand, h())) {
            Pair<List<y1>, List<y1>> pairE0 = e0(operand, listListOf);
            if (pairE0.getSecond().isEmpty()) {
                sb2.append(0);
            } else {
                sb2.append(d0.a(pairE0.getSecond().get(0).z0(), i10));
            }
            operand = pairE0.getFirst();
        }
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return StringsKt.z8(string).toString();
    }

    @NotNull
    public final C1892a O(@NotNull C1892a c1892a, @NotNull List<y1> operand) {
        Intrinsics.checkNotNullParameter(c1892a, "<this>");
        Intrinsics.checkNotNullParameter(operand, "operand");
        return new C1892a(x(c1892a.f(), operand), c1892a.e());
    }

    @NotNull
    public final Pair<List<y1>, List<y1>> P(@NotNull List<y1> unnormalizedDividend, @NotNull List<y1> unnormalizedDivisor) {
        List<y1> mutableList;
        Intrinsics.checkNotNullParameter(unnormalizedDividend, "unnormalizedDividend");
        Intrinsics.checkNotNullParameter(unnormalizedDivisor, "unnormalizedDivisor");
        if (U(unnormalizedDivisor, unnormalizedDividend) > 0) {
            return new Pair<>(h(), unnormalizedDividend);
        }
        boolean z10 = true;
        if (unnormalizedDivisor.size() == 1 && unnormalizedDividend.size() == 1) {
            return new Pair<>(F0(CollectionsKt.listOf(y1.c(Long.divideUnsigned(unnormalizedDividend.get(0).z0(), unnormalizedDivisor.get(0).z0())))), F0(CollectionsKt.listOf(y1.c(Long.remainderUnsigned(unnormalizedDividend.get(0).z0(), unnormalizedDivisor.get(0).z0())))));
        }
        if (z(unnormalizedDividend) - z(unnormalizedDivisor) == 0) {
            return new Pair<>(k(), r0(unnormalizedDividend, unnormalizedDivisor));
        }
        n1<List<y1>, List<y1>, Integer> n1VarW0 = w0(unnormalizedDividend, unnormalizedDivisor);
        List<y1> listA = n1VarW0.a();
        List<y1> listB = n1VarW0.b();
        int iIntValue = n1VarW0.c().intValue();
        int size = listA.size();
        int size2 = listB.size();
        int i10 = size - size2;
        ArrayList arrayList = new ArrayList(i10);
        for (int i11 = 0; i11 < i10; i11++) {
            arrayList.add(y1.c(0L));
        }
        List<y1> listI0 = I0(listB, a() * i10);
        if (U(listA, listI0) >= 0) {
            int i12 = i10 + 1;
            ArrayList arrayList2 = new ArrayList(i12);
            int i13 = 0;
            while (i13 < i12) {
                arrayList2.add(y1.c(0L));
                i13++;
                z10 = z10;
            }
            arrayList2.set(i10, y1.c(1L));
            listA = r0(listA, listI0);
            mutableList = arrayList2;
        } else {
            mutableList = arrayList;
        }
        while (true) {
            i10--;
            if (-1 >= i10) {
                break;
            }
            int i14 = size2 + i10;
            List<y1> listH0 = h0(com.ionspin.kotlin.bignum.integer.base32.a.f131082a.C(U0(i14 < listA.size() ? A0(I0(CollectionsKt.listOf(listA.get(i14)), a()), listA.get(i14 - 1).z0()) : i14 == listA.size() ? CollectionsKt.listOf(listA.get(i14 - 1)) : h()), U0(CollectionsKt.listOf(listB.get(size2 - 1)))).getFirst().G());
            long jZ0 = f269702h;
            if (V(listH0, y1.n(jZ0 - 1)) < 0) {
                jZ0 = listH0.get(0).z0();
            }
            mutableList.set(i10, y1.c(jZ0));
            List<y1> listI1 = I0(T0(listB, mutableList.get(i10).z0()), a() * i10);
            while (U(listI1, listA) > 0) {
                mutableList.set(i10, y1.c(y1.n(mutableList.get(i10).z0() - y1.n(1L))));
                listI1 = I0(T0(listB, mutableList.get(i10).z0()), a() * i10);
            }
            listA = r0(listA, listI1);
        }
        while (U(listA, listB) >= 0) {
            mutableList = CollectionsKt.toMutableList((Collection) A0(mutableList, 1L));
            listA = r0(listA, listB);
        }
        return new Pair<>(F0(mutableList), a0(listA, iIntValue));
    }

    @NotNull
    public final List<y1> Q(@NotNull List<y1> first, @NotNull List<y1> second) {
        Intrinsics.checkNotNullParameter(first, "first");
        Intrinsics.checkNotNullParameter(second, "second");
        List<y1> listEmptyList = CollectionsKt.emptyList();
        int i10 = 0;
        for (Object obj : second) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            long jZ0 = ((y1) obj).z0();
            a aVar = f269695a;
            listEmptyList = aVar.z0(listEmptyList, aVar.I0(aVar.t0(first, jZ0), i10 * aVar.a()));
            i10 = i11;
        }
        return listEmptyList;
    }

    @NotNull
    public final List<y1> Q0(@NotNull List<y1> operand) {
        Intrinsics.checkNotNullParameter(operand, "operand");
        h();
        h();
        List<y1> list = operand;
        while (true) {
            List<y1> listK0 = K0(z0(list, c0(operand, list)), 1);
            if (U(listK0, list) >= 0) {
                return list;
            }
            list = listK0;
        }
    }

    @NotNull
    public final Pair<List<y1>, List<y1>> R(@NotNull List<y1> operand) {
        Intrinsics.checkNotNullParameter(operand, "operand");
        List<y1> listQ0 = Q0(operand);
        return new Pair<>(listQ0, r0(operand, S0(listQ0, listQ0)));
    }

    @NotNull
    public final C1892a R0(@NotNull C1892a c1892a, @NotNull C1892a other) {
        Intrinsics.checkNotNullParameter(c1892a, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        return N0(c1892a, other);
    }

    @NotNull
    public final List<y1> S0(@NotNull List<y1> list, @NotNull List<y1> other) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        return q(list, other);
    }

    public final int T(long j10) {
        return 63 - e(j10);
    }

    @NotNull
    public final List<y1> T0(@NotNull List<y1> times, long j10) {
        Intrinsics.checkNotNullParameter(times, "$this$times");
        return q(times, CollectionsKt.listOf(y1.c(j10)));
    }

    public final int U(@NotNull List<y1> list, @NotNull List<y1> other) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        return u(list, other);
    }

    @NotNull
    public final int[] U0(@NotNull List<y1> to32Bit) {
        Intrinsics.checkNotNullParameter(to32Bit, "$this$to32Bit");
        return X(to32Bit);
    }

    public final int V(@NotNull List<y1> compareTo, long j10) {
        Intrinsics.checkNotNullParameter(compareTo, "$this$compareTo");
        return u(compareTo, CollectionsKt.listOf(y1.c(j10)));
    }

    @NotNull
    public final List<y1> V0(@NotNull List<y1> firstUnchecked, @NotNull List<y1> secondUnchecked) {
        Intrinsics.checkNotNullParameter(firstUnchecked, "firstUnchecked");
        Intrinsics.checkNotNullParameter(secondUnchecked, "secondUnchecked");
        if (firstUnchecked.size() % 3 != 0) {
            List<y1> list = firstUnchecked;
            int size = (((firstUnchecked.size() + 2) / 3) * 3) - firstUnchecked.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i10 = 0; i10 < size; i10++) {
                arrayList.add(y1.c(0L));
            }
            firstUnchecked = CollectionsKt.plus((Collection) list, (Iterable) arrayList);
        }
        if (secondUnchecked.size() % 3 != 0) {
            List<y1> list2 = secondUnchecked;
            int size2 = (((secondUnchecked.size() + 2) / 3) * 3) - secondUnchecked.size();
            ArrayList arrayList2 = new ArrayList(size2);
            for (int i11 = 0; i11 < size2; i11++) {
                arrayList2.add(y1.c(0L));
            }
            secondUnchecked = CollectionsKt.plus((Collection) list2, (Iterable) arrayList2);
        }
        int size3 = firstUnchecked.size();
        int size4 = secondUnchecked.size();
        Pair pair = size3 > size4 ? new Pair(firstUnchecked, g0(secondUnchecked, size3 - size4, 0L)) : size3 < size4 ? new Pair(g0(firstUnchecked, size4 - size3, 0L), secondUnchecked) : new Pair(firstUnchecked, secondUnchecked);
        List list3 = (List) pair.component1();
        List list4 = (List) pair.component2();
        int iMax = (Math.max(firstUnchecked.size(), secondUnchecked.size()) + 2) / 3;
        C1892a c1892a = new C1892a(CollectionsKt.slice(list3, r.W1(0, iMax)), true);
        int i12 = iMax * 2;
        C1892a c1892a2 = new C1892a(CollectionsKt.slice(list3, r.W1(iMax, i12)), true);
        int i13 = iMax * 3;
        C1892a c1892a3 = new C1892a(CollectionsKt.slice(list3, r.W1(i12, i13)), true);
        C1892a c1892a4 = new C1892a(CollectionsKt.slice(list4, r.W1(0, iMax)), true);
        C1892a c1892a5 = new C1892a(CollectionsKt.slice(list4, r.W1(iMax, i12)), true);
        C1892a c1892a6 = new C1892a(CollectionsKt.slice(list4, r.W1(i12, i13)), true);
        C1892a c1892aY0 = y0(c1892a, c1892a3);
        C1892a c1892aY1 = y0(c1892aY0, c1892a2);
        C1892a c1892aQ0 = q0(c1892aY0, c1892a2);
        C1892a c1892aY2 = y0(c1892aQ0, c1892a3);
        C1892a c1892a7 = f269708n;
        C1892a c1892aQ1 = q0(R0(c1892aY2, c1892a7), c1892a);
        C1892a c1892aY3 = y0(c1892a4, c1892a6);
        C1892a c1892aY4 = y0(c1892aY3, c1892a5);
        C1892a c1892aQ2 = q0(c1892aY3, c1892a5);
        C1892a c1892aQ3 = q0(R0(y0(c1892aQ2, c1892a6), c1892a7), c1892a4);
        C1892a c1892aR0 = R0(c1892a, c1892a4);
        C1892a c1892aR1 = R0(c1892aY1, c1892aY4);
        C1892a c1892aR2 = R0(c1892aQ0, c1892aQ2);
        C1892a c1892aR3 = R0(c1892aQ1, c1892aQ3);
        C1892a c1892aR4 = R0(c1892a3, c1892a6);
        C1892a c1892aB0 = b0(q0(c1892aR3, c1892aR1), new C1892a(CollectionsKt.listOf(y1.c(3L)), true));
        C1892a c1892aJ0 = J0(q0(c1892aR1, c1892aR2), 1);
        C1892a c1892aQ4 = q0(c1892aR2, c1892aR0);
        C1892a c1892aY5 = y0(J0(q0(c1892aQ4, c1892aB0), 1), R0(c1892a7, c1892aR4));
        C1892a c1892aQ5 = q0(y0(c1892aQ4, c1892aJ0), c1892aR4);
        return y0(y0(y0(y0(c1892aR0, H0(q0(c1892aJ0, c1892aY5), iMax * 63)), H0(c1892aQ5, iMax * g.f334652s)), H0(c1892aY5, iMax * 189)), H0(c1892aR4, iMax * com.planner5d.library.engine.input.f.b.V1)).f();
    }

    @NotNull
    public final List<y1> W(@NotNull int[] operand) {
        Intrinsics.checkNotNullParameter(operand, "operand");
        if (v1.v(operand) == 0) {
            return h();
        }
        int i10 = 6 >> 1;
        if (v1.v(operand) == 1) {
            return CollectionsKt.listOf(y1.c(y1.n(((long) v1.t(operand, 0)) & k0.f265952a)));
        }
        int iN = com.ionspin.kotlin.bignum.integer.base32.a.f131082a.N(operand);
        int i11 = iN % 63 == 0 ? iN / 63 : (iN / 63) + 1;
        ArrayList arrayList = new ArrayList(i11);
        for (int i12 = 0; i12 < i11; i12++) {
            arrayList.add(y1.c(0L));
        }
        for (int i13 = 0; i13 < i11; i13++) {
            int i14 = i13 % 32;
            int i15 = (i13 * 2) - (i13 / 32);
            if (i11 == 2) {
                arrayList.set(0, y1.c(y1.n(y1.n(((long) v1.t(operand, 0)) & k0.f265952a) | y1.n(y1.n(y1.n(((long) v1.t(operand, 1)) & k0.f265952a) << 32) & f269704j))));
                arrayList.set(i13, y1.c(y1.n(y1.n(y1.n(y1.n(((long) v1.t(operand, 1)) & k0.f265952a) >>> 31) | y1.n(y1.n(((long) v1.t(operand, 2)) & k0.f265952a) << 1)) | y1.n(y1.n(((long) v1.t(operand, 3)) & k0.f265952a) << 33))));
            } else if (i13 == 0) {
                arrayList.set(i13, y1.c(y1.n(y1.n(((long) v1.t(operand, 0)) & k0.f265952a) | y1.n(y1.n(y1.n(((long) v1.t(operand, 1)) & k0.f265952a) << 32) & f269704j))));
            } else if (1 <= i13 && i13 < i11 - 1) {
                arrayList.set(i13, y1.c(y1.n(y1.n(y1.n(y1.n(((long) v1.t(operand, i15 + 1)) & k0.f265952a) << (i14 + 32)) & f269704j) | y1.n(y1.n(y1.n(((long) v1.t(operand, i15 - 1)) & k0.f265952a) >>> (32 - i14)) | y1.n(y1.n(((long) v1.t(operand, i15)) & k0.f265952a) << i14)))));
            } else if (i13 == i11 - 1) {
                if (i15 < v1.v(operand)) {
                    arrayList.set(i13, y1.c(y1.n(y1.n(y1.n(((long) v1.t(operand, i15)) & k0.f265952a) << i14) | y1.n(y1.n(((long) v1.t(operand, i15 - 1)) & k0.f265952a) >>> (32 - i14)))));
                } else {
                    arrayList.set(i13, y1.c(y1.n(y1.n(((long) v1.t(operand, i15 - 1)) & k0.f265952a) >>> (32 - i14))));
                }
            }
        }
        return arrayList;
    }

    public final int W0(long j10) {
        return x0(j10);
    }

    @NotNull
    public final int[] X(@NotNull List<y1> operand) {
        Intrinsics.checkNotNullParameter(operand, "operand");
        List<y1> listY = Y(operand);
        int[] iArrI = v1.i(listY.size() * 2);
        int size = listY.size();
        for (int i10 = 0; i10 < size; i10++) {
            int i11 = i10 * 2;
            v1.D(iArrI, i11, u1.n((int) y1.n(listY.get(i10).z0() & y1.n(((long) com.ionspin.kotlin.bignum.integer.base32.a.f131082a.n0()) & k0.f265952a))));
            v1.D(iArrI, i11 + 1, u1.n((int) y1.n(listY.get(i10).z0() >>> 32)));
        }
        return com.ionspin.kotlin.bignum.integer.base32.a.f131082a.S0(iArrI);
    }

    @NotNull
    public final List<y1> Y(@NotNull List<y1> operand) {
        Intrinsics.checkNotNullParameter(operand, "operand");
        if (Intrinsics.areEqual(operand, h())) {
            return h();
        }
        int iZ = z(operand);
        int i10 = iZ % 64 == 0 ? iZ / 64 : (iZ / 64) + 1;
        ArrayList arrayList = new ArrayList(i10);
        for (int i11 = 0; i11 < i10; i11++) {
            arrayList.add(y1.c(0L));
        }
        for (int i12 = 0; i12 < i10; i12++) {
            int i13 = i12 % 63;
            int i14 = (i12 / 63) + i12;
            int i15 = i14 + 1;
            if (i15 < operand.size()) {
                arrayList.set(i12, y1.c(y1.n(y1.n(operand.get(i15).z0() << (63 - i13)) | y1.n(operand.get(i14).z0() >>> i13))));
            } else {
                arrayList.set(i12, y1.c(y1.n(operand.get(i14).z0() >>> i13)));
            }
        }
        return arrayList;
    }

    @NotNull
    public final Pair<List<y1>, List<y1>> Z(@NotNull List<y1> a10) {
        List<y1> listR0;
        Intrinsics.checkNotNullParameter(a10, "a");
        int size = a10.size();
        int i10 = size - 1;
        if (i10 <= 2) {
            if (i10 == 0) {
                i10 = 1;
            }
            List<y1> listI0 = I0(k(), i10 * 2 * f269701g);
            List<y1> listC0 = c0(listI0, a10);
            return new Pair<>(listC0, r0(listI0, S0(listC0, a10)));
        }
        int iFloor = (int) Math.floor(((double) (size - 2)) / ((double) 2));
        int i11 = i10 - iFloor;
        List<y1> listSubList = a10.subList((a10.size() - i11) - 1, a10.size());
        List<y1> listSubList2 = a10.subList(0, iFloor);
        Pair<List<y1>, List<y1>> pairZ = Z(listSubList);
        List<y1> listComponent1 = pairZ.component1();
        List<y1> listComponent2 = pairZ.component2();
        List<y1> listS0 = S0(listSubList2, listComponent1);
        int i12 = f269701g;
        List<y1> listI1 = I0(listComponent2, iFloor * i12);
        if (U(listI1, listS0) >= 0) {
            listR0 = r0(listI1, listS0);
        } else {
            listComponent1 = r0(listComponent1, k());
            listR0 = r0(z0(listI1, a10), listS0);
        }
        List<y1> listK0 = K0(S0(listComponent1, K0(listR0, i11 * i12)), i11 * i12);
        List<y1> listZ0 = z0(I0(listComponent1, iFloor * i12), listK0);
        List<y1> listR1 = r0(I0(listR0, iFloor * i12), S0(a10, listK0));
        if (U(listR1, a10) >= 0) {
            listZ0 = z0(listZ0, k());
            listR1 = r0(listR1, a10);
            if (U(listR1, a10) >= 0) {
                listZ0 = z0(listZ0, k());
                listR1 = r0(listR1, a10);
            }
        }
        return new Pair<>(listZ0, listR1);
    }

    @Override // com.ionspin.kotlin.bignum.integer.e
    public int a() {
        return f269700f;
    }

    @NotNull
    public final List<y1> a0(@NotNull List<y1> remainderNormalized, int i10) {
        Intrinsics.checkNotNullParameter(remainderNormalized, "remainderNormalized");
        return K0(remainderNormalized, i10);
    }

    @Override // com.ionspin.kotlin.bignum.integer.e
    @NotNull
    public List<y1> b(int i10) {
        return CollectionsKt.listOf(y1.c(y1.n(Math.abs(i10))));
    }

    @NotNull
    public final C1892a b0(@NotNull C1892a c1892a, @NotNull C1892a other) {
        Intrinsics.checkNotNullParameter(c1892a, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        return M0(c1892a, other);
    }

    @Override // com.ionspin.kotlin.bignum.integer.e
    @NotNull
    public List<y1> c(short s10) {
        return CollectionsKt.listOf(y1.c(y1.n(((long) s10) & g.f334653t)));
    }

    @NotNull
    public final List<y1> c0(@NotNull List<y1> list, @NotNull List<y1> other) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        return P(list, other).getFirst();
    }

    @Override // com.ionspin.kotlin.bignum.integer.e
    @NotNull
    public List<y1> d(byte b10) {
        return CollectionsKt.listOf(y1.c(y1.n(((long) b10) & 255)));
    }

    @NotNull
    public final List<y1> d0(@NotNull List<y1> div, long j10) {
        Intrinsics.checkNotNullParameter(div, "$this$div");
        return P(div, CollectionsKt.listOf(y1.c(j10))).getFirst();
    }

    @Override // com.ionspin.kotlin.bignum.integer.e
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

    @NotNull
    public final Pair<List<y1>, List<y1>> e0(@NotNull List<y1> list, @NotNull List<y1> other) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        return P(list, other);
    }

    @Override // com.ionspin.kotlin.bignum.integer.e
    @NotNull
    public List<y1> f(long j10) {
        ea.a aVar = ea.a.f274713a;
        return y1.n(aVar.E0() & j10) != 0 ? CollectionsKt.listOf((Object[]) new y1[]{y1.c(y1.n(j10 & aVar.A0())), y1.c(1L)}) : CollectionsKt.listOf(y1.c(j10));
    }

    @Override // com.ionspin.kotlin.bignum.integer.e
    @NotNull
    public List<y1> g(@NotNull byte[] source) {
        Intrinsics.checkNotNullParameter(source, "source");
        return CollectionsKt.toList(z1.d(ea.a.f274713a.P(source)));
    }

    @NotNull
    public final List<y1> g0(@NotNull List<y1> original, int i10, long j10) {
        Intrinsics.checkNotNullParameter(original, "original");
        int size = original.size() + i10;
        ArrayList arrayList = new ArrayList(size);
        int i11 = 0;
        while (i11 < size) {
            arrayList.add(y1.c(i11 < original.size() ? original.get(i11).z0() : j10));
            i11++;
        }
        return arrayList;
    }

    @Override // com.ionspin.kotlin.bignum.integer.e
    @NotNull
    public List<y1> h() {
        return f269696b;
    }

    @NotNull
    public final List<y1> h0(@NotNull int[] from32Bit) {
        Intrinsics.checkNotNullParameter(from32Bit, "$this$from32Bit");
        return W(from32Bit);
    }

    @Override // com.ionspin.kotlin.bignum.integer.e
    @NotNull
    public List<y1> i(int i10) {
        return CollectionsKt.listOf(y1.c(y1.n(((long) i10) & k0.f265952a)));
    }

    public final long i0() {
        return f269702h;
    }

    @Override // com.ionspin.kotlin.bignum.integer.e
    @NotNull
    public List<y1> j() {
        return f269699e;
    }

    public final long j0() {
        return f269704j;
    }

    @Override // com.ionspin.kotlin.bignum.integer.e
    @NotNull
    public List<y1> k() {
        return f269697c;
    }

    public final long k0() {
        return f269703i;
    }

    @Override // com.ionspin.kotlin.bignum.integer.e
    @NotNull
    public List<y1> l(@NotNull byte[] source) {
        Intrinsics.checkNotNullParameter(source, "source");
        return CollectionsKt.toList(z1.d(ea.a.f274713a.g(source)));
    }

    public final long l0() {
        return f269705k;
    }

    @Override // com.ionspin.kotlin.bignum.integer.e
    @NotNull
    public List<y1> m(byte b10) {
        return CollectionsKt.listOf(y1.c(y1.n(Math.abs((int) b10))));
    }

    @NotNull
    public final List<y1>[] m0() {
        return f269709o;
    }

    @Override // com.ionspin.kotlin.bignum.integer.e
    @NotNull
    public List<y1> n(long j10) {
        return j10 == Long.MIN_VALUE ? CollectionsKt.listOf(y1.c(y1.n(y1.n(Long.MAX_VALUE) + 1))) : CollectionsKt.listOf(y1.c(y1.n(y1.n(Math.abs(j10)) & ea.a.f274713a.A0())));
    }

    @NotNull
    public final C1892a n0() {
        return f269708n;
    }

    @Override // com.ionspin.kotlin.bignum.integer.e
    @NotNull
    public List<y1> o(short s10) {
        return CollectionsKt.listOf(y1.c(y1.n(Math.abs((int) s10))));
    }

    public final int o0() {
        return f269701g;
    }

    @Override // com.ionspin.kotlin.bignum.integer.e
    @NotNull
    public List<y1> p() {
        return f269698d;
    }

    @NotNull
    public final List<y1> p0(@NotNull List<y1> first, @NotNull List<y1> second) {
        Intrinsics.checkNotNullParameter(first, "first");
        Intrinsics.checkNotNullParameter(second, "second");
        int iMax = (Math.max(first.size(), second.size()) + 1) / 2;
        List<y1> listK = k();
        int i10 = f269701g;
        List<y1> listS0 = s0(I0(listK, iMax * i10), 1L);
        List<y1> listX = x(first, listS0);
        List<y1> listK0 = K0(first, iMax * i10);
        List<y1> listX2 = x(second, listS0);
        List<y1> listK1 = K0(second, iMax * i10);
        List<y1> listS1 = S0(listK0, listK1);
        List<y1> listS2 = S0(listX, listX2);
        return z0(z0(I0(listS1, iMax * g.f334652s), I0(r0(r0(S0(z0(listK0, listX), z0(listK1, listX2)), listS1), listS2), i10 * iMax)), listS2);
    }

    @Override // com.ionspin.kotlin.bignum.integer.e
    @NotNull
    public List<y1> q(@NotNull List<y1> first, @NotNull List<y1> second) {
        Intrinsics.checkNotNullParameter(first, "first");
        Intrinsics.checkNotNullParameter(second, "second");
        if (Intrinsics.areEqual(first, h()) || Intrinsics.areEqual(second, h())) {
            return h();
        }
        if ((first.size() >= 120 || second.size() >= 120) && (first.size() <= 15000 || second.size() < 15000)) {
            return p0(first, second);
        }
        return (first.size() < 15000 || second.size() < 15000) ? F0(Q(first, second)) : V0(first, second);
    }

    @NotNull
    public final C1892a q0(@NotNull C1892a c1892a, @NotNull C1892a other) {
        Intrinsics.checkNotNullParameter(c1892a, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        return P0(c1892a, other);
    }

    @Override // com.ionspin.kotlin.bignum.integer.e
    public int r(@NotNull List<y1> value) {
        Intrinsics.checkNotNullParameter(value, "value");
        if (Intrinsics.areEqual(value, h())) {
            return 0;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : value) {
            if (((y1) obj).z0() != 0) {
                break;
            }
            arrayList.add(obj);
        }
        int size = arrayList.size();
        if (size == value.size()) {
            return 0;
        }
        return W0(value.get(size).z0()) + (size * 63);
    }

    @NotNull
    public final List<y1> r0(@NotNull List<y1> list, @NotNull List<y1> other) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        return F(list, other);
    }

    @Override // com.ionspin.kotlin.bignum.integer.e
    @NotNull
    public Pair<List<y1>, List<y1>> s(@NotNull List<y1> first, @NotNull List<y1> second) {
        Intrinsics.checkNotNullParameter(first, "first");
        Intrinsics.checkNotNullParameter(second, "second");
        return P(first, second);
    }

    @NotNull
    public final List<y1> s0(@NotNull List<y1> minus, long j10) {
        Intrinsics.checkNotNullParameter(minus, "$this$minus");
        return F(minus, CollectionsKt.listOf(y1.c(j10)));
    }

    @Override // com.ionspin.kotlin.bignum.integer.e
    @NotNull
    public List<y1> t(@NotNull List<y1> operand, long j10, boolean z10) {
        Intrinsics.checkNotNullParameter(operand, "operand");
        long j11 = 63;
        long j12 = j10 / j11;
        if (j12 > g3.f12256c) {
            throw new RuntimeException("Invalid bit index, too large, cannot access word (Word position > Int.MAX_VALUE");
        }
        if (j12 >= operand.size()) {
            throw new IndexOutOfBoundsException("Invalid position, addressed word " + j12 + " larger than number of words " + operand.size());
        }
        long jN = y1.n(1 << ((int) (j10 % j11)));
        int size = operand.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.add(y1.c(i10 == ((int) j12) ? z10 ? y1.n(operand.get(i10).z0() | jN) : y1.n(operand.get(i10).z0() ^ jN) : operand.get(i10).z0()));
        }
        return arrayList;
    }

    @NotNull
    public final List<y1> t0(@NotNull List<y1> first, long j10) {
        Intrinsics.checkNotNullParameter(first, "first");
        long jN = y1.n(j10 & f269703i);
        long jN2 = y1.n(j10 >>> 32);
        int size = first.size() + 1;
        ArrayList arrayList = new ArrayList(size);
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            arrayList.add(y1.c(0L));
        }
        int i12 = 0;
        long jN3 = 0;
        while (i10 < first.size()) {
            long jN4 = y1.n(first.get(i10).z0() & f269703i);
            long jN5 = y1.n(first.get(i10).z0() >>> 32);
            i10++;
            long jN6 = y1.n(jN4 * jN);
            long jN7 = y1.n(jN6 >>> 63);
            long j11 = f269702h;
            long jN8 = y1.n(jN3 + y1.n(jN6 & j11));
            long jN9 = y1.n(jN7 + y1.n(jN8 >>> 63));
            long jN10 = y1.n(jN8 & j11);
            long jN11 = y1.n(y1.n(jN4 * jN2) + y1.n(jN * jN5));
            long jN12 = y1.n(jN9 + y1.n(jN11 >>> 31));
            long jN13 = y1.n(jN10 + y1.n(y1.n(jN11 << 32) & j11));
            long jN14 = y1.n(jN12 + y1.n(jN13 >>> 63));
            arrayList.set(i12, y1.c(y1.n(jN13 & j11)));
            jN3 = y1.n(jN14 + y1.n(y1.n(jN5 * jN2) << 1));
            i12++;
        }
        if (jN3 != 0) {
            arrayList.set(i12, y1.c(jN3));
        }
        return F0(arrayList);
    }

    @Override // com.ionspin.kotlin.bignum.integer.e
    public int u(@NotNull List<y1> first, @NotNull List<y1> second) {
        boolean z10;
        boolean z11;
        Intrinsics.checkNotNullParameter(first, "first");
        Intrinsics.checkNotNullParameter(second, "second");
        if (first.size() > second.size()) {
            return 1;
        }
        if (second.size() > first.size()) {
            return -1;
        }
        int size = first.size() - 1;
        while (true) {
            if (size < 0) {
                z10 = false;
                z11 = true;
                break;
            }
            if (Long.compareUnsigned(first.get(size).z0(), second.get(size).z0()) > 0) {
                z11 = false;
                z10 = true;
                break;
            }
            if (Long.compareUnsigned(first.get(size).z0(), second.get(size).z0()) < 0) {
                z11 = false;
                z10 = false;
                break;
            }
            size--;
        }
        if (z11) {
            return 0;
        }
        return z10 ? 1 : -1;
    }

    @NotNull
    public final List<y1> u0(long j10, long j11) {
        long j12 = f269703i;
        long jN = y1.n(j10 & j12);
        long jN2 = y1.n(j10 >>> 32);
        long jN3 = y1.n(j11 & j12);
        long jN4 = y1.n(j11 >>> 32);
        long jN5 = y1.n(jN * jN3);
        long jN6 = y1.n(jN5 >>> 63);
        long j13 = f269702h;
        long jN7 = y1.n(jN5 & j13);
        long jN8 = y1.n(y1.n(jN * jN4) + y1.n(jN3 * jN2));
        long jN9 = y1.n(jN6 + y1.n(jN8 >>> 31));
        long jN10 = y1.n(jN7 + y1.n(y1.n(jN8 << 32) & j13));
        return F0(CollectionsKt.listOf((Object[]) new y1[]{y1.c(y1.n(jN10 & j13)), y1.c(y1.n(y1.n(jN9 + y1.n(jN10 >>> 63)) + y1.n(y1.n(jN2 * jN4) << 1)))}));
    }

    @Override // com.ionspin.kotlin.bignum.integer.e
    public boolean v(@NotNull List<y1> operand, long j10) {
        Intrinsics.checkNotNullParameter(operand, "operand");
        long j11 = 63;
        long j12 = j10 / j11;
        if (j12 <= g3.f12256c) {
            return j12 < ((long) operand.size()) && y1.n(operand.get((int) j12).z0() & y1.n(1 << ((int) (j10 % j11)))) == 1;
        }
        throw new RuntimeException("Invalid bit index, too large, cannot access word (Word position > Int.MAX_VALUE");
    }

    @NotNull
    public final Pair<List<y1>, Integer> v0(@NotNull List<y1> operand) {
        Intrinsics.checkNotNullParameter(operand, "operand");
        int iE = e(operand.get(operand.size() - 1).z0());
        return new Pair<>(I0(operand, iE), Integer.valueOf(iE));
    }

    @Override // com.ionspin.kotlin.bignum.integer.e
    @NotNull
    public List<y1> w(@NotNull List<y1> first, @NotNull List<y1> second) {
        Intrinsics.checkNotNullParameter(first, "first");
        Intrinsics.checkNotNullParameter(second, "second");
        if (first.size() == 1 && first.get(0).z0() == 0) {
            return second;
        }
        if (second.size() == 1 && second.get(0).z0() == 0) {
            return first;
        }
        h hVar = first.size() > second.size() ? new h(Integer.valueOf(first.size()), Integer.valueOf(second.size()), first, second) : new h(Integer.valueOf(second.size()), Integer.valueOf(first.size()), second, first);
        int iIntValue = ((Number) hVar.a()).intValue();
        int iIntValue2 = ((Number) hVar.b()).intValue();
        List list = (List) hVar.c();
        List list2 = (List) hVar.d();
        int i10 = iIntValue + 1;
        ArrayList arrayList = new ArrayList(i10);
        for (int i11 = 0; i11 < i10; i11++) {
            arrayList.add(y1.c(0L));
        }
        int i12 = 0;
        long jN = 0;
        while (i12 < iIntValue2) {
            long jN2 = y1.n(y1.n(jN + ((y1) list.get(i12)).z0()) + ((y1) list2.get(i12)).z0());
            arrayList.set(i12, y1.c(y1.n(f269702h & jN2)));
            jN = y1.n(jN2 >>> 63);
            i12++;
        }
        while (jN != 0) {
            if (i12 == iIntValue) {
                arrayList.set(iIntValue, y1.c(jN));
                return F0(arrayList);
            }
            long jN3 = y1.n(jN + ((y1) list.get(i12)).z0());
            arrayList.set(i12, y1.c(y1.n(f269702h & jN3)));
            jN = y1.n(jN3 >>> 63);
            i12++;
        }
        while (i12 < iIntValue) {
            arrayList.set(i12, list.get(i12));
            i12++;
        }
        long jZ0 = ((y1) arrayList.get(arrayList.size() - 1)).z0();
        List<y1> listSubList = arrayList;
        if (jZ0 == 0) {
            listSubList = arrayList.subList(0, arrayList.size() - 1);
        }
        return F0(listSubList);
    }

    @NotNull
    public final n1<List<y1>, List<y1>, Integer> w0(@NotNull List<y1> dividend, @NotNull List<y1> divisor) {
        Intrinsics.checkNotNullParameter(dividend, "dividend");
        Intrinsics.checkNotNullParameter(divisor, "divisor");
        int iE = e(divisor.get(divisor.size() - 1).z0());
        return new n1<>(I0(dividend, iE), I0(divisor, iE), Integer.valueOf(iE));
    }

    @Override // com.ionspin.kotlin.bignum.integer.e
    @NotNull
    public List<y1> x(@NotNull List<y1> operand, @NotNull List<y1> mask) {
        Intrinsics.checkNotNullParameter(operand, "operand");
        Intrinsics.checkNotNullParameter(mask, "mask");
        int size = operand.size();
        ArrayList arrayList = new ArrayList(size);
        int i10 = 0;
        while (i10 < size) {
            arrayList.add(y1.c(i10 < mask.size() ? y1.n(operand.get(i10).z0() & mask.get(i10).z0()) : 0L));
            i10++;
        }
        return F0(arrayList);
    }

    public final int x0(long j10) {
        int i10;
        long jN = y1.n(j10 << 32);
        long j11 = f269702h;
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

    @Override // com.ionspin.kotlin.bignum.integer.e
    public long y(@NotNull List<y1> operand) {
        Intrinsics.checkNotNullParameter(operand, "operand");
        double dCeil = Math.ceil(((double) (z(operand) - 1)) * com.ionspin.kotlin.bignum.integer.a.f131059e.I());
        List<y1> listC0 = c0(operand, D(j(), (long) dCeil));
        long j10 = 0;
        while (u(listC0, h()) != 0) {
            listC0 = c0(listC0, j());
            j10++;
        }
        return j10 + ((long) ((int) dCeil));
    }

    @NotNull
    public final C1892a y0(@NotNull C1892a c1892a, @NotNull C1892a other) {
        Intrinsics.checkNotNullParameter(c1892a, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        return L0(c1892a, other);
    }

    @Override // com.ionspin.kotlin.bignum.integer.e
    public int z(@NotNull List<y1> value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return T(value.get(value.size() - 1).z0()) + ((value.size() - 1) * 63);
    }

    @NotNull
    public final List<y1> z0(@NotNull List<y1> list, @NotNull List<y1> other) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        return w(list, other);
    }
}
