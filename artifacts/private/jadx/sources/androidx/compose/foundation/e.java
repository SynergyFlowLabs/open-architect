package androidx.compose.foundation;

import android.content.Context;
import android.os.Build;
import android.widget.EdgeEffect;
import androidx.compose.runtime.w6;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
@SourceDebugExtension({"SMAP\nAndroidOverscroll.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidOverscroll.android.kt\nandroidx/compose/foundation/AndroidEdgeEffectOverscrollEffect\n+ 2 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 5 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 6 Size.kt\nandroidx/compose/ui/geometry/Size\n+ 7 AndroidOverscroll.android.kt\nandroidx/compose/foundation/EdgeEffectWrapper\n+ 8 IntSize.kt\nandroidx/compose/ui/unit/IntSizeKt\n*L\n1#1,1073:1\n69#2:1074\n69#2:1077\n69#2:1080\n69#2:1083\n69#2:1086\n65#2:1089\n65#2:1092\n65#2:1095\n65#2:1098\n65#2:1101\n65#2:1108\n69#2:1111\n65#2:1113\n69#2:1116\n65#2:1118\n65#2:1121\n69#2:1124\n69#2:1127\n65#2:1155\n69#2:1159\n65#2:1172\n65#2:1175\n65#2:1178\n65#2:1181\n69#2:1184\n69#2:1187\n69#2:1190\n69#2:1193\n65#2:1196\n69#2:1199\n69#2:1206\n65#2:1209\n69#2:1212\n69#2:1219\n69#2:1222\n65#2:1225\n65#2:1232\n69#2:1235\n65#2:1238\n65#2:1245\n70#3:1075\n70#3:1078\n70#3:1081\n70#3:1084\n70#3:1087\n60#3:1090\n60#3:1093\n60#3:1096\n60#3:1099\n60#3:1102\n53#3,3:1105\n60#3:1109\n70#3:1112\n60#3:1114\n70#3:1117\n60#3:1119\n60#3:1122\n70#3:1125\n70#3:1128\n60#3:1131\n60#3:1134\n70#3:1137\n70#3:1140\n60#3:1148\n70#3:1151\n80#3:1153\n60#3:1156\n70#3:1160\n53#3,3:1164\n60#3:1173\n60#3:1176\n60#3:1179\n60#3:1182\n70#3:1185\n70#3:1188\n70#3:1191\n70#3:1194\n60#3:1197\n70#3:1200\n70#3:1204\n70#3:1207\n60#3:1210\n70#3:1213\n70#3:1217\n70#3:1220\n70#3:1223\n60#3:1226\n60#3:1230\n60#3:1233\n70#3:1236\n60#3:1239\n60#3:1243\n60#3:1246\n22#4:1076\n22#4:1079\n22#4:1082\n22#4:1085\n22#4:1088\n22#4:1091\n22#4:1094\n22#4:1097\n22#4:1100\n22#4:1103\n22#4:1110\n22#4:1115\n22#4:1120\n22#4:1123\n22#4:1126\n22#4:1129\n22#4:1132\n22#4:1135\n22#4:1138\n22#4:1141\n22#4:1149\n22#4:1157\n22#4:1161\n22#4:1174\n22#4:1177\n22#4:1180\n22#4:1183\n22#4:1186\n22#4:1189\n22#4:1192\n22#4:1195\n22#4:1198\n22#4:1201\n22#4:1205\n22#4:1208\n22#4:1211\n22#4:1214\n22#4:1218\n22#4:1221\n22#4:1224\n22#4:1227\n22#4:1231\n22#4:1234\n22#4:1237\n22#4:1240\n22#4:1244\n22#4:1247\n30#5:1104\n273#5:1154\n30#5:1163\n57#6:1130\n57#6:1133\n61#6:1136\n61#6:1139\n57#6:1147\n61#6:1150\n57#6:1158\n61#6:1162\n61#6:1202\n61#6:1203\n61#6:1215\n61#6:1216\n57#6:1228\n57#6:1229\n57#6:1241\n57#6:1242\n948#7,5:1142\n948#7,5:1167\n30#8:1152\n*S KotlinDebug\n*F\n+ 1 AndroidOverscroll.android.kt\nandroidx/compose/foundation/AndroidEdgeEffectOverscrollEffect\n*L\n562#1:1074\n563#1:1077\n572#1:1080\n574#1:1083\n583#1:1086\n589#1:1089\n590#1:1092\n599#1:1095\n601#1:1098\n610#1:1101\n628#1:1108\n628#1:1111\n629#1:1113\n629#1:1116\n648#1:1118\n651#1:1121\n658#1:1124\n661#1:1127\n776#1:1155\n777#1:1159\n850#1:1172\n851#1:1175\n854#1:1178\n855#1:1181\n858#1:1184\n859#1:1187\n862#1:1190\n863#1:1193\n870#1:1196\n871#1:1199\n877#1:1206\n884#1:1209\n885#1:1212\n892#1:1219\n899#1:1222\n900#1:1225\n907#1:1232\n914#1:1235\n915#1:1238\n922#1:1245\n562#1:1075\n563#1:1078\n572#1:1081\n574#1:1084\n583#1:1087\n589#1:1090\n590#1:1093\n599#1:1096\n601#1:1099\n610#1:1102\n614#1:1105,3\n628#1:1109\n628#1:1112\n629#1:1114\n629#1:1117\n648#1:1119\n651#1:1122\n658#1:1125\n661#1:1128\n696#1:1131\n700#1:1134\n708#1:1137\n712#1:1140\n764#1:1148\n764#1:1151\n764#1:1153\n776#1:1156\n777#1:1160\n778#1:1164,3\n850#1:1173\n851#1:1176\n854#1:1179\n855#1:1182\n858#1:1185\n859#1:1188\n862#1:1191\n863#1:1194\n870#1:1197\n871#1:1200\n873#1:1204\n877#1:1207\n884#1:1210\n885#1:1213\n888#1:1217\n892#1:1220\n899#1:1223\n900#1:1226\n903#1:1230\n907#1:1233\n914#1:1236\n915#1:1239\n918#1:1243\n922#1:1246\n562#1:1076\n563#1:1079\n572#1:1082\n574#1:1085\n583#1:1088\n589#1:1091\n590#1:1094\n599#1:1097\n601#1:1100\n610#1:1103\n628#1:1110\n629#1:1115\n648#1:1120\n651#1:1123\n658#1:1126\n661#1:1129\n696#1:1132\n700#1:1135\n708#1:1138\n712#1:1141\n764#1:1149\n776#1:1157\n777#1:1161\n850#1:1174\n851#1:1177\n854#1:1180\n855#1:1183\n858#1:1186\n859#1:1189\n862#1:1192\n863#1:1195\n870#1:1198\n871#1:1201\n873#1:1205\n877#1:1208\n884#1:1211\n885#1:1214\n888#1:1218\n892#1:1221\n899#1:1224\n900#1:1227\n903#1:1231\n907#1:1234\n914#1:1237\n915#1:1240\n918#1:1244\n922#1:1247\n614#1:1104\n775#1:1154\n778#1:1163\n696#1:1130\n700#1:1133\n708#1:1136\n712#1:1139\n764#1:1147\n764#1:1150\n776#1:1158\n777#1:1162\n871#1:1202\n873#1:1203\n885#1:1215\n888#1:1216\n900#1:1228\n903#1:1229\n915#1:1241\n918#1:1242\n755#1:1142,5\n834#1:1167,5\n764#1:1152\n*E\n"})
public final class e implements x3 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f14180k = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final androidx.compose.ui.unit.d f14181a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f14182b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final y1 f14183c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final androidx.compose.runtime.n3<Unit> f14184d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f14185e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f14186f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f14187g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f14188h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private final androidx.compose.ui.input.pointer.y0 f14189i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private final androidx.compose.ui.node.j f14190j;

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect", f = "AndroidOverscroll.android.kt", i = {1}, l = {688, 720}, m = "applyToFling-BMRW4eQ", n = {"remainingVelocity"}, s = {"J$0"})
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        long f14191a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f14192b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f14194d;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f14192b = obj;
            this.f14194d |= Integer.MIN_VALUE;
            return e.this.A(0L, null, this);
        }
    }

    static final class b implements PointerInputEventHandler {

        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect$pointerInputNode$1$1", f = "AndroidOverscroll.android.kt", i = {0, 1}, l = {783, 787}, m = "invokeSuspend", n = {"$this$awaitEachGesture", "$this$awaitEachGesture"}, s = {"L$0", "L$0"})
        @SourceDebugExtension({"SMAP\nAndroidOverscroll.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidOverscroll.android.kt\nandroidx/compose/foundation/AndroidEdgeEffectOverscrollEffect$pointerInputNode$1$1\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,1073:1\n231#2,2:1074\n35#2,5:1076\n233#2:1081\n118#2:1082\n35#2,5:1083\n119#2:1088\n*S KotlinDebug\n*F\n+ 1 AndroidOverscroll.android.kt\nandroidx/compose/foundation/AndroidEdgeEffectOverscrollEffect$pointerInputNode$1$1\n*L\n787#1:1074,2\n787#1:1076,5\n787#1:1081\n791#1:1082\n791#1:1083,5\n791#1:1088\n*E\n"})
        static final class a extends kotlin.coroutines.jvm.internal.k implements Function2<androidx.compose.ui.input.pointer.c, kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f14196a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private /* synthetic */ Object f14197b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ e f14198c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(e eVar, kotlin.coroutines.d<? super a> dVar) {
                super(2, dVar);
                this.f14198c = eVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                a aVar = new a(this.f14198c, dVar);
                aVar.f14197b = obj;
                return aVar;
            }

            /* JADX WARN: Code duplicated, block: B:27:0x00af  */
            /* JADX WARN: Code duplicated, block: B:30:0x00c7 A[LOOP:1: B:25:0x00ac->B:30:0x00c7, LOOP_END] */
            /* JADX WARN: Code duplicated, block: B:46:0x00cc A[EDGE_INSN: B:46:0x00cc->B:32:0x00cc BREAK  A[LOOP:1: B:25:0x00ac->B:30:0x00c7], SYNTHETIC] */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0070 -> B:18:0x0073). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            @Override // kotlin.coroutines.jvm.internal.a
            public final java.lang.Object invokeSuspend(java.lang.Object r15) {
                /*
                    Method dump skipped, instruction units count: 266
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.e.b.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
            public final Object invoke(androidx.compose.ui.input.pointer.c cVar, kotlin.coroutines.d<? super Unit> dVar) {
                return ((a) create(cVar, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        b() {
        }

        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
        public final Object invoke(androidx.compose.ui.input.pointer.l0 l0Var, kotlin.coroutines.d<? super Unit> dVar) {
            Object objE = androidx.compose.foundation.gestures.e3.e(l0Var, new a(e.this, null), dVar);
            return objE == kotlin.coroutines.intrinsics.b.l() ? objE : Unit.f312394a;
        }
    }

    public /* synthetic */ e(Context context, androidx.compose.ui.unit.d dVar, long j10, androidx.compose.foundation.layout.g5 g5Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, dVar, j10, g5Var);
    }

    private final void d() {
        boolean z10;
        y1 y1Var = this.f14183c;
        EdgeEffect edgeEffect = y1Var.f21912d;
        boolean z11 = true;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z10 = !edgeEffect.isFinished();
        } else {
            z10 = false;
        }
        EdgeEffect edgeEffect2 = y1Var.f21913e;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z10 = !edgeEffect2.isFinished() || z10;
        }
        EdgeEffect edgeEffect3 = y1Var.f21914f;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z10 = !edgeEffect3.isFinished() || z10;
        }
        EdgeEffect edgeEffect4 = y1Var.f21915g;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            if (edgeEffect4.isFinished() && !z10) {
                z11 = false;
            }
            z10 = z11;
        }
        if (z10) {
            i();
        }
    }

    @androidx.annotation.l1
    public static /* synthetic */ void g() {
    }

    private final float j(long j10) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (e() >> 32));
        int i10 = (int) (j10 & com.rabbitmq.client.k0.f265952a);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i10) / Float.intBitsToFloat((int) (this.f14187g & com.rabbitmq.client.k0.f265952a));
        EdgeEffect edgeEffectH = this.f14183c.h();
        w1 w1Var = w1.f21865a;
        int i11 = 2 >> 0;
        return w1Var.c(edgeEffectH) == 0.0f ? (-w1Var.e(edgeEffectH, -fIntBitsToFloat2, 1 - fIntBitsToFloat)) * Float.intBitsToFloat((int) (this.f14187g & com.rabbitmq.client.k0.f265952a)) : Float.intBitsToFloat(i10);
    }

    private final float k(long j10) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (e() & com.rabbitmq.client.k0.f265952a));
        int i10 = (int) (j10 >> 32);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i10) / Float.intBitsToFloat((int) (this.f14187g >> 32));
        EdgeEffect edgeEffectJ = this.f14183c.j();
        w1 w1Var = w1.f21865a;
        return w1Var.c(edgeEffectJ) == 0.0f ? w1Var.e(edgeEffectJ, fIntBitsToFloat2, 1 - fIntBitsToFloat) * Float.intBitsToFloat((int) (this.f14187g >> 32)) : Float.intBitsToFloat(i10);
    }

    private final float l(long j10) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (e() & com.rabbitmq.client.k0.f265952a));
        int i10 = (int) (j10 >> 32);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i10) / Float.intBitsToFloat((int) (this.f14187g >> 32));
        EdgeEffect edgeEffectL = this.f14183c.l();
        w1 w1Var = w1.f21865a;
        return w1Var.c(edgeEffectL) == 0.0f ? (-w1Var.e(edgeEffectL, -fIntBitsToFloat2, fIntBitsToFloat)) * Float.intBitsToFloat((int) (this.f14187g >> 32)) : Float.intBitsToFloat(i10);
    }

    private final float m(long j10) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (e() >> 32));
        int i10 = (int) (j10 & com.rabbitmq.client.k0.f265952a);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i10) / Float.intBitsToFloat((int) (this.f14187g & com.rabbitmq.client.k0.f265952a));
        EdgeEffect edgeEffectN = this.f14183c.n();
        w1 w1Var = w1.f21865a;
        return w1Var.c(edgeEffectN) == 0.0f ? w1Var.e(edgeEffectN, fIntBitsToFloat2, fIntBitsToFloat) * Float.intBitsToFloat((int) (this.f14187g & com.rabbitmq.client.k0.f265952a)) : Float.intBitsToFloat(i10);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0034  */
    private final boolean n(long j10) {
        boolean zT;
        if (this.f14183c.t()) {
            int i10 = (int) (j10 >> 32);
            if (Float.intBitsToFloat(i10) < 0.0f) {
                w1.f21865a.f(this.f14183c.j(), Float.intBitsToFloat(i10));
                zT = this.f14183c.t();
            } else {
                zT = false;
            }
        } else {
            zT = false;
        }
        if (this.f14183c.w()) {
            int i11 = (int) (j10 >> 32);
            if (Float.intBitsToFloat(i11) > 0.0f) {
                w1.f21865a.f(this.f14183c.l(), Float.intBitsToFloat(i11));
                zT = zT || this.f14183c.w();
            }
        }
        if (this.f14183c.A()) {
            int i12 = (int) (j10 & com.rabbitmq.client.k0.f265952a);
            if (Float.intBitsToFloat(i12) < 0.0f) {
                w1.f21865a.f(this.f14183c.n(), Float.intBitsToFloat(i12));
                zT = zT || this.f14183c.A();
            }
        }
        if (this.f14183c.q()) {
            int i13 = (int) (j10 & com.rabbitmq.client.k0.f265952a);
            if (Float.intBitsToFloat(i13) > 0.0f) {
                w1.f21865a.f(this.f14183c.h(), Float.intBitsToFloat(i13));
                return zT || this.f14183c.q();
            }
        }
        return zT;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0051, code lost:
    
        if (r14.invoke(r11, r0) == r1) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0134, code lost:
    
        if (r15 == r1) goto L50;
     */
    @Override // androidx.compose.foundation.x3
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object A(long r12, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super androidx.compose.ui.unit.c0, ? super kotlin.coroutines.d<? super androidx.compose.ui.unit.c0>, ? extends java.lang.Object> r14, @org.jetbrains.annotations.NotNull kotlin.coroutines.d<? super kotlin.Unit> r15) {
        /*
            Method dump skipped, instruction units count: 442
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.e.A(long, kotlin.jvm.functions.Function2, kotlin.coroutines.d):java.lang.Object");
    }

    public final long e() {
        long jB = this.f14182b;
        if ((9223372034707292159L & jB) == n0.d.f332689d) {
            jB = n0.o.b(this.f14187g);
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jB >> 32)) / Float.intBitsToFloat((int) (this.f14187g >> 32));
        return n0.g.g((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (jB & com.rabbitmq.client.k0.f265952a)) / Float.intBitsToFloat((int) (this.f14187g & com.rabbitmq.client.k0.f265952a)))) & com.rabbitmq.client.k0.f265952a) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32));
    }

    public final boolean f() {
        return this.f14185e;
    }

    @NotNull
    public final androidx.compose.runtime.n3<Unit> h() {
        return this.f14184d;
    }

    public final void i() {
        if (this.f14185e) {
            this.f14184d.setValue(Unit.f312394a);
        }
    }

    public final void o(boolean z10) {
        this.f14185e = z10;
    }

    public final void p(long j10) {
        boolean zK = n0.n.k(this.f14187g, n0.n.f332724b.c());
        boolean zK2 = n0.n.k(j10, this.f14187g);
        this.f14187g = j10;
        if (!zK2) {
            y1 y1Var = this.f14183c;
            int iL0 = kotlin.math.b.L0(Float.intBitsToFloat((int) (j10 >> 32)));
            y1Var.D(androidx.compose.ui.unit.u.e((((long) kotlin.math.b.L0(Float.intBitsToFloat((int) (j10 & com.rabbitmq.client.k0.f265952a)))) & com.rabbitmq.client.k0.f265952a) | (((long) iL0) << 32)));
        }
        if (zK || zK2) {
            return;
        }
        d();
    }

    @Override // androidx.compose.foundation.x3
    @NotNull
    public androidx.compose.ui.node.j w() {
        return this.f14190j;
    }

    @Override // androidx.compose.foundation.x3
    public boolean x() {
        y1 y1Var = this.f14183c;
        EdgeEffect edgeEffect = y1Var.f21912d;
        if (edgeEffect != null && w1.f21865a.c(edgeEffect) != 0.0f) {
            return true;
        }
        EdgeEffect edgeEffect2 = y1Var.f21913e;
        if (edgeEffect2 != null && w1.f21865a.c(edgeEffect2) != 0.0f) {
            return true;
        }
        EdgeEffect edgeEffect3 = y1Var.f21914f;
        if (edgeEffect3 != null && w1.f21865a.c(edgeEffect3) != 0.0f) {
            return true;
        }
        EdgeEffect edgeEffect4 = y1Var.f21915g;
        return (edgeEffect4 == null || w1.f21865a.c(edgeEffect4) == 0.0f) ? false : true;
    }

    /* JADX WARN: Code duplicated, block: B:103:0x022e  */
    /* JADX WARN: Code duplicated, block: B:105:0x0233  */
    /* JADX WARN: Code duplicated, block: B:107:0x023b  */
    /* JADX WARN: Code duplicated, block: B:108:0x023f  */
    /* JADX WARN: Code duplicated, block: B:110:0x0242 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:112:0x0246  */
    /* JADX WARN: Code duplicated, block: B:23:0x0083  */
    /* JADX WARN: Code duplicated, block: B:34:0x00ba A[PHI: r11
      0x00ba: PHI (r11v9 float) = (r11v8 float), (r11v12 float) binds: [B:43:0x00eb, B:32:0x00b3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:47:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:58:0x0134 A[PHI: r14
      0x0134: PHI (r14v9 float) = (r14v8 float), (r14v12 float) binds: [B:67:0x0164, B:56:0x012d] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // androidx.compose.foundation.x3
    public long z(long j10, int i10, @NotNull Function1<? super n0.g, n0.g> function1) {
        float fJ;
        float fIntBitsToFloat;
        float fL;
        float fIntBitsToFloat2;
        boolean z10;
        boolean z11;
        int i11;
        boolean z12;
        if (n0.n.v(this.f14187g)) {
            return function1.invoke(n0.g.d(j10)).B();
        }
        if (!this.f14186f) {
            if (this.f14183c.v()) {
                k(n0.g.f332700b.e());
            }
            if (this.f14183c.y()) {
                l(n0.g.f332700b.e());
            }
            if (this.f14183c.C()) {
                m(n0.g.f332700b.e());
            }
            if (this.f14183c.s()) {
                j(n0.g.f332700b.e());
            }
            this.f14186f = true;
        }
        float fE = t.e(i10);
        long jY = n0.g.y(j10, fE);
        int i12 = (int) (j10 & com.rabbitmq.client.k0.f265952a);
        if (Float.intBitsToFloat(i12) == 0.0f) {
            fIntBitsToFloat = 0.0f;
        } else if (this.f14183c.C() && Float.intBitsToFloat(i12) < 0.0f) {
            fJ = m(jY);
            if (!this.f14183c.C()) {
                this.f14183c.n().finish();
            }
            if (fJ == Float.intBitsToFloat((int) (jY & com.rabbitmq.client.k0.f265952a))) {
                fIntBitsToFloat = Float.intBitsToFloat(i12);
            } else {
                fIntBitsToFloat = fJ / fE;
            }
        } else if (!this.f14183c.s() || Float.intBitsToFloat(i12) <= 0.0f) {
            fIntBitsToFloat = 0.0f;
        } else {
            fJ = j(jY);
            if (!this.f14183c.s()) {
                this.f14183c.h().finish();
            }
            if (fJ == Float.intBitsToFloat((int) (jY & com.rabbitmq.client.k0.f265952a))) {
                fIntBitsToFloat = Float.intBitsToFloat(i12);
            } else {
                fIntBitsToFloat = fJ / fE;
            }
        }
        int i13 = (int) (j10 >> 32);
        if (Float.intBitsToFloat(i13) == 0.0f) {
            fIntBitsToFloat2 = 0.0f;
        } else if (this.f14183c.v() && Float.intBitsToFloat(i13) < 0.0f) {
            fL = k(jY);
            if (!this.f14183c.v()) {
                this.f14183c.j().finish();
            }
            if (fL == Float.intBitsToFloat((int) (jY >> 32))) {
                fIntBitsToFloat2 = Float.intBitsToFloat(i13);
            } else {
                fIntBitsToFloat2 = fL / fE;
            }
        } else if (!this.f14183c.y() || Float.intBitsToFloat(i13) <= 0.0f) {
            fIntBitsToFloat2 = 0.0f;
        } else {
            fL = l(jY);
            if (!this.f14183c.y()) {
                this.f14183c.l().finish();
            }
            if (fL == Float.intBitsToFloat((int) (jY >> 32))) {
                fIntBitsToFloat2 = Float.intBitsToFloat(i13);
            } else {
                fIntBitsToFloat2 = fL / fE;
            }
        }
        long jG = n0.g.g((((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & com.rabbitmq.client.k0.f265952a));
        n0.g.a aVar = n0.g.f332700b;
        if (!n0.g.l(jG, aVar.e())) {
            i();
        }
        long jV = n0.g.v(j10, jG);
        long jB = function1.invoke(n0.g.d(jV)).B();
        long jV2 = n0.g.v(jV, jB);
        if ((Float.intBitsToFloat((int) (jV >> 32)) != 0.0f || Float.intBitsToFloat((int) (jV & com.rabbitmq.client.k0.f265952a)) != 0.0f) && (Float.intBitsToFloat((int) (jB >> 32)) != 0.0f || Float.intBitsToFloat((int) (jB & com.rabbitmq.client.k0.f265952a)) != 0.0f)) {
            y1 y1Var = this.f14183c;
            if (y1Var.v() || y1Var.C() || y1Var.y() || y1Var.s()) {
                d();
            }
        }
        if (androidx.compose.ui.input.nestedscroll.f.j(i10, androidx.compose.ui.input.nestedscroll.f.f38949b.h())) {
            int i14 = (int) (jV2 >> 32);
            if (Float.intBitsToFloat(i14) > 0.5f) {
                k(jV2);
            } else {
                if (Float.intBitsToFloat(i14) < -0.5f) {
                    l(jV2);
                } else {
                    z11 = false;
                }
                i11 = (int) (jV2 & com.rabbitmq.client.k0.f265952a);
                if (Float.intBitsToFloat(i11) > 0.5f) {
                    m(jV2);
                } else {
                    if (Float.intBitsToFloat(i11) < -0.5f) {
                        j(jV2);
                    } else {
                        z12 = false;
                    }
                    if (!z11 || z12) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                }
                z12 = true;
                if (z11) {
                }
                z10 = true;
            }
            z11 = true;
            i11 = (int) (jV2 & com.rabbitmq.client.k0.f265952a);
            if (Float.intBitsToFloat(i11) > 0.5f) {
                m(jV2);
            } else {
                if (Float.intBitsToFloat(i11) < -0.5f) {
                    j(jV2);
                } else {
                    z12 = false;
                }
                if (z11) {
                }
                z10 = true;
            }
            z12 = true;
            if (z11) {
            }
            z10 = true;
        } else {
            z10 = false;
        }
        if (!n0.g.l(jV, aVar.e())) {
            z10 = n(j10) || z10;
        }
        if (z10) {
            i();
        }
        return n0.g.w(jG, jB);
    }

    private e(Context context, androidx.compose.ui.unit.d dVar, long j10, androidx.compose.foundation.layout.g5 g5Var) {
        this.f14181a = dVar;
        this.f14182b = n0.g.f332700b.c();
        y1 y1Var = new y1(context, androidx.compose.ui.graphics.s0.t(j10));
        this.f14183c = y1Var;
        this.f14184d = w6.k(Unit.f312394a, w6.o());
        this.f14185e = true;
        this.f14187g = n0.n.f332724b.c();
        this.f14188h = androidx.compose.ui.input.pointer.b0.b(-1L);
        androidx.compose.ui.input.pointer.y0 y0VarA = androidx.compose.ui.input.pointer.w0.a(new b());
        this.f14189i = y0VarA;
        this.f14190j = Build.VERSION.SDK_INT >= 31 ? new f5(y0VarA, this, y1Var) : new l2(y0VarA, this, y1Var, g5Var);
    }
}
