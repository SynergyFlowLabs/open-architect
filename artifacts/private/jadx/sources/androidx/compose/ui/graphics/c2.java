package androidx.compose.ui.graphics;

import java.util.Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@oj.g
@SourceDebugExtension({"SMAP\nMatrix.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Matrix.kt\nandroidx/compose/ui/graphics/Matrix\n+ 2 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 5 MathHelpers.kt\nandroidx/compose/ui/util/MathHelpersKt\n+ 6 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 7 Matrix.kt\nandroidx/compose/ui/graphics/MatrixKt\n*L\n1#1,681:1\n49#1:682\n49#1:683\n49#1:684\n49#1:685\n49#1:686\n49#1:687\n49#1:688\n49#1:689\n49#1:690\n49#1:702\n49#1:703\n49#1:704\n49#1:705\n49#1:706\n49#1:707\n49#1:708\n49#1:709\n49#1:710\n49#1:719\n49#1:720\n49#1:721\n49#1:722\n49#1:723\n49#1:724\n49#1:725\n49#1:726\n49#1:727\n49#1:737\n49#1:742\n49#1:747\n49#1:752\n49#1:757\n49#1:762\n49#1:767\n49#1:772\n49#1:777\n49#1:782\n49#1:787\n49#1:792\n49#1:797\n49#1:802\n49#1:807\n49#1:812\n49#1:816\n49#1:817\n49#1:818\n49#1:819\n49#1:820\n49#1:821\n49#1:822\n49#1:823\n49#1:824\n49#1:825\n49#1:826\n49#1:827\n49#1:828\n49#1:829\n49#1:830\n49#1:831\n49#1:832\n49#1:833\n49#1:834\n49#1:835\n52#1,2:836\n52#1,2:838\n52#1,2:840\n52#1,2:842\n52#1,2:844\n52#1,2:846\n52#1,2:848\n52#1,2:850\n52#1,2:852\n52#1,2:854\n52#1,2:856\n52#1,2:858\n52#1,2:860\n52#1,2:862\n52#1,2:864\n52#1,2:866\n49#1:868\n49#1:869\n49#1:870\n49#1:871\n49#1:872\n49#1:873\n49#1:874\n49#1:875\n52#1,2:876\n52#1,2:878\n52#1,2:880\n52#1,2:882\n52#1,2:884\n52#1,2:886\n52#1,2:888\n52#1,2:890\n49#1:892\n49#1:893\n49#1:894\n49#1:895\n49#1:896\n49#1:897\n49#1:898\n49#1:899\n52#1,2:900\n52#1,2:902\n52#1,2:904\n52#1,2:906\n52#1,2:908\n52#1,2:910\n52#1,2:912\n52#1,2:914\n49#1:916\n49#1:917\n49#1:918\n49#1:919\n49#1:920\n49#1:921\n49#1:922\n49#1:923\n52#1,2:924\n52#1,2:926\n52#1,2:928\n52#1,2:930\n52#1,2:932\n52#1,2:934\n52#1,2:936\n52#1,2:938\n49#1,5:940\n49#1,5:945\n49#1,5:950\n49#1,5:955\n49#1,5:960\n49#1,5:965\n49#1,5:970\n49#1,5:975\n49#1,5:980\n49#1,5:985\n49#1,5:990\n49#1,5:995\n49#1:1000\n49#1:1001\n49#1:1002\n49#1:1003\n52#1,2:1004\n52#1,2:1006\n52#1,2:1008\n52#1,2:1010\n52#1,2:1012\n52#1,2:1014\n52#1,2:1016\n52#1,2:1018\n52#1,2:1020\n52#1,2:1022\n52#1,2:1024\n52#1,2:1026\n52#1,2:1028\n52#1,2:1030\n52#1,2:1032\n52#1,2:1034\n52#1,2:1036\n52#1,2:1038\n52#1,2:1040\n52#1,2:1042\n65#2:691\n69#2:694\n60#3:692\n70#3:695\n53#3,3:699\n22#4:693\n22#4:696\n139#5:697\n139#5:711\n139#5:712\n139#5:713\n139#5:714\n46#5:715\n46#5:716\n56#5:717\n56#5:718\n139#5:728\n139#5:729\n139#5:730\n139#5:731\n46#5:732\n46#5:733\n56#5:734\n56#5:735\n30#6:698\n653#7:736\n654#7,3:738\n653#7:741\n654#7,3:743\n653#7:746\n654#7,3:748\n653#7:751\n654#7,3:753\n653#7:756\n654#7,3:758\n653#7:761\n654#7,3:763\n653#7:766\n654#7,3:768\n653#7:771\n654#7,3:773\n653#7:776\n654#7,3:778\n653#7:781\n654#7,3:783\n653#7:786\n654#7,3:788\n653#7:791\n654#7,3:793\n653#7:796\n654#7,3:798\n653#7:801\n654#7,3:803\n653#7:806\n654#7,3:808\n653#7:811\n654#7,3:813\n*S KotlinDebug\n*F\n+ 1 Matrix.kt\nandroidx/compose/ui/graphics/Matrix\n*L\n60#1:682\n61#1:683\n62#1:684\n63#1:685\n64#1:686\n65#1:687\n66#1:688\n67#1:689\n68#1:690\n84#1:702\n85#1:703\n86#1:704\n87#1:705\n88#1:706\n89#1:707\n90#1:708\n91#1:709\n92#1:710\n140#1:719\n141#1:720\n142#1:721\n143#1:722\n144#1:723\n145#1:724\n146#1:725\n147#1:726\n148#1:727\n196#1:737\n197#1:742\n198#1:747\n199#1:752\n200#1:757\n201#1:762\n202#1:767\n203#1:772\n204#1:777\n205#1:782\n206#1:787\n207#1:792\n208#1:797\n209#1:802\n210#1:807\n211#1:812\n233#1:816\n234#1:817\n235#1:818\n236#1:819\n246#1:820\n247#1:821\n248#1:822\n249#1:823\n250#1:824\n251#1:825\n252#1:826\n253#1:827\n254#1:828\n255#1:829\n256#1:830\n257#1:831\n258#1:832\n259#1:833\n260#1:834\n261#1:835\n282#1:836,2\n283#1:838,2\n284#1:840,2\n285#1:842,2\n286#1:844,2\n287#1:846,2\n288#1:848,2\n289#1:850,2\n290#1:852,2\n291#1:854,2\n292#1:856,2\n293#1:858,2\n294#1:860,2\n295#1:862,2\n296#1:864,2\n297#1:866,2\n359#1:868\n360#1:869\n364#1:870\n365#1:871\n369#1:872\n370#1:873\n374#1:874\n375#1:875\n379#1:876,2\n380#1:878,2\n381#1:880,2\n382#1:882,2\n383#1:884,2\n384#1:886,2\n385#1:888,2\n386#1:890,2\n398#1:892\n399#1:893\n403#1:894\n404#1:895\n408#1:896\n409#1:897\n413#1:898\n414#1:899\n418#1:900,2\n419#1:902,2\n420#1:904,2\n421#1:906,2\n422#1:908,2\n423#1:910,2\n424#1:912,2\n425#1:914,2\n437#1:916\n438#1:917\n442#1:918\n443#1:919\n447#1:920\n448#1:921\n452#1:922\n453#1:923\n457#1:924,2\n458#1:926,2\n459#1:928,2\n460#1:930,2\n461#1:932,2\n462#1:934,2\n463#1:936,2\n464#1:938,2\n471#1:940,5\n472#1:945,5\n473#1:950,5\n474#1:955,5\n475#1:960,5\n476#1:965,5\n477#1:970,5\n478#1:975,5\n479#1:980,5\n480#1:985,5\n481#1:990,5\n482#1:995,5\n489#1:1000\n490#1:1001\n491#1:1002\n492#1:1003\n493#1:1004,2\n494#1:1006,2\n495#1:1008,2\n496#1:1010,2\n598#1:1012,2\n599#1:1014,2\n600#1:1016,2\n601#1:1018,2\n602#1:1020,2\n603#1:1022,2\n604#1:1024,2\n605#1:1026,2\n606#1:1028,2\n607#1:1030,2\n608#1:1032,2\n609#1:1034,2\n610#1:1036,2\n611#1:1038,2\n612#1:1040,2\n613#1:1042,2\n70#1:691\n71#1:694\n70#1:692\n71#1:695\n76#1:699,3\n70#1:693\n71#1:696\n74#1:697\n102#1:711\n109#1:712\n116#1:713\n123#1:714\n128#1:715\n129#1:716\n130#1:717\n131#1:718\n158#1:728\n165#1:729\n172#1:730\n179#1:731\n183#1:732\n184#1:733\n185#1:734\n186#1:735\n76#1:698\n196#1:736\n196#1:738,3\n197#1:741\n197#1:743,3\n198#1:746\n198#1:748,3\n199#1:751\n199#1:753,3\n200#1:756\n200#1:758,3\n201#1:761\n201#1:763,3\n202#1:766\n202#1:768,3\n203#1:771\n203#1:773,3\n204#1:776\n204#1:778,3\n205#1:781\n205#1:783,3\n206#1:786\n206#1:788,3\n207#1:791\n207#1:793,3\n208#1:796\n208#1:798,3\n209#1:801\n209#1:803,3\n210#1:806\n210#1:808,3\n211#1:811\n211#1:813,3\n*E\n"})
public final class c2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f37548b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f37549c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f37550d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f37551e = 3;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f37552f = 4;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f37553g = 5;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f37554h = 7;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f37555i = 10;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f37556j = 12;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f37557k = 13;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f37558l = 14;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f37559m = 15;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final float[] f37560a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    private /* synthetic */ c2(float[] fArr) {
        this.f37560a = fArr;
    }

    public static final /* synthetic */ c2 a(float[] fArr) {
        return new c2(fArr);
    }

    @NotNull
    public static float[] b(@NotNull float[] fArr) {
        return fArr;
    }

    public static /* synthetic */ float[] c(float[] fArr, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i10 & 1) != 0) {
            boolean z10 = true & false;
            fArr = new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};
        }
        return b(fArr);
    }

    public static boolean d(float[] fArr, Object obj) {
        return (obj instanceof c2) && Intrinsics.areEqual(fArr, ((c2) obj).A());
    }

    public static final boolean e(float[] fArr, float[] fArr2) {
        return Intrinsics.areEqual(fArr, fArr2);
    }

    public static final float f(float[] fArr, int i10, int i11) {
        return fArr[(i10 * 4) + i11];
    }

    public static int h(float[] fArr) {
        return Arrays.hashCode(fArr);
    }

    public static final void i(float[] fArr) {
        if (fArr.length < 16) {
            return;
        }
        float f10 = fArr[0];
        float f11 = fArr[1];
        float f12 = fArr[2];
        float f13 = fArr[3];
        float f14 = fArr[4];
        float f15 = fArr[5];
        float f16 = fArr[6];
        float f17 = fArr[7];
        float f18 = fArr[8];
        float f19 = fArr[9];
        float f20 = fArr[10];
        float f21 = fArr[11];
        float f22 = fArr[12];
        float f23 = fArr[13];
        float f24 = fArr[14];
        float f25 = fArr[15];
        float f26 = (f10 * f15) - (f11 * f14);
        float f27 = (f10 * f16) - (f12 * f14);
        float f28 = (f10 * f17) - (f13 * f14);
        float f29 = (f11 * f16) - (f12 * f15);
        float f30 = (f11 * f17) - (f13 * f15);
        float f31 = (f12 * f17) - (f13 * f16);
        float f32 = (f18 * f23) - (f19 * f22);
        float f33 = (f18 * f24) - (f20 * f22);
        float f34 = (f18 * f25) - (f21 * f22);
        float f35 = (f19 * f24) - (f20 * f23);
        float f36 = (f19 * f25) - (f21 * f23);
        float f37 = (f20 * f25) - (f21 * f24);
        float f38 = (((((f26 * f37) - (f27 * f36)) + (f28 * f35)) + (f29 * f34)) - (f30 * f33)) + (f31 * f32);
        if (f38 == 0.0f) {
            return;
        }
        float f39 = 1.0f / f38;
        fArr[0] = (((f15 * f37) - (f16 * f36)) + (f17 * f35)) * f39;
        fArr[1] = ((((-f11) * f37) + (f12 * f36)) - (f13 * f35)) * f39;
        fArr[2] = (((f23 * f31) - (f24 * f30)) + (f25 * f29)) * f39;
        fArr[3] = ((((-f19) * f31) + (f20 * f30)) - (f21 * f29)) * f39;
        float f40 = -f14;
        fArr[4] = (((f40 * f37) + (f16 * f34)) - (f17 * f33)) * f39;
        fArr[5] = (((f37 * f10) - (f12 * f34)) + (f13 * f33)) * f39;
        float f41 = -f22;
        fArr[6] = (((f41 * f31) + (f24 * f28)) - (f25 * f27)) * f39;
        fArr[7] = (((f31 * f18) - (f20 * f28)) + (f21 * f27)) * f39;
        fArr[8] = (((f14 * f36) - (f15 * f34)) + (f17 * f32)) * f39;
        fArr[9] = ((((-f10) * f36) + (f34 * f11)) - (f13 * f32)) * f39;
        fArr[10] = (((f22 * f30) - (f23 * f28)) + (f25 * f26)) * f39;
        fArr[11] = ((((-f18) * f30) + (f28 * f19)) - (f21 * f26)) * f39;
        fArr[12] = (((f40 * f35) + (f15 * f33)) - (f16 * f32)) * f39;
        fArr[13] = (((f10 * f35) - (f11 * f33)) + (f12 * f32)) * f39;
        fArr[14] = (((f41 * f29) + (f23 * f27)) - (f24 * f26)) * f39;
        fArr[15] = (((f18 * f29) - (f19 * f27)) + (f20 * f26)) * f39;
    }

    public static final long j(float[] fArr, long j10) {
        if (fArr.length < 16) {
            return j10;
        }
        float f10 = fArr[0];
        float f11 = fArr[1];
        float f12 = fArr[3];
        float f13 = fArr[4];
        float f14 = fArr[5];
        float f15 = fArr[7];
        float f16 = fArr[12];
        float f17 = fArr[13];
        float f18 = fArr[15];
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j10 & com.rabbitmq.client.k0.f265952a));
        float f19 = 1 / (((f12 * fIntBitsToFloat) + (f15 * fIntBitsToFloat2)) + f18);
        if ((Float.floatToRawIntBits(f19) & Integer.MAX_VALUE) >= 2139095040) {
            f19 = 0.0f;
        }
        return n0.g.g((((long) Float.floatToRawIntBits((((f10 * fIntBitsToFloat) + (f13 * fIntBitsToFloat2)) + f16) * f19)) << 32) | (((long) Float.floatToRawIntBits(f19 * ((f11 * fIntBitsToFloat) + (f14 * fIntBitsToFloat2) + f17))) & com.rabbitmq.client.k0.f265952a));
    }

    @NotNull
    public static final n0.j k(float[] fArr, @NotNull n0.j jVar) {
        if (fArr.length < 16) {
            return jVar;
        }
        float f10 = fArr[0];
        float f11 = fArr[1];
        float f12 = fArr[3];
        float f13 = fArr[4];
        float f14 = fArr[5];
        float f15 = fArr[7];
        float f16 = fArr[12];
        float f17 = fArr[13];
        float f18 = fArr[15];
        float fT = jVar.t();
        float fB = jVar.B();
        float fX = jVar.x();
        float fJ = jVar.j();
        float f19 = f12 * fT;
        float f20 = f15 * fB;
        float f21 = 1.0f / ((f19 + f20) + f18);
        if ((Float.floatToRawIntBits(f21) & Integer.MAX_VALUE) >= 2139095040) {
            f21 = 0.0f;
        }
        float f22 = f10 * fT;
        float f23 = f13 * fB;
        float f24 = f21 * (f22 + f23 + f16);
        float f25 = fT * f11;
        float f26 = fB * f14;
        float f27 = f21 * (f25 + f26 + f17);
        float f28 = f15 * fJ;
        float f29 = 1.0f / ((f19 + f28) + f18);
        if ((Float.floatToRawIntBits(f29) & Integer.MAX_VALUE) >= 2139095040) {
            f29 = 0.0f;
        }
        float f30 = f13 * fJ;
        float f31 = (f22 + f30 + f16) * f29;
        float f32 = f14 * fJ;
        float f33 = f29 * (f25 + f32 + f17);
        float f34 = f12 * fX;
        float f35 = 1.0f / ((f20 + f34) + f18);
        if ((Float.floatToRawIntBits(f35) & Integer.MAX_VALUE) >= 2139095040) {
            f35 = 0.0f;
        }
        float f36 = f10 * fX;
        float f37 = f35 * (f36 + f23 + f16);
        float f38 = fX * f11;
        float f39 = f35 * (f26 + f38 + f17);
        float f40 = 1.0f / ((f34 + f28) + f18);
        float f41 = (Float.floatToRawIntBits(f40) & Integer.MAX_VALUE) < 2139095040 ? f40 : 0.0f;
        float f42 = (f36 + f30 + f16) * f41;
        float f43 = f41 * (f38 + f32 + f17);
        return new n0.j(Math.min(f24, Math.min(f31, Math.min(f37, f42))), Math.min(f27, Math.min(f33, Math.min(f39, f43))), Math.max(f24, Math.max(f31, Math.max(f37, f42))), Math.max(f27, Math.max(f33, Math.max(f39, f43))));
    }

    public static final void l(float[] fArr, @NotNull n0.e eVar) {
        if (fArr.length < 16) {
            return;
        }
        float f10 = fArr[0];
        float f11 = fArr[1];
        float f12 = fArr[3];
        float f13 = fArr[4];
        float f14 = fArr[5];
        float f15 = fArr[7];
        float f16 = fArr[12];
        float f17 = fArr[13];
        float f18 = fArr[15];
        float fK = eVar.k();
        float fP = eVar.p();
        float fN = eVar.n();
        float fC = eVar.c();
        float f19 = f12 * fK;
        float f20 = f15 * fP;
        float f21 = 1.0f / ((f19 + f20) + f18);
        if ((Float.floatToRawIntBits(f21) & Integer.MAX_VALUE) >= 2139095040) {
            f21 = 0.0f;
        }
        float f22 = f10 * fK;
        float f23 = f13 * fP;
        float f24 = f21 * (f22 + f23 + f16);
        float f25 = fK * f11;
        float f26 = fP * f14;
        float f27 = f21 * (f25 + f26 + f17);
        float f28 = f15 * fC;
        float f29 = 1.0f / ((f19 + f28) + f18);
        if ((Float.floatToRawIntBits(f29) & Integer.MAX_VALUE) >= 2139095040) {
            f29 = 0.0f;
        }
        float f30 = f13 * fC;
        float f31 = (f22 + f30 + f16) * f29;
        float f32 = f14 * fC;
        float f33 = f29 * (f25 + f32 + f17);
        float f34 = f12 * fN;
        float f35 = 1.0f / ((f20 + f34) + f18);
        if ((Float.floatToRawIntBits(f35) & Integer.MAX_VALUE) >= 2139095040) {
            f35 = 0.0f;
        }
        float f36 = f10 * fN;
        float f37 = f35 * (f36 + f23 + f16);
        float f38 = fN * f11;
        float f39 = f35 * (f26 + f38 + f17);
        float f40 = 1.0f / ((f34 + f28) + f18);
        float f41 = (Float.floatToRawIntBits(f40) & Integer.MAX_VALUE) < 2139095040 ? f40 : 0.0f;
        float f42 = (f36 + f30 + f16) * f41;
        float f43 = f41 * (f38 + f32 + f17);
        eVar.D(Math.min(f24, Math.min(f31, Math.min(f37, f42))));
        eVar.F(Math.min(f27, Math.min(f33, Math.min(f39, f43))));
        eVar.E(Math.max(f24, Math.max(f31, Math.max(f37, f42))));
        eVar.C(Math.max(f27, Math.max(f33, Math.max(f39, f43))));
    }

    public static final void m(float[] fArr) {
        if (fArr.length < 16) {
            return;
        }
        fArr[0] = 1.0f;
        int i10 = 3 >> 0;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
        fArr[4] = 0.0f;
        fArr[5] = 1.0f;
        fArr[6] = 0.0f;
        fArr[7] = 0.0f;
        fArr[8] = 0.0f;
        fArr[9] = 0.0f;
        fArr[10] = 1.0f;
        fArr[11] = 0.0f;
        fArr[12] = 0.0f;
        fArr[13] = 0.0f;
        fArr[14] = 0.0f;
        fArr[15] = 1.0f;
    }

    public static final void n(float[] fArr, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, float f20) {
        double d10 = ((double) f15) * 0.017453292519943295d;
        float fSin = (float) Math.sin(d10);
        float fCos = (float) Math.cos(d10);
        float f21 = -fSin;
        float f22 = (f13 * fCos) - (f14 * fSin);
        float f23 = (f13 * fSin) + (f14 * fCos);
        double d11 = ((double) f16) * 0.017453292519943295d;
        float fSin2 = (float) Math.sin(d11);
        float fCos2 = (float) Math.cos(d11);
        float f24 = -fSin2;
        float f25 = fSin * fSin2;
        float f26 = fSin * fCos2;
        float f27 = fCos * fSin2;
        float f28 = fCos * fCos2;
        float f29 = (f12 * fCos2) + (f23 * fSin2);
        float f30 = ((-f12) * fSin2) + (f23 * fCos2);
        double d12 = ((double) f17) * 0.017453292519943295d;
        float fSin3 = (float) Math.sin(d12);
        float fCos3 = (float) Math.cos(d12);
        float f31 = -fSin3;
        float f32 = (f31 * fCos2) + (fCos3 * f25);
        float f33 = fCos * fCos3;
        float f34 = (f31 * f24) + (fCos3 * f26);
        float f35 = ((fCos2 * fCos3) + (f25 * fSin3)) * f18;
        float f36 = fSin3 * fCos * f18;
        float f37 = ((fCos3 * f24) + (fSin3 * f26)) * f18;
        float f38 = f32 * f19;
        float f39 = f33 * f19;
        float f40 = f34 * f19;
        float f41 = f27 * f20;
        float f42 = f21 * f20;
        float f43 = f28 * f20;
        if (fArr.length < 16) {
            return;
        }
        fArr[0] = f35;
        fArr[1] = f36;
        fArr[2] = f37;
        fArr[3] = 0.0f;
        fArr[4] = f38;
        fArr[5] = f39;
        fArr[6] = f40;
        fArr[7] = 0.0f;
        fArr[8] = f41;
        fArr[9] = f42;
        fArr[10] = f43;
        fArr[11] = 0.0f;
        float f44 = -f10;
        fArr[12] = ((f35 * f44) - (f38 * f11)) + f29 + f10;
        fArr[13] = ((f36 * f44) - (f39 * f11)) + f22 + f11;
        fArr[14] = ((f44 * f37) - (f11 * f40)) + f30;
        fArr[15] = 1.0f;
    }

    public static /* synthetic */ void o(float[] fArr, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, float f20, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = 0.0f;
        }
        if ((i10 & 2) != 0) {
            f11 = 0.0f;
        }
        if ((i10 & 4) != 0) {
            f12 = 0.0f;
        }
        if ((i10 & 8) != 0) {
            f13 = 0.0f;
        }
        if ((i10 & 16) != 0) {
            f14 = 0.0f;
        }
        if ((i10 & 32) != 0) {
            f15 = 0.0f;
        }
        if ((i10 & 64) != 0) {
            f16 = 0.0f;
        }
        if ((i10 & 128) != 0) {
            f17 = 0.0f;
        }
        if ((i10 & 256) != 0) {
            f18 = 1.0f;
        }
        if ((i10 & 512) != 0) {
            f19 = 1.0f;
        }
        if ((i10 & 1024) != 0) {
            f20 = 1.0f;
        }
        n(fArr, f10, f11, f12, f13, f14, f15, f16, f17, f18, f19, f20);
    }

    public static final void p(float[] fArr, float f10) {
        if (fArr.length < 16) {
            return;
        }
        double d10 = ((double) f10) * 0.017453292519943295d;
        float fSin = (float) Math.sin(d10);
        float fCos = (float) Math.cos(d10);
        float f11 = fArr[1];
        float f12 = fArr[2];
        float f13 = fArr[5];
        float f14 = fArr[6];
        float f15 = fArr[9];
        float f16 = fArr[10];
        float f17 = fArr[13];
        float f18 = fArr[14];
        fArr[1] = (f11 * fCos) - (f12 * fSin);
        fArr[2] = (f11 * fSin) + (f12 * fCos);
        fArr[5] = (f13 * fCos) - (f14 * fSin);
        fArr[6] = (f13 * fSin) + (f14 * fCos);
        fArr[9] = (f15 * fCos) - (f16 * fSin);
        fArr[10] = (f15 * fSin) + (f16 * fCos);
        fArr[13] = (f17 * fCos) - (f18 * fSin);
        fArr[14] = (f17 * fSin) + (f18 * fCos);
    }

    public static final void q(float[] fArr, float f10) {
        if (fArr.length < 16) {
            return;
        }
        double d10 = ((double) f10) * 0.017453292519943295d;
        float fSin = (float) Math.sin(d10);
        float fCos = (float) Math.cos(d10);
        float f11 = fArr[0];
        float f12 = fArr[2];
        float f13 = fArr[4];
        float f14 = fArr[6];
        float f15 = fArr[8];
        float f16 = fArr[10];
        float f17 = fArr[12];
        float f18 = fArr[14];
        fArr[0] = (f11 * fCos) + (f12 * fSin);
        fArr[2] = ((-f11) * fSin) + (f12 * fCos);
        fArr[4] = (f13 * fCos) + (f14 * fSin);
        fArr[6] = ((-f13) * fSin) + (f14 * fCos);
        fArr[8] = (f15 * fCos) + (f16 * fSin);
        fArr[10] = ((-f15) * fSin) + (f16 * fCos);
        fArr[12] = (f17 * fCos) + (f18 * fSin);
        fArr[14] = ((-f17) * fSin) + (f18 * fCos);
    }

    public static final void r(float[] fArr, float f10) {
        if (fArr.length < 16) {
            return;
        }
        double d10 = ((double) f10) * 0.017453292519943295d;
        float fSin = (float) Math.sin(d10);
        float fCos = (float) Math.cos(d10);
        float f11 = fArr[0];
        float f12 = fArr[4];
        float f13 = (fCos * f11) + (fSin * f12);
        float f14 = -fSin;
        float f15 = fArr[1];
        float f16 = fArr[5];
        float f17 = (fCos * f15) + (fSin * f16);
        float f18 = fArr[2];
        float f19 = fArr[6];
        float f20 = (fCos * f18) + (fSin * f19);
        float f21 = fArr[3];
        float f22 = fArr[7];
        fArr[0] = f13;
        fArr[1] = f17;
        fArr[2] = f20;
        fArr[3] = (fCos * f21) + (fSin * f22);
        fArr[4] = (f11 * f14) + (f12 * fCos);
        fArr[5] = (f15 * f14) + (f16 * fCos);
        fArr[6] = (f18 * f14) + (f19 * fCos);
        fArr[7] = (f14 * f21) + (fCos * f22);
    }

    public static final void s(float[] fArr, float f10, float f11, float f12) {
        if (fArr.length < 16) {
            return;
        }
        fArr[0] = fArr[0] * f10;
        fArr[1] = fArr[1] * f10;
        fArr[2] = fArr[2] * f10;
        fArr[3] = fArr[3] * f10;
        fArr[4] = fArr[4] * f11;
        fArr[5] = fArr[5] * f11;
        fArr[6] = fArr[6] * f11;
        fArr[7] = fArr[7] * f11;
        fArr[8] = fArr[8] * f12;
        fArr[9] = fArr[9] * f12;
        fArr[10] = fArr[10] * f12;
        fArr[11] = fArr[11] * f12;
    }

    public static /* synthetic */ void t(float[] fArr, float f10, float f11, float f12, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = 1.0f;
        }
        if ((i10 & 2) != 0) {
            f11 = 1.0f;
        }
        if ((i10 & 4) != 0) {
            f12 = 1.0f;
        }
        s(fArr, f10, f11, f12);
    }

    public static final void u(float[] fArr, int i10, int i11, float f10) {
        fArr[(i10 * 4) + i11] = f10;
    }

    public static final void v(float[] fArr, @NotNull float[] fArr2) {
        if (fArr.length >= 16 && fArr2.length >= 16) {
            fArr[0] = fArr2[0];
            fArr[1] = fArr2[1];
            fArr[2] = fArr2[2];
            fArr[3] = fArr2[3];
            fArr[4] = fArr2[4];
            fArr[5] = fArr2[5];
            fArr[6] = fArr2[6];
            fArr[7] = fArr2[7];
            fArr[8] = fArr2[8];
            fArr[9] = fArr2[9];
            fArr[10] = fArr2[10];
            fArr[11] = fArr2[11];
            fArr[12] = fArr2[12];
            fArr[13] = fArr2[13];
            fArr[14] = fArr2[14];
            fArr[15] = fArr2[15];
        }
    }

    public static final void w(float[] fArr, @NotNull float[] fArr2) {
        if (fArr.length >= 16 && fArr2.length >= 16) {
            float f10 = fArr[0];
            float f11 = fArr2[0];
            float f12 = fArr[1];
            float f13 = fArr2[4];
            float f14 = fArr[2];
            float f15 = fArr2[8];
            float f16 = fArr[3];
            float f17 = fArr2[12];
            float f18 = (f10 * f11) + (f12 * f13) + (f14 * f15) + (f16 * f17);
            float f19 = fArr2[1];
            float f20 = fArr2[5];
            float f21 = fArr2[9];
            float f22 = fArr2[13];
            float f23 = (f10 * f19) + (f12 * f20) + (f14 * f21) + (f16 * f22);
            float f24 = fArr2[2];
            float f25 = fArr2[6];
            float f26 = fArr2[10];
            float f27 = fArr2[14];
            float f28 = (f10 * f24) + (f12 * f25) + (f14 * f26) + (f16 * f27);
            float f29 = fArr2[3];
            float f30 = fArr2[7];
            float f31 = fArr2[11];
            float f32 = fArr2[15];
            float f33 = (f10 * f29) + (f12 * f30) + (f14 * f31) + (f16 * f32);
            float f34 = fArr[4];
            float f35 = fArr[5];
            float f36 = fArr[6];
            float f37 = fArr[7];
            float f38 = (f34 * f11) + (f35 * f13) + (f36 * f15) + (f37 * f17);
            float f39 = (f34 * f19) + (f35 * f20) + (f36 * f21) + (f37 * f22);
            float f40 = (f34 * f24) + (f35 * f25) + (f36 * f26) + (f37 * f27);
            float f41 = (f34 * f29) + (f35 * f30) + (f36 * f31) + (f37 * f32);
            float f42 = fArr[8];
            float f43 = fArr[9];
            float f44 = fArr[10];
            float f45 = fArr[11];
            float f46 = (f42 * f11) + (f43 * f13) + (f44 * f15) + (f45 * f17);
            float f47 = (f42 * f19) + (f43 * f20) + (f44 * f21) + (f45 * f22);
            float f48 = (f42 * f24) + (f43 * f25) + (f44 * f26) + (f45 * f27);
            float f49 = (f42 * f29) + (f43 * f30) + (f44 * f31) + (f45 * f32);
            float f50 = fArr[12];
            float f51 = fArr[13];
            float f52 = (f11 * f50) + (f13 * f51);
            float f53 = fArr[14];
            float f54 = f52 + (f15 * f53);
            float f55 = fArr[15];
            fArr[0] = f18;
            fArr[1] = f23;
            fArr[2] = f28;
            fArr[3] = f33;
            fArr[4] = f38;
            fArr[5] = f39;
            fArr[6] = f40;
            fArr[7] = f41;
            fArr[8] = f46;
            fArr[9] = f47;
            fArr[10] = f48;
            fArr[11] = f49;
            fArr[12] = f54 + (f17 * f55);
            fArr[13] = (f19 * f50) + (f20 * f51) + (f21 * f53) + (f22 * f55);
            fArr[14] = (f24 * f50) + (f25 * f51) + (f26 * f53) + (f27 * f55);
            fArr[15] = (f50 * f29) + (f51 * f30) + (f53 * f31) + (f55 * f32);
        }
    }

    @NotNull
    public static String x(float[] fArr) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("\n            |");
        sb2.append(fArr[0]);
        sb2.append(' ');
        sb2.append(fArr[1]);
        sb2.append(' ');
        sb2.append(fArr[2]);
        sb2.append(' ');
        sb2.append(fArr[3]);
        sb2.append("|\n            |");
        int i10 = 6 & 4;
        sb2.append(fArr[4]);
        sb2.append(' ');
        sb2.append(fArr[5]);
        sb2.append(' ');
        sb2.append(fArr[6]);
        sb2.append(' ');
        sb2.append(fArr[7]);
        sb2.append("|\n            |");
        sb2.append(fArr[8]);
        sb2.append(' ');
        sb2.append(fArr[9]);
        sb2.append(' ');
        sb2.append(fArr[10]);
        sb2.append(' ');
        sb2.append(fArr[11]);
        sb2.append("|\n            |");
        sb2.append(fArr[12]);
        sb2.append(' ');
        sb2.append(fArr[13]);
        sb2.append(' ');
        sb2.append(fArr[14]);
        sb2.append(' ');
        sb2.append(fArr[15]);
        sb2.append("|\n        ");
        return StringsKt.p(sb2.toString());
    }

    public static final void y(float[] fArr, float f10, float f11, float f12) {
        if (fArr.length < 16) {
            return;
        }
        float f13 = (fArr[0] * f10) + (fArr[4] * f11) + (fArr[8] * f12) + fArr[12];
        float f14 = (fArr[1] * f10) + (fArr[5] * f11) + (fArr[9] * f12) + fArr[13];
        float f15 = (fArr[2] * f10) + (fArr[6] * f11) + (fArr[10] * f12) + fArr[14];
        float f16 = (fArr[3] * f10) + (fArr[7] * f11) + (fArr[11] * f12) + fArr[15];
        fArr[12] = f13;
        fArr[13] = f14;
        fArr[14] = f15;
        fArr[15] = f16;
    }

    public static /* synthetic */ void z(float[] fArr, float f10, float f11, float f12, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = 0.0f;
        }
        if ((i10 & 2) != 0) {
            f11 = 0.0f;
        }
        if ((i10 & 4) != 0) {
            f12 = 0.0f;
        }
        y(fArr, f10, f11, f12);
    }

    public final /* synthetic */ float[] A() {
        return this.f37560a;
    }

    public boolean equals(Object obj) {
        return d(this.f37560a, obj);
    }

    @NotNull
    public final float[] g() {
        return this.f37560a;
    }

    public int hashCode() {
        return h(this.f37560a);
    }

    @NotNull
    public String toString() {
        return x(this.f37560a);
    }
}
