package kotlin.text;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.f0;
import kotlin.g0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.l0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public enum b {
    UNDEFINED(-1),
    LEFT_TO_RIGHT(0),
    RIGHT_TO_LEFT(1),
    RIGHT_TO_LEFT_ARABIC(2),
    EUROPEAN_NUMBER(3),
    EUROPEAN_NUMBER_SEPARATOR(4),
    EUROPEAN_NUMBER_TERMINATOR(5),
    ARABIC_NUMBER(6),
    COMMON_NUMBER_SEPARATOR(7),
    NONSPACING_MARK(8),
    BOUNDARY_NEUTRAL(9),
    PARAGRAPH_SEPARATOR(10),
    SEGMENT_SEPARATOR(11),
    WHITESPACE(12),
    OTHER_NEUTRALS(13),
    LEFT_TO_RIGHT_EMBEDDING(14),
    LEFT_TO_RIGHT_OVERRIDE(15),
    RIGHT_TO_LEFT_EMBEDDING(16),
    RIGHT_TO_LEFT_OVERRIDE(17),
    POP_DIRECTIONAL_FORMAT(18);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f313274a;
    private static final /* synthetic */ kotlin.enums.a H1 = kotlin.enums.c.c(k());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final C2266b f313254b = new C2266b(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private static final f0<Map<Integer, b>> f313255c = g0.c(a.f313275a);

    @SourceDebugExtension({"SMAP\nCharDirectionality.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CharDirectionality.kt\nkotlin/text/CharDirectionality$Companion$directionalityMap$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,124:1\n1202#2,2:125\n1230#2,4:127\n*S KotlinDebug\n*F\n+ 1 CharDirectionality.kt\nkotlin/text/CharDirectionality$Companion$directionalityMap$2\n*L\n118#1:125,2\n118#1:127,4\n*E\n"})
    static final class a extends l0 implements Function0<Map<Integer, ? extends b>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f313275a = new a();

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Map<Integer, b> invoke() {
            kotlin.enums.a<b> aVarN = b.n();
            LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.ranges.r.u(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(aVarN, 10)), 16));
            for (b bVar : aVarN) {
                linkedHashMap.put(Integer.valueOf(bVar.o()), bVar);
            }
            return linkedHashMap;
        }
    }

    /* JADX INFO: renamed from: kotlin.text.b$b, reason: collision with other inner class name */
    public static final class C2266b {
        public /* synthetic */ C2266b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final Map<Integer, b> a() {
            return (Map) b.f313255c.getValue();
        }

        @NotNull
        public final b b(int i10) {
            b bVar = a().get(Integer.valueOf(i10));
            if (bVar != null) {
                return bVar;
            }
            throw new IllegalArgumentException("Directionality #" + i10 + " is not defined.");
        }

        private C2266b() {
        }
    }

    static {
        int i10 = 5 & 6;
    }

    b(int i10) {
        this.f313274a = i10;
    }

    @NotNull
    public static kotlin.enums.a<b> n() {
        return H1;
    }

    public final int o() {
        return this.f313274a;
    }
}
