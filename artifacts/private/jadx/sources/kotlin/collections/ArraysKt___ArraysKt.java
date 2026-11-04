package kotlin.collections;

import a0.b;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.b1;
import kotlin.comparisons.a;
import kotlin.comparisons.g;
import kotlin.e1;
import kotlin.internal.f;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.l0;
import kotlin.l;
import kotlin.m;
import kotlin.m2;
import kotlin.ranges.IntRange;
import kotlin.ranges.r;
import kotlin.sequences.Sequence;
import kotlin.sequences.o;
import kotlin.text.StringsKt;
import kotlin.u;
import kotlin.u0;
import kotlin.u1;
import kotlin.y1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pj.n;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes11.dex */
@SourceDebugExtension({"SMAP\n_Arrays.kt\nKotlin\n*S Kotlin\n*F\n+ 1 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,24486:1\n12624#1,2:24487\n12634#1,2:24489\n1310#1,2:24491\n1318#1,2:24493\n1326#1,2:24495\n1334#1,2:24497\n1342#1,2:24499\n1350#1,2:24501\n1358#1,2:24503\n1366#1,2:24505\n1374#1,2:24507\n2353#1,5:24509\n2366#1,5:24514\n2379#1,5:24519\n2392#1,5:24524\n2405#1,5:24529\n2418#1,5:24534\n2431#1,5:24539\n2444#1,5:24544\n2457#1,5:24549\n4344#1,2:24555\n4354#1,2:24557\n4364#1,2:24559\n4374#1,2:24561\n4384#1,2:24563\n4394#1,2:24565\n4404#1,2:24567\n4414#1,2:24569\n4424#1,2:24571\n4011#1:24573\n13474#1,2:24574\n4012#1,2:24576\n13476#1:24578\n4014#1:24579\n4025#1:24580\n13484#1,2:24581\n4026#1,2:24583\n13486#1:24585\n4028#1:24586\n4039#1:24587\n13494#1,2:24588\n4040#1,2:24590\n13496#1:24592\n4042#1:24593\n4053#1:24594\n13504#1,2:24595\n4054#1,2:24597\n13506#1:24599\n4056#1:24600\n4067#1:24601\n13514#1,2:24602\n4068#1,2:24604\n13516#1:24606\n4070#1:24607\n4081#1:24608\n13524#1,2:24609\n4082#1,2:24611\n13526#1:24613\n4084#1:24614\n4095#1:24615\n13534#1,2:24616\n4096#1,2:24618\n13536#1:24620\n4098#1:24621\n4109#1:24622\n13544#1,2:24623\n4110#1,2:24625\n13546#1:24627\n4112#1:24628\n4123#1:24629\n13554#1,2:24630\n4124#1,2:24632\n13556#1:24634\n4126#1:24635\n13474#1,3:24636\n13484#1,3:24639\n13494#1,3:24642\n13504#1,3:24645\n13514#1,3:24648\n13524#1,3:24651\n13534#1,3:24654\n13544#1,3:24657\n13554#1,3:24660\n4144#1,2:24663\n4254#1,2:24665\n4264#1,2:24667\n4274#1,2:24669\n4284#1,2:24671\n4294#1,2:24673\n4304#1,2:24675\n4314#1,2:24677\n4324#1,2:24679\n4334#1,2:24681\n9188#1,4:24683\n9203#1,4:24687\n9218#1,4:24691\n9233#1,4:24695\n9248#1,4:24699\n9263#1,4:24703\n9278#1,4:24707\n9293#1,4:24711\n9308#1,4:24715\n8901#1,4:24719\n8917#1,4:24723\n8933#1,4:24727\n8949#1,4:24731\n8965#1,4:24735\n8981#1,4:24739\n8997#1,4:24743\n9013#1,4:24747\n9029#1,4:24751\n9045#1,4:24755\n9061#1,4:24759\n9077#1,4:24763\n9093#1,4:24767\n9109#1,4:24771\n9125#1,4:24775\n9141#1,4:24779\n9157#1,4:24783\n9173#1,4:24787\n9476#1,4:24791\n10494#1,5:24795\n10505#1,5:24800\n10516#1,5:24805\n10527#1,5:24810\n10538#1,5:24815\n10549#1,5:24820\n10560#1,5:24825\n10571#1,5:24830\n10582#1,5:24835\n10597#1,5:24840\n10838#1,3:24845\n10841#1,3:24855\n10855#1,3:24858\n10858#1,3:24868\n10872#1,3:24871\n10875#1,3:24881\n10889#1,3:24884\n10892#1,3:24894\n10906#1,3:24897\n10909#1,3:24907\n10923#1,3:24910\n10926#1,3:24920\n10940#1,3:24923\n10943#1,3:24933\n10957#1,3:24936\n10960#1,3:24946\n10974#1,3:24949\n10977#1,3:24959\n10992#1,3:24962\n10995#1,3:24972\n11010#1,3:24975\n11013#1,3:24985\n11028#1,3:24988\n11031#1,3:24998\n11046#1,3:25001\n11049#1,3:25011\n11064#1,3:25014\n11067#1,3:25024\n11082#1,3:25027\n11085#1,3:25037\n11100#1,3:25040\n11103#1,3:25050\n11118#1,3:25053\n11121#1,3:25063\n11136#1,3:25066\n11139#1,3:25076\n11500#1,3:25205\n11510#1,3:25208\n11520#1,3:25211\n11530#1,3:25214\n11540#1,3:25217\n11550#1,3:25220\n11560#1,3:25223\n11570#1,3:25226\n11580#1,3:25229\n11366#1,4:25232\n11379#1,4:25236\n11392#1,4:25240\n11405#1,4:25244\n11418#1,4:25248\n11431#1,4:25252\n11444#1,4:25256\n11457#1,4:25260\n11470#1,4:25264\n11355#1:25268\n13474#1,2:25269\n13476#1:25272\n11356#1:25273\n13474#1,3:25274\n11491#1:25277\n13409#1:25278\n13410#1:25280\n11492#1:25281\n13409#1,2:25282\n13474#1,3:25284\n13484#1,3:25287\n13494#1,3:25290\n13504#1,3:25293\n13514#1,3:25296\n13524#1,3:25299\n13534#1,3:25302\n13544#1,3:25305\n13554#1,3:25308\n20705#1,2:25311\n20707#1,6:25314\n20921#1,2:25320\n20923#1,6:25323\n23098#1,6:25329\n23114#1,6:25335\n23130#1,6:25341\n23146#1,6:25347\n23162#1,6:25353\n23178#1,6:25359\n23194#1,6:25365\n23210#1,6:25371\n23226#1,6:25377\n23332#1,8:25383\n23350#1,8:25391\n23368#1,8:25399\n23386#1,8:25407\n23404#1,8:25415\n23422#1,8:25423\n23440#1,8:25431\n23458#1,8:25439\n23476#1,8:25447\n23574#1,6:25455\n23590#1,6:25461\n23606#1,6:25467\n23622#1,6:25473\n23638#1,6:25479\n23654#1,6:25485\n23670#1,6:25491\n23686#1,6:25497\n1#2:24554\n1#2:25271\n1#2:25279\n1#2:25313\n1#2:25322\n381#3,7:24848\n381#3,7:24861\n381#3,7:24874\n381#3,7:24887\n381#3,7:24900\n381#3,7:24913\n381#3,7:24926\n381#3,7:24939\n381#3,7:24952\n381#3,7:24965\n381#3,7:24978\n381#3,7:24991\n381#3,7:25004\n381#3,7:25017\n381#3,7:25030\n381#3,7:25043\n381#3,7:25056\n381#3,7:25069\n381#3,7:25079\n381#3,7:25086\n381#3,7:25093\n381#3,7:25100\n381#3,7:25107\n381#3,7:25114\n381#3,7:25121\n381#3,7:25128\n381#3,7:25135\n381#3,7:25142\n381#3,7:25149\n381#3,7:25156\n381#3,7:25163\n381#3,7:25170\n381#3,7:25177\n381#3,7:25184\n381#3,7:25191\n381#3,7:25198\n*S KotlinDebug\n*F\n+ 1 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n557#1:24487,2\n566#1:24489,2\n860#1:24491,2\n870#1:24493,2\n880#1:24495,2\n890#1:24497,2\n900#1:24499,2\n910#1:24501,2\n920#1:24503,2\n930#1:24505,2\n940#1:24507,2\n950#1:24509,5\n960#1:24514,5\n970#1:24519,5\n980#1:24524,5\n990#1:24529,5\n1000#1:24534,5\n1010#1:24539,5\n1020#1:24544,5\n1030#1:24549,5\n3829#1:24555,2\n3838#1:24557,2\n3847#1:24559,2\n3856#1:24561,2\n3865#1:24563,2\n3874#1:24565,2\n3883#1:24567,2\n3892#1:24569,2\n3901#1:24571,2\n3912#1:24573\n3912#1:24574,2\n3912#1:24576,2\n3912#1:24578\n3912#1:24579\n3923#1:24580\n3923#1:24581,2\n3923#1:24583,2\n3923#1:24585\n3923#1:24586\n3934#1:24587\n3934#1:24588,2\n3934#1:24590,2\n3934#1:24592\n3934#1:24593\n3945#1:24594\n3945#1:24595,2\n3945#1:24597,2\n3945#1:24599\n3945#1:24600\n3956#1:24601\n3956#1:24602,2\n3956#1:24604,2\n3956#1:24606\n3956#1:24607\n3967#1:24608\n3967#1:24609,2\n3967#1:24611,2\n3967#1:24613\n3967#1:24614\n3978#1:24615\n3978#1:24616,2\n3978#1:24618,2\n3978#1:24620\n3978#1:24621\n3989#1:24622\n3989#1:24623,2\n3989#1:24625,2\n3989#1:24627\n3989#1:24628\n4000#1:24629\n4000#1:24630,2\n4000#1:24632,2\n4000#1:24634\n4000#1:24635\n4011#1:24636,3\n4025#1:24639,3\n4039#1:24642,3\n4053#1:24645,3\n4067#1:24648,3\n4081#1:24651,3\n4095#1:24654,3\n4109#1:24657,3\n4123#1:24660,3\n4135#1:24663,2\n4154#1:24665,2\n4163#1:24667,2\n4172#1:24669,2\n4181#1:24671,2\n4190#1:24673,2\n4199#1:24675,2\n4208#1:24677,2\n4217#1:24679,2\n4226#1:24681,2\n8507#1:24683,4\n8522#1:24687,4\n8537#1:24691,4\n8552#1:24695,4\n8567#1:24699,4\n8582#1:24703,4\n8597#1:24707,4\n8612#1:24711,4\n8627#1:24715,4\n8642#1:24719,4\n8657#1:24723,4\n8672#1:24727,4\n8687#1:24731,4\n8702#1:24735,4\n8717#1:24739,4\n8732#1:24743,4\n8747#1:24747,4\n8762#1:24751,4\n8776#1:24755,4\n8790#1:24759,4\n8804#1:24763,4\n8818#1:24767,4\n8832#1:24771,4\n8846#1:24775,4\n8860#1:24779,4\n8874#1:24783,4\n8888#1:24787,4\n9327#1:24791,4\n10072#1:24795,5\n10081#1:24800,5\n10090#1:24805,5\n10099#1:24810,5\n10108#1:24815,5\n10117#1:24820,5\n10126#1:24825,5\n10135#1:24830,5\n10144#1:24835,5\n10157#1:24840,5\n10613#1:24845,3\n10613#1:24855,3\n10625#1:24858,3\n10625#1:24868,3\n10637#1:24871,3\n10637#1:24881,3\n10649#1:24884,3\n10649#1:24894,3\n10661#1:24897,3\n10661#1:24907,3\n10673#1:24910,3\n10673#1:24920,3\n10685#1:24923,3\n10685#1:24933,3\n10697#1:24936,3\n10697#1:24946,3\n10709#1:24949,3\n10709#1:24959,3\n10722#1:24962,3\n10722#1:24972,3\n10735#1:24975,3\n10735#1:24985,3\n10748#1:24988,3\n10748#1:24998,3\n10761#1:25001,3\n10761#1:25011,3\n10774#1:25014,3\n10774#1:25024,3\n10787#1:25027,3\n10787#1:25037,3\n10800#1:25040,3\n10800#1:25050,3\n10813#1:25053,3\n10813#1:25063,3\n10826#1:25066,3\n10826#1:25076,3\n11165#1:25205,3\n11175#1:25208,3\n11185#1:25211,3\n11195#1:25214,3\n11205#1:25217,3\n11215#1:25220,3\n11225#1:25223,3\n11235#1:25226,3\n11245#1:25229,3\n11255#1:25232,4\n11265#1:25236,4\n11275#1:25240,4\n11285#1:25244,4\n11295#1:25248,4\n11305#1:25252,4\n11315#1:25256,4\n11325#1:25260,4\n11335#1:25264,4\n11345#1:25268\n11345#1:25269,2\n11345#1:25272\n11345#1:25273\n11355#1:25274,3\n11483#1:25277\n11483#1:25278\n11483#1:25280\n11483#1:25281\n11491#1:25282,2\n18991#1:25284,3\n19003#1:25287,3\n19015#1:25290,3\n19027#1:25293,3\n19039#1:25296,3\n19051#1:25299,3\n19063#1:25302,3\n19075#1:25305,3\n19087#1:25308,3\n21535#1:25311,2\n21535#1:25314,6\n21688#1:25320,2\n21688#1:25323,6\n23007#1:25329,6\n23017#1:25335,6\n23027#1:25341,6\n23037#1:25347,6\n23047#1:25353,6\n23057#1:25359,6\n23067#1:25365,6\n23077#1:25371,6\n23087#1:25377,6\n23241#1:25383,8\n23251#1:25391,8\n23261#1:25399,8\n23271#1:25407,8\n23281#1:25415,8\n23291#1:25423,8\n23301#1:25431,8\n23311#1:25439,8\n23321#1:25447,8\n23493#1:25455,6\n23503#1:25461,6\n23513#1:25467,6\n23523#1:25473,6\n23533#1:25479,6\n23543#1:25485,6\n23553#1:25491,6\n23563#1:25497,6\n11345#1:25271\n11483#1:25279\n21535#1:25313\n21688#1:25322\n10613#1:24848,7\n10625#1:24861,7\n10637#1:24874,7\n10649#1:24887,7\n10661#1:24900,7\n10673#1:24913,7\n10685#1:24926,7\n10697#1:24939,7\n10709#1:24952,7\n10722#1:24965,7\n10735#1:24978,7\n10748#1:24991,7\n10761#1:25004,7\n10774#1:25017,7\n10787#1:25030,7\n10800#1:25043,7\n10813#1:25056,7\n10826#1:25069,7\n10840#1:25079,7\n10857#1:25086,7\n10874#1:25093,7\n10891#1:25100,7\n10908#1:25107,7\n10925#1:25114,7\n10942#1:25121,7\n10959#1:25128,7\n10976#1:25135,7\n10994#1:25142,7\n11012#1:25149,7\n11030#1:25156,7\n11048#1:25163,7\n11066#1:25170,7\n11084#1:25177,7\n11102#1:25184,7\n11120#1:25191,7\n11138#1:25198,7\n*E\n"})
public class ArraysKt___ArraysKt extends ArraysKt___ArraysJvmKt {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: kotlin.collections.ArraysKt___ArraysKt$withIndex$1, reason: invalid class name and case insensitive filesystem */
    static final class C28471<T> extends l0 implements Function0<Iterator<? extends T>> {
        final /* synthetic */ T[] $this_withIndex;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C28471(T[] tArr) {
            super(0);
            this.$this_withIndex = tArr;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Iterator<T> invoke() {
            return i.a(this.$this_withIndex);
        }
    }

    /* JADX INFO: renamed from: kotlin.collections.ArraysKt___ArraysKt$withIndex$2, reason: invalid class name */
    static final class AnonymousClass2 extends l0 implements Function0<Iterator<? extends Byte>> {
        final /* synthetic */ byte[] $this_withIndex;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(byte[] bArr) {
            super(0);
            this.$this_withIndex = bArr;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Iterator<? extends Byte> invoke() {
            return j.b(this.$this_withIndex);
        }
    }

    /* JADX INFO: renamed from: kotlin.collections.ArraysKt___ArraysKt$withIndex$3, reason: invalid class name */
    static final class AnonymousClass3 extends l0 implements Function0<Iterator<? extends Short>> {
        final /* synthetic */ short[] $this_withIndex;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(short[] sArr) {
            super(0);
            this.$this_withIndex = sArr;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Iterator<? extends Short> invoke() {
            return j.h(this.$this_withIndex);
        }
    }

    /* JADX INFO: renamed from: kotlin.collections.ArraysKt___ArraysKt$withIndex$4, reason: invalid class name */
    static final class AnonymousClass4 extends l0 implements Function0<Iterator<? extends Integer>> {
        final /* synthetic */ int[] $this_withIndex;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass4(int[] iArr) {
            super(0);
            this.$this_withIndex = iArr;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Iterator<? extends Integer> invoke() {
            return j.f(this.$this_withIndex);
        }
    }

    /* JADX INFO: renamed from: kotlin.collections.ArraysKt___ArraysKt$withIndex$5, reason: invalid class name */
    static final class AnonymousClass5 extends l0 implements Function0<Iterator<? extends Long>> {
        final /* synthetic */ long[] $this_withIndex;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass5(long[] jArr) {
            super(0);
            this.$this_withIndex = jArr;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Iterator<? extends Long> invoke() {
            return j.g(this.$this_withIndex);
        }
    }

    /* JADX INFO: renamed from: kotlin.collections.ArraysKt___ArraysKt$withIndex$6, reason: invalid class name */
    static final class AnonymousClass6 extends l0 implements Function0<Iterator<? extends Float>> {
        final /* synthetic */ float[] $this_withIndex;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass6(float[] fArr) {
            super(0);
            this.$this_withIndex = fArr;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Iterator<? extends Float> invoke() {
            return j.e(this.$this_withIndex);
        }
    }

    /* JADX INFO: renamed from: kotlin.collections.ArraysKt___ArraysKt$withIndex$7, reason: invalid class name */
    static final class AnonymousClass7 extends l0 implements Function0<Iterator<? extends Double>> {
        final /* synthetic */ double[] $this_withIndex;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass7(double[] dArr) {
            super(0);
            this.$this_withIndex = dArr;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Iterator<? extends Double> invoke() {
            return j.d(this.$this_withIndex);
        }
    }

    /* JADX INFO: renamed from: kotlin.collections.ArraysKt___ArraysKt$withIndex$8, reason: invalid class name */
    static final class AnonymousClass8 extends l0 implements Function0<Iterator<? extends Boolean>> {
        final /* synthetic */ boolean[] $this_withIndex;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass8(boolean[] zArr) {
            super(0);
            this.$this_withIndex = zArr;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Iterator<? extends Boolean> invoke() {
            return j.a(this.$this_withIndex);
        }
    }

    /* JADX INFO: renamed from: kotlin.collections.ArraysKt___ArraysKt$withIndex$9, reason: invalid class name */
    static final class AnonymousClass9 extends l0 implements Function0<Iterator<? extends Character>> {
        final /* synthetic */ char[] $this_withIndex;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass9(char[] cArr) {
            super(0);
            this.$this_withIndex = cArr;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Iterator<? extends Character> invoke() {
            return j.c(this.$this_withIndex);
        }
    }

    public static final <T> boolean all(@NotNull T[] tArr, @NotNull Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (T t10 : tArr) {
            if (!predicate.invoke(t10).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static final <T> boolean any(@NotNull T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        return !(tArr.length == 0);
    }

    @NotNull
    public static <T> Iterable<T> asIterable(@NotNull T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        return tArr.length == 0 ? CollectionsKt__CollectionsKt.emptyList() : new ArraysKt___ArraysKt$asIterable$$inlined$Iterable$1(tArr);
    }

    @NotNull
    public static <T> Sequence<T> asSequence(@NotNull final T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        return tArr.length == 0 ? o.g() : new Sequence<T>() { // from class: kotlin.collections.ArraysKt___ArraysKt$asSequence$$inlined$Sequence$1
            @Override // kotlin.sequences.Sequence
            public Iterator<T> iterator() {
                return i.a(tArr);
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <T, K, V> Map<K, V> associate(@NotNull T[] tArr, @NotNull Function1<? super T, ? extends Pair<? extends K, ? extends V>> transform) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(r.u(MapsKt__MapsJVMKt.mapCapacity(tArr.length), 16));
        for (b bVar : tArr) {
            Pair<? extends K, ? extends V> pairInvoke = transform.invoke(bVar);
            linkedHashMap.put(pairInvoke.getFirst(), pairInvoke.getSecond());
        }
        return linkedHashMap;
    }

    @NotNull
    public static final <T, K> Map<K, T> associateBy(@NotNull T[] tArr, @NotNull Function1<? super T, ? extends K> keySelector) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(r.u(MapsKt__MapsJVMKt.mapCapacity(tArr.length), 16));
        for (T t10 : tArr) {
            linkedHashMap.put(keySelector.invoke(t10), t10);
        }
        return linkedHashMap;
    }

    @NotNull
    public static final <T, K, M extends Map<? super K, ? super T>> M associateByTo(@NotNull T[] tArr, @NotNull M destination, @NotNull Function1<? super T, ? extends K> keySelector) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        for (T t10 : tArr) {
            destination.put(keySelector.invoke(t10), t10);
        }
        return destination;
    }

    @NotNull
    public static final <T, K, V, M extends Map<? super K, ? super V>> M associateTo(@NotNull T[] tArr, @NotNull M destination, @NotNull Function1<? super T, ? extends Pair<? extends K, ? extends V>> transform) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        for (T t10 : tArr) {
            Pair<? extends K, ? extends V> pairInvoke = transform.invoke(t10);
            destination.put(pairInvoke.getFirst(), pairInvoke.getSecond());
        }
        return destination;
    }

    @e1(version = "1.4")
    @NotNull
    public static final <K, V> Map<K, V> associateWith(@NotNull K[] kArr, @NotNull Function1<? super K, ? extends V> valueSelector) {
        Intrinsics.checkNotNullParameter(kArr, "<this>");
        Intrinsics.checkNotNullParameter(valueSelector, "valueSelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(r.u(MapsKt__MapsJVMKt.mapCapacity(kArr.length), 16));
        for (K k10 : kArr) {
            linkedHashMap.put(k10, valueSelector.invoke(k10));
        }
        return linkedHashMap;
    }

    @e1(version = "1.4")
    @NotNull
    public static final <K, V, M extends Map<? super K, ? super V>> M associateWithTo(@NotNull K[] kArr, @NotNull M destination, @NotNull Function1<? super K, ? extends V> valueSelector) {
        Intrinsics.checkNotNullParameter(kArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(valueSelector, "valueSelector");
        for (K k10 : kArr) {
            destination.put(k10, valueSelector.invoke(k10));
        }
        return destination;
    }

    public static final double average(@NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        double d10 = 0.0d;
        int i10 = 0;
        for (byte b10 : bArr) {
            d10 += (double) b10;
            i10++;
        }
        if (i10 == 0) {
            return Double.NaN;
        }
        return d10 / ((double) i10);
    }

    @oj.i(name = "averageOfByte")
    public static final double averageOfByte(@NotNull Byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        double dByteValue = 0.0d;
        int i10 = 0;
        for (Byte b10 : bArr) {
            dByteValue += (double) b10.byteValue();
            i10++;
        }
        if (i10 == 0) {
            return Double.NaN;
        }
        return dByteValue / ((double) i10);
    }

    @oj.i(name = "averageOfDouble")
    public static final double averageOfDouble(@NotNull Double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        double dDoubleValue = 0.0d;
        int i10 = 0;
        for (Double d10 : dArr) {
            dDoubleValue += d10.doubleValue();
            i10++;
        }
        if (i10 == 0) {
            return Double.NaN;
        }
        return dDoubleValue / ((double) i10);
    }

    @oj.i(name = "averageOfFloat")
    public static final double averageOfFloat(@NotNull Float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        double dFloatValue = 0.0d;
        int i10 = 0;
        for (Float f10 : fArr) {
            dFloatValue += (double) f10.floatValue();
            i10++;
        }
        if (i10 == 0) {
            return Double.NaN;
        }
        return dFloatValue / ((double) i10);
    }

    @oj.i(name = "averageOfInt")
    public static final double averageOfInt(@NotNull Integer[] numArr) {
        Intrinsics.checkNotNullParameter(numArr, "<this>");
        double dIntValue = 0.0d;
        int i10 = 0;
        for (Integer num : numArr) {
            dIntValue += (double) num.intValue();
            i10++;
        }
        if (i10 == 0) {
            return Double.NaN;
        }
        return dIntValue / ((double) i10);
    }

    @oj.i(name = "averageOfLong")
    public static final double averageOfLong(@NotNull Long[] lArr) {
        Intrinsics.checkNotNullParameter(lArr, "<this>");
        double dLongValue = 0.0d;
        int i10 = 0;
        for (Long l10 : lArr) {
            dLongValue += l10.longValue();
            i10++;
        }
        if (i10 == 0) {
            return Double.NaN;
        }
        return dLongValue / ((double) i10);
    }

    @oj.i(name = "averageOfShort")
    public static final double averageOfShort(@NotNull Short[] shArr) {
        Intrinsics.checkNotNullParameter(shArr, "<this>");
        double dShortValue = 0.0d;
        int i10 = 0;
        for (Short sh2 : shArr) {
            dShortValue += (double) sh2.shortValue();
            i10++;
        }
        if (i10 == 0) {
            return Double.NaN;
        }
        return dShortValue / ((double) i10);
    }

    @f
    private static final <T> T component1(T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        return tArr[0];
    }

    @f
    private static final <T> T component2(T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        return tArr[1];
    }

    @f
    private static final <T> T component3(T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        return tArr[2];
    }

    @f
    private static final <T> T component4(T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        return tArr[3];
    }

    @f
    private static final <T> T component5(T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        return tArr[4];
    }

    public static <T> boolean contains(@NotNull T[] tArr, T t10) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        return indexOf(tArr, t10) >= 0;
    }

    @f
    private static final <T> int count(T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        return tArr.length;
    }

    @NotNull
    public static final <T> List<T> distinct(@NotNull T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        return CollectionsKt___CollectionsKt.toList(toMutableSet(tArr));
    }

    @NotNull
    public static final <T, K> List<T> distinctBy(@NotNull T[] tArr, @NotNull Function1<? super T, ? extends K> selector) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (T t10 : tArr) {
            if (hashSet.add(selector.invoke(t10))) {
                arrayList.add(t10);
            }
        }
        return arrayList;
    }

    @NotNull
    public static <T> List<T> drop(@NotNull T[] tArr, int i10) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        if (i10 >= 0) {
            return takeLast(tArr, r.u(tArr.length - i10, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
    }

    @NotNull
    public static final <T> List<T> dropLast(@NotNull T[] tArr, int i10) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        if (i10 >= 0) {
            return take(tArr, r.u(tArr.length - i10, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
    }

    @NotNull
    public static final <T> List<T> dropLastWhile(@NotNull T[] tArr, @NotNull Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (int lastIndex = getLastIndex(tArr); -1 < lastIndex; lastIndex--) {
            if (!predicate.invoke(tArr[lastIndex]).booleanValue()) {
                return take(tArr, lastIndex + 1);
            }
        }
        return CollectionsKt__CollectionsKt.emptyList();
    }

    @NotNull
    public static final <T> List<T> dropWhile(@NotNull T[] tArr, @NotNull Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        boolean z10 = false;
        for (T t10 : tArr) {
            if (z10) {
                arrayList.add(t10);
            } else if (!predicate.invoke(t10).booleanValue()) {
                arrayList.add(t10);
                z10 = true;
            }
        }
        return arrayList;
    }

    @f
    private static final <T> T elementAtOrElse(T[] tArr, int i10, Function1<? super Integer, ? extends T> defaultValue) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        return (i10 < 0 || i10 >= tArr.length) ? defaultValue.invoke(Integer.valueOf(i10)) : tArr[i10];
    }

    @f
    private static final <T> T elementAtOrNull(T[] tArr, int i10) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        return (T) getOrNull(tArr, i10);
    }

    @NotNull
    public static final <T> List<T> filter(@NotNull T[] tArr, @NotNull Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (T t10 : tArr) {
            if (predicate.invoke(t10).booleanValue()) {
                arrayList.add(t10);
            }
        }
        return arrayList;
    }

    @NotNull
    public static final <T> List<T> filterIndexed(@NotNull T[] tArr, @NotNull Function2<? super Integer, ? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int length = tArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            T t10 = tArr[i10];
            int i12 = i11 + 1;
            if (predicate.invoke(Integer.valueOf(i11), t10).booleanValue()) {
                arrayList.add(t10);
            }
            i10++;
            i11 = i12;
        }
        return arrayList;
    }

    @NotNull
    public static final <T, C extends Collection<? super T>> C filterIndexedTo(@NotNull T[] tArr, @NotNull C destination, @NotNull Function2<? super Integer, ? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = tArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            T t10 = tArr[i10];
            int i12 = i11 + 1;
            if (predicate.invoke(Integer.valueOf(i11), t10).booleanValue()) {
                destination.add(t10);
            }
            i10++;
            i11 = i12;
        }
        return destination;
    }

    public static final /* synthetic */ <R> List<R> filterIsInstance(Object[] objArr) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        ArrayList arrayList = new ArrayList();
        for (Object obj : objArr) {
            Intrinsics.reifiedOperationMarker(3, "R");
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final /* synthetic */ <R, C extends Collection<? super R>> C filterIsInstanceTo(Object[] objArr, C destination) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        for (Object obj : objArr) {
            Intrinsics.reifiedOperationMarker(3, "R");
            if (obj != null) {
                destination.add(obj);
            }
        }
        return destination;
    }

    @NotNull
    public static final <T> List<T> filterNot(@NotNull T[] tArr, @NotNull Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (T t10 : tArr) {
            if (!predicate.invoke(t10).booleanValue()) {
                arrayList.add(t10);
            }
        }
        return arrayList;
    }

    @NotNull
    public static <T> List<T> filterNotNull(@NotNull T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        return (List) filterNotNullTo(tArr, new ArrayList());
    }

    @NotNull
    public static final <C extends Collection<? super T>, T> C filterNotNullTo(@NotNull T[] tArr, @NotNull C destination) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        for (T t10 : tArr) {
            if (t10 != null) {
                destination.add(t10);
            }
        }
        return destination;
    }

    @NotNull
    public static final <T, C extends Collection<? super T>> C filterNotTo(@NotNull T[] tArr, @NotNull C destination, @NotNull Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (T t10 : tArr) {
            if (!predicate.invoke(t10).booleanValue()) {
                destination.add(t10);
            }
        }
        return destination;
    }

    @NotNull
    public static final <T, C extends Collection<? super T>> C filterTo(@NotNull T[] tArr, @NotNull C destination, @NotNull Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (T t10 : tArr) {
            if (predicate.invoke(t10).booleanValue()) {
                destination.add(t10);
            }
        }
        return destination;
    }

    @f
    private static final <T> T find(T[] tArr, Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (T t10 : tArr) {
            if (predicate.invoke(t10).booleanValue()) {
                return t10;
            }
        }
        return null;
    }

    @f
    private static final <T> T findLast(T[] tArr, Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = tArr.length - 1;
        if (length < 0) {
            return null;
        }
        while (true) {
            int i10 = length - 1;
            T t10 = tArr[length];
            if (predicate.invoke(t10).booleanValue()) {
                return t10;
            }
            if (i10 < 0) {
                return null;
            }
            length = i10;
        }
    }

    public static <T> T first(@NotNull T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        if (tArr.length != 0) {
            return tArr[0];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0021  */
    /* JADX WARN: Code duplicated, block: B:9:0x0020 A[RETURN] */
    @e1(version = "1.5")
    @f
    private static final <T, R> R firstNotNullOf(T[] tArr, Function1<? super T, ? extends R> transform) {
        R rInvoke;
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        for (T t10 : tArr) {
            rInvoke = transform.invoke(t10);
            if (rInvoke != null) {
                if (rInvoke != null) {
                    return rInvoke;
                }
                throw new NoSuchElementException("No element of the array was transformed to a non-null value.");
            }
        }
        rInvoke = null;
        if (rInvoke != null) {
            return rInvoke;
        }
        throw new NoSuchElementException("No element of the array was transformed to a non-null value.");
    }

    @e1(version = "1.5")
    @f
    private static final <T, R> R firstNotNullOfOrNull(T[] tArr, Function1<? super T, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        for (T t10 : tArr) {
            R rInvoke = transform.invoke(t10);
            if (rInvoke != null) {
                return rInvoke;
            }
        }
        return null;
    }

    @Nullable
    public static <T> T firstOrNull(@NotNull T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        if (tArr.length == 0) {
            return null;
        }
        return tArr[0];
    }

    @NotNull
    public static final <T, R> List<R> flatMap(@NotNull T[] tArr, @NotNull Function1<? super T, ? extends Iterable<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList();
        for (T t10 : tArr) {
            CollectionsKt__MutableCollectionsKt.addAll(arrayList, transform.invoke(t10));
        }
        return arrayList;
    }

    @u0
    @e1(version = "1.4")
    @f
    @oj.i(name = "flatMapIndexedIterable")
    private static final <T, R> List<R> flatMapIndexedIterable(T[] tArr, Function2<? super Integer, ? super T, ? extends Iterable<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList();
        int length = tArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            CollectionsKt__MutableCollectionsKt.addAll(arrayList, transform.invoke(Integer.valueOf(i11), tArr[i10]));
            i10++;
            i11++;
        }
        return arrayList;
    }

    @u0
    @e1(version = "1.4")
    @f
    @oj.i(name = "flatMapIndexedIterableTo")
    private static final <T, R, C extends Collection<? super R>> C flatMapIndexedIterableTo(T[] tArr, C destination, Function2<? super Integer, ? super T, ? extends Iterable<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int length = tArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            CollectionsKt__MutableCollectionsKt.addAll(destination, transform.invoke(Integer.valueOf(i11), tArr[i10]));
            i10++;
            i11++;
        }
        return destination;
    }

    @u0
    @e1(version = "1.4")
    @f
    @oj.i(name = "flatMapIndexedSequence")
    private static final <T, R> List<R> flatMapIndexedSequence(T[] tArr, Function2<? super Integer, ? super T, ? extends Sequence<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList();
        int length = tArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            CollectionsKt__MutableCollectionsKt.addAll(arrayList, transform.invoke(Integer.valueOf(i11), tArr[i10]));
            i10++;
            i11++;
        }
        return arrayList;
    }

    @u0
    @e1(version = "1.4")
    @f
    @oj.i(name = "flatMapIndexedSequenceTo")
    private static final <T, R, C extends Collection<? super R>> C flatMapIndexedSequenceTo(T[] tArr, C destination, Function2<? super Integer, ? super T, ? extends Sequence<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int length = tArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            CollectionsKt__MutableCollectionsKt.addAll(destination, transform.invoke(Integer.valueOf(i11), tArr[i10]));
            i10++;
            i11++;
        }
        return destination;
    }

    @u0
    @e1(version = "1.4")
    @NotNull
    @oj.i(name = "flatMapSequence")
    public static final <T, R> List<R> flatMapSequence(@NotNull T[] tArr, @NotNull Function1<? super T, ? extends Sequence<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList();
        for (T t10 : tArr) {
            CollectionsKt__MutableCollectionsKt.addAll(arrayList, transform.invoke(t10));
        }
        return arrayList;
    }

    @u0
    @e1(version = "1.4")
    @NotNull
    @oj.i(name = "flatMapSequenceTo")
    public static final <T, R, C extends Collection<? super R>> C flatMapSequenceTo(@NotNull T[] tArr, @NotNull C destination, @NotNull Function1<? super T, ? extends Sequence<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        for (T t10 : tArr) {
            CollectionsKt__MutableCollectionsKt.addAll(destination, transform.invoke(t10));
        }
        return destination;
    }

    @NotNull
    public static final <T, R, C extends Collection<? super R>> C flatMapTo(@NotNull T[] tArr, @NotNull C destination, @NotNull Function1<? super T, ? extends Iterable<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        for (T t10 : tArr) {
            CollectionsKt__MutableCollectionsKt.addAll(destination, transform.invoke(t10));
        }
        return destination;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T, R> R fold(@NotNull T[] tArr, R r10, @NotNull Function2<? super R, ? super T, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        for (b bVar : tArr) {
            r10 = operation.invoke(r10, bVar);
        }
        return r10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T, R> R foldIndexed(@NotNull T[] tArr, R r10, @NotNull n<? super Integer, ? super R, ? super T, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int length = tArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            r10 = operation.invoke(Integer.valueOf(i11), r10, tArr[i10]);
            i10++;
            i11++;
        }
        return r10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T, R> R foldRight(@NotNull T[] tArr, R r10, @NotNull Function2<? super T, ? super R, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        for (int lastIndex = getLastIndex(tArr); lastIndex >= 0; lastIndex--) {
            r10 = operation.invoke(tArr[lastIndex], r10);
        }
        return r10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T, R> R foldRightIndexed(@NotNull T[] tArr, R r10, @NotNull n<? super Integer, ? super T, ? super R, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        for (int lastIndex = getLastIndex(tArr); lastIndex >= 0; lastIndex--) {
            r10 = operation.invoke(Integer.valueOf(lastIndex), tArr[lastIndex], r10);
        }
        return r10;
    }

    public static final <T> void forEach(@NotNull T[] tArr, @NotNull Function1<? super T, Unit> action) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        for (T t10 : tArr) {
            action.invoke(t10);
        }
    }

    public static final <T> void forEachIndexed(@NotNull T[] tArr, @NotNull Function2<? super Integer, ? super T, Unit> action) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        int length = tArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            action.invoke(Integer.valueOf(i11), tArr[i10]);
            i10++;
            i11++;
        }
    }

    @NotNull
    public static <T> IntRange getIndices(@NotNull T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        return new IntRange(0, getLastIndex(tArr));
    }

    public static <T> int getLastIndex(@NotNull T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        return tArr.length - 1;
    }

    @f
    private static final <T> T getOrElse(T[] tArr, int i10, Function1<? super Integer, ? extends T> defaultValue) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        return (i10 < 0 || i10 >= tArr.length) ? defaultValue.invoke(Integer.valueOf(i10)) : tArr[i10];
    }

    @Nullable
    public static <T> T getOrNull(@NotNull T[] tArr, int i10) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        if (i10 < 0 || i10 >= tArr.length) {
            return null;
        }
        return tArr[i10];
    }

    @NotNull
    public static final <T, K> Map<K, List<T>> groupBy(@NotNull T[] tArr, @NotNull Function1<? super T, ? extends K> keySelector) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int i10 = 4 ^ 0;
        for (T t10 : tArr) {
            K kInvoke = keySelector.invoke(t10);
            Object arrayList = linkedHashMap.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(kInvoke, arrayList);
            }
            ((List) arrayList).add(t10);
        }
        return linkedHashMap;
    }

    @NotNull
    public static final <T, K, M extends Map<? super K, List<T>>> M groupByTo(@NotNull T[] tArr, @NotNull M destination, @NotNull Function1<? super T, ? extends K> keySelector) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        for (T t10 : tArr) {
            K kInvoke = keySelector.invoke(t10);
            Object arrayList = destination.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                destination.put(kInvoke, arrayList);
            }
            ((List) arrayList).add(t10);
        }
        return destination;
    }

    @e1(version = com.rabbitmq.tools.jsonrpc.j.f266120g)
    @NotNull
    public static final <T, K> Grouping<T, K> groupingBy(@NotNull final T[] tArr, @NotNull final Function1<? super T, ? extends K> keySelector) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        return new Grouping<T, K>() { // from class: kotlin.collections.ArraysKt___ArraysKt.groupingBy.1
            @Override // kotlin.collections.Grouping
            public K keyOf(T t10) {
                return keySelector.invoke(t10);
            }

            @Override // kotlin.collections.Grouping
            public Iterator<T> sourceIterator() {
                return i.a(tArr);
            }
        };
    }

    public static <T> int indexOf(@NotNull T[] tArr, T t10) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        int i10 = 0;
        if (t10 == null) {
            int length = tArr.length;
            while (i10 < length) {
                if (tArr[i10] == null) {
                    return i10;
                }
                i10++;
            }
            return -1;
        }
        int length2 = tArr.length;
        while (i10 < length2) {
            if (Intrinsics.areEqual(t10, tArr[i10])) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public static final <T> int indexOfFirst(@NotNull T[] tArr, @NotNull Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = tArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (predicate.invoke(tArr[i10]).booleanValue()) {
                return i10;
            }
        }
        return -1;
    }

    public static final <T> int indexOfLast(@NotNull T[] tArr, @NotNull Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = tArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i10 = length - 1;
                if (predicate.invoke(tArr[length]).booleanValue()) {
                    return length;
                }
                if (i10 >= 0) {
                    length = i10;
                }
            }
        }
        return -1;
    }

    @NotNull
    public static final <T> Set<T> intersect(@NotNull T[] tArr, @NotNull Iterable<? extends T> other) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Set<T> mutableSet = toMutableSet(tArr);
        CollectionsKt__MutableCollectionsKt.retainAll(mutableSet, other);
        return mutableSet;
    }

    @f
    private static final <T> boolean isEmpty(T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        return tArr.length == 0;
    }

    @f
    private static final <T> boolean isNotEmpty(T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        return !(tArr.length == 0);
    }

    @NotNull
    public static final <T, A extends Appendable> A joinTo(@NotNull T[] tArr, @NotNull A buffer, @NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence postfix, int i10, @NotNull CharSequence truncated, @Nullable Function1<? super T, ? extends CharSequence> function1) throws IOException {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(truncated, "truncated");
        buffer.append(prefix);
        int i11 = 0;
        for (T t10 : tArr) {
            i11++;
            if (i11 > 1) {
                buffer.append(separator);
            }
            if (i10 >= 0 && i11 > i10) {
                break;
            }
            StringsKt.b(buffer, t10, function1);
        }
        if (i10 >= 0 && i11 > i10) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    @NotNull
    public static final <T> String joinToString(@NotNull T[] tArr, @NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence postfix, int i10, @NotNull CharSequence truncated, @Nullable Function1<? super T, ? extends CharSequence> function1) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(truncated, "truncated");
        String string = ((StringBuilder) joinTo(tArr, new StringBuilder(), separator, prefix, postfix, i10, truncated, function1)).toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public static /* synthetic */ String joinToString$default(Object[] objArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, Function1 function1, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            charSequence = ", ";
        }
        if ((i11 & 2) != 0) {
            charSequence2 = "";
        }
        if ((i11 & 4) != 0) {
            charSequence3 = "";
        }
        if ((i11 & 8) != 0) {
            i10 = -1;
        }
        if ((i11 & 16) != 0) {
            charSequence4 = "...";
        }
        if ((i11 & 32) != 0) {
            function1 = null;
            boolean z10 = true;
        }
        return joinToString(objArr, charSequence, charSequence2, charSequence3, i10, charSequence4, function1);
    }

    public static <T> T last(@NotNull T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        if (tArr.length != 0) {
            return tArr[getLastIndex(tArr)];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static <T> int lastIndexOf(@NotNull T[] tArr, T t10) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        if (t10 == null) {
            int length = tArr.length - 1;
            if (length >= 0) {
                while (true) {
                    int i10 = length - 1;
                    if (tArr[length] == null) {
                        return length;
                    }
                    if (i10 >= 0) {
                        length = i10;
                    }
                }
            }
        } else {
            int length2 = tArr.length - 1;
            if (length2 >= 0) {
                while (true) {
                    int i11 = length2 - 1;
                    if (Intrinsics.areEqual(t10, tArr[length2])) {
                        return length2;
                    }
                    if (i11 >= 0) {
                        length2 = i11;
                    }
                }
            }
        }
        return -1;
    }

    @Nullable
    public static <T> T lastOrNull(@NotNull T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        if (tArr.length == 0) {
            return null;
        }
        return tArr[tArr.length - 1];
    }

    @NotNull
    public static final <T, R> List<R> map(@NotNull T[] tArr, @NotNull Function1<? super T, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList(tArr.length);
        for (T t10 : tArr) {
            arrayList.add(transform.invoke(t10));
        }
        return arrayList;
    }

    @NotNull
    public static final <T, R> List<R> mapIndexed(@NotNull T[] tArr, @NotNull Function2<? super Integer, ? super T, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList(tArr.length);
        int length = tArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            arrayList.add(transform.invoke(Integer.valueOf(i11), tArr[i10]));
            i10++;
            i11++;
        }
        return arrayList;
    }

    @NotNull
    public static final <T, R> List<R> mapIndexedNotNull(@NotNull T[] tArr, @NotNull Function2<? super Integer, ? super T, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList();
        int length = tArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            int i12 = i11 + 1;
            R rInvoke = transform.invoke(Integer.valueOf(i11), tArr[i10]);
            if (rInvoke != null) {
                arrayList.add(rInvoke);
            }
            i10++;
            i11 = i12;
        }
        return arrayList;
    }

    @NotNull
    public static final <T, R, C extends Collection<? super R>> C mapIndexedNotNullTo(@NotNull T[] tArr, @NotNull C destination, @NotNull Function2<? super Integer, ? super T, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int length = tArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            int i12 = i11 + 1;
            R rInvoke = transform.invoke(Integer.valueOf(i11), tArr[i10]);
            if (rInvoke != null) {
                destination.add(rInvoke);
            }
            i10++;
            i11 = i12;
        }
        return destination;
    }

    @NotNull
    public static final <T, R, C extends Collection<? super R>> C mapIndexedTo(@NotNull T[] tArr, @NotNull C destination, @NotNull Function2<? super Integer, ? super T, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int length = tArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            destination.add(transform.invoke(Integer.valueOf(i11), tArr[i10]));
            i10++;
            i11++;
        }
        return destination;
    }

    @NotNull
    public static final <T, R> List<R> mapNotNull(@NotNull T[] tArr, @NotNull Function1<? super T, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList();
        for (T t10 : tArr) {
            R rInvoke = transform.invoke(t10);
            if (rInvoke != null) {
                arrayList.add(rInvoke);
            }
        }
        return arrayList;
    }

    @NotNull
    public static final <T, R, C extends Collection<? super R>> C mapNotNullTo(@NotNull T[] tArr, @NotNull C destination, @NotNull Function1<? super T, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        for (T t10 : tArr) {
            R rInvoke = transform.invoke(t10);
            if (rInvoke != null) {
                destination.add(rInvoke);
            }
        }
        return destination;
    }

    @NotNull
    public static final <T, R, C extends Collection<? super R>> C mapTo(@NotNull T[] tArr, @NotNull C destination, @NotNull Function1<? super T, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        for (T t10 : tArr) {
            destination.add(transform.invoke(t10));
        }
        return destination;
    }

    @e1(version = "1.4")
    @Nullable
    public static final <T, R extends Comparable<? super R>> T maxByOrNull(@NotNull T[] tArr, @NotNull Function1<? super T, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (tArr.length == 0) {
            return null;
        }
        T t10 = tArr[0];
        int lastIndex = getLastIndex(tArr);
        if (lastIndex != 0) {
            R rInvoke = selector.invoke(t10);
            int i10 = 1;
            if (1 <= lastIndex) {
                while (true) {
                    T t11 = tArr[i10];
                    R rInvoke2 = selector.invoke(t11);
                    if (rInvoke.compareTo(rInvoke2) < 0) {
                        t10 = t11;
                        rInvoke = rInvoke2;
                    }
                    if (i10 == lastIndex) {
                        break;
                    }
                    i10++;
                }
            }
        }
        return t10;
    }

    @e1(version = "1.7")
    @oj.i(name = "maxByOrThrow")
    public static final <T, R extends Comparable<? super R>> T maxByOrThrow(@NotNull T[] tArr, @NotNull Function1<? super T, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (tArr.length == 0) {
            throw new NoSuchElementException();
        }
        T t10 = tArr[0];
        int lastIndex = getLastIndex(tArr);
        if (lastIndex != 0) {
            R rInvoke = selector.invoke(t10);
            int i10 = 1;
            if (1 <= lastIndex) {
                while (true) {
                    T t11 = tArr[i10];
                    R rInvoke2 = selector.invoke(t11);
                    if (rInvoke.compareTo(rInvoke2) < 0) {
                        t10 = t11;
                        rInvoke = rInvoke2;
                    }
                    if (i10 == lastIndex) {
                        break;
                    }
                    i10++;
                }
            }
        }
        return t10;
    }

    @u0
    @e1(version = "1.4")
    @f
    private static final <T> double maxOf(T[] tArr, Function1<? super T, Double> selector) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (tArr.length == 0) {
            throw new NoSuchElementException();
        }
        double dDoubleValue = selector.invoke(tArr[0]).doubleValue();
        int lastIndex = getLastIndex(tArr);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                dDoubleValue = Math.max(dDoubleValue, selector.invoke(tArr[i10]).doubleValue());
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return dDoubleValue;
    }

    @u0
    @e1(version = "1.4")
    @f
    /* JADX INFO: renamed from: maxOfOrNull, reason: collision with other method in class */
    private static final <T> Double m811maxOfOrNull(T[] tArr, Function1<? super T, Double> selector) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (tArr.length == 0) {
            return null;
        }
        double dDoubleValue = selector.invoke(tArr[0]).doubleValue();
        int lastIndex = getLastIndex(tArr);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                dDoubleValue = Math.max(dDoubleValue, selector.invoke(tArr[i10]).doubleValue());
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return Double.valueOf(dDoubleValue);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @u0
    @e1(version = "1.4")
    @f
    private static final <T, R> R maxOfWith(T[] tArr, Comparator<? super R> comparator, Function1<? super T, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (tArr.length == 0) {
            throw new NoSuchElementException();
        }
        R rInvoke = selector.invoke(tArr[0]);
        int lastIndex = getLastIndex(tArr);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                R rInvoke2 = selector.invoke(tArr[i10]);
                if (comparator.compare(rInvoke, rInvoke2) < 0) {
                    rInvoke = rInvoke2;
                }
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return rInvoke;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @u0
    @e1(version = "1.4")
    @f
    private static final <T, R> R maxOfWithOrNull(T[] tArr, Comparator<? super R> comparator, Function1<? super T, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (tArr.length == 0) {
            return null;
        }
        R rInvoke = selector.invoke(tArr[0]);
        int lastIndex = getLastIndex(tArr);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                R rInvoke2 = selector.invoke(tArr[i10]);
                if (comparator.compare(rInvoke, rInvoke2) < 0) {
                    rInvoke = rInvoke2;
                }
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return rInvoke;
    }

    @e1(version = "1.4")
    @Nullable
    public static final Double maxOrNull(@NotNull Double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        if (dArr.length == 0) {
            return null;
        }
        double dDoubleValue = dArr[0].doubleValue();
        int lastIndex = getLastIndex(dArr);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                dDoubleValue = Math.max(dDoubleValue, dArr[i10].doubleValue());
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return Double.valueOf(dDoubleValue);
    }

    @e1(version = "1.7")
    @oj.i(name = "maxOrThrow")
    public static final double maxOrThrow(@NotNull Double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        if (dArr.length == 0) {
            throw new NoSuchElementException();
        }
        double dDoubleValue = dArr[0].doubleValue();
        int lastIndex = getLastIndex(dArr);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                dDoubleValue = Math.max(dDoubleValue, dArr[i10].doubleValue());
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return dDoubleValue;
    }

    @e1(version = "1.4")
    @Nullable
    public static final <T> T maxWithOrNull(@NotNull T[] tArr, @NotNull Comparator<? super T> comparator) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (tArr.length == 0) {
            return null;
        }
        T t10 = tArr[0];
        int lastIndex = getLastIndex(tArr);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                T t11 = tArr[i10];
                if (comparator.compare(t10, t11) < 0) {
                    t10 = t11;
                }
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return t10;
    }

    @e1(version = "1.7")
    @oj.i(name = "maxWithOrThrow")
    public static final <T> T maxWithOrThrow(@NotNull T[] tArr, @NotNull Comparator<? super T> comparator) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (tArr.length == 0) {
            throw new NoSuchElementException();
        }
        T t10 = tArr[0];
        int lastIndex = getLastIndex(tArr);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                T t11 = tArr[i10];
                if (comparator.compare(t10, t11) < 0) {
                    t10 = t11;
                }
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return t10;
    }

    @e1(version = "1.4")
    @Nullable
    public static final <T, R extends Comparable<? super R>> T minByOrNull(@NotNull T[] tArr, @NotNull Function1<? super T, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (tArr.length == 0) {
            return null;
        }
        T t10 = tArr[0];
        int lastIndex = getLastIndex(tArr);
        if (lastIndex != 0) {
            R rInvoke = selector.invoke(t10);
            int i10 = 1;
            if (1 <= lastIndex) {
                while (true) {
                    T t11 = tArr[i10];
                    R rInvoke2 = selector.invoke(t11);
                    if (rInvoke.compareTo(rInvoke2) > 0) {
                        t10 = t11;
                        rInvoke = rInvoke2;
                    }
                    if (i10 == lastIndex) {
                        break;
                    }
                    i10++;
                }
            }
        }
        return t10;
    }

    @e1(version = "1.7")
    @oj.i(name = "minByOrThrow")
    public static final <T, R extends Comparable<? super R>> T minByOrThrow(@NotNull T[] tArr, @NotNull Function1<? super T, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (tArr.length == 0) {
            throw new NoSuchElementException();
        }
        T t10 = tArr[0];
        int lastIndex = getLastIndex(tArr);
        if (lastIndex != 0) {
            R rInvoke = selector.invoke(t10);
            int i10 = 1;
            if (1 <= lastIndex) {
                while (true) {
                    T t11 = tArr[i10];
                    R rInvoke2 = selector.invoke(t11);
                    if (rInvoke.compareTo(rInvoke2) > 0) {
                        t10 = t11;
                        rInvoke = rInvoke2;
                    }
                    if (i10 == lastIndex) {
                        break;
                    }
                    i10++;
                }
            }
        }
        return t10;
    }

    @u0
    @e1(version = "1.4")
    @f
    private static final <T> double minOf(T[] tArr, Function1<? super T, Double> selector) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (tArr.length == 0) {
            throw new NoSuchElementException();
        }
        double dDoubleValue = selector.invoke(tArr[0]).doubleValue();
        int lastIndex = getLastIndex(tArr);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                dDoubleValue = Math.min(dDoubleValue, selector.invoke(tArr[i10]).doubleValue());
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return dDoubleValue;
    }

    @u0
    @e1(version = "1.4")
    @f
    /* JADX INFO: renamed from: minOfOrNull, reason: collision with other method in class */
    private static final <T> Double m847minOfOrNull(T[] tArr, Function1<? super T, Double> selector) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (tArr.length == 0) {
            return null;
        }
        double dDoubleValue = selector.invoke(tArr[0]).doubleValue();
        int lastIndex = getLastIndex(tArr);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                dDoubleValue = Math.min(dDoubleValue, selector.invoke(tArr[i10]).doubleValue());
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return Double.valueOf(dDoubleValue);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @u0
    @e1(version = "1.4")
    @f
    private static final <T, R> R minOfWith(T[] tArr, Comparator<? super R> comparator, Function1<? super T, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (tArr.length == 0) {
            throw new NoSuchElementException();
        }
        R rInvoke = selector.invoke(tArr[0]);
        int lastIndex = getLastIndex(tArr);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                R rInvoke2 = selector.invoke(tArr[i10]);
                if (comparator.compare(rInvoke, rInvoke2) > 0) {
                    rInvoke = rInvoke2;
                }
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return rInvoke;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @u0
    @e1(version = "1.4")
    @f
    private static final <T, R> R minOfWithOrNull(T[] tArr, Comparator<? super R> comparator, Function1<? super T, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (tArr.length == 0) {
            return null;
        }
        R rInvoke = selector.invoke(tArr[0]);
        int lastIndex = getLastIndex(tArr);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                R rInvoke2 = selector.invoke(tArr[i10]);
                if (comparator.compare(rInvoke, rInvoke2) > 0) {
                    rInvoke = rInvoke2;
                }
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return rInvoke;
    }

    @e1(version = "1.4")
    @Nullable
    public static final Double minOrNull(@NotNull Double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        if (dArr.length == 0) {
            return null;
        }
        double dDoubleValue = dArr[0].doubleValue();
        int lastIndex = getLastIndex(dArr);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                dDoubleValue = Math.min(dDoubleValue, dArr[i10].doubleValue());
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return Double.valueOf(dDoubleValue);
    }

    @e1(version = "1.7")
    @oj.i(name = "minOrThrow")
    public static final double minOrThrow(@NotNull Double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        if (dArr.length == 0) {
            throw new NoSuchElementException();
        }
        double dDoubleValue = dArr[0].doubleValue();
        int lastIndex = getLastIndex(dArr);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                dDoubleValue = Math.min(dDoubleValue, dArr[i10].doubleValue());
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return dDoubleValue;
    }

    @e1(version = "1.4")
    @Nullable
    public static final <T> T minWithOrNull(@NotNull T[] tArr, @NotNull Comparator<? super T> comparator) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (tArr.length == 0) {
            return null;
        }
        T t10 = tArr[0];
        int lastIndex = getLastIndex(tArr);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                T t11 = tArr[i10];
                if (comparator.compare(t10, t11) > 0) {
                    t10 = t11;
                }
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return t10;
    }

    @e1(version = "1.7")
    @oj.i(name = "minWithOrThrow")
    public static final <T> T minWithOrThrow(@NotNull T[] tArr, @NotNull Comparator<? super T> comparator) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (tArr.length == 0) {
            throw new NoSuchElementException();
        }
        T t10 = tArr[0];
        int lastIndex = getLastIndex(tArr);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                T t11 = tArr[i10];
                if (comparator.compare(t10, t11) > 0) {
                    t10 = t11;
                }
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return t10;
    }

    public static final <T> boolean none(@NotNull T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        return tArr.length == 0;
    }

    @e1(version = "1.4")
    @f
    private static final <T> T[] onEach(T[] tArr, Function1<? super T, Unit> action) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        int i10 = 7 >> 0;
        for (T t10 : tArr) {
            action.invoke(t10);
        }
        return tArr;
    }

    @e1(version = "1.4")
    @f
    private static final <T> T[] onEachIndexed(T[] tArr, Function2<? super Integer, ? super T, Unit> action) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        int length = tArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            action.invoke(Integer.valueOf(i11), tArr[i10]);
            i10++;
            i11++;
        }
        return tArr;
    }

    @NotNull
    public static final <T> Pair<List<T>, List<T>> partition(@NotNull T[] tArr, @NotNull Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (T t10 : tArr) {
            if (predicate.invoke(t10).booleanValue()) {
                arrayList.add(t10);
            } else {
                arrayList2.add(t10);
            }
        }
        return new Pair<>(arrayList, arrayList2);
    }

    @e1(version = "1.3")
    @f
    private static final <T> T random(T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        return (T) random(tArr, kotlin.random.f.f312895a);
    }

    @e1(version = "1.4")
    @f
    private static final <T> T randomOrNull(T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        return (T) randomOrNull(tArr, kotlin.random.f.f312895a);
    }

    public static final <S, T extends S> S reduce(@NotNull T[] tArr, @NotNull Function2<? super S, ? super T, ? extends S> operation) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (tArr.length == 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        S sInvoke = (Object) tArr[0];
        int lastIndex = getLastIndex(tArr);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                sInvoke = operation.invoke(sInvoke, (Object) tArr[i10]);
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return sInvoke;
    }

    public static final <S, T extends S> S reduceIndexed(@NotNull T[] tArr, @NotNull n<? super Integer, ? super S, ? super T, ? extends S> operation) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (tArr.length == 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        S sInvoke = (Object) tArr[0];
        int lastIndex = getLastIndex(tArr);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                sInvoke = operation.invoke(Integer.valueOf(i10), sInvoke, (Object) tArr[i10]);
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return sInvoke;
    }

    @e1(version = "1.4")
    @Nullable
    public static final <S, T extends S> S reduceIndexedOrNull(@NotNull T[] tArr, @NotNull n<? super Integer, ? super S, ? super T, ? extends S> operation) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (tArr.length == 0) {
            return null;
        }
        S sInvoke = (Object) tArr[0];
        int lastIndex = getLastIndex(tArr);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                sInvoke = operation.invoke(Integer.valueOf(i10), sInvoke, (Object) tArr[i10]);
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return sInvoke;
    }

    @e1(version = "1.4")
    @Nullable
    public static final <S, T extends S> S reduceOrNull(@NotNull T[] tArr, @NotNull Function2<? super S, ? super T, ? extends S> operation) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (tArr.length == 0) {
            return null;
        }
        S sInvoke = (Object) tArr[0];
        int lastIndex = getLastIndex(tArr);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                sInvoke = operation.invoke(sInvoke, (Object) tArr[i10]);
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return sInvoke;
    }

    public static final <S, T extends S> S reduceRight(@NotNull T[] tArr, @NotNull Function2<? super T, ? super S, ? extends S> operation) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int lastIndex = getLastIndex(tArr);
        if (lastIndex < 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        S sInvoke = (S) tArr[lastIndex];
        for (int i10 = lastIndex - 1; i10 >= 0; i10--) {
            sInvoke = operation.invoke((Object) tArr[i10], sInvoke);
        }
        return sInvoke;
    }

    public static final <S, T extends S> S reduceRightIndexed(@NotNull T[] tArr, @NotNull n<? super Integer, ? super T, ? super S, ? extends S> operation) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int lastIndex = getLastIndex(tArr);
        if (lastIndex < 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        S sInvoke = (S) tArr[lastIndex];
        for (int i10 = lastIndex - 1; i10 >= 0; i10--) {
            sInvoke = operation.invoke(Integer.valueOf(i10), (Object) tArr[i10], sInvoke);
        }
        return sInvoke;
    }

    @e1(version = "1.4")
    @Nullable
    public static final <S, T extends S> S reduceRightIndexedOrNull(@NotNull T[] tArr, @NotNull n<? super Integer, ? super T, ? super S, ? extends S> operation) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int lastIndex = getLastIndex(tArr);
        if (lastIndex < 0) {
            return null;
        }
        S sInvoke = (S) tArr[lastIndex];
        for (int i10 = lastIndex - 1; i10 >= 0; i10--) {
            sInvoke = operation.invoke(Integer.valueOf(i10), (Object) tArr[i10], sInvoke);
        }
        return sInvoke;
    }

    @e1(version = "1.4")
    @Nullable
    public static final <S, T extends S> S reduceRightOrNull(@NotNull T[] tArr, @NotNull Function2<? super T, ? super S, ? extends S> operation) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int lastIndex = getLastIndex(tArr);
        if (lastIndex < 0) {
            return null;
        }
        S sInvoke = (S) tArr[lastIndex];
        for (int i10 = lastIndex - 1; i10 >= 0; i10--) {
            sInvoke = operation.invoke((Object) tArr[i10], sInvoke);
        }
        return sInvoke;
    }

    @NotNull
    public static final <T> T[] requireNoNulls(@NotNull T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        for (T t10 : tArr) {
            if (t10 == null) {
                throw new IllegalArgumentException("null element found in " + tArr + '.');
            }
        }
        return tArr;
    }

    public static final <T> void reverse(@NotNull T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        int length = (tArr.length / 2) - 1;
        if (length < 0) {
            return;
        }
        int lastIndex = getLastIndex(tArr);
        if (length < 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            T t10 = tArr[i10];
            tArr[i10] = tArr[lastIndex];
            tArr[lastIndex] = t10;
            lastIndex--;
            if (i10 == length) {
                return;
            } else {
                i10++;
            }
        }
    }

    @NotNull
    public static final <T> List<T> reversed(@NotNull T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        if (tArr.length == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        List<T> mutableList = toMutableList(tArr);
        CollectionsKt___CollectionsJvmKt.reverse(mutableList);
        return mutableList;
    }

    @NotNull
    public static final <T> T[] reversedArray(@NotNull T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        if (tArr.length == 0) {
            return tArr;
        }
        T[] tArr2 = (T[]) ArraysKt__ArraysJVMKt.arrayOfNulls(tArr, tArr.length);
        int lastIndex = getLastIndex(tArr);
        if (lastIndex >= 0) {
            int i10 = 0;
            while (true) {
                tArr2[lastIndex - i10] = tArr[i10];
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return tArr2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @e1(version = "1.4")
    @NotNull
    public static final <T, R> List<R> runningFold(@NotNull T[] tArr, R r10, @NotNull Function2<? super R, ? super T, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (tArr.length == 0) {
            return CollectionsKt__CollectionsJVMKt.listOf(r10);
        }
        ArrayList arrayList = new ArrayList(tArr.length + 1);
        arrayList.add(r10);
        for (b bVar : tArr) {
            r10 = operation.invoke(r10, bVar);
            arrayList.add(r10);
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @e1(version = "1.4")
    @NotNull
    public static final <T, R> List<R> runningFoldIndexed(@NotNull T[] tArr, R r10, @NotNull n<? super Integer, ? super R, ? super T, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (tArr.length == 0) {
            return CollectionsKt__CollectionsJVMKt.listOf(r10);
        }
        ArrayList arrayList = new ArrayList(tArr.length + 1);
        arrayList.add(r10);
        int length = tArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            r10 = operation.invoke(Integer.valueOf(i10), r10, tArr[i10]);
            arrayList.add(r10);
        }
        return arrayList;
    }

    @e1(version = "1.4")
    @NotNull
    public static final <S, T extends S> List<S> runningReduce(@NotNull T[] tArr, @NotNull Function2<? super S, ? super T, ? extends S> operation) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (tArr.length == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        S sInvoke = (Object) tArr[0];
        ArrayList arrayList = new ArrayList(tArr.length);
        arrayList.add(sInvoke);
        int length = tArr.length;
        for (int i10 = 1; i10 < length; i10++) {
            sInvoke = operation.invoke(sInvoke, (Object) tArr[i10]);
            arrayList.add(sInvoke);
        }
        return arrayList;
    }

    @e1(version = "1.4")
    @NotNull
    public static final <S, T extends S> List<S> runningReduceIndexed(@NotNull T[] tArr, @NotNull n<? super Integer, ? super S, ? super T, ? extends S> operation) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (tArr.length == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        S sInvoke = (Object) tArr[0];
        ArrayList arrayList = new ArrayList(tArr.length);
        arrayList.add(sInvoke);
        int length = tArr.length;
        for (int i10 = 1; i10 < length; i10++) {
            sInvoke = operation.invoke(Integer.valueOf(i10), sInvoke, (Object) tArr[i10]);
            arrayList.add(sInvoke);
        }
        return arrayList;
    }

    @e1(version = "1.4")
    @f
    private static final <R> List<R> scan(byte[] bArr, R r10, Function2<? super R, ? super Byte, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (bArr.length == 0) {
            return CollectionsKt__CollectionsJVMKt.listOf(r10);
        }
        ArrayList arrayList = new ArrayList(bArr.length + 1);
        arrayList.add(r10);
        for (byte b10 : bArr) {
            r10 = operation.invoke(r10, Byte.valueOf(b10));
            arrayList.add(r10);
        }
        return arrayList;
    }

    @e1(version = "1.4")
    @f
    private static final <R> List<R> scanIndexed(byte[] bArr, R r10, n<? super Integer, ? super R, ? super Byte, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (bArr.length == 0) {
            return CollectionsKt__CollectionsJVMKt.listOf(r10);
        }
        ArrayList arrayList = new ArrayList(bArr.length + 1);
        arrayList.add(r10);
        int length = bArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            r10 = operation.invoke(Integer.valueOf(i10), r10, Byte.valueOf(bArr[i10]));
            arrayList.add(r10);
        }
        return arrayList;
    }

    @e1(version = "1.4")
    public static final <T> void shuffle(@NotNull T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        shuffle(tArr, kotlin.random.f.f312895a);
    }

    public static final <T> T single(@NotNull T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        int length = tArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        if (length == 1) {
            return tArr[0];
        }
        throw new IllegalArgumentException("Array has more than one element.");
    }

    @Nullable
    public static <T> T singleOrNull(@NotNull T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        if (tArr.length == 1) {
            return tArr[0];
        }
        return null;
    }

    @NotNull
    public static <T> List<T> slice(@NotNull T[] tArr, @NotNull IntRange indices) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(indices, "indices");
        return indices.isEmpty() ? CollectionsKt__CollectionsKt.emptyList() : ArraysKt___ArraysJvmKt.asList(ArraysKt___ArraysJvmKt.copyOfRange(tArr, indices.u().intValue(), indices.i().intValue() + 1));
    }

    @NotNull
    public static final <T> T[] sliceArray(@NotNull T[] tArr, @NotNull Collection<Integer> indices) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(indices, "indices");
        T[] tArr2 = (T[]) ArraysKt__ArraysJVMKt.arrayOfNulls(tArr, indices.size());
        Iterator<Integer> it = indices.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            tArr2[i10] = tArr[it.next().intValue()];
            i10++;
        }
        return tArr2;
    }

    public static final <T, R extends Comparable<? super R>> void sortBy(@NotNull T[] tArr, @NotNull Function1<? super T, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (tArr.length > 1) {
            ArraysKt___ArraysJvmKt.sortWith(tArr, new g.a(selector));
        }
    }

    public static final <T, R extends Comparable<? super R>> void sortByDescending(@NotNull T[] tArr, @NotNull Function1<? super T, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (tArr.length > 1) {
            ArraysKt___ArraysJvmKt.sortWith(tArr, new g.c(selector));
        }
    }

    public static final <T extends Comparable<? super T>> void sortDescending(@NotNull T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        ArraysKt___ArraysJvmKt.sortWith(tArr, a.x());
    }

    @NotNull
    public static final <T extends Comparable<? super T>> List<T> sorted(@NotNull T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        return ArraysKt___ArraysJvmKt.asList(sortedArray(tArr));
    }

    @NotNull
    public static final <T extends Comparable<? super T>> T[] sortedArray(@NotNull T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        if (tArr.length == 0) {
            return tArr;
        }
        Object[] objArrCopyOf = Arrays.copyOf(tArr, tArr.length);
        Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
        T[] tArr2 = (T[]) ((Comparable[]) objArrCopyOf);
        ArraysKt___ArraysJvmKt.sort((Object[]) tArr2);
        return tArr2;
    }

    @NotNull
    public static final <T extends Comparable<? super T>> T[] sortedArrayDescending(@NotNull T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        if (tArr.length == 0) {
            return tArr;
        }
        Object[] objArrCopyOf = Arrays.copyOf(tArr, tArr.length);
        Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
        T[] tArr2 = (T[]) ((Comparable[]) objArrCopyOf);
        ArraysKt___ArraysJvmKt.sortWith(tArr2, a.x());
        return tArr2;
    }

    @NotNull
    public static final <T> T[] sortedArrayWith(@NotNull T[] tArr, @NotNull Comparator<? super T> comparator) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (tArr.length == 0) {
            return tArr;
        }
        T[] tArr2 = (T[]) Arrays.copyOf(tArr, tArr.length);
        Intrinsics.checkNotNullExpressionValue(tArr2, "copyOf(...)");
        ArraysKt___ArraysJvmKt.sortWith(tArr2, comparator);
        return tArr2;
    }

    @NotNull
    public static final <T, R extends Comparable<? super R>> List<T> sortedBy(@NotNull T[] tArr, @NotNull Function1<? super T, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        return sortedWith(tArr, new g.a(selector));
    }

    @NotNull
    public static final <T, R extends Comparable<? super R>> List<T> sortedByDescending(@NotNull T[] tArr, @NotNull Function1<? super T, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        return sortedWith(tArr, new g.c(selector));
    }

    @NotNull
    public static final <T extends Comparable<? super T>> List<T> sortedDescending(@NotNull T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        return sortedWith(tArr, a.x());
    }

    @NotNull
    public static <T> List<T> sortedWith(@NotNull T[] tArr, @NotNull Comparator<? super T> comparator) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return ArraysKt___ArraysJvmKt.asList(sortedArrayWith(tArr, comparator));
    }

    @NotNull
    public static final <T> Set<T> subtract(@NotNull T[] tArr, @NotNull Iterable<? extends T> other) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Set<T> mutableSet = toMutableSet(tArr);
        CollectionsKt__MutableCollectionsKt.removeAll(mutableSet, other);
        return mutableSet;
    }

    public static final int sum(@NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        int i10 = 3 ^ 0;
        int i11 = 0;
        for (byte b10 : bArr) {
            i11 += b10;
        }
        return i11;
    }

    @l(message = "Use sumOf instead.", replaceWith = @b1(expression = "this.sumOf(selector)", imports = {}))
    @m(warningSince = "1.5")
    public static final <T> int sumBy(@NotNull T[] tArr, @NotNull Function1<? super T, Integer> selector) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        int iIntValue = 0;
        for (T t10 : tArr) {
            iIntValue += selector.invoke(t10).intValue();
        }
        return iIntValue;
    }

    @l(message = "Use sumOf instead.", replaceWith = @b1(expression = "this.sumOf(selector)", imports = {}))
    @m(warningSince = "1.5")
    public static final <T> double sumByDouble(@NotNull T[] tArr, @NotNull Function1<? super T, Double> selector) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        double dDoubleValue = 0.0d;
        for (T t10 : tArr) {
            dDoubleValue += selector.invoke(t10).doubleValue();
        }
        return dDoubleValue;
    }

    @oj.i(name = "sumOfByte")
    public static final int sumOfByte(@NotNull Byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        int iByteValue = 0;
        for (Byte b10 : bArr) {
            iByteValue += b10.byteValue();
        }
        return iByteValue;
    }

    @u0
    @e1(version = "1.4")
    @f
    @oj.i(name = "sumOfDouble")
    private static final <T> double sumOfDouble(T[] tArr, Function1<? super T, Double> selector) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        double dDoubleValue = 0.0d;
        for (T t10 : tArr) {
            dDoubleValue += selector.invoke(t10).doubleValue();
        }
        return dDoubleValue;
    }

    @oj.i(name = "sumOfFloat")
    public static final float sumOfFloat(@NotNull Float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        float fFloatValue = 0.0f;
        for (Float f10 : fArr) {
            fFloatValue += f10.floatValue();
        }
        return fFloatValue;
    }

    @u0
    @e1(version = "1.4")
    @f
    @oj.i(name = "sumOfInt")
    private static final <T> int sumOfInt(T[] tArr, Function1<? super T, Integer> selector) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        int iIntValue = 0;
        for (T t10 : tArr) {
            iIntValue += selector.invoke(t10).intValue();
        }
        return iIntValue;
    }

    @u0
    @e1(version = "1.4")
    @f
    @oj.i(name = "sumOfLong")
    private static final <T> long sumOfLong(T[] tArr, Function1<? super T, Long> selector) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        long jLongValue = 0;
        for (T t10 : tArr) {
            jLongValue += selector.invoke(t10).longValue();
        }
        return jLongValue;
    }

    @oj.i(name = "sumOfShort")
    public static final int sumOfShort(@NotNull Short[] shArr) {
        Intrinsics.checkNotNullParameter(shArr, "<this>");
        int iShortValue = 0;
        for (Short sh2 : shArr) {
            iShortValue += sh2.shortValue();
        }
        return iShortValue;
    }

    @u0
    @m2(markerClass = {u.class})
    @e1(version = "1.5")
    @f
    @oj.i(name = "sumOfUInt")
    private static final <T> int sumOfUInt(T[] tArr, Function1<? super T, u1> selector) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        int iN = u1.n(0);
        for (T t10 : tArr) {
            iN = u1.n(iN + selector.invoke(t10).z0());
        }
        return iN;
    }

    @u0
    @m2(markerClass = {u.class})
    @e1(version = "1.5")
    @f
    @oj.i(name = "sumOfULong")
    private static final <T> long sumOfULong(T[] tArr, Function1<? super T, y1> selector) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        long jN = y1.n(0L);
        for (T t10 : tArr) {
            jN = y1.n(jN + selector.invoke(t10).z0());
        }
        return jN;
    }

    @NotNull
    public static <T> List<T> take(@NotNull T[] tArr, int i10) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
        }
        if (i10 == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        if (i10 >= tArr.length) {
            return toList(tArr);
        }
        if (i10 == 1) {
            return CollectionsKt__CollectionsJVMKt.listOf(tArr[0]);
        }
        ArrayList arrayList = new ArrayList(i10);
        int i11 = 0;
        for (T t10 : tArr) {
            arrayList.add(t10);
            i11++;
            if (i11 == i10) {
                break;
            }
        }
        return arrayList;
    }

    @NotNull
    public static final <T> List<T> takeLast(@NotNull T[] tArr, int i10) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
        }
        if (i10 == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        int length = tArr.length;
        if (i10 >= length) {
            return toList(tArr);
        }
        if (i10 == 1) {
            return CollectionsKt__CollectionsJVMKt.listOf(tArr[length - 1]);
        }
        ArrayList arrayList = new ArrayList(i10);
        for (int i11 = length - i10; i11 < length; i11++) {
            arrayList.add(tArr[i11]);
        }
        return arrayList;
    }

    @NotNull
    public static final <T> List<T> takeLastWhile(@NotNull T[] tArr, @NotNull Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (int lastIndex = getLastIndex(tArr); -1 < lastIndex; lastIndex--) {
            if (!predicate.invoke(tArr[lastIndex]).booleanValue()) {
                return drop(tArr, lastIndex + 1);
            }
        }
        return toList(tArr);
    }

    @NotNull
    public static final <T> List<T> takeWhile(@NotNull T[] tArr, @NotNull Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (T t10 : tArr) {
            if (!predicate.invoke(t10).booleanValue()) {
                break;
            }
            arrayList.add(t10);
        }
        return arrayList;
    }

    @NotNull
    public static boolean[] toBooleanArray(@NotNull Boolean[] boolArr) {
        Intrinsics.checkNotNullParameter(boolArr, "<this>");
        int length = boolArr.length;
        boolean[] zArr = new boolean[length];
        for (int i10 = 0; i10 < length; i10++) {
            zArr[i10] = boolArr[i10].booleanValue();
        }
        return zArr;
    }

    @NotNull
    public static final byte[] toByteArray(@NotNull Byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        for (int i10 = 0; i10 < length; i10++) {
            bArr2[i10] = bArr[i10].byteValue();
        }
        return bArr2;
    }

    @NotNull
    public static final char[] toCharArray(@NotNull Character[] chArr) {
        Intrinsics.checkNotNullParameter(chArr, "<this>");
        int length = chArr.length;
        char[] cArr = new char[length];
        for (int i10 = 0; i10 < length; i10++) {
            cArr[i10] = chArr[i10].charValue();
        }
        return cArr;
    }

    @NotNull
    public static final <T, C extends Collection<? super T>> C toCollection(@NotNull T[] tArr, @NotNull C destination) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        for (T t10 : tArr) {
            destination.add(t10);
        }
        return destination;
    }

    @NotNull
    public static double[] toDoubleArray(@NotNull Double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        int length = dArr.length;
        double[] dArr2 = new double[length];
        for (int i10 = 0; i10 < length; i10++) {
            dArr2[i10] = dArr[i10].doubleValue();
        }
        return dArr2;
    }

    @NotNull
    public static float[] toFloatArray(@NotNull Float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        int length = fArr.length;
        float[] fArr2 = new float[length];
        for (int i10 = 0; i10 < length; i10++) {
            fArr2[i10] = fArr[i10].floatValue();
        }
        return fArr2;
    }

    @NotNull
    public static <T> HashSet<T> toHashSet(@NotNull T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        return (HashSet) toCollection(tArr, new HashSet(MapsKt__MapsJVMKt.mapCapacity(tArr.length)));
    }

    @NotNull
    public static int[] toIntArray(@NotNull Integer[] numArr) {
        Intrinsics.checkNotNullParameter(numArr, "<this>");
        int length = numArr.length;
        int[] iArr = new int[length];
        for (int i10 = 0; i10 < length; i10++) {
            iArr[i10] = numArr[i10].intValue();
        }
        return iArr;
    }

    @NotNull
    public static <T> List<T> toList(@NotNull T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        int length = tArr.length;
        if (length != 0) {
            return length != 1 ? toMutableList(tArr) : CollectionsKt__CollectionsJVMKt.listOf(tArr[0]);
        }
        return CollectionsKt__CollectionsKt.emptyList();
    }

    @NotNull
    public static long[] toLongArray(@NotNull Long[] lArr) {
        Intrinsics.checkNotNullParameter(lArr, "<this>");
        int length = lArr.length;
        long[] jArr = new long[length];
        for (int i10 = 0; i10 < length; i10++) {
            jArr[i10] = lArr[i10].longValue();
        }
        return jArr;
    }

    @NotNull
    public static <T> List<T> toMutableList(@NotNull T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        return new ArrayList(CollectionsKt__CollectionsKt.asCollection(tArr));
    }

    @NotNull
    public static final <T> Set<T> toMutableSet(@NotNull T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        return (Set) toCollection(tArr, new LinkedHashSet(MapsKt__MapsJVMKt.mapCapacity(tArr.length)));
    }

    @NotNull
    public static <T> Set<T> toSet(@NotNull T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        int length = tArr.length;
        if (length != 0) {
            return length != 1 ? (Set) toCollection(tArr, new LinkedHashSet(MapsKt__MapsJVMKt.mapCapacity(tArr.length))) : SetsKt__SetsJVMKt.setOf(tArr[0]);
        }
        return SetsKt__SetsKt.emptySet();
    }

    @NotNull
    public static final short[] toShortArray(@NotNull Short[] shArr) {
        Intrinsics.checkNotNullParameter(shArr, "<this>");
        int length = shArr.length;
        short[] sArr = new short[length];
        for (int i10 = 0; i10 < length; i10++) {
            sArr[i10] = shArr[i10].shortValue();
        }
        return sArr;
    }

    @NotNull
    public static final <T> Set<T> union(@NotNull T[] tArr, @NotNull Iterable<? extends T> other) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Set<T> mutableSet = toMutableSet(tArr);
        CollectionsKt__MutableCollectionsKt.addAll(mutableSet, other);
        return mutableSet;
    }

    @NotNull
    public static <T> Iterable<IndexedValue<T>> withIndex(@NotNull T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        return new IndexingIterable(new C28471(tArr));
    }

    @NotNull
    public static final <T, R, V> List<V> zip(@NotNull T[] tArr, @NotNull R[] other, @NotNull Function2<? super T, ? super R, ? extends V> transform) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int iMin = Math.min(tArr.length, other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i10 = 0; i10 < iMin; i10++) {
            arrayList.add(transform.invoke(tArr[i10], other[i10]));
        }
        return arrayList;
    }

    public static final boolean all(@NotNull byte[] bArr, @NotNull Function1<? super Byte, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (byte b10 : bArr) {
            if (!predicate.invoke(Byte.valueOf(b10)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static boolean any(@NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        return !(bArr.length == 0);
    }

    public static final double average(@NotNull short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        double d10 = 0.0d;
        int i10 = 0;
        for (short s10 : sArr) {
            d10 += (double) s10;
            i10++;
        }
        if (i10 == 0) {
            return Double.NaN;
        }
        return d10 / ((double) i10);
    }

    @f
    private static final byte component1(byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        return bArr[0];
    }

    @f
    private static final byte component2(byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        return bArr[1];
    }

    @f
    private static final byte component3(byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        return bArr[2];
    }

    @f
    private static final byte component4(byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        return bArr[3];
    }

    @f
    private static final byte component5(byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        return bArr[4];
    }

    public static boolean contains(@NotNull byte[] bArr, byte b10) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        return indexOf(bArr, b10) >= 0;
    }

    @f
    private static final int count(byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        return bArr.length;
    }

    @NotNull
    public static final List<Byte> distinct(@NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        return CollectionsKt___CollectionsKt.toList(toMutableSet(bArr));
    }

    @f
    private static final byte elementAtOrElse(byte[] bArr, int i10, Function1<? super Integer, Byte> defaultValue) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        return (i10 < 0 || i10 >= bArr.length) ? defaultValue.invoke(Integer.valueOf(i10)).byteValue() : bArr[i10];
    }

    @f
    private static final Byte elementAtOrNull(byte[] bArr, int i10) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        return getOrNull(bArr, i10);
    }

    @NotNull
    public static final <C extends Collection<? super Byte>> C filterNotTo(@NotNull byte[] bArr, @NotNull C destination, @NotNull Function1<? super Byte, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (byte b10 : bArr) {
            if (!predicate.invoke(Byte.valueOf(b10)).booleanValue()) {
                destination.add(Byte.valueOf(b10));
            }
        }
        return destination;
    }

    @NotNull
    public static final <C extends Collection<? super Byte>> C filterTo(@NotNull byte[] bArr, @NotNull C destination, @NotNull Function1<? super Byte, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (byte b10 : bArr) {
            if (predicate.invoke(Byte.valueOf(b10)).booleanValue()) {
                destination.add(Byte.valueOf(b10));
            }
        }
        return destination;
    }

    @f
    private static final Byte find(byte[] bArr, Function1<? super Byte, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (byte b10 : bArr) {
            if (predicate.invoke(Byte.valueOf(b10)).booleanValue()) {
                return Byte.valueOf(b10);
            }
        }
        return null;
    }

    @Nullable
    public static final Byte firstOrNull(@NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        if (bArr.length == 0) {
            return null;
        }
        return Byte.valueOf(bArr[0]);
    }

    @u0
    @e1(version = "1.4")
    @f
    @oj.i(name = "flatMapIndexedIterable")
    private static final <R> List<R> flatMapIndexedIterable(byte[] bArr, Function2<? super Integer, ? super Byte, ? extends Iterable<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList();
        int length = bArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            CollectionsKt__MutableCollectionsKt.addAll(arrayList, transform.invoke(Integer.valueOf(i11), Byte.valueOf(bArr[i10])));
            i10++;
            i11++;
        }
        return arrayList;
    }

    public static final <R> R fold(@NotNull byte[] bArr, R r10, @NotNull Function2<? super R, ? super Byte, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int i10 = 6 << 0;
        for (byte b10 : bArr) {
            r10 = operation.invoke(r10, Byte.valueOf(b10));
        }
        return r10;
    }

    public static final <R> R foldIndexed(@NotNull byte[] bArr, R r10, @NotNull n<? super Integer, ? super R, ? super Byte, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int length = bArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            r10 = operation.invoke(Integer.valueOf(i11), r10, Byte.valueOf(bArr[i10]));
            i10++;
            i11++;
        }
        return r10;
    }

    public static final void forEach(@NotNull byte[] bArr, @NotNull Function1<? super Byte, Unit> action) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        for (byte b10 : bArr) {
            action.invoke(Byte.valueOf(b10));
        }
    }

    public static final void forEachIndexed(@NotNull byte[] bArr, @NotNull Function2<? super Integer, ? super Byte, Unit> action) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        int length = bArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            action.invoke(Integer.valueOf(i11), Byte.valueOf(bArr[i10]));
            i10++;
            i11++;
        }
    }

    @NotNull
    public static IntRange getIndices(@NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        return new IntRange(0, getLastIndex(bArr));
    }

    public static int getLastIndex(@NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        return bArr.length - 1;
    }

    @f
    private static final byte getOrElse(byte[] bArr, int i10, Function1<? super Integer, Byte> defaultValue) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        return (i10 < 0 || i10 >= bArr.length) ? defaultValue.invoke(Integer.valueOf(i10)).byteValue() : bArr[i10];
    }

    @Nullable
    public static Byte getOrNull(@NotNull byte[] bArr, int i10) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        if (i10 < 0 || i10 >= bArr.length) {
            return null;
        }
        return Byte.valueOf(bArr[i10]);
    }

    @f
    private static final boolean isEmpty(byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        return bArr.length == 0;
    }

    @f
    private static final boolean isNotEmpty(byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        return !(bArr.length == 0);
    }

    @NotNull
    public static final String joinToString(@NotNull byte[] bArr, @NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence postfix, int i10, @NotNull CharSequence truncated, @Nullable Function1<? super Byte, ? extends CharSequence> function1) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(truncated, "truncated");
        String string = ((StringBuilder) joinTo(bArr, new StringBuilder(), separator, prefix, postfix, i10, truncated, function1)).toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public static /* synthetic */ String joinToString$default(byte[] bArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, Function1 function1, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            charSequence = ", ";
        }
        if ((i11 & 2) != 0) {
            charSequence2 = "";
        }
        if ((i11 & 4) != 0) {
            charSequence3 = "";
        }
        if ((i11 & 8) != 0) {
            i10 = -1;
        }
        if ((i11 & 16) != 0) {
            charSequence4 = "...";
        }
        if ((i11 & 32) != 0) {
            function1 = null;
        }
        CharSequence charSequence5 = charSequence4;
        Function1 function2 = function1;
        return joinToString(bArr, charSequence, charSequence2, charSequence3, i10, charSequence5, (Function1<? super Byte, ? extends CharSequence>) function2);
    }

    @Nullable
    public static final Byte lastOrNull(@NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        if (bArr.length == 0) {
            return null;
        }
        return Byte.valueOf(bArr[bArr.length - 1]);
    }

    public static final boolean none(@NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        return bArr.length == 0;
    }

    @e1(version = "1.4")
    @f
    private static final byte[] onEach(byte[] bArr, Function1<? super Byte, Unit> action) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        for (byte b10 : bArr) {
            action.invoke(Byte.valueOf(b10));
        }
        return bArr;
    }

    @e1(version = "1.4")
    @f
    private static final byte[] onEachIndexed(byte[] bArr, Function2<? super Integer, ? super Byte, Unit> action) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        int length = bArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            action.invoke(Integer.valueOf(i11), Byte.valueOf(bArr[i10]));
            i10++;
            i11++;
        }
        return bArr;
    }

    @e1(version = "1.3")
    @f
    private static final byte random(byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        return random(bArr, (kotlin.random.f) kotlin.random.f.f312895a);
    }

    @e1(version = "1.4")
    @f
    private static final Byte randomOrNull(byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        return randomOrNull(bArr, (kotlin.random.f) kotlin.random.f.f312895a);
    }

    @e1(version = "1.4")
    @f
    private static final <R> List<R> scan(short[] sArr, R r10, Function2<? super R, ? super Short, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (sArr.length == 0) {
            return CollectionsKt__CollectionsJVMKt.listOf(r10);
        }
        ArrayList arrayList = new ArrayList(sArr.length + 1);
        arrayList.add(r10);
        for (short s10 : sArr) {
            r10 = operation.invoke(r10, Short.valueOf(s10));
            arrayList.add(r10);
        }
        return arrayList;
    }

    @e1(version = "1.4")
    @f
    private static final <R> List<R> scanIndexed(short[] sArr, R r10, n<? super Integer, ? super R, ? super Short, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (sArr.length == 0) {
            return CollectionsKt__CollectionsJVMKt.listOf(r10);
        }
        ArrayList arrayList = new ArrayList(sArr.length + 1);
        arrayList.add(r10);
        int length = sArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            r10 = operation.invoke(Integer.valueOf(i10), r10, Short.valueOf(sArr[i10]));
            arrayList.add(r10);
        }
        return arrayList;
    }

    @e1(version = "1.4")
    public static final void shuffle(@NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        shuffle(bArr, (kotlin.random.f) kotlin.random.f.f312895a);
    }

    @Nullable
    public static final Byte singleOrNull(@NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        if (bArr.length == 1) {
            return Byte.valueOf(bArr[0]);
        }
        return null;
    }

    public static final void sortDescending(@NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        if (bArr.length > 1) {
            ArraysKt___ArraysJvmKt.sort(bArr);
            reverse(bArr);
        }
    }

    @NotNull
    public static final List<Byte> sorted(@NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Byte[] typedArray = ArraysKt___ArraysJvmKt.toTypedArray(bArr);
        ArraysKt___ArraysJvmKt.sort((Object[]) typedArray);
        return ArraysKt___ArraysJvmKt.asList(typedArray);
    }

    @NotNull
    public static final <R extends Comparable<? super R>> List<Byte> sortedBy(@NotNull byte[] bArr, @NotNull Function1<? super Byte, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        return sortedWith(bArr, (Comparator<? super Byte>) new g.a(selector));
    }

    @NotNull
    public static final <R extends Comparable<? super R>> List<Byte> sortedByDescending(@NotNull byte[] bArr, @NotNull Function1<? super Byte, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        return sortedWith(bArr, (Comparator<? super Byte>) new g.c(selector));
    }

    @NotNull
    public static final List<Byte> sortedDescending(@NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "copyOf(...)");
        ArraysKt___ArraysJvmKt.sort(bArrCopyOf);
        return reversed(bArrCopyOf);
    }

    @NotNull
    public static final List<Byte> sortedWith(@NotNull byte[] bArr, @NotNull Comparator<? super Byte> comparator) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Byte[] typedArray = ArraysKt___ArraysJvmKt.toTypedArray(bArr);
        ArraysKt___ArraysJvmKt.sortWith(typedArray, comparator);
        return ArraysKt___ArraysJvmKt.asList(typedArray);
    }

    public static final int sum(@NotNull short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        int i10 = 0;
        for (short s10 : sArr) {
            i10 += s10;
        }
        return i10;
    }

    @NotNull
    public static final HashSet<Byte> toHashSet(@NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        return (HashSet) toCollection(bArr, new HashSet(MapsKt__MapsJVMKt.mapCapacity(bArr.length)));
    }

    @NotNull
    public static final List<Byte> toMutableList(@NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        ArrayList arrayList = new ArrayList(bArr.length);
        for (byte b10 : bArr) {
            arrayList.add(Byte.valueOf(b10));
        }
        return arrayList;
    }

    @NotNull
    public static final Set<Byte> toMutableSet(@NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        return (Set) toCollection(bArr, new LinkedHashSet(MapsKt__MapsJVMKt.mapCapacity(bArr.length)));
    }

    @NotNull
    public static final Iterable<IndexedValue<Byte>> withIndex(@NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        return new IndexingIterable(new AnonymousClass2(bArr));
    }

    public static final boolean all(@NotNull short[] sArr, @NotNull Function1<? super Short, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (short s10 : sArr) {
            if (!predicate.invoke(Short.valueOf(s10)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static boolean any(@NotNull short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        return !(sArr.length == 0);
    }

    @NotNull
    public static final Iterable<Byte> asIterable(@NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        return bArr.length == 0 ? CollectionsKt__CollectionsKt.emptyList() : new ArraysKt___ArraysKt$asIterable$$inlined$Iterable$2(bArr);
    }

    @NotNull
    public static final Sequence<Byte> asSequence(@NotNull final byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        return bArr.length == 0 ? o.g() : new Sequence<Byte>() { // from class: kotlin.collections.ArraysKt___ArraysKt$asSequence$$inlined$Sequence$2
            @Override // kotlin.sequences.Sequence
            public Iterator<Byte> iterator() {
                return j.b(bArr);
            }
        };
    }

    @NotNull
    public static final <K, M extends Map<? super K, ? super Byte>> M associateByTo(@NotNull byte[] bArr, @NotNull M destination, @NotNull Function1<? super Byte, ? extends K> keySelector) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        for (byte b10 : bArr) {
            destination.put(keySelector.invoke(Byte.valueOf(b10)), Byte.valueOf(b10));
        }
        return destination;
    }

    @NotNull
    public static final <K, V, M extends Map<? super K, ? super V>> M associateTo(@NotNull byte[] bArr, @NotNull M destination, @NotNull Function1<? super Byte, ? extends Pair<? extends K, ? extends V>> transform) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        for (byte b10 : bArr) {
            Pair<? extends K, ? extends V> pairInvoke = transform.invoke(Byte.valueOf(b10));
            destination.put(pairInvoke.getFirst(), pairInvoke.getSecond());
        }
        return destination;
    }

    @e1(version = "1.4")
    @f
    private static final <V, M extends Map<? super Byte, ? super V>> M associateWithTo(byte[] bArr, M destination, Function1<? super Byte, ? extends V> valueSelector) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(valueSelector, "valueSelector");
        for (byte b10 : bArr) {
            destination.put(Byte.valueOf(b10), valueSelector.invoke(Byte.valueOf(b10)));
        }
        return destination;
    }

    public static final double average(@NotNull int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        double d10 = 0.0d;
        int i10 = 0;
        for (int i11 : iArr) {
            d10 += (double) i11;
            i10++;
        }
        if (i10 == 0) {
            return Double.NaN;
        }
        return d10 / ((double) i10);
    }

    @f
    private static final short component1(short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        return sArr[0];
    }

    @f
    private static final short component2(short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        return sArr[1];
    }

    @f
    private static final short component3(short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        return sArr[2];
    }

    @f
    private static final short component4(short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        return sArr[3];
    }

    @f
    private static final short component5(short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        return sArr[4];
    }

    public static boolean contains(@NotNull short[] sArr, short s10) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        return indexOf(sArr, s10) >= 0;
    }

    @f
    private static final int count(short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        return sArr.length;
    }

    @NotNull
    public static final List<Short> distinct(@NotNull short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        return CollectionsKt___CollectionsKt.toList(toMutableSet(sArr));
    }

    @NotNull
    public static final List<Byte> drop(@NotNull byte[] bArr, int i10) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        if (i10 >= 0) {
            return takeLast(bArr, r.u(bArr.length - i10, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
    }

    @NotNull
    public static final List<Byte> dropLast(@NotNull byte[] bArr, int i10) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        if (i10 >= 0) {
            return take(bArr, r.u(bArr.length - i10, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
    }

    @f
    private static final short elementAtOrElse(short[] sArr, int i10, Function1<? super Integer, Short> defaultValue) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        return (i10 < 0 || i10 >= sArr.length) ? defaultValue.invoke(Integer.valueOf(i10)).shortValue() : sArr[i10];
    }

    @f
    private static final Short elementAtOrNull(short[] sArr, int i10) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        return getOrNull(sArr, i10);
    }

    @NotNull
    public static final List<Byte> filter(@NotNull byte[] bArr, @NotNull Function1<? super Byte, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (byte b10 : bArr) {
            if (predicate.invoke(Byte.valueOf(b10)).booleanValue()) {
                arrayList.add(Byte.valueOf(b10));
            }
        }
        return arrayList;
    }

    @NotNull
    public static final <C extends Collection<? super Byte>> C filterIndexedTo(@NotNull byte[] bArr, @NotNull C destination, @NotNull Function2<? super Integer, ? super Byte, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = bArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            byte b10 = bArr[i10];
            int i12 = i11 + 1;
            if (predicate.invoke(Integer.valueOf(i11), Byte.valueOf(b10)).booleanValue()) {
                destination.add(Byte.valueOf(b10));
            }
            i10++;
            i11 = i12;
        }
        return destination;
    }

    @NotNull
    public static final List<Byte> filterNot(@NotNull byte[] bArr, @NotNull Function1<? super Byte, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (byte b10 : bArr) {
            if (!predicate.invoke(Byte.valueOf(b10)).booleanValue()) {
                arrayList.add(Byte.valueOf(b10));
            }
        }
        return arrayList;
    }

    @NotNull
    public static final <C extends Collection<? super Short>> C filterNotTo(@NotNull short[] sArr, @NotNull C destination, @NotNull Function1<? super Short, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (short s10 : sArr) {
            if (!predicate.invoke(Short.valueOf(s10)).booleanValue()) {
                destination.add(Short.valueOf(s10));
            }
        }
        return destination;
    }

    @NotNull
    public static final <C extends Collection<? super Short>> C filterTo(@NotNull short[] sArr, @NotNull C destination, @NotNull Function1<? super Short, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int i10 = 4 | 0;
        for (short s10 : sArr) {
            if (predicate.invoke(Short.valueOf(s10)).booleanValue()) {
                destination.add(Short.valueOf(s10));
            }
        }
        return destination;
    }

    @f
    private static final Short find(short[] sArr, Function1<? super Short, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (short s10 : sArr) {
            if (predicate.invoke(Short.valueOf(s10)).booleanValue()) {
                return Short.valueOf(s10);
            }
        }
        return null;
    }

    @Nullable
    public static final Short firstOrNull(@NotNull short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        if (sArr.length == 0) {
            return null;
        }
        return Short.valueOf(sArr[0]);
    }

    @u0
    @e1(version = "1.4")
    @f
    @oj.i(name = "flatMapIndexedIterable")
    private static final <R> List<R> flatMapIndexedIterable(short[] sArr, Function2<? super Integer, ? super Short, ? extends Iterable<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList();
        int length = sArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            CollectionsKt__MutableCollectionsKt.addAll(arrayList, transform.invoke(Integer.valueOf(i11), Short.valueOf(sArr[i10])));
            i10++;
            i11++;
        }
        return arrayList;
    }

    public static final <R> R fold(@NotNull short[] sArr, R r10, @NotNull Function2<? super R, ? super Short, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        for (short s10 : sArr) {
            r10 = operation.invoke(r10, Short.valueOf(s10));
        }
        return r10;
    }

    public static final <R> R foldIndexed(@NotNull short[] sArr, R r10, @NotNull n<? super Integer, ? super R, ? super Short, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int length = sArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            r10 = operation.invoke(Integer.valueOf(i11), r10, Short.valueOf(sArr[i10]));
            i10++;
            i11++;
        }
        return r10;
    }

    public static final <R> R foldRight(@NotNull byte[] bArr, R r10, @NotNull Function2<? super Byte, ? super R, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        for (int lastIndex = getLastIndex(bArr); lastIndex >= 0; lastIndex--) {
            r10 = operation.invoke(Byte.valueOf(bArr[lastIndex]), r10);
        }
        return r10;
    }

    public static final <R> R foldRightIndexed(@NotNull byte[] bArr, R r10, @NotNull n<? super Integer, ? super Byte, ? super R, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        for (int lastIndex = getLastIndex(bArr); lastIndex >= 0; lastIndex--) {
            r10 = operation.invoke(Integer.valueOf(lastIndex), Byte.valueOf(bArr[lastIndex]), r10);
        }
        return r10;
    }

    public static final void forEach(@NotNull short[] sArr, @NotNull Function1<? super Short, Unit> action) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        for (short s10 : sArr) {
            action.invoke(Short.valueOf(s10));
        }
    }

    public static final void forEachIndexed(@NotNull short[] sArr, @NotNull Function2<? super Integer, ? super Short, Unit> action) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        int length = sArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            action.invoke(Integer.valueOf(i11), Short.valueOf(sArr[i10]));
            i10++;
            i11++;
        }
    }

    @NotNull
    public static IntRange getIndices(@NotNull short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        return new IntRange(0, getLastIndex(sArr));
    }

    public static int getLastIndex(@NotNull short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        return sArr.length - 1;
    }

    @f
    private static final short getOrElse(short[] sArr, int i10, Function1<? super Integer, Short> defaultValue) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        return (i10 < 0 || i10 >= sArr.length) ? defaultValue.invoke(Integer.valueOf(i10)).shortValue() : sArr[i10];
    }

    @Nullable
    public static final Short getOrNull(@NotNull short[] sArr, int i10) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        if (i10 < 0 || i10 >= sArr.length) {
            return null;
        }
        return Short.valueOf(sArr[i10]);
    }

    public static final int indexOfFirst(@NotNull byte[] bArr, @NotNull Function1<? super Byte, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = bArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (predicate.invoke(Byte.valueOf(bArr[i10])).booleanValue()) {
                return i10;
            }
        }
        return -1;
    }

    public static final int indexOfLast(@NotNull byte[] bArr, @NotNull Function1<? super Byte, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int i10 = 4 ^ (-1);
        int length = bArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i11 = length - 1;
                if (predicate.invoke(Byte.valueOf(bArr[length])).booleanValue()) {
                    return length;
                }
                if (i11 >= 0) {
                    length = i11;
                }
            }
        }
        return -1;
    }

    @NotNull
    public static final Set<Byte> intersect(@NotNull byte[] bArr, @NotNull Iterable<Byte> other) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Set<Byte> mutableSet = toMutableSet(bArr);
        CollectionsKt__MutableCollectionsKt.retainAll(mutableSet, other);
        return mutableSet;
    }

    @f
    private static final boolean isEmpty(short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        return sArr.length == 0;
    }

    @f
    private static final boolean isNotEmpty(short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        return !(sArr.length == 0);
    }

    @NotNull
    public static final String joinToString(@NotNull short[] sArr, @NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence postfix, int i10, @NotNull CharSequence truncated, @Nullable Function1<? super Short, ? extends CharSequence> function1) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(truncated, "truncated");
        String string = ((StringBuilder) joinTo(sArr, new StringBuilder(), separator, prefix, postfix, i10, truncated, function1)).toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public static /* synthetic */ String joinToString$default(short[] sArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, Function1 function1, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            charSequence = ", ";
        }
        if ((i11 & 2) != 0) {
            charSequence2 = "";
        }
        if ((i11 & 4) != 0) {
            charSequence3 = "";
        }
        if ((i11 & 8) != 0) {
            i10 = -1;
        }
        if ((i11 & 16) != 0) {
            charSequence4 = "...";
        }
        if ((i11 & 32) != 0) {
            function1 = null;
        }
        CharSequence charSequence5 = charSequence4;
        Function1 function2 = function1;
        return joinToString(sArr, charSequence, charSequence2, charSequence3, i10, charSequence5, (Function1<? super Short, ? extends CharSequence>) function2);
    }

    @Nullable
    public static final Short lastOrNull(@NotNull short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        if (sArr.length == 0) {
            return null;
        }
        return Short.valueOf(sArr[sArr.length - 1]);
    }

    @NotNull
    public static final <R, C extends Collection<? super R>> C mapIndexedTo(@NotNull byte[] bArr, @NotNull C destination, @NotNull Function2<? super Integer, ? super Byte, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int length = bArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            destination.add(transform.invoke(Integer.valueOf(i11), Byte.valueOf(bArr[i10])));
            i10++;
            i11++;
        }
        return destination;
    }

    @NotNull
    public static final <R, C extends Collection<? super R>> C mapTo(@NotNull byte[] bArr, @NotNull C destination, @NotNull Function1<? super Byte, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        boolean z10 = true;
        for (byte b10 : bArr) {
            destination.add(transform.invoke(Byte.valueOf(b10)));
        }
        return destination;
    }

    public static final boolean none(@NotNull short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        return sArr.length == 0;
    }

    @e1(version = "1.4")
    @f
    private static final short[] onEach(short[] sArr, Function1<? super Short, Unit> action) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        for (short s10 : sArr) {
            action.invoke(Short.valueOf(s10));
        }
        return sArr;
    }

    @e1(version = "1.4")
    @f
    private static final short[] onEachIndexed(short[] sArr, Function2<? super Integer, ? super Short, Unit> action) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        int length = sArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            action.invoke(Integer.valueOf(i11), Short.valueOf(sArr[i10]));
            i10++;
            i11++;
        }
        return sArr;
    }

    @e1(version = "1.3")
    @f
    private static final short random(short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        return random(sArr, (kotlin.random.f) kotlin.random.f.f312895a);
    }

    @e1(version = "1.4")
    @f
    private static final Short randomOrNull(short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        return randomOrNull(sArr, (kotlin.random.f) kotlin.random.f.f312895a);
    }

    @e1(version = "1.4")
    @f
    private static final <R> List<R> scan(int[] iArr, R r10, Function2<? super R, ? super Integer, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (iArr.length == 0) {
            return CollectionsKt__CollectionsJVMKt.listOf(r10);
        }
        ArrayList arrayList = new ArrayList(iArr.length + 1);
        arrayList.add(r10);
        for (int i10 : iArr) {
            r10 = operation.invoke(r10, Integer.valueOf(i10));
            arrayList.add(r10);
        }
        return arrayList;
    }

    @e1(version = "1.4")
    @f
    private static final <R> List<R> scanIndexed(int[] iArr, R r10, n<? super Integer, ? super R, ? super Integer, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (iArr.length == 0) {
            return CollectionsKt__CollectionsJVMKt.listOf(r10);
        }
        ArrayList arrayList = new ArrayList(iArr.length + 1);
        arrayList.add(r10);
        int length = iArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            r10 = operation.invoke(Integer.valueOf(i10), r10, Integer.valueOf(iArr[i10]));
            arrayList.add(r10);
        }
        return arrayList;
    }

    @e1(version = "1.4")
    public static final void shuffle(@NotNull short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        shuffle(sArr, (kotlin.random.f) kotlin.random.f.f312895a);
    }

    @Nullable
    public static final Short singleOrNull(@NotNull short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        if (sArr.length == 1) {
            return Short.valueOf(sArr[0]);
        }
        return null;
    }

    @NotNull
    public static final List<Byte> slice(@NotNull byte[] bArr, @NotNull IntRange indices) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(indices, "indices");
        return indices.isEmpty() ? CollectionsKt__CollectionsKt.emptyList() : ArraysKt___ArraysJvmKt.asList(ArraysKt___ArraysJvmKt.copyOfRange(bArr, indices.u().intValue(), indices.i().intValue() + 1));
    }

    @NotNull
    public static final List<Short> sorted(@NotNull short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Short[] typedArray = ArraysKt___ArraysJvmKt.toTypedArray(sArr);
        ArraysKt___ArraysJvmKt.sort((Object[]) typedArray);
        return ArraysKt___ArraysJvmKt.asList(typedArray);
    }

    @NotNull
    public static final byte[] sortedArray(@NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        if (bArr.length == 0) {
            return bArr;
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "copyOf(...)");
        ArraysKt___ArraysJvmKt.sort(bArrCopyOf);
        return bArrCopyOf;
    }

    @NotNull
    public static final byte[] sortedArrayDescending(@NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        if (bArr.length == 0) {
            return bArr;
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "copyOf(...)");
        sortDescending(bArrCopyOf);
        return bArrCopyOf;
    }

    @NotNull
    public static final <R extends Comparable<? super R>> List<Short> sortedBy(@NotNull short[] sArr, @NotNull Function1<? super Short, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        return sortedWith(sArr, (Comparator<? super Short>) new g.a(selector));
    }

    @NotNull
    public static final <R extends Comparable<? super R>> List<Short> sortedByDescending(@NotNull short[] sArr, @NotNull Function1<? super Short, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        return sortedWith(sArr, (Comparator<? super Short>) new g.c(selector));
    }

    @NotNull
    public static final List<Short> sortedDescending(@NotNull short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        short[] sArrCopyOf = Arrays.copyOf(sArr, sArr.length);
        Intrinsics.checkNotNullExpressionValue(sArrCopyOf, "copyOf(...)");
        ArraysKt___ArraysJvmKt.sort(sArrCopyOf);
        return reversed(sArrCopyOf);
    }

    @NotNull
    public static final List<Short> sortedWith(@NotNull short[] sArr, @NotNull Comparator<? super Short> comparator) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Short[] typedArray = ArraysKt___ArraysJvmKt.toTypedArray(sArr);
        ArraysKt___ArraysJvmKt.sortWith(typedArray, comparator);
        return ArraysKt___ArraysJvmKt.asList(typedArray);
    }

    @NotNull
    public static final Set<Byte> subtract(@NotNull byte[] bArr, @NotNull Iterable<Byte> other) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Set<Byte> mutableSet = toMutableSet(bArr);
        CollectionsKt__MutableCollectionsKt.removeAll(mutableSet, other);
        return mutableSet;
    }

    public static int sum(@NotNull int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        int i10 = 0;
        for (int i11 : iArr) {
            i10 += i11;
        }
        return i10;
    }

    @l(message = "Use sumOf instead.", replaceWith = @b1(expression = "this.sumOf(selector)", imports = {}))
    @m(warningSince = "1.5")
    public static final int sumBy(@NotNull byte[] bArr, @NotNull Function1<? super Byte, Integer> selector) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        int iIntValue = 0;
        for (byte b10 : bArr) {
            iIntValue += selector.invoke(Byte.valueOf(b10)).intValue();
        }
        return iIntValue;
    }

    @l(message = "Use sumOf instead.", replaceWith = @b1(expression = "this.sumOf(selector)", imports = {}))
    @m(warningSince = "1.5")
    public static final double sumByDouble(@NotNull byte[] bArr, @NotNull Function1<? super Byte, Double> selector) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        double dDoubleValue = 0.0d;
        for (byte b10 : bArr) {
            dDoubleValue += selector.invoke(Byte.valueOf(b10)).doubleValue();
        }
        return dDoubleValue;
    }

    @u0
    @e1(version = "1.4")
    @f
    @oj.i(name = "sumOfDouble")
    private static final double sumOfDouble(byte[] bArr, Function1<? super Byte, Double> selector) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        double dDoubleValue = 0.0d;
        for (byte b10 : bArr) {
            dDoubleValue += selector.invoke(Byte.valueOf(b10)).doubleValue();
        }
        return dDoubleValue;
    }

    @u0
    @e1(version = "1.4")
    @f
    @oj.i(name = "sumOfInt")
    private static final int sumOfInt(byte[] bArr, Function1<? super Byte, Integer> selector) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        int iIntValue = 0;
        for (byte b10 : bArr) {
            iIntValue += selector.invoke(Byte.valueOf(b10)).intValue();
        }
        return iIntValue;
    }

    @u0
    @e1(version = "1.4")
    @f
    @oj.i(name = "sumOfLong")
    private static final long sumOfLong(byte[] bArr, Function1<? super Byte, Long> selector) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        long jLongValue = 0;
        for (byte b10 : bArr) {
            jLongValue += selector.invoke(Byte.valueOf(b10)).longValue();
        }
        return jLongValue;
    }

    @NotNull
    public static final <C extends Collection<? super Byte>> C toCollection(@NotNull byte[] bArr, @NotNull C destination) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        for (byte b10 : bArr) {
            destination.add(Byte.valueOf(b10));
        }
        return destination;
    }

    @NotNull
    public static final HashSet<Short> toHashSet(@NotNull short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        return (HashSet) toCollection(sArr, new HashSet(MapsKt__MapsJVMKt.mapCapacity(sArr.length)));
    }

    @NotNull
    public static final Set<Short> toMutableSet(@NotNull short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        return (Set) toCollection(sArr, new LinkedHashSet(MapsKt__MapsJVMKt.mapCapacity(sArr.length)));
    }

    @NotNull
    public static final Set<Byte> union(@NotNull byte[] bArr, @NotNull Iterable<Byte> other) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Set<Byte> mutableSet = toMutableSet(bArr);
        CollectionsKt__MutableCollectionsKt.addAll(mutableSet, other);
        return mutableSet;
    }

    @NotNull
    public static final Iterable<IndexedValue<Short>> withIndex(@NotNull short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        return new IndexingIterable(new AnonymousClass3(sArr));
    }

    public static final boolean all(@NotNull int[] iArr, @NotNull Function1<? super Integer, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (int i10 : iArr) {
            if (!predicate.invoke(Integer.valueOf(i10)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static boolean any(@NotNull int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        return !(iArr.length == 0);
    }

    @e1(version = "1.4")
    @f
    private static final <V> Map<Byte, V> associateWith(byte[] bArr, Function1<? super Byte, ? extends V> valueSelector) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(valueSelector, "valueSelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(r.u(MapsKt__MapsJVMKt.mapCapacity(bArr.length), 16));
        for (byte b10 : bArr) {
            linkedHashMap.put(Byte.valueOf(b10), valueSelector.invoke(Byte.valueOf(b10)));
        }
        return linkedHashMap;
    }

    public static final double average(@NotNull long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        double d10 = 0.0d;
        int i10 = 0;
        for (long j10 : jArr) {
            d10 += j10;
            i10++;
        }
        if (i10 == 0) {
            return Double.NaN;
        }
        return d10 / ((double) i10);
    }

    @f
    private static final int component1(int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        return iArr[0];
    }

    @f
    private static final int component2(int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        return iArr[1];
    }

    @f
    private static final int component3(int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        return iArr[2];
    }

    @f
    private static final int component4(int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        return iArr[3];
    }

    @f
    private static final int component5(int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        return iArr[4];
    }

    public static boolean contains(@NotNull int[] iArr, int i10) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        return indexOf(iArr, i10) >= 0;
    }

    @f
    private static final int count(int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        return iArr.length;
    }

    @NotNull
    public static List<Integer> distinct(@NotNull int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        return CollectionsKt___CollectionsKt.toList(toMutableSet(iArr));
    }

    @f
    private static final int elementAtOrElse(int[] iArr, int i10, Function1<? super Integer, Integer> defaultValue) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        return (i10 < 0 || i10 >= iArr.length) ? defaultValue.invoke(Integer.valueOf(i10)).intValue() : iArr[i10];
    }

    @f
    private static final Integer elementAtOrNull(int[] iArr, int i10) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        return getOrNull(iArr, i10);
    }

    @NotNull
    public static final List<Byte> filterIndexed(@NotNull byte[] bArr, @NotNull Function2<? super Integer, ? super Byte, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int length = bArr.length;
        int i10 = 0;
        int i11 = 0 >> 0;
        int i12 = 0;
        while (i10 < length) {
            byte b10 = bArr[i10];
            int i13 = i12 + 1;
            if (predicate.invoke(Integer.valueOf(i12), Byte.valueOf(b10)).booleanValue()) {
                arrayList.add(Byte.valueOf(b10));
            }
            i10++;
            i12 = i13;
        }
        return arrayList;
    }

    @NotNull
    public static final <C extends Collection<? super Integer>> C filterNotTo(@NotNull int[] iArr, @NotNull C destination, @NotNull Function1<? super Integer, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (int i10 : iArr) {
            if (!predicate.invoke(Integer.valueOf(i10)).booleanValue()) {
                destination.add(Integer.valueOf(i10));
            }
        }
        return destination;
    }

    @NotNull
    public static final <C extends Collection<? super Integer>> C filterTo(@NotNull int[] iArr, @NotNull C destination, @NotNull Function1<? super Integer, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (int i10 : iArr) {
            if (predicate.invoke(Integer.valueOf(i10)).booleanValue()) {
                destination.add(Integer.valueOf(i10));
            }
        }
        return destination;
    }

    @f
    private static final Integer find(int[] iArr, Function1<? super Integer, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (int i10 : iArr) {
            if (predicate.invoke(Integer.valueOf(i10)).booleanValue()) {
                return Integer.valueOf(i10);
            }
        }
        return null;
    }

    @f
    private static final Byte findLast(byte[] bArr, Function1<? super Byte, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = bArr.length - 1;
        if (length < 0) {
            return null;
        }
        while (true) {
            int i10 = length - 1;
            byte b10 = bArr[length];
            if (predicate.invoke(Byte.valueOf(b10)).booleanValue()) {
                return Byte.valueOf(b10);
            }
            if (i10 < 0) {
                return null;
            }
            length = i10;
        }
    }

    public static byte first(@NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        if (bArr.length != 0) {
            return bArr[0];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @Nullable
    public static final Integer firstOrNull(@NotNull int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        if (iArr.length == 0) {
            return null;
        }
        return Integer.valueOf(iArr[0]);
    }

    @u0
    @e1(version = "1.4")
    @f
    @oj.i(name = "flatMapIndexedIterable")
    private static final <R> List<R> flatMapIndexedIterable(int[] iArr, Function2<? super Integer, ? super Integer, ? extends Iterable<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList();
        int length = iArr.length;
        int i10 = 0;
        int i11 = 4 | 0;
        int i12 = 0;
        while (i10 < length) {
            CollectionsKt__MutableCollectionsKt.addAll(arrayList, transform.invoke(Integer.valueOf(i12), Integer.valueOf(iArr[i10])));
            i10++;
            i12++;
        }
        return arrayList;
    }

    @u0
    @e1(version = "1.4")
    @f
    @oj.i(name = "flatMapIndexedIterableTo")
    private static final <R, C extends Collection<? super R>> C flatMapIndexedIterableTo(byte[] bArr, C destination, Function2<? super Integer, ? super Byte, ? extends Iterable<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int length = bArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            CollectionsKt__MutableCollectionsKt.addAll(destination, transform.invoke(Integer.valueOf(i11), Byte.valueOf(bArr[i10])));
            i10++;
            i11++;
        }
        return destination;
    }

    @NotNull
    public static final <R, C extends Collection<? super R>> C flatMapTo(@NotNull byte[] bArr, @NotNull C destination, @NotNull Function1<? super Byte, ? extends Iterable<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        for (byte b10 : bArr) {
            CollectionsKt__MutableCollectionsKt.addAll(destination, transform.invoke(Byte.valueOf(b10)));
        }
        return destination;
    }

    public static final <R> R fold(@NotNull int[] iArr, R r10, @NotNull Function2<? super R, ? super Integer, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        for (int i10 : iArr) {
            r10 = operation.invoke(r10, Integer.valueOf(i10));
        }
        return r10;
    }

    public static final <R> R foldIndexed(@NotNull int[] iArr, R r10, @NotNull n<? super Integer, ? super R, ? super Integer, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int length = iArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            r10 = operation.invoke(Integer.valueOf(i11), r10, Integer.valueOf(iArr[i10]));
            i10++;
            i11++;
        }
        return r10;
    }

    public static final void forEach(@NotNull int[] iArr, @NotNull Function1<? super Integer, Unit> action) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        for (int i10 : iArr) {
            action.invoke(Integer.valueOf(i10));
        }
    }

    public static final void forEachIndexed(@NotNull int[] iArr, @NotNull Function2<? super Integer, ? super Integer, Unit> action) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        int length = iArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            action.invoke(Integer.valueOf(i11), Integer.valueOf(iArr[i10]));
            i10++;
            i11++;
        }
    }

    @NotNull
    public static IntRange getIndices(@NotNull int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        return new IntRange(0, getLastIndex(iArr));
    }

    public static int getLastIndex(@NotNull int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        return iArr.length - 1;
    }

    @f
    private static final int getOrElse(int[] iArr, int i10, Function1<? super Integer, Integer> defaultValue) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        return (i10 < 0 || i10 >= iArr.length) ? defaultValue.invoke(Integer.valueOf(i10)).intValue() : iArr[i10];
    }

    @Nullable
    public static Integer getOrNull(@NotNull int[] iArr, int i10) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        if (i10 < 0 || i10 >= iArr.length) {
            return null;
        }
        return Integer.valueOf(iArr[i10]);
    }

    @f
    private static final boolean isEmpty(int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        if (iArr.length != 0) {
            return false;
        }
        int i10 = 2 << 1;
        return true;
    }

    @f
    private static final boolean isNotEmpty(int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        return !(iArr.length == 0);
    }

    @NotNull
    public static final String joinToString(@NotNull int[] iArr, @NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence postfix, int i10, @NotNull CharSequence truncated, @Nullable Function1<? super Integer, ? extends CharSequence> function1) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(truncated, "truncated");
        String string = ((StringBuilder) joinTo(iArr, new StringBuilder(), separator, prefix, postfix, i10, truncated, function1)).toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public static /* synthetic */ String joinToString$default(int[] iArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, Function1 function1, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            charSequence = ", ";
        }
        if ((i11 & 2) != 0) {
            charSequence2 = "";
        }
        if ((i11 & 4) != 0) {
            charSequence3 = "";
        }
        if ((i11 & 8) != 0) {
            i10 = -1;
        }
        if ((i11 & 16) != 0) {
            charSequence4 = "...";
        }
        if ((i11 & 32) != 0) {
            function1 = null;
        }
        CharSequence charSequence5 = charSequence4;
        Function1 function2 = function1;
        return joinToString(iArr, charSequence, charSequence2, charSequence3, i10, charSequence5, (Function1<? super Integer, ? extends CharSequence>) function2);
    }

    public static byte last(@NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        if (bArr.length != 0) {
            return bArr[getLastIndex(bArr)];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @Nullable
    public static final Integer lastOrNull(@NotNull int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        if (iArr.length == 0) {
            return null;
        }
        return Integer.valueOf(iArr[iArr.length - 1]);
    }

    @NotNull
    public static final <R> List<R> map(@NotNull byte[] bArr, @NotNull Function1<? super Byte, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList(bArr.length);
        for (byte b10 : bArr) {
            arrayList.add(transform.invoke(Byte.valueOf(b10)));
        }
        return arrayList;
    }

    @NotNull
    public static final <R> List<R> mapIndexed(@NotNull byte[] bArr, @NotNull Function2<? super Integer, ? super Byte, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList(bArr.length);
        int length = bArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            arrayList.add(transform.invoke(Integer.valueOf(i11), Byte.valueOf(bArr[i10])));
            i10++;
            i11++;
        }
        return arrayList;
    }

    public static final boolean none(@NotNull int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        return iArr.length == 0;
    }

    @e1(version = "1.4")
    @f
    private static final int[] onEach(int[] iArr, Function1<? super Integer, Unit> action) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        for (int i10 : iArr) {
            action.invoke(Integer.valueOf(i10));
        }
        return iArr;
    }

    @e1(version = "1.4")
    @f
    private static final int[] onEachIndexed(int[] iArr, Function2<? super Integer, ? super Integer, Unit> action) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        int length = iArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            action.invoke(Integer.valueOf(i11), Integer.valueOf(iArr[i10]));
            i10++;
            i11++;
        }
        return iArr;
    }

    @e1(version = "1.3")
    @f
    private static final int random(int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        return random(iArr, (kotlin.random.f) kotlin.random.f.f312895a);
    }

    @e1(version = "1.4")
    @f
    private static final Integer randomOrNull(int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        return randomOrNull(iArr, (kotlin.random.f) kotlin.random.f.f312895a);
    }

    @e1(version = "1.4")
    @Nullable
    public static final Byte reduceRightIndexedOrNull(@NotNull byte[] bArr, @NotNull n<? super Integer, ? super Byte, ? super Byte, Byte> operation) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int lastIndex = getLastIndex(bArr);
        if (lastIndex < 0) {
            return null;
        }
        byte bByteValue = bArr[lastIndex];
        for (int i10 = lastIndex - 1; i10 >= 0; i10--) {
            bByteValue = operation.invoke(Integer.valueOf(i10), Byte.valueOf(bArr[i10]), Byte.valueOf(bByteValue)).byteValue();
        }
        return Byte.valueOf(bByteValue);
    }

    @e1(version = "1.4")
    @Nullable
    public static final Byte reduceRightOrNull(@NotNull byte[] bArr, @NotNull Function2<? super Byte, ? super Byte, Byte> operation) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int lastIndex = getLastIndex(bArr);
        if (lastIndex < 0) {
            return null;
        }
        byte bByteValue = bArr[lastIndex];
        for (int i10 = lastIndex - 1; i10 >= 0; i10--) {
            bByteValue = operation.invoke(Byte.valueOf(bArr[i10]), Byte.valueOf(bByteValue)).byteValue();
        }
        return Byte.valueOf(bByteValue);
    }

    @NotNull
    public static final List<Byte> reversed(@NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        if (bArr.length == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        List<Byte> mutableList = toMutableList(bArr);
        CollectionsKt___CollectionsJvmKt.reverse(mutableList);
        return mutableList;
    }

    @e1(version = "1.4")
    @f
    private static final <R> List<R> scan(long[] jArr, R r10, Function2<? super R, ? super Long, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (jArr.length == 0) {
            return CollectionsKt__CollectionsJVMKt.listOf(r10);
        }
        ArrayList arrayList = new ArrayList(jArr.length + 1);
        arrayList.add(r10);
        for (long j10 : jArr) {
            r10 = operation.invoke(r10, Long.valueOf(j10));
            arrayList.add(r10);
        }
        return arrayList;
    }

    @e1(version = "1.4")
    @f
    private static final <R> List<R> scanIndexed(long[] jArr, R r10, n<? super Integer, ? super R, ? super Long, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (jArr.length == 0) {
            return CollectionsKt__CollectionsJVMKt.listOf(r10);
        }
        ArrayList arrayList = new ArrayList(jArr.length + 1);
        arrayList.add(r10);
        int length = jArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            r10 = operation.invoke(Integer.valueOf(i10), r10, Long.valueOf(jArr[i10]));
            arrayList.add(r10);
        }
        return arrayList;
    }

    @e1(version = "1.4")
    public static final void shuffle(@NotNull int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        shuffle(iArr, (kotlin.random.f) kotlin.random.f.f312895a);
    }

    @Nullable
    public static final Integer singleOrNull(@NotNull int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        if (iArr.length == 1) {
            return Integer.valueOf(iArr[0]);
        }
        return null;
    }

    @NotNull
    public static byte[] sliceArray(@NotNull byte[] bArr, @NotNull Collection<Integer> indices) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(indices, "indices");
        byte[] bArr2 = new byte[indices.size()];
        Iterator<Integer> it = indices.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            bArr2[i10] = bArr[it.next().intValue()];
            i10++;
        }
        return bArr2;
    }

    @NotNull
    public static final List<Integer> sorted(@NotNull int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Integer[] typedArray = ArraysKt___ArraysJvmKt.toTypedArray(iArr);
        ArraysKt___ArraysJvmKt.sort((Object[]) typedArray);
        return ArraysKt___ArraysJvmKt.asList(typedArray);
    }

    @NotNull
    public static final <R extends Comparable<? super R>> List<Integer> sortedBy(@NotNull int[] iArr, @NotNull Function1<? super Integer, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        return sortedWith(iArr, (Comparator<? super Integer>) new g.a(selector));
    }

    @NotNull
    public static final <R extends Comparable<? super R>> List<Integer> sortedByDescending(@NotNull int[] iArr, @NotNull Function1<? super Integer, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        return sortedWith(iArr, (Comparator<? super Integer>) new g.c(selector));
    }

    @NotNull
    public static final List<Integer> sortedDescending(@NotNull int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
        Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "copyOf(...)");
        ArraysKt___ArraysJvmKt.sort(iArrCopyOf);
        return reversed(iArrCopyOf);
    }

    @NotNull
    public static final List<Integer> sortedWith(@NotNull int[] iArr, @NotNull Comparator<? super Integer> comparator) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Integer[] typedArray = ArraysKt___ArraysJvmKt.toTypedArray(iArr);
        ArraysKt___ArraysJvmKt.sortWith(typedArray, comparator);
        return ArraysKt___ArraysJvmKt.asList(typedArray);
    }

    public static long sum(@NotNull long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        long j10 = 0;
        for (long j11 : jArr) {
            j10 += j11;
        }
        return j10;
    }

    @u0
    @m2(markerClass = {u.class})
    @e1(version = "1.5")
    @f
    @oj.i(name = "sumOfUInt")
    private static final int sumOfUInt(byte[] bArr, Function1<? super Byte, u1> selector) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        int iN = u1.n(0);
        for (byte b10 : bArr) {
            iN = u1.n(iN + selector.invoke(Byte.valueOf(b10)).z0());
        }
        return iN;
    }

    @u0
    @m2(markerClass = {u.class})
    @e1(version = "1.5")
    @f
    @oj.i(name = "sumOfULong")
    private static final long sumOfULong(byte[] bArr, Function1<? super Byte, y1> selector) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        long jN = y1.n(0L);
        for (byte b10 : bArr) {
            jN = y1.n(jN + selector.invoke(Byte.valueOf(b10)).z0());
        }
        return jN;
    }

    @NotNull
    public static final HashSet<Integer> toHashSet(@NotNull int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        return (HashSet) toCollection(iArr, new HashSet(MapsKt__MapsJVMKt.mapCapacity(iArr.length)));
    }

    @NotNull
    public static final List<Short> toMutableList(@NotNull short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        ArrayList arrayList = new ArrayList(sArr.length);
        for (short s10 : sArr) {
            arrayList.add(Short.valueOf(s10));
        }
        return arrayList;
    }

    @NotNull
    public static final Set<Integer> toMutableSet(@NotNull int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        return (Set) toCollection(iArr, new LinkedHashSet(MapsKt__MapsJVMKt.mapCapacity(iArr.length)));
    }

    @NotNull
    public static final Iterable<IndexedValue<Integer>> withIndex(@NotNull int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        return new IndexingIterable(new AnonymousClass4(iArr));
    }

    @NotNull
    public static final <R, V> List<V> zip(@NotNull byte[] bArr, @NotNull R[] other, @NotNull Function2<? super Byte, ? super R, ? extends V> transform) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int iMin = Math.min(bArr.length, other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i10 = 0; i10 < iMin; i10++) {
            arrayList.add(transform.invoke(Byte.valueOf(bArr[i10]), other[i10]));
        }
        return arrayList;
    }

    public static final boolean all(@NotNull long[] jArr, @NotNull Function1<? super Long, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (long j10 : jArr) {
            if (!predicate.invoke(Long.valueOf(j10)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static boolean any(@NotNull long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        return !(jArr.length == 0);
    }

    @NotNull
    public static final Iterable<Short> asIterable(@NotNull short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        return sArr.length == 0 ? CollectionsKt__CollectionsKt.emptyList() : new ArraysKt___ArraysKt$asIterable$$inlined$Iterable$3(sArr);
    }

    @NotNull
    public static final Sequence<Short> asSequence(@NotNull final short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        return sArr.length == 0 ? o.g() : new Sequence<Short>() { // from class: kotlin.collections.ArraysKt___ArraysKt$asSequence$$inlined$Sequence$3
            @Override // kotlin.sequences.Sequence
            public Iterator<Short> iterator() {
                return j.h(sArr);
            }
        };
    }

    @NotNull
    public static final <K, V> Map<K, V> associate(@NotNull byte[] bArr, @NotNull Function1<? super Byte, ? extends Pair<? extends K, ? extends V>> transform) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(r.u(MapsKt__MapsJVMKt.mapCapacity(bArr.length), 16));
        for (byte b10 : bArr) {
            Pair<? extends K, ? extends V> pairInvoke = transform.invoke(Byte.valueOf(b10));
            linkedHashMap.put(pairInvoke.getFirst(), pairInvoke.getSecond());
        }
        return linkedHashMap;
    }

    @NotNull
    public static final <K> Map<K, Byte> associateBy(@NotNull byte[] bArr, @NotNull Function1<? super Byte, ? extends K> keySelector) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(r.u(MapsKt__MapsJVMKt.mapCapacity(bArr.length), 16));
        for (byte b10 : bArr) {
            linkedHashMap.put(keySelector.invoke(Byte.valueOf(b10)), Byte.valueOf(b10));
        }
        return linkedHashMap;
    }

    @NotNull
    public static final <K, M extends Map<? super K, ? super Short>> M associateByTo(@NotNull short[] sArr, @NotNull M destination, @NotNull Function1<? super Short, ? extends K> keySelector) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        for (short s10 : sArr) {
            destination.put(keySelector.invoke(Short.valueOf(s10)), Short.valueOf(s10));
        }
        return destination;
    }

    @NotNull
    public static final <K, V, M extends Map<? super K, ? super V>> M associateTo(@NotNull short[] sArr, @NotNull M destination, @NotNull Function1<? super Short, ? extends Pair<? extends K, ? extends V>> transform) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        for (short s10 : sArr) {
            Pair<? extends K, ? extends V> pairInvoke = transform.invoke(Short.valueOf(s10));
            destination.put(pairInvoke.getFirst(), pairInvoke.getSecond());
        }
        return destination;
    }

    @e1(version = "1.4")
    @f
    private static final <V, M extends Map<? super Short, ? super V>> M associateWithTo(short[] sArr, M destination, Function1<? super Short, ? extends V> valueSelector) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(valueSelector, "valueSelector");
        for (short s10 : sArr) {
            destination.put(Short.valueOf(s10), valueSelector.invoke(Short.valueOf(s10)));
        }
        return destination;
    }

    public static final double average(@NotNull float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        double d10 = 0.0d;
        int i10 = 0;
        for (float f10 : fArr) {
            d10 += (double) f10;
            i10++;
        }
        if (i10 == 0) {
            return Double.NaN;
        }
        return d10 / ((double) i10);
    }

    @f
    private static final long component1(long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        return jArr[0];
    }

    @f
    private static final long component2(long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        return jArr[1];
    }

    @f
    private static final long component3(long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        return jArr[2];
    }

    @f
    private static final long component4(long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        return jArr[3];
    }

    @f
    private static final long component5(long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        return jArr[4];
    }

    public static boolean contains(@NotNull long[] jArr, long j10) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        return indexOf(jArr, j10) >= 0;
    }

    @f
    private static final int count(long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        return jArr.length;
    }

    @NotNull
    public static final List<Long> distinct(@NotNull long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        return CollectionsKt___CollectionsKt.toList(toMutableSet(jArr));
    }

    @NotNull
    public static final List<Short> drop(@NotNull short[] sArr, int i10) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        if (i10 >= 0) {
            return takeLast(sArr, r.u(sArr.length - i10, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
    }

    @NotNull
    public static final List<Short> dropLast(@NotNull short[] sArr, int i10) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        if (i10 >= 0) {
            return take(sArr, r.u(sArr.length - i10, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
    }

    @NotNull
    public static final List<Byte> dropLastWhile(@NotNull byte[] bArr, @NotNull Function1<? super Byte, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (int lastIndex = getLastIndex(bArr); -1 < lastIndex; lastIndex--) {
            if (!predicate.invoke(Byte.valueOf(bArr[lastIndex])).booleanValue()) {
                return take(bArr, lastIndex + 1);
            }
        }
        return CollectionsKt__CollectionsKt.emptyList();
    }

    @f
    private static final long elementAtOrElse(long[] jArr, int i10, Function1<? super Integer, Long> defaultValue) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        return (i10 < 0 || i10 >= jArr.length) ? defaultValue.invoke(Integer.valueOf(i10)).longValue() : jArr[i10];
    }

    @f
    private static final Long elementAtOrNull(long[] jArr, int i10) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        return getOrNull(jArr, i10);
    }

    @NotNull
    public static final List<Short> filter(@NotNull short[] sArr, @NotNull Function1<? super Short, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (short s10 : sArr) {
            if (predicate.invoke(Short.valueOf(s10)).booleanValue()) {
                arrayList.add(Short.valueOf(s10));
            }
        }
        return arrayList;
    }

    @NotNull
    public static final <C extends Collection<? super Short>> C filterIndexedTo(@NotNull short[] sArr, @NotNull C destination, @NotNull Function2<? super Integer, ? super Short, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = sArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            short s10 = sArr[i10];
            int i12 = i11 + 1;
            if (predicate.invoke(Integer.valueOf(i11), Short.valueOf(s10)).booleanValue()) {
                destination.add(Short.valueOf(s10));
            }
            i10++;
            i11 = i12;
        }
        return destination;
    }

    @NotNull
    public static final List<Short> filterNot(@NotNull short[] sArr, @NotNull Function1<? super Short, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (short s10 : sArr) {
            if (!predicate.invoke(Short.valueOf(s10)).booleanValue()) {
                arrayList.add(Short.valueOf(s10));
            }
        }
        return arrayList;
    }

    @NotNull
    public static final <C extends Collection<? super Long>> C filterNotTo(@NotNull long[] jArr, @NotNull C destination, @NotNull Function1<? super Long, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (long j10 : jArr) {
            if (!predicate.invoke(Long.valueOf(j10)).booleanValue()) {
                destination.add(Long.valueOf(j10));
            }
        }
        return destination;
    }

    @NotNull
    public static final <C extends Collection<? super Long>> C filterTo(@NotNull long[] jArr, @NotNull C destination, @NotNull Function1<? super Long, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (long j10 : jArr) {
            if (predicate.invoke(Long.valueOf(j10)).booleanValue()) {
                destination.add(Long.valueOf(j10));
            }
        }
        return destination;
    }

    @f
    private static final Long find(long[] jArr, Function1<? super Long, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (long j10 : jArr) {
            if (predicate.invoke(Long.valueOf(j10)).booleanValue()) {
                return Long.valueOf(j10);
            }
        }
        return null;
    }

    @Nullable
    public static final Long firstOrNull(@NotNull long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        if (jArr.length == 0) {
            return null;
        }
        return Long.valueOf(jArr[0]);
    }

    @NotNull
    public static final <R> List<R> flatMap(@NotNull byte[] bArr, @NotNull Function1<? super Byte, ? extends Iterable<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList();
        boolean z10 = false | false;
        for (byte b10 : bArr) {
            CollectionsKt__MutableCollectionsKt.addAll(arrayList, transform.invoke(Byte.valueOf(b10)));
        }
        return arrayList;
    }

    @u0
    @e1(version = "1.4")
    @f
    @oj.i(name = "flatMapIndexedIterable")
    private static final <R> List<R> flatMapIndexedIterable(long[] jArr, Function2<? super Integer, ? super Long, ? extends Iterable<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList();
        int length = jArr.length;
        int i10 = 0;
        int i11 = 6 & 0;
        int i12 = 0;
        while (i10 < length) {
            CollectionsKt__MutableCollectionsKt.addAll(arrayList, transform.invoke(Integer.valueOf(i12), Long.valueOf(jArr[i10])));
            i10++;
            i12++;
        }
        return arrayList;
    }

    public static final <R> R fold(@NotNull long[] jArr, R r10, @NotNull Function2<? super R, ? super Long, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        for (long j10 : jArr) {
            r10 = operation.invoke(r10, Long.valueOf(j10));
        }
        return r10;
    }

    public static final <R> R foldIndexed(@NotNull long[] jArr, R r10, @NotNull n<? super Integer, ? super R, ? super Long, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int length = jArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            r10 = operation.invoke(Integer.valueOf(i11), r10, Long.valueOf(jArr[i10]));
            i10++;
            i11++;
        }
        return r10;
    }

    public static final <R> R foldRight(@NotNull short[] sArr, R r10, @NotNull Function2<? super Short, ? super R, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        for (int lastIndex = getLastIndex(sArr); lastIndex >= 0; lastIndex--) {
            r10 = operation.invoke(Short.valueOf(sArr[lastIndex]), r10);
        }
        return r10;
    }

    public static final <R> R foldRightIndexed(@NotNull short[] sArr, R r10, @NotNull n<? super Integer, ? super Short, ? super R, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        for (int lastIndex = getLastIndex(sArr); lastIndex >= 0; lastIndex--) {
            r10 = operation.invoke(Integer.valueOf(lastIndex), Short.valueOf(sArr[lastIndex]), r10);
        }
        return r10;
    }

    public static final void forEach(@NotNull long[] jArr, @NotNull Function1<? super Long, Unit> action) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        for (long j10 : jArr) {
            action.invoke(Long.valueOf(j10));
        }
    }

    public static final void forEachIndexed(@NotNull long[] jArr, @NotNull Function2<? super Integer, ? super Long, Unit> action) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        int length = jArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            action.invoke(Integer.valueOf(i11), Long.valueOf(jArr[i10]));
            i10++;
            i11++;
        }
    }

    @NotNull
    public static IntRange getIndices(@NotNull long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        return new IntRange(0, getLastIndex(jArr));
    }

    public static int getLastIndex(@NotNull long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        return jArr.length - 1;
    }

    @f
    private static final long getOrElse(long[] jArr, int i10, Function1<? super Integer, Long> defaultValue) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        return (i10 < 0 || i10 >= jArr.length) ? defaultValue.invoke(Integer.valueOf(i10)).longValue() : jArr[i10];
    }

    @Nullable
    public static final Long getOrNull(@NotNull long[] jArr, int i10) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        if (i10 < 0 || i10 >= jArr.length) {
            return null;
        }
        return Long.valueOf(jArr[i10]);
    }

    public static int indexOf(@NotNull byte[] bArr, byte b10) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        int length = bArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (b10 == bArr[i10]) {
                return i10;
            }
        }
        return -1;
    }

    public static final int indexOfFirst(@NotNull short[] sArr, @NotNull Function1<? super Short, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = sArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (predicate.invoke(Short.valueOf(sArr[i10])).booleanValue()) {
                return i10;
            }
        }
        return -1;
    }

    public static final int indexOfLast(@NotNull short[] sArr, @NotNull Function1<? super Short, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = sArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i10 = length - 1;
                if (predicate.invoke(Short.valueOf(sArr[length])).booleanValue()) {
                    return length;
                }
                if (i10 >= 0) {
                    length = i10;
                }
            }
        }
        return -1;
    }

    @NotNull
    public static final Set<Short> intersect(@NotNull short[] sArr, @NotNull Iterable<Short> other) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Set<Short> mutableSet = toMutableSet(sArr);
        CollectionsKt__MutableCollectionsKt.retainAll(mutableSet, other);
        return mutableSet;
    }

    @f
    private static final boolean isEmpty(long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        return jArr.length == 0;
    }

    @f
    private static final boolean isNotEmpty(long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        return !(jArr.length == 0);
    }

    @NotNull
    public static final String joinToString(@NotNull long[] jArr, @NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence postfix, int i10, @NotNull CharSequence truncated, @Nullable Function1<? super Long, ? extends CharSequence> function1) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(truncated, "truncated");
        String string = ((StringBuilder) joinTo(jArr, new StringBuilder(), separator, prefix, postfix, i10, truncated, function1)).toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public static /* synthetic */ String joinToString$default(long[] jArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, Function1 function1, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            charSequence = ", ";
        }
        if ((i11 & 2) != 0) {
            charSequence2 = "";
        }
        if ((i11 & 4) != 0) {
            charSequence3 = "";
        }
        if ((i11 & 8) != 0) {
            i10 = -1;
        }
        if ((i11 & 16) != 0) {
            charSequence4 = "...";
        }
        if ((i11 & 32) != 0) {
            function1 = null;
        }
        CharSequence charSequence5 = charSequence4;
        Function1 function2 = function1;
        return joinToString(jArr, charSequence, charSequence2, charSequence3, i10, charSequence5, (Function1<? super Long, ? extends CharSequence>) function2);
    }

    public static int lastIndexOf(@NotNull byte[] bArr, byte b10) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        int length = bArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i10 = length - 1;
                if (b10 == bArr[length]) {
                    return length;
                }
                if (i10 >= 0) {
                    length = i10;
                }
            }
        }
        return -1;
    }

    @Nullable
    public static final Long lastOrNull(@NotNull long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        if (jArr.length == 0) {
            return null;
        }
        return Long.valueOf(jArr[jArr.length - 1]);
    }

    @NotNull
    public static final <R, C extends Collection<? super R>> C mapIndexedTo(@NotNull short[] sArr, @NotNull C destination, @NotNull Function2<? super Integer, ? super Short, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int length = sArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            destination.add(transform.invoke(Integer.valueOf(i11), Short.valueOf(sArr[i10])));
            i10++;
            i11++;
        }
        return destination;
    }

    @NotNull
    public static final <R, C extends Collection<? super R>> C mapTo(@NotNull short[] sArr, @NotNull C destination, @NotNull Function1<? super Short, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        for (short s10 : sArr) {
            destination.add(transform.invoke(Short.valueOf(s10)));
        }
        return destination;
    }

    public static final boolean none(@NotNull long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        return jArr.length == 0;
    }

    @e1(version = "1.4")
    @f
    private static final long[] onEach(long[] jArr, Function1<? super Long, Unit> action) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        for (long j10 : jArr) {
            action.invoke(Long.valueOf(j10));
        }
        return jArr;
    }

    @e1(version = "1.4")
    @f
    private static final long[] onEachIndexed(long[] jArr, Function2<? super Integer, ? super Long, Unit> action) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        int length = jArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            action.invoke(Integer.valueOf(i11), Long.valueOf(jArr[i10]));
            i10++;
            i11++;
        }
        return jArr;
    }

    @e1(version = "1.3")
    @f
    private static final long random(long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        return random(jArr, (kotlin.random.f) kotlin.random.f.f312895a);
    }

    @e1(version = "1.4")
    @f
    private static final Long randomOrNull(long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        return randomOrNull(jArr, (kotlin.random.f) kotlin.random.f.f312895a);
    }

    @e1(version = "1.4")
    @Nullable
    public static final Byte reduceIndexedOrNull(@NotNull byte[] bArr, @NotNull n<? super Integer, ? super Byte, ? super Byte, Byte> operation) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (bArr.length == 0) {
            return null;
        }
        byte bByteValue = bArr[0];
        int lastIndex = getLastIndex(bArr);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                bByteValue = operation.invoke(Integer.valueOf(i10), Byte.valueOf(bByteValue), Byte.valueOf(bArr[i10])).byteValue();
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return Byte.valueOf(bByteValue);
    }

    @e1(version = "1.4")
    @Nullable
    public static final Byte reduceOrNull(@NotNull byte[] bArr, @NotNull Function2<? super Byte, ? super Byte, Byte> operation) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (bArr.length == 0) {
            return null;
        }
        byte bByteValue = bArr[0];
        int lastIndex = getLastIndex(bArr);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                bByteValue = operation.invoke(Byte.valueOf(bByteValue), Byte.valueOf(bArr[i10])).byteValue();
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return Byte.valueOf(bByteValue);
    }

    public static final byte reduceRight(@NotNull byte[] bArr, @NotNull Function2<? super Byte, ? super Byte, Byte> operation) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int lastIndex = getLastIndex(bArr);
        if (lastIndex < 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        byte bByteValue = bArr[lastIndex];
        for (int i10 = lastIndex - 1; i10 >= 0; i10--) {
            bByteValue = operation.invoke(Byte.valueOf(bArr[i10]), Byte.valueOf(bByteValue)).byteValue();
        }
        return bByteValue;
    }

    public static final byte reduceRightIndexed(@NotNull byte[] bArr, @NotNull n<? super Integer, ? super Byte, ? super Byte, Byte> operation) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int lastIndex = getLastIndex(bArr);
        if (lastIndex < 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        byte bByteValue = bArr[lastIndex];
        for (int i10 = lastIndex - 1; i10 >= 0; i10--) {
            bByteValue = operation.invoke(Integer.valueOf(i10), Byte.valueOf(bArr[i10]), Byte.valueOf(bByteValue)).byteValue();
        }
        return bByteValue;
    }

    @NotNull
    public static byte[] reversedArray(@NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        if (bArr.length == 0) {
            return bArr;
        }
        byte[] bArr2 = new byte[bArr.length];
        int lastIndex = getLastIndex(bArr);
        if (lastIndex >= 0) {
            int i10 = 0;
            while (true) {
                bArr2[lastIndex - i10] = bArr[i10];
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return bArr2;
    }

    @e1(version = "1.4")
    @f
    private static final <R> List<R> scan(float[] fArr, R r10, Function2<? super R, ? super Float, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (fArr.length == 0) {
            return CollectionsKt__CollectionsJVMKt.listOf(r10);
        }
        ArrayList arrayList = new ArrayList(fArr.length + 1);
        arrayList.add(r10);
        for (float f10 : fArr) {
            r10 = operation.invoke(r10, Float.valueOf(f10));
            arrayList.add(r10);
        }
        return arrayList;
    }

    @e1(version = "1.4")
    @f
    private static final <R> List<R> scanIndexed(float[] fArr, R r10, n<? super Integer, ? super R, ? super Float, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (fArr.length == 0) {
            return CollectionsKt__CollectionsJVMKt.listOf(r10);
        }
        ArrayList arrayList = new ArrayList(fArr.length + 1);
        arrayList.add(r10);
        int length = fArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            r10 = operation.invoke(Integer.valueOf(i10), r10, Float.valueOf(fArr[i10]));
            arrayList.add(r10);
        }
        return arrayList;
    }

    @e1(version = "1.4")
    public static final void shuffle(@NotNull long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        shuffle(jArr, (kotlin.random.f) kotlin.random.f.f312895a);
    }

    public static byte single(@NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        int length = bArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        if (length == 1) {
            return bArr[0];
        }
        throw new IllegalArgumentException("Array has more than one element.");
    }

    @Nullable
    public static final Long singleOrNull(@NotNull long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        if (jArr.length == 1) {
            return Long.valueOf(jArr[0]);
        }
        return null;
    }

    @NotNull
    public static final List<Short> slice(@NotNull short[] sArr, @NotNull IntRange indices) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(indices, "indices");
        return indices.isEmpty() ? CollectionsKt__CollectionsKt.emptyList() : ArraysKt___ArraysJvmKt.asList(ArraysKt___ArraysJvmKt.copyOfRange(sArr, indices.u().intValue(), indices.i().intValue() + 1));
    }

    public static final void sortDescending(@NotNull short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        if (sArr.length > 1) {
            ArraysKt___ArraysJvmKt.sort(sArr);
            reverse(sArr);
        }
    }

    @NotNull
    public static final List<Long> sorted(@NotNull long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Long[] typedArray = ArraysKt___ArraysJvmKt.toTypedArray(jArr);
        ArraysKt___ArraysJvmKt.sort((Object[]) typedArray);
        return ArraysKt___ArraysJvmKt.asList(typedArray);
    }

    @NotNull
    public static final short[] sortedArray(@NotNull short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        if (sArr.length == 0) {
            return sArr;
        }
        short[] sArrCopyOf = Arrays.copyOf(sArr, sArr.length);
        Intrinsics.checkNotNullExpressionValue(sArrCopyOf, "copyOf(...)");
        ArraysKt___ArraysJvmKt.sort(sArrCopyOf);
        return sArrCopyOf;
    }

    @NotNull
    public static final short[] sortedArrayDescending(@NotNull short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        if (sArr.length == 0) {
            return sArr;
        }
        short[] sArrCopyOf = Arrays.copyOf(sArr, sArr.length);
        Intrinsics.checkNotNullExpressionValue(sArrCopyOf, "copyOf(...)");
        sortDescending(sArrCopyOf);
        return sArrCopyOf;
    }

    @NotNull
    public static final <R extends Comparable<? super R>> List<Long> sortedBy(@NotNull long[] jArr, @NotNull Function1<? super Long, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        return sortedWith(jArr, (Comparator<? super Long>) new g.a(selector));
    }

    @NotNull
    public static final <R extends Comparable<? super R>> List<Long> sortedByDescending(@NotNull long[] jArr, @NotNull Function1<? super Long, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        return sortedWith(jArr, (Comparator<? super Long>) new g.c(selector));
    }

    @NotNull
    public static final List<Long> sortedDescending(@NotNull long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        long[] jArrCopyOf = Arrays.copyOf(jArr, jArr.length);
        Intrinsics.checkNotNullExpressionValue(jArrCopyOf, "copyOf(...)");
        ArraysKt___ArraysJvmKt.sort(jArrCopyOf);
        return reversed(jArrCopyOf);
    }

    @NotNull
    public static final List<Long> sortedWith(@NotNull long[] jArr, @NotNull Comparator<? super Long> comparator) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Long[] typedArray = ArraysKt___ArraysJvmKt.toTypedArray(jArr);
        ArraysKt___ArraysJvmKt.sortWith(typedArray, comparator);
        return ArraysKt___ArraysJvmKt.asList(typedArray);
    }

    @NotNull
    public static final Set<Short> subtract(@NotNull short[] sArr, @NotNull Iterable<Short> other) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Set<Short> mutableSet = toMutableSet(sArr);
        CollectionsKt__MutableCollectionsKt.removeAll(mutableSet, other);
        return mutableSet;
    }

    public static float sum(@NotNull float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        float f10 = 0.0f;
        for (float f11 : fArr) {
            f10 += f11;
        }
        return f10;
    }

    @l(message = "Use sumOf instead.", replaceWith = @b1(expression = "this.sumOf(selector)", imports = {}))
    @m(warningSince = "1.5")
    public static final int sumBy(@NotNull short[] sArr, @NotNull Function1<? super Short, Integer> selector) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        int iIntValue = 0;
        for (short s10 : sArr) {
            iIntValue += selector.invoke(Short.valueOf(s10)).intValue();
        }
        return iIntValue;
    }

    @l(message = "Use sumOf instead.", replaceWith = @b1(expression = "this.sumOf(selector)", imports = {}))
    @m(warningSince = "1.5")
    public static final double sumByDouble(@NotNull short[] sArr, @NotNull Function1<? super Short, Double> selector) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        double dDoubleValue = 0.0d;
        for (short s10 : sArr) {
            dDoubleValue += selector.invoke(Short.valueOf(s10)).doubleValue();
        }
        return dDoubleValue;
    }

    @u0
    @e1(version = "1.4")
    @f
    @oj.i(name = "sumOfDouble")
    private static final double sumOfDouble(short[] sArr, Function1<? super Short, Double> selector) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        double dDoubleValue = 0.0d;
        for (short s10 : sArr) {
            dDoubleValue += selector.invoke(Short.valueOf(s10)).doubleValue();
        }
        return dDoubleValue;
    }

    @u0
    @e1(version = "1.4")
    @f
    @oj.i(name = "sumOfInt")
    private static final int sumOfInt(short[] sArr, Function1<? super Short, Integer> selector) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        int iIntValue = 0;
        for (short s10 : sArr) {
            iIntValue += selector.invoke(Short.valueOf(s10)).intValue();
        }
        return iIntValue;
    }

    @u0
    @e1(version = "1.4")
    @f
    @oj.i(name = "sumOfLong")
    private static final long sumOfLong(short[] sArr, Function1<? super Short, Long> selector) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        long jLongValue = 0;
        for (short s10 : sArr) {
            jLongValue += selector.invoke(Short.valueOf(s10)).longValue();
        }
        return jLongValue;
    }

    @NotNull
    public static final List<Byte> takeLastWhile(@NotNull byte[] bArr, @NotNull Function1<? super Byte, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (int lastIndex = getLastIndex(bArr); -1 < lastIndex; lastIndex--) {
            if (!predicate.invoke(Byte.valueOf(bArr[lastIndex])).booleanValue()) {
                return drop(bArr, lastIndex + 1);
            }
        }
        return toList(bArr);
    }

    @NotNull
    public static final List<Byte> takeWhile(@NotNull byte[] bArr, @NotNull Function1<? super Byte, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int i10 = 2 | 0;
        for (byte b10 : bArr) {
            if (!predicate.invoke(Byte.valueOf(b10)).booleanValue()) {
                break;
            }
            arrayList.add(Byte.valueOf(b10));
        }
        return arrayList;
    }

    @NotNull
    public static final <C extends Collection<? super Short>> C toCollection(@NotNull short[] sArr, @NotNull C destination) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        for (short s10 : sArr) {
            destination.add(Short.valueOf(s10));
        }
        return destination;
    }

    @NotNull
    public static final HashSet<Long> toHashSet(@NotNull long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        return (HashSet) toCollection(jArr, new HashSet(MapsKt__MapsJVMKt.mapCapacity(jArr.length)));
    }

    @NotNull
    public static List<Byte> toList(@NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        int length = bArr.length;
        if (length == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        if (length != 1) {
            return toMutableList(bArr);
        }
        return CollectionsKt__CollectionsJVMKt.listOf(Byte.valueOf(bArr[0]));
    }

    @NotNull
    public static final Set<Long> toMutableSet(@NotNull long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        return (Set) toCollection(jArr, new LinkedHashSet(MapsKt__MapsJVMKt.mapCapacity(jArr.length)));
    }

    @NotNull
    public static final Set<Byte> toSet(@NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        int length = bArr.length;
        if (length == 0) {
            return SetsKt__SetsKt.emptySet();
        }
        if (length != 1) {
            return (Set) toCollection(bArr, new LinkedHashSet(MapsKt__MapsJVMKt.mapCapacity(bArr.length)));
        }
        return SetsKt__SetsJVMKt.setOf(Byte.valueOf(bArr[0]));
    }

    @NotNull
    public static final Set<Short> union(@NotNull short[] sArr, @NotNull Iterable<Short> other) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Set<Short> mutableSet = toMutableSet(sArr);
        CollectionsKt__MutableCollectionsKt.addAll(mutableSet, other);
        return mutableSet;
    }

    @NotNull
    public static final Iterable<IndexedValue<Long>> withIndex(@NotNull long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        return new IndexingIterable(new AnonymousClass5(jArr));
    }

    public static final boolean all(@NotNull float[] fArr, @NotNull Function1<? super Float, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (float f10 : fArr) {
            if (!predicate.invoke(Float.valueOf(f10)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static final boolean any(@NotNull float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        return !(fArr.length == 0);
    }

    @e1(version = "1.4")
    @f
    private static final <V> Map<Short, V> associateWith(short[] sArr, Function1<? super Short, ? extends V> valueSelector) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(valueSelector, "valueSelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(r.u(MapsKt__MapsJVMKt.mapCapacity(sArr.length), 16));
        for (short s10 : sArr) {
            linkedHashMap.put(Short.valueOf(s10), valueSelector.invoke(Short.valueOf(s10)));
        }
        return linkedHashMap;
    }

    public static final double average(@NotNull double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        double d10 = 0.0d;
        int i10 = 0;
        for (double d11 : dArr) {
            d10 += d11;
            i10++;
        }
        if (i10 == 0) {
            return Double.NaN;
        }
        return d10 / ((double) i10);
    }

    @f
    private static final float component1(float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        return fArr[0];
    }

    @f
    private static final float component2(float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        return fArr[1];
    }

    @f
    private static final float component3(float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        return fArr[2];
    }

    @f
    private static final float component4(float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        return fArr[3];
    }

    @f
    private static final float component5(float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        return fArr[4];
    }

    public static final boolean contains(@NotNull boolean[] zArr, boolean z10) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        return indexOf(zArr, z10) >= 0;
    }

    @f
    private static final int count(float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        return fArr.length;
    }

    @NotNull
    public static final List<Float> distinct(@NotNull float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        return CollectionsKt___CollectionsKt.toList(toMutableSet(fArr));
    }

    @NotNull
    public static final List<Byte> dropWhile(@NotNull byte[] bArr, @NotNull Function1<? super Byte, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        boolean z10 = false;
        for (byte b10 : bArr) {
            if (z10) {
                arrayList.add(Byte.valueOf(b10));
            } else if (!predicate.invoke(Byte.valueOf(b10)).booleanValue()) {
                arrayList.add(Byte.valueOf(b10));
                z10 = true;
            }
        }
        return arrayList;
    }

    @f
    private static final float elementAtOrElse(float[] fArr, int i10, Function1<? super Integer, Float> defaultValue) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        return (i10 < 0 || i10 >= fArr.length) ? defaultValue.invoke(Integer.valueOf(i10)).floatValue() : fArr[i10];
    }

    @f
    private static final Float elementAtOrNull(float[] fArr, int i10) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        return getOrNull(fArr, i10);
    }

    @NotNull
    public static final <C extends Collection<? super Float>> C filterNotTo(@NotNull float[] fArr, @NotNull C destination, @NotNull Function1<? super Float, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (float f10 : fArr) {
            if (!predicate.invoke(Float.valueOf(f10)).booleanValue()) {
                destination.add(Float.valueOf(f10));
            }
        }
        return destination;
    }

    @NotNull
    public static final <C extends Collection<? super Float>> C filterTo(@NotNull float[] fArr, @NotNull C destination, @NotNull Function1<? super Float, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (float f10 : fArr) {
            if (predicate.invoke(Float.valueOf(f10)).booleanValue()) {
                destination.add(Float.valueOf(f10));
            }
        }
        return destination;
    }

    @f
    private static final Float find(float[] fArr, Function1<? super Float, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (float f10 : fArr) {
            if (predicate.invoke(Float.valueOf(f10)).booleanValue()) {
                return Float.valueOf(f10);
            }
        }
        return null;
    }

    @Nullable
    public static Float firstOrNull(@NotNull float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        if (fArr.length == 0) {
            return null;
        }
        return Float.valueOf(fArr[0]);
    }

    @u0
    @e1(version = "1.4")
    @f
    @oj.i(name = "flatMapIndexedIterable")
    private static final <R> List<R> flatMapIndexedIterable(float[] fArr, Function2<? super Integer, ? super Float, ? extends Iterable<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList();
        int length = fArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            CollectionsKt__MutableCollectionsKt.addAll(arrayList, transform.invoke(Integer.valueOf(i11), Float.valueOf(fArr[i10])));
            i10++;
            i11++;
        }
        return arrayList;
    }

    public static final <R> R fold(@NotNull float[] fArr, R r10, @NotNull Function2<? super R, ? super Float, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        for (float f10 : fArr) {
            r10 = operation.invoke(r10, Float.valueOf(f10));
        }
        return r10;
    }

    public static final <R> R foldIndexed(@NotNull float[] fArr, R r10, @NotNull n<? super Integer, ? super R, ? super Float, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int length = fArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            r10 = operation.invoke(Integer.valueOf(i11), r10, Float.valueOf(fArr[i10]));
            i10++;
            i11++;
        }
        return r10;
    }

    public static final void forEach(@NotNull float[] fArr, @NotNull Function1<? super Float, Unit> action) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        for (float f10 : fArr) {
            action.invoke(Float.valueOf(f10));
        }
    }

    public static final void forEachIndexed(@NotNull float[] fArr, @NotNull Function2<? super Integer, ? super Float, Unit> action) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        int length = fArr.length;
        int i10 = 0;
        int i11 = 6 & 0;
        int i12 = 0;
        while (i10 < length) {
            action.invoke(Integer.valueOf(i12), Float.valueOf(fArr[i10]));
            i10++;
            i12++;
        }
    }

    @NotNull
    public static final IntRange getIndices(@NotNull float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        return new IntRange(0, getLastIndex(fArr));
    }

    public static int getLastIndex(@NotNull float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        return fArr.length - 1;
    }

    @f
    private static final float getOrElse(float[] fArr, int i10, Function1<? super Integer, Float> defaultValue) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        return (i10 < 0 || i10 >= fArr.length) ? defaultValue.invoke(Integer.valueOf(i10)).floatValue() : fArr[i10];
    }

    @Nullable
    public static final Float getOrNull(@NotNull float[] fArr, int i10) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        if (i10 < 0 || i10 >= fArr.length) {
            return null;
        }
        return Float.valueOf(fArr[i10]);
    }

    @f
    private static final boolean isEmpty(float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        return fArr.length == 0;
    }

    @f
    private static final boolean isNotEmpty(float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        return !(fArr.length == 0);
    }

    @NotNull
    public static final String joinToString(@NotNull float[] fArr, @NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence postfix, int i10, @NotNull CharSequence truncated, @Nullable Function1<? super Float, ? extends CharSequence> function1) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(truncated, "truncated");
        String string = ((StringBuilder) joinTo(fArr, new StringBuilder(), separator, prefix, postfix, i10, truncated, function1)).toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public static /* synthetic */ String joinToString$default(float[] fArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, Function1 function1, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            charSequence = ", ";
        }
        if ((i11 & 2) != 0) {
            charSequence2 = "";
        }
        if ((i11 & 4) != 0) {
            charSequence3 = "";
        }
        if ((i11 & 8) != 0) {
            i10 = -1;
        }
        if ((i11 & 16) != 0) {
            charSequence4 = "...";
        }
        if ((i11 & 32) != 0) {
            function1 = null;
        }
        CharSequence charSequence5 = charSequence4;
        Function1 function2 = function1;
        return joinToString(fArr, charSequence, charSequence2, charSequence3, i10, charSequence5, (Function1<? super Float, ? extends CharSequence>) function2);
    }

    @Nullable
    public static Float lastOrNull(@NotNull float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        if (fArr.length == 0) {
            return null;
        }
        return Float.valueOf(fArr[fArr.length - 1]);
    }

    @u0
    @e1(version = "1.4")
    @f
    private static final <R> R maxOfWithOrNull(byte[] bArr, Comparator<? super R> comparator, Function1<? super Byte, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (bArr.length == 0) {
            return null;
        }
        R rInvoke = selector.invoke(Byte.valueOf(bArr[0]));
        int lastIndex = getLastIndex(bArr);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                R rInvoke2 = selector.invoke(Byte.valueOf(bArr[i10]));
                if (comparator.compare(rInvoke, rInvoke2) < 0) {
                    rInvoke = rInvoke2;
                }
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return rInvoke;
    }

    @e1(version = "1.4")
    @Nullable
    public static final Byte maxWithOrNull(@NotNull byte[] bArr, @NotNull Comparator<? super Byte> comparator) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (bArr.length == 0) {
            return null;
        }
        byte b10 = bArr[0];
        int lastIndex = getLastIndex(bArr);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                byte b11 = bArr[i10];
                if (comparator.compare(Byte.valueOf(b10), Byte.valueOf(b11)) < 0) {
                    b10 = b11;
                }
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return Byte.valueOf(b10);
    }

    @u0
    @e1(version = "1.4")
    @f
    private static final <R> R minOfWithOrNull(byte[] bArr, Comparator<? super R> comparator, Function1<? super Byte, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (bArr.length == 0) {
            return null;
        }
        R rInvoke = selector.invoke(Byte.valueOf(bArr[0]));
        int lastIndex = getLastIndex(bArr);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                R rInvoke2 = selector.invoke(Byte.valueOf(bArr[i10]));
                if (comparator.compare(rInvoke, rInvoke2) > 0) {
                    rInvoke = rInvoke2;
                }
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return rInvoke;
    }

    @e1(version = "1.4")
    @Nullable
    public static final Byte minWithOrNull(@NotNull byte[] bArr, @NotNull Comparator<? super Byte> comparator) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (bArr.length == 0) {
            return null;
        }
        byte b10 = bArr[0];
        int lastIndex = getLastIndex(bArr);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                byte b11 = bArr[i10];
                if (comparator.compare(Byte.valueOf(b10), Byte.valueOf(b11)) > 0) {
                    b10 = b11;
                }
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return Byte.valueOf(b10);
    }

    public static final boolean none(@NotNull float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        return fArr.length == 0;
    }

    @e1(version = "1.4")
    @f
    private static final float[] onEach(float[] fArr, Function1<? super Float, Unit> action) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        for (float f10 : fArr) {
            action.invoke(Float.valueOf(f10));
        }
        return fArr;
    }

    @e1(version = "1.4")
    @f
    private static final float[] onEachIndexed(float[] fArr, Function2<? super Integer, ? super Float, Unit> action) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        int length = fArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            action.invoke(Integer.valueOf(i11), Float.valueOf(fArr[i10]));
            i10++;
            i11++;
        }
        return fArr;
    }

    @e1(version = "1.3")
    @f
    private static final float random(float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        return random(fArr, (kotlin.random.f) kotlin.random.f.f312895a);
    }

    @e1(version = "1.4")
    @f
    private static final Float randomOrNull(float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        return randomOrNull(fArr, (kotlin.random.f) kotlin.random.f.f312895a);
    }

    public static final byte reduce(@NotNull byte[] bArr, @NotNull Function2<? super Byte, ? super Byte, Byte> operation) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (bArr.length == 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        int i10 = 4 << 0;
        byte bByteValue = bArr[0];
        int lastIndex = getLastIndex(bArr);
        int i11 = 1;
        if (1 <= lastIndex) {
            while (true) {
                bByteValue = operation.invoke(Byte.valueOf(bByteValue), Byte.valueOf(bArr[i11])).byteValue();
                if (i11 == lastIndex) {
                    break;
                }
                i11++;
            }
        }
        return bByteValue;
    }

    public static final byte reduceIndexed(@NotNull byte[] bArr, @NotNull n<? super Integer, ? super Byte, ? super Byte, Byte> operation) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (bArr.length == 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        byte bByteValue = bArr[0];
        int lastIndex = getLastIndex(bArr);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                bByteValue = operation.invoke(Integer.valueOf(i10), Byte.valueOf(bByteValue), Byte.valueOf(bArr[i10])).byteValue();
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return bByteValue;
    }

    public static void reverse(@NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        int length = (bArr.length / 2) - 1;
        if (length < 0) {
            return;
        }
        int lastIndex = getLastIndex(bArr);
        if (length < 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            byte b10 = bArr[i10];
            bArr[i10] = bArr[lastIndex];
            bArr[lastIndex] = b10;
            lastIndex--;
            if (i10 == length) {
                return;
            } else {
                i10++;
            }
        }
    }

    @e1(version = "1.4")
    @f
    private static final <R> List<R> runningFold(byte[] bArr, R r10, Function2<? super R, ? super Byte, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (bArr.length == 0) {
            return CollectionsKt__CollectionsJVMKt.listOf(r10);
        }
        ArrayList arrayList = new ArrayList(bArr.length + 1);
        arrayList.add(r10);
        for (byte b10 : bArr) {
            r10 = operation.invoke(r10, Byte.valueOf(b10));
            arrayList.add(r10);
        }
        return arrayList;
    }

    @e1(version = "1.4")
    @f
    private static final <R> List<R> runningFoldIndexed(byte[] bArr, R r10, n<? super Integer, ? super R, ? super Byte, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (bArr.length == 0) {
            return CollectionsKt__CollectionsJVMKt.listOf(r10);
        }
        ArrayList arrayList = new ArrayList(bArr.length + 1);
        arrayList.add(r10);
        int length = bArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            r10 = operation.invoke(Integer.valueOf(i10), r10, Byte.valueOf(bArr[i10]));
            arrayList.add(r10);
        }
        return arrayList;
    }

    @e1(version = "1.4")
    @f
    private static final <R> List<R> scan(double[] dArr, R r10, Function2<? super R, ? super Double, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (dArr.length == 0) {
            return CollectionsKt__CollectionsJVMKt.listOf(r10);
        }
        ArrayList arrayList = new ArrayList(dArr.length + 1);
        arrayList.add(r10);
        for (double d10 : dArr) {
            r10 = operation.invoke(r10, Double.valueOf(d10));
            arrayList.add(r10);
        }
        return arrayList;
    }

    @e1(version = "1.4")
    @f
    private static final <R> List<R> scanIndexed(double[] dArr, R r10, n<? super Integer, ? super R, ? super Double, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (dArr.length == 0) {
            return CollectionsKt__CollectionsJVMKt.listOf(r10);
        }
        ArrayList arrayList = new ArrayList(dArr.length + 1);
        arrayList.add(r10);
        int length = dArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            r10 = operation.invoke(Integer.valueOf(i10), r10, Double.valueOf(dArr[i10]));
            arrayList.add(r10);
        }
        return arrayList;
    }

    @e1(version = "1.4")
    public static final void shuffle(@NotNull float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        shuffle(fArr, (kotlin.random.f) kotlin.random.f.f312895a);
    }

    @Nullable
    public static final Float singleOrNull(@NotNull float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        if (fArr.length == 1) {
            return Float.valueOf(fArr[0]);
        }
        return null;
    }

    @NotNull
    public static final List<Float> sorted(@NotNull float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Float[] typedArray = ArraysKt___ArraysJvmKt.toTypedArray(fArr);
        ArraysKt___ArraysJvmKt.sort((Object[]) typedArray);
        return ArraysKt___ArraysJvmKt.asList(typedArray);
    }

    @NotNull
    public static final <R extends Comparable<? super R>> List<Float> sortedBy(@NotNull float[] fArr, @NotNull Function1<? super Float, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        return sortedWith(fArr, (Comparator<? super Float>) new g.a(selector));
    }

    @NotNull
    public static final <R extends Comparable<? super R>> List<Float> sortedByDescending(@NotNull float[] fArr, @NotNull Function1<? super Float, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        return sortedWith(fArr, (Comparator<? super Float>) new g.c(selector));
    }

    @NotNull
    public static final List<Float> sortedDescending(@NotNull float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        float[] fArrCopyOf = Arrays.copyOf(fArr, fArr.length);
        Intrinsics.checkNotNullExpressionValue(fArrCopyOf, "copyOf(...)");
        ArraysKt___ArraysJvmKt.sort(fArrCopyOf);
        return reversed(fArrCopyOf);
    }

    @NotNull
    public static final List<Float> sortedWith(@NotNull float[] fArr, @NotNull Comparator<? super Float> comparator) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Float[] typedArray = ArraysKt___ArraysJvmKt.toTypedArray(fArr);
        ArraysKt___ArraysJvmKt.sortWith(typedArray, comparator);
        return ArraysKt___ArraysJvmKt.asList(typedArray);
    }

    public static final double sum(@NotNull double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        double d10 = 0.0d;
        for (double d11 : dArr) {
            d10 += d11;
        }
        return d10;
    }

    @NotNull
    public static final HashSet<Float> toHashSet(@NotNull float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        return (HashSet) toCollection(fArr, new HashSet(MapsKt__MapsJVMKt.mapCapacity(fArr.length)));
    }

    @NotNull
    public static List<Integer> toMutableList(@NotNull int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i10 : iArr) {
            arrayList.add(Integer.valueOf(i10));
        }
        return arrayList;
    }

    @NotNull
    public static final Set<Float> toMutableSet(@NotNull float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        return (Set) toCollection(fArr, new LinkedHashSet(MapsKt__MapsJVMKt.mapCapacity(fArr.length)));
    }

    @NotNull
    public static final Iterable<IndexedValue<Float>> withIndex(@NotNull float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        return new IndexingIterable(new AnonymousClass6(fArr));
    }

    public static final boolean all(@NotNull double[] dArr, @NotNull Function1<? super Double, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (double d10 : dArr) {
            if (!predicate.invoke(Double.valueOf(d10)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static final boolean any(@NotNull double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        return !(dArr.length == 0);
    }

    @NotNull
    public static Iterable<Integer> asIterable(@NotNull int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        return iArr.length == 0 ? CollectionsKt__CollectionsKt.emptyList() : new ArraysKt___ArraysKt$asIterable$$inlined$Iterable$4(iArr);
    }

    @NotNull
    public static final Sequence<Integer> asSequence(@NotNull final int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        return iArr.length == 0 ? o.g() : new Sequence<Integer>() { // from class: kotlin.collections.ArraysKt___ArraysKt$asSequence$$inlined$Sequence$4
            @Override // kotlin.sequences.Sequence
            public Iterator<Integer> iterator() {
                return j.f(iArr);
            }
        };
    }

    @NotNull
    public static final <K, M extends Map<? super K, ? super Integer>> M associateByTo(@NotNull int[] iArr, @NotNull M destination, @NotNull Function1<? super Integer, ? extends K> keySelector) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        for (int i10 : iArr) {
            destination.put(keySelector.invoke(Integer.valueOf(i10)), Integer.valueOf(i10));
        }
        return destination;
    }

    @NotNull
    public static final <K, V, M extends Map<? super K, ? super V>> M associateTo(@NotNull int[] iArr, @NotNull M destination, @NotNull Function1<? super Integer, ? extends Pair<? extends K, ? extends V>> transform) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        for (int i10 : iArr) {
            Pair<? extends K, ? extends V> pairInvoke = transform.invoke(Integer.valueOf(i10));
            destination.put(pairInvoke.getFirst(), pairInvoke.getSecond());
        }
        return destination;
    }

    @e1(version = "1.4")
    @f
    private static final <V, M extends Map<? super Integer, ? super V>> M associateWithTo(int[] iArr, M destination, Function1<? super Integer, ? extends V> valueSelector) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(valueSelector, "valueSelector");
        for (int i10 : iArr) {
            destination.put(Integer.valueOf(i10), valueSelector.invoke(Integer.valueOf(i10)));
        }
        return destination;
    }

    @f
    private static final double component1(double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        return dArr[0];
    }

    @f
    private static final double component2(double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        return dArr[1];
    }

    @f
    private static final double component3(double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        return dArr[2];
    }

    @f
    private static final double component4(double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        return dArr[3];
    }

    @f
    private static final double component5(double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        return dArr[4];
    }

    public static boolean contains(@NotNull char[] cArr, char c10) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        return indexOf(cArr, c10) >= 0;
    }

    @f
    private static final int count(double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        return dArr.length;
    }

    @NotNull
    public static final List<Double> distinct(@NotNull double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        return CollectionsKt___CollectionsKt.toList(toMutableSet(dArr));
    }

    @NotNull
    public static final <K> List<Byte> distinctBy(@NotNull byte[] bArr, @NotNull Function1<? super Byte, ? extends K> selector) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (byte b10 : bArr) {
            if (hashSet.add(selector.invoke(Byte.valueOf(b10)))) {
                arrayList.add(Byte.valueOf(b10));
            }
        }
        return arrayList;
    }

    @NotNull
    public static final List<Integer> drop(@NotNull int[] iArr, int i10) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        if (i10 >= 0) {
            return takeLast(iArr, r.u(iArr.length - i10, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
    }

    @NotNull
    public static final List<Integer> dropLast(@NotNull int[] iArr, int i10) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        if (i10 >= 0) {
            return take(iArr, r.u(iArr.length - i10, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
    }

    @f
    private static final double elementAtOrElse(double[] dArr, int i10, Function1<? super Integer, Double> defaultValue) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        return (i10 < 0 || i10 >= dArr.length) ? defaultValue.invoke(Integer.valueOf(i10)).doubleValue() : dArr[i10];
    }

    @f
    private static final Double elementAtOrNull(double[] dArr, int i10) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        return getOrNull(dArr, i10);
    }

    @NotNull
    public static final List<Integer> filter(@NotNull int[] iArr, @NotNull Function1<? super Integer, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (int i10 : iArr) {
            if (predicate.invoke(Integer.valueOf(i10)).booleanValue()) {
                arrayList.add(Integer.valueOf(i10));
            }
        }
        return arrayList;
    }

    @NotNull
    public static final List<Short> filterIndexed(@NotNull short[] sArr, @NotNull Function2<? super Integer, ? super Short, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int length = sArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            short s10 = sArr[i10];
            int i12 = i11 + 1;
            if (predicate.invoke(Integer.valueOf(i11), Short.valueOf(s10)).booleanValue()) {
                arrayList.add(Short.valueOf(s10));
            }
            i10++;
            i11 = i12;
        }
        return arrayList;
    }

    @NotNull
    public static final <C extends Collection<? super Integer>> C filterIndexedTo(@NotNull int[] iArr, @NotNull C destination, @NotNull Function2<? super Integer, ? super Integer, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = iArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            int i12 = iArr[i10];
            int i13 = i11 + 1;
            if (predicate.invoke(Integer.valueOf(i11), Integer.valueOf(i12)).booleanValue()) {
                destination.add(Integer.valueOf(i12));
            }
            i10++;
            i11 = i13;
        }
        return destination;
    }

    @NotNull
    public static final List<Integer> filterNot(@NotNull int[] iArr, @NotNull Function1<? super Integer, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (int i10 : iArr) {
            if (!predicate.invoke(Integer.valueOf(i10)).booleanValue()) {
                arrayList.add(Integer.valueOf(i10));
            }
        }
        return arrayList;
    }

    @NotNull
    public static final <C extends Collection<? super Double>> C filterNotTo(@NotNull double[] dArr, @NotNull C destination, @NotNull Function1<? super Double, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (double d10 : dArr) {
            if (!predicate.invoke(Double.valueOf(d10)).booleanValue()) {
                destination.add(Double.valueOf(d10));
            }
        }
        return destination;
    }

    @NotNull
    public static final <C extends Collection<? super Double>> C filterTo(@NotNull double[] dArr, @NotNull C destination, @NotNull Function1<? super Double, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (double d10 : dArr) {
            if (predicate.invoke(Double.valueOf(d10)).booleanValue()) {
                destination.add(Double.valueOf(d10));
            }
        }
        return destination;
    }

    @f
    private static final Double find(double[] dArr, Function1<? super Double, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (double d10 : dArr) {
            if (predicate.invoke(Double.valueOf(d10)).booleanValue()) {
                return Double.valueOf(d10);
            }
        }
        return null;
    }

    @f
    private static final Short findLast(short[] sArr, Function1<? super Short, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = sArr.length - 1;
        if (length < 0) {
            return null;
        }
        while (true) {
            int i10 = length - 1;
            short s10 = sArr[length];
            if (predicate.invoke(Short.valueOf(s10)).booleanValue()) {
                return Short.valueOf(s10);
            }
            if (i10 < 0) {
                return null;
            }
            length = i10;
        }
    }

    public static short first(@NotNull short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        if (sArr.length != 0) {
            return sArr[0];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @Nullable
    public static final Double firstOrNull(@NotNull double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        if (dArr.length == 0) {
            return null;
        }
        return Double.valueOf(dArr[0]);
    }

    @u0
    @e1(version = "1.4")
    @f
    @oj.i(name = "flatMapIndexedIterable")
    private static final <R> List<R> flatMapIndexedIterable(double[] dArr, Function2<? super Integer, ? super Double, ? extends Iterable<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList();
        int length = dArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            CollectionsKt__MutableCollectionsKt.addAll(arrayList, transform.invoke(Integer.valueOf(i11), Double.valueOf(dArr[i10])));
            i10++;
            i11++;
        }
        return arrayList;
    }

    @u0
    @e1(version = "1.4")
    @f
    @oj.i(name = "flatMapIndexedIterableTo")
    private static final <R, C extends Collection<? super R>> C flatMapIndexedIterableTo(short[] sArr, C destination, Function2<? super Integer, ? super Short, ? extends Iterable<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int length = sArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            CollectionsKt__MutableCollectionsKt.addAll(destination, transform.invoke(Integer.valueOf(i11), Short.valueOf(sArr[i10])));
            i10++;
            i11++;
        }
        return destination;
    }

    @NotNull
    public static final <R, C extends Collection<? super R>> C flatMapTo(@NotNull short[] sArr, @NotNull C destination, @NotNull Function1<? super Short, ? extends Iterable<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        for (short s10 : sArr) {
            CollectionsKt__MutableCollectionsKt.addAll(destination, transform.invoke(Short.valueOf(s10)));
        }
        return destination;
    }

    public static final <R> R fold(@NotNull double[] dArr, R r10, @NotNull Function2<? super R, ? super Double, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        for (double d10 : dArr) {
            r10 = operation.invoke(r10, Double.valueOf(d10));
        }
        return r10;
    }

    public static final <R> R foldIndexed(@NotNull double[] dArr, R r10, @NotNull n<? super Integer, ? super R, ? super Double, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int length = dArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            r10 = operation.invoke(Integer.valueOf(i11), r10, Double.valueOf(dArr[i10]));
            i10++;
            i11++;
        }
        return r10;
    }

    public static final <R> R foldRight(@NotNull int[] iArr, R r10, @NotNull Function2<? super Integer, ? super R, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        for (int lastIndex = getLastIndex(iArr); lastIndex >= 0; lastIndex--) {
            r10 = operation.invoke(Integer.valueOf(iArr[lastIndex]), r10);
        }
        return r10;
    }

    public static final <R> R foldRightIndexed(@NotNull int[] iArr, R r10, @NotNull n<? super Integer, ? super Integer, ? super R, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        for (int lastIndex = getLastIndex(iArr); lastIndex >= 0; lastIndex--) {
            r10 = operation.invoke(Integer.valueOf(lastIndex), Integer.valueOf(iArr[lastIndex]), r10);
        }
        return r10;
    }

    public static final void forEach(@NotNull double[] dArr, @NotNull Function1<? super Double, Unit> action) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        for (double d10 : dArr) {
            action.invoke(Double.valueOf(d10));
        }
    }

    public static final void forEachIndexed(@NotNull double[] dArr, @NotNull Function2<? super Integer, ? super Double, Unit> action) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        int length = dArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            action.invoke(Integer.valueOf(i11), Double.valueOf(dArr[i10]));
            i10++;
            i11++;
        }
    }

    @NotNull
    public static final IntRange getIndices(@NotNull double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        return new IntRange(0, getLastIndex(dArr));
    }

    public static final int getLastIndex(@NotNull double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        return dArr.length - 1;
    }

    @f
    private static final double getOrElse(double[] dArr, int i10, Function1<? super Integer, Double> defaultValue) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        return (i10 < 0 || i10 >= dArr.length) ? defaultValue.invoke(Integer.valueOf(i10)).doubleValue() : dArr[i10];
    }

    @Nullable
    public static final Double getOrNull(@NotNull double[] dArr, int i10) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        if (i10 < 0 || i10 >= dArr.length) {
            return null;
        }
        return Double.valueOf(dArr[i10]);
    }

    public static int indexOf(@NotNull short[] sArr, short s10) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        int length = sArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (s10 == sArr[i10]) {
                return i10;
            }
        }
        return -1;
    }

    public static final int indexOfFirst(@NotNull int[] iArr, @NotNull Function1<? super Integer, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = iArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (predicate.invoke(Integer.valueOf(iArr[i10])).booleanValue()) {
                return i10;
            }
        }
        return -1;
    }

    public static final int indexOfLast(@NotNull int[] iArr, @NotNull Function1<? super Integer, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = iArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i10 = length - 1;
                if (predicate.invoke(Integer.valueOf(iArr[length])).booleanValue()) {
                    return length;
                }
                if (i10 >= 0) {
                    length = i10;
                }
            }
        }
        return -1;
    }

    @NotNull
    public static final Set<Integer> intersect(@NotNull int[] iArr, @NotNull Iterable<Integer> other) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Set<Integer> mutableSet = toMutableSet(iArr);
        CollectionsKt__MutableCollectionsKt.retainAll(mutableSet, other);
        return mutableSet;
    }

    @f
    private static final boolean isEmpty(double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        return dArr.length == 0;
    }

    @f
    private static final boolean isNotEmpty(double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        return !(dArr.length == 0);
    }

    @NotNull
    public static final <A extends Appendable> A joinTo(@NotNull byte[] bArr, @NotNull A buffer, @NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence postfix, int i10, @NotNull CharSequence truncated, @Nullable Function1<? super Byte, ? extends CharSequence> function1) throws IOException {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(truncated, "truncated");
        buffer.append(prefix);
        int i11 = 0;
        for (byte b10 : bArr) {
            i11++;
            if (i11 > 1) {
                buffer.append(separator);
            }
            if (i10 >= 0 && i11 > i10) {
                break;
            }
            if (function1 != null) {
                buffer.append(function1.invoke(Byte.valueOf(b10)));
            } else {
                buffer.append(String.valueOf((int) b10));
            }
        }
        if (i10 >= 0 && i11 > i10) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    @NotNull
    public static final String joinToString(@NotNull double[] dArr, @NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence postfix, int i10, @NotNull CharSequence truncated, @Nullable Function1<? super Double, ? extends CharSequence> function1) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(truncated, "truncated");
        String string = ((StringBuilder) joinTo(dArr, new StringBuilder(), separator, prefix, postfix, i10, truncated, function1)).toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public static /* synthetic */ String joinToString$default(double[] dArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, Function1 function1, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            charSequence = ", ";
        }
        if ((i11 & 2) != 0) {
            charSequence2 = "";
        }
        if ((i11 & 4) != 0) {
            charSequence3 = "";
        }
        if ((i11 & 8) != 0) {
            i10 = -1;
        }
        if ((i11 & 16) != 0) {
            charSequence4 = "...";
        }
        if ((i11 & 32) != 0) {
            function1 = null;
        }
        CharSequence charSequence5 = charSequence4;
        Function1 function2 = function1;
        return joinToString(dArr, charSequence, charSequence2, charSequence3, i10, charSequence5, (Function1<? super Double, ? extends CharSequence>) function2);
    }

    public static short last(@NotNull short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        if (sArr.length != 0) {
            return sArr[getLastIndex(sArr)];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static int lastIndexOf(@NotNull short[] sArr, short s10) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        int length = sArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i10 = length - 1;
                if (s10 == sArr[length]) {
                    return length;
                }
                if (i10 >= 0) {
                    length = i10;
                }
            }
        }
        return -1;
    }

    @Nullable
    public static final Double lastOrNull(@NotNull double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        if (dArr.length == 0) {
            return null;
        }
        return Double.valueOf(dArr[dArr.length - 1]);
    }

    @NotNull
    public static final <R> List<R> map(@NotNull short[] sArr, @NotNull Function1<? super Short, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList(sArr.length);
        for (short s10 : sArr) {
            arrayList.add(transform.invoke(Short.valueOf(s10)));
        }
        return arrayList;
    }

    @NotNull
    public static final <R> List<R> mapIndexed(@NotNull short[] sArr, @NotNull Function2<? super Integer, ? super Short, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList(sArr.length);
        int length = sArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            arrayList.add(transform.invoke(Integer.valueOf(i11), Short.valueOf(sArr[i10])));
            i10++;
            i11++;
        }
        return arrayList;
    }

    @NotNull
    public static final <R, C extends Collection<? super R>> C mapIndexedTo(@NotNull int[] iArr, @NotNull C destination, @NotNull Function2<? super Integer, ? super Integer, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int length = iArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            destination.add(transform.invoke(Integer.valueOf(i11), Integer.valueOf(iArr[i10])));
            i10++;
            i11++;
        }
        return destination;
    }

    @NotNull
    public static final <R, C extends Collection<? super R>> C mapTo(@NotNull int[] iArr, @NotNull C destination, @NotNull Function1<? super Integer, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        for (int i10 : iArr) {
            destination.add(transform.invoke(Integer.valueOf(i10)));
        }
        return destination;
    }

    @u0
    @e1(version = "1.4")
    @f
    private static final double maxOf(byte[] bArr, Function1<? super Byte, Double> selector) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (bArr.length == 0) {
            throw new NoSuchElementException();
        }
        double dDoubleValue = selector.invoke(Byte.valueOf(bArr[0])).doubleValue();
        int lastIndex = getLastIndex(bArr);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                dDoubleValue = Math.max(dDoubleValue, selector.invoke(Byte.valueOf(bArr[i10])).doubleValue());
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return dDoubleValue;
    }

    @u0
    @e1(version = "1.4")
    @f
    /* JADX INFO: renamed from: maxOfOrNull, reason: collision with other method in class */
    private static final Double m805maxOfOrNull(byte[] bArr, Function1<? super Byte, Double> selector) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (bArr.length == 0) {
            return null;
        }
        double dDoubleValue = selector.invoke(Byte.valueOf(bArr[0])).doubleValue();
        int lastIndex = getLastIndex(bArr);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                dDoubleValue = Math.max(dDoubleValue, selector.invoke(Byte.valueOf(bArr[i10])).doubleValue());
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return Double.valueOf(dDoubleValue);
    }

    @u0
    @e1(version = "1.4")
    @f
    private static final <R> R maxOfWith(byte[] bArr, Comparator<? super R> comparator, Function1<? super Byte, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (bArr.length != 0) {
            R rInvoke = selector.invoke(Byte.valueOf(bArr[0]));
            int lastIndex = getLastIndex(bArr);
            int i10 = 1;
            if (1 <= lastIndex) {
                while (true) {
                    R rInvoke2 = selector.invoke(Byte.valueOf(bArr[i10]));
                    if (comparator.compare(rInvoke, rInvoke2) < 0) {
                        rInvoke = rInvoke2;
                    }
                    if (i10 == lastIndex) {
                        break;
                    }
                    i10++;
                }
            }
            return rInvoke;
        }
        throw new NoSuchElementException();
    }

    @e1(version = "1.4")
    @Nullable
    public static final Float maxOrNull(@NotNull Float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        if (fArr.length == 0) {
            return null;
        }
        float fFloatValue = fArr[0].floatValue();
        int lastIndex = getLastIndex(fArr);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                fFloatValue = Math.max(fFloatValue, fArr[i10].floatValue());
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return Float.valueOf(fFloatValue);
    }

    @e1(version = "1.7")
    @oj.i(name = "maxOrThrow")
    public static final float maxOrThrow(@NotNull Float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        if (fArr.length != 0) {
            float fFloatValue = fArr[0].floatValue();
            int lastIndex = getLastIndex(fArr);
            int i10 = 1;
            if (1 <= lastIndex) {
                while (true) {
                    fFloatValue = Math.max(fFloatValue, fArr[i10].floatValue());
                    if (i10 == lastIndex) {
                        break;
                    }
                    i10++;
                }
            }
            return fFloatValue;
        }
        throw new NoSuchElementException();
    }

    @e1(version = "1.7")
    @oj.i(name = "maxWithOrThrow")
    public static final byte maxWithOrThrow(@NotNull byte[] bArr, @NotNull Comparator<? super Byte> comparator) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (bArr.length == 0) {
            throw new NoSuchElementException();
        }
        byte b10 = bArr[0];
        int lastIndex = getLastIndex(bArr);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                byte b11 = bArr[i10];
                if (comparator.compare(Byte.valueOf(b10), Byte.valueOf(b11)) < 0) {
                    b10 = b11;
                }
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return b10;
    }

    @u0
    @e1(version = "1.4")
    @f
    private static final double minOf(byte[] bArr, Function1<? super Byte, Double> selector) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (bArr.length != 0) {
            double dDoubleValue = selector.invoke(Byte.valueOf(bArr[0])).doubleValue();
            int lastIndex = getLastIndex(bArr);
            int i10 = 1;
            int i11 = 5 << 1;
            if (1 <= lastIndex) {
                while (true) {
                    dDoubleValue = Math.min(dDoubleValue, selector.invoke(Byte.valueOf(bArr[i10])).doubleValue());
                    if (i10 == lastIndex) {
                        break;
                    }
                    i10++;
                }
            }
            return dDoubleValue;
        }
        throw new NoSuchElementException();
    }

    @u0
    @e1(version = "1.4")
    @f
    /* JADX INFO: renamed from: minOfOrNull, reason: collision with other method in class */
    private static final Double m841minOfOrNull(byte[] bArr, Function1<? super Byte, Double> selector) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (bArr.length == 0) {
            return null;
        }
        double dDoubleValue = selector.invoke(Byte.valueOf(bArr[0])).doubleValue();
        int lastIndex = getLastIndex(bArr);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                dDoubleValue = Math.min(dDoubleValue, selector.invoke(Byte.valueOf(bArr[i10])).doubleValue());
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return Double.valueOf(dDoubleValue);
    }

    @u0
    @e1(version = "1.4")
    @f
    private static final <R> R minOfWith(byte[] bArr, Comparator<? super R> comparator, Function1<? super Byte, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (bArr.length != 0) {
            int i10 = 1 << 0;
            R rInvoke = selector.invoke(Byte.valueOf(bArr[0]));
            int lastIndex = getLastIndex(bArr);
            int i11 = 1;
            if (1 <= lastIndex) {
                while (true) {
                    R rInvoke2 = selector.invoke(Byte.valueOf(bArr[i11]));
                    if (comparator.compare(rInvoke, rInvoke2) > 0) {
                        rInvoke = rInvoke2;
                    }
                    if (i11 == lastIndex) {
                        break;
                    }
                    i11++;
                }
            }
            return rInvoke;
        }
        throw new NoSuchElementException();
    }

    @e1(version = "1.4")
    @Nullable
    public static final Float minOrNull(@NotNull Float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        if (fArr.length == 0) {
            int i10 = 4 & 0;
            return null;
        }
        float fFloatValue = fArr[0].floatValue();
        int lastIndex = getLastIndex(fArr);
        int i11 = 1;
        if (1 <= lastIndex) {
            while (true) {
                fFloatValue = Math.min(fFloatValue, fArr[i11].floatValue());
                if (i11 == lastIndex) {
                    break;
                }
                i11++;
            }
        }
        return Float.valueOf(fFloatValue);
    }

    @e1(version = "1.7")
    @oj.i(name = "minOrThrow")
    public static final float minOrThrow(@NotNull Float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        if (fArr.length == 0) {
            throw new NoSuchElementException();
        }
        float fFloatValue = fArr[0].floatValue();
        int lastIndex = getLastIndex(fArr);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                fFloatValue = Math.min(fFloatValue, fArr[i10].floatValue());
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return fFloatValue;
    }

    @e1(version = "1.7")
    @oj.i(name = "minWithOrThrow")
    public static final byte minWithOrThrow(@NotNull byte[] bArr, @NotNull Comparator<? super Byte> comparator) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (bArr.length != 0) {
            byte b10 = bArr[0];
            int lastIndex = getLastIndex(bArr);
            int i10 = 1;
            if (1 <= lastIndex) {
                while (true) {
                    byte b11 = bArr[i10];
                    if (comparator.compare(Byte.valueOf(b10), Byte.valueOf(b11)) > 0) {
                        b10 = b11;
                    }
                    if (i10 == lastIndex) {
                        break;
                    }
                    i10++;
                }
            }
            return b10;
        }
        throw new NoSuchElementException();
    }

    public static final boolean none(@NotNull double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        return dArr.length == 0;
    }

    @e1(version = "1.4")
    @f
    private static final double[] onEach(double[] dArr, Function1<? super Double, Unit> action) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        for (double d10 : dArr) {
            action.invoke(Double.valueOf(d10));
        }
        return dArr;
    }

    @e1(version = "1.4")
    @f
    private static final double[] onEachIndexed(double[] dArr, Function2<? super Integer, ? super Double, Unit> action) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        int length = dArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            action.invoke(Integer.valueOf(i11), Double.valueOf(dArr[i10]));
            i10++;
            i11++;
        }
        return dArr;
    }

    @e1(version = "1.3")
    @f
    private static final double random(double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        return random(dArr, kotlin.random.f.f312895a);
    }

    @e1(version = "1.4")
    @f
    private static final Double randomOrNull(double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        return randomOrNull(dArr, kotlin.random.f.f312895a);
    }

    @NotNull
    public static final List<Short> reversed(@NotNull short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        if (sArr.length == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        List<Short> mutableList = toMutableList(sArr);
        CollectionsKt___CollectionsJvmKt.reverse(mutableList);
        return mutableList;
    }

    @e1(version = "1.4")
    @f
    private static final List<Byte> runningReduce(byte[] bArr, Function2<? super Byte, ? super Byte, Byte> operation) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (bArr.length == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        byte bByteValue = bArr[0];
        ArrayList arrayList = new ArrayList(bArr.length);
        arrayList.add(Byte.valueOf(bByteValue));
        int length = bArr.length;
        for (int i10 = 1; i10 < length; i10++) {
            bByteValue = operation.invoke(Byte.valueOf(bByteValue), Byte.valueOf(bArr[i10])).byteValue();
            arrayList.add(Byte.valueOf(bByteValue));
        }
        return arrayList;
    }

    @e1(version = "1.4")
    @f
    private static final List<Byte> runningReduceIndexed(byte[] bArr, n<? super Integer, ? super Byte, ? super Byte, Byte> operation) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (bArr.length == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        byte bByteValue = bArr[0];
        ArrayList arrayList = new ArrayList(bArr.length);
        arrayList.add(Byte.valueOf(bByteValue));
        int length = bArr.length;
        for (int i10 = 1; i10 < length; i10++) {
            bByteValue = operation.invoke(Integer.valueOf(i10), Byte.valueOf(bByteValue), Byte.valueOf(bArr[i10])).byteValue();
            arrayList.add(Byte.valueOf(bByteValue));
        }
        return arrayList;
    }

    @e1(version = "1.4")
    @f
    private static final <R> List<R> scan(boolean[] zArr, R r10, Function2<? super R, ? super Boolean, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (zArr.length == 0) {
            return CollectionsKt__CollectionsJVMKt.listOf(r10);
        }
        ArrayList arrayList = new ArrayList(zArr.length + 1);
        arrayList.add(r10);
        for (boolean z10 : zArr) {
            r10 = operation.invoke(r10, Boolean.valueOf(z10));
            arrayList.add(r10);
        }
        return arrayList;
    }

    @e1(version = "1.4")
    @f
    private static final <R> List<R> scanIndexed(boolean[] zArr, R r10, n<? super Integer, ? super R, ? super Boolean, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (zArr.length == 0) {
            return CollectionsKt__CollectionsJVMKt.listOf(r10);
        }
        ArrayList arrayList = new ArrayList(zArr.length + 1);
        arrayList.add(r10);
        int length = zArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            r10 = operation.invoke(Integer.valueOf(i10), r10, Boolean.valueOf(zArr[i10]));
            arrayList.add(r10);
        }
        return arrayList;
    }

    @e1(version = "1.4")
    public static final void shuffle(@NotNull double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        shuffle(dArr, kotlin.random.f.f312895a);
    }

    @Nullable
    public static final Double singleOrNull(@NotNull double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        if (dArr.length == 1) {
            return Double.valueOf(dArr[0]);
        }
        return null;
    }

    @NotNull
    public static final List<Integer> slice(@NotNull int[] iArr, @NotNull IntRange indices) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(indices, "indices");
        return indices.isEmpty() ? CollectionsKt__CollectionsKt.emptyList() : ArraysKt___ArraysJvmKt.asList(ArraysKt___ArraysJvmKt.copyOfRange(iArr, indices.u().intValue(), indices.i().intValue() + 1));
    }

    @NotNull
    public static short[] sliceArray(@NotNull short[] sArr, @NotNull Collection<Integer> indices) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(indices, "indices");
        short[] sArr2 = new short[indices.size()];
        Iterator<Integer> it = indices.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            sArr2[i10] = sArr[it.next().intValue()];
            i10++;
        }
        return sArr2;
    }

    @NotNull
    public static final List<Double> sorted(@NotNull double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Double[] typedArray = ArraysKt___ArraysJvmKt.toTypedArray(dArr);
        ArraysKt___ArraysJvmKt.sort((Object[]) typedArray);
        return ArraysKt___ArraysJvmKt.asList(typedArray);
    }

    @NotNull
    public static final int[] sortedArray(@NotNull int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        if (iArr.length == 0) {
            return iArr;
        }
        int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
        Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "copyOf(...)");
        ArraysKt___ArraysJvmKt.sort(iArrCopyOf);
        return iArrCopyOf;
    }

    @NotNull
    public static final int[] sortedArrayDescending(@NotNull int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        if (iArr.length == 0) {
            return iArr;
        }
        int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
        Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "copyOf(...)");
        sortDescending(iArrCopyOf);
        return iArrCopyOf;
    }

    @NotNull
    public static final <R extends Comparable<? super R>> List<Double> sortedBy(@NotNull double[] dArr, @NotNull Function1<? super Double, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        return sortedWith(dArr, new g.a(selector));
    }

    @NotNull
    public static final <R extends Comparable<? super R>> List<Double> sortedByDescending(@NotNull double[] dArr, @NotNull Function1<? super Double, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        return sortedWith(dArr, new g.c(selector));
    }

    @NotNull
    public static final List<Double> sortedDescending(@NotNull double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        double[] dArrCopyOf = Arrays.copyOf(dArr, dArr.length);
        Intrinsics.checkNotNullExpressionValue(dArrCopyOf, "copyOf(...)");
        ArraysKt___ArraysJvmKt.sort(dArrCopyOf);
        return reversed(dArrCopyOf);
    }

    @NotNull
    public static final List<Double> sortedWith(@NotNull double[] dArr, @NotNull Comparator<? super Double> comparator) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Double[] typedArray = ArraysKt___ArraysJvmKt.toTypedArray(dArr);
        ArraysKt___ArraysJvmKt.sortWith(typedArray, comparator);
        return ArraysKt___ArraysJvmKt.asList(typedArray);
    }

    @NotNull
    public static final Set<Integer> subtract(@NotNull int[] iArr, @NotNull Iterable<Integer> other) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Set<Integer> mutableSet = toMutableSet(iArr);
        CollectionsKt__MutableCollectionsKt.removeAll(mutableSet, other);
        return mutableSet;
    }

    @l(message = "Use sumOf instead.", replaceWith = @b1(expression = "this.sumOf(selector)", imports = {}))
    @m(warningSince = "1.5")
    public static final int sumBy(@NotNull int[] iArr, @NotNull Function1<? super Integer, Integer> selector) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        int iIntValue = 0;
        for (int i10 : iArr) {
            iIntValue += selector.invoke(Integer.valueOf(i10)).intValue();
        }
        return iIntValue;
    }

    @l(message = "Use sumOf instead.", replaceWith = @b1(expression = "this.sumOf(selector)", imports = {}))
    @m(warningSince = "1.5")
    public static final double sumByDouble(@NotNull int[] iArr, @NotNull Function1<? super Integer, Double> selector) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        double dDoubleValue = 0.0d;
        int i10 = 3 ^ 0;
        for (int i11 : iArr) {
            dDoubleValue += selector.invoke(Integer.valueOf(i11)).doubleValue();
        }
        return dDoubleValue;
    }

    @u0
    @e1(version = "1.4")
    @f
    @oj.i(name = "sumOfDouble")
    private static final double sumOfDouble(int[] iArr, Function1<? super Integer, Double> selector) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        double dDoubleValue = 0.0d;
        for (int i10 : iArr) {
            dDoubleValue += selector.invoke(Integer.valueOf(i10)).doubleValue();
        }
        return dDoubleValue;
    }

    @u0
    @e1(version = "1.4")
    @f
    @oj.i(name = "sumOfInt")
    private static final int sumOfInt(int[] iArr, Function1<? super Integer, Integer> selector) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        int iIntValue = 0;
        for (int i10 : iArr) {
            iIntValue += selector.invoke(Integer.valueOf(i10)).intValue();
        }
        return iIntValue;
    }

    @u0
    @e1(version = "1.4")
    @f
    @oj.i(name = "sumOfLong")
    private static final long sumOfLong(int[] iArr, Function1<? super Integer, Long> selector) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        long jLongValue = 0;
        boolean z10 = false & false;
        for (int i10 : iArr) {
            jLongValue += selector.invoke(Integer.valueOf(i10)).longValue();
        }
        return jLongValue;
    }

    @u0
    @m2(markerClass = {u.class})
    @e1(version = "1.5")
    @f
    @oj.i(name = "sumOfUInt")
    private static final int sumOfUInt(short[] sArr, Function1<? super Short, u1> selector) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        int iN = u1.n(0);
        for (short s10 : sArr) {
            iN = u1.n(iN + selector.invoke(Short.valueOf(s10)).z0());
        }
        return iN;
    }

    @u0
    @m2(markerClass = {u.class})
    @e1(version = "1.5")
    @f
    @oj.i(name = "sumOfULong")
    private static final long sumOfULong(short[] sArr, Function1<? super Short, y1> selector) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        long jN = y1.n(0L);
        for (short s10 : sArr) {
            jN = y1.n(jN + selector.invoke(Short.valueOf(s10)).z0());
        }
        return jN;
    }

    @NotNull
    public static final <C extends Collection<? super Integer>> C toCollection(@NotNull int[] iArr, @NotNull C destination) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        for (int i10 : iArr) {
            destination.add(Integer.valueOf(i10));
        }
        return destination;
    }

    @NotNull
    public static final HashSet<Double> toHashSet(@NotNull double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        return (HashSet) toCollection(dArr, new HashSet(MapsKt__MapsJVMKt.mapCapacity(dArr.length)));
    }

    @NotNull
    public static final Set<Double> toMutableSet(@NotNull double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        return (Set) toCollection(dArr, new LinkedHashSet(MapsKt__MapsJVMKt.mapCapacity(dArr.length)));
    }

    @NotNull
    public static final Set<Integer> union(@NotNull int[] iArr, @NotNull Iterable<Integer> other) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Set<Integer> mutableSet = toMutableSet(iArr);
        CollectionsKt__MutableCollectionsKt.addAll(mutableSet, other);
        return mutableSet;
    }

    @NotNull
    public static final Iterable<IndexedValue<Double>> withIndex(@NotNull double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        return new IndexingIterable(new AnonymousClass7(dArr));
    }

    @NotNull
    public static final <R, V> List<V> zip(@NotNull short[] sArr, @NotNull R[] other, @NotNull Function2<? super Short, ? super R, ? extends V> transform) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int iMin = Math.min(sArr.length, other.length);
        ArrayList arrayList = new ArrayList(iMin);
        int i10 = 4 & 0;
        for (int i11 = 0; i11 < iMin; i11++) {
            arrayList.add(transform.invoke(Short.valueOf(sArr[i11]), other[i11]));
        }
        return arrayList;
    }

    public static final boolean all(@NotNull boolean[] zArr, @NotNull Function1<? super Boolean, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (boolean z10 : zArr) {
            if (!predicate.invoke(Boolean.valueOf(z10)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static final boolean any(@NotNull boolean[] zArr) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        return !(zArr.length == 0);
    }

    @e1(version = "1.4")
    @f
    private static final <V> Map<Integer, V> associateWith(int[] iArr, Function1<? super Integer, ? extends V> valueSelector) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(valueSelector, "valueSelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(r.u(MapsKt__MapsJVMKt.mapCapacity(iArr.length), 16));
        for (int i10 : iArr) {
            linkedHashMap.put(Integer.valueOf(i10), valueSelector.invoke(Integer.valueOf(i10)));
        }
        return linkedHashMap;
    }

    @f
    private static final boolean component1(boolean[] zArr) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        return zArr[0];
    }

    @f
    private static final boolean component2(boolean[] zArr) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        return zArr[1];
    }

    @f
    private static final boolean component3(boolean[] zArr) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        return zArr[2];
    }

    @f
    private static final boolean component4(boolean[] zArr) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        return zArr[3];
    }

    @f
    private static final boolean component5(boolean[] zArr) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        return zArr[4];
    }

    @l(message = "The function has unclear behavior when searching for NaN or zero values and will be removed soon. Use 'any { it == element }' instead to continue using this behavior, or '.asList().contains(element: T)' to get the same search behavior as in a list.", replaceWith = @b1(expression = "any { it == element }", imports = {}))
    @m(errorSince = "1.6", hiddenSince = "1.7", warningSince = "1.4")
    public static final /* synthetic */ boolean contains(float[] fArr, float f10) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        for (float f11 : fArr) {
            if (f11 == f10) {
                return true;
            }
        }
        return false;
    }

    @f
    private static final int count(boolean[] zArr) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        return zArr.length;
    }

    @NotNull
    public static final List<Boolean> distinct(@NotNull boolean[] zArr) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        return CollectionsKt___CollectionsKt.toList(toMutableSet(zArr));
    }

    @f
    private static final boolean elementAtOrElse(boolean[] zArr, int i10, Function1<? super Integer, Boolean> defaultValue) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        return (i10 < 0 || i10 >= zArr.length) ? defaultValue.invoke(Integer.valueOf(i10)).booleanValue() : zArr[i10];
    }

    @f
    private static final Boolean elementAtOrNull(boolean[] zArr, int i10) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        return getOrNull(zArr, i10);
    }

    @NotNull
    public static final <C extends Collection<? super Boolean>> C filterNotTo(@NotNull boolean[] zArr, @NotNull C destination, @NotNull Function1<? super Boolean, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (boolean z10 : zArr) {
            if (!predicate.invoke(Boolean.valueOf(z10)).booleanValue()) {
                destination.add(Boolean.valueOf(z10));
            }
        }
        return destination;
    }

    @NotNull
    public static final <C extends Collection<? super Boolean>> C filterTo(@NotNull boolean[] zArr, @NotNull C destination, @NotNull Function1<? super Boolean, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (boolean z10 : zArr) {
            if (predicate.invoke(Boolean.valueOf(z10)).booleanValue()) {
                destination.add(Boolean.valueOf(z10));
            }
        }
        return destination;
    }

    @f
    private static final Boolean find(boolean[] zArr, Function1<? super Boolean, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (boolean z10 : zArr) {
            if (predicate.invoke(Boolean.valueOf(z10)).booleanValue()) {
                return Boolean.valueOf(z10);
            }
        }
        return null;
    }

    @Nullable
    public static final Boolean firstOrNull(@NotNull boolean[] zArr) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        if (zArr.length == 0) {
            return null;
        }
        return Boolean.valueOf(zArr[0]);
    }

    @u0
    @e1(version = "1.4")
    @f
    @oj.i(name = "flatMapIndexedIterable")
    private static final <R> List<R> flatMapIndexedIterable(boolean[] zArr, Function2<? super Integer, ? super Boolean, ? extends Iterable<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList();
        int length = zArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            CollectionsKt__MutableCollectionsKt.addAll(arrayList, transform.invoke(Integer.valueOf(i11), Boolean.valueOf(zArr[i10])));
            i10++;
            i11++;
        }
        return arrayList;
    }

    public static final <R> R fold(@NotNull boolean[] zArr, R r10, @NotNull Function2<? super R, ? super Boolean, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        for (boolean z10 : zArr) {
            r10 = operation.invoke(r10, Boolean.valueOf(z10));
        }
        return r10;
    }

    public static final <R> R foldIndexed(@NotNull boolean[] zArr, R r10, @NotNull n<? super Integer, ? super R, ? super Boolean, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int length = zArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            r10 = operation.invoke(Integer.valueOf(i11), r10, Boolean.valueOf(zArr[i10]));
            i10++;
            i11++;
        }
        return r10;
    }

    public static final void forEach(@NotNull boolean[] zArr, @NotNull Function1<? super Boolean, Unit> action) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        for (boolean z10 : zArr) {
            action.invoke(Boolean.valueOf(z10));
        }
    }

    public static final void forEachIndexed(@NotNull boolean[] zArr, @NotNull Function2<? super Integer, ? super Boolean, Unit> action) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        int length = zArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            action.invoke(Integer.valueOf(i11), Boolean.valueOf(zArr[i10]));
            i10++;
            i11++;
        }
    }

    @NotNull
    public static final IntRange getIndices(@NotNull boolean[] zArr) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        return new IntRange(0, getLastIndex(zArr));
    }

    public static final int getLastIndex(@NotNull boolean[] zArr) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        return zArr.length - 1;
    }

    @f
    private static final boolean getOrElse(boolean[] zArr, int i10, Function1<? super Integer, Boolean> defaultValue) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        return (i10 < 0 || i10 >= zArr.length) ? defaultValue.invoke(Integer.valueOf(i10)).booleanValue() : zArr[i10];
    }

    @Nullable
    public static final Boolean getOrNull(@NotNull boolean[] zArr, int i10) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        if (i10 < 0 || i10 >= zArr.length) {
            return null;
        }
        return Boolean.valueOf(zArr[i10]);
    }

    @NotNull
    public static final <K, M extends Map<? super K, List<Byte>>> M groupByTo(@NotNull byte[] bArr, @NotNull M destination, @NotNull Function1<? super Byte, ? extends K> keySelector) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        for (byte b10 : bArr) {
            K kInvoke = keySelector.invoke(Byte.valueOf(b10));
            Object arrayList = destination.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                destination.put(kInvoke, arrayList);
            }
            ((List) arrayList).add(Byte.valueOf(b10));
        }
        return destination;
    }

    @f
    private static final boolean isEmpty(boolean[] zArr) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        return zArr.length == 0;
    }

    @f
    private static final boolean isNotEmpty(boolean[] zArr) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        return !(zArr.length == 0);
    }

    @NotNull
    public static final String joinToString(@NotNull boolean[] zArr, @NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence postfix, int i10, @NotNull CharSequence truncated, @Nullable Function1<? super Boolean, ? extends CharSequence> function1) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(truncated, "truncated");
        String string = ((StringBuilder) joinTo(zArr, new StringBuilder(), separator, prefix, postfix, i10, truncated, function1)).toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public static /* synthetic */ String joinToString$default(boolean[] zArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, Function1 function1, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            charSequence = ", ";
        }
        if ((i11 & 2) != 0) {
            charSequence2 = "";
        }
        if ((i11 & 4) != 0) {
            charSequence3 = "";
        }
        if ((i11 & 8) != 0) {
            i10 = -1;
        }
        if ((i11 & 16) != 0) {
            charSequence4 = "...";
        }
        if ((i11 & 32) != 0) {
            function1 = null;
        }
        CharSequence charSequence5 = charSequence4;
        Function1 function2 = function1;
        return joinToString(zArr, charSequence, charSequence2, charSequence3, i10, charSequence5, (Function1<? super Boolean, ? extends CharSequence>) function2);
    }

    @Nullable
    public static final Boolean lastOrNull(@NotNull boolean[] zArr) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        if (zArr.length != 0) {
            return Boolean.valueOf(zArr[zArr.length - 1]);
        }
        int i10 = 7 >> 0;
        return null;
    }

    @e1(version = "1.4")
    @Nullable
    public static final <R extends Comparable<? super R>> Byte maxByOrNull(@NotNull byte[] bArr, @NotNull Function1<? super Byte, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (bArr.length == 0) {
            return null;
        }
        byte b10 = bArr[0];
        int lastIndex = getLastIndex(bArr);
        if (lastIndex == 0) {
            return Byte.valueOf(b10);
        }
        R rInvoke = selector.invoke(Byte.valueOf(b10));
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                byte b11 = bArr[i10];
                R rInvoke2 = selector.invoke(Byte.valueOf(b11));
                if (rInvoke.compareTo(rInvoke2) < 0) {
                    b10 = b11;
                    rInvoke = rInvoke2;
                }
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return Byte.valueOf(b10);
    }

    @e1(version = "1.4")
    @Nullable
    public static final <R extends Comparable<? super R>> Byte minByOrNull(@NotNull byte[] bArr, @NotNull Function1<? super Byte, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (bArr.length == 0) {
            return null;
        }
        byte b10 = bArr[0];
        int lastIndex = getLastIndex(bArr);
        if (lastIndex == 0) {
            return Byte.valueOf(b10);
        }
        R rInvoke = selector.invoke(Byte.valueOf(b10));
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                byte b11 = bArr[i10];
                R rInvoke2 = selector.invoke(Byte.valueOf(b11));
                if (rInvoke.compareTo(rInvoke2) > 0) {
                    b10 = b11;
                    rInvoke = rInvoke2;
                }
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return Byte.valueOf(b10);
    }

    public static final boolean none(@NotNull boolean[] zArr) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        return zArr.length == 0;
    }

    @e1(version = "1.4")
    @f
    private static final boolean[] onEach(boolean[] zArr, Function1<? super Boolean, Unit> action) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        for (boolean z10 : zArr) {
            action.invoke(Boolean.valueOf(z10));
        }
        return zArr;
    }

    @e1(version = "1.4")
    @f
    private static final boolean[] onEachIndexed(boolean[] zArr, Function2<? super Integer, ? super Boolean, Unit> action) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        int length = zArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            action.invoke(Integer.valueOf(i11), Boolean.valueOf(zArr[i10]));
            i10++;
            i11++;
        }
        return zArr;
    }

    @NotNull
    public static final Pair<List<Byte>, List<Byte>> partition(@NotNull byte[] bArr, @NotNull Function1<? super Byte, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (byte b10 : bArr) {
            if (predicate.invoke(Byte.valueOf(b10)).booleanValue()) {
                arrayList.add(Byte.valueOf(b10));
            } else {
                arrayList2.add(Byte.valueOf(b10));
            }
        }
        return new Pair<>(arrayList, arrayList2);
    }

    @e1(version = "1.3")
    @f
    private static final boolean random(boolean[] zArr) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        return random(zArr, kotlin.random.f.f312895a);
    }

    @e1(version = "1.4")
    @f
    private static final Boolean randomOrNull(boolean[] zArr) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        return randomOrNull(zArr, kotlin.random.f.f312895a);
    }

    @e1(version = "1.4")
    @Nullable
    public static final Short reduceRightIndexedOrNull(@NotNull short[] sArr, @NotNull n<? super Integer, ? super Short, ? super Short, Short> operation) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int lastIndex = getLastIndex(sArr);
        if (lastIndex < 0) {
            return null;
        }
        short sShortValue = sArr[lastIndex];
        for (int i10 = lastIndex - 1; i10 >= 0; i10--) {
            sShortValue = operation.invoke(Integer.valueOf(i10), Short.valueOf(sArr[i10]), Short.valueOf(sShortValue)).shortValue();
        }
        return Short.valueOf(sShortValue);
    }

    @e1(version = "1.4")
    @Nullable
    public static final Short reduceRightOrNull(@NotNull short[] sArr, @NotNull Function2<? super Short, ? super Short, Short> operation) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int lastIndex = getLastIndex(sArr);
        if (lastIndex < 0) {
            return null;
        }
        short sShortValue = sArr[lastIndex];
        for (int i10 = lastIndex - 1; i10 >= 0; i10--) {
            sShortValue = operation.invoke(Short.valueOf(sArr[i10]), Short.valueOf(sShortValue)).shortValue();
        }
        return Short.valueOf(sShortValue);
    }

    @e1(version = "1.4")
    @f
    private static final <R> List<R> scan(char[] cArr, R r10, Function2<? super R, ? super Character, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (cArr.length == 0) {
            return CollectionsKt__CollectionsJVMKt.listOf(r10);
        }
        ArrayList arrayList = new ArrayList(cArr.length + 1);
        arrayList.add(r10);
        for (char c10 : cArr) {
            r10 = operation.invoke(r10, Character.valueOf(c10));
            arrayList.add(r10);
        }
        return arrayList;
    }

    @e1(version = "1.4")
    @f
    private static final <R> List<R> scanIndexed(char[] cArr, R r10, n<? super Integer, ? super R, ? super Character, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (cArr.length == 0) {
            return CollectionsKt__CollectionsJVMKt.listOf(r10);
        }
        ArrayList arrayList = new ArrayList(cArr.length + 1);
        arrayList.add(r10);
        int length = cArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            r10 = operation.invoke(Integer.valueOf(i10), r10, Character.valueOf(cArr[i10]));
            arrayList.add(r10);
        }
        return arrayList;
    }

    @e1(version = "1.4")
    public static final void shuffle(@NotNull boolean[] zArr) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        shuffle(zArr, kotlin.random.f.f312895a);
    }

    @Nullable
    public static final Boolean singleOrNull(@NotNull boolean[] zArr) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        if (zArr.length == 1) {
            return Boolean.valueOf(zArr[0]);
        }
        return null;
    }

    public static final void sortDescending(@NotNull int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        if (iArr.length > 1) {
            ArraysKt___ArraysJvmKt.sort(iArr);
            reverse(iArr);
        }
    }

    @NotNull
    public static final List<Character> sorted(@NotNull char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Character[] typedArray = ArraysKt___ArraysJvmKt.toTypedArray(cArr);
        ArraysKt___ArraysJvmKt.sort((Object[]) typedArray);
        return ArraysKt___ArraysJvmKt.asList(typedArray);
    }

    @NotNull
    public static final <R extends Comparable<? super R>> List<Boolean> sortedBy(@NotNull boolean[] zArr, @NotNull Function1<? super Boolean, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        return sortedWith(zArr, new g.a(selector));
    }

    @NotNull
    public static final <R extends Comparable<? super R>> List<Boolean> sortedByDescending(@NotNull boolean[] zArr, @NotNull Function1<? super Boolean, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        return sortedWith(zArr, new g.c(selector));
    }

    @NotNull
    public static final List<Character> sortedDescending(@NotNull char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        char[] cArrCopyOf = Arrays.copyOf(cArr, cArr.length);
        Intrinsics.checkNotNullExpressionValue(cArrCopyOf, "copyOf(...)");
        ArraysKt___ArraysJvmKt.sort(cArrCopyOf);
        return reversed(cArrCopyOf);
    }

    @NotNull
    public static final List<Boolean> sortedWith(@NotNull boolean[] zArr, @NotNull Comparator<? super Boolean> comparator) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Boolean[] typedArray = ArraysKt___ArraysJvmKt.toTypedArray(zArr);
        ArraysKt___ArraysJvmKt.sortWith(typedArray, comparator);
        return ArraysKt___ArraysJvmKt.asList(typedArray);
    }

    @NotNull
    public static final List<Byte> take(@NotNull byte[] bArr, int i10) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
        }
        if (i10 == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        if (i10 >= bArr.length) {
            return toList(bArr);
        }
        if (i10 == 1) {
            return CollectionsKt__CollectionsJVMKt.listOf(Byte.valueOf(bArr[0]));
        }
        ArrayList arrayList = new ArrayList(i10);
        int i11 = 0;
        for (byte b10 : bArr) {
            arrayList.add(Byte.valueOf(b10));
            i11++;
            if (i11 == i10) {
                break;
            }
        }
        return arrayList;
    }

    @NotNull
    public static final List<Byte> takeLast(@NotNull byte[] bArr, int i10) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
        }
        if (i10 == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        int length = bArr.length;
        if (i10 >= length) {
            return toList(bArr);
        }
        if (i10 == 1) {
            return CollectionsKt__CollectionsJVMKt.listOf(Byte.valueOf(bArr[length - 1]));
        }
        ArrayList arrayList = new ArrayList(i10);
        for (int i11 = length - i10; i11 < length; i11++) {
            arrayList.add(Byte.valueOf(bArr[i11]));
        }
        return arrayList;
    }

    @NotNull
    public static final HashSet<Boolean> toHashSet(@NotNull boolean[] zArr) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        return (HashSet) toCollection(zArr, new HashSet(MapsKt__MapsJVMKt.mapCapacity(zArr.length)));
    }

    @NotNull
    public static List<Long> toMutableList(@NotNull long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        ArrayList arrayList = new ArrayList(jArr.length);
        for (long j10 : jArr) {
            arrayList.add(Long.valueOf(j10));
        }
        return arrayList;
    }

    @NotNull
    public static final Set<Boolean> toMutableSet(@NotNull boolean[] zArr) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        return (Set) toCollection(zArr, new LinkedHashSet(MapsKt__MapsJVMKt.mapCapacity(zArr.length)));
    }

    @NotNull
    public static final Iterable<IndexedValue<Boolean>> withIndex(@NotNull boolean[] zArr) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        return new IndexingIterable(new AnonymousClass8(zArr));
    }

    public static final boolean all(@NotNull char[] cArr, @NotNull Function1<? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (char c10 : cArr) {
            if (!predicate.invoke(Character.valueOf(c10)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static final boolean any(@NotNull char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        return !(cArr.length == 0);
    }

    @NotNull
    public static Iterable<Long> asIterable(@NotNull long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        return jArr.length == 0 ? CollectionsKt__CollectionsKt.emptyList() : new ArraysKt___ArraysKt$asIterable$$inlined$Iterable$5(jArr);
    }

    @NotNull
    public static final Sequence<Long> asSequence(@NotNull final long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        return jArr.length == 0 ? o.g() : new Sequence<Long>() { // from class: kotlin.collections.ArraysKt___ArraysKt$asSequence$$inlined$Sequence$5
            @Override // kotlin.sequences.Sequence
            public Iterator<Long> iterator() {
                return j.g(jArr);
            }
        };
    }

    @NotNull
    public static final <K, V> Map<K, V> associate(@NotNull short[] sArr, @NotNull Function1<? super Short, ? extends Pair<? extends K, ? extends V>> transform) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(r.u(MapsKt__MapsJVMKt.mapCapacity(sArr.length), 16));
        for (short s10 : sArr) {
            Pair<? extends K, ? extends V> pairInvoke = transform.invoke(Short.valueOf(s10));
            linkedHashMap.put(pairInvoke.getFirst(), pairInvoke.getSecond());
        }
        return linkedHashMap;
    }

    @NotNull
    public static final <K> Map<K, Short> associateBy(@NotNull short[] sArr, @NotNull Function1<? super Short, ? extends K> keySelector) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(r.u(MapsKt__MapsJVMKt.mapCapacity(sArr.length), 16));
        for (short s10 : sArr) {
            linkedHashMap.put(keySelector.invoke(Short.valueOf(s10)), Short.valueOf(s10));
        }
        return linkedHashMap;
    }

    @NotNull
    public static final <K, M extends Map<? super K, ? super Long>> M associateByTo(@NotNull long[] jArr, @NotNull M destination, @NotNull Function1<? super Long, ? extends K> keySelector) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        for (long j10 : jArr) {
            destination.put(keySelector.invoke(Long.valueOf(j10)), Long.valueOf(j10));
        }
        return destination;
    }

    @NotNull
    public static final <K, V, M extends Map<? super K, ? super V>> M associateTo(@NotNull long[] jArr, @NotNull M destination, @NotNull Function1<? super Long, ? extends Pair<? extends K, ? extends V>> transform) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        for (long j10 : jArr) {
            Pair<? extends K, ? extends V> pairInvoke = transform.invoke(Long.valueOf(j10));
            destination.put(pairInvoke.getFirst(), pairInvoke.getSecond());
        }
        return destination;
    }

    @e1(version = "1.4")
    @f
    private static final <V, M extends Map<? super Long, ? super V>> M associateWithTo(long[] jArr, M destination, Function1<? super Long, ? extends V> valueSelector) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(valueSelector, "valueSelector");
        for (long j10 : jArr) {
            destination.put(Long.valueOf(j10), valueSelector.invoke(Long.valueOf(j10)));
        }
        return destination;
    }

    @f
    private static final char component1(char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        return cArr[0];
    }

    @f
    private static final char component2(char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        return cArr[1];
    }

    @f
    private static final char component3(char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        return cArr[2];
    }

    @f
    private static final char component4(char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        return cArr[3];
    }

    @f
    private static final char component5(char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        return cArr[4];
    }

    @l(message = "The function has unclear behavior when searching for NaN or zero values and will be removed soon. Use 'any { it == element }' instead to continue using this behavior, or '.asList().contains(element: T)' to get the same search behavior as in a list.", replaceWith = @b1(expression = "any { it == element }", imports = {}))
    @m(errorSince = "1.6", hiddenSince = "1.7", warningSince = "1.4")
    public static final /* synthetic */ boolean contains(double[] dArr, double d10) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        for (double d11 : dArr) {
            if (d11 == d10) {
                return true;
            }
        }
        return false;
    }

    @f
    private static final int count(char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        return cArr.length;
    }

    @NotNull
    public static final List<Character> distinct(@NotNull char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        return CollectionsKt___CollectionsKt.toList(toMutableSet(cArr));
    }

    @NotNull
    public static final List<Long> drop(@NotNull long[] jArr, int i10) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        if (i10 >= 0) {
            return takeLast(jArr, r.u(jArr.length - i10, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
    }

    @NotNull
    public static final List<Long> dropLast(@NotNull long[] jArr, int i10) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        if (i10 >= 0) {
            return take(jArr, r.u(jArr.length - i10, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
    }

    @NotNull
    public static final List<Short> dropLastWhile(@NotNull short[] sArr, @NotNull Function1<? super Short, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (int lastIndex = getLastIndex(sArr); -1 < lastIndex; lastIndex--) {
            if (!predicate.invoke(Short.valueOf(sArr[lastIndex])).booleanValue()) {
                return take(sArr, lastIndex + 1);
            }
        }
        return CollectionsKt__CollectionsKt.emptyList();
    }

    @f
    private static final char elementAtOrElse(char[] cArr, int i10, Function1<? super Integer, Character> defaultValue) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        return (i10 < 0 || i10 >= cArr.length) ? defaultValue.invoke(Integer.valueOf(i10)).charValue() : cArr[i10];
    }

    @f
    private static final Character elementAtOrNull(char[] cArr, int i10) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        return getOrNull(cArr, i10);
    }

    @NotNull
    public static final List<Long> filter(@NotNull long[] jArr, @NotNull Function1<? super Long, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (long j10 : jArr) {
            if (predicate.invoke(Long.valueOf(j10)).booleanValue()) {
                arrayList.add(Long.valueOf(j10));
            }
        }
        return arrayList;
    }

    @NotNull
    public static final <C extends Collection<? super Long>> C filterIndexedTo(@NotNull long[] jArr, @NotNull C destination, @NotNull Function2<? super Integer, ? super Long, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = jArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            long j10 = jArr[i10];
            int i12 = i11 + 1;
            if (predicate.invoke(Integer.valueOf(i11), Long.valueOf(j10)).booleanValue()) {
                destination.add(Long.valueOf(j10));
            }
            i10++;
            i11 = i12;
        }
        return destination;
    }

    @NotNull
    public static final List<Long> filterNot(@NotNull long[] jArr, @NotNull Function1<? super Long, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (long j10 : jArr) {
            if (!predicate.invoke(Long.valueOf(j10)).booleanValue()) {
                arrayList.add(Long.valueOf(j10));
            }
        }
        return arrayList;
    }

    @NotNull
    public static final <C extends Collection<? super Character>> C filterNotTo(@NotNull char[] cArr, @NotNull C destination, @NotNull Function1<? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (char c10 : cArr) {
            if (!predicate.invoke(Character.valueOf(c10)).booleanValue()) {
                destination.add(Character.valueOf(c10));
            }
        }
        return destination;
    }

    @NotNull
    public static final <C extends Collection<? super Character>> C filterTo(@NotNull char[] cArr, @NotNull C destination, @NotNull Function1<? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (char c10 : cArr) {
            if (predicate.invoke(Character.valueOf(c10)).booleanValue()) {
                destination.add(Character.valueOf(c10));
            }
        }
        return destination;
    }

    @f
    private static final Character find(char[] cArr, Function1<? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (char c10 : cArr) {
            if (predicate.invoke(Character.valueOf(c10)).booleanValue()) {
                return Character.valueOf(c10);
            }
        }
        return null;
    }

    @Nullable
    public static final Character firstOrNull(@NotNull char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        if (cArr.length == 0) {
            return null;
        }
        return Character.valueOf(cArr[0]);
    }

    @NotNull
    public static final <R> List<R> flatMap(@NotNull short[] sArr, @NotNull Function1<? super Short, ? extends Iterable<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList();
        for (short s10 : sArr) {
            CollectionsKt__MutableCollectionsKt.addAll(arrayList, transform.invoke(Short.valueOf(s10)));
        }
        return arrayList;
    }

    @u0
    @e1(version = "1.4")
    @f
    @oj.i(name = "flatMapIndexedIterable")
    private static final <R> List<R> flatMapIndexedIterable(char[] cArr, Function2<? super Integer, ? super Character, ? extends Iterable<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList();
        int length = cArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            CollectionsKt__MutableCollectionsKt.addAll(arrayList, transform.invoke(Integer.valueOf(i11), Character.valueOf(cArr[i10])));
            i10++;
            i11++;
        }
        return arrayList;
    }

    public static final <R> R fold(@NotNull char[] cArr, R r10, @NotNull Function2<? super R, ? super Character, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        for (char c10 : cArr) {
            r10 = operation.invoke(r10, Character.valueOf(c10));
        }
        return r10;
    }

    public static final <R> R foldIndexed(@NotNull char[] cArr, R r10, @NotNull n<? super Integer, ? super R, ? super Character, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int length = cArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            r10 = operation.invoke(Integer.valueOf(i11), r10, Character.valueOf(cArr[i10]));
            i10++;
            i11++;
        }
        return r10;
    }

    public static final <R> R foldRight(@NotNull long[] jArr, R r10, @NotNull Function2<? super Long, ? super R, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        for (int lastIndex = getLastIndex(jArr); lastIndex >= 0; lastIndex--) {
            r10 = operation.invoke(Long.valueOf(jArr[lastIndex]), r10);
        }
        return r10;
    }

    public static final <R> R foldRightIndexed(@NotNull long[] jArr, R r10, @NotNull n<? super Integer, ? super Long, ? super R, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        for (int lastIndex = getLastIndex(jArr); lastIndex >= 0; lastIndex--) {
            r10 = operation.invoke(Integer.valueOf(lastIndex), Long.valueOf(jArr[lastIndex]), r10);
        }
        return r10;
    }

    public static final void forEach(@NotNull char[] cArr, @NotNull Function1<? super Character, Unit> action) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        for (char c10 : cArr) {
            action.invoke(Character.valueOf(c10));
        }
    }

    public static final void forEachIndexed(@NotNull char[] cArr, @NotNull Function2<? super Integer, ? super Character, Unit> action) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        int length = cArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            action.invoke(Integer.valueOf(i11), Character.valueOf(cArr[i10]));
            i10++;
            i11++;
        }
    }

    @NotNull
    public static final IntRange getIndices(@NotNull char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        return new IntRange(0, getLastIndex(cArr));
    }

    public static final int getLastIndex(@NotNull char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        return cArr.length - 1;
    }

    @f
    private static final char getOrElse(char[] cArr, int i10, Function1<? super Integer, Character> defaultValue) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        return (i10 < 0 || i10 >= cArr.length) ? defaultValue.invoke(Integer.valueOf(i10)).charValue() : cArr[i10];
    }

    @Nullable
    public static final Character getOrNull(@NotNull char[] cArr, int i10) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        if (i10 < 0 || i10 >= cArr.length) {
            return null;
        }
        return Character.valueOf(cArr[i10]);
    }

    @NotNull
    public static final <K> Map<K, List<Byte>> groupBy(@NotNull byte[] bArr, @NotNull Function1<? super Byte, ? extends K> keySelector) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (byte b10 : bArr) {
            K kInvoke = keySelector.invoke(Byte.valueOf(b10));
            Object arrayList = linkedHashMap.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(kInvoke, arrayList);
            }
            ((List) arrayList).add(Byte.valueOf(b10));
        }
        return linkedHashMap;
    }

    public static int indexOf(@NotNull int[] iArr, int i10) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        int length = iArr.length;
        for (int i11 = 0; i11 < length; i11++) {
            if (i10 == iArr[i11]) {
                return i11;
            }
        }
        return -1;
    }

    public static final int indexOfFirst(@NotNull long[] jArr, @NotNull Function1<? super Long, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = jArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (predicate.invoke(Long.valueOf(jArr[i10])).booleanValue()) {
                return i10;
            }
        }
        return -1;
    }

    public static final int indexOfLast(@NotNull long[] jArr, @NotNull Function1<? super Long, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = jArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i10 = length - 1;
                if (predicate.invoke(Long.valueOf(jArr[length])).booleanValue()) {
                    return length;
                }
                if (i10 >= 0) {
                    length = i10;
                }
            }
        }
        return -1;
    }

    @NotNull
    public static final Set<Long> intersect(@NotNull long[] jArr, @NotNull Iterable<Long> other) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Set<Long> mutableSet = toMutableSet(jArr);
        CollectionsKt__MutableCollectionsKt.retainAll(mutableSet, other);
        return mutableSet;
    }

    @f
    private static final boolean isEmpty(char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        return cArr.length == 0;
    }

    @f
    private static final boolean isNotEmpty(char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        return !(cArr.length == 0);
    }

    @NotNull
    public static final String joinToString(@NotNull char[] cArr, @NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence postfix, int i10, @NotNull CharSequence truncated, @Nullable Function1<? super Character, ? extends CharSequence> function1) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(truncated, "truncated");
        String string = ((StringBuilder) joinTo(cArr, new StringBuilder(), separator, prefix, postfix, i10, truncated, function1)).toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public static /* synthetic */ String joinToString$default(char[] cArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, Function1 function1, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            charSequence = ", ";
        }
        if ((i11 & 2) != 0) {
            charSequence2 = "";
        }
        if ((i11 & 4) != 0) {
            charSequence3 = "";
        }
        if ((i11 & 8) != 0) {
            i10 = -1;
        }
        if ((i11 & 16) != 0) {
            charSequence4 = "...";
        }
        if ((i11 & 32) != 0) {
            function1 = null;
        }
        CharSequence charSequence5 = charSequence4;
        Function1 function2 = function1;
        return joinToString(cArr, charSequence, charSequence2, charSequence3, i10, charSequence5, (Function1<? super Character, ? extends CharSequence>) function2);
    }

    public static int lastIndexOf(@NotNull int[] iArr, int i10) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        int length = iArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i11 = length - 1;
                if (i10 == iArr[length]) {
                    return length;
                }
                if (i11 >= 0) {
                    length = i11;
                }
            }
        }
        return -1;
    }

    @Nullable
    public static final Character lastOrNull(@NotNull char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        if (cArr.length == 0) {
            return null;
        }
        return Character.valueOf(cArr[cArr.length - 1]);
    }

    @NotNull
    public static final <R, C extends Collection<? super R>> C mapIndexedTo(@NotNull long[] jArr, @NotNull C destination, @NotNull Function2<? super Integer, ? super Long, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int length = jArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            destination.add(transform.invoke(Integer.valueOf(i11), Long.valueOf(jArr[i10])));
            i10++;
            i11++;
        }
        return destination;
    }

    @NotNull
    public static final <R, C extends Collection<? super R>> C mapTo(@NotNull long[] jArr, @NotNull C destination, @NotNull Function1<? super Long, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int i10 = 3 >> 0;
        for (long j10 : jArr) {
            destination.add(transform.invoke(Long.valueOf(j10)));
        }
        return destination;
    }

    @e1(version = "1.7")
    @oj.i(name = "maxByOrThrow")
    public static final <R extends Comparable<? super R>> byte maxByOrThrow(@NotNull byte[] bArr, @NotNull Function1<? super Byte, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (bArr.length != 0) {
            byte b10 = bArr[0];
            int lastIndex = getLastIndex(bArr);
            if (lastIndex != 0) {
                R rInvoke = selector.invoke(Byte.valueOf(b10));
                int i10 = 1;
                if (1 <= lastIndex) {
                    while (true) {
                        byte b11 = bArr[i10];
                        R rInvoke2 = selector.invoke(Byte.valueOf(b11));
                        if (rInvoke.compareTo(rInvoke2) < 0) {
                            b10 = b11;
                            rInvoke = rInvoke2;
                        }
                        if (i10 == lastIndex) {
                            break;
                        }
                        i10++;
                    }
                }
            }
            return b10;
        }
        throw new NoSuchElementException();
    }

    @e1(version = "1.7")
    @oj.i(name = "minByOrThrow")
    public static final <R extends Comparable<? super R>> byte minByOrThrow(@NotNull byte[] bArr, @NotNull Function1<? super Byte, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (bArr.length != 0) {
            byte b10 = bArr[0];
            int lastIndex = getLastIndex(bArr);
            if (lastIndex != 0) {
                R rInvoke = selector.invoke(Byte.valueOf(b10));
                int i10 = 1;
                if (1 <= lastIndex) {
                    while (true) {
                        byte b11 = bArr[i10];
                        R rInvoke2 = selector.invoke(Byte.valueOf(b11));
                        if (rInvoke.compareTo(rInvoke2) > 0) {
                            b10 = b11;
                            rInvoke = rInvoke2;
                        }
                        if (i10 == lastIndex) {
                            break;
                        }
                        i10++;
                    }
                }
            }
            return b10;
        }
        throw new NoSuchElementException();
    }

    public static final boolean none(@NotNull char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        return cArr.length == 0;
    }

    @e1(version = "1.4")
    @f
    private static final char[] onEach(char[] cArr, Function1<? super Character, Unit> action) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        int i10 = 7 << 0;
        for (char c10 : cArr) {
            action.invoke(Character.valueOf(c10));
        }
        return cArr;
    }

    @e1(version = "1.4")
    @f
    private static final char[] onEachIndexed(char[] cArr, Function2<? super Integer, ? super Character, Unit> action) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        int length = cArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            action.invoke(Integer.valueOf(i11), Character.valueOf(cArr[i10]));
            i10++;
            i11++;
        }
        return cArr;
    }

    @e1(version = "1.3")
    @f
    private static final char random(char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        return random(cArr, (kotlin.random.f) kotlin.random.f.f312895a);
    }

    @e1(version = "1.4")
    @f
    private static final Character randomOrNull(char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        return randomOrNull(cArr, (kotlin.random.f) kotlin.random.f.f312895a);
    }

    public static final short reduceRight(@NotNull short[] sArr, @NotNull Function2<? super Short, ? super Short, Short> operation) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int lastIndex = getLastIndex(sArr);
        if (lastIndex >= 0) {
            short sShortValue = sArr[lastIndex];
            for (int i10 = lastIndex - 1; i10 >= 0; i10--) {
                sShortValue = operation.invoke(Short.valueOf(sArr[i10]), Short.valueOf(sShortValue)).shortValue();
            }
            return sShortValue;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    public static final short reduceRightIndexed(@NotNull short[] sArr, @NotNull n<? super Integer, ? super Short, ? super Short, Short> operation) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int lastIndex = getLastIndex(sArr);
        if (lastIndex < 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        short sShortValue = sArr[lastIndex];
        for (int i10 = lastIndex - 1; i10 >= 0; i10--) {
            sShortValue = operation.invoke(Integer.valueOf(i10), Short.valueOf(sArr[i10]), Short.valueOf(sShortValue)).shortValue();
        }
        return sShortValue;
    }

    @NotNull
    public static short[] reversedArray(@NotNull short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        if (sArr.length == 0) {
            return sArr;
        }
        short[] sArr2 = new short[sArr.length];
        int lastIndex = getLastIndex(sArr);
        if (lastIndex >= 0) {
            int i10 = 0;
            while (true) {
                sArr2[lastIndex - i10] = sArr[i10];
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return sArr2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @e1(version = "1.4")
    @NotNull
    public static final <T, R> List<R> scan(@NotNull T[] tArr, R r10, @NotNull Function2<? super R, ? super T, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (tArr.length == 0) {
            return CollectionsKt__CollectionsJVMKt.listOf(r10);
        }
        ArrayList arrayList = new ArrayList(tArr.length + 1);
        arrayList.add(r10);
        for (b bVar : tArr) {
            r10 = operation.invoke(r10, bVar);
            arrayList.add(r10);
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @e1(version = "1.4")
    @NotNull
    public static final <T, R> List<R> scanIndexed(@NotNull T[] tArr, R r10, @NotNull n<? super Integer, ? super R, ? super T, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (tArr.length == 0) {
            return CollectionsKt__CollectionsJVMKt.listOf(r10);
        }
        ArrayList arrayList = new ArrayList(tArr.length + 1);
        arrayList.add(r10);
        int length = tArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            r10 = operation.invoke(Integer.valueOf(i10), r10, tArr[i10]);
            arrayList.add(r10);
        }
        return arrayList;
    }

    @e1(version = "1.4")
    public static final void shuffle(@NotNull char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        shuffle(cArr, (kotlin.random.f) kotlin.random.f.f312895a);
    }

    public static short single(@NotNull short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        int length = sArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        if (length == 1) {
            return sArr[0];
        }
        throw new IllegalArgumentException("Array has more than one element.");
    }

    @Nullable
    public static final Character singleOrNull(@NotNull char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        if (cArr.length == 1) {
            return Character.valueOf(cArr[0]);
        }
        return null;
    }

    @NotNull
    public static final List<Long> slice(@NotNull long[] jArr, @NotNull IntRange indices) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(indices, "indices");
        return indices.isEmpty() ? CollectionsKt__CollectionsKt.emptyList() : ArraysKt___ArraysJvmKt.asList(ArraysKt___ArraysJvmKt.copyOfRange(jArr, indices.u().intValue(), indices.i().intValue() + 1));
    }

    @NotNull
    public static final long[] sortedArray(@NotNull long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        if (jArr.length == 0) {
            return jArr;
        }
        long[] jArrCopyOf = Arrays.copyOf(jArr, jArr.length);
        Intrinsics.checkNotNullExpressionValue(jArrCopyOf, "copyOf(...)");
        ArraysKt___ArraysJvmKt.sort(jArrCopyOf);
        return jArrCopyOf;
    }

    @NotNull
    public static final long[] sortedArrayDescending(@NotNull long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        if (jArr.length == 0) {
            return jArr;
        }
        long[] jArrCopyOf = Arrays.copyOf(jArr, jArr.length);
        Intrinsics.checkNotNullExpressionValue(jArrCopyOf, "copyOf(...)");
        sortDescending(jArrCopyOf);
        return jArrCopyOf;
    }

    @NotNull
    public static final <R extends Comparable<? super R>> List<Character> sortedBy(@NotNull char[] cArr, @NotNull Function1<? super Character, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        return sortedWith(cArr, (Comparator<? super Character>) new g.a(selector));
    }

    @NotNull
    public static final <R extends Comparable<? super R>> List<Character> sortedByDescending(@NotNull char[] cArr, @NotNull Function1<? super Character, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        return sortedWith(cArr, (Comparator<? super Character>) new g.c(selector));
    }

    @NotNull
    public static final List<Character> sortedWith(@NotNull char[] cArr, @NotNull Comparator<? super Character> comparator) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Character[] typedArray = ArraysKt___ArraysJvmKt.toTypedArray(cArr);
        ArraysKt___ArraysJvmKt.sortWith(typedArray, comparator);
        return ArraysKt___ArraysJvmKt.asList(typedArray);
    }

    @NotNull
    public static final Set<Long> subtract(@NotNull long[] jArr, @NotNull Iterable<Long> other) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Set<Long> mutableSet = toMutableSet(jArr);
        CollectionsKt__MutableCollectionsKt.removeAll(mutableSet, other);
        return mutableSet;
    }

    @l(message = "Use sumOf instead.", replaceWith = @b1(expression = "this.sumOf(selector)", imports = {}))
    @m(warningSince = "1.5")
    public static final int sumBy(@NotNull long[] jArr, @NotNull Function1<? super Long, Integer> selector) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        int iIntValue = 0;
        for (long j10 : jArr) {
            iIntValue += selector.invoke(Long.valueOf(j10)).intValue();
        }
        return iIntValue;
    }

    @l(message = "Use sumOf instead.", replaceWith = @b1(expression = "this.sumOf(selector)", imports = {}))
    @m(warningSince = "1.5")
    public static final double sumByDouble(@NotNull long[] jArr, @NotNull Function1<? super Long, Double> selector) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        double dDoubleValue = 0.0d;
        for (long j10 : jArr) {
            dDoubleValue += selector.invoke(Long.valueOf(j10)).doubleValue();
        }
        return dDoubleValue;
    }

    @u0
    @e1(version = "1.4")
    @f
    @oj.i(name = "sumOfDouble")
    private static final double sumOfDouble(long[] jArr, Function1<? super Long, Double> selector) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        double dDoubleValue = 0.0d;
        for (long j10 : jArr) {
            dDoubleValue += selector.invoke(Long.valueOf(j10)).doubleValue();
        }
        return dDoubleValue;
    }

    @u0
    @e1(version = "1.4")
    @f
    @oj.i(name = "sumOfInt")
    private static final int sumOfInt(long[] jArr, Function1<? super Long, Integer> selector) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        int iIntValue = 0;
        for (long j10 : jArr) {
            iIntValue += selector.invoke(Long.valueOf(j10)).intValue();
        }
        return iIntValue;
    }

    @u0
    @e1(version = "1.4")
    @f
    @oj.i(name = "sumOfLong")
    private static final long sumOfLong(long[] jArr, Function1<? super Long, Long> selector) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        long jLongValue = 0;
        for (long j10 : jArr) {
            jLongValue += selector.invoke(Long.valueOf(j10)).longValue();
        }
        return jLongValue;
    }

    @NotNull
    public static final List<Short> takeLastWhile(@NotNull short[] sArr, @NotNull Function1<? super Short, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (int lastIndex = getLastIndex(sArr); -1 < lastIndex; lastIndex--) {
            if (!predicate.invoke(Short.valueOf(sArr[lastIndex])).booleanValue()) {
                return drop(sArr, lastIndex + 1);
            }
        }
        return toList(sArr);
    }

    @NotNull
    public static final List<Short> takeWhile(@NotNull short[] sArr, @NotNull Function1<? super Short, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (short s10 : sArr) {
            if (!predicate.invoke(Short.valueOf(s10)).booleanValue()) {
                break;
            }
            arrayList.add(Short.valueOf(s10));
        }
        return arrayList;
    }

    @NotNull
    public static final <C extends Collection<? super Long>> C toCollection(@NotNull long[] jArr, @NotNull C destination) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        for (long j10 : jArr) {
            destination.add(Long.valueOf(j10));
        }
        return destination;
    }

    @NotNull
    public static final HashSet<Character> toHashSet(@NotNull char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        return (HashSet) toCollection(cArr, new HashSet(MapsKt__MapsJVMKt.mapCapacity(r.B(cArr.length, 128))));
    }

    @NotNull
    public static final List<Short> toList(@NotNull short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        int length = sArr.length;
        if (length == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        if (length != 1) {
            return toMutableList(sArr);
        }
        return CollectionsKt__CollectionsJVMKt.listOf(Short.valueOf(sArr[0]));
    }

    @NotNull
    public static final Set<Character> toMutableSet(@NotNull char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        return (Set) toCollection(cArr, new LinkedHashSet(MapsKt__MapsJVMKt.mapCapacity(r.B(cArr.length, 128))));
    }

    @NotNull
    public static final Set<Short> toSet(@NotNull short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        int length = sArr.length;
        if (length == 0) {
            return SetsKt__SetsKt.emptySet();
        }
        if (length != 1) {
            return (Set) toCollection(sArr, new LinkedHashSet(MapsKt__MapsJVMKt.mapCapacity(sArr.length)));
        }
        return SetsKt__SetsJVMKt.setOf(Short.valueOf(sArr[0]));
    }

    @NotNull
    public static final Set<Long> union(@NotNull long[] jArr, @NotNull Iterable<Long> other) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Set<Long> mutableSet = toMutableSet(jArr);
        CollectionsKt__MutableCollectionsKt.addAll(mutableSet, other);
        return mutableSet;
    }

    @NotNull
    public static final Iterable<IndexedValue<Character>> withIndex(@NotNull char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        return new IndexingIterable(new AnonymousClass9(cArr));
    }

    public static final <T> boolean any(@NotNull T[] tArr, @NotNull Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (T t10 : tArr) {
            if (predicate.invoke(t10).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @e1(version = "1.4")
    @f
    private static final <V> Map<Long, V> associateWith(long[] jArr, Function1<? super Long, ? extends V> valueSelector) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(valueSelector, "valueSelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(r.u(MapsKt__MapsJVMKt.mapCapacity(jArr.length), 16));
        for (long j10 : jArr) {
            linkedHashMap.put(Long.valueOf(j10), valueSelector.invoke(Long.valueOf(j10)));
        }
        return linkedHashMap;
    }

    public static final <T> int count(@NotNull T[] tArr, @NotNull Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int i10 = 0;
        for (T t10 : tArr) {
            if (predicate.invoke(t10).booleanValue()) {
                i10++;
            }
        }
        return i10;
    }

    @NotNull
    public static final List<Integer> filterIndexed(@NotNull int[] iArr, @NotNull Function2<? super Integer, ? super Integer, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int length = iArr.length;
        int i10 = 0;
        int i11 = 2 << 0;
        int i12 = 0;
        while (i10 < length) {
            int i13 = iArr[i10];
            int i14 = i12 + 1;
            if (predicate.invoke(Integer.valueOf(i12), Integer.valueOf(i13)).booleanValue()) {
                arrayList.add(Integer.valueOf(i13));
            }
            i10++;
            i12 = i14;
        }
        return arrayList;
    }

    @f
    private static final Integer findLast(int[] iArr, Function1<? super Integer, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = iArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i10 = length - 1;
                int i11 = iArr[length];
                if (predicate.invoke(Integer.valueOf(i11)).booleanValue()) {
                    return Integer.valueOf(i11);
                }
                if (i10 >= 0) {
                    length = i10;
                }
            }
        }
        return null;
    }

    public static int first(@NotNull int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        if (iArr.length != 0) {
            return iArr[0];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @Nullable
    public static final <T> T firstOrNull(@NotNull T[] tArr, @NotNull Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (T t10 : tArr) {
            if (predicate.invoke(t10).booleanValue()) {
                return t10;
            }
        }
        return null;
    }

    @u0
    @e1(version = "1.4")
    @f
    @oj.i(name = "flatMapIndexedIterableTo")
    private static final <R, C extends Collection<? super R>> C flatMapIndexedIterableTo(int[] iArr, C destination, Function2<? super Integer, ? super Integer, ? extends Iterable<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int length = iArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            CollectionsKt__MutableCollectionsKt.addAll(destination, transform.invoke(Integer.valueOf(i11), Integer.valueOf(iArr[i10])));
            i10++;
            i11++;
        }
        return destination;
    }

    @NotNull
    public static final <R, C extends Collection<? super R>> C flatMapTo(@NotNull int[] iArr, @NotNull C destination, @NotNull Function1<? super Integer, ? extends Iterable<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        for (int i10 : iArr) {
            CollectionsKt__MutableCollectionsKt.addAll(destination, transform.invoke(Integer.valueOf(i10)));
        }
        return destination;
    }

    public static int last(@NotNull int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        if (iArr.length != 0) {
            return iArr[getLastIndex(iArr)];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @Nullable
    public static final <T> T lastOrNull(@NotNull T[] tArr, @NotNull Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = tArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i10 = length - 1;
                T t10 = tArr[length];
                if (predicate.invoke(t10).booleanValue()) {
                    return t10;
                }
                if (i10 >= 0) {
                    length = i10;
                }
            }
        }
        return null;
    }

    @NotNull
    public static final <R> List<R> map(@NotNull int[] iArr, @NotNull Function1<? super Integer, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i10 : iArr) {
            arrayList.add(transform.invoke(Integer.valueOf(i10)));
        }
        return arrayList;
    }

    @NotNull
    public static final <R> List<R> mapIndexed(@NotNull int[] iArr, @NotNull Function2<? super Integer, ? super Integer, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList(iArr.length);
        int length = iArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            arrayList.add(transform.invoke(Integer.valueOf(i11), Integer.valueOf(iArr[i10])));
            i10++;
            i11++;
        }
        return arrayList;
    }

    public static final <T> boolean none(@NotNull T[] tArr, @NotNull Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (T t10 : tArr) {
            if (predicate.invoke(t10).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @e1(version = "1.3")
    public static final <T> T random(@NotNull T[] tArr, @NotNull kotlin.random.f random) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        if (tArr.length != 0) {
            return tArr[random.m(tArr.length)];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @e1(version = "1.4")
    @Nullable
    public static final <T> T randomOrNull(@NotNull T[] tArr, @NotNull kotlin.random.f random) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        if (tArr.length == 0) {
            return null;
        }
        return tArr[random.m(tArr.length)];
    }

    @e1(version = "1.4")
    @Nullable
    public static final Short reduceIndexedOrNull(@NotNull short[] sArr, @NotNull n<? super Integer, ? super Short, ? super Short, Short> operation) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (sArr.length == 0) {
            return null;
        }
        short sShortValue = sArr[0];
        int lastIndex = getLastIndex(sArr);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                sShortValue = operation.invoke(Integer.valueOf(i10), Short.valueOf(sShortValue), Short.valueOf(sArr[i10])).shortValue();
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return Short.valueOf(sShortValue);
    }

    @e1(version = "1.4")
    @Nullable
    public static final Short reduceOrNull(@NotNull short[] sArr, @NotNull Function2<? super Short, ? super Short, Short> operation) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (sArr.length == 0) {
            return null;
        }
        short sShortValue = sArr[0];
        int lastIndex = getLastIndex(sArr);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                sShortValue = operation.invoke(Short.valueOf(sShortValue), Short.valueOf(sArr[i10])).shortValue();
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return Short.valueOf(sShortValue);
    }

    @NotNull
    public static final List<Integer> reversed(@NotNull int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        if (iArr.length == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        List<Integer> mutableList = toMutableList(iArr);
        CollectionsKt___CollectionsJvmKt.reverse(mutableList);
        return mutableList;
    }

    @e1(version = "1.4")
    public static final <T> void shuffle(@NotNull T[] tArr, @NotNull kotlin.random.f random) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        for (int lastIndex = getLastIndex(tArr); lastIndex > 0; lastIndex--) {
            int iM = random.m(lastIndex + 1);
            T t10 = tArr[lastIndex];
            tArr[lastIndex] = tArr[iM];
            tArr[iM] = t10;
        }
    }

    @Nullable
    public static final <T> T singleOrNull(@NotNull T[] tArr, @NotNull Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        T t10 = null;
        boolean z10 = false;
        for (T t11 : tArr) {
            if (predicate.invoke(t11).booleanValue()) {
                if (z10) {
                    return null;
                }
                z10 = true;
                t10 = t11;
            }
        }
        if (z10) {
            return t10;
        }
        return null;
    }

    @NotNull
    public static int[] sliceArray(@NotNull int[] iArr, @NotNull Collection<Integer> indices) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(indices, "indices");
        int[] iArr2 = new int[indices.size()];
        Iterator<Integer> it = indices.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            iArr2[i10] = iArr[it.next().intValue()];
            i10++;
        }
        return iArr2;
    }

    @u0
    @m2(markerClass = {u.class})
    @e1(version = "1.5")
    @f
    @oj.i(name = "sumOfUInt")
    private static final int sumOfUInt(int[] iArr, Function1<? super Integer, u1> selector) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        int iN = u1.n(0);
        for (int i10 : iArr) {
            iN = u1.n(iN + selector.invoke(Integer.valueOf(i10)).z0());
        }
        return iN;
    }

    @u0
    @m2(markerClass = {u.class})
    @e1(version = "1.5")
    @f
    @oj.i(name = "sumOfULong")
    private static final long sumOfULong(int[] iArr, Function1<? super Integer, y1> selector) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        long jN = y1.n(0L);
        for (int i10 : iArr) {
            jN = y1.n(jN + selector.invoke(Integer.valueOf(i10)).z0());
        }
        return jN;
    }

    @NotNull
    public static final List<Float> toMutableList(@NotNull float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        ArrayList arrayList = new ArrayList(fArr.length);
        for (float f10 : fArr) {
            arrayList.add(Float.valueOf(f10));
        }
        return arrayList;
    }

    @NotNull
    public static final <R, V> List<V> zip(@NotNull int[] iArr, @NotNull R[] other, @NotNull Function2<? super Integer, ? super R, ? extends V> transform) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int iMin = Math.min(iArr.length, other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i10 = 0; i10 < iMin; i10++) {
            arrayList.add(transform.invoke(Integer.valueOf(iArr[i10]), other[i10]));
        }
        return arrayList;
    }

    public static final boolean any(@NotNull byte[] bArr, @NotNull Function1<? super Byte, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (byte b10 : bArr) {
            if (predicate.invoke(Byte.valueOf(b10)).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @NotNull
    public static Iterable<Float> asIterable(@NotNull float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        return fArr.length == 0 ? CollectionsKt__CollectionsKt.emptyList() : new ArraysKt___ArraysKt$asIterable$$inlined$Iterable$6(fArr);
    }

    @NotNull
    public static final Sequence<Float> asSequence(@NotNull final float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        return fArr.length == 0 ? o.g() : new Sequence<Float>() { // from class: kotlin.collections.ArraysKt___ArraysKt$asSequence$$inlined$Sequence$6
            @Override // kotlin.sequences.Sequence
            public Iterator<Float> iterator() {
                return j.e(fArr);
            }
        };
    }

    @NotNull
    public static final <K, M extends Map<? super K, ? super Float>> M associateByTo(@NotNull float[] fArr, @NotNull M destination, @NotNull Function1<? super Float, ? extends K> keySelector) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        for (float f10 : fArr) {
            destination.put(keySelector.invoke(Float.valueOf(f10)), Float.valueOf(f10));
        }
        return destination;
    }

    @NotNull
    public static final <K, V, M extends Map<? super K, ? super V>> M associateTo(@NotNull float[] fArr, @NotNull M destination, @NotNull Function1<? super Float, ? extends Pair<? extends K, ? extends V>> transform) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        for (float f10 : fArr) {
            Pair<? extends K, ? extends V> pairInvoke = transform.invoke(Float.valueOf(f10));
            destination.put(pairInvoke.getFirst(), pairInvoke.getSecond());
        }
        return destination;
    }

    @e1(version = "1.4")
    @f
    private static final <V, M extends Map<? super Float, ? super V>> M associateWithTo(float[] fArr, M destination, Function1<? super Float, ? extends V> valueSelector) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(valueSelector, "valueSelector");
        for (float f10 : fArr) {
            destination.put(Float.valueOf(f10), valueSelector.invoke(Float.valueOf(f10)));
        }
        return destination;
    }

    public static final int count(@NotNull byte[] bArr, @NotNull Function1<? super Byte, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int i10 = 0;
        for (byte b10 : bArr) {
            if (predicate.invoke(Byte.valueOf(b10)).booleanValue()) {
                i10++;
            }
        }
        return i10;
    }

    @NotNull
    public static final List<Float> drop(@NotNull float[] fArr, int i10) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        if (i10 >= 0) {
            return takeLast(fArr, r.u(fArr.length - i10, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
    }

    @NotNull
    public static final List<Float> dropLast(@NotNull float[] fArr, int i10) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        if (i10 >= 0) {
            return take(fArr, r.u(fArr.length - i10, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
    }

    @NotNull
    public static final List<Short> dropWhile(@NotNull short[] sArr, @NotNull Function1<? super Short, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        boolean z10 = false;
        for (short s10 : sArr) {
            if (z10) {
                arrayList.add(Short.valueOf(s10));
            } else if (!predicate.invoke(Short.valueOf(s10)).booleanValue()) {
                arrayList.add(Short.valueOf(s10));
                z10 = true;
            }
        }
        return arrayList;
    }

    @NotNull
    public static final List<Float> filter(@NotNull float[] fArr, @NotNull Function1<? super Float, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (float f10 : fArr) {
            if (predicate.invoke(Float.valueOf(f10)).booleanValue()) {
                arrayList.add(Float.valueOf(f10));
            }
        }
        return arrayList;
    }

    @NotNull
    public static final <C extends Collection<? super Float>> C filterIndexedTo(@NotNull float[] fArr, @NotNull C destination, @NotNull Function2<? super Integer, ? super Float, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = fArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            float f10 = fArr[i10];
            int i12 = i11 + 1;
            if (predicate.invoke(Integer.valueOf(i11), Float.valueOf(f10)).booleanValue()) {
                destination.add(Float.valueOf(f10));
            }
            i10++;
            i11 = i12;
        }
        return destination;
    }

    @NotNull
    public static final List<Float> filterNot(@NotNull float[] fArr, @NotNull Function1<? super Float, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (float f10 : fArr) {
            if (!predicate.invoke(Float.valueOf(f10)).booleanValue()) {
                arrayList.add(Float.valueOf(f10));
            }
        }
        return arrayList;
    }

    @Nullable
    public static final Byte firstOrNull(@NotNull byte[] bArr, @NotNull Function1<? super Byte, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (byte b10 : bArr) {
            if (predicate.invoke(Byte.valueOf(b10)).booleanValue()) {
                return Byte.valueOf(b10);
            }
        }
        return null;
    }

    public static final <R> R foldRight(@NotNull float[] fArr, R r10, @NotNull Function2<? super Float, ? super R, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        for (int lastIndex = getLastIndex(fArr); lastIndex >= 0; lastIndex--) {
            r10 = operation.invoke(Float.valueOf(fArr[lastIndex]), r10);
        }
        return r10;
    }

    public static final <R> R foldRightIndexed(@NotNull float[] fArr, R r10, @NotNull n<? super Integer, ? super Float, ? super R, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        for (int lastIndex = getLastIndex(fArr); lastIndex >= 0; lastIndex--) {
            r10 = operation.invoke(Integer.valueOf(lastIndex), Float.valueOf(fArr[lastIndex]), r10);
        }
        return r10;
    }

    public static int indexOf(@NotNull long[] jArr, long j10) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        int length = jArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (j10 == jArr[i10]) {
                return i10;
            }
        }
        return -1;
    }

    public static final int indexOfFirst(@NotNull float[] fArr, @NotNull Function1<? super Float, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = fArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (predicate.invoke(Float.valueOf(fArr[i10])).booleanValue()) {
                return i10;
            }
        }
        return -1;
    }

    public static final int indexOfLast(@NotNull float[] fArr, @NotNull Function1<? super Float, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = fArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i10 = length - 1;
                if (predicate.invoke(Float.valueOf(fArr[length])).booleanValue()) {
                    return length;
                }
                if (i10 >= 0) {
                    length = i10;
                }
            }
        }
        return -1;
    }

    @NotNull
    public static final Set<Float> intersect(@NotNull float[] fArr, @NotNull Iterable<Float> other) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Set<Float> mutableSet = toMutableSet(fArr);
        CollectionsKt__MutableCollectionsKt.retainAll(mutableSet, other);
        return mutableSet;
    }

    public static int lastIndexOf(@NotNull long[] jArr, long j10) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        int length = jArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i10 = length - 1;
                if (j10 == jArr[length]) {
                    return length;
                }
                if (i10 >= 0) {
                    length = i10;
                }
            }
        }
        return -1;
    }

    @NotNull
    public static final <R, C extends Collection<? super R>> C mapIndexedTo(@NotNull float[] fArr, @NotNull C destination, @NotNull Function2<? super Integer, ? super Float, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int length = fArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            destination.add(transform.invoke(Integer.valueOf(i11), Float.valueOf(fArr[i10])));
            i10++;
            i11++;
        }
        return destination;
    }

    @NotNull
    public static final <R, C extends Collection<? super R>> C mapTo(@NotNull float[] fArr, @NotNull C destination, @NotNull Function1<? super Float, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        for (float f10 : fArr) {
            destination.add(transform.invoke(Float.valueOf(f10)));
        }
        return destination;
    }

    @u0
    @e1(version = "1.4")
    @f
    private static final <R> R maxOfWithOrNull(short[] sArr, Comparator<? super R> comparator, Function1<? super Short, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (sArr.length == 0) {
            return null;
        }
        R rInvoke = selector.invoke(Short.valueOf(sArr[0]));
        int lastIndex = getLastIndex(sArr);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                R rInvoke2 = selector.invoke(Short.valueOf(sArr[i10]));
                if (comparator.compare(rInvoke, rInvoke2) < 0) {
                    rInvoke = rInvoke2;
                }
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return rInvoke;
    }

    @u0
    @e1(version = "1.4")
    @f
    private static final <R> R minOfWithOrNull(short[] sArr, Comparator<? super R> comparator, Function1<? super Short, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (sArr.length == 0) {
            return null;
        }
        R rInvoke = selector.invoke(Short.valueOf(sArr[0]));
        int lastIndex = getLastIndex(sArr);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                R rInvoke2 = selector.invoke(Short.valueOf(sArr[i10]));
                if (comparator.compare(rInvoke, rInvoke2) > 0) {
                    rInvoke = rInvoke2;
                }
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return rInvoke;
    }

    public static final boolean none(@NotNull byte[] bArr, @NotNull Function1<? super Byte, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (byte b10 : bArr) {
            if (predicate.invoke(Byte.valueOf(b10)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static final short reduce(@NotNull short[] sArr, @NotNull Function2<? super Short, ? super Short, Short> operation) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (sArr.length == 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        short sShortValue = sArr[0];
        int lastIndex = getLastIndex(sArr);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                sShortValue = operation.invoke(Short.valueOf(sShortValue), Short.valueOf(sArr[i10])).shortValue();
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return sShortValue;
    }

    public static final short reduceIndexed(@NotNull short[] sArr, @NotNull n<? super Integer, ? super Short, ? super Short, Short> operation) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (sArr.length == 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        short sShortValue = sArr[0];
        int lastIndex = getLastIndex(sArr);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                sShortValue = operation.invoke(Integer.valueOf(i10), Short.valueOf(sShortValue), Short.valueOf(sArr[i10])).shortValue();
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return sShortValue;
    }

    public static void reverse(@NotNull short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        int length = (sArr.length / 2) - 1;
        if (length < 0) {
            return;
        }
        int lastIndex = getLastIndex(sArr);
        if (length < 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            short s10 = sArr[i10];
            sArr[i10] = sArr[lastIndex];
            sArr[lastIndex] = s10;
            lastIndex--;
            if (i10 == length) {
                return;
            } else {
                i10++;
            }
        }
    }

    @e1(version = "1.4")
    @f
    private static final <R> List<R> runningFold(short[] sArr, R r10, Function2<? super R, ? super Short, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (sArr.length == 0) {
            return CollectionsKt__CollectionsJVMKt.listOf(r10);
        }
        ArrayList arrayList = new ArrayList(sArr.length + 1);
        arrayList.add(r10);
        for (short s10 : sArr) {
            r10 = operation.invoke(r10, Short.valueOf(s10));
            arrayList.add(r10);
        }
        return arrayList;
    }

    @e1(version = "1.4")
    @f
    private static final <R> List<R> runningFoldIndexed(short[] sArr, R r10, n<? super Integer, ? super R, ? super Short, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (sArr.length == 0) {
            return CollectionsKt__CollectionsJVMKt.listOf(r10);
        }
        ArrayList arrayList = new ArrayList(sArr.length + 1);
        arrayList.add(r10);
        int length = sArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            r10 = operation.invoke(Integer.valueOf(i10), r10, Short.valueOf(sArr[i10]));
            arrayList.add(r10);
        }
        return arrayList;
    }

    @NotNull
    public static final List<Float> slice(@NotNull float[] fArr, @NotNull IntRange indices) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(indices, "indices");
        return indices.isEmpty() ? CollectionsKt__CollectionsKt.emptyList() : ArraysKt___ArraysJvmKt.asList(ArraysKt___ArraysJvmKt.copyOfRange(fArr, indices.u().intValue(), indices.i().intValue() + 1));
    }

    public static final void sortDescending(@NotNull long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        if (jArr.length > 1) {
            ArraysKt___ArraysJvmKt.sort(jArr);
            reverse(jArr);
        }
    }

    @NotNull
    public static final float[] sortedArray(@NotNull float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        if (fArr.length == 0) {
            return fArr;
        }
        float[] fArrCopyOf = Arrays.copyOf(fArr, fArr.length);
        Intrinsics.checkNotNullExpressionValue(fArrCopyOf, "copyOf(...)");
        ArraysKt___ArraysJvmKt.sort(fArrCopyOf);
        return fArrCopyOf;
    }

    @NotNull
    public static final float[] sortedArrayDescending(@NotNull float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        if (fArr.length == 0) {
            return fArr;
        }
        float[] fArrCopyOf = Arrays.copyOf(fArr, fArr.length);
        Intrinsics.checkNotNullExpressionValue(fArrCopyOf, "copyOf(...)");
        sortDescending(fArrCopyOf);
        return fArrCopyOf;
    }

    @NotNull
    public static final Set<Float> subtract(@NotNull float[] fArr, @NotNull Iterable<Float> other) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Set<Float> mutableSet = toMutableSet(fArr);
        CollectionsKt__MutableCollectionsKt.removeAll(mutableSet, other);
        return mutableSet;
    }

    @l(message = "Use sumOf instead.", replaceWith = @b1(expression = "this.sumOf(selector)", imports = {}))
    @m(warningSince = "1.5")
    public static final int sumBy(@NotNull float[] fArr, @NotNull Function1<? super Float, Integer> selector) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        int iIntValue = 0;
        for (float f10 : fArr) {
            iIntValue += selector.invoke(Float.valueOf(f10)).intValue();
        }
        return iIntValue;
    }

    @l(message = "Use sumOf instead.", replaceWith = @b1(expression = "this.sumOf(selector)", imports = {}))
    @m(warningSince = "1.5")
    public static final double sumByDouble(@NotNull float[] fArr, @NotNull Function1<? super Float, Double> selector) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        double dDoubleValue = 0.0d;
        for (float f10 : fArr) {
            dDoubleValue += selector.invoke(Float.valueOf(f10)).doubleValue();
        }
        return dDoubleValue;
    }

    @u0
    @e1(version = "1.4")
    @f
    @oj.i(name = "sumOfDouble")
    private static final double sumOfDouble(float[] fArr, Function1<? super Float, Double> selector) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        double dDoubleValue = 0.0d;
        for (float f10 : fArr) {
            dDoubleValue += selector.invoke(Float.valueOf(f10)).doubleValue();
        }
        return dDoubleValue;
    }

    @u0
    @e1(version = "1.4")
    @f
    @oj.i(name = "sumOfInt")
    private static final int sumOfInt(float[] fArr, Function1<? super Float, Integer> selector) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        int iIntValue = 0;
        for (float f10 : fArr) {
            iIntValue += selector.invoke(Float.valueOf(f10)).intValue();
        }
        return iIntValue;
    }

    @u0
    @e1(version = "1.4")
    @f
    @oj.i(name = "sumOfLong")
    private static final long sumOfLong(float[] fArr, Function1<? super Float, Long> selector) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        long jLongValue = 0;
        for (float f10 : fArr) {
            jLongValue += selector.invoke(Float.valueOf(f10)).longValue();
        }
        return jLongValue;
    }

    @NotNull
    public static final <C extends Collection<? super Float>> C toCollection(@NotNull float[] fArr, @NotNull C destination) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        for (float f10 : fArr) {
            destination.add(Float.valueOf(f10));
        }
        return destination;
    }

    @NotNull
    public static final Set<Float> union(@NotNull float[] fArr, @NotNull Iterable<Float> other) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Set<Float> mutableSet = toMutableSet(fArr);
        CollectionsKt__MutableCollectionsKt.addAll(mutableSet, other);
        return mutableSet;
    }

    public static final boolean any(@NotNull short[] sArr, @NotNull Function1<? super Short, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (short s10 : sArr) {
            if (predicate.invoke(Short.valueOf(s10)).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @e1(version = "1.4")
    @f
    private static final <V> Map<Float, V> associateWith(float[] fArr, Function1<? super Float, ? extends V> valueSelector) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(valueSelector, "valueSelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(r.u(MapsKt__MapsJVMKt.mapCapacity(fArr.length), 16));
        for (float f10 : fArr) {
            linkedHashMap.put(Float.valueOf(f10), valueSelector.invoke(Float.valueOf(f10)));
        }
        return linkedHashMap;
    }

    public static final int count(@NotNull short[] sArr, @NotNull Function1<? super Short, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int i10 = 0;
        for (short s10 : sArr) {
            if (predicate.invoke(Short.valueOf(s10)).booleanValue()) {
                i10++;
            }
        }
        return i10;
    }

    @Nullable
    public static final Short firstOrNull(@NotNull short[] sArr, @NotNull Function1<? super Short, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (short s10 : sArr) {
            if (predicate.invoke(Short.valueOf(s10)).booleanValue()) {
                return Short.valueOf(s10);
            }
        }
        return null;
    }

    @e1(version = "1.4")
    @Nullable
    public static final Short maxWithOrNull(@NotNull short[] sArr, @NotNull Comparator<? super Short> comparator) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (sArr.length == 0) {
            return null;
        }
        short s10 = sArr[0];
        int lastIndex = getLastIndex(sArr);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                short s11 = sArr[i10];
                if (comparator.compare(Short.valueOf(s10), Short.valueOf(s11)) < 0) {
                    s10 = s11;
                }
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return Short.valueOf(s10);
    }

    @e1(version = "1.4")
    @Nullable
    public static final Short minWithOrNull(@NotNull short[] sArr, @NotNull Comparator<? super Short> comparator) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (sArr.length == 0) {
            return null;
        }
        short s10 = sArr[0];
        int lastIndex = getLastIndex(sArr);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                short s11 = sArr[i10];
                if (comparator.compare(Short.valueOf(s10), Short.valueOf(s11)) > 0) {
                    s10 = s11;
                }
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return Short.valueOf(s10);
    }

    public static final boolean none(@NotNull short[] sArr, @NotNull Function1<? super Short, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (short s10 : sArr) {
            if (predicate.invoke(Short.valueOf(s10)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @e1(version = "1.4")
    @Nullable
    public static final Byte randomOrNull(@NotNull byte[] bArr, @NotNull kotlin.random.f random) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        if (bArr.length == 0) {
            return null;
        }
        return Byte.valueOf(bArr[random.m(bArr.length)]);
    }

    @e1(version = "1.4")
    @Nullable
    public static final Integer reduceRightIndexedOrNull(@NotNull int[] iArr, @NotNull n<? super Integer, ? super Integer, ? super Integer, Integer> operation) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int lastIndex = getLastIndex(iArr);
        if (lastIndex < 0) {
            return null;
        }
        int iIntValue = iArr[lastIndex];
        for (int i10 = lastIndex - 1; i10 >= 0; i10--) {
            iIntValue = operation.invoke(Integer.valueOf(i10), Integer.valueOf(iArr[i10]), Integer.valueOf(iIntValue)).intValue();
        }
        return Integer.valueOf(iIntValue);
    }

    @e1(version = "1.4")
    @Nullable
    public static final Integer reduceRightOrNull(@NotNull int[] iArr, @NotNull Function2<? super Integer, ? super Integer, Integer> operation) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int lastIndex = getLastIndex(iArr);
        if (lastIndex < 0) {
            return null;
        }
        int iIntValue = iArr[lastIndex];
        for (int i10 = lastIndex - 1; i10 >= 0; i10--) {
            iIntValue = operation.invoke(Integer.valueOf(iArr[i10]), Integer.valueOf(iIntValue)).intValue();
        }
        return Integer.valueOf(iIntValue);
    }

    @Nullable
    public static final Byte singleOrNull(@NotNull byte[] bArr, @NotNull Function1<? super Byte, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Byte bValueOf = null;
        boolean z10 = false;
        for (byte b10 : bArr) {
            if (predicate.invoke(Byte.valueOf(b10)).booleanValue()) {
                if (z10) {
                    return null;
                }
                bValueOf = Byte.valueOf(b10);
                z10 = true;
            }
        }
        if (z10) {
            return bValueOf;
        }
        return null;
    }

    @NotNull
    public static final List<Double> toMutableList(@NotNull double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        ArrayList arrayList = new ArrayList(dArr.length);
        for (double d10 : dArr) {
            arrayList.add(Double.valueOf(d10));
        }
        return arrayList;
    }

    public static final boolean any(@NotNull int[] iArr, @NotNull Function1<? super Integer, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (int i10 : iArr) {
            if (predicate.invoke(Integer.valueOf(i10)).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @NotNull
    public static Iterable<Double> asIterable(@NotNull double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        return dArr.length == 0 ? CollectionsKt__CollectionsKt.emptyList() : new ArraysKt___ArraysKt$asIterable$$inlined$Iterable$7(dArr);
    }

    @NotNull
    public static final Sequence<Double> asSequence(@NotNull final double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        return dArr.length == 0 ? o.g() : new Sequence<Double>() { // from class: kotlin.collections.ArraysKt___ArraysKt$asSequence$$inlined$Sequence$7
            @Override // kotlin.sequences.Sequence
            public Iterator<Double> iterator() {
                return j.d(dArr);
            }
        };
    }

    @NotNull
    public static final <K, V> Map<K, V> associate(@NotNull int[] iArr, @NotNull Function1<? super Integer, ? extends Pair<? extends K, ? extends V>> transform) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(r.u(MapsKt__MapsJVMKt.mapCapacity(iArr.length), 16));
        for (int i10 : iArr) {
            Pair<? extends K, ? extends V> pairInvoke = transform.invoke(Integer.valueOf(i10));
            linkedHashMap.put(pairInvoke.getFirst(), pairInvoke.getSecond());
        }
        return linkedHashMap;
    }

    @NotNull
    public static final <K> Map<K, Integer> associateBy(@NotNull int[] iArr, @NotNull Function1<? super Integer, ? extends K> keySelector) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(r.u(MapsKt__MapsJVMKt.mapCapacity(iArr.length), 16));
        for (int i10 : iArr) {
            linkedHashMap.put(keySelector.invoke(Integer.valueOf(i10)), Integer.valueOf(i10));
        }
        return linkedHashMap;
    }

    @NotNull
    public static final <K, M extends Map<? super K, ? super Double>> M associateByTo(@NotNull double[] dArr, @NotNull M destination, @NotNull Function1<? super Double, ? extends K> keySelector) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        for (double d10 : dArr) {
            destination.put(keySelector.invoke(Double.valueOf(d10)), Double.valueOf(d10));
        }
        return destination;
    }

    @NotNull
    public static final <K, V, M extends Map<? super K, ? super V>> M associateTo(@NotNull double[] dArr, @NotNull M destination, @NotNull Function1<? super Double, ? extends Pair<? extends K, ? extends V>> transform) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        for (double d10 : dArr) {
            Pair<? extends K, ? extends V> pairInvoke = transform.invoke(Double.valueOf(d10));
            destination.put(pairInvoke.getFirst(), pairInvoke.getSecond());
        }
        return destination;
    }

    @e1(version = "1.4")
    @f
    private static final <V, M extends Map<? super Double, ? super V>> M associateWithTo(double[] dArr, M destination, Function1<? super Double, ? extends V> valueSelector) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(valueSelector, "valueSelector");
        for (double d10 : dArr) {
            destination.put(Double.valueOf(d10), valueSelector.invoke(Double.valueOf(d10)));
        }
        return destination;
    }

    public static final int count(@NotNull int[] iArr, @NotNull Function1<? super Integer, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int i10 = 0;
        for (int i11 : iArr) {
            if (predicate.invoke(Integer.valueOf(i11)).booleanValue()) {
                i10++;
            }
        }
        return i10;
    }

    @NotNull
    public static final <K> List<Short> distinctBy(@NotNull short[] sArr, @NotNull Function1<? super Short, ? extends K> selector) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (short s10 : sArr) {
            if (hashSet.add(selector.invoke(Short.valueOf(s10)))) {
                arrayList.add(Short.valueOf(s10));
            }
        }
        return arrayList;
    }

    @NotNull
    public static final List<Double> drop(@NotNull double[] dArr, int i10) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        if (i10 >= 0) {
            return takeLast(dArr, r.u(dArr.length - i10, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
    }

    @NotNull
    public static final List<Double> dropLast(@NotNull double[] dArr, int i10) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        if (i10 >= 0) {
            int i11 = 4 & 0;
            return take(dArr, r.u(dArr.length - i10, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
    }

    @NotNull
    public static final List<Integer> dropLastWhile(@NotNull int[] iArr, @NotNull Function1<? super Integer, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (int lastIndex = getLastIndex(iArr); -1 < lastIndex; lastIndex--) {
            if (!predicate.invoke(Integer.valueOf(iArr[lastIndex])).booleanValue()) {
                return take(iArr, lastIndex + 1);
            }
        }
        return CollectionsKt__CollectionsKt.emptyList();
    }

    @NotNull
    public static final List<Double> filter(@NotNull double[] dArr, @NotNull Function1<? super Double, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (double d10 : dArr) {
            if (predicate.invoke(Double.valueOf(d10)).booleanValue()) {
                arrayList.add(Double.valueOf(d10));
            }
        }
        return arrayList;
    }

    @NotNull
    public static final List<Long> filterIndexed(@NotNull long[] jArr, @NotNull Function2<? super Integer, ? super Long, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int length = jArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            long j10 = jArr[i10];
            int i12 = i11 + 1;
            if (predicate.invoke(Integer.valueOf(i11), Long.valueOf(j10)).booleanValue()) {
                arrayList.add(Long.valueOf(j10));
            }
            i10++;
            i11 = i12;
        }
        return arrayList;
    }

    @NotNull
    public static final <C extends Collection<? super Double>> C filterIndexedTo(@NotNull double[] dArr, @NotNull C destination, @NotNull Function2<? super Integer, ? super Double, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = dArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            double d10 = dArr[i10];
            int i12 = i11 + 1;
            if (predicate.invoke(Integer.valueOf(i11), Double.valueOf(d10)).booleanValue()) {
                destination.add(Double.valueOf(d10));
            }
            i10++;
            i11 = i12;
        }
        return destination;
    }

    @NotNull
    public static final List<Double> filterNot(@NotNull double[] dArr, @NotNull Function1<? super Double, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (double d10 : dArr) {
            if (!predicate.invoke(Double.valueOf(d10)).booleanValue()) {
                arrayList.add(Double.valueOf(d10));
            }
        }
        return arrayList;
    }

    @f
    private static final Long findLast(long[] jArr, Function1<? super Long, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = jArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i10 = length - 1;
                long j10 = jArr[length];
                if (predicate.invoke(Long.valueOf(j10)).booleanValue()) {
                    return Long.valueOf(j10);
                }
                if (i10 >= 0) {
                    length = i10;
                }
            }
        }
        return null;
    }

    public static long first(@NotNull long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        if (jArr.length != 0) {
            return jArr[0];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @Nullable
    public static final Integer firstOrNull(@NotNull int[] iArr, @NotNull Function1<? super Integer, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (int i10 : iArr) {
            if (predicate.invoke(Integer.valueOf(i10)).booleanValue()) {
                return Integer.valueOf(i10);
            }
        }
        return null;
    }

    @NotNull
    public static final <R> List<R> flatMap(@NotNull int[] iArr, @NotNull Function1<? super Integer, ? extends Iterable<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList();
        for (int i10 : iArr) {
            CollectionsKt__MutableCollectionsKt.addAll(arrayList, transform.invoke(Integer.valueOf(i10)));
        }
        return arrayList;
    }

    @u0
    @e1(version = "1.4")
    @f
    @oj.i(name = "flatMapIndexedIterableTo")
    private static final <R, C extends Collection<? super R>> C flatMapIndexedIterableTo(long[] jArr, C destination, Function2<? super Integer, ? super Long, ? extends Iterable<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int length = jArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            CollectionsKt__MutableCollectionsKt.addAll(destination, transform.invoke(Integer.valueOf(i11), Long.valueOf(jArr[i10])));
            i10++;
            i11++;
        }
        return destination;
    }

    @NotNull
    public static final <R, C extends Collection<? super R>> C flatMapTo(@NotNull long[] jArr, @NotNull C destination, @NotNull Function1<? super Long, ? extends Iterable<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        for (long j10 : jArr) {
            CollectionsKt__MutableCollectionsKt.addAll(destination, transform.invoke(Long.valueOf(j10)));
        }
        return destination;
    }

    public static final <R> R foldRight(@NotNull double[] dArr, R r10, @NotNull Function2<? super Double, ? super R, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        for (int lastIndex = getLastIndex(dArr); lastIndex >= 0; lastIndex--) {
            r10 = operation.invoke(Double.valueOf(dArr[lastIndex]), r10);
        }
        return r10;
    }

    public static final <R> R foldRightIndexed(@NotNull double[] dArr, R r10, @NotNull n<? super Integer, ? super Double, ? super R, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        for (int lastIndex = getLastIndex(dArr); lastIndex >= 0; lastIndex--) {
            r10 = operation.invoke(Integer.valueOf(lastIndex), Double.valueOf(dArr[lastIndex]), r10);
        }
        return r10;
    }

    @l(message = "The function has unclear behavior when searching for NaN or zero values and will be removed soon. Use 'indexOfFirst { it == element }' instead to continue using this behavior, or '.asList().indexOf(element: T)' to get the same search behavior as in a list.", replaceWith = @b1(expression = "indexOfFirst { it == element }", imports = {}))
    @m(errorSince = "1.6", hiddenSince = "1.7", warningSince = "1.4")
    public static final /* synthetic */ int indexOf(float[] fArr, float f10) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        int length = fArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (f10 == fArr[i10]) {
                return i10;
            }
        }
        return -1;
    }

    public static final int indexOfFirst(@NotNull double[] dArr, @NotNull Function1<? super Double, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = dArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (predicate.invoke(Double.valueOf(dArr[i10])).booleanValue()) {
                return i10;
            }
        }
        return -1;
    }

    public static final int indexOfLast(@NotNull double[] dArr, @NotNull Function1<? super Double, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = dArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i10 = length - 1;
                if (predicate.invoke(Double.valueOf(dArr[length])).booleanValue()) {
                    return length;
                }
                if (i10 >= 0) {
                    length = i10;
                }
            }
        }
        return -1;
    }

    @NotNull
    public static final Set<Double> intersect(@NotNull double[] dArr, @NotNull Iterable<Double> other) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Set<Double> mutableSet = toMutableSet(dArr);
        CollectionsKt__MutableCollectionsKt.retainAll(mutableSet, other);
        return mutableSet;
    }

    public static long last(@NotNull long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        if (jArr.length != 0) {
            return jArr[getLastIndex(jArr)];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @l(message = "The function has unclear behavior when searching for NaN or zero values and will be removed soon. Use 'indexOfLast { it == element }' instead to continue using this behavior, or '.asList().lastIndexOf(element: T)' to get the same search behavior as in a list.", replaceWith = @b1(expression = "indexOfLast { it == element }", imports = {}))
    @m(errorSince = "1.6", hiddenSince = "1.7", warningSince = "1.4")
    public static final /* synthetic */ int lastIndexOf(float[] fArr, float f10) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        int i10 = 2 | (-1);
        int length = fArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i11 = length - 1;
                if (f10 == fArr[length]) {
                    return length;
                }
                if (i11 >= 0) {
                    length = i11;
                }
            }
        }
        return -1;
    }

    @Nullable
    public static final Byte lastOrNull(@NotNull byte[] bArr, @NotNull Function1<? super Byte, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = bArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i10 = length - 1;
                byte b10 = bArr[length];
                if (predicate.invoke(Byte.valueOf(b10)).booleanValue()) {
                    return Byte.valueOf(b10);
                }
                if (i10 >= 0) {
                    length = i10;
                }
            }
        }
        return null;
    }

    @NotNull
    public static final <R> List<R> map(@NotNull long[] jArr, @NotNull Function1<? super Long, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList(jArr.length);
        for (long j10 : jArr) {
            arrayList.add(transform.invoke(Long.valueOf(j10)));
        }
        return arrayList;
    }

    @NotNull
    public static final <R> List<R> mapIndexed(@NotNull long[] jArr, @NotNull Function2<? super Integer, ? super Long, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList(jArr.length);
        int length = jArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            arrayList.add(transform.invoke(Integer.valueOf(i11), Long.valueOf(jArr[i10])));
            i10++;
            i11++;
        }
        return arrayList;
    }

    @NotNull
    public static final <R, C extends Collection<? super R>> C mapIndexedTo(@NotNull double[] dArr, @NotNull C destination, @NotNull Function2<? super Integer, ? super Double, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int length = dArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            destination.add(transform.invoke(Integer.valueOf(i11), Double.valueOf(dArr[i10])));
            i10++;
            i11++;
        }
        return destination;
    }

    @NotNull
    public static final <R, C extends Collection<? super R>> C mapTo(@NotNull double[] dArr, @NotNull C destination, @NotNull Function1<? super Double, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        for (double d10 : dArr) {
            destination.add(transform.invoke(Double.valueOf(d10)));
        }
        return destination;
    }

    @u0
    @e1(version = "1.4")
    @f
    private static final double maxOf(short[] sArr, Function1<? super Short, Double> selector) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (sArr.length == 0) {
            throw new NoSuchElementException();
        }
        double dDoubleValue = selector.invoke(Short.valueOf(sArr[0])).doubleValue();
        int lastIndex = getLastIndex(sArr);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                dDoubleValue = Math.max(dDoubleValue, selector.invoke(Short.valueOf(sArr[i10])).doubleValue());
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return dDoubleValue;
    }

    @u0
    @e1(version = "1.4")
    @f
    /* JADX INFO: renamed from: maxOfOrNull, reason: collision with other method in class */
    private static final Double m812maxOfOrNull(short[] sArr, Function1<? super Short, Double> selector) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (sArr.length == 0) {
            return null;
        }
        double dDoubleValue = selector.invoke(Short.valueOf(sArr[0])).doubleValue();
        int lastIndex = getLastIndex(sArr);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                dDoubleValue = Math.max(dDoubleValue, selector.invoke(Short.valueOf(sArr[i10])).doubleValue());
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return Double.valueOf(dDoubleValue);
    }

    @u0
    @e1(version = "1.4")
    @f
    private static final <R> R maxOfWith(short[] sArr, Comparator<? super R> comparator, Function1<? super Short, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (sArr.length == 0) {
            throw new NoSuchElementException();
        }
        R rInvoke = selector.invoke(Short.valueOf(sArr[0]));
        int lastIndex = getLastIndex(sArr);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                R rInvoke2 = selector.invoke(Short.valueOf(sArr[i10]));
                if (comparator.compare(rInvoke, rInvoke2) < 0) {
                    rInvoke = rInvoke2;
                }
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return rInvoke;
    }

    @e1(version = "1.4")
    @Nullable
    public static final <T extends Comparable<? super T>> T maxOrNull(@NotNull T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        if (tArr.length == 0) {
            return null;
        }
        T t10 = tArr[0];
        int lastIndex = getLastIndex(tArr);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                T t11 = tArr[i10];
                if (t10.compareTo(t11) < 0) {
                    t10 = t11;
                }
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return t10;
    }

    @e1(version = "1.7")
    @oj.i(name = "maxOrThrow")
    @NotNull
    public static final <T extends Comparable<? super T>> T maxOrThrow(@NotNull T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        if (tArr.length != 0) {
            T t10 = tArr[0];
            int lastIndex = getLastIndex(tArr);
            int i10 = 1;
            if (1 <= lastIndex) {
                while (true) {
                    T t11 = tArr[i10];
                    if (t10.compareTo(t11) < 0) {
                        t10 = t11;
                    }
                    if (i10 == lastIndex) {
                        break;
                    }
                    i10++;
                }
            }
            return t10;
        }
        throw new NoSuchElementException();
    }

    @e1(version = "1.7")
    @oj.i(name = "maxWithOrThrow")
    public static final short maxWithOrThrow(@NotNull short[] sArr, @NotNull Comparator<? super Short> comparator) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (sArr.length != 0) {
            short s10 = sArr[0];
            int lastIndex = getLastIndex(sArr);
            int i10 = 1;
            if (1 <= lastIndex) {
                while (true) {
                    short s11 = sArr[i10];
                    if (comparator.compare(Short.valueOf(s10), Short.valueOf(s11)) < 0) {
                        s10 = s11;
                    }
                    if (i10 == lastIndex) {
                        break;
                    }
                    i10++;
                }
            }
            return s10;
        }
        throw new NoSuchElementException();
    }

    @u0
    @e1(version = "1.4")
    @f
    private static final double minOf(short[] sArr, Function1<? super Short, Double> selector) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (sArr.length != 0) {
            double dDoubleValue = selector.invoke(Short.valueOf(sArr[0])).doubleValue();
            int lastIndex = getLastIndex(sArr);
            int i10 = 1;
            if (1 <= lastIndex) {
                while (true) {
                    dDoubleValue = Math.min(dDoubleValue, selector.invoke(Short.valueOf(sArr[i10])).doubleValue());
                    if (i10 == lastIndex) {
                        break;
                    }
                    i10++;
                }
            }
            return dDoubleValue;
        }
        throw new NoSuchElementException();
    }

    @u0
    @e1(version = "1.4")
    @f
    /* JADX INFO: renamed from: minOfOrNull, reason: collision with other method in class */
    private static final Double m848minOfOrNull(short[] sArr, Function1<? super Short, Double> selector) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (sArr.length == 0) {
            return null;
        }
        double dDoubleValue = selector.invoke(Short.valueOf(sArr[0])).doubleValue();
        int lastIndex = getLastIndex(sArr);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                dDoubleValue = Math.min(dDoubleValue, selector.invoke(Short.valueOf(sArr[i10])).doubleValue());
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return Double.valueOf(dDoubleValue);
    }

    @u0
    @e1(version = "1.4")
    @f
    private static final <R> R minOfWith(short[] sArr, Comparator<? super R> comparator, Function1<? super Short, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (sArr.length != 0) {
            int i10 = 2 << 0;
            R rInvoke = selector.invoke(Short.valueOf(sArr[0]));
            int lastIndex = getLastIndex(sArr);
            int i11 = 1;
            if (1 <= lastIndex) {
                while (true) {
                    R rInvoke2 = selector.invoke(Short.valueOf(sArr[i11]));
                    if (comparator.compare(rInvoke, rInvoke2) > 0) {
                        rInvoke = rInvoke2;
                    }
                    if (i11 == lastIndex) {
                        break;
                    }
                    i11++;
                }
            }
            return rInvoke;
        }
        throw new NoSuchElementException();
    }

    @e1(version = "1.4")
    @Nullable
    public static final <T extends Comparable<? super T>> T minOrNull(@NotNull T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        if (tArr.length == 0) {
            return null;
        }
        T t10 = tArr[0];
        int lastIndex = getLastIndex(tArr);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                T t11 = tArr[i10];
                if (t10.compareTo(t11) > 0) {
                    t10 = t11;
                }
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return t10;
    }

    @e1(version = "1.7")
    @oj.i(name = "minOrThrow")
    @NotNull
    public static final <T extends Comparable<? super T>> T minOrThrow(@NotNull T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        if (tArr.length != 0) {
            T t10 = tArr[0];
            int lastIndex = getLastIndex(tArr);
            int i10 = 1;
            if (1 <= lastIndex) {
                while (true) {
                    T t11 = tArr[i10];
                    if (t10.compareTo(t11) > 0) {
                        t10 = t11;
                    }
                    if (i10 == lastIndex) {
                        break;
                    }
                    i10++;
                }
            }
            return t10;
        }
        throw new NoSuchElementException();
    }

    @e1(version = "1.7")
    @oj.i(name = "minWithOrThrow")
    public static final short minWithOrThrow(@NotNull short[] sArr, @NotNull Comparator<? super Short> comparator) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (sArr.length != 0) {
            short s10 = sArr[0];
            int lastIndex = getLastIndex(sArr);
            int i10 = 1;
            if (1 <= lastIndex) {
                while (true) {
                    short s11 = sArr[i10];
                    if (comparator.compare(Short.valueOf(s10), Short.valueOf(s11)) > 0) {
                        s10 = s11;
                    }
                    if (i10 == lastIndex) {
                        break;
                    }
                    i10++;
                }
            }
            return s10;
        }
        throw new NoSuchElementException();
    }

    public static final boolean none(@NotNull int[] iArr, @NotNull Function1<? super Integer, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int i10 = 4 ^ 0;
        for (int i11 : iArr) {
            if (predicate.invoke(Integer.valueOf(i11)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @e1(version = "1.3")
    public static final byte random(@NotNull byte[] bArr, @NotNull kotlin.random.f random) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        if (bArr.length != 0) {
            return bArr[random.m(bArr.length)];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static final int reduceRight(@NotNull int[] iArr, @NotNull Function2<? super Integer, ? super Integer, Integer> operation) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int lastIndex = getLastIndex(iArr);
        if (lastIndex >= 0) {
            int iIntValue = iArr[lastIndex];
            for (int i10 = lastIndex - 1; i10 >= 0; i10--) {
                iIntValue = operation.invoke(Integer.valueOf(iArr[i10]), Integer.valueOf(iIntValue)).intValue();
            }
            return iIntValue;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    public static final int reduceRightIndexed(@NotNull int[] iArr, @NotNull n<? super Integer, ? super Integer, ? super Integer, Integer> operation) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int lastIndex = getLastIndex(iArr);
        if (lastIndex >= 0) {
            int iIntValue = iArr[lastIndex];
            for (int i10 = lastIndex - 1; i10 >= 0; i10--) {
                iIntValue = operation.invoke(Integer.valueOf(i10), Integer.valueOf(iArr[i10]), Integer.valueOf(iIntValue)).intValue();
            }
            return iIntValue;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    @NotNull
    public static final List<Long> reversed(@NotNull long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        if (jArr.length == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        List<Long> mutableList = toMutableList(jArr);
        CollectionsKt___CollectionsJvmKt.reverse(mutableList);
        return mutableList;
    }

    @NotNull
    public static int[] reversedArray(@NotNull int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        if (iArr.length == 0) {
            return iArr;
        }
        int[] iArr2 = new int[iArr.length];
        int lastIndex = getLastIndex(iArr);
        if (lastIndex >= 0) {
            int i10 = 0;
            while (true) {
                iArr2[lastIndex - i10] = iArr[i10];
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return iArr2;
    }

    @e1(version = "1.4")
    @f
    private static final List<Short> runningReduce(short[] sArr, Function2<? super Short, ? super Short, Short> operation) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (sArr.length == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        short sShortValue = sArr[0];
        ArrayList arrayList = new ArrayList(sArr.length);
        arrayList.add(Short.valueOf(sShortValue));
        int length = sArr.length;
        for (int i10 = 1; i10 < length; i10++) {
            sShortValue = operation.invoke(Short.valueOf(sShortValue), Short.valueOf(sArr[i10])).shortValue();
            arrayList.add(Short.valueOf(sShortValue));
        }
        return arrayList;
    }

    @e1(version = "1.4")
    @f
    private static final List<Short> runningReduceIndexed(short[] sArr, n<? super Integer, ? super Short, ? super Short, Short> operation) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (sArr.length == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        short sShortValue = sArr[0];
        ArrayList arrayList = new ArrayList(sArr.length);
        arrayList.add(Short.valueOf(sShortValue));
        int length = sArr.length;
        for (int i10 = 1; i10 < length; i10++) {
            sShortValue = operation.invoke(Integer.valueOf(i10), Short.valueOf(sShortValue), Short.valueOf(sArr[i10])).shortValue();
            arrayList.add(Short.valueOf(sShortValue));
        }
        return arrayList;
    }

    public static int single(@NotNull int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        int length = iArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        if (length == 1) {
            return iArr[0];
        }
        throw new IllegalArgumentException("Array has more than one element.");
    }

    @NotNull
    public static final List<Double> slice(@NotNull double[] dArr, @NotNull IntRange indices) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(indices, "indices");
        return indices.isEmpty() ? CollectionsKt__CollectionsKt.emptyList() : ArraysKt___ArraysJvmKt.asList(ArraysKt___ArraysJvmKt.copyOfRange(dArr, indices.u().intValue(), indices.i().intValue() + 1));
    }

    @NotNull
    public static long[] sliceArray(@NotNull long[] jArr, @NotNull Collection<Integer> indices) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(indices, "indices");
        long[] jArr2 = new long[indices.size()];
        Iterator<Integer> it = indices.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            jArr2[i10] = jArr[it.next().intValue()];
            i10++;
        }
        return jArr2;
    }

    @NotNull
    public static final double[] sortedArray(@NotNull double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        if (dArr.length == 0) {
            return dArr;
        }
        double[] dArrCopyOf = Arrays.copyOf(dArr, dArr.length);
        Intrinsics.checkNotNullExpressionValue(dArrCopyOf, "copyOf(...)");
        ArraysKt___ArraysJvmKt.sort(dArrCopyOf);
        return dArrCopyOf;
    }

    @NotNull
    public static final double[] sortedArrayDescending(@NotNull double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        if (dArr.length == 0) {
            return dArr;
        }
        double[] dArrCopyOf = Arrays.copyOf(dArr, dArr.length);
        Intrinsics.checkNotNullExpressionValue(dArrCopyOf, "copyOf(...)");
        sortDescending(dArrCopyOf);
        return dArrCopyOf;
    }

    @NotNull
    public static final Set<Double> subtract(@NotNull double[] dArr, @NotNull Iterable<Double> other) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Set<Double> mutableSet = toMutableSet(dArr);
        CollectionsKt__MutableCollectionsKt.removeAll(mutableSet, other);
        return mutableSet;
    }

    @l(message = "Use sumOf instead.", replaceWith = @b1(expression = "this.sumOf(selector)", imports = {}))
    @m(warningSince = "1.5")
    public static final int sumBy(@NotNull double[] dArr, @NotNull Function1<? super Double, Integer> selector) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        int iIntValue = 0;
        for (double d10 : dArr) {
            iIntValue += selector.invoke(Double.valueOf(d10)).intValue();
        }
        return iIntValue;
    }

    @l(message = "Use sumOf instead.", replaceWith = @b1(expression = "this.sumOf(selector)", imports = {}))
    @m(warningSince = "1.5")
    public static final double sumByDouble(@NotNull double[] dArr, @NotNull Function1<? super Double, Double> selector) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        double dDoubleValue = 0.0d;
        for (double d10 : dArr) {
            dDoubleValue += selector.invoke(Double.valueOf(d10)).doubleValue();
        }
        return dDoubleValue;
    }

    @u0
    @e1(version = "1.4")
    @f
    @oj.i(name = "sumOfDouble")
    private static final double sumOfDouble(double[] dArr, Function1<? super Double, Double> selector) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        double dDoubleValue = 0.0d;
        for (double d10 : dArr) {
            dDoubleValue += selector.invoke(Double.valueOf(d10)).doubleValue();
        }
        return dDoubleValue;
    }

    @u0
    @e1(version = "1.4")
    @f
    @oj.i(name = "sumOfInt")
    private static final int sumOfInt(double[] dArr, Function1<? super Double, Integer> selector) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        int iIntValue = 0;
        for (double d10 : dArr) {
            iIntValue += selector.invoke(Double.valueOf(d10)).intValue();
        }
        return iIntValue;
    }

    @u0
    @e1(version = "1.4")
    @f
    @oj.i(name = "sumOfLong")
    private static final long sumOfLong(double[] dArr, Function1<? super Double, Long> selector) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        long jLongValue = 0;
        for (double d10 : dArr) {
            jLongValue += selector.invoke(Double.valueOf(d10)).longValue();
        }
        return jLongValue;
    }

    @u0
    @m2(markerClass = {u.class})
    @e1(version = "1.5")
    @f
    @oj.i(name = "sumOfUInt")
    private static final int sumOfUInt(long[] jArr, Function1<? super Long, u1> selector) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        int iN = u1.n(0);
        for (long j10 : jArr) {
            iN = u1.n(iN + selector.invoke(Long.valueOf(j10)).z0());
        }
        return iN;
    }

    @u0
    @m2(markerClass = {u.class})
    @e1(version = "1.5")
    @f
    @oj.i(name = "sumOfULong")
    private static final long sumOfULong(long[] jArr, Function1<? super Long, y1> selector) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        long jN = y1.n(0L);
        for (long j10 : jArr) {
            jN = y1.n(jN + selector.invoke(Long.valueOf(j10)).z0());
        }
        return jN;
    }

    @NotNull
    public static final List<Integer> takeLastWhile(@NotNull int[] iArr, @NotNull Function1<? super Integer, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (int lastIndex = getLastIndex(iArr); -1 < lastIndex; lastIndex--) {
            if (!predicate.invoke(Integer.valueOf(iArr[lastIndex])).booleanValue()) {
                return drop(iArr, lastIndex + 1);
            }
        }
        return toList(iArr);
    }

    @NotNull
    public static final List<Integer> takeWhile(@NotNull int[] iArr, @NotNull Function1<? super Integer, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (int i10 : iArr) {
            if (!predicate.invoke(Integer.valueOf(i10)).booleanValue()) {
                break;
            }
            arrayList.add(Integer.valueOf(i10));
        }
        return arrayList;
    }

    @NotNull
    public static final <C extends Collection<? super Double>> C toCollection(@NotNull double[] dArr, @NotNull C destination) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        for (double d10 : dArr) {
            destination.add(Double.valueOf(d10));
        }
        return destination;
    }

    @NotNull
    public static List<Integer> toList(@NotNull int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        int length = iArr.length;
        if (length == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        if (length != 1) {
            return toMutableList(iArr);
        }
        return CollectionsKt__CollectionsJVMKt.listOf(Integer.valueOf(iArr[0]));
    }

    @NotNull
    public static final Set<Integer> toSet(@NotNull int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        int length = iArr.length;
        if (length != 0) {
            return length != 1 ? (Set) toCollection(iArr, new LinkedHashSet(MapsKt__MapsJVMKt.mapCapacity(iArr.length))) : SetsKt__SetsJVMKt.setOf(Integer.valueOf(iArr[0]));
        }
        return SetsKt__SetsKt.emptySet();
    }

    @NotNull
    public static final Set<Double> union(@NotNull double[] dArr, @NotNull Iterable<Double> other) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Set<Double> mutableSet = toMutableSet(dArr);
        CollectionsKt__MutableCollectionsKt.addAll(mutableSet, other);
        return mutableSet;
    }

    @NotNull
    public static final <R, V> List<V> zip(@NotNull long[] jArr, @NotNull R[] other, @NotNull Function2<? super Long, ? super R, ? extends V> transform) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int iMin = Math.min(jArr.length, other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i10 = 0; i10 < iMin; i10++) {
            arrayList.add(transform.invoke(Long.valueOf(jArr[i10]), other[i10]));
        }
        return arrayList;
    }

    public static final boolean any(@NotNull long[] jArr, @NotNull Function1<? super Long, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (long j10 : jArr) {
            if (predicate.invoke(Long.valueOf(j10)).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @e1(version = "1.4")
    @f
    private static final <V> Map<Double, V> associateWith(double[] dArr, Function1<? super Double, ? extends V> valueSelector) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(valueSelector, "valueSelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(r.u(MapsKt__MapsJVMKt.mapCapacity(dArr.length), 16));
        for (double d10 : dArr) {
            linkedHashMap.put(Double.valueOf(d10), valueSelector.invoke(Double.valueOf(d10)));
        }
        return linkedHashMap;
    }

    public static final int count(@NotNull long[] jArr, @NotNull Function1<? super Long, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int i10 = 4 | 0;
        int i11 = 0;
        for (long j10 : jArr) {
            if (predicate.invoke(Long.valueOf(j10)).booleanValue()) {
                i11++;
            }
        }
        return i11;
    }

    @Nullable
    public static final Long firstOrNull(@NotNull long[] jArr, @NotNull Function1<? super Long, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (long j10 : jArr) {
            if (predicate.invoke(Long.valueOf(j10)).booleanValue()) {
                return Long.valueOf(j10);
            }
        }
        return null;
    }

    @NotNull
    public static final <A extends Appendable> A joinTo(@NotNull short[] sArr, @NotNull A buffer, @NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence postfix, int i10, @NotNull CharSequence truncated, @Nullable Function1<? super Short, ? extends CharSequence> function1) throws IOException {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(truncated, "truncated");
        buffer.append(prefix);
        int i11 = 0;
        for (short s10 : sArr) {
            i11++;
            if (i11 > 1) {
                buffer.append(separator);
            }
            if (i10 >= 0 && i11 > i10) {
                break;
            }
            if (function1 != null) {
                buffer.append(function1.invoke(Short.valueOf(s10)));
            } else {
                buffer.append(String.valueOf((int) s10));
            }
        }
        if (i10 >= 0 && i11 > i10) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    public static final boolean none(@NotNull long[] jArr, @NotNull Function1<? super Long, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (long j10 : jArr) {
            if (predicate.invoke(Long.valueOf(j10)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @e1(version = "1.4")
    @Nullable
    public static final Short randomOrNull(@NotNull short[] sArr, @NotNull kotlin.random.f random) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        if (sArr.length == 0) {
            return null;
        }
        return Short.valueOf(sArr[random.m(sArr.length)]);
    }

    public static final void sortDescending(@NotNull float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        if (fArr.length > 1) {
            ArraysKt___ArraysJvmKt.sort(fArr);
            reverse(fArr);
        }
    }

    @NotNull
    public static final List<Boolean> toMutableList(@NotNull boolean[] zArr) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        ArrayList arrayList = new ArrayList(zArr.length);
        for (boolean z10 : zArr) {
            arrayList.add(Boolean.valueOf(z10));
        }
        return arrayList;
    }

    public static final boolean any(@NotNull float[] fArr, @NotNull Function1<? super Float, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (float f10 : fArr) {
            if (predicate.invoke(Float.valueOf(f10)).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @NotNull
    public static final Iterable<Boolean> asIterable(@NotNull boolean[] zArr) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        return zArr.length == 0 ? CollectionsKt__CollectionsKt.emptyList() : new ArraysKt___ArraysKt$asIterable$$inlined$Iterable$8(zArr);
    }

    @NotNull
    public static final Sequence<Boolean> asSequence(@NotNull final boolean[] zArr) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        return zArr.length == 0 ? o.g() : new Sequence<Boolean>() { // from class: kotlin.collections.ArraysKt___ArraysKt$asSequence$$inlined$Sequence$8
            @Override // kotlin.sequences.Sequence
            public Iterator<Boolean> iterator() {
                return j.a(zArr);
            }
        };
    }

    @NotNull
    public static final <K, M extends Map<? super K, ? super Boolean>> M associateByTo(@NotNull boolean[] zArr, @NotNull M destination, @NotNull Function1<? super Boolean, ? extends K> keySelector) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        for (boolean z10 : zArr) {
            destination.put(keySelector.invoke(Boolean.valueOf(z10)), Boolean.valueOf(z10));
        }
        return destination;
    }

    @NotNull
    public static final <K, V, M extends Map<? super K, ? super V>> M associateTo(@NotNull boolean[] zArr, @NotNull M destination, @NotNull Function1<? super Boolean, ? extends Pair<? extends K, ? extends V>> transform) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        for (boolean z10 : zArr) {
            Pair<? extends K, ? extends V> pairInvoke = transform.invoke(Boolean.valueOf(z10));
            destination.put(pairInvoke.getFirst(), pairInvoke.getSecond());
        }
        return destination;
    }

    @e1(version = "1.4")
    @f
    private static final <V, M extends Map<? super Boolean, ? super V>> M associateWithTo(boolean[] zArr, M destination, Function1<? super Boolean, ? extends V> valueSelector) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(valueSelector, "valueSelector");
        for (boolean z10 : zArr) {
            destination.put(Boolean.valueOf(z10), valueSelector.invoke(Boolean.valueOf(z10)));
        }
        return destination;
    }

    public static final int count(@NotNull float[] fArr, @NotNull Function1<? super Float, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int i10 = 0;
        for (float f10 : fArr) {
            if (predicate.invoke(Float.valueOf(f10)).booleanValue()) {
                i10++;
            }
        }
        return i10;
    }

    @NotNull
    public static final List<Boolean> drop(@NotNull boolean[] zArr, int i10) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        if (i10 >= 0) {
            return takeLast(zArr, r.u(zArr.length - i10, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
    }

    @NotNull
    public static final List<Boolean> dropLast(@NotNull boolean[] zArr, int i10) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        if (i10 >= 0) {
            return take(zArr, r.u(zArr.length - i10, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
    }

    @NotNull
    public static final List<Boolean> filter(@NotNull boolean[] zArr, @NotNull Function1<? super Boolean, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (boolean z10 : zArr) {
            if (predicate.invoke(Boolean.valueOf(z10)).booleanValue()) {
                arrayList.add(Boolean.valueOf(z10));
            }
        }
        return arrayList;
    }

    @NotNull
    public static final <C extends Collection<? super Boolean>> C filterIndexedTo(@NotNull boolean[] zArr, @NotNull C destination, @NotNull Function2<? super Integer, ? super Boolean, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = zArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            boolean z10 = zArr[i10];
            int i12 = i11 + 1;
            if (predicate.invoke(Integer.valueOf(i11), Boolean.valueOf(z10)).booleanValue()) {
                destination.add(Boolean.valueOf(z10));
            }
            i10++;
            i11 = i12;
        }
        return destination;
    }

    @NotNull
    public static final List<Boolean> filterNot(@NotNull boolean[] zArr, @NotNull Function1<? super Boolean, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int i10 = 6 >> 0;
        for (boolean z10 : zArr) {
            if (!predicate.invoke(Boolean.valueOf(z10)).booleanValue()) {
                arrayList.add(Boolean.valueOf(z10));
            }
        }
        return arrayList;
    }

    @Nullable
    public static final Float firstOrNull(@NotNull float[] fArr, @NotNull Function1<? super Float, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (float f10 : fArr) {
            if (predicate.invoke(Float.valueOf(f10)).booleanValue()) {
                return Float.valueOf(f10);
            }
        }
        return null;
    }

    public static final <R> R foldRight(@NotNull boolean[] zArr, R r10, @NotNull Function2<? super Boolean, ? super R, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        for (int lastIndex = getLastIndex(zArr); lastIndex >= 0; lastIndex--) {
            r10 = operation.invoke(Boolean.valueOf(zArr[lastIndex]), r10);
        }
        return r10;
    }

    public static final <R> R foldRightIndexed(@NotNull boolean[] zArr, R r10, @NotNull n<? super Integer, ? super Boolean, ? super R, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        for (int lastIndex = getLastIndex(zArr); lastIndex >= 0; lastIndex--) {
            r10 = operation.invoke(Integer.valueOf(lastIndex), Boolean.valueOf(zArr[lastIndex]), r10);
        }
        return r10;
    }

    @NotNull
    public static final <K, M extends Map<? super K, List<Short>>> M groupByTo(@NotNull short[] sArr, @NotNull M destination, @NotNull Function1<? super Short, ? extends K> keySelector) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        for (short s10 : sArr) {
            K kInvoke = keySelector.invoke(Short.valueOf(s10));
            Object arrayList = destination.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                destination.put(kInvoke, arrayList);
            }
            ((List) arrayList).add(Short.valueOf(s10));
        }
        return destination;
    }

    @l(message = "The function has unclear behavior when searching for NaN or zero values and will be removed soon. Use 'indexOfFirst { it == element }' instead to continue using this behavior, or '.asList().indexOf(element: T)' to get the same search behavior as in a list.", replaceWith = @b1(expression = "indexOfFirst { it == element }", imports = {}))
    @m(errorSince = "1.6", hiddenSince = "1.7", warningSince = "1.4")
    public static final /* synthetic */ int indexOf(double[] dArr, double d10) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        int length = dArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (d10 == dArr[i10]) {
                return i10;
            }
        }
        return -1;
    }

    public static final int indexOfFirst(@NotNull boolean[] zArr, @NotNull Function1<? super Boolean, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = zArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (predicate.invoke(Boolean.valueOf(zArr[i10])).booleanValue()) {
                return i10;
            }
        }
        return -1;
    }

    public static final int indexOfLast(@NotNull boolean[] zArr, @NotNull Function1<? super Boolean, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = zArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i10 = length - 1;
                if (predicate.invoke(Boolean.valueOf(zArr[length])).booleanValue()) {
                    return length;
                }
                if (i10 >= 0) {
                    length = i10;
                }
            }
        }
        return -1;
    }

    @NotNull
    public static final Set<Boolean> intersect(@NotNull boolean[] zArr, @NotNull Iterable<Boolean> other) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Set<Boolean> mutableSet = toMutableSet(zArr);
        CollectionsKt__MutableCollectionsKt.retainAll(mutableSet, other);
        return mutableSet;
    }

    @l(message = "The function has unclear behavior when searching for NaN or zero values and will be removed soon. Use 'indexOfLast { it == element }' instead to continue using this behavior, or '.asList().lastIndexOf(element: T)' to get the same search behavior as in a list.", replaceWith = @b1(expression = "indexOfLast { it == element }", imports = {}))
    @m(errorSince = "1.6", hiddenSince = "1.7", warningSince = "1.4")
    public static final /* synthetic */ int lastIndexOf(double[] dArr, double d10) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        int length = dArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i10 = length - 1;
                if (d10 == dArr[length]) {
                    return length;
                }
                if (i10 >= 0) {
                    length = i10;
                }
            }
        }
        return -1;
    }

    @NotNull
    public static final <R, C extends Collection<? super R>> C mapIndexedTo(@NotNull boolean[] zArr, @NotNull C destination, @NotNull Function2<? super Integer, ? super Boolean, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int length = zArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            destination.add(transform.invoke(Integer.valueOf(i11), Boolean.valueOf(zArr[i10])));
            i10++;
            i11++;
        }
        return destination;
    }

    @NotNull
    public static final <R, C extends Collection<? super R>> C mapTo(@NotNull boolean[] zArr, @NotNull C destination, @NotNull Function1<? super Boolean, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        for (boolean z10 : zArr) {
            destination.add(transform.invoke(Boolean.valueOf(z10)));
        }
        return destination;
    }

    public static final boolean none(@NotNull float[] fArr, @NotNull Function1<? super Float, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (float f10 : fArr) {
            if (predicate.invoke(Float.valueOf(f10)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @NotNull
    public static final Pair<List<Short>, List<Short>> partition(@NotNull short[] sArr, @NotNull Function1<? super Short, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (short s10 : sArr) {
            if (predicate.invoke(Short.valueOf(s10)).booleanValue()) {
                arrayList.add(Short.valueOf(s10));
            } else {
                arrayList2.add(Short.valueOf(s10));
            }
        }
        return new Pair<>(arrayList, arrayList2);
    }

    @e1(version = "1.4")
    @Nullable
    public static final Integer reduceIndexedOrNull(@NotNull int[] iArr, @NotNull n<? super Integer, ? super Integer, ? super Integer, Integer> operation) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (iArr.length == 0) {
            return null;
        }
        int iIntValue = iArr[0];
        int lastIndex = getLastIndex(iArr);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                iIntValue = operation.invoke(Integer.valueOf(i10), Integer.valueOf(iIntValue), Integer.valueOf(iArr[i10])).intValue();
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return Integer.valueOf(iIntValue);
    }

    @e1(version = "1.4")
    @Nullable
    public static final Integer reduceOrNull(@NotNull int[] iArr, @NotNull Function2<? super Integer, ? super Integer, Integer> operation) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (iArr.length == 0) {
            return null;
        }
        int iIntValue = iArr[0];
        int lastIndex = getLastIndex(iArr);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                iIntValue = operation.invoke(Integer.valueOf(iIntValue), Integer.valueOf(iArr[i10])).intValue();
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return Integer.valueOf(iIntValue);
    }

    @e1(version = "1.4")
    public static final void shuffle(@NotNull byte[] bArr, @NotNull kotlin.random.f random) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        for (int lastIndex = getLastIndex(bArr); lastIndex > 0; lastIndex--) {
            int iM = random.m(lastIndex + 1);
            byte b10 = bArr[lastIndex];
            bArr[lastIndex] = bArr[iM];
            bArr[iM] = b10;
        }
    }

    @Nullable
    public static final Short singleOrNull(@NotNull short[] sArr, @NotNull Function1<? super Short, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int i10 = 3 | 0;
        Short shValueOf = null;
        boolean z10 = false;
        for (short s10 : sArr) {
            if (predicate.invoke(Short.valueOf(s10)).booleanValue()) {
                if (z10) {
                    return null;
                }
                shValueOf = Short.valueOf(s10);
                z10 = true;
            }
        }
        if (z10) {
            return shValueOf;
        }
        return null;
    }

    @NotNull
    public static final List<Boolean> slice(@NotNull boolean[] zArr, @NotNull IntRange indices) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(indices, "indices");
        return indices.isEmpty() ? CollectionsKt__CollectionsKt.emptyList() : ArraysKt___ArraysJvmKt.asList(ArraysKt___ArraysJvmKt.copyOfRange(zArr, indices.u().intValue(), indices.i().intValue() + 1));
    }

    @NotNull
    public static final char[] sortedArray(@NotNull char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        if (cArr.length == 0) {
            return cArr;
        }
        char[] cArrCopyOf = Arrays.copyOf(cArr, cArr.length);
        Intrinsics.checkNotNullExpressionValue(cArrCopyOf, "copyOf(...)");
        ArraysKt___ArraysJvmKt.sort(cArrCopyOf);
        return cArrCopyOf;
    }

    @NotNull
    public static final char[] sortedArrayDescending(@NotNull char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        if (cArr.length == 0) {
            return cArr;
        }
        char[] cArrCopyOf = Arrays.copyOf(cArr, cArr.length);
        Intrinsics.checkNotNullExpressionValue(cArrCopyOf, "copyOf(...)");
        sortDescending(cArrCopyOf);
        return cArrCopyOf;
    }

    @NotNull
    public static final Set<Boolean> subtract(@NotNull boolean[] zArr, @NotNull Iterable<Boolean> other) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Set<Boolean> mutableSet = toMutableSet(zArr);
        CollectionsKt__MutableCollectionsKt.removeAll(mutableSet, other);
        return mutableSet;
    }

    @l(message = "Use sumOf instead.", replaceWith = @b1(expression = "this.sumOf(selector)", imports = {}))
    @m(warningSince = "1.5")
    public static final int sumBy(@NotNull boolean[] zArr, @NotNull Function1<? super Boolean, Integer> selector) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        int iIntValue = 0;
        for (boolean z10 : zArr) {
            iIntValue += selector.invoke(Boolean.valueOf(z10)).intValue();
        }
        return iIntValue;
    }

    @l(message = "Use sumOf instead.", replaceWith = @b1(expression = "this.sumOf(selector)", imports = {}))
    @m(warningSince = "1.5")
    public static final double sumByDouble(@NotNull boolean[] zArr, @NotNull Function1<? super Boolean, Double> selector) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        double dDoubleValue = 0.0d;
        for (boolean z10 : zArr) {
            dDoubleValue += selector.invoke(Boolean.valueOf(z10)).doubleValue();
        }
        return dDoubleValue;
    }

    @u0
    @e1(version = "1.4")
    @f
    @oj.i(name = "sumOfDouble")
    private static final double sumOfDouble(boolean[] zArr, Function1<? super Boolean, Double> selector) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        double dDoubleValue = 0.0d;
        for (boolean z10 : zArr) {
            dDoubleValue += selector.invoke(Boolean.valueOf(z10)).doubleValue();
        }
        return dDoubleValue;
    }

    @u0
    @e1(version = "1.4")
    @f
    @oj.i(name = "sumOfInt")
    private static final int sumOfInt(boolean[] zArr, Function1<? super Boolean, Integer> selector) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        int iIntValue = 0;
        for (boolean z10 : zArr) {
            iIntValue += selector.invoke(Boolean.valueOf(z10)).intValue();
        }
        return iIntValue;
    }

    @u0
    @e1(version = "1.4")
    @f
    @oj.i(name = "sumOfLong")
    private static final long sumOfLong(boolean[] zArr, Function1<? super Boolean, Long> selector) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        long jLongValue = 0;
        for (boolean z10 : zArr) {
            jLongValue += selector.invoke(Boolean.valueOf(z10)).longValue();
        }
        return jLongValue;
    }

    @NotNull
    public static final List<Short> take(@NotNull short[] sArr, int i10) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
        }
        if (i10 == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        if (i10 >= sArr.length) {
            return toList(sArr);
        }
        if (i10 == 1) {
            return CollectionsKt__CollectionsJVMKt.listOf(Short.valueOf(sArr[0]));
        }
        ArrayList arrayList = new ArrayList(i10);
        int i11 = 0;
        for (short s10 : sArr) {
            arrayList.add(Short.valueOf(s10));
            i11++;
            if (i11 == i10) {
                break;
            }
        }
        return arrayList;
    }

    @NotNull
    public static final List<Short> takeLast(@NotNull short[] sArr, int i10) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
        }
        if (i10 == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        int length = sArr.length;
        if (i10 >= length) {
            return toList(sArr);
        }
        if (i10 == 1) {
            return CollectionsKt__CollectionsJVMKt.listOf(Short.valueOf(sArr[length - 1]));
        }
        ArrayList arrayList = new ArrayList(i10);
        for (int i11 = length - i10; i11 < length; i11++) {
            arrayList.add(Short.valueOf(sArr[i11]));
        }
        return arrayList;
    }

    @NotNull
    public static final <C extends Collection<? super Boolean>> C toCollection(@NotNull boolean[] zArr, @NotNull C destination) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        for (boolean z10 : zArr) {
            destination.add(Boolean.valueOf(z10));
        }
        return destination;
    }

    @NotNull
    public static final Set<Boolean> union(@NotNull boolean[] zArr, @NotNull Iterable<Boolean> other) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Set<Boolean> mutableSet = toMutableSet(zArr);
        CollectionsKt__MutableCollectionsKt.addAll(mutableSet, other);
        return mutableSet;
    }

    public static final boolean any(@NotNull double[] dArr, @NotNull Function1<? super Double, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (double d10 : dArr) {
            if (predicate.invoke(Double.valueOf(d10)).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @e1(version = "1.4")
    @f
    private static final <V> Map<Boolean, V> associateWith(boolean[] zArr, Function1<? super Boolean, ? extends V> valueSelector) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(valueSelector, "valueSelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(r.u(MapsKt__MapsJVMKt.mapCapacity(zArr.length), 16));
        for (boolean z10 : zArr) {
            linkedHashMap.put(Boolean.valueOf(z10), valueSelector.invoke(Boolean.valueOf(z10)));
        }
        return linkedHashMap;
    }

    public static final int count(@NotNull double[] dArr, @NotNull Function1<? super Double, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int i10 = 0;
        for (double d10 : dArr) {
            if (predicate.invoke(Double.valueOf(d10)).booleanValue()) {
                i10++;
            }
        }
        return i10;
    }

    @NotNull
    public static final List<Integer> dropWhile(@NotNull int[] iArr, @NotNull Function1<? super Integer, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        boolean z10 = false;
        for (int i10 : iArr) {
            if (z10) {
                arrayList.add(Integer.valueOf(i10));
            } else if (!predicate.invoke(Integer.valueOf(i10)).booleanValue()) {
                arrayList.add(Integer.valueOf(i10));
                z10 = true;
            }
        }
        return arrayList;
    }

    @NotNull
    public static final List<Float> filterIndexed(@NotNull float[] fArr, @NotNull Function2<? super Integer, ? super Float, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int length = fArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            float f10 = fArr[i10];
            int i12 = i11 + 1;
            if (predicate.invoke(Integer.valueOf(i11), Float.valueOf(f10)).booleanValue()) {
                arrayList.add(Float.valueOf(f10));
            }
            i10++;
            i11 = i12;
        }
        return arrayList;
    }

    @f
    private static final Float findLast(float[] fArr, Function1<? super Float, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = fArr.length - 1;
        if (length < 0) {
            return null;
        }
        while (true) {
            int i10 = length - 1;
            float f10 = fArr[length];
            if (predicate.invoke(Float.valueOf(f10)).booleanValue()) {
                return Float.valueOf(f10);
            }
            if (i10 < 0) {
                return null;
            }
            length = i10;
        }
    }

    public static float first(@NotNull float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        if (fArr.length != 0) {
            return fArr[0];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @Nullable
    public static final Double firstOrNull(@NotNull double[] dArr, @NotNull Function1<? super Double, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (double d10 : dArr) {
            if (predicate.invoke(Double.valueOf(d10)).booleanValue()) {
                return Double.valueOf(d10);
            }
        }
        return null;
    }

    @u0
    @e1(version = "1.4")
    @f
    @oj.i(name = "flatMapIndexedIterableTo")
    private static final <R, C extends Collection<? super R>> C flatMapIndexedIterableTo(float[] fArr, C destination, Function2<? super Integer, ? super Float, ? extends Iterable<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int length = fArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            CollectionsKt__MutableCollectionsKt.addAll(destination, transform.invoke(Integer.valueOf(i11), Float.valueOf(fArr[i10])));
            i10++;
            i11++;
        }
        return destination;
    }

    @NotNull
    public static final <R, C extends Collection<? super R>> C flatMapTo(@NotNull float[] fArr, @NotNull C destination, @NotNull Function1<? super Float, ? extends Iterable<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        for (float f10 : fArr) {
            CollectionsKt__MutableCollectionsKt.addAll(destination, transform.invoke(Float.valueOf(f10)));
        }
        return destination;
    }

    public static float last(@NotNull float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        if (fArr.length != 0) {
            return fArr[getLastIndex(fArr)];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @Nullable
    public static final Short lastOrNull(@NotNull short[] sArr, @NotNull Function1<? super Short, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = sArr.length - 1;
        if (length < 0) {
            return null;
        }
        while (true) {
            int i10 = length - 1;
            short s10 = sArr[length];
            if (predicate.invoke(Short.valueOf(s10)).booleanValue()) {
                return Short.valueOf(s10);
            }
            if (i10 < 0) {
                return null;
            }
            length = i10;
        }
    }

    @NotNull
    public static final <R> List<R> map(@NotNull float[] fArr, @NotNull Function1<? super Float, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList(fArr.length);
        for (float f10 : fArr) {
            arrayList.add(transform.invoke(Float.valueOf(f10)));
        }
        return arrayList;
    }

    @NotNull
    public static final <R> List<R> mapIndexed(@NotNull float[] fArr, @NotNull Function2<? super Integer, ? super Float, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList(fArr.length);
        int length = fArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            arrayList.add(transform.invoke(Integer.valueOf(i11), Float.valueOf(fArr[i10])));
            i10++;
            i11++;
        }
        return arrayList;
    }

    @u0
    @e1(version = "1.4")
    @f
    private static final <R> R maxOfWithOrNull(int[] iArr, Comparator<? super R> comparator, Function1<? super Integer, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (iArr.length == 0) {
            return null;
        }
        R rInvoke = selector.invoke(Integer.valueOf(iArr[0]));
        int lastIndex = getLastIndex(iArr);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                R rInvoke2 = selector.invoke(Integer.valueOf(iArr[i10]));
                if (comparator.compare(rInvoke, rInvoke2) < 0) {
                    rInvoke = rInvoke2;
                }
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return rInvoke;
    }

    @u0
    @e1(version = "1.4")
    @f
    private static final <R> R minOfWithOrNull(int[] iArr, Comparator<? super R> comparator, Function1<? super Integer, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (iArr.length == 0) {
            return null;
        }
        R rInvoke = selector.invoke(Integer.valueOf(iArr[0]));
        int lastIndex = getLastIndex(iArr);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                R rInvoke2 = selector.invoke(Integer.valueOf(iArr[i10]));
                if (comparator.compare(rInvoke, rInvoke2) > 0) {
                    rInvoke = rInvoke2;
                }
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return rInvoke;
    }

    public static final boolean none(@NotNull double[] dArr, @NotNull Function1<? super Double, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (double d10 : dArr) {
            if (predicate.invoke(Double.valueOf(d10)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @e1(version = "1.3")
    public static final short random(@NotNull short[] sArr, @NotNull kotlin.random.f random) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        if (sArr.length != 0) {
            return sArr[random.m(sArr.length)];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @e1(version = "1.4")
    @Nullable
    public static final Integer randomOrNull(@NotNull int[] iArr, @NotNull kotlin.random.f random) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        if (iArr.length == 0) {
            return null;
        }
        return Integer.valueOf(iArr[random.m(iArr.length)]);
    }

    public static final int reduce(@NotNull int[] iArr, @NotNull Function2<? super Integer, ? super Integer, Integer> operation) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (iArr.length == 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        int iIntValue = iArr[0];
        int lastIndex = getLastIndex(iArr);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                iIntValue = operation.invoke(Integer.valueOf(iIntValue), Integer.valueOf(iArr[i10])).intValue();
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return iIntValue;
    }

    public static final int reduceIndexed(@NotNull int[] iArr, @NotNull n<? super Integer, ? super Integer, ? super Integer, Integer> operation) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (iArr.length == 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        int iIntValue = iArr[0];
        int lastIndex = getLastIndex(iArr);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                iIntValue = operation.invoke(Integer.valueOf(i10), Integer.valueOf(iIntValue), Integer.valueOf(iArr[i10])).intValue();
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return iIntValue;
    }

    @e1(version = "1.4")
    @Nullable
    public static final Long reduceRightIndexedOrNull(@NotNull long[] jArr, @NotNull n<? super Integer, ? super Long, ? super Long, Long> operation) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int lastIndex = getLastIndex(jArr);
        if (lastIndex < 0) {
            return null;
        }
        long jLongValue = jArr[lastIndex];
        for (int i10 = lastIndex - 1; i10 >= 0; i10--) {
            jLongValue = operation.invoke(Integer.valueOf(i10), Long.valueOf(jArr[i10]), Long.valueOf(jLongValue)).longValue();
        }
        return Long.valueOf(jLongValue);
    }

    @e1(version = "1.4")
    @Nullable
    public static final Long reduceRightOrNull(@NotNull long[] jArr, @NotNull Function2<? super Long, ? super Long, Long> operation) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int lastIndex = getLastIndex(jArr);
        if (lastIndex < 0) {
            return null;
        }
        long jLongValue = jArr[lastIndex];
        for (int i10 = lastIndex - 1; i10 >= 0; i10--) {
            jLongValue = operation.invoke(Long.valueOf(jArr[i10]), Long.valueOf(jLongValue)).longValue();
        }
        return Long.valueOf(jLongValue);
    }

    public static void reverse(@NotNull int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        int length = (iArr.length / 2) - 1;
        if (length < 0) {
            return;
        }
        int lastIndex = getLastIndex(iArr);
        if (length < 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            int i11 = iArr[i10];
            iArr[i10] = iArr[lastIndex];
            iArr[lastIndex] = i11;
            lastIndex--;
            if (i10 == length) {
                return;
            } else {
                i10++;
            }
        }
    }

    @NotNull
    public static final List<Float> reversed(@NotNull float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        if (fArr.length == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        List<Float> mutableList = toMutableList(fArr);
        CollectionsKt___CollectionsJvmKt.reverse(mutableList);
        return mutableList;
    }

    @e1(version = "1.4")
    @f
    private static final <R> List<R> runningFold(int[] iArr, R r10, Function2<? super R, ? super Integer, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (iArr.length == 0) {
            return CollectionsKt__CollectionsJVMKt.listOf(r10);
        }
        ArrayList arrayList = new ArrayList(iArr.length + 1);
        arrayList.add(r10);
        for (int i10 : iArr) {
            r10 = operation.invoke(r10, Integer.valueOf(i10));
            arrayList.add(r10);
        }
        return arrayList;
    }

    @e1(version = "1.4")
    @f
    private static final <R> List<R> runningFoldIndexed(int[] iArr, R r10, n<? super Integer, ? super R, ? super Integer, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (iArr.length == 0) {
            return CollectionsKt__CollectionsJVMKt.listOf(r10);
        }
        ArrayList arrayList = new ArrayList(iArr.length + 1);
        arrayList.add(r10);
        int length = iArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            r10 = operation.invoke(Integer.valueOf(i10), r10, Integer.valueOf(iArr[i10]));
            arrayList.add(r10);
        }
        return arrayList;
    }

    @NotNull
    public static final float[] sliceArray(@NotNull float[] fArr, @NotNull Collection<Integer> indices) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(indices, "indices");
        float[] fArr2 = new float[indices.size()];
        Iterator<Integer> it = indices.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            fArr2[i10] = fArr[it.next().intValue()];
            i10++;
        }
        return fArr2;
    }

    @u0
    @m2(markerClass = {u.class})
    @e1(version = "1.5")
    @f
    @oj.i(name = "sumOfUInt")
    private static final int sumOfUInt(float[] fArr, Function1<? super Float, u1> selector) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        int iN = u1.n(0);
        for (float f10 : fArr) {
            iN = u1.n(iN + selector.invoke(Float.valueOf(f10)).z0());
        }
        return iN;
    }

    @u0
    @m2(markerClass = {u.class})
    @e1(version = "1.5")
    @f
    @oj.i(name = "sumOfULong")
    private static final long sumOfULong(float[] fArr, Function1<? super Float, y1> selector) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        long jN = y1.n(0L);
        for (float f10 : fArr) {
            jN = y1.n(jN + selector.invoke(Float.valueOf(f10)).z0());
        }
        return jN;
    }

    @NotNull
    public static final List<Character> toMutableList(@NotNull char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        ArrayList arrayList = new ArrayList(cArr.length);
        for (char c10 : cArr) {
            arrayList.add(Character.valueOf(c10));
        }
        return arrayList;
    }

    @NotNull
    public static final <R, V> List<V> zip(@NotNull float[] fArr, @NotNull R[] other, @NotNull Function2<? super Float, ? super R, ? extends V> transform) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int iMin = Math.min(fArr.length, other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i10 = 0; i10 < iMin; i10++) {
            arrayList.add(transform.invoke(Float.valueOf(fArr[i10]), other[i10]));
        }
        return arrayList;
    }

    public static final boolean any(@NotNull boolean[] zArr, @NotNull Function1<? super Boolean, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int i10 = 5 ^ 0;
        for (boolean z10 : zArr) {
            if (predicate.invoke(Boolean.valueOf(z10)).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @NotNull
    public static final Iterable<Character> asIterable(@NotNull char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        return cArr.length == 0 ? CollectionsKt__CollectionsKt.emptyList() : new ArraysKt___ArraysKt$asIterable$$inlined$Iterable$9(cArr);
    }

    @NotNull
    public static final Sequence<Character> asSequence(@NotNull final char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        return cArr.length == 0 ? o.g() : new Sequence<Character>() { // from class: kotlin.collections.ArraysKt___ArraysKt$asSequence$$inlined$Sequence$9
            @Override // kotlin.sequences.Sequence
            public Iterator<Character> iterator() {
                return j.c(cArr);
            }
        };
    }

    @NotNull
    public static final <K, V> Map<K, V> associate(@NotNull long[] jArr, @NotNull Function1<? super Long, ? extends Pair<? extends K, ? extends V>> transform) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(r.u(MapsKt__MapsJVMKt.mapCapacity(jArr.length), 16));
        for (long j10 : jArr) {
            Pair<? extends K, ? extends V> pairInvoke = transform.invoke(Long.valueOf(j10));
            linkedHashMap.put(pairInvoke.getFirst(), pairInvoke.getSecond());
        }
        return linkedHashMap;
    }

    @NotNull
    public static final <K> Map<K, Long> associateBy(@NotNull long[] jArr, @NotNull Function1<? super Long, ? extends K> keySelector) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(r.u(MapsKt__MapsJVMKt.mapCapacity(jArr.length), 16));
        for (long j10 : jArr) {
            linkedHashMap.put(keySelector.invoke(Long.valueOf(j10)), Long.valueOf(j10));
        }
        return linkedHashMap;
    }

    @NotNull
    public static final <K, M extends Map<? super K, ? super Character>> M associateByTo(@NotNull char[] cArr, @NotNull M destination, @NotNull Function1<? super Character, ? extends K> keySelector) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        int i10 = 4 >> 0;
        for (char c10 : cArr) {
            destination.put(keySelector.invoke(Character.valueOf(c10)), Character.valueOf(c10));
        }
        return destination;
    }

    @NotNull
    public static final <K, V, M extends Map<? super K, ? super V>> M associateTo(@NotNull char[] cArr, @NotNull M destination, @NotNull Function1<? super Character, ? extends Pair<? extends K, ? extends V>> transform) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        for (char c10 : cArr) {
            Pair<? extends K, ? extends V> pairInvoke = transform.invoke(Character.valueOf(c10));
            destination.put(pairInvoke.getFirst(), pairInvoke.getSecond());
        }
        return destination;
    }

    @e1(version = "1.4")
    @f
    private static final <V, M extends Map<? super Character, ? super V>> M associateWithTo(char[] cArr, M destination, Function1<? super Character, ? extends V> valueSelector) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(valueSelector, "valueSelector");
        for (char c10 : cArr) {
            destination.put(Character.valueOf(c10), valueSelector.invoke(Character.valueOf(c10)));
        }
        return destination;
    }

    public static final int count(@NotNull boolean[] zArr, @NotNull Function1<? super Boolean, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int i10 = 0;
        for (boolean z10 : zArr) {
            if (predicate.invoke(Boolean.valueOf(z10)).booleanValue()) {
                i10++;
            }
        }
        return i10;
    }

    @NotNull
    public static final List<Character> drop(@NotNull char[] cArr, int i10) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        if (i10 >= 0) {
            return takeLast(cArr, r.u(cArr.length - i10, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
    }

    @NotNull
    public static final List<Character> dropLast(@NotNull char[] cArr, int i10) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        if (i10 >= 0) {
            return take(cArr, r.u(cArr.length - i10, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
    }

    @NotNull
    public static final List<Long> dropLastWhile(@NotNull long[] jArr, @NotNull Function1<? super Long, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (int lastIndex = getLastIndex(jArr); -1 < lastIndex; lastIndex--) {
            if (!predicate.invoke(Long.valueOf(jArr[lastIndex])).booleanValue()) {
                return take(jArr, lastIndex + 1);
            }
        }
        return CollectionsKt__CollectionsKt.emptyList();
    }

    @NotNull
    public static final List<Character> filter(@NotNull char[] cArr, @NotNull Function1<? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (char c10 : cArr) {
            if (predicate.invoke(Character.valueOf(c10)).booleanValue()) {
                arrayList.add(Character.valueOf(c10));
            }
        }
        return arrayList;
    }

    @NotNull
    public static final <C extends Collection<? super Character>> C filterIndexedTo(@NotNull char[] cArr, @NotNull C destination, @NotNull Function2<? super Integer, ? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = cArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            char c10 = cArr[i10];
            int i12 = i11 + 1;
            if (predicate.invoke(Integer.valueOf(i11), Character.valueOf(c10)).booleanValue()) {
                destination.add(Character.valueOf(c10));
            }
            i10++;
            i11 = i12;
        }
        return destination;
    }

    @NotNull
    public static final List<Character> filterNot(@NotNull char[] cArr, @NotNull Function1<? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (char c10 : cArr) {
            if (!predicate.invoke(Character.valueOf(c10)).booleanValue()) {
                arrayList.add(Character.valueOf(c10));
            }
        }
        return arrayList;
    }

    @Nullable
    public static final Boolean firstOrNull(@NotNull boolean[] zArr, @NotNull Function1<? super Boolean, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (boolean z10 : zArr) {
            if (predicate.invoke(Boolean.valueOf(z10)).booleanValue()) {
                return Boolean.valueOf(z10);
            }
        }
        return null;
    }

    @NotNull
    public static final <R> List<R> flatMap(@NotNull long[] jArr, @NotNull Function1<? super Long, ? extends Iterable<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList();
        for (long j10 : jArr) {
            CollectionsKt__MutableCollectionsKt.addAll(arrayList, transform.invoke(Long.valueOf(j10)));
        }
        return arrayList;
    }

    public static final <R> R foldRight(@NotNull char[] cArr, R r10, @NotNull Function2<? super Character, ? super R, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        for (int lastIndex = getLastIndex(cArr); lastIndex >= 0; lastIndex--) {
            r10 = operation.invoke(Character.valueOf(cArr[lastIndex]), r10);
        }
        return r10;
    }

    public static final <R> R foldRightIndexed(@NotNull char[] cArr, R r10, @NotNull n<? super Integer, ? super Character, ? super R, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        for (int lastIndex = getLastIndex(cArr); lastIndex >= 0; lastIndex--) {
            r10 = operation.invoke(Integer.valueOf(lastIndex), Character.valueOf(cArr[lastIndex]), r10);
        }
        return r10;
    }

    @NotNull
    public static final <K> Map<K, List<Short>> groupBy(@NotNull short[] sArr, @NotNull Function1<? super Short, ? extends K> keySelector) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (short s10 : sArr) {
            K kInvoke = keySelector.invoke(Short.valueOf(s10));
            Object arrayList = linkedHashMap.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(kInvoke, arrayList);
            }
            ((List) arrayList).add(Short.valueOf(s10));
        }
        return linkedHashMap;
    }

    public static final int indexOf(@NotNull boolean[] zArr, boolean z10) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        int length = zArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (z10 == zArr[i10]) {
                return i10;
            }
        }
        return -1;
    }

    public static final int indexOfFirst(@NotNull char[] cArr, @NotNull Function1<? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = cArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (predicate.invoke(Character.valueOf(cArr[i10])).booleanValue()) {
                return i10;
            }
        }
        return -1;
    }

    public static final int indexOfLast(@NotNull char[] cArr, @NotNull Function1<? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = cArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i10 = length - 1;
                if (predicate.invoke(Character.valueOf(cArr[length])).booleanValue()) {
                    return length;
                }
                if (i10 >= 0) {
                    length = i10;
                }
            }
        }
        return -1;
    }

    @NotNull
    public static final Set<Character> intersect(@NotNull char[] cArr, @NotNull Iterable<Character> other) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Set<Character> mutableSet = toMutableSet(cArr);
        CollectionsKt__MutableCollectionsKt.retainAll(mutableSet, other);
        return mutableSet;
    }

    public static final int lastIndexOf(@NotNull boolean[] zArr, boolean z10) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        int length = zArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i10 = length - 1;
                if (z10 == zArr[length]) {
                    return length;
                }
                if (i10 >= 0) {
                    length = i10;
                }
            }
        }
        return -1;
    }

    @NotNull
    public static final <R, C extends Collection<? super R>> C mapIndexedTo(@NotNull char[] cArr, @NotNull C destination, @NotNull Function2<? super Integer, ? super Character, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int length = cArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            destination.add(transform.invoke(Integer.valueOf(i11), Character.valueOf(cArr[i10])));
            i10++;
            i11++;
        }
        return destination;
    }

    @NotNull
    public static final <R, C extends Collection<? super R>> C mapTo(@NotNull char[] cArr, @NotNull C destination, @NotNull Function1<? super Character, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int i10 = 5 ^ 0;
        for (char c10 : cArr) {
            destination.add(transform.invoke(Character.valueOf(c10)));
        }
        return destination;
    }

    @e1(version = "1.4")
    @Nullable
    public static final <R extends Comparable<? super R>> Short maxByOrNull(@NotNull short[] sArr, @NotNull Function1<? super Short, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (sArr.length == 0) {
            return null;
        }
        short s10 = sArr[0];
        int lastIndex = getLastIndex(sArr);
        if (lastIndex == 0) {
            return Short.valueOf(s10);
        }
        R rInvoke = selector.invoke(Short.valueOf(s10));
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                short s11 = sArr[i10];
                R rInvoke2 = selector.invoke(Short.valueOf(s11));
                if (rInvoke.compareTo(rInvoke2) < 0) {
                    s10 = s11;
                    rInvoke = rInvoke2;
                }
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return Short.valueOf(s10);
    }

    @e1(version = "1.7")
    @oj.i(name = "maxByOrThrow")
    public static final <R extends Comparable<? super R>> short maxByOrThrow(@NotNull short[] sArr, @NotNull Function1<? super Short, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (sArr.length != 0) {
            short s10 = sArr[0];
            int lastIndex = getLastIndex(sArr);
            if (lastIndex != 0) {
                R rInvoke = selector.invoke(Short.valueOf(s10));
                int i10 = 1;
                if (1 <= lastIndex) {
                    while (true) {
                        short s11 = sArr[i10];
                        R rInvoke2 = selector.invoke(Short.valueOf(s11));
                        if (rInvoke.compareTo(rInvoke2) < 0) {
                            s10 = s11;
                            rInvoke = rInvoke2;
                        }
                        if (i10 == lastIndex) {
                            break;
                        }
                        i10++;
                    }
                }
            }
            return s10;
        }
        throw new NoSuchElementException();
    }

    @e1(version = "1.4")
    @Nullable
    public static final <R extends Comparable<? super R>> Short minByOrNull(@NotNull short[] sArr, @NotNull Function1<? super Short, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (sArr.length == 0) {
            return null;
        }
        short s10 = sArr[0];
        int lastIndex = getLastIndex(sArr);
        if (lastIndex == 0) {
            return Short.valueOf(s10);
        }
        R rInvoke = selector.invoke(Short.valueOf(s10));
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                short s11 = sArr[i10];
                R rInvoke2 = selector.invoke(Short.valueOf(s11));
                if (rInvoke.compareTo(rInvoke2) > 0) {
                    s10 = s11;
                    rInvoke = rInvoke2;
                }
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return Short.valueOf(s10);
    }

    @e1(version = "1.7")
    @oj.i(name = "minByOrThrow")
    public static final <R extends Comparable<? super R>> short minByOrThrow(@NotNull short[] sArr, @NotNull Function1<? super Short, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (sArr.length != 0) {
            short s10 = sArr[0];
            int lastIndex = getLastIndex(sArr);
            if (lastIndex != 0) {
                R rInvoke = selector.invoke(Short.valueOf(s10));
                int i10 = 1;
                if (1 <= lastIndex) {
                    while (true) {
                        short s11 = sArr[i10];
                        R rInvoke2 = selector.invoke(Short.valueOf(s11));
                        if (rInvoke.compareTo(rInvoke2) > 0) {
                            s10 = s11;
                            rInvoke = rInvoke2;
                        }
                        if (i10 == lastIndex) {
                            break;
                        }
                        i10++;
                    }
                }
            }
            return s10;
        }
        throw new NoSuchElementException();
    }

    public static final boolean none(@NotNull boolean[] zArr, @NotNull Function1<? super Boolean, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (boolean z10 : zArr) {
            if (predicate.invoke(Boolean.valueOf(z10)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static final long reduceRight(@NotNull long[] jArr, @NotNull Function2<? super Long, ? super Long, Long> operation) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int lastIndex = getLastIndex(jArr);
        if (lastIndex < 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        long jLongValue = jArr[lastIndex];
        for (int i10 = lastIndex - 1; i10 >= 0; i10--) {
            jLongValue = operation.invoke(Long.valueOf(jArr[i10]), Long.valueOf(jLongValue)).longValue();
        }
        return jLongValue;
    }

    public static final long reduceRightIndexed(@NotNull long[] jArr, @NotNull n<? super Integer, ? super Long, ? super Long, Long> operation) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int lastIndex = getLastIndex(jArr);
        if (lastIndex < 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        long jLongValue = jArr[lastIndex];
        for (int i10 = lastIndex - 1; i10 >= 0; i10--) {
            jLongValue = operation.invoke(Integer.valueOf(i10), Long.valueOf(jArr[i10]), Long.valueOf(jLongValue)).longValue();
        }
        return jLongValue;
    }

    @NotNull
    public static long[] reversedArray(@NotNull long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        if (jArr.length == 0) {
            return jArr;
        }
        long[] jArr2 = new long[jArr.length];
        int lastIndex = getLastIndex(jArr);
        if (lastIndex >= 0) {
            int i10 = 0;
            while (true) {
                jArr2[lastIndex - i10] = jArr[i10];
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return jArr2;
    }

    public static long single(@NotNull long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        int length = jArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        if (length == 1) {
            return jArr[0];
        }
        throw new IllegalArgumentException("Array has more than one element.");
    }

    @NotNull
    public static final List<Character> slice(@NotNull char[] cArr, @NotNull IntRange indices) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(indices, "indices");
        return indices.isEmpty() ? CollectionsKt__CollectionsKt.emptyList() : ArraysKt___ArraysJvmKt.asList(ArraysKt___ArraysJvmKt.copyOfRange(cArr, indices.u().intValue(), indices.i().intValue() + 1));
    }

    public static final void sortDescending(@NotNull double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        if (dArr.length > 1) {
            ArraysKt___ArraysJvmKt.sort(dArr);
            reverse(dArr);
        }
    }

    @NotNull
    public static final Set<Character> subtract(@NotNull char[] cArr, @NotNull Iterable<Character> other) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Set<Character> mutableSet = toMutableSet(cArr);
        CollectionsKt__MutableCollectionsKt.removeAll(mutableSet, other);
        return mutableSet;
    }

    @l(message = "Use sumOf instead.", replaceWith = @b1(expression = "this.sumOf(selector)", imports = {}))
    @m(warningSince = "1.5")
    public static final int sumBy(@NotNull char[] cArr, @NotNull Function1<? super Character, Integer> selector) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        int iIntValue = 0;
        for (char c10 : cArr) {
            iIntValue += selector.invoke(Character.valueOf(c10)).intValue();
        }
        return iIntValue;
    }

    @l(message = "Use sumOf instead.", replaceWith = @b1(expression = "this.sumOf(selector)", imports = {}))
    @m(warningSince = "1.5")
    public static final double sumByDouble(@NotNull char[] cArr, @NotNull Function1<? super Character, Double> selector) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        double dDoubleValue = 0.0d;
        for (char c10 : cArr) {
            dDoubleValue += selector.invoke(Character.valueOf(c10)).doubleValue();
        }
        return dDoubleValue;
    }

    @u0
    @e1(version = "1.4")
    @f
    @oj.i(name = "sumOfDouble")
    private static final double sumOfDouble(char[] cArr, Function1<? super Character, Double> selector) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        double dDoubleValue = 0.0d;
        for (char c10 : cArr) {
            dDoubleValue += selector.invoke(Character.valueOf(c10)).doubleValue();
        }
        return dDoubleValue;
    }

    @u0
    @e1(version = "1.4")
    @f
    @oj.i(name = "sumOfInt")
    private static final int sumOfInt(char[] cArr, Function1<? super Character, Integer> selector) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        int iIntValue = 0;
        for (char c10 : cArr) {
            iIntValue += selector.invoke(Character.valueOf(c10)).intValue();
        }
        return iIntValue;
    }

    @u0
    @e1(version = "1.4")
    @f
    @oj.i(name = "sumOfLong")
    private static final long sumOfLong(char[] cArr, Function1<? super Character, Long> selector) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        long jLongValue = 0;
        for (char c10 : cArr) {
            jLongValue += selector.invoke(Character.valueOf(c10)).longValue();
        }
        return jLongValue;
    }

    @NotNull
    public static final List<Long> takeLastWhile(@NotNull long[] jArr, @NotNull Function1<? super Long, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (int lastIndex = getLastIndex(jArr); -1 < lastIndex; lastIndex--) {
            if (!predicate.invoke(Long.valueOf(jArr[lastIndex])).booleanValue()) {
                return drop(jArr, lastIndex + 1);
            }
        }
        return toList(jArr);
    }

    @NotNull
    public static final List<Long> takeWhile(@NotNull long[] jArr, @NotNull Function1<? super Long, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (long j10 : jArr) {
            if (!predicate.invoke(Long.valueOf(j10)).booleanValue()) {
                break;
            }
            arrayList.add(Long.valueOf(j10));
        }
        return arrayList;
    }

    @NotNull
    public static final <C extends Collection<? super Character>> C toCollection(@NotNull char[] cArr, @NotNull C destination) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        for (char c10 : cArr) {
            destination.add(Character.valueOf(c10));
        }
        return destination;
    }

    @NotNull
    public static List<Long> toList(@NotNull long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        int length = jArr.length;
        if (length == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        if (length != 1) {
            return toMutableList(jArr);
        }
        return CollectionsKt__CollectionsJVMKt.listOf(Long.valueOf(jArr[0]));
    }

    @NotNull
    public static final Set<Long> toSet(@NotNull long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        int length = jArr.length;
        if (length != 0) {
            return length != 1 ? (Set) toCollection(jArr, new LinkedHashSet(MapsKt__MapsJVMKt.mapCapacity(jArr.length))) : SetsKt__SetsJVMKt.setOf(Long.valueOf(jArr[0]));
        }
        return SetsKt__SetsKt.emptySet();
    }

    @NotNull
    public static final Set<Character> union(@NotNull char[] cArr, @NotNull Iterable<Character> other) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Set<Character> mutableSet = toMutableSet(cArr);
        CollectionsKt__MutableCollectionsKt.addAll(mutableSet, other);
        return mutableSet;
    }

    public static final boolean any(@NotNull char[] cArr, @NotNull Function1<? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (char c10 : cArr) {
            if (predicate.invoke(Character.valueOf(c10)).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @e1(version = "1.4")
    @f
    private static final <V> Map<Character, V> associateWith(char[] cArr, Function1<? super Character, ? extends V> valueSelector) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(valueSelector, "valueSelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(r.u(MapsKt__MapsJVMKt.mapCapacity(r.B(cArr.length, 128)), 16));
        for (char c10 : cArr) {
            linkedHashMap.put(Character.valueOf(c10), valueSelector.invoke(Character.valueOf(c10)));
        }
        return linkedHashMap;
    }

    public static final int count(@NotNull char[] cArr, @NotNull Function1<? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int i10 = 0;
        for (char c10 : cArr) {
            if (predicate.invoke(Character.valueOf(c10)).booleanValue()) {
                i10++;
            }
        }
        return i10;
    }

    @Nullable
    public static final Character firstOrNull(@NotNull char[] cArr, @NotNull Function1<? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (char c10 : cArr) {
            if (predicate.invoke(Character.valueOf(c10)).booleanValue()) {
                return Character.valueOf(c10);
            }
        }
        return null;
    }

    @e1(version = "1.4")
    @Nullable
    public static final Byte maxOrNull(@NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        if (bArr.length == 0) {
            return null;
        }
        byte b10 = bArr[0];
        int lastIndex = getLastIndex(bArr);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                byte b11 = bArr[i10];
                if (b10 < b11) {
                    b10 = b11;
                }
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return Byte.valueOf(b10);
    }

    @e1(version = "1.4")
    @Nullable
    public static final Integer maxWithOrNull(@NotNull int[] iArr, @NotNull Comparator<? super Integer> comparator) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (iArr.length == 0) {
            return null;
        }
        int i10 = iArr[0];
        int lastIndex = getLastIndex(iArr);
        int i11 = 1;
        if (1 <= lastIndex) {
            while (true) {
                int i12 = iArr[i11];
                if (comparator.compare(Integer.valueOf(i10), Integer.valueOf(i12)) < 0) {
                    i10 = i12;
                }
                if (i11 == lastIndex) {
                    break;
                }
                i11++;
            }
        }
        return Integer.valueOf(i10);
    }

    @e1(version = "1.4")
    @Nullable
    public static final Byte minOrNull(@NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        if (bArr.length == 0) {
            return null;
        }
        byte b10 = bArr[0];
        int lastIndex = getLastIndex(bArr);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                byte b11 = bArr[i10];
                if (b10 > b11) {
                    b10 = b11;
                }
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return Byte.valueOf(b10);
    }

    @e1(version = "1.4")
    @Nullable
    public static final Integer minWithOrNull(@NotNull int[] iArr, @NotNull Comparator<? super Integer> comparator) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (iArr.length == 0) {
            return null;
        }
        int i10 = iArr[0];
        int lastIndex = getLastIndex(iArr);
        int i11 = 1;
        if (1 <= lastIndex) {
            while (true) {
                int i12 = iArr[i11];
                if (comparator.compare(Integer.valueOf(i10), Integer.valueOf(i12)) > 0) {
                    i10 = i12;
                }
                if (i11 == lastIndex) {
                    break;
                }
                i11++;
            }
        }
        return Integer.valueOf(i10);
    }

    public static final boolean none(@NotNull char[] cArr, @NotNull Function1<? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (char c10 : cArr) {
            if (predicate.invoke(Character.valueOf(c10)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @e1(version = "1.4")
    @Nullable
    public static final Long randomOrNull(@NotNull long[] jArr, @NotNull kotlin.random.f random) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        if (jArr.length == 0) {
            return null;
        }
        return Long.valueOf(jArr[random.m(jArr.length)]);
    }

    @Nullable
    public static final Integer singleOrNull(@NotNull int[] iArr, @NotNull Function1<? super Integer, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Integer numValueOf = null;
        boolean z10 = false;
        for (int i10 : iArr) {
            if (predicate.invoke(Integer.valueOf(i10)).booleanValue()) {
                if (z10) {
                    return null;
                }
                numValueOf = Integer.valueOf(i10);
                z10 = true;
            }
        }
        if (z10) {
            return numValueOf;
        }
        return null;
    }

    @NotNull
    public static final <T, K, V, M extends Map<? super K, ? super V>> M associateByTo(@NotNull T[] tArr, @NotNull M destination, @NotNull Function1<? super T, ? extends K> keySelector, @NotNull Function1<? super T, ? extends V> valueTransform) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        for (T t10 : tArr) {
            destination.put(keySelector.invoke(t10), valueTransform.invoke(t10));
        }
        return destination;
    }

    @NotNull
    public static final <K> List<Integer> distinctBy(@NotNull int[] iArr, @NotNull Function1<? super Integer, ? extends K> selector) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (int i10 : iArr) {
            if (hashSet.add(selector.invoke(Integer.valueOf(i10)))) {
                arrayList.add(Integer.valueOf(i10));
            }
        }
        return arrayList;
    }

    @NotNull
    public static final List<Double> filterIndexed(@NotNull double[] dArr, @NotNull Function2<? super Integer, ? super Double, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int length = dArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            double d10 = dArr[i10];
            int i12 = i11 + 1;
            if (predicate.invoke(Integer.valueOf(i11), Double.valueOf(d10)).booleanValue()) {
                arrayList.add(Double.valueOf(d10));
            }
            i10++;
            i11 = i12;
        }
        return arrayList;
    }

    @f
    private static final Double findLast(double[] dArr, Function1<? super Double, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = dArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i10 = length - 1;
                double d10 = dArr[length];
                if (predicate.invoke(Double.valueOf(d10)).booleanValue()) {
                    return Double.valueOf(d10);
                }
                if (i10 >= 0) {
                    length = i10;
                }
            }
        }
        return null;
    }

    public static final double first(@NotNull double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        if (dArr.length != 0) {
            return dArr[0];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @u0
    @e1(version = "1.4")
    @f
    @oj.i(name = "flatMapIndexedIterableTo")
    private static final <R, C extends Collection<? super R>> C flatMapIndexedIterableTo(double[] dArr, C destination, Function2<? super Integer, ? super Double, ? extends Iterable<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int length = dArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            CollectionsKt__MutableCollectionsKt.addAll(destination, transform.invoke(Integer.valueOf(i11), Double.valueOf(dArr[i10])));
            i10++;
            i11++;
        }
        return destination;
    }

    @NotNull
    public static final <R, C extends Collection<? super R>> C flatMapTo(@NotNull double[] dArr, @NotNull C destination, @NotNull Function1<? super Double, ? extends Iterable<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        for (double d10 : dArr) {
            CollectionsKt__MutableCollectionsKt.addAll(destination, transform.invoke(Double.valueOf(d10)));
        }
        return destination;
    }

    public static final int indexOf(@NotNull char[] cArr, char c10) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        int length = cArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (c10 == cArr[i10]) {
                return i10;
            }
        }
        return -1;
    }

    public static final double last(@NotNull double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        if (dArr.length != 0) {
            return dArr[getLastIndex(dArr)];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static final int lastIndexOf(@NotNull char[] cArr, char c10) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        int length = cArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i10 = length - 1;
                if (c10 == cArr[length]) {
                    return length;
                }
                if (i10 >= 0) {
                    length = i10;
                }
            }
        }
        return -1;
    }

    @Nullable
    public static final Integer lastOrNull(@NotNull int[] iArr, @NotNull Function1<? super Integer, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = iArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i10 = length - 1;
                int i11 = iArr[length];
                if (predicate.invoke(Integer.valueOf(i11)).booleanValue()) {
                    return Integer.valueOf(i11);
                }
                if (i10 >= 0) {
                    length = i10;
                }
            }
        }
        return null;
    }

    @NotNull
    public static final <R> List<R> map(@NotNull double[] dArr, @NotNull Function1<? super Double, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList(dArr.length);
        for (double d10 : dArr) {
            arrayList.add(transform.invoke(Double.valueOf(d10)));
        }
        return arrayList;
    }

    @NotNull
    public static final <R> List<R> mapIndexed(@NotNull double[] dArr, @NotNull Function2<? super Integer, ? super Double, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList(dArr.length);
        int length = dArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            arrayList.add(transform.invoke(Integer.valueOf(i11), Double.valueOf(dArr[i10])));
            i10++;
            i11++;
        }
        return arrayList;
    }

    @u0
    @e1(version = "1.4")
    @f
    private static final double maxOf(int[] iArr, Function1<? super Integer, Double> selector) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (iArr.length == 0) {
            throw new NoSuchElementException();
        }
        double dDoubleValue = selector.invoke(Integer.valueOf(iArr[0])).doubleValue();
        int lastIndex = getLastIndex(iArr);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                dDoubleValue = Math.max(dDoubleValue, selector.invoke(Integer.valueOf(iArr[i10])).doubleValue());
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return dDoubleValue;
    }

    @u0
    @e1(version = "1.4")
    @f
    /* JADX INFO: renamed from: maxOfOrNull, reason: collision with other method in class */
    private static final Double m809maxOfOrNull(int[] iArr, Function1<? super Integer, Double> selector) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (iArr.length == 0) {
            return null;
        }
        double dDoubleValue = selector.invoke(Integer.valueOf(iArr[0])).doubleValue();
        int lastIndex = getLastIndex(iArr);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                dDoubleValue = Math.max(dDoubleValue, selector.invoke(Integer.valueOf(iArr[i10])).doubleValue());
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return Double.valueOf(dDoubleValue);
    }

    @u0
    @e1(version = "1.4")
    @f
    private static final <R> R maxOfWith(int[] iArr, Comparator<? super R> comparator, Function1<? super Integer, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (iArr.length == 0) {
            throw new NoSuchElementException();
        }
        R rInvoke = selector.invoke(Integer.valueOf(iArr[0]));
        int lastIndex = getLastIndex(iArr);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                R rInvoke2 = selector.invoke(Integer.valueOf(iArr[i10]));
                if (comparator.compare(rInvoke, rInvoke2) < 0) {
                    rInvoke = rInvoke2;
                }
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return rInvoke;
    }

    @e1(version = "1.7")
    @oj.i(name = "maxOrThrow")
    public static final byte maxOrThrow(@NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        if (bArr.length != 0) {
            int i10 = 7 >> 0;
            byte b10 = bArr[0];
            int lastIndex = getLastIndex(bArr);
            int i11 = 1;
            if (1 <= lastIndex) {
                while (true) {
                    byte b11 = bArr[i11];
                    if (b10 < b11) {
                        b10 = b11;
                    }
                    if (i11 == lastIndex) {
                        break;
                    }
                    i11++;
                }
            }
            return b10;
        }
        throw new NoSuchElementException();
    }

    @e1(version = "1.7")
    @oj.i(name = "maxWithOrThrow")
    public static final int maxWithOrThrow(@NotNull int[] iArr, @NotNull Comparator<? super Integer> comparator) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (iArr.length != 0) {
            int i10 = iArr[0];
            int lastIndex = getLastIndex(iArr);
            int i11 = 1;
            if (1 <= lastIndex) {
                while (true) {
                    int i12 = iArr[i11];
                    if (comparator.compare(Integer.valueOf(i10), Integer.valueOf(i12)) < 0) {
                        i10 = i12;
                    }
                    if (i11 == lastIndex) {
                        break;
                    }
                    i11++;
                }
            }
            return i10;
        }
        throw new NoSuchElementException();
    }

    @u0
    @e1(version = "1.4")
    @f
    private static final double minOf(int[] iArr, Function1<? super Integer, Double> selector) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (iArr.length == 0) {
            throw new NoSuchElementException();
        }
        double dDoubleValue = selector.invoke(Integer.valueOf(iArr[0])).doubleValue();
        int lastIndex = getLastIndex(iArr);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                dDoubleValue = Math.min(dDoubleValue, selector.invoke(Integer.valueOf(iArr[i10])).doubleValue());
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return dDoubleValue;
    }

    @u0
    @e1(version = "1.4")
    @f
    /* JADX INFO: renamed from: minOfOrNull, reason: collision with other method in class */
    private static final Double m845minOfOrNull(int[] iArr, Function1<? super Integer, Double> selector) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (iArr.length == 0) {
            return null;
        }
        double dDoubleValue = selector.invoke(Integer.valueOf(iArr[0])).doubleValue();
        int lastIndex = getLastIndex(iArr);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                dDoubleValue = Math.min(dDoubleValue, selector.invoke(Integer.valueOf(iArr[i10])).doubleValue());
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return Double.valueOf(dDoubleValue);
    }

    @u0
    @e1(version = "1.4")
    @f
    private static final <R> R minOfWith(int[] iArr, Comparator<? super R> comparator, Function1<? super Integer, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (iArr.length != 0) {
            R rInvoke = selector.invoke(Integer.valueOf(iArr[0]));
            int lastIndex = getLastIndex(iArr);
            int i10 = 1;
            int i11 = 2 & 1;
            if (1 <= lastIndex) {
                while (true) {
                    R rInvoke2 = selector.invoke(Integer.valueOf(iArr[i10]));
                    if (comparator.compare(rInvoke, rInvoke2) > 0) {
                        rInvoke = rInvoke2;
                    }
                    if (i10 == lastIndex) {
                        break;
                    }
                    i10++;
                }
            }
            return rInvoke;
        }
        throw new NoSuchElementException();
    }

    @e1(version = "1.7")
    @oj.i(name = "minOrThrow")
    public static final byte minOrThrow(@NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        if (bArr.length == 0) {
            throw new NoSuchElementException();
        }
        byte b10 = bArr[0];
        int lastIndex = getLastIndex(bArr);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                byte b11 = bArr[i10];
                if (b10 > b11) {
                    b10 = b11;
                }
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return b10;
    }

    @e1(version = "1.7")
    @oj.i(name = "minWithOrThrow")
    public static final int minWithOrThrow(@NotNull int[] iArr, @NotNull Comparator<? super Integer> comparator) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (iArr.length != 0) {
            int i10 = iArr[0];
            int lastIndex = getLastIndex(iArr);
            int i11 = 1;
            if (1 <= lastIndex) {
                while (true) {
                    int i12 = iArr[i11];
                    if (comparator.compare(Integer.valueOf(i10), Integer.valueOf(i12)) > 0) {
                        i10 = i12;
                    }
                    if (i11 == lastIndex) {
                        break;
                    }
                    i11++;
                }
            }
            return i10;
        }
        throw new NoSuchElementException();
    }

    @e1(version = "1.3")
    public static final int random(@NotNull int[] iArr, @NotNull kotlin.random.f random) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        if (iArr.length != 0) {
            return iArr[random.m(iArr.length)];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @NotNull
    public static final List<Double> reversed(@NotNull double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        if (dArr.length == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        List<Double> mutableList = toMutableList(dArr);
        CollectionsKt___CollectionsJvmKt.reverse(mutableList);
        return mutableList;
    }

    @e1(version = "1.4")
    @f
    private static final List<Integer> runningReduce(int[] iArr, Function2<? super Integer, ? super Integer, Integer> operation) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (iArr.length == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        int iIntValue = iArr[0];
        ArrayList arrayList = new ArrayList(iArr.length);
        arrayList.add(Integer.valueOf(iIntValue));
        int length = iArr.length;
        for (int i10 = 1; i10 < length; i10++) {
            iIntValue = operation.invoke(Integer.valueOf(iIntValue), Integer.valueOf(iArr[i10])).intValue();
            arrayList.add(Integer.valueOf(iIntValue));
        }
        return arrayList;
    }

    @e1(version = "1.4")
    @f
    private static final List<Integer> runningReduceIndexed(int[] iArr, n<? super Integer, ? super Integer, ? super Integer, Integer> operation) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (iArr.length == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        int iIntValue = iArr[0];
        ArrayList arrayList = new ArrayList(iArr.length);
        arrayList.add(Integer.valueOf(iIntValue));
        int length = iArr.length;
        for (int i10 = 1; i10 < length; i10++) {
            iIntValue = operation.invoke(Integer.valueOf(i10), Integer.valueOf(iIntValue), Integer.valueOf(iArr[i10])).intValue();
            arrayList.add(Integer.valueOf(iIntValue));
        }
        return arrayList;
    }

    @NotNull
    public static final <T> List<T> slice(@NotNull T[] tArr, @NotNull Iterable<Integer> indices) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(indices, "indices");
        int iCollectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(indices, 10);
        if (iCollectionSizeOrDefault == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList(iCollectionSizeOrDefault);
        Iterator<Integer> it = indices.iterator();
        while (it.hasNext()) {
            arrayList.add(tArr[it.next().intValue()]);
        }
        return arrayList;
    }

    @NotNull
    public static final double[] sliceArray(@NotNull double[] dArr, @NotNull Collection<Integer> indices) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(indices, "indices");
        double[] dArr2 = new double[indices.size()];
        Iterator<Integer> it = indices.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            dArr2[i10] = dArr[it.next().intValue()];
            i10++;
        }
        return dArr2;
    }

    @oj.i(name = "sumOfDouble")
    public static final double sumOfDouble(@NotNull Double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        double dDoubleValue = 0.0d;
        for (Double d10 : dArr) {
            dDoubleValue += d10.doubleValue();
        }
        return dDoubleValue;
    }

    @oj.i(name = "sumOfInt")
    public static final int sumOfInt(@NotNull Integer[] numArr) {
        Intrinsics.checkNotNullParameter(numArr, "<this>");
        int iIntValue = 0;
        for (Integer num : numArr) {
            iIntValue += num.intValue();
        }
        return iIntValue;
    }

    @oj.i(name = "sumOfLong")
    public static final long sumOfLong(@NotNull Long[] lArr) {
        Intrinsics.checkNotNullParameter(lArr, "<this>");
        long jLongValue = 0;
        for (Long l10 : lArr) {
            jLongValue += l10.longValue();
        }
        return jLongValue;
    }

    @u0
    @m2(markerClass = {u.class})
    @e1(version = "1.5")
    @f
    @oj.i(name = "sumOfUInt")
    private static final int sumOfUInt(double[] dArr, Function1<? super Double, u1> selector) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        int iN = u1.n(0);
        for (double d10 : dArr) {
            iN = u1.n(iN + selector.invoke(Double.valueOf(d10)).z0());
        }
        return iN;
    }

    @u0
    @m2(markerClass = {u.class})
    @e1(version = "1.5")
    @f
    @oj.i(name = "sumOfULong")
    private static final long sumOfULong(double[] dArr, Function1<? super Double, y1> selector) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        long jN = y1.n(0L);
        for (double d10 : dArr) {
            jN = y1.n(jN + selector.invoke(Double.valueOf(d10)).z0());
        }
        return jN;
    }

    @NotNull
    public static final <R, V> List<V> zip(@NotNull double[] dArr, @NotNull R[] other, @NotNull Function2<? super Double, ? super R, ? extends V> transform) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int iMin = Math.min(dArr.length, other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i10 = 0; i10 < iMin; i10++) {
            arrayList.add(transform.invoke(Double.valueOf(dArr[i10]), other[i10]));
        }
        return arrayList;
    }

    @e1(version = "1.4")
    @Nullable
    public static final Float randomOrNull(@NotNull float[] fArr, @NotNull kotlin.random.f random) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        if (fArr.length == 0) {
            return null;
        }
        return Float.valueOf(fArr[random.m(fArr.length)]);
    }

    @e1(version = "1.4")
    @Nullable
    public static final Long reduceIndexedOrNull(@NotNull long[] jArr, @NotNull n<? super Integer, ? super Long, ? super Long, Long> operation) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (jArr.length == 0) {
            return null;
        }
        long jLongValue = jArr[0];
        int lastIndex = getLastIndex(jArr);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                jLongValue = operation.invoke(Integer.valueOf(i10), Long.valueOf(jLongValue), Long.valueOf(jArr[i10])).longValue();
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return Long.valueOf(jLongValue);
    }

    @e1(version = "1.4")
    @Nullable
    public static final Long reduceOrNull(@NotNull long[] jArr, @NotNull Function2<? super Long, ? super Long, Long> operation) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (jArr.length == 0) {
            return null;
        }
        long jLongValue = jArr[0];
        int lastIndex = getLastIndex(jArr);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                jLongValue = operation.invoke(Long.valueOf(jLongValue), Long.valueOf(jArr[i10])).longValue();
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return Long.valueOf(jLongValue);
    }

    @e1(version = "1.4")
    @Nullable
    public static final Float reduceRightIndexedOrNull(@NotNull float[] fArr, @NotNull n<? super Integer, ? super Float, ? super Float, Float> operation) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int lastIndex = getLastIndex(fArr);
        if (lastIndex < 0) {
            return null;
        }
        float fFloatValue = fArr[lastIndex];
        for (int i10 = lastIndex - 1; i10 >= 0; i10--) {
            fFloatValue = operation.invoke(Integer.valueOf(i10), Float.valueOf(fArr[i10]), Float.valueOf(fFloatValue)).floatValue();
        }
        return Float.valueOf(fFloatValue);
    }

    @e1(version = "1.4")
    @Nullable
    public static final Float reduceRightOrNull(@NotNull float[] fArr, @NotNull Function2<? super Float, ? super Float, Float> operation) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int lastIndex = getLastIndex(fArr);
        if (lastIndex < 0) {
            return null;
        }
        float fFloatValue = fArr[lastIndex];
        for (int i10 = lastIndex - 1; i10 >= 0; i10--) {
            fFloatValue = operation.invoke(Float.valueOf(fArr[i10]), Float.valueOf(fFloatValue)).floatValue();
        }
        return Float.valueOf(fFloatValue);
    }

    @e1(version = "1.4")
    public static final void shuffle(@NotNull short[] sArr, @NotNull kotlin.random.f random) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        for (int lastIndex = getLastIndex(sArr); lastIndex > 0; lastIndex--) {
            int iM = random.m(lastIndex + 1);
            short s10 = sArr[lastIndex];
            sArr[lastIndex] = sArr[iM];
            sArr[iM] = s10;
        }
    }

    public static final void sortDescending(@NotNull char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        if (cArr.length > 1) {
            ArraysKt___ArraysJvmKt.sort(cArr);
            reverse(cArr);
        }
    }

    @NotNull
    public static final <K, V> Map<K, V> associate(@NotNull float[] fArr, @NotNull Function1<? super Float, ? extends Pair<? extends K, ? extends V>> transform) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(r.u(MapsKt__MapsJVMKt.mapCapacity(fArr.length), 16));
        for (float f10 : fArr) {
            Pair<? extends K, ? extends V> pairInvoke = transform.invoke(Float.valueOf(f10));
            linkedHashMap.put(pairInvoke.getFirst(), pairInvoke.getSecond());
        }
        return linkedHashMap;
    }

    @NotNull
    public static final <K> Map<K, Float> associateBy(@NotNull float[] fArr, @NotNull Function1<? super Float, ? extends K> keySelector) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(r.u(MapsKt__MapsJVMKt.mapCapacity(fArr.length), 16));
        for (float f10 : fArr) {
            linkedHashMap.put(keySelector.invoke(Float.valueOf(f10)), Float.valueOf(f10));
        }
        return linkedHashMap;
    }

    @NotNull
    public static final <K, V, M extends Map<? super K, ? super V>> M associateByTo(@NotNull byte[] bArr, @NotNull M destination, @NotNull Function1<? super Byte, ? extends K> keySelector, @NotNull Function1<? super Byte, ? extends V> valueTransform) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        for (byte b10 : bArr) {
            destination.put(keySelector.invoke(Byte.valueOf(b10)), valueTransform.invoke(Byte.valueOf(b10)));
        }
        return destination;
    }

    @NotNull
    public static final List<Float> dropLastWhile(@NotNull float[] fArr, @NotNull Function1<? super Float, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (int lastIndex = getLastIndex(fArr); -1 < lastIndex; lastIndex--) {
            if (!predicate.invoke(Float.valueOf(fArr[lastIndex])).booleanValue()) {
                return take(fArr, lastIndex + 1);
            }
        }
        return CollectionsKt__CollectionsKt.emptyList();
    }

    @NotNull
    public static final List<Long> dropWhile(@NotNull long[] jArr, @NotNull Function1<? super Long, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        boolean z10 = false;
        for (long j10 : jArr) {
            if (z10) {
                arrayList.add(Long.valueOf(j10));
            } else if (!predicate.invoke(Long.valueOf(j10)).booleanValue()) {
                arrayList.add(Long.valueOf(j10));
                z10 = true;
            }
        }
        return arrayList;
    }

    @NotNull
    public static final <R> List<R> flatMap(@NotNull float[] fArr, @NotNull Function1<? super Float, ? extends Iterable<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList();
        for (float f10 : fArr) {
            CollectionsKt__MutableCollectionsKt.addAll(arrayList, transform.invoke(Float.valueOf(f10)));
        }
        return arrayList;
    }

    @NotNull
    public static final <A extends Appendable> A joinTo(@NotNull int[] iArr, @NotNull A buffer, @NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence postfix, int i10, @NotNull CharSequence truncated, @Nullable Function1<? super Integer, ? extends CharSequence> function1) throws IOException {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(truncated, "truncated");
        buffer.append(prefix);
        int i11 = 0;
        for (int i12 : iArr) {
            i11++;
            if (i11 > 1) {
                buffer.append(separator);
            }
            if (i10 >= 0 && i11 > i10) {
                break;
            }
            if (function1 != null) {
                buffer.append(function1.invoke(Integer.valueOf(i12)));
            } else {
                buffer.append(String.valueOf(i12));
            }
        }
        if (i10 >= 0 && i11 > i10) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    @u0
    @e1(version = "1.4")
    @f
    private static final <R> R maxOfWithOrNull(long[] jArr, Comparator<? super R> comparator, Function1<? super Long, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (jArr.length == 0) {
            return null;
        }
        R rInvoke = selector.invoke(Long.valueOf(jArr[0]));
        int lastIndex = getLastIndex(jArr);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                R rInvoke2 = selector.invoke(Long.valueOf(jArr[i10]));
                if (comparator.compare(rInvoke, rInvoke2) < 0) {
                    rInvoke = rInvoke2;
                }
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return rInvoke;
    }

    @u0
    @e1(version = "1.4")
    @f
    private static final <R> R minOfWithOrNull(long[] jArr, Comparator<? super R> comparator, Function1<? super Long, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (jArr.length == 0) {
            return null;
        }
        R rInvoke = selector.invoke(Long.valueOf(jArr[0]));
        int lastIndex = getLastIndex(jArr);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                R rInvoke2 = selector.invoke(Long.valueOf(jArr[i10]));
                if (comparator.compare(rInvoke, rInvoke2) > 0) {
                    rInvoke = rInvoke2;
                }
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return rInvoke;
    }

    public static final long reduce(@NotNull long[] jArr, @NotNull Function2<? super Long, ? super Long, Long> operation) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (jArr.length != 0) {
            long jLongValue = jArr[0];
            int lastIndex = getLastIndex(jArr);
            int i10 = 1;
            if (1 <= lastIndex) {
                while (true) {
                    jLongValue = operation.invoke(Long.valueOf(jLongValue), Long.valueOf(jArr[i10])).longValue();
                    if (i10 == lastIndex) {
                        break;
                    }
                    i10++;
                }
            }
            return jLongValue;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    public static final long reduceIndexed(@NotNull long[] jArr, @NotNull n<? super Integer, ? super Long, ? super Long, Long> operation) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (jArr.length == 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        long jLongValue = jArr[0];
        int lastIndex = getLastIndex(jArr);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                jLongValue = operation.invoke(Integer.valueOf(i10), Long.valueOf(jLongValue), Long.valueOf(jArr[i10])).longValue();
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return jLongValue;
    }

    public static final float reduceRight(@NotNull float[] fArr, @NotNull Function2<? super Float, ? super Float, Float> operation) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int lastIndex = getLastIndex(fArr);
        if (lastIndex < 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        float fFloatValue = fArr[lastIndex];
        for (int i10 = lastIndex - 1; i10 >= 0; i10--) {
            fFloatValue = operation.invoke(Float.valueOf(fArr[i10]), Float.valueOf(fFloatValue)).floatValue();
        }
        return fFloatValue;
    }

    public static final float reduceRightIndexed(@NotNull float[] fArr, @NotNull n<? super Integer, ? super Float, ? super Float, Float> operation) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int lastIndex = getLastIndex(fArr);
        if (lastIndex < 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        float fFloatValue = fArr[lastIndex];
        for (int i10 = lastIndex - 1; i10 >= 0; i10--) {
            fFloatValue = operation.invoke(Integer.valueOf(i10), Float.valueOf(fArr[i10]), Float.valueOf(fFloatValue)).floatValue();
        }
        return fFloatValue;
    }

    public static void reverse(@NotNull long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        int length = (jArr.length / 2) - 1;
        if (length < 0) {
            return;
        }
        int lastIndex = getLastIndex(jArr);
        if (length < 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            long j10 = jArr[i10];
            jArr[i10] = jArr[lastIndex];
            jArr[lastIndex] = j10;
            lastIndex--;
            if (i10 == length) {
                return;
            } else {
                i10++;
            }
        }
    }

    @NotNull
    public static final float[] reversedArray(@NotNull float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        if (fArr.length == 0) {
            return fArr;
        }
        float[] fArr2 = new float[fArr.length];
        int lastIndex = getLastIndex(fArr);
        if (lastIndex >= 0) {
            int i10 = 0;
            while (true) {
                fArr2[lastIndex - i10] = fArr[i10];
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return fArr2;
    }

    @e1(version = "1.4")
    @f
    private static final <R> List<R> runningFold(long[] jArr, R r10, Function2<? super R, ? super Long, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (jArr.length == 0) {
            return CollectionsKt__CollectionsJVMKt.listOf(r10);
        }
        ArrayList arrayList = new ArrayList(jArr.length + 1);
        arrayList.add(r10);
        for (long j10 : jArr) {
            r10 = operation.invoke(r10, Long.valueOf(j10));
            arrayList.add(r10);
        }
        return arrayList;
    }

    @e1(version = "1.4")
    @f
    private static final <R> List<R> runningFoldIndexed(long[] jArr, R r10, n<? super Integer, ? super R, ? super Long, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (jArr.length == 0) {
            return CollectionsKt__CollectionsJVMKt.listOf(r10);
        }
        ArrayList arrayList = new ArrayList(jArr.length + 1);
        arrayList.add(r10);
        int length = jArr.length;
        boolean z10 = false | false;
        for (int i10 = 0; i10 < length; i10++) {
            r10 = operation.invoke(Integer.valueOf(i10), r10, Long.valueOf(jArr[i10]));
            arrayList.add(r10);
        }
        return arrayList;
    }

    public static final float single(@NotNull float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        int length = fArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        if (length == 1) {
            return fArr[0];
        }
        throw new IllegalArgumentException("Array has more than one element.");
    }

    @Nullable
    public static final Long singleOrNull(@NotNull long[] jArr, @NotNull Function1<? super Long, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Long lValueOf = null;
        boolean z10 = false;
        for (long j10 : jArr) {
            if (predicate.invoke(Long.valueOf(j10)).booleanValue()) {
                if (z10) {
                    return null;
                }
                lValueOf = Long.valueOf(j10);
                z10 = true;
            }
        }
        if (z10) {
            return lValueOf;
        }
        return null;
    }

    @NotNull
    public static final List<Float> takeLastWhile(@NotNull float[] fArr, @NotNull Function1<? super Float, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (int lastIndex = getLastIndex(fArr); -1 < lastIndex; lastIndex--) {
            if (!predicate.invoke(Float.valueOf(fArr[lastIndex])).booleanValue()) {
                return drop(fArr, lastIndex + 1);
            }
        }
        return toList(fArr);
    }

    @NotNull
    public static final List<Float> takeWhile(@NotNull float[] fArr, @NotNull Function1<? super Float, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (float f10 : fArr) {
            if (!predicate.invoke(Float.valueOf(f10)).booleanValue()) {
                break;
            }
            arrayList.add(Float.valueOf(f10));
        }
        return arrayList;
    }

    @NotNull
    public static List<Float> toList(@NotNull float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        int length = fArr.length;
        if (length != 0) {
            return length != 1 ? toMutableList(fArr) : CollectionsKt__CollectionsJVMKt.listOf(Float.valueOf(fArr[0]));
        }
        return CollectionsKt__CollectionsKt.emptyList();
    }

    @NotNull
    public static final Set<Float> toSet(@NotNull float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        int length = fArr.length;
        if (length != 0) {
            return length != 1 ? (Set) toCollection(fArr, new LinkedHashSet(MapsKt__MapsJVMKt.mapCapacity(fArr.length))) : SetsKt__SetsJVMKt.setOf(Float.valueOf(fArr[0]));
        }
        return SetsKt__SetsKt.emptySet();
    }

    @NotNull
    public static final List<Boolean> filterIndexed(@NotNull boolean[] zArr, @NotNull Function2<? super Integer, ? super Boolean, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int length = zArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            boolean z10 = zArr[i10];
            int i12 = i11 + 1;
            if (predicate.invoke(Integer.valueOf(i11), Boolean.valueOf(z10)).booleanValue()) {
                arrayList.add(Boolean.valueOf(z10));
            }
            i10++;
            i11 = i12;
        }
        return arrayList;
    }

    @f
    private static final Boolean findLast(boolean[] zArr, Function1<? super Boolean, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = zArr.length - 1;
        if (length < 0) {
            return null;
        }
        while (true) {
            int i10 = length - 1;
            boolean z10 = zArr[length];
            if (predicate.invoke(Boolean.valueOf(z10)).booleanValue()) {
                return Boolean.valueOf(z10);
            }
            if (i10 < 0) {
                return null;
            }
            length = i10;
        }
    }

    public static final boolean first(@NotNull boolean[] zArr) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        if (zArr.length != 0) {
            return zArr[0];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @u0
    @e1(version = "1.4")
    @f
    @oj.i(name = "flatMapIndexedIterableTo")
    private static final <R, C extends Collection<? super R>> C flatMapIndexedIterableTo(boolean[] zArr, C destination, Function2<? super Integer, ? super Boolean, ? extends Iterable<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int length = zArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            CollectionsKt__MutableCollectionsKt.addAll(destination, transform.invoke(Integer.valueOf(i11), Boolean.valueOf(zArr[i10])));
            i10++;
            i11++;
        }
        return destination;
    }

    @NotNull
    public static final <R, C extends Collection<? super R>> C flatMapTo(@NotNull boolean[] zArr, @NotNull C destination, @NotNull Function1<? super Boolean, ? extends Iterable<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        for (boolean z10 : zArr) {
            CollectionsKt__MutableCollectionsKt.addAll(destination, transform.invoke(Boolean.valueOf(z10)));
        }
        return destination;
    }

    @NotNull
    public static final <K, M extends Map<? super K, List<Integer>>> M groupByTo(@NotNull int[] iArr, @NotNull M destination, @NotNull Function1<? super Integer, ? extends K> keySelector) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        boolean z10 = true & false;
        for (int i10 : iArr) {
            K kInvoke = keySelector.invoke(Integer.valueOf(i10));
            Object arrayList = destination.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                destination.put(kInvoke, arrayList);
            }
            ((List) arrayList).add(Integer.valueOf(i10));
        }
        return destination;
    }

    public static final boolean last(@NotNull boolean[] zArr) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        if (zArr.length != 0) {
            return zArr[getLastIndex(zArr)];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @Nullable
    public static final Long lastOrNull(@NotNull long[] jArr, @NotNull Function1<? super Long, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = jArr.length - 1;
        if (length < 0) {
            return null;
        }
        while (true) {
            int i10 = length - 1;
            long j10 = jArr[length];
            if (predicate.invoke(Long.valueOf(j10)).booleanValue()) {
                return Long.valueOf(j10);
            }
            if (i10 < 0) {
                return null;
            }
            length = i10;
        }
    }

    @NotNull
    public static final <R> List<R> map(@NotNull boolean[] zArr, @NotNull Function1<? super Boolean, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList(zArr.length);
        for (boolean z10 : zArr) {
            arrayList.add(transform.invoke(Boolean.valueOf(z10)));
        }
        return arrayList;
    }

    @NotNull
    public static final <R> List<R> mapIndexed(@NotNull boolean[] zArr, @NotNull Function2<? super Integer, ? super Boolean, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList(zArr.length);
        int length = zArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            arrayList.add(transform.invoke(Integer.valueOf(i11), Boolean.valueOf(zArr[i10])));
            i10++;
            i11++;
        }
        return arrayList;
    }

    @NotNull
    public static final Pair<List<Integer>, List<Integer>> partition(@NotNull int[] iArr, @NotNull Function1<? super Integer, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i10 : iArr) {
            if (predicate.invoke(Integer.valueOf(i10)).booleanValue()) {
                arrayList.add(Integer.valueOf(i10));
            } else {
                arrayList2.add(Integer.valueOf(i10));
            }
        }
        return new Pair<>(arrayList, arrayList2);
    }

    @e1(version = "1.3")
    public static final long random(@NotNull long[] jArr, @NotNull kotlin.random.f random) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        if (jArr.length != 0) {
            return jArr[random.m(jArr.length)];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @e1(version = "1.4")
    @Nullable
    public static final Double randomOrNull(@NotNull double[] dArr, @NotNull kotlin.random.f random) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        if (dArr.length == 0) {
            return null;
        }
        return Double.valueOf(dArr[random.m(dArr.length)]);
    }

    @NotNull
    public static final List<Boolean> reversed(@NotNull boolean[] zArr) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        if (zArr.length == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        List<Boolean> mutableList = toMutableList(zArr);
        CollectionsKt___CollectionsJvmKt.reverse(mutableList);
        return mutableList;
    }

    @NotNull
    public static final boolean[] sliceArray(@NotNull boolean[] zArr, @NotNull Collection<Integer> indices) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(indices, "indices");
        boolean[] zArr2 = new boolean[indices.size()];
        Iterator<Integer> it = indices.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            zArr2[i10] = zArr[it.next().intValue()];
            i10++;
        }
        return zArr2;
    }

    @u0
    @m2(markerClass = {u.class})
    @e1(version = "1.5")
    @f
    @oj.i(name = "sumOfUInt")
    private static final int sumOfUInt(boolean[] zArr, Function1<? super Boolean, u1> selector) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        int iN = u1.n(0);
        for (boolean z10 : zArr) {
            iN = u1.n(iN + selector.invoke(Boolean.valueOf(z10)).z0());
        }
        return iN;
    }

    @u0
    @m2(markerClass = {u.class})
    @e1(version = "1.5")
    @f
    @oj.i(name = "sumOfULong")
    private static final long sumOfULong(boolean[] zArr, Function1<? super Boolean, y1> selector) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        long jN = y1.n(0L);
        for (boolean z10 : zArr) {
            jN = y1.n(jN + selector.invoke(Boolean.valueOf(z10)).z0());
        }
        return jN;
    }

    @NotNull
    public static List<Integer> take(@NotNull int[] iArr, int i10) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
        }
        if (i10 == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        if (i10 >= iArr.length) {
            return toList(iArr);
        }
        if (i10 == 1) {
            return CollectionsKt__CollectionsJVMKt.listOf(Integer.valueOf(iArr[0]));
        }
        ArrayList arrayList = new ArrayList(i10);
        int i11 = 0;
        for (int i12 : iArr) {
            arrayList.add(Integer.valueOf(i12));
            i11++;
            if (i11 == i10) {
                break;
            }
        }
        return arrayList;
    }

    @NotNull
    public static final List<Integer> takeLast(@NotNull int[] iArr, int i10) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
        }
        if (i10 == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        int length = iArr.length;
        if (i10 >= length) {
            return toList(iArr);
        }
        if (i10 == 1) {
            return CollectionsKt__CollectionsJVMKt.listOf(Integer.valueOf(iArr[length - 1]));
        }
        ArrayList arrayList = new ArrayList(i10);
        for (int i11 = length - i10; i11 < length; i11++) {
            arrayList.add(Integer.valueOf(iArr[i11]));
        }
        return arrayList;
    }

    @NotNull
    public static final <R, V> List<V> zip(@NotNull boolean[] zArr, @NotNull R[] other, @NotNull Function2<? super Boolean, ? super R, ? extends V> transform) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int iMin = Math.min(zArr.length, other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i10 = 0; i10 < iMin; i10++) {
            arrayList.add(transform.invoke(Boolean.valueOf(zArr[i10]), other[i10]));
        }
        return arrayList;
    }

    @NotNull
    public static final <K, V, M extends Map<? super K, ? super V>> M associateByTo(@NotNull short[] sArr, @NotNull M destination, @NotNull Function1<? super Short, ? extends K> keySelector, @NotNull Function1<? super Short, ? extends V> valueTransform) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        for (short s10 : sArr) {
            destination.put(keySelector.invoke(Short.valueOf(s10)), valueTransform.invoke(Short.valueOf(s10)));
        }
        return destination;
    }

    @e1(version = "1.4")
    @Nullable
    public static final Short maxOrNull(@NotNull short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        if (sArr.length == 0) {
            return null;
        }
        short s10 = sArr[0];
        int lastIndex = getLastIndex(sArr);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                short s11 = sArr[i10];
                if (s10 < s11) {
                    s10 = s11;
                }
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return Short.valueOf(s10);
    }

    @e1(version = "1.4")
    @Nullable
    public static final Short minOrNull(@NotNull short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        if (sArr.length == 0) {
            return null;
        }
        short s10 = sArr[0];
        int lastIndex = getLastIndex(sArr);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                short s11 = sArr[i10];
                if (s10 > s11) {
                    s10 = s11;
                }
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return Short.valueOf(s10);
    }

    @e1(version = "1.4")
    public static final <T extends Comparable<? super T>> void sortDescending(@NotNull T[] tArr, int i10, int i11) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        ArraysKt___ArraysJvmKt.sortWith(tArr, a.x(), i10, i11);
    }

    @e1(version = "1.7")
    @oj.i(name = "maxOrThrow")
    public static final short maxOrThrow(@NotNull short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        if (sArr.length == 0) {
            throw new NoSuchElementException();
        }
        short s10 = sArr[0];
        int lastIndex = getLastIndex(sArr);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                short s11 = sArr[i10];
                if (s10 < s11) {
                    s10 = s11;
                }
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return s10;
    }

    @e1(version = "1.4")
    @Nullable
    public static final Long maxWithOrNull(@NotNull long[] jArr, @NotNull Comparator<? super Long> comparator) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (jArr.length == 0) {
            return null;
        }
        long j10 = jArr[0];
        int lastIndex = getLastIndex(jArr);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                long j11 = jArr[i10];
                if (comparator.compare(Long.valueOf(j10), Long.valueOf(j11)) < 0) {
                    j10 = j11;
                }
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return Long.valueOf(j10);
    }

    @e1(version = "1.7")
    @oj.i(name = "minOrThrow")
    public static final short minOrThrow(@NotNull short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        if (sArr.length != 0) {
            short s10 = sArr[0];
            int lastIndex = getLastIndex(sArr);
            int i10 = 1;
            if (1 <= lastIndex) {
                while (true) {
                    short s11 = sArr[i10];
                    if (s10 > s11) {
                        s10 = s11;
                    }
                    if (i10 == lastIndex) {
                        break;
                    }
                    i10++;
                }
            }
            return s10;
        }
        throw new NoSuchElementException();
    }

    @e1(version = "1.4")
    @Nullable
    public static final Long minWithOrNull(@NotNull long[] jArr, @NotNull Comparator<? super Long> comparator) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (jArr.length == 0) {
            return null;
        }
        long j10 = jArr[0];
        int lastIndex = getLastIndex(jArr);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                long j11 = jArr[i10];
                if (comparator.compare(Long.valueOf(j10), Long.valueOf(j11)) > 0) {
                    j10 = j11;
                }
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return Long.valueOf(j10);
    }

    @e1(version = "1.4")
    @Nullable
    public static final Boolean randomOrNull(@NotNull boolean[] zArr, @NotNull kotlin.random.f random) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        if (zArr.length == 0) {
            return null;
        }
        return Boolean.valueOf(zArr[random.m(zArr.length)]);
    }

    @e1(version = "1.4")
    @Nullable
    public static final Double reduceRightIndexedOrNull(@NotNull double[] dArr, @NotNull n<? super Integer, ? super Double, ? super Double, Double> operation) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int lastIndex = getLastIndex(dArr);
        if (lastIndex < 0) {
            return null;
        }
        double dDoubleValue = dArr[lastIndex];
        for (int i10 = lastIndex - 1; i10 >= 0; i10--) {
            dDoubleValue = operation.invoke(Integer.valueOf(i10), Double.valueOf(dArr[i10]), Double.valueOf(dDoubleValue)).doubleValue();
        }
        return Double.valueOf(dDoubleValue);
    }

    @e1(version = "1.4")
    @Nullable
    public static final Double reduceRightOrNull(@NotNull double[] dArr, @NotNull Function2<? super Double, ? super Double, Double> operation) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int lastIndex = getLastIndex(dArr);
        if (lastIndex < 0) {
            return null;
        }
        double dDoubleValue = dArr[lastIndex];
        for (int i10 = lastIndex - 1; i10 >= 0; i10--) {
            dDoubleValue = operation.invoke(Double.valueOf(dArr[i10]), Double.valueOf(dDoubleValue)).doubleValue();
        }
        return Double.valueOf(dDoubleValue);
    }

    @Nullable
    public static final Float singleOrNull(@NotNull float[] fArr, @NotNull Function1<? super Float, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Float fValueOf = null;
        boolean z10 = false;
        for (float f10 : fArr) {
            if (predicate.invoke(Float.valueOf(f10)).booleanValue()) {
                if (z10) {
                    return null;
                }
                fValueOf = Float.valueOf(f10);
                z10 = true;
            }
        }
        if (z10) {
            return fValueOf;
        }
        return null;
    }

    @NotNull
    public static final List<Byte> slice(@NotNull byte[] bArr, @NotNull Iterable<Integer> indices) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(indices, "indices");
        int iCollectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(indices, 10);
        if (iCollectionSizeOrDefault == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList(iCollectionSizeOrDefault);
        Iterator<Integer> it = indices.iterator();
        while (it.hasNext()) {
            arrayList.add(Byte.valueOf(bArr[it.next().intValue()]));
        }
        return arrayList;
    }

    @e1(version = "1.4")
    public static final void sortDescending(@NotNull byte[] bArr, int i10, int i11) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        ArraysKt___ArraysJvmKt.sort(bArr, i10, i11);
        reverse(bArr, i10, i11);
    }

    @NotNull
    public static final <K, V> Map<K, V> associate(@NotNull double[] dArr, @NotNull Function1<? super Double, ? extends Pair<? extends K, ? extends V>> transform) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(r.u(MapsKt__MapsJVMKt.mapCapacity(dArr.length), 16));
        for (double d10 : dArr) {
            Pair<? extends K, ? extends V> pairInvoke = transform.invoke(Double.valueOf(d10));
            linkedHashMap.put(pairInvoke.getFirst(), pairInvoke.getSecond());
        }
        return linkedHashMap;
    }

    @NotNull
    public static final <K> Map<K, Double> associateBy(@NotNull double[] dArr, @NotNull Function1<? super Double, ? extends K> keySelector) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(r.u(MapsKt__MapsJVMKt.mapCapacity(dArr.length), 16));
        for (double d10 : dArr) {
            linkedHashMap.put(keySelector.invoke(Double.valueOf(d10)), Double.valueOf(d10));
        }
        return linkedHashMap;
    }

    @NotNull
    public static final <K, V, M extends Map<? super K, ? super V>> M associateByTo(@NotNull int[] iArr, @NotNull M destination, @NotNull Function1<? super Integer, ? extends K> keySelector, @NotNull Function1<? super Integer, ? extends V> valueTransform) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        for (int i10 : iArr) {
            destination.put(keySelector.invoke(Integer.valueOf(i10)), valueTransform.invoke(Integer.valueOf(i10)));
        }
        return destination;
    }

    @NotNull
    public static final <K> List<Long> distinctBy(@NotNull long[] jArr, @NotNull Function1<? super Long, ? extends K> selector) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (long j10 : jArr) {
            if (hashSet.add(selector.invoke(Long.valueOf(j10)))) {
                arrayList.add(Long.valueOf(j10));
            }
        }
        return arrayList;
    }

    @NotNull
    public static final List<Double> dropLastWhile(@NotNull double[] dArr, @NotNull Function1<? super Double, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (int lastIndex = getLastIndex(dArr); -1 < lastIndex; lastIndex--) {
            if (!predicate.invoke(Double.valueOf(dArr[lastIndex])).booleanValue()) {
                return take(dArr, lastIndex + 1);
            }
        }
        return CollectionsKt__CollectionsKt.emptyList();
    }

    @NotNull
    public static final List<Character> filterIndexed(@NotNull char[] cArr, @NotNull Function2<? super Integer, ? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int length = cArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            char c10 = cArr[i10];
            int i12 = i11 + 1;
            if (predicate.invoke(Integer.valueOf(i11), Character.valueOf(c10)).booleanValue()) {
                arrayList.add(Character.valueOf(c10));
            }
            i10++;
            i11 = i12;
        }
        return arrayList;
    }

    @f
    private static final Character findLast(char[] cArr, Function1<? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = cArr.length - 1;
        if (length < 0) {
            return null;
        }
        while (true) {
            int i10 = length - 1;
            char c10 = cArr[length];
            if (predicate.invoke(Character.valueOf(c10)).booleanValue()) {
                return Character.valueOf(c10);
            }
            if (i10 < 0) {
                return null;
            }
            length = i10;
        }
    }

    public static final char first(@NotNull char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        if (cArr.length != 0) {
            return cArr[0];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @NotNull
    public static final <R> List<R> flatMap(@NotNull double[] dArr, @NotNull Function1<? super Double, ? extends Iterable<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList();
        for (double d10 : dArr) {
            CollectionsKt__MutableCollectionsKt.addAll(arrayList, transform.invoke(Double.valueOf(d10)));
        }
        return arrayList;
    }

    @u0
    @e1(version = "1.4")
    @f
    @oj.i(name = "flatMapIndexedIterableTo")
    private static final <R, C extends Collection<? super R>> C flatMapIndexedIterableTo(char[] cArr, C destination, Function2<? super Integer, ? super Character, ? extends Iterable<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int length = cArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            CollectionsKt__MutableCollectionsKt.addAll(destination, transform.invoke(Integer.valueOf(i11), Character.valueOf(cArr[i10])));
            i10++;
            i11++;
        }
        return destination;
    }

    @NotNull
    public static final <R, C extends Collection<? super R>> C flatMapTo(@NotNull char[] cArr, @NotNull C destination, @NotNull Function1<? super Character, ? extends Iterable<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(transform, "transform");
        for (char c10 : cArr) {
            CollectionsKt__MutableCollectionsKt.addAll(destination, transform.invoke(Character.valueOf(c10)));
        }
        return destination;
    }

    @NotNull
    public static final <K> Map<K, List<Integer>> groupBy(@NotNull int[] iArr, @NotNull Function1<? super Integer, ? extends K> keySelector) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (int i10 : iArr) {
            K kInvoke = keySelector.invoke(Integer.valueOf(i10));
            Object arrayList = linkedHashMap.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(kInvoke, arrayList);
            }
            ((List) arrayList).add(Integer.valueOf(i10));
        }
        return linkedHashMap;
    }

    public static final char last(@NotNull char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        if (cArr.length != 0) {
            return cArr[getLastIndex(cArr)];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @Nullable
    public static final Float lastOrNull(@NotNull float[] fArr, @NotNull Function1<? super Float, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = fArr.length - 1;
        if (length < 0) {
            return null;
        }
        while (true) {
            int i10 = length - 1;
            float f10 = fArr[length];
            if (predicate.invoke(Float.valueOf(f10)).booleanValue()) {
                return Float.valueOf(f10);
            }
            if (i10 < 0) {
                return null;
            }
            length = i10;
        }
    }

    @NotNull
    public static final <R> List<R> map(@NotNull char[] cArr, @NotNull Function1<? super Character, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList(cArr.length);
        for (char c10 : cArr) {
            arrayList.add(transform.invoke(Character.valueOf(c10)));
        }
        return arrayList;
    }

    @NotNull
    public static final <R> List<R> mapIndexed(@NotNull char[] cArr, @NotNull Function2<? super Integer, ? super Character, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList(cArr.length);
        int length = cArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            arrayList.add(transform.invoke(Integer.valueOf(i11), Character.valueOf(cArr[i10])));
            i10++;
            i11++;
        }
        return arrayList;
    }

    @e1(version = "1.7")
    @oj.i(name = "maxByOrThrow")
    public static final <R extends Comparable<? super R>> int maxByOrThrow(@NotNull int[] iArr, @NotNull Function1<? super Integer, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (iArr.length != 0) {
            int i10 = iArr[0];
            int lastIndex = getLastIndex(iArr);
            if (lastIndex != 0) {
                R rInvoke = selector.invoke(Integer.valueOf(i10));
                int i11 = 1;
                if (1 <= lastIndex) {
                    while (true) {
                        int i12 = iArr[i11];
                        R rInvoke2 = selector.invoke(Integer.valueOf(i12));
                        if (rInvoke.compareTo(rInvoke2) < 0) {
                            i10 = i12;
                            rInvoke = rInvoke2;
                        }
                        if (i11 == lastIndex) {
                            break;
                        }
                        i11++;
                    }
                }
            }
            return i10;
        }
        throw new NoSuchElementException();
    }

    @u0
    @e1(version = "1.4")
    @f
    private static final double maxOf(long[] jArr, Function1<? super Long, Double> selector) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (jArr.length != 0) {
            double dDoubleValue = selector.invoke(Long.valueOf(jArr[0])).doubleValue();
            int lastIndex = getLastIndex(jArr);
            int i10 = 1;
            if (1 <= lastIndex) {
                while (true) {
                    dDoubleValue = Math.max(dDoubleValue, selector.invoke(Long.valueOf(jArr[i10])).doubleValue());
                    if (i10 == lastIndex) {
                        break;
                    }
                    i10++;
                }
            }
            return dDoubleValue;
        }
        throw new NoSuchElementException();
    }

    @u0
    @e1(version = "1.4")
    @f
    /* JADX INFO: renamed from: maxOfOrNull, reason: collision with other method in class */
    private static final Double m810maxOfOrNull(long[] jArr, Function1<? super Long, Double> selector) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (jArr.length == 0) {
            return null;
        }
        double dDoubleValue = selector.invoke(Long.valueOf(jArr[0])).doubleValue();
        int lastIndex = getLastIndex(jArr);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                dDoubleValue = Math.max(dDoubleValue, selector.invoke(Long.valueOf(jArr[i10])).doubleValue());
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return Double.valueOf(dDoubleValue);
    }

    @u0
    @e1(version = "1.4")
    @f
    private static final <R> R maxOfWith(long[] jArr, Comparator<? super R> comparator, Function1<? super Long, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (jArr.length != 0) {
            R rInvoke = selector.invoke(Long.valueOf(jArr[0]));
            int lastIndex = getLastIndex(jArr);
            int i10 = 1;
            if (1 <= lastIndex) {
                while (true) {
                    R rInvoke2 = selector.invoke(Long.valueOf(jArr[i10]));
                    if (comparator.compare(rInvoke, rInvoke2) < 0) {
                        rInvoke = rInvoke2;
                    }
                    if (i10 == lastIndex) {
                        break;
                    }
                    i10++;
                }
            }
            return rInvoke;
        }
        throw new NoSuchElementException();
    }

    @e1(version = "1.7")
    @oj.i(name = "maxWithOrThrow")
    public static final long maxWithOrThrow(@NotNull long[] jArr, @NotNull Comparator<? super Long> comparator) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (jArr.length == 0) {
            throw new NoSuchElementException();
        }
        long j10 = jArr[0];
        int lastIndex = getLastIndex(jArr);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                long j11 = jArr[i10];
                if (comparator.compare(Long.valueOf(j10), Long.valueOf(j11)) < 0) {
                    j10 = j11;
                }
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return j10;
    }

    @e1(version = "1.7")
    @oj.i(name = "minByOrThrow")
    public static final <R extends Comparable<? super R>> int minByOrThrow(@NotNull int[] iArr, @NotNull Function1<? super Integer, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (iArr.length != 0) {
            int i10 = 6 >> 0;
            int i11 = iArr[0];
            int lastIndex = getLastIndex(iArr);
            if (lastIndex != 0) {
                R rInvoke = selector.invoke(Integer.valueOf(i11));
                int i12 = 1;
                if (1 <= lastIndex) {
                    while (true) {
                        int i13 = iArr[i12];
                        R rInvoke2 = selector.invoke(Integer.valueOf(i13));
                        if (rInvoke.compareTo(rInvoke2) > 0) {
                            i11 = i13;
                            rInvoke = rInvoke2;
                        }
                        if (i12 == lastIndex) {
                            break;
                        }
                        i12++;
                    }
                }
            }
            return i11;
        }
        throw new NoSuchElementException();
    }

    @u0
    @e1(version = "1.4")
    @f
    private static final double minOf(long[] jArr, Function1<? super Long, Double> selector) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (jArr.length != 0) {
            double dDoubleValue = selector.invoke(Long.valueOf(jArr[0])).doubleValue();
            int lastIndex = getLastIndex(jArr);
            int i10 = 1;
            if (1 <= lastIndex) {
                while (true) {
                    dDoubleValue = Math.min(dDoubleValue, selector.invoke(Long.valueOf(jArr[i10])).doubleValue());
                    if (i10 == lastIndex) {
                        break;
                    }
                    i10++;
                }
            }
            return dDoubleValue;
        }
        throw new NoSuchElementException();
    }

    @u0
    @e1(version = "1.4")
    @f
    /* JADX INFO: renamed from: minOfOrNull, reason: collision with other method in class */
    private static final Double m846minOfOrNull(long[] jArr, Function1<? super Long, Double> selector) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (jArr.length == 0) {
            return null;
        }
        double dDoubleValue = selector.invoke(Long.valueOf(jArr[0])).doubleValue();
        int lastIndex = getLastIndex(jArr);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                dDoubleValue = Math.min(dDoubleValue, selector.invoke(Long.valueOf(jArr[i10])).doubleValue());
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return Double.valueOf(dDoubleValue);
    }

    @u0
    @e1(version = "1.4")
    @f
    private static final <R> R minOfWith(long[] jArr, Comparator<? super R> comparator, Function1<? super Long, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (jArr.length != 0) {
            R rInvoke = selector.invoke(Long.valueOf(jArr[0]));
            int lastIndex = getLastIndex(jArr);
            int i10 = 1;
            if (1 <= lastIndex) {
                while (true) {
                    R rInvoke2 = selector.invoke(Long.valueOf(jArr[i10]));
                    if (comparator.compare(rInvoke, rInvoke2) > 0) {
                        rInvoke = rInvoke2;
                    }
                    if (i10 == lastIndex) {
                        break;
                    }
                    i10++;
                }
            }
            return rInvoke;
        }
        throw new NoSuchElementException();
    }

    @e1(version = "1.7")
    @oj.i(name = "minWithOrThrow")
    public static final long minWithOrThrow(@NotNull long[] jArr, @NotNull Comparator<? super Long> comparator) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (jArr.length != 0) {
            long j10 = jArr[0];
            int lastIndex = getLastIndex(jArr);
            int i10 = 1;
            if (1 <= lastIndex) {
                while (true) {
                    long j11 = jArr[i10];
                    if (comparator.compare(Long.valueOf(j10), Long.valueOf(j11)) > 0) {
                        j10 = j11;
                    }
                    if (i10 == lastIndex) {
                        break;
                    }
                    i10++;
                }
            }
            return j10;
        }
        throw new NoSuchElementException();
    }

    @e1(version = "1.3")
    public static final float random(@NotNull float[] fArr, @NotNull kotlin.random.f random) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        if (fArr.length != 0) {
            return fArr[random.m(fArr.length)];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @e1(version = "1.4")
    @Nullable
    public static final Float reduceIndexedOrNull(@NotNull float[] fArr, @NotNull n<? super Integer, ? super Float, ? super Float, Float> operation) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (fArr.length == 0) {
            return null;
        }
        float fFloatValue = fArr[0];
        int lastIndex = getLastIndex(fArr);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                fFloatValue = operation.invoke(Integer.valueOf(i10), Float.valueOf(fFloatValue), Float.valueOf(fArr[i10])).floatValue();
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return Float.valueOf(fFloatValue);
    }

    @e1(version = "1.4")
    @Nullable
    public static final Float reduceOrNull(@NotNull float[] fArr, @NotNull Function2<? super Float, ? super Float, Float> operation) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (fArr.length == 0) {
            return null;
        }
        float fFloatValue = fArr[0];
        int lastIndex = getLastIndex(fArr);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                fFloatValue = operation.invoke(Float.valueOf(fFloatValue), Float.valueOf(fArr[i10])).floatValue();
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return Float.valueOf(fFloatValue);
    }

    public static final double reduceRight(@NotNull double[] dArr, @NotNull Function2<? super Double, ? super Double, Double> operation) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int lastIndex = getLastIndex(dArr);
        if (lastIndex < 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        double dDoubleValue = dArr[lastIndex];
        for (int i10 = lastIndex - 1; i10 >= 0; i10--) {
            dDoubleValue = operation.invoke(Double.valueOf(dArr[i10]), Double.valueOf(dDoubleValue)).doubleValue();
        }
        return dDoubleValue;
    }

    public static final double reduceRightIndexed(@NotNull double[] dArr, @NotNull n<? super Integer, ? super Double, ? super Double, Double> operation) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int lastIndex = getLastIndex(dArr);
        if (lastIndex < 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        double dDoubleValue = dArr[lastIndex];
        for (int i10 = lastIndex - 1; i10 >= 0; i10--) {
            dDoubleValue = operation.invoke(Integer.valueOf(i10), Double.valueOf(dArr[i10]), Double.valueOf(dDoubleValue)).doubleValue();
        }
        return dDoubleValue;
    }

    @NotNull
    public static final List<Character> reversed(@NotNull char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        if (cArr.length == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        List<Character> mutableList = toMutableList(cArr);
        CollectionsKt___CollectionsJvmKt.reverse(mutableList);
        return mutableList;
    }

    @NotNull
    public static final double[] reversedArray(@NotNull double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        if (dArr.length == 0) {
            return dArr;
        }
        double[] dArr2 = new double[dArr.length];
        int lastIndex = getLastIndex(dArr);
        if (lastIndex >= 0) {
            int i10 = 0;
            while (true) {
                dArr2[lastIndex - i10] = dArr[i10];
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return dArr2;
    }

    @e1(version = "1.4")
    @f
    private static final List<Long> runningReduce(long[] jArr, Function2<? super Long, ? super Long, Long> operation) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (jArr.length == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        long jLongValue = jArr[0];
        ArrayList arrayList = new ArrayList(jArr.length);
        arrayList.add(Long.valueOf(jLongValue));
        int length = jArr.length;
        for (int i10 = 1; i10 < length; i10++) {
            jLongValue = operation.invoke(Long.valueOf(jLongValue), Long.valueOf(jArr[i10])).longValue();
            arrayList.add(Long.valueOf(jLongValue));
        }
        return arrayList;
    }

    @e1(version = "1.4")
    @f
    private static final List<Long> runningReduceIndexed(long[] jArr, n<? super Integer, ? super Long, ? super Long, Long> operation) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (jArr.length == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        long jLongValue = jArr[0];
        ArrayList arrayList = new ArrayList(jArr.length);
        arrayList.add(Long.valueOf(jLongValue));
        int length = jArr.length;
        for (int i10 = 1; i10 < length; i10++) {
            jLongValue = operation.invoke(Integer.valueOf(i10), Long.valueOf(jLongValue), Long.valueOf(jArr[i10])).longValue();
            arrayList.add(Long.valueOf(jLongValue));
        }
        return arrayList;
    }

    @e1(version = "1.4")
    public static final void shuffle(@NotNull int[] iArr, @NotNull kotlin.random.f random) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        for (int lastIndex = getLastIndex(iArr); lastIndex > 0; lastIndex--) {
            int iM = random.m(lastIndex + 1);
            int i10 = iArr[lastIndex];
            iArr[lastIndex] = iArr[iM];
            iArr[iM] = i10;
        }
    }

    public static final double single(@NotNull double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        int length = dArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        if (length == 1) {
            return dArr[0];
        }
        throw new IllegalArgumentException("Array has more than one element.");
    }

    @NotNull
    public static final char[] sliceArray(@NotNull char[] cArr, @NotNull Collection<Integer> indices) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(indices, "indices");
        char[] cArr2 = new char[indices.size()];
        Iterator<Integer> it = indices.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            cArr2[i10] = cArr[it.next().intValue()];
            i10++;
        }
        return cArr2;
    }

    @u0
    @m2(markerClass = {u.class})
    @e1(version = "1.5")
    @f
    @oj.i(name = "sumOfUInt")
    private static final int sumOfUInt(char[] cArr, Function1<? super Character, u1> selector) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        int iN = u1.n(0);
        for (char c10 : cArr) {
            iN = u1.n(iN + selector.invoke(Character.valueOf(c10)).z0());
        }
        return iN;
    }

    @u0
    @m2(markerClass = {u.class})
    @e1(version = "1.5")
    @f
    @oj.i(name = "sumOfULong")
    private static final long sumOfULong(char[] cArr, Function1<? super Character, y1> selector) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        long jN = y1.n(0L);
        for (char c10 : cArr) {
            jN = y1.n(jN + selector.invoke(Character.valueOf(c10)).z0());
        }
        return jN;
    }

    @NotNull
    public static final List<Double> takeLastWhile(@NotNull double[] dArr, @NotNull Function1<? super Double, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (int lastIndex = getLastIndex(dArr); -1 < lastIndex; lastIndex--) {
            if (!predicate.invoke(Double.valueOf(dArr[lastIndex])).booleanValue()) {
                return drop(dArr, lastIndex + 1);
            }
        }
        return toList(dArr);
    }

    @NotNull
    public static final List<Double> takeWhile(@NotNull double[] dArr, @NotNull Function1<? super Double, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (double d10 : dArr) {
            if (!predicate.invoke(Double.valueOf(d10)).booleanValue()) {
                break;
            }
            arrayList.add(Double.valueOf(d10));
        }
        return arrayList;
    }

    @NotNull
    public static List<Double> toList(@NotNull double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        int length = dArr.length;
        if (length != 0) {
            return length != 1 ? toMutableList(dArr) : CollectionsKt__CollectionsJVMKt.listOf(Double.valueOf(dArr[0]));
        }
        return CollectionsKt__CollectionsKt.emptyList();
    }

    @NotNull
    public static final Set<Double> toSet(@NotNull double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        int length = dArr.length;
        if (length == 0) {
            return SetsKt__SetsKt.emptySet();
        }
        if (length != 1) {
            return (Set) toCollection(dArr, new LinkedHashSet(MapsKt__MapsJVMKt.mapCapacity(dArr.length)));
        }
        return SetsKt__SetsJVMKt.setOf(Double.valueOf(dArr[0]));
    }

    @NotNull
    public static final <R, V> List<V> zip(@NotNull char[] cArr, @NotNull R[] other, @NotNull Function2<? super Character, ? super R, ? extends V> transform) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int iMin = Math.min(cArr.length, other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i10 = 0; i10 < iMin; i10++) {
            arrayList.add(transform.invoke(Character.valueOf(cArr[i10]), other[i10]));
        }
        return arrayList;
    }

    @NotNull
    public static final List<Float> dropWhile(@NotNull float[] fArr, @NotNull Function1<? super Float, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        boolean z10 = false;
        for (float f10 : fArr) {
            if (z10) {
                arrayList.add(Float.valueOf(f10));
            } else if (!predicate.invoke(Float.valueOf(f10)).booleanValue()) {
                arrayList.add(Float.valueOf(f10));
                z10 = true;
            }
        }
        return arrayList;
    }

    @e1(version = "1.4")
    @Nullable
    public static final <R extends Comparable<? super R>> Integer maxByOrNull(@NotNull int[] iArr, @NotNull Function1<? super Integer, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (iArr.length == 0) {
            return null;
        }
        int i10 = iArr[0];
        int lastIndex = getLastIndex(iArr);
        if (lastIndex == 0) {
            return Integer.valueOf(i10);
        }
        R rInvoke = selector.invoke(Integer.valueOf(i10));
        int i11 = 1;
        if (1 <= lastIndex) {
            while (true) {
                int i12 = iArr[i11];
                R rInvoke2 = selector.invoke(Integer.valueOf(i12));
                if (rInvoke.compareTo(rInvoke2) < 0) {
                    i10 = i12;
                    rInvoke = rInvoke2;
                }
                if (i11 == lastIndex) {
                    break;
                }
                i11++;
            }
        }
        return Integer.valueOf(i10);
    }

    @u0
    @e1(version = "1.4")
    @f
    private static final <R> R maxOfWithOrNull(float[] fArr, Comparator<? super R> comparator, Function1<? super Float, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (fArr.length == 0) {
            return null;
        }
        R rInvoke = selector.invoke(Float.valueOf(fArr[0]));
        int lastIndex = getLastIndex(fArr);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                R rInvoke2 = selector.invoke(Float.valueOf(fArr[i10]));
                if (comparator.compare(rInvoke, rInvoke2) < 0) {
                    rInvoke = rInvoke2;
                }
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return rInvoke;
    }

    @e1(version = "1.4")
    @Nullable
    public static final <R extends Comparable<? super R>> Integer minByOrNull(@NotNull int[] iArr, @NotNull Function1<? super Integer, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (iArr.length == 0) {
            return null;
        }
        int i10 = iArr[0];
        int lastIndex = getLastIndex(iArr);
        if (lastIndex == 0) {
            return Integer.valueOf(i10);
        }
        R rInvoke = selector.invoke(Integer.valueOf(i10));
        int i11 = 1;
        if (1 <= lastIndex) {
            while (true) {
                int i12 = iArr[i11];
                R rInvoke2 = selector.invoke(Integer.valueOf(i12));
                if (rInvoke.compareTo(rInvoke2) > 0) {
                    i10 = i12;
                    rInvoke = rInvoke2;
                }
                if (i11 == lastIndex) {
                    break;
                }
                i11++;
            }
        }
        return Integer.valueOf(i10);
    }

    @u0
    @e1(version = "1.4")
    @f
    private static final <R> R minOfWithOrNull(float[] fArr, Comparator<? super R> comparator, Function1<? super Float, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (fArr.length == 0) {
            return null;
        }
        R rInvoke = selector.invoke(Float.valueOf(fArr[0]));
        int lastIndex = getLastIndex(fArr);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                R rInvoke2 = selector.invoke(Float.valueOf(fArr[i10]));
                if (comparator.compare(rInvoke, rInvoke2) > 0) {
                    rInvoke = rInvoke2;
                }
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return rInvoke;
    }

    @e1(version = "1.4")
    @Nullable
    public static final Character randomOrNull(@NotNull char[] cArr, @NotNull kotlin.random.f random) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        if (cArr.length == 0) {
            return null;
        }
        return Character.valueOf(cArr[random.m(cArr.length)]);
    }

    public static final float reduce(@NotNull float[] fArr, @NotNull Function2<? super Float, ? super Float, Float> operation) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (fArr.length != 0) {
            float fFloatValue = fArr[0];
            int lastIndex = getLastIndex(fArr);
            int i10 = 1;
            if (1 <= lastIndex) {
                while (true) {
                    fFloatValue = operation.invoke(Float.valueOf(fFloatValue), Float.valueOf(fArr[i10])).floatValue();
                    if (i10 == lastIndex) {
                        break;
                    }
                    i10++;
                }
            }
            return fFloatValue;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    public static final float reduceIndexed(@NotNull float[] fArr, @NotNull n<? super Integer, ? super Float, ? super Float, Float> operation) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (fArr.length == 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        float fFloatValue = fArr[0];
        int lastIndex = getLastIndex(fArr);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                fFloatValue = operation.invoke(Integer.valueOf(i10), Float.valueOf(fFloatValue), Float.valueOf(fArr[i10])).floatValue();
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return fFloatValue;
    }

    public static final void reverse(@NotNull float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        int length = (fArr.length / 2) - 1;
        if (length < 0) {
            return;
        }
        int lastIndex = getLastIndex(fArr);
        if (length < 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            float f10 = fArr[i10];
            fArr[i10] = fArr[lastIndex];
            fArr[lastIndex] = f10;
            lastIndex--;
            if (i10 == length) {
                return;
            } else {
                i10++;
            }
        }
    }

    @e1(version = "1.4")
    @f
    private static final <R> List<R> runningFold(float[] fArr, R r10, Function2<? super R, ? super Float, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (fArr.length == 0) {
            return CollectionsKt__CollectionsJVMKt.listOf(r10);
        }
        ArrayList arrayList = new ArrayList(fArr.length + 1);
        arrayList.add(r10);
        for (float f10 : fArr) {
            r10 = operation.invoke(r10, Float.valueOf(f10));
            arrayList.add(r10);
        }
        return arrayList;
    }

    @e1(version = "1.4")
    @f
    private static final <R> List<R> runningFoldIndexed(float[] fArr, R r10, n<? super Integer, ? super R, ? super Float, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (fArr.length == 0) {
            return CollectionsKt__CollectionsJVMKt.listOf(r10);
        }
        ArrayList arrayList = new ArrayList(fArr.length + 1);
        arrayList.add(r10);
        int length = fArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            r10 = operation.invoke(Integer.valueOf(i10), r10, Float.valueOf(fArr[i10]));
            arrayList.add(r10);
        }
        return arrayList;
    }

    @e1(version = "1.4")
    public static final void sortDescending(@NotNull short[] sArr, int i10, int i11) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        ArraysKt___ArraysJvmKt.sort(sArr, i10, i11);
        reverse(sArr, i10, i11);
    }

    @NotNull
    public static final <K, V, M extends Map<? super K, ? super V>> M associateByTo(@NotNull long[] jArr, @NotNull M destination, @NotNull Function1<? super Long, ? extends K> keySelector, @NotNull Function1<? super Long, ? extends V> valueTransform) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        for (long j10 : jArr) {
            destination.put(keySelector.invoke(Long.valueOf(j10)), valueTransform.invoke(Long.valueOf(j10)));
        }
        return destination;
    }

    @Nullable
    public static final Double singleOrNull(@NotNull double[] dArr, @NotNull Function1<? super Double, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Double dValueOf = null;
        boolean z10 = false;
        for (double d10 : dArr) {
            if (predicate.invoke(Double.valueOf(d10)).booleanValue()) {
                if (z10) {
                    return null;
                }
                dValueOf = Double.valueOf(d10);
                z10 = true;
            }
        }
        if (z10) {
            return dValueOf;
        }
        return null;
    }

    public static final <T> T first(@NotNull T[] tArr, @NotNull Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (T t10 : tArr) {
            if (predicate.invoke(t10).booleanValue()) {
                return t10;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @NotNull
    public static final <A extends Appendable> A joinTo(@NotNull long[] jArr, @NotNull A buffer, @NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence postfix, int i10, @NotNull CharSequence truncated, @Nullable Function1<? super Long, ? extends CharSequence> function1) throws IOException {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(truncated, "truncated");
        buffer.append(prefix);
        int i11 = 0;
        for (long j10 : jArr) {
            i11++;
            if (i11 > 1) {
                buffer.append(separator);
            }
            if (i10 >= 0 && i11 > i10) {
                break;
            }
            if (function1 != null) {
                buffer.append(function1.invoke(Long.valueOf(j10)));
            } else {
                buffer.append(String.valueOf(j10));
            }
        }
        if (i10 >= 0 && i11 > i10) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    public static final <T> T last(@NotNull T[] tArr, @NotNull Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = tArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i10 = length - 1;
                T t10 = tArr[length];
                if (predicate.invoke(t10).booleanValue()) {
                    return t10;
                }
                if (i10 >= 0) {
                    length = i10;
                }
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @Nullable
    public static final Double lastOrNull(@NotNull double[] dArr, @NotNull Function1<? super Double, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = dArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i10 = length - 1;
                double d10 = dArr[length];
                if (predicate.invoke(Double.valueOf(d10)).booleanValue()) {
                    return Double.valueOf(d10);
                }
                if (i10 >= 0) {
                    length = i10;
                }
            }
        }
        return null;
    }

    @e1(version = "1.4")
    @Nullable
    public static Integer maxOrNull(@NotNull int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        if (iArr.length == 0) {
            return null;
        }
        int i10 = iArr[0];
        int lastIndex = getLastIndex(iArr);
        int i11 = 1;
        if (1 <= lastIndex) {
            while (true) {
                int i12 = iArr[i11];
                if (i10 < i12) {
                    i10 = i12;
                }
                if (i11 == lastIndex) {
                    break;
                }
                i11++;
            }
        }
        return Integer.valueOf(i10);
    }

    @e1(version = "1.4")
    @Nullable
    public static Integer minOrNull(@NotNull int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        if (iArr.length == 0) {
            return null;
        }
        int i10 = iArr[0];
        int lastIndex = getLastIndex(iArr);
        int i11 = 1;
        if (1 <= lastIndex) {
            while (true) {
                int i12 = iArr[i11];
                if (i10 > i12) {
                    i10 = i12;
                }
                if (i11 == lastIndex) {
                    break;
                }
                i11++;
            }
        }
        return Integer.valueOf(i10);
    }

    @e1(version = "1.3")
    public static final double random(@NotNull double[] dArr, @NotNull kotlin.random.f random) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        if (dArr.length != 0) {
            return dArr[random.m(dArr.length)];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @e1(version = "1.4")
    @Nullable
    public static final Boolean reduceRightIndexedOrNull(@NotNull boolean[] zArr, @NotNull n<? super Integer, ? super Boolean, ? super Boolean, Boolean> operation) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int lastIndex = getLastIndex(zArr);
        if (lastIndex < 0) {
            return null;
        }
        boolean zBooleanValue = zArr[lastIndex];
        for (int i10 = lastIndex - 1; i10 >= 0; i10--) {
            zBooleanValue = operation.invoke(Integer.valueOf(i10), Boolean.valueOf(zArr[i10]), Boolean.valueOf(zBooleanValue)).booleanValue();
        }
        return Boolean.valueOf(zBooleanValue);
    }

    @e1(version = "1.4")
    @Nullable
    public static final Boolean reduceRightOrNull(@NotNull boolean[] zArr, @NotNull Function2<? super Boolean, ? super Boolean, Boolean> operation) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int lastIndex = getLastIndex(zArr);
        if (lastIndex < 0) {
            return null;
        }
        boolean zBooleanValue = zArr[lastIndex];
        for (int i10 = lastIndex - 1; i10 >= 0; i10--) {
            zBooleanValue = operation.invoke(Boolean.valueOf(zArr[i10]), Boolean.valueOf(zBooleanValue)).booleanValue();
        }
        return Boolean.valueOf(zBooleanValue);
    }

    @NotNull
    public static final <T> T[] sliceArray(@NotNull T[] tArr, @NotNull IntRange indices) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(indices, "indices");
        return indices.isEmpty() ? (T[]) ArraysKt___ArraysJvmKt.copyOfRange(tArr, 0, 0) : (T[]) ArraysKt___ArraysJvmKt.copyOfRange(tArr, indices.u().intValue(), indices.i().intValue() + 1);
    }

    @e1(version = "1.4")
    public static void sortDescending(@NotNull int[] iArr, int i10, int i11) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        ArraysKt___ArraysJvmKt.sort(iArr, i10, i11);
        reverse(iArr, i10, i11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <T, R, V> List<V> zip(@NotNull T[] tArr, @NotNull Iterable<? extends R> other, @NotNull Function2<? super T, ? super R, ? extends V> transform) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int length = tArr.length;
        ArrayList arrayList = new ArrayList(Math.min(CollectionsKt__IterablesKt.collectionSizeOrDefault(other, 10), length));
        int i10 = 0;
        for (R r10 : other) {
            if (i10 >= length) {
                break;
            }
            arrayList.add(transform.invoke(tArr[i10], r10));
            i10++;
        }
        return arrayList;
    }

    @NotNull
    public static final <K, V> Map<K, V> associate(@NotNull boolean[] zArr, @NotNull Function1<? super Boolean, ? extends Pair<? extends K, ? extends V>> transform) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(r.u(MapsKt__MapsJVMKt.mapCapacity(zArr.length), 16));
        for (boolean z10 : zArr) {
            Pair<? extends K, ? extends V> pairInvoke = transform.invoke(Boolean.valueOf(z10));
            linkedHashMap.put(pairInvoke.getFirst(), pairInvoke.getSecond());
        }
        return linkedHashMap;
    }

    @NotNull
    public static final <K> Map<K, Boolean> associateBy(@NotNull boolean[] zArr, @NotNull Function1<? super Boolean, ? extends K> keySelector) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(r.u(MapsKt__MapsJVMKt.mapCapacity(zArr.length), 16));
        for (boolean z10 : zArr) {
            linkedHashMap.put(keySelector.invoke(Boolean.valueOf(z10)), Boolean.valueOf(z10));
        }
        return linkedHashMap;
    }

    @NotNull
    public static final <K, V, M extends Map<? super K, ? super V>> M associateByTo(@NotNull float[] fArr, @NotNull M destination, @NotNull Function1<? super Float, ? extends K> keySelector, @NotNull Function1<? super Float, ? extends V> valueTransform) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        for (float f10 : fArr) {
            destination.put(keySelector.invoke(Float.valueOf(f10)), valueTransform.invoke(Float.valueOf(f10)));
        }
        return destination;
    }

    @NotNull
    public static final List<Boolean> dropLastWhile(@NotNull boolean[] zArr, @NotNull Function1<? super Boolean, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (int lastIndex = getLastIndex(zArr); -1 < lastIndex; lastIndex--) {
            if (!predicate.invoke(Boolean.valueOf(zArr[lastIndex])).booleanValue()) {
                return take(zArr, lastIndex + 1);
            }
        }
        return CollectionsKt__CollectionsKt.emptyList();
    }

    @NotNull
    public static final <R> List<R> flatMap(@NotNull boolean[] zArr, @NotNull Function1<? super Boolean, ? extends Iterable<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList();
        for (boolean z10 : zArr) {
            CollectionsKt__MutableCollectionsKt.addAll(arrayList, transform.invoke(Boolean.valueOf(z10)));
        }
        return arrayList;
    }

    @NotNull
    public static final <K, M extends Map<? super K, List<Long>>> M groupByTo(@NotNull long[] jArr, @NotNull M destination, @NotNull Function1<? super Long, ? extends K> keySelector) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        for (long j10 : jArr) {
            K kInvoke = keySelector.invoke(Long.valueOf(j10));
            Object arrayList = destination.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                destination.put(kInvoke, arrayList);
            }
            ((List) arrayList).add(Long.valueOf(j10));
        }
        return destination;
    }

    @e1(version = "1.7")
    @oj.i(name = "maxOrThrow")
    public static int maxOrThrow(@NotNull int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        if (iArr.length != 0) {
            int i10 = iArr[0];
            int lastIndex = getLastIndex(iArr);
            int i11 = 1;
            if (1 <= lastIndex) {
                while (true) {
                    int i12 = iArr[i11];
                    if (i10 < i12) {
                        i10 = i12;
                    }
                    if (i11 == lastIndex) {
                        break;
                    }
                    i11++;
                }
            }
            return i10;
        }
        throw new NoSuchElementException();
    }

    @e1(version = "1.7")
    @oj.i(name = "minOrThrow")
    public static int minOrThrow(@NotNull int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        if (iArr.length != 0) {
            int i10 = iArr[0];
            int lastIndex = getLastIndex(iArr);
            int i11 = 1;
            if (1 <= lastIndex) {
                while (true) {
                    int i12 = iArr[i11];
                    if (i10 > i12) {
                        i10 = i12;
                    }
                    if (i11 == lastIndex) {
                        break;
                    }
                    i11++;
                }
            }
            return i10;
        }
        throw new NoSuchElementException();
    }

    @NotNull
    public static final Pair<List<Long>, List<Long>> partition(@NotNull long[] jArr, @NotNull Function1<? super Long, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i10 = 3 ^ 0;
        for (long j10 : jArr) {
            if (predicate.invoke(Long.valueOf(j10)).booleanValue()) {
                arrayList.add(Long.valueOf(j10));
            } else {
                arrayList2.add(Long.valueOf(j10));
            }
        }
        return new Pair<>(arrayList, arrayList2);
    }

    public static final boolean reduceRight(@NotNull boolean[] zArr, @NotNull Function2<? super Boolean, ? super Boolean, Boolean> operation) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int lastIndex = getLastIndex(zArr);
        if (lastIndex < 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        boolean zBooleanValue = zArr[lastIndex];
        for (int i10 = lastIndex - 1; i10 >= 0; i10--) {
            zBooleanValue = operation.invoke(Boolean.valueOf(zArr[i10]), Boolean.valueOf(zBooleanValue)).booleanValue();
        }
        return zBooleanValue;
    }

    public static final boolean reduceRightIndexed(@NotNull boolean[] zArr, @NotNull n<? super Integer, ? super Boolean, ? super Boolean, Boolean> operation) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int lastIndex = getLastIndex(zArr);
        if (lastIndex >= 0) {
            boolean zBooleanValue = zArr[lastIndex];
            for (int i10 = lastIndex - 1; i10 >= 0; i10--) {
                zBooleanValue = operation.invoke(Integer.valueOf(i10), Boolean.valueOf(zArr[i10]), Boolean.valueOf(zBooleanValue)).booleanValue();
            }
            return zBooleanValue;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    @NotNull
    public static final boolean[] reversedArray(@NotNull boolean[] zArr) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        if (zArr.length == 0) {
            return zArr;
        }
        boolean[] zArr2 = new boolean[zArr.length];
        int lastIndex = getLastIndex(zArr);
        if (lastIndex >= 0) {
            int i10 = 0;
            while (true) {
                zArr2[lastIndex - i10] = zArr[i10];
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return zArr2;
    }

    public static final boolean single(@NotNull boolean[] zArr) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        int length = zArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        if (length == 1) {
            return zArr[0];
        }
        throw new IllegalArgumentException("Array has more than one element.");
    }

    @NotNull
    public static final List<Short> slice(@NotNull short[] sArr, @NotNull Iterable<Integer> indices) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(indices, "indices");
        int iCollectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(indices, 10);
        if (iCollectionSizeOrDefault == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList(iCollectionSizeOrDefault);
        Iterator<Integer> it = indices.iterator();
        while (it.hasNext()) {
            arrayList.add(Short.valueOf(sArr[it.next().intValue()]));
        }
        return arrayList;
    }

    @NotNull
    public static final List<Long> take(@NotNull long[] jArr, int i10) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
        }
        if (i10 == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        if (i10 >= jArr.length) {
            return toList(jArr);
        }
        if (i10 == 1) {
            return CollectionsKt__CollectionsJVMKt.listOf(Long.valueOf(jArr[0]));
        }
        ArrayList arrayList = new ArrayList(i10);
        int i11 = 0;
        for (long j10 : jArr) {
            arrayList.add(Long.valueOf(j10));
            i11++;
            if (i11 == i10) {
                break;
            }
        }
        return arrayList;
    }

    @NotNull
    public static final List<Long> takeLast(@NotNull long[] jArr, int i10) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
        }
        if (i10 == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        int length = jArr.length;
        if (i10 >= length) {
            return toList(jArr);
        }
        if (i10 == 1) {
            return CollectionsKt__CollectionsJVMKt.listOf(Long.valueOf(jArr[length - 1]));
        }
        ArrayList arrayList = new ArrayList(i10);
        for (int i11 = length - i10; i11 < length; i11++) {
            arrayList.add(Long.valueOf(jArr[i11]));
        }
        return arrayList;
    }

    @NotNull
    public static final List<Boolean> takeLastWhile(@NotNull boolean[] zArr, @NotNull Function1<? super Boolean, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (int lastIndex = getLastIndex(zArr); -1 < lastIndex; lastIndex--) {
            if (!predicate.invoke(Boolean.valueOf(zArr[lastIndex])).booleanValue()) {
                return drop(zArr, lastIndex + 1);
            }
        }
        return toList(zArr);
    }

    @NotNull
    public static final List<Boolean> takeWhile(@NotNull boolean[] zArr, @NotNull Function1<? super Boolean, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (boolean z10 : zArr) {
            if (!predicate.invoke(Boolean.valueOf(z10)).booleanValue()) {
                break;
            }
            arrayList.add(Boolean.valueOf(z10));
        }
        return arrayList;
    }

    @NotNull
    public static List<Boolean> toList(@NotNull boolean[] zArr) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        int length = zArr.length;
        if (length == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        if (length != 1) {
            return toMutableList(zArr);
        }
        return CollectionsKt__CollectionsJVMKt.listOf(Boolean.valueOf(zArr[0]));
    }

    @NotNull
    public static final Set<Boolean> toSet(@NotNull boolean[] zArr) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        int length = zArr.length;
        if (length == 0) {
            return SetsKt__SetsKt.emptySet();
        }
        if (length != 1) {
            return (Set) toCollection(zArr, new LinkedHashSet(MapsKt__MapsJVMKt.mapCapacity(zArr.length)));
        }
        return SetsKt__SetsJVMKt.setOf(Boolean.valueOf(zArr[0]));
    }

    public static final byte first(@NotNull byte[] bArr, @NotNull Function1<? super Byte, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (byte b10 : bArr) {
            if (predicate.invoke(Byte.valueOf(b10)).booleanValue()) {
                return b10;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @e1(version = "1.4")
    @Nullable
    public static final Float maxWithOrNull(@NotNull float[] fArr, @NotNull Comparator<? super Float> comparator) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (fArr.length == 0) {
            return null;
        }
        float f10 = fArr[0];
        int lastIndex = getLastIndex(fArr);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                float f11 = fArr[i10];
                if (comparator.compare(Float.valueOf(f10), Float.valueOf(f11)) < 0) {
                    f10 = f11;
                }
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return Float.valueOf(f10);
    }

    @e1(version = "1.4")
    @Nullable
    public static final Float minWithOrNull(@NotNull float[] fArr, @NotNull Comparator<? super Float> comparator) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (fArr.length == 0) {
            return null;
        }
        float f10 = fArr[0];
        int lastIndex = getLastIndex(fArr);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                float f11 = fArr[i10];
                if (comparator.compare(Float.valueOf(f10), Float.valueOf(f11)) > 0) {
                    f10 = f11;
                }
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return Float.valueOf(f10);
    }

    @e1(version = "1.4")
    @Nullable
    public static final Double reduceIndexedOrNull(@NotNull double[] dArr, @NotNull n<? super Integer, ? super Double, ? super Double, Double> operation) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (dArr.length == 0) {
            return null;
        }
        double dDoubleValue = dArr[0];
        int lastIndex = getLastIndex(dArr);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                dDoubleValue = operation.invoke(Integer.valueOf(i10), Double.valueOf(dDoubleValue), Double.valueOf(dArr[i10])).doubleValue();
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return Double.valueOf(dDoubleValue);
    }

    @e1(version = "1.4")
    @Nullable
    public static final Double reduceOrNull(@NotNull double[] dArr, @NotNull Function2<? super Double, ? super Double, Double> operation) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (dArr.length == 0) {
            return null;
        }
        double dDoubleValue = dArr[0];
        int lastIndex = getLastIndex(dArr);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                dDoubleValue = operation.invoke(Double.valueOf(dDoubleValue), Double.valueOf(dArr[i10])).doubleValue();
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return Double.valueOf(dDoubleValue);
    }

    @e1(version = "1.4")
    public static final void shuffle(@NotNull long[] jArr, @NotNull kotlin.random.f random) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        for (int lastIndex = getLastIndex(jArr); lastIndex > 0; lastIndex--) {
            int iM = random.m(lastIndex + 1);
            long j10 = jArr[lastIndex];
            jArr[lastIndex] = jArr[iM];
            jArr[iM] = j10;
        }
    }

    @Nullable
    public static final Boolean singleOrNull(@NotNull boolean[] zArr, @NotNull Function1<? super Boolean, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Boolean boolValueOf = null;
        boolean z10 = false;
        for (boolean z11 : zArr) {
            if (predicate.invoke(Boolean.valueOf(z11)).booleanValue()) {
                if (z10) {
                    return null;
                }
                boolValueOf = Boolean.valueOf(z11);
                z10 = true;
            }
        }
        if (z10) {
            return boolValueOf;
        }
        return null;
    }

    @NotNull
    public static byte[] sliceArray(@NotNull byte[] bArr, @NotNull IntRange indices) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(indices, "indices");
        return indices.isEmpty() ? new byte[0] : ArraysKt___ArraysJvmKt.copyOfRange(bArr, indices.u().intValue(), indices.i().intValue() + 1);
    }

    @e1(version = "1.4")
    public static void sortDescending(@NotNull long[] jArr, int i10, int i11) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        ArraysKt___ArraysJvmKt.sort(jArr, i10, i11);
        reverse(jArr, i10, i11);
    }

    @NotNull
    public static final <K, V, M extends Map<? super K, ? super V>> M associateByTo(@NotNull double[] dArr, @NotNull M destination, @NotNull Function1<? super Double, ? extends K> keySelector, @NotNull Function1<? super Double, ? extends V> valueTransform) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        for (double d10 : dArr) {
            destination.put(keySelector.invoke(Double.valueOf(d10)), valueTransform.invoke(Double.valueOf(d10)));
        }
        return destination;
    }

    @NotNull
    public static final <K> List<Float> distinctBy(@NotNull float[] fArr, @NotNull Function1<? super Float, ? extends K> selector) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (float f10 : fArr) {
            if (hashSet.add(selector.invoke(Float.valueOf(f10)))) {
                arrayList.add(Float.valueOf(f10));
            }
        }
        return arrayList;
    }

    @NotNull
    public static final List<Double> dropWhile(@NotNull double[] dArr, @NotNull Function1<? super Double, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        boolean z10 = false;
        for (double d10 : dArr) {
            if (z10) {
                arrayList.add(Double.valueOf(d10));
            } else if (!predicate.invoke(Double.valueOf(d10)).booleanValue()) {
                arrayList.add(Double.valueOf(d10));
                z10 = true;
            }
        }
        return arrayList;
    }

    @Nullable
    public static final Boolean lastOrNull(@NotNull boolean[] zArr, @NotNull Function1<? super Boolean, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = zArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i10 = length - 1;
                boolean z10 = zArr[length];
                if (predicate.invoke(Boolean.valueOf(z10)).booleanValue()) {
                    return Boolean.valueOf(z10);
                }
                if (i10 >= 0) {
                    length = i10;
                }
            }
        }
        return null;
    }

    @u0
    @e1(version = "1.4")
    @f
    private static final double maxOf(float[] fArr, Function1<? super Float, Double> selector) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (fArr.length != 0) {
            double dDoubleValue = selector.invoke(Float.valueOf(fArr[0])).doubleValue();
            int lastIndex = getLastIndex(fArr);
            int i10 = 1;
            if (1 <= lastIndex) {
                while (true) {
                    dDoubleValue = Math.max(dDoubleValue, selector.invoke(Float.valueOf(fArr[i10])).doubleValue());
                    if (i10 == lastIndex) {
                        break;
                    }
                    i10++;
                }
            }
            return dDoubleValue;
        }
        throw new NoSuchElementException();
    }

    @u0
    @e1(version = "1.4")
    @f
    /* JADX INFO: renamed from: maxOfOrNull, reason: collision with other method in class */
    private static final Double m808maxOfOrNull(float[] fArr, Function1<? super Float, Double> selector) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (fArr.length == 0) {
            return null;
        }
        double dDoubleValue = selector.invoke(Float.valueOf(fArr[0])).doubleValue();
        int lastIndex = getLastIndex(fArr);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                dDoubleValue = Math.max(dDoubleValue, selector.invoke(Float.valueOf(fArr[i10])).doubleValue());
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return Double.valueOf(dDoubleValue);
    }

    @u0
    @e1(version = "1.4")
    @f
    private static final <R> R maxOfWith(float[] fArr, Comparator<? super R> comparator, Function1<? super Float, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (fArr.length != 0) {
            R rInvoke = selector.invoke(Float.valueOf(fArr[0]));
            int lastIndex = getLastIndex(fArr);
            int i10 = 1;
            if (1 <= lastIndex) {
                while (true) {
                    R rInvoke2 = selector.invoke(Float.valueOf(fArr[i10]));
                    if (comparator.compare(rInvoke, rInvoke2) < 0) {
                        rInvoke = rInvoke2;
                    }
                    if (i10 == lastIndex) {
                        break;
                    }
                    i10++;
                }
            }
            return rInvoke;
        }
        throw new NoSuchElementException();
    }

    @u0
    @e1(version = "1.4")
    @f
    private static final <R> R maxOfWithOrNull(double[] dArr, Comparator<? super R> comparator, Function1<? super Double, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (dArr.length == 0) {
            return null;
        }
        R rInvoke = selector.invoke(Double.valueOf(dArr[0]));
        int lastIndex = getLastIndex(dArr);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                R rInvoke2 = selector.invoke(Double.valueOf(dArr[i10]));
                if (comparator.compare(rInvoke, rInvoke2) < 0) {
                    rInvoke = rInvoke2;
                }
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return rInvoke;
    }

    @e1(version = "1.7")
    @oj.i(name = "maxWithOrThrow")
    public static final float maxWithOrThrow(@NotNull float[] fArr, @NotNull Comparator<? super Float> comparator) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (fArr.length == 0) {
            throw new NoSuchElementException();
        }
        float f10 = fArr[0];
        int lastIndex = getLastIndex(fArr);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                float f11 = fArr[i10];
                if (comparator.compare(Float.valueOf(f10), Float.valueOf(f11)) < 0) {
                    f10 = f11;
                }
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return f10;
    }

    @u0
    @e1(version = "1.4")
    @f
    private static final double minOf(float[] fArr, Function1<? super Float, Double> selector) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (fArr.length == 0) {
            throw new NoSuchElementException();
        }
        double dDoubleValue = selector.invoke(Float.valueOf(fArr[0])).doubleValue();
        int lastIndex = getLastIndex(fArr);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                dDoubleValue = Math.min(dDoubleValue, selector.invoke(Float.valueOf(fArr[i10])).doubleValue());
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return dDoubleValue;
    }

    @u0
    @e1(version = "1.4")
    @f
    /* JADX INFO: renamed from: minOfOrNull, reason: collision with other method in class */
    private static final Double m844minOfOrNull(float[] fArr, Function1<? super Float, Double> selector) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (fArr.length == 0) {
            int i10 = 3 << 0;
            return null;
        }
        double dDoubleValue = selector.invoke(Float.valueOf(fArr[0])).doubleValue();
        int lastIndex = getLastIndex(fArr);
        int i11 = 1;
        if (1 <= lastIndex) {
            while (true) {
                dDoubleValue = Math.min(dDoubleValue, selector.invoke(Float.valueOf(fArr[i11])).doubleValue());
                if (i11 == lastIndex) {
                    break;
                }
                i11++;
            }
        }
        return Double.valueOf(dDoubleValue);
    }

    @u0
    @e1(version = "1.4")
    @f
    private static final <R> R minOfWith(float[] fArr, Comparator<? super R> comparator, Function1<? super Float, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (fArr.length == 0) {
            throw new NoSuchElementException();
        }
        R rInvoke = selector.invoke(Float.valueOf(fArr[0]));
        int lastIndex = getLastIndex(fArr);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                R rInvoke2 = selector.invoke(Float.valueOf(fArr[i10]));
                if (comparator.compare(rInvoke, rInvoke2) > 0) {
                    rInvoke = rInvoke2;
                }
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return rInvoke;
    }

    @u0
    @e1(version = "1.4")
    @f
    private static final <R> R minOfWithOrNull(double[] dArr, Comparator<? super R> comparator, Function1<? super Double, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (dArr.length == 0) {
            return null;
        }
        R rInvoke = selector.invoke(Double.valueOf(dArr[0]));
        int lastIndex = getLastIndex(dArr);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                R rInvoke2 = selector.invoke(Double.valueOf(dArr[i10]));
                if (comparator.compare(rInvoke, rInvoke2) > 0) {
                    rInvoke = rInvoke2;
                }
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return rInvoke;
    }

    @e1(version = "1.7")
    @oj.i(name = "minWithOrThrow")
    public static final float minWithOrThrow(@NotNull float[] fArr, @NotNull Comparator<? super Float> comparator) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (fArr.length != 0) {
            float f10 = fArr[0];
            int lastIndex = getLastIndex(fArr);
            int i10 = 1;
            if (1 <= lastIndex) {
                while (true) {
                    float f11 = fArr[i10];
                    if (comparator.compare(Float.valueOf(f10), Float.valueOf(f11)) > 0) {
                        f10 = f11;
                    }
                    if (i10 == lastIndex) {
                        break;
                    }
                    i10++;
                }
            }
            return f10;
        }
        throw new NoSuchElementException();
    }

    @e1(version = "1.3")
    public static final boolean random(@NotNull boolean[] zArr, @NotNull kotlin.random.f random) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        if (zArr.length != 0) {
            return zArr[random.m(zArr.length)];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static final double reduce(@NotNull double[] dArr, @NotNull Function2<? super Double, ? super Double, Double> operation) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (dArr.length != 0) {
            double dDoubleValue = dArr[0];
            int lastIndex = getLastIndex(dArr);
            int i10 = 1;
            if (1 <= lastIndex) {
                while (true) {
                    dDoubleValue = operation.invoke(Double.valueOf(dDoubleValue), Double.valueOf(dArr[i10])).doubleValue();
                    if (i10 == lastIndex) {
                        break;
                    }
                    i10++;
                }
            }
            return dDoubleValue;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    public static final double reduceIndexed(@NotNull double[] dArr, @NotNull n<? super Integer, ? super Double, ? super Double, Double> operation) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (dArr.length != 0) {
            double dDoubleValue = dArr[0];
            int lastIndex = getLastIndex(dArr);
            int i10 = 1;
            if (1 <= lastIndex) {
                while (true) {
                    dDoubleValue = operation.invoke(Integer.valueOf(i10), Double.valueOf(dDoubleValue), Double.valueOf(dArr[i10])).doubleValue();
                    if (i10 == lastIndex) {
                        break;
                    }
                    i10++;
                }
            }
            return dDoubleValue;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    public static final void reverse(@NotNull double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        int length = (dArr.length / 2) - 1;
        if (length >= 0) {
            int lastIndex = getLastIndex(dArr);
            if (length >= 0) {
                int i10 = 0;
                while (true) {
                    double d10 = dArr[i10];
                    dArr[i10] = dArr[lastIndex];
                    dArr[lastIndex] = d10;
                    lastIndex--;
                    if (i10 == length) {
                        break;
                    } else {
                        i10++;
                    }
                }
            }
        }
    }

    @e1(version = "1.4")
    @f
    private static final <R> List<R> runningFold(double[] dArr, R r10, Function2<? super R, ? super Double, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (dArr.length == 0) {
            return CollectionsKt__CollectionsJVMKt.listOf(r10);
        }
        ArrayList arrayList = new ArrayList(dArr.length + 1);
        arrayList.add(r10);
        for (double d10 : dArr) {
            r10 = operation.invoke(r10, Double.valueOf(d10));
            arrayList.add(r10);
        }
        return arrayList;
    }

    @e1(version = "1.4")
    @f
    private static final <R> List<R> runningFoldIndexed(double[] dArr, R r10, n<? super Integer, ? super R, ? super Double, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (dArr.length == 0) {
            return CollectionsKt__CollectionsJVMKt.listOf(r10);
        }
        ArrayList arrayList = new ArrayList(dArr.length + 1);
        arrayList.add(r10);
        int length = dArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            r10 = operation.invoke(Integer.valueOf(i10), r10, Double.valueOf(dArr[i10]));
            arrayList.add(r10);
        }
        return arrayList;
    }

    @e1(version = "1.4")
    @f
    private static final List<Float> runningReduce(float[] fArr, Function2<? super Float, ? super Float, Float> operation) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (fArr.length == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        float fFloatValue = fArr[0];
        ArrayList arrayList = new ArrayList(fArr.length);
        arrayList.add(Float.valueOf(fFloatValue));
        int length = fArr.length;
        for (int i10 = 1; i10 < length; i10++) {
            fFloatValue = operation.invoke(Float.valueOf(fFloatValue), Float.valueOf(fArr[i10])).floatValue();
            arrayList.add(Float.valueOf(fFloatValue));
        }
        return arrayList;
    }

    @e1(version = "1.4")
    @f
    private static final List<Float> runningReduceIndexed(float[] fArr, n<? super Integer, ? super Float, ? super Float, Float> operation) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (fArr.length == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        float fFloatValue = fArr[0];
        ArrayList arrayList = new ArrayList(fArr.length);
        arrayList.add(Float.valueOf(fFloatValue));
        int length = fArr.length;
        for (int i10 = 1; i10 < length; i10++) {
            fFloatValue = operation.invoke(Integer.valueOf(i10), Float.valueOf(fFloatValue), Float.valueOf(fArr[i10])).floatValue();
            arrayList.add(Float.valueOf(fFloatValue));
        }
        return arrayList;
    }

    public static final short first(@NotNull short[] sArr, @NotNull Function1<? super Short, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (short s10 : sArr) {
            if (predicate.invoke(Short.valueOf(s10)).booleanValue()) {
                return s10;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    public static final byte last(@NotNull byte[] bArr, @NotNull Function1<? super Byte, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = bArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i10 = length - 1;
                byte b10 = bArr[length];
                if (predicate.invoke(Byte.valueOf(b10)).booleanValue()) {
                    return b10;
                }
                if (i10 >= 0) {
                    length = i10;
                }
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @e1(version = "1.4")
    @Nullable
    public static final Character reduceRightIndexedOrNull(@NotNull char[] cArr, @NotNull n<? super Integer, ? super Character, ? super Character, Character> operation) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int lastIndex = getLastIndex(cArr);
        if (lastIndex < 0) {
            return null;
        }
        char cCharValue = cArr[lastIndex];
        for (int i10 = lastIndex - 1; i10 >= 0; i10--) {
            cCharValue = operation.invoke(Integer.valueOf(i10), Character.valueOf(cArr[i10]), Character.valueOf(cCharValue)).charValue();
        }
        return Character.valueOf(cCharValue);
    }

    @e1(version = "1.4")
    @Nullable
    public static final Character reduceRightOrNull(@NotNull char[] cArr, @NotNull Function2<? super Character, ? super Character, Character> operation) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int lastIndex = getLastIndex(cArr);
        if (lastIndex < 0) {
            return null;
        }
        char cCharValue = cArr[lastIndex];
        for (int i10 = lastIndex - 1; i10 >= 0; i10--) {
            cCharValue = operation.invoke(Character.valueOf(cArr[i10]), Character.valueOf(cCharValue)).charValue();
        }
        return Character.valueOf(cCharValue);
    }

    @NotNull
    public static short[] sliceArray(@NotNull short[] sArr, @NotNull IntRange indices) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(indices, "indices");
        return indices.isEmpty() ? new short[0] : ArraysKt___ArraysJvmKt.copyOfRange(sArr, indices.u().intValue(), indices.i().intValue() + 1);
    }

    @e1(version = "1.4")
    public static void sortDescending(@NotNull float[] fArr, int i10, int i11) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        ArraysKt___ArraysJvmKt.sort(fArr, i10, i11);
        reverse(fArr, i10, i11);
    }

    @NotNull
    public static final <R, V> List<V> zip(@NotNull byte[] bArr, @NotNull Iterable<? extends R> other, @NotNull Function2<? super Byte, ? super R, ? extends V> transform) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int length = bArr.length;
        ArrayList arrayList = new ArrayList(Math.min(CollectionsKt__IterablesKt.collectionSizeOrDefault(other, 10), length));
        int i10 = 0;
        for (R r10 : other) {
            if (i10 >= length) {
                break;
            }
            arrayList.add(transform.invoke(Byte.valueOf(bArr[i10]), r10));
            i10++;
        }
        return arrayList;
    }

    @NotNull
    public static final <K, V> Map<K, V> associate(@NotNull char[] cArr, @NotNull Function1<? super Character, ? extends Pair<? extends K, ? extends V>> transform) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(r.u(MapsKt__MapsJVMKt.mapCapacity(cArr.length), 16));
        for (char c10 : cArr) {
            Pair<? extends K, ? extends V> pairInvoke = transform.invoke(Character.valueOf(c10));
            linkedHashMap.put(pairInvoke.getFirst(), pairInvoke.getSecond());
        }
        return linkedHashMap;
    }

    @NotNull
    public static final <K> Map<K, Character> associateBy(@NotNull char[] cArr, @NotNull Function1<? super Character, ? extends K> keySelector) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(r.u(MapsKt__MapsJVMKt.mapCapacity(cArr.length), 16));
        for (char c10 : cArr) {
            linkedHashMap.put(keySelector.invoke(Character.valueOf(c10)), Character.valueOf(c10));
        }
        return linkedHashMap;
    }

    @NotNull
    public static final <K, V, M extends Map<? super K, ? super V>> M associateByTo(@NotNull boolean[] zArr, @NotNull M destination, @NotNull Function1<? super Boolean, ? extends K> keySelector, @NotNull Function1<? super Boolean, ? extends V> valueTransform) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        for (boolean z10 : zArr) {
            destination.put(keySelector.invoke(Boolean.valueOf(z10)), valueTransform.invoke(Boolean.valueOf(z10)));
        }
        return destination;
    }

    @NotNull
    public static final List<Character> dropLastWhile(@NotNull char[] cArr, @NotNull Function1<? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (int lastIndex = getLastIndex(cArr); -1 < lastIndex; lastIndex--) {
            if (!predicate.invoke(Character.valueOf(cArr[lastIndex])).booleanValue()) {
                return take(cArr, lastIndex + 1);
            }
        }
        return CollectionsKt__CollectionsKt.emptyList();
    }

    @NotNull
    public static final <R> List<R> flatMap(@NotNull char[] cArr, @NotNull Function1<? super Character, ? extends Iterable<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList();
        for (char c10 : cArr) {
            CollectionsKt__MutableCollectionsKt.addAll(arrayList, transform.invoke(Character.valueOf(c10)));
        }
        return arrayList;
    }

    @NotNull
    public static final <K> Map<K, List<Long>> groupBy(@NotNull long[] jArr, @NotNull Function1<? super Long, ? extends K> keySelector) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (long j10 : jArr) {
            K kInvoke = keySelector.invoke(Long.valueOf(j10));
            Object arrayList = linkedHashMap.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(kInvoke, arrayList);
            }
            ((List) arrayList).add(Long.valueOf(j10));
        }
        return linkedHashMap;
    }

    @e1(version = "1.7")
    @oj.i(name = "maxByOrThrow")
    public static final <R extends Comparable<? super R>> long maxByOrThrow(@NotNull long[] jArr, @NotNull Function1<? super Long, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (jArr.length != 0) {
            long j10 = jArr[0];
            int lastIndex = getLastIndex(jArr);
            if (lastIndex != 0) {
                R rInvoke = selector.invoke(Long.valueOf(j10));
                int i10 = 1;
                if (1 <= lastIndex) {
                    while (true) {
                        long j11 = jArr[i10];
                        R rInvoke2 = selector.invoke(Long.valueOf(j11));
                        if (rInvoke.compareTo(rInvoke2) < 0) {
                            j10 = j11;
                            rInvoke = rInvoke2;
                        }
                        if (i10 == lastIndex) {
                            break;
                        }
                        i10++;
                    }
                }
            }
            return j10;
        }
        throw new NoSuchElementException();
    }

    @e1(version = "1.4")
    @Nullable
    public static final Long maxOrNull(@NotNull long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        if (jArr.length == 0) {
            int i10 = 0 >> 0;
            return null;
        }
        long j10 = jArr[0];
        int lastIndex = getLastIndex(jArr);
        int i11 = 1;
        if (1 <= lastIndex) {
            while (true) {
                long j11 = jArr[i11];
                if (j10 < j11) {
                    j10 = j11;
                }
                if (i11 == lastIndex) {
                    break;
                }
                i11++;
            }
        }
        return Long.valueOf(j10);
    }

    @e1(version = "1.7")
    @oj.i(name = "minByOrThrow")
    public static final <R extends Comparable<? super R>> long minByOrThrow(@NotNull long[] jArr, @NotNull Function1<? super Long, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (jArr.length != 0) {
            long j10 = jArr[0];
            int lastIndex = getLastIndex(jArr);
            if (lastIndex != 0) {
                R rInvoke = selector.invoke(Long.valueOf(j10));
                int i10 = 1;
                if (1 <= lastIndex) {
                    while (true) {
                        long j11 = jArr[i10];
                        R rInvoke2 = selector.invoke(Long.valueOf(j11));
                        if (rInvoke.compareTo(rInvoke2) > 0) {
                            j10 = j11;
                            rInvoke = rInvoke2;
                        }
                        if (i10 == lastIndex) {
                            break;
                        }
                        i10++;
                    }
                }
            }
            return j10;
        }
        throw new NoSuchElementException();
    }

    @e1(version = "1.4")
    @Nullable
    public static final Long minOrNull(@NotNull long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        if (jArr.length == 0) {
            return null;
        }
        long j10 = jArr[0];
        int lastIndex = getLastIndex(jArr);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                long j11 = jArr[i10];
                if (j10 > j11) {
                    j10 = j11;
                }
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return Long.valueOf(j10);
    }

    public static final char reduceRight(@NotNull char[] cArr, @NotNull Function2<? super Character, ? super Character, Character> operation) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int lastIndex = getLastIndex(cArr);
        if (lastIndex >= 0) {
            char cCharValue = cArr[lastIndex];
            for (int i10 = lastIndex - 1; i10 >= 0; i10--) {
                cCharValue = operation.invoke(Character.valueOf(cArr[i10]), Character.valueOf(cCharValue)).charValue();
            }
            return cCharValue;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    public static final char reduceRightIndexed(@NotNull char[] cArr, @NotNull n<? super Integer, ? super Character, ? super Character, Character> operation) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        int lastIndex = getLastIndex(cArr);
        if (lastIndex >= 0) {
            char cCharValue = cArr[lastIndex];
            for (int i10 = lastIndex - 1; i10 >= 0; i10--) {
                cCharValue = operation.invoke(Integer.valueOf(i10), Character.valueOf(cArr[i10]), Character.valueOf(cCharValue)).charValue();
            }
            return cCharValue;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    @NotNull
    public static final char[] reversedArray(@NotNull char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        if (cArr.length == 0) {
            return cArr;
        }
        char[] cArr2 = new char[cArr.length];
        int lastIndex = getLastIndex(cArr);
        if (lastIndex >= 0) {
            int i10 = 0;
            while (true) {
                cArr2[lastIndex - i10] = cArr[i10];
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return cArr2;
    }

    public static char single(@NotNull char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        int length = cArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        if (length == 1) {
            return cArr[0];
        }
        throw new IllegalArgumentException("Array has more than one element.");
    }

    @Nullable
    public static final Character singleOrNull(@NotNull char[] cArr, @NotNull Function1<? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Character chValueOf = null;
        boolean z10 = false;
        for (char c10 : cArr) {
            if (predicate.invoke(Character.valueOf(c10)).booleanValue()) {
                if (z10) {
                    return null;
                }
                chValueOf = Character.valueOf(c10);
                z10 = true;
            }
        }
        if (z10) {
            return chValueOf;
        }
        return null;
    }

    @NotNull
    public static final List<Character> takeLastWhile(@NotNull char[] cArr, @NotNull Function1<? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (int lastIndex = getLastIndex(cArr); -1 < lastIndex; lastIndex--) {
            if (!predicate.invoke(Character.valueOf(cArr[lastIndex])).booleanValue()) {
                return drop(cArr, lastIndex + 1);
            }
        }
        return toList(cArr);
    }

    @NotNull
    public static final List<Character> takeWhile(@NotNull char[] cArr, @NotNull Function1<? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (char c10 : cArr) {
            if (!predicate.invoke(Character.valueOf(c10)).booleanValue()) {
                break;
            }
            arrayList.add(Character.valueOf(c10));
        }
        return arrayList;
    }

    @NotNull
    public static final List<Character> toList(@NotNull char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        int length = cArr.length;
        if (length == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        if (length != 1) {
            return toMutableList(cArr);
        }
        return CollectionsKt__CollectionsJVMKt.listOf(Character.valueOf(cArr[0]));
    }

    @NotNull
    public static final Set<Character> toSet(@NotNull char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        int length = cArr.length;
        if (length != 0) {
            return length != 1 ? (Set) toCollection(cArr, new LinkedHashSet(MapsKt__MapsJVMKt.mapCapacity(r.B(cArr.length, 128)))) : SetsKt__SetsJVMKt.setOf(Character.valueOf(cArr[0]));
        }
        return SetsKt__SetsKt.emptySet();
    }

    public static final int first(@NotNull int[] iArr, @NotNull Function1<? super Integer, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (int i10 : iArr) {
            if (predicate.invoke(Integer.valueOf(i10)).booleanValue()) {
                return i10;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @Nullable
    public static final Character lastOrNull(@NotNull char[] cArr, @NotNull Function1<? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = cArr.length - 1;
        if (length < 0) {
            return null;
        }
        while (true) {
            int i10 = length - 1;
            char c10 = cArr[length];
            if (predicate.invoke(Character.valueOf(c10)).booleanValue()) {
                return Character.valueOf(c10);
            }
            if (i10 < 0) {
                return null;
            }
            length = i10;
        }
    }

    @e1(version = "1.7")
    @oj.i(name = "maxOrThrow")
    public static final long maxOrThrow(@NotNull long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        if (jArr.length != 0) {
            long j10 = jArr[0];
            int lastIndex = getLastIndex(jArr);
            int i10 = 1;
            if (1 <= lastIndex) {
                while (true) {
                    long j11 = jArr[i10];
                    if (j10 < j11) {
                        j10 = j11;
                    }
                    if (i10 == lastIndex) {
                        break;
                    }
                    i10++;
                }
            }
            return j10;
        }
        throw new NoSuchElementException();
    }

    @e1(version = "1.7")
    @oj.i(name = "minOrThrow")
    public static final long minOrThrow(@NotNull long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        if (jArr.length != 0) {
            long j10 = jArr[0];
            int lastIndex = getLastIndex(jArr);
            int i10 = 1;
            if (1 <= lastIndex) {
                while (true) {
                    long j11 = jArr[i10];
                    if (j10 > j11) {
                        j10 = j11;
                    }
                    if (i10 == lastIndex) {
                        break;
                    }
                    i10++;
                }
            }
            return j10;
        }
        throw new NoSuchElementException();
    }

    @e1(version = "1.3")
    public static final char random(@NotNull char[] cArr, @NotNull kotlin.random.f random) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        if (cArr.length != 0) {
            return cArr[random.m(cArr.length)];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @NotNull
    public static final List<Integer> slice(@NotNull int[] iArr, @NotNull Iterable<Integer> indices) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(indices, "indices");
        int iCollectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(indices, 10);
        if (iCollectionSizeOrDefault == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList(iCollectionSizeOrDefault);
        Iterator<Integer> it = indices.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(iArr[it.next().intValue()]));
        }
        return arrayList;
    }

    @NotNull
    public static int[] sliceArray(@NotNull int[] iArr, @NotNull IntRange indices) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(indices, "indices");
        return indices.isEmpty() ? new int[0] : ArraysKt___ArraysJvmKt.copyOfRange(iArr, indices.u().intValue(), indices.i().intValue() + 1);
    }

    @e1(version = "1.4")
    public static void sortDescending(@NotNull double[] dArr, int i10, int i11) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        ArraysKt___ArraysJvmKt.sort(dArr, i10, i11);
        reverse(dArr, i10, i11);
    }

    @NotNull
    public static final <K, V, M extends Map<? super K, ? super V>> M associateByTo(@NotNull char[] cArr, @NotNull M destination, @NotNull Function1<? super Character, ? extends K> keySelector, @NotNull Function1<? super Character, ? extends V> valueTransform) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        for (char c10 : cArr) {
            destination.put(keySelector.invoke(Character.valueOf(c10)), valueTransform.invoke(Character.valueOf(c10)));
        }
        return destination;
    }

    @NotNull
    public static final <A extends Appendable> A joinTo(@NotNull float[] fArr, @NotNull A buffer, @NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence postfix, int i10, @NotNull CharSequence truncated, @Nullable Function1<? super Float, ? extends CharSequence> function1) throws IOException {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(truncated, "truncated");
        buffer.append(prefix);
        int i11 = 0;
        for (float f10 : fArr) {
            i11++;
            if (i11 > 1) {
                buffer.append(separator);
            }
            if (i10 >= 0 && i11 > i10) {
                break;
            }
            if (function1 != null) {
                buffer.append(function1.invoke(Float.valueOf(f10)));
            } else {
                buffer.append(String.valueOf(f10));
            }
        }
        if (i10 >= 0 && i11 > i10) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    @e1(version = "1.4")
    @Nullable
    public static final <R extends Comparable<? super R>> Long maxByOrNull(@NotNull long[] jArr, @NotNull Function1<? super Long, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (jArr.length == 0) {
            return null;
        }
        long j10 = jArr[0];
        int lastIndex = getLastIndex(jArr);
        if (lastIndex == 0) {
            return Long.valueOf(j10);
        }
        R rInvoke = selector.invoke(Long.valueOf(j10));
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                long j11 = jArr[i10];
                R rInvoke2 = selector.invoke(Long.valueOf(j11));
                if (rInvoke.compareTo(rInvoke2) < 0) {
                    j10 = j11;
                    rInvoke = rInvoke2;
                }
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return Long.valueOf(j10);
    }

    @e1(version = "1.4")
    @Nullable
    public static final <R extends Comparable<? super R>> Long minByOrNull(@NotNull long[] jArr, @NotNull Function1<? super Long, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (jArr.length == 0) {
            int i10 = 1 << 0;
            return null;
        }
        long j10 = jArr[0];
        int lastIndex = getLastIndex(jArr);
        if (lastIndex == 0) {
            return Long.valueOf(j10);
        }
        R rInvoke = selector.invoke(Long.valueOf(j10));
        int i11 = 1;
        if (1 <= lastIndex) {
            while (true) {
                long j11 = jArr[i11];
                R rInvoke2 = selector.invoke(Long.valueOf(j11));
                if (rInvoke.compareTo(rInvoke2) > 0) {
                    j10 = j11;
                    rInvoke = rInvoke2;
                }
                if (i11 == lastIndex) {
                    break;
                }
                i11++;
            }
        }
        return Long.valueOf(j10);
    }

    @e1(version = "1.4")
    @Nullable
    public static final Boolean reduceIndexedOrNull(@NotNull boolean[] zArr, @NotNull n<? super Integer, ? super Boolean, ? super Boolean, Boolean> operation) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (zArr.length == 0) {
            int i10 = 7 & 0;
            return null;
        }
        boolean zBooleanValue = zArr[0];
        int lastIndex = getLastIndex(zArr);
        int i11 = 1;
        if (1 <= lastIndex) {
            while (true) {
                zBooleanValue = operation.invoke(Integer.valueOf(i11), Boolean.valueOf(zBooleanValue), Boolean.valueOf(zArr[i11])).booleanValue();
                if (i11 == lastIndex) {
                    break;
                }
                i11++;
            }
        }
        return Boolean.valueOf(zBooleanValue);
    }

    @e1(version = "1.4")
    @Nullable
    public static final Boolean reduceOrNull(@NotNull boolean[] zArr, @NotNull Function2<? super Boolean, ? super Boolean, Boolean> operation) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (zArr.length == 0) {
            return null;
        }
        boolean zBooleanValue = zArr[0];
        int lastIndex = getLastIndex(zArr);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                zBooleanValue = operation.invoke(Boolean.valueOf(zBooleanValue), Boolean.valueOf(zArr[i10])).booleanValue();
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return Boolean.valueOf(zBooleanValue);
    }

    @e1(version = "1.4")
    public static final void shuffle(@NotNull float[] fArr, @NotNull kotlin.random.f random) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        for (int lastIndex = getLastIndex(fArr); lastIndex > 0; lastIndex--) {
            int iM = random.m(lastIndex + 1);
            float f10 = fArr[lastIndex];
            fArr[lastIndex] = fArr[iM];
            fArr[iM] = f10;
        }
    }

    @NotNull
    public static final List<Boolean> dropWhile(@NotNull boolean[] zArr, @NotNull Function1<? super Boolean, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        boolean z10 = false;
        for (boolean z11 : zArr) {
            if (z10) {
                arrayList.add(Boolean.valueOf(z11));
            } else if (!predicate.invoke(Boolean.valueOf(z11)).booleanValue()) {
                arrayList.add(Boolean.valueOf(z11));
                z10 = true;
            }
        }
        return arrayList;
    }

    public static final long first(@NotNull long[] jArr, @NotNull Function1<? super Long, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (long j10 : jArr) {
            if (predicate.invoke(Long.valueOf(j10)).booleanValue()) {
                return j10;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @NotNull
    public static final <K, M extends Map<? super K, List<Float>>> M groupByTo(@NotNull float[] fArr, @NotNull M destination, @NotNull Function1<? super Float, ? extends K> keySelector) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        for (float f10 : fArr) {
            K kInvoke = keySelector.invoke(Float.valueOf(f10));
            Object arrayList = destination.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                destination.put(kInvoke, arrayList);
            }
            ((List) arrayList).add(Float.valueOf(f10));
        }
        return destination;
    }

    public static final short last(@NotNull short[] sArr, @NotNull Function1<? super Short, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = sArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i10 = length - 1;
                short s10 = sArr[length];
                if (predicate.invoke(Short.valueOf(s10)).booleanValue()) {
                    return s10;
                }
                if (i10 >= 0) {
                    length = i10;
                }
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @u0
    @e1(version = "1.4")
    @f
    private static final <R> R maxOfWithOrNull(boolean[] zArr, Comparator<? super R> comparator, Function1<? super Boolean, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (zArr.length == 0) {
            return null;
        }
        R rInvoke = selector.invoke(Boolean.valueOf(zArr[0]));
        int lastIndex = getLastIndex(zArr);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                R rInvoke2 = selector.invoke(Boolean.valueOf(zArr[i10]));
                if (comparator.compare(rInvoke, rInvoke2) < 0) {
                    rInvoke = rInvoke2;
                }
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return rInvoke;
    }

    @e1(version = "1.4")
    @Nullable
    public static final Double maxWithOrNull(@NotNull double[] dArr, @NotNull Comparator<? super Double> comparator) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (dArr.length == 0) {
            return null;
        }
        double d10 = dArr[0];
        int lastIndex = getLastIndex(dArr);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                double d11 = dArr[i10];
                if (comparator.compare(Double.valueOf(d10), Double.valueOf(d11)) < 0) {
                    d10 = d11;
                }
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return Double.valueOf(d10);
    }

    @u0
    @e1(version = "1.4")
    @f
    private static final <R> R minOfWithOrNull(boolean[] zArr, Comparator<? super R> comparator, Function1<? super Boolean, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (zArr.length == 0) {
            return null;
        }
        R rInvoke = selector.invoke(Boolean.valueOf(zArr[0]));
        int lastIndex = getLastIndex(zArr);
        int i10 = 1;
        int i11 = 4 | 1;
        if (1 <= lastIndex) {
            while (true) {
                R rInvoke2 = selector.invoke(Boolean.valueOf(zArr[i10]));
                if (comparator.compare(rInvoke, rInvoke2) > 0) {
                    rInvoke = rInvoke2;
                }
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return rInvoke;
    }

    @e1(version = "1.4")
    @Nullable
    public static final Double minWithOrNull(@NotNull double[] dArr, @NotNull Comparator<? super Double> comparator) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (dArr.length == 0) {
            return null;
        }
        double d10 = dArr[0];
        int lastIndex = getLastIndex(dArr);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                double d11 = dArr[i10];
                if (comparator.compare(Double.valueOf(d10), Double.valueOf(d11)) > 0) {
                    d10 = d11;
                }
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return Double.valueOf(d10);
    }

    @NotNull
    public static final Pair<List<Float>, List<Float>> partition(@NotNull float[] fArr, @NotNull Function1<? super Float, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (float f10 : fArr) {
            if (predicate.invoke(Float.valueOf(f10)).booleanValue()) {
                arrayList.add(Float.valueOf(f10));
            } else {
                arrayList2.add(Float.valueOf(f10));
            }
        }
        return new Pair<>(arrayList, arrayList2);
    }

    public static final boolean reduce(@NotNull boolean[] zArr, @NotNull Function2<? super Boolean, ? super Boolean, Boolean> operation) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (zArr.length != 0) {
            boolean zBooleanValue = zArr[0];
            int lastIndex = getLastIndex(zArr);
            int i10 = 1;
            if (1 <= lastIndex) {
                while (true) {
                    zBooleanValue = operation.invoke(Boolean.valueOf(zBooleanValue), Boolean.valueOf(zArr[i10])).booleanValue();
                    if (i10 == lastIndex) {
                        break;
                    }
                    i10++;
                }
            }
            return zBooleanValue;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    public static final boolean reduceIndexed(@NotNull boolean[] zArr, @NotNull n<? super Integer, ? super Boolean, ? super Boolean, Boolean> operation) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (zArr.length != 0) {
            boolean zBooleanValue = zArr[0];
            int lastIndex = getLastIndex(zArr);
            int i10 = 1;
            if (1 <= lastIndex) {
                while (true) {
                    zBooleanValue = operation.invoke(Integer.valueOf(i10), Boolean.valueOf(zBooleanValue), Boolean.valueOf(zArr[i10])).booleanValue();
                    if (i10 == lastIndex) {
                        break;
                    }
                    i10++;
                }
            }
            return zBooleanValue;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    public static final void reverse(@NotNull boolean[] zArr) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        int length = (zArr.length / 2) - 1;
        if (length < 0) {
            return;
        }
        int lastIndex = getLastIndex(zArr);
        if (length < 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            boolean z10 = zArr[i10];
            zArr[i10] = zArr[lastIndex];
            zArr[lastIndex] = z10;
            lastIndex--;
            if (i10 == length) {
                return;
            } else {
                i10++;
            }
        }
    }

    @e1(version = "1.4")
    @f
    private static final <R> List<R> runningFold(boolean[] zArr, R r10, Function2<? super R, ? super Boolean, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (zArr.length == 0) {
            return CollectionsKt__CollectionsJVMKt.listOf(r10);
        }
        ArrayList arrayList = new ArrayList(zArr.length + 1);
        arrayList.add(r10);
        for (boolean z10 : zArr) {
            r10 = operation.invoke(r10, Boolean.valueOf(z10));
            arrayList.add(r10);
        }
        return arrayList;
    }

    @e1(version = "1.4")
    @f
    private static final <R> List<R> runningFoldIndexed(boolean[] zArr, R r10, n<? super Integer, ? super R, ? super Boolean, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (zArr.length == 0) {
            return CollectionsKt__CollectionsJVMKt.listOf(r10);
        }
        ArrayList arrayList = new ArrayList(zArr.length + 1);
        arrayList.add(r10);
        int length = zArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            r10 = operation.invoke(Integer.valueOf(i10), r10, Boolean.valueOf(zArr[i10]));
            arrayList.add(r10);
        }
        return arrayList;
    }

    @NotNull
    public static long[] sliceArray(@NotNull long[] jArr, @NotNull IntRange indices) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(indices, "indices");
        return indices.isEmpty() ? new long[0] : ArraysKt___ArraysJvmKt.copyOfRange(jArr, indices.u().intValue(), indices.i().intValue() + 1);
    }

    @e1(version = "1.4")
    public static final void sortDescending(@NotNull char[] cArr, int i10, int i11) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        ArraysKt___ArraysJvmKt.sort(cArr, i10, i11);
        reverse(cArr, i10, i11);
    }

    @NotNull
    public static final List<Float> take(@NotNull float[] fArr, int i10) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
        }
        if (i10 == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        if (i10 >= fArr.length) {
            return toList(fArr);
        }
        if (i10 == 1) {
            return CollectionsKt__CollectionsJVMKt.listOf(Float.valueOf(fArr[0]));
        }
        ArrayList arrayList = new ArrayList(i10);
        int i11 = 0;
        for (float f10 : fArr) {
            arrayList.add(Float.valueOf(f10));
            i11++;
            if (i11 == i10) {
                break;
            }
        }
        return arrayList;
    }

    @NotNull
    public static final List<Float> takeLast(@NotNull float[] fArr, int i10) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
        }
        if (i10 == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        int length = fArr.length;
        if (i10 >= length) {
            return toList(fArr);
        }
        if (i10 == 1) {
            return CollectionsKt__CollectionsJVMKt.listOf(Float.valueOf(fArr[length - 1]));
        }
        ArrayList arrayList = new ArrayList(i10);
        for (int i11 = length - i10; i11 < length; i11++) {
            arrayList.add(Float.valueOf(fArr[i11]));
        }
        return arrayList;
    }

    @NotNull
    public static final <R, V> List<V> zip(@NotNull short[] sArr, @NotNull Iterable<? extends R> other, @NotNull Function2<? super Short, ? super R, ? extends V> transform) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int length = sArr.length;
        ArrayList arrayList = new ArrayList(Math.min(CollectionsKt__IterablesKt.collectionSizeOrDefault(other, 10), length));
        int i10 = 0;
        for (R r10 : other) {
            if (i10 >= length) {
                break;
            }
            arrayList.add(transform.invoke(Short.valueOf(sArr[i10]), r10));
            i10++;
        }
        return arrayList;
    }

    @NotNull
    public static final <T, K, V> Map<K, V> associateBy(@NotNull T[] tArr, @NotNull Function1<? super T, ? extends K> keySelector, @NotNull Function1<? super T, ? extends V> valueTransform) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(r.u(MapsKt__MapsJVMKt.mapCapacity(tArr.length), 16));
        for (T t10 : tArr) {
            linkedHashMap.put(keySelector.invoke(t10), valueTransform.invoke(t10));
        }
        return linkedHashMap;
    }

    @NotNull
    public static final <K> List<Double> distinctBy(@NotNull double[] dArr, @NotNull Function1<? super Double, ? extends K> selector) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (double d10 : dArr) {
            if (hashSet.add(selector.invoke(Double.valueOf(d10)))) {
                arrayList.add(Double.valueOf(d10));
            }
        }
        return arrayList;
    }

    @u0
    @e1(version = "1.4")
    @f
    private static final double maxOf(double[] dArr, Function1<? super Double, Double> selector) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (dArr.length != 0) {
            double dDoubleValue = selector.invoke(Double.valueOf(dArr[0])).doubleValue();
            int lastIndex = getLastIndex(dArr);
            int i10 = 1;
            if (1 <= lastIndex) {
                while (true) {
                    dDoubleValue = Math.max(dDoubleValue, selector.invoke(Double.valueOf(dArr[i10])).doubleValue());
                    if (i10 == lastIndex) {
                        break;
                    }
                    i10++;
                }
            }
            return dDoubleValue;
        }
        throw new NoSuchElementException();
    }

    @u0
    @e1(version = "1.4")
    @f
    /* JADX INFO: renamed from: maxOfOrNull, reason: collision with other method in class */
    private static final Double m807maxOfOrNull(double[] dArr, Function1<? super Double, Double> selector) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (dArr.length == 0) {
            return null;
        }
        double dDoubleValue = selector.invoke(Double.valueOf(dArr[0])).doubleValue();
        int lastIndex = getLastIndex(dArr);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                dDoubleValue = Math.max(dDoubleValue, selector.invoke(Double.valueOf(dArr[i10])).doubleValue());
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return Double.valueOf(dDoubleValue);
    }

    @u0
    @e1(version = "1.4")
    @f
    private static final <R> R maxOfWith(double[] dArr, Comparator<? super R> comparator, Function1<? super Double, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (dArr.length == 0) {
            throw new NoSuchElementException();
        }
        R rInvoke = selector.invoke(Double.valueOf(dArr[0]));
        int lastIndex = getLastIndex(dArr);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                R rInvoke2 = selector.invoke(Double.valueOf(dArr[i10]));
                if (comparator.compare(rInvoke, rInvoke2) < 0) {
                    rInvoke = rInvoke2;
                }
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return rInvoke;
    }

    @e1(version = "1.7")
    @oj.i(name = "maxWithOrThrow")
    public static final double maxWithOrThrow(@NotNull double[] dArr, @NotNull Comparator<? super Double> comparator) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (dArr.length != 0) {
            int i10 = 4 | 0;
            double d10 = dArr[0];
            int lastIndex = getLastIndex(dArr);
            int i11 = 1;
            if (1 <= lastIndex) {
                while (true) {
                    double d11 = dArr[i11];
                    if (comparator.compare(Double.valueOf(d10), Double.valueOf(d11)) < 0) {
                        d10 = d11;
                    }
                    if (i11 == lastIndex) {
                        break;
                    }
                    i11++;
                }
            }
            return d10;
        }
        throw new NoSuchElementException();
    }

    @u0
    @e1(version = "1.4")
    @f
    private static final double minOf(double[] dArr, Function1<? super Double, Double> selector) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (dArr.length == 0) {
            throw new NoSuchElementException();
        }
        double dDoubleValue = selector.invoke(Double.valueOf(dArr[0])).doubleValue();
        int lastIndex = getLastIndex(dArr);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                dDoubleValue = Math.min(dDoubleValue, selector.invoke(Double.valueOf(dArr[i10])).doubleValue());
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return dDoubleValue;
    }

    @u0
    @e1(version = "1.4")
    @f
    /* JADX INFO: renamed from: minOfOrNull, reason: collision with other method in class */
    private static final Double m843minOfOrNull(double[] dArr, Function1<? super Double, Double> selector) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (dArr.length == 0) {
            return null;
        }
        double dDoubleValue = selector.invoke(Double.valueOf(dArr[0])).doubleValue();
        int lastIndex = getLastIndex(dArr);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                dDoubleValue = Math.min(dDoubleValue, selector.invoke(Double.valueOf(dArr[i10])).doubleValue());
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return Double.valueOf(dDoubleValue);
    }

    @u0
    @e1(version = "1.4")
    @f
    private static final <R> R minOfWith(double[] dArr, Comparator<? super R> comparator, Function1<? super Double, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (dArr.length != 0) {
            R rInvoke = selector.invoke(Double.valueOf(dArr[0]));
            int lastIndex = getLastIndex(dArr);
            int i10 = 1;
            if (1 <= lastIndex) {
                while (true) {
                    R rInvoke2 = selector.invoke(Double.valueOf(dArr[i10]));
                    if (comparator.compare(rInvoke, rInvoke2) > 0) {
                        rInvoke = rInvoke2;
                    }
                    if (i10 == lastIndex) {
                        break;
                    }
                    i10++;
                }
            }
            return rInvoke;
        }
        throw new NoSuchElementException();
    }

    @e1(version = "1.7")
    @oj.i(name = "minWithOrThrow")
    public static final double minWithOrThrow(@NotNull double[] dArr, @NotNull Comparator<? super Double> comparator) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (dArr.length != 0) {
            int i10 = 3 << 0;
            double d10 = dArr[0];
            int lastIndex = getLastIndex(dArr);
            int i11 = 1;
            if (1 <= lastIndex) {
                while (true) {
                    double d11 = dArr[i11];
                    if (comparator.compare(Double.valueOf(d10), Double.valueOf(d11)) > 0) {
                        d10 = d11;
                    }
                    if (i11 == lastIndex) {
                        break;
                    }
                    i11++;
                }
            }
            return d10;
        }
        throw new NoSuchElementException();
    }

    @e1(version = "1.4")
    @f
    private static final List<Double> runningReduce(double[] dArr, Function2<? super Double, ? super Double, Double> operation) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (dArr.length == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        double dDoubleValue = dArr[0];
        ArrayList arrayList = new ArrayList(dArr.length);
        arrayList.add(Double.valueOf(dDoubleValue));
        int length = dArr.length;
        for (int i10 = 1; i10 < length; i10++) {
            dDoubleValue = operation.invoke(Double.valueOf(dDoubleValue), Double.valueOf(dArr[i10])).doubleValue();
            arrayList.add(Double.valueOf(dDoubleValue));
        }
        return arrayList;
    }

    @e1(version = "1.4")
    @f
    private static final List<Double> runningReduceIndexed(double[] dArr, n<? super Integer, ? super Double, ? super Double, Double> operation) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (dArr.length == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        double dDoubleValue = dArr[0];
        ArrayList arrayList = new ArrayList(dArr.length);
        arrayList.add(Double.valueOf(dDoubleValue));
        int length = dArr.length;
        for (int i10 = 1; i10 < length; i10++) {
            dDoubleValue = operation.invoke(Integer.valueOf(i10), Double.valueOf(dDoubleValue), Double.valueOf(dArr[i10])).doubleValue();
            arrayList.add(Double.valueOf(dDoubleValue));
        }
        return arrayList;
    }

    public static final <T> T single(@NotNull T[] tArr, @NotNull Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        T t10 = null;
        boolean z10 = false;
        for (T t11 : tArr) {
            if (predicate.invoke(t11).booleanValue()) {
                if (z10) {
                    throw new IllegalArgumentException("Array contains more than one matching element.");
                }
                int i10 = 2 ^ 1;
                z10 = true;
                t10 = t11;
            }
        }
        if (z10) {
            return t10;
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    public static final float first(@NotNull float[] fArr, @NotNull Function1<? super Float, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (float f10 : fArr) {
            if (predicate.invoke(Float.valueOf(f10)).booleanValue()) {
                return f10;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @e1(version = "1.4")
    @Nullable
    public static Float maxOrNull(@NotNull float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        if (fArr.length == 0) {
            return null;
        }
        float fMax = fArr[0];
        int lastIndex = getLastIndex(fArr);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                fMax = Math.max(fMax, fArr[i10]);
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return Float.valueOf(fMax);
    }

    @e1(version = "1.4")
    @Nullable
    public static Float minOrNull(@NotNull float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        if (fArr.length == 0) {
            return null;
        }
        float fMin = fArr[0];
        int lastIndex = getLastIndex(fArr);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                fMin = Math.min(fMin, fArr[i10]);
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return Float.valueOf(fMin);
    }

    @NotNull
    public static final float[] sliceArray(@NotNull float[] fArr, @NotNull IntRange indices) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(indices, "indices");
        return indices.isEmpty() ? new float[0] : ArraysKt___ArraysJvmKt.copyOfRange(fArr, indices.u().intValue(), indices.i().intValue() + 1);
    }

    @e1(version = "1.7")
    @oj.i(name = "maxOrThrow")
    public static final float maxOrThrow(@NotNull float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        if (fArr.length != 0) {
            float fMax = fArr[0];
            int lastIndex = getLastIndex(fArr);
            int i10 = 1;
            if (1 <= lastIndex) {
                while (true) {
                    fMax = Math.max(fMax, fArr[i10]);
                    if (i10 == lastIndex) {
                        break;
                    }
                    i10++;
                }
            }
            return fMax;
        }
        throw new NoSuchElementException();
    }

    @e1(version = "1.7")
    @oj.i(name = "minOrThrow")
    public static final float minOrThrow(@NotNull float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        if (fArr.length == 0) {
            throw new NoSuchElementException();
        }
        float fMin = fArr[0];
        int lastIndex = getLastIndex(fArr);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                fMin = Math.min(fMin, fArr[i10]);
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return fMin;
    }

    @NotNull
    public static final List<Long> slice(@NotNull long[] jArr, @NotNull Iterable<Integer> indices) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(indices, "indices");
        int iCollectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(indices, 10);
        if (iCollectionSizeOrDefault == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList(iCollectionSizeOrDefault);
        Iterator<Integer> it = indices.iterator();
        while (it.hasNext()) {
            arrayList.add(Long.valueOf(jArr[it.next().intValue()]));
        }
        return arrayList;
    }

    public static final double first(@NotNull double[] dArr, @NotNull Function1<? super Double, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (double d10 : dArr) {
            if (predicate.invoke(Double.valueOf(d10)).booleanValue()) {
                return d10;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    public static final int last(@NotNull int[] iArr, @NotNull Function1<? super Integer, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = iArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i10 = length - 1;
                int i11 = iArr[length];
                if (predicate.invoke(Integer.valueOf(i11)).booleanValue()) {
                    return i11;
                }
                if (i10 >= 0) {
                    length = i10;
                }
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @e1(version = "1.4")
    @Nullable
    public static final Character reduceIndexedOrNull(@NotNull char[] cArr, @NotNull n<? super Integer, ? super Character, ? super Character, Character> operation) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (cArr.length == 0) {
            return null;
        }
        char cCharValue = cArr[0];
        int lastIndex = getLastIndex(cArr);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                cCharValue = operation.invoke(Integer.valueOf(i10), Character.valueOf(cCharValue), Character.valueOf(cArr[i10])).charValue();
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return Character.valueOf(cCharValue);
    }

    @e1(version = "1.4")
    @Nullable
    public static final Character reduceOrNull(@NotNull char[] cArr, @NotNull Function2<? super Character, ? super Character, Character> operation) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (cArr.length == 0) {
            return null;
        }
        char cCharValue = cArr[0];
        int lastIndex = getLastIndex(cArr);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                cCharValue = operation.invoke(Character.valueOf(cCharValue), Character.valueOf(cArr[i10])).charValue();
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return Character.valueOf(cCharValue);
    }

    @e1(version = "1.4")
    public static final void shuffle(@NotNull double[] dArr, @NotNull kotlin.random.f random) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        for (int lastIndex = getLastIndex(dArr); lastIndex > 0; lastIndex--) {
            int iM = random.m(lastIndex + 1);
            double d10 = dArr[lastIndex];
            dArr[lastIndex] = dArr[iM];
            dArr[iM] = d10;
        }
    }

    @NotNull
    public static final double[] sliceArray(@NotNull double[] dArr, @NotNull IntRange indices) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(indices, "indices");
        return indices.isEmpty() ? new double[0] : ArraysKt___ArraysJvmKt.copyOfRange(dArr, indices.u().intValue(), indices.i().intValue() + 1);
    }

    @NotNull
    public static final <R, V> List<V> zip(@NotNull int[] iArr, @NotNull Iterable<? extends R> other, @NotNull Function2<? super Integer, ? super R, ? extends V> transform) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int length = iArr.length;
        ArrayList arrayList = new ArrayList(Math.min(CollectionsKt__IterablesKt.collectionSizeOrDefault(other, 10), length));
        int i10 = 0;
        for (R r10 : other) {
            if (i10 >= length) {
                break;
            }
            arrayList.add(transform.invoke(Integer.valueOf(iArr[i10]), r10));
            i10++;
        }
        return arrayList;
    }

    @NotNull
    public static final <K, V> Map<K, V> associateBy(@NotNull byte[] bArr, @NotNull Function1<? super Byte, ? extends K> keySelector, @NotNull Function1<? super Byte, ? extends V> valueTransform) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(r.u(MapsKt__MapsJVMKt.mapCapacity(bArr.length), 16));
        for (byte b10 : bArr) {
            linkedHashMap.put(keySelector.invoke(Byte.valueOf(b10)), valueTransform.invoke(Byte.valueOf(b10)));
        }
        return linkedHashMap;
    }

    @NotNull
    public static final List<Character> dropWhile(@NotNull char[] cArr, @NotNull Function1<? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        boolean z10 = false;
        for (char c10 : cArr) {
            if (z10) {
                arrayList.add(Character.valueOf(c10));
            } else if (!predicate.invoke(Character.valueOf(c10)).booleanValue()) {
                arrayList.add(Character.valueOf(c10));
                z10 = true;
            }
        }
        return arrayList;
    }

    @NotNull
    public static final <K> Map<K, List<Float>> groupBy(@NotNull float[] fArr, @NotNull Function1<? super Float, ? extends K> keySelector) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (float f10 : fArr) {
            K kInvoke = keySelector.invoke(Float.valueOf(f10));
            Object arrayList = linkedHashMap.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(kInvoke, arrayList);
            }
            ((List) arrayList).add(Float.valueOf(f10));
        }
        return linkedHashMap;
    }

    @e1(version = "1.7")
    @oj.i(name = "maxByOrThrow")
    public static final <R extends Comparable<? super R>> float maxByOrThrow(@NotNull float[] fArr, @NotNull Function1<? super Float, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (fArr.length != 0) {
            float f10 = fArr[0];
            int lastIndex = getLastIndex(fArr);
            if (lastIndex != 0) {
                R rInvoke = selector.invoke(Float.valueOf(f10));
                int i10 = 1;
                if (1 <= lastIndex) {
                    while (true) {
                        float f11 = fArr[i10];
                        R rInvoke2 = selector.invoke(Float.valueOf(f11));
                        if (rInvoke.compareTo(rInvoke2) < 0) {
                            f10 = f11;
                            rInvoke = rInvoke2;
                        }
                        if (i10 == lastIndex) {
                            break;
                        }
                        i10++;
                    }
                }
            }
            return f10;
        }
        throw new NoSuchElementException();
    }

    @u0
    @e1(version = "1.4")
    @f
    private static final <R> R maxOfWithOrNull(char[] cArr, Comparator<? super R> comparator, Function1<? super Character, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (cArr.length == 0) {
            return null;
        }
        R rInvoke = selector.invoke(Character.valueOf(cArr[0]));
        int lastIndex = getLastIndex(cArr);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                R rInvoke2 = selector.invoke(Character.valueOf(cArr[i10]));
                if (comparator.compare(rInvoke, rInvoke2) < 0) {
                    rInvoke = rInvoke2;
                }
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return rInvoke;
    }

    @e1(version = "1.7")
    @oj.i(name = "minByOrThrow")
    public static final <R extends Comparable<? super R>> float minByOrThrow(@NotNull float[] fArr, @NotNull Function1<? super Float, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (fArr.length == 0) {
            throw new NoSuchElementException();
        }
        float f10 = fArr[0];
        int lastIndex = getLastIndex(fArr);
        if (lastIndex != 0) {
            R rInvoke = selector.invoke(Float.valueOf(f10));
            int i10 = 1;
            if (1 <= lastIndex) {
                while (true) {
                    float f11 = fArr[i10];
                    R rInvoke2 = selector.invoke(Float.valueOf(f11));
                    if (rInvoke.compareTo(rInvoke2) > 0) {
                        f10 = f11;
                        rInvoke = rInvoke2;
                    }
                    if (i10 == lastIndex) {
                        break;
                    }
                    i10++;
                }
            }
        }
        return f10;
    }

    @u0
    @e1(version = "1.4")
    @f
    private static final <R> R minOfWithOrNull(char[] cArr, Comparator<? super R> comparator, Function1<? super Character, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (cArr.length == 0) {
            return null;
        }
        R rInvoke = selector.invoke(Character.valueOf(cArr[0]));
        int lastIndex = getLastIndex(cArr);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                R rInvoke2 = selector.invoke(Character.valueOf(cArr[i10]));
                if (comparator.compare(rInvoke, rInvoke2) > 0) {
                    rInvoke = rInvoke2;
                }
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return rInvoke;
    }

    public static final char reduce(@NotNull char[] cArr, @NotNull Function2<? super Character, ? super Character, Character> operation) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (cArr.length != 0) {
            char cCharValue = cArr[0];
            int lastIndex = getLastIndex(cArr);
            int i10 = 1;
            if (1 <= lastIndex) {
                while (true) {
                    cCharValue = operation.invoke(Character.valueOf(cCharValue), Character.valueOf(cArr[i10])).charValue();
                    if (i10 == lastIndex) {
                        break;
                    }
                    i10++;
                }
            }
            return cCharValue;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    public static final char reduceIndexed(@NotNull char[] cArr, @NotNull n<? super Integer, ? super Character, ? super Character, Character> operation) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (cArr.length != 0) {
            char cCharValue = cArr[0];
            int lastIndex = getLastIndex(cArr);
            int i10 = 1;
            if (1 <= lastIndex) {
                while (true) {
                    cCharValue = operation.invoke(Integer.valueOf(i10), Character.valueOf(cCharValue), Character.valueOf(cArr[i10])).charValue();
                    if (i10 == lastIndex) {
                        break;
                    }
                    i10++;
                }
            }
            return cCharValue;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    public static final void reverse(@NotNull char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        int length = (cArr.length / 2) - 1;
        if (length >= 0) {
            int lastIndex = getLastIndex(cArr);
            if (length >= 0) {
                int i10 = 0;
                while (true) {
                    char c10 = cArr[i10];
                    cArr[i10] = cArr[lastIndex];
                    cArr[lastIndex] = c10;
                    lastIndex--;
                    if (i10 == length) {
                        break;
                    } else {
                        i10++;
                    }
                }
            }
        }
    }

    @e1(version = "1.4")
    @f
    private static final <R> List<R> runningFold(char[] cArr, R r10, Function2<? super R, ? super Character, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (cArr.length == 0) {
            return CollectionsKt__CollectionsJVMKt.listOf(r10);
        }
        ArrayList arrayList = new ArrayList(cArr.length + 1);
        arrayList.add(r10);
        for (char c10 : cArr) {
            r10 = operation.invoke(r10, Character.valueOf(c10));
            arrayList.add(r10);
        }
        return arrayList;
    }

    @e1(version = "1.4")
    @f
    private static final <R> List<R> runningFoldIndexed(char[] cArr, R r10, n<? super Integer, ? super R, ? super Character, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (cArr.length == 0) {
            return CollectionsKt__CollectionsJVMKt.listOf(r10);
        }
        ArrayList arrayList = new ArrayList(cArr.length + 1);
        arrayList.add(r10);
        int length = cArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            r10 = operation.invoke(Integer.valueOf(i10), r10, Character.valueOf(cArr[i10]));
            arrayList.add(r10);
        }
        return arrayList;
    }

    public static final byte single(@NotNull byte[] bArr, @NotNull Function1<? super Byte, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Byte bValueOf = null;
        boolean z10 = false;
        for (byte b10 : bArr) {
            if (predicate.invoke(Byte.valueOf(b10)).booleanValue()) {
                if (!z10) {
                    bValueOf = Byte.valueOf(b10);
                    z10 = true;
                } else {
                    throw new IllegalArgumentException("Array contains more than one matching element.");
                }
            }
        }
        if (!z10) {
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        }
        Intrinsics.checkNotNull(bValueOf, "null cannot be cast to non-null type kotlin.Byte");
        return bValueOf.byteValue();
    }

    public static final boolean first(@NotNull boolean[] zArr, @NotNull Function1<? super Boolean, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (boolean z10 : zArr) {
            if (predicate.invoke(Boolean.valueOf(z10)).booleanValue()) {
                return z10;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @NotNull
    public static final <A extends Appendable> A joinTo(@NotNull double[] dArr, @NotNull A buffer, @NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence postfix, int i10, @NotNull CharSequence truncated, @Nullable Function1<? super Double, ? extends CharSequence> function1) throws IOException {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(truncated, "truncated");
        buffer.append(prefix);
        int i11 = 0;
        for (double d10 : dArr) {
            i11++;
            if (i11 > 1) {
                buffer.append(separator);
            }
            if (i10 >= 0 && i11 > i10) {
                break;
            }
            if (function1 != null) {
                buffer.append(function1.invoke(Double.valueOf(d10)));
            } else {
                buffer.append(String.valueOf(d10));
            }
        }
        if (i10 >= 0 && i11 > i10) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    @e1(version = "1.4")
    @Nullable
    public static final Boolean maxWithOrNull(@NotNull boolean[] zArr, @NotNull Comparator<? super Boolean> comparator) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (zArr.length == 0) {
            return null;
        }
        boolean z10 = zArr[0];
        int lastIndex = getLastIndex(zArr);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                boolean z11 = zArr[i10];
                if (comparator.compare(Boolean.valueOf(z10), Boolean.valueOf(z11)) < 0) {
                    z10 = z11;
                }
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return Boolean.valueOf(z10);
    }

    @e1(version = "1.4")
    @Nullable
    public static final Boolean minWithOrNull(@NotNull boolean[] zArr, @NotNull Comparator<? super Boolean> comparator) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (zArr.length == 0) {
            return null;
        }
        boolean z10 = zArr[0];
        int lastIndex = getLastIndex(zArr);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                boolean z11 = zArr[i10];
                if (comparator.compare(Boolean.valueOf(z10), Boolean.valueOf(z11)) > 0) {
                    z10 = z11;
                }
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return Boolean.valueOf(z10);
    }

    @NotNull
    public static final boolean[] sliceArray(@NotNull boolean[] zArr, @NotNull IntRange indices) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(indices, "indices");
        return indices.isEmpty() ? new boolean[0] : ArraysKt___ArraysJvmKt.copyOfRange(zArr, indices.u().intValue(), indices.i().intValue() + 1);
    }

    @NotNull
    public static final <K> List<Boolean> distinctBy(@NotNull boolean[] zArr, @NotNull Function1<? super Boolean, ? extends K> selector) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (boolean z10 : zArr) {
            if (hashSet.add(selector.invoke(Boolean.valueOf(z10)))) {
                arrayList.add(Boolean.valueOf(z10));
            }
        }
        return arrayList;
    }

    @NotNull
    public static final <K, M extends Map<? super K, List<Double>>> M groupByTo(@NotNull double[] dArr, @NotNull M destination, @NotNull Function1<? super Double, ? extends K> keySelector) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        for (double d10 : dArr) {
            K kInvoke = keySelector.invoke(Double.valueOf(d10));
            Object arrayList = destination.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                destination.put(kInvoke, arrayList);
            }
            ((List) arrayList).add(Double.valueOf(d10));
        }
        return destination;
    }

    @u0
    @e1(version = "1.4")
    @f
    private static final double maxOf(boolean[] zArr, Function1<? super Boolean, Double> selector) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (zArr.length != 0) {
            double dDoubleValue = selector.invoke(Boolean.valueOf(zArr[0])).doubleValue();
            int lastIndex = getLastIndex(zArr);
            int i10 = 1;
            if (1 <= lastIndex) {
                while (true) {
                    dDoubleValue = Math.max(dDoubleValue, selector.invoke(Boolean.valueOf(zArr[i10])).doubleValue());
                    if (i10 == lastIndex) {
                        break;
                    }
                    i10++;
                }
            }
            return dDoubleValue;
        }
        throw new NoSuchElementException();
    }

    @u0
    @e1(version = "1.4")
    @f
    /* JADX INFO: renamed from: maxOfOrNull, reason: collision with other method in class */
    private static final Double m813maxOfOrNull(boolean[] zArr, Function1<? super Boolean, Double> selector) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (zArr.length == 0) {
            return null;
        }
        double dDoubleValue = selector.invoke(Boolean.valueOf(zArr[0])).doubleValue();
        int lastIndex = getLastIndex(zArr);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                dDoubleValue = Math.max(dDoubleValue, selector.invoke(Boolean.valueOf(zArr[i10])).doubleValue());
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return Double.valueOf(dDoubleValue);
    }

    @u0
    @e1(version = "1.4")
    @f
    private static final <R> R maxOfWith(boolean[] zArr, Comparator<? super R> comparator, Function1<? super Boolean, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (zArr.length != 0) {
            R rInvoke = selector.invoke(Boolean.valueOf(zArr[0]));
            int lastIndex = getLastIndex(zArr);
            int i10 = 1;
            if (1 <= lastIndex) {
                while (true) {
                    R rInvoke2 = selector.invoke(Boolean.valueOf(zArr[i10]));
                    if (comparator.compare(rInvoke, rInvoke2) < 0) {
                        rInvoke = rInvoke2;
                    }
                    if (i10 == lastIndex) {
                        break;
                    }
                    i10++;
                }
            }
            return rInvoke;
        }
        throw new NoSuchElementException();
    }

    @e1(version = "1.7")
    @oj.i(name = "maxWithOrThrow")
    public static final boolean maxWithOrThrow(@NotNull boolean[] zArr, @NotNull Comparator<? super Boolean> comparator) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (zArr.length == 0) {
            throw new NoSuchElementException();
        }
        boolean z10 = zArr[0];
        int lastIndex = getLastIndex(zArr);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                boolean z11 = zArr[i10];
                if (comparator.compare(Boolean.valueOf(z10), Boolean.valueOf(z11)) < 0) {
                    z10 = z11;
                }
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return z10;
    }

    @u0
    @e1(version = "1.4")
    @f
    private static final double minOf(boolean[] zArr, Function1<? super Boolean, Double> selector) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (zArr.length == 0) {
            throw new NoSuchElementException();
        }
        double dDoubleValue = selector.invoke(Boolean.valueOf(zArr[0])).doubleValue();
        int lastIndex = getLastIndex(zArr);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                dDoubleValue = Math.min(dDoubleValue, selector.invoke(Boolean.valueOf(zArr[i10])).doubleValue());
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return dDoubleValue;
    }

    @u0
    @e1(version = "1.4")
    @f
    /* JADX INFO: renamed from: minOfOrNull, reason: collision with other method in class */
    private static final Double m849minOfOrNull(boolean[] zArr, Function1<? super Boolean, Double> selector) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (zArr.length == 0) {
            int i10 = 2 | 0;
            return null;
        }
        double dDoubleValue = selector.invoke(Boolean.valueOf(zArr[0])).doubleValue();
        int lastIndex = getLastIndex(zArr);
        int i11 = 1;
        if (1 <= lastIndex) {
            while (true) {
                dDoubleValue = Math.min(dDoubleValue, selector.invoke(Boolean.valueOf(zArr[i11])).doubleValue());
                if (i11 == lastIndex) {
                    break;
                }
                i11++;
            }
        }
        return Double.valueOf(dDoubleValue);
    }

    @u0
    @e1(version = "1.4")
    @f
    private static final <R> R minOfWith(boolean[] zArr, Comparator<? super R> comparator, Function1<? super Boolean, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (zArr.length == 0) {
            throw new NoSuchElementException();
        }
        R rInvoke = selector.invoke(Boolean.valueOf(zArr[0]));
        int lastIndex = getLastIndex(zArr);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                R rInvoke2 = selector.invoke(Boolean.valueOf(zArr[i10]));
                if (comparator.compare(rInvoke, rInvoke2) > 0) {
                    rInvoke = rInvoke2;
                }
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return rInvoke;
    }

    @e1(version = "1.7")
    @oj.i(name = "minWithOrThrow")
    public static final boolean minWithOrThrow(@NotNull boolean[] zArr, @NotNull Comparator<? super Boolean> comparator) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (zArr.length != 0) {
            boolean z10 = zArr[0];
            int lastIndex = getLastIndex(zArr);
            int i10 = 1;
            if (1 <= lastIndex) {
                while (true) {
                    boolean z11 = zArr[i10];
                    if (comparator.compare(Boolean.valueOf(z10), Boolean.valueOf(z11)) > 0) {
                        z10 = z11;
                    }
                    if (i10 == lastIndex) {
                        break;
                    }
                    i10++;
                }
            }
            return z10;
        }
        throw new NoSuchElementException();
    }

    @NotNull
    public static final Pair<List<Double>, List<Double>> partition(@NotNull double[] dArr, @NotNull Function1<? super Double, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (double d10 : dArr) {
            if (predicate.invoke(Double.valueOf(d10)).booleanValue()) {
                arrayList.add(Double.valueOf(d10));
            } else {
                arrayList2.add(Double.valueOf(d10));
            }
        }
        return new Pair<>(arrayList, arrayList2);
    }

    @e1(version = "1.4")
    @f
    private static final List<Boolean> runningReduce(boolean[] zArr, Function2<? super Boolean, ? super Boolean, Boolean> operation) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (zArr.length == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        boolean z10 = zArr[0];
        ArrayList arrayList = new ArrayList(zArr.length);
        arrayList.add(Boolean.valueOf(z10));
        int length = zArr.length;
        int i10 = 1;
        while (i10 < length) {
            Boolean boolInvoke = operation.invoke(Boolean.valueOf(z10), Boolean.valueOf(zArr[i10]));
            boolean zBooleanValue = boolInvoke.booleanValue();
            arrayList.add(boolInvoke);
            i10++;
            z10 = zBooleanValue;
        }
        return arrayList;
    }

    @e1(version = "1.4")
    @f
    private static final List<Boolean> runningReduceIndexed(boolean[] zArr, n<? super Integer, ? super Boolean, ? super Boolean, Boolean> operation) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (zArr.length == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        boolean z10 = zArr[0];
        ArrayList arrayList = new ArrayList(zArr.length);
        arrayList.add(Boolean.valueOf(z10));
        int length = zArr.length;
        int i10 = 1;
        while (i10 < length) {
            Boolean boolInvoke = operation.invoke(Integer.valueOf(i10), Boolean.valueOf(z10), Boolean.valueOf(zArr[i10]));
            boolean zBooleanValue = boolInvoke.booleanValue();
            arrayList.add(boolInvoke);
            i10++;
            z10 = zBooleanValue;
        }
        return arrayList;
    }

    @NotNull
    public static final List<Double> take(@NotNull double[] dArr, int i10) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
        }
        if (i10 == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        if (i10 >= dArr.length) {
            return toList(dArr);
        }
        if (i10 == 1) {
            return CollectionsKt__CollectionsJVMKt.listOf(Double.valueOf(dArr[0]));
        }
        ArrayList arrayList = new ArrayList(i10);
        int i11 = 0;
        for (double d10 : dArr) {
            arrayList.add(Double.valueOf(d10));
            i11++;
            if (i11 == i10) {
                break;
            }
        }
        return arrayList;
    }

    @NotNull
    public static final List<Double> takeLast(@NotNull double[] dArr, int i10) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
        }
        if (i10 == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        int length = dArr.length;
        if (i10 >= length) {
            return toList(dArr);
        }
        if (i10 == 1) {
            return CollectionsKt__CollectionsJVMKt.listOf(Double.valueOf(dArr[length - 1]));
        }
        ArrayList arrayList = new ArrayList(i10);
        for (int i11 = length - i10; i11 < length; i11++) {
            arrayList.add(Double.valueOf(dArr[i11]));
        }
        return arrayList;
    }

    public static final char first(@NotNull char[] cArr, @NotNull Function1<? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (char c10 : cArr) {
            if (predicate.invoke(Character.valueOf(c10)).booleanValue()) {
                return c10;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    public static final long last(@NotNull long[] jArr, @NotNull Function1<? super Long, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = jArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i10 = length - 1;
                long j10 = jArr[length];
                if (predicate.invoke(Long.valueOf(j10)).booleanValue()) {
                    return j10;
                }
                if (i10 >= 0) {
                    length = i10;
                }
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @e1(version = "1.4")
    @Nullable
    public static final <R extends Comparable<? super R>> Float maxByOrNull(@NotNull float[] fArr, @NotNull Function1<? super Float, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (fArr.length == 0) {
            return null;
        }
        float f10 = fArr[0];
        int lastIndex = getLastIndex(fArr);
        if (lastIndex == 0) {
            return Float.valueOf(f10);
        }
        R rInvoke = selector.invoke(Float.valueOf(f10));
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                float f11 = fArr[i10];
                R rInvoke2 = selector.invoke(Float.valueOf(f11));
                if (rInvoke.compareTo(rInvoke2) < 0) {
                    f10 = f11;
                    rInvoke = rInvoke2;
                }
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return Float.valueOf(f10);
    }

    @e1(version = "1.4")
    @Nullable
    public static final Double maxOrNull(@NotNull double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        if (dArr.length == 0) {
            return null;
        }
        double dMax = dArr[0];
        int lastIndex = getLastIndex(dArr);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                dMax = Math.max(dMax, dArr[i10]);
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return Double.valueOf(dMax);
    }

    @e1(version = "1.4")
    @Nullable
    public static final <R extends Comparable<? super R>> Float minByOrNull(@NotNull float[] fArr, @NotNull Function1<? super Float, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (fArr.length == 0) {
            int i10 = 3 & 0;
            return null;
        }
        float f10 = fArr[0];
        int lastIndex = getLastIndex(fArr);
        if (lastIndex == 0) {
            return Float.valueOf(f10);
        }
        R rInvoke = selector.invoke(Float.valueOf(f10));
        int i11 = 1;
        if (1 <= lastIndex) {
            while (true) {
                float f11 = fArr[i11];
                R rInvoke2 = selector.invoke(Float.valueOf(f11));
                if (rInvoke.compareTo(rInvoke2) > 0) {
                    f10 = f11;
                    rInvoke = rInvoke2;
                }
                if (i11 == lastIndex) {
                    break;
                }
                i11++;
            }
        }
        return Float.valueOf(f10);
    }

    @e1(version = "1.4")
    @Nullable
    public static final Double minOrNull(@NotNull double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        if (dArr.length == 0) {
            return null;
        }
        double dMin = dArr[0];
        int lastIndex = getLastIndex(dArr);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                dMin = Math.min(dMin, dArr[i10]);
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return Double.valueOf(dMin);
    }

    @NotNull
    public static final List<Float> slice(@NotNull float[] fArr, @NotNull Iterable<Integer> indices) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(indices, "indices");
        int iCollectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(indices, 10);
        if (iCollectionSizeOrDefault == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList(iCollectionSizeOrDefault);
        Iterator<Integer> it = indices.iterator();
        while (it.hasNext()) {
            arrayList.add(Float.valueOf(fArr[it.next().intValue()]));
        }
        return arrayList;
    }

    @NotNull
    public static final char[] sliceArray(@NotNull char[] cArr, @NotNull IntRange indices) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(indices, "indices");
        return indices.isEmpty() ? new char[0] : ArraysKt___ArraysJvmKt.copyOfRange(cArr, indices.u().intValue(), indices.i().intValue() + 1);
    }

    @NotNull
    public static final <R, V> List<V> zip(@NotNull long[] jArr, @NotNull Iterable<? extends R> other, @NotNull Function2<? super Long, ? super R, ? extends V> transform) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int length = jArr.length;
        ArrayList arrayList = new ArrayList(Math.min(CollectionsKt__IterablesKt.collectionSizeOrDefault(other, 10), length));
        int i10 = 0;
        for (R r10 : other) {
            if (i10 >= length) {
                break;
            }
            arrayList.add(transform.invoke(Long.valueOf(jArr[i10]), r10));
            i10++;
        }
        return arrayList;
    }

    @NotNull
    public static final <K, V> Map<K, V> associateBy(@NotNull short[] sArr, @NotNull Function1<? super Short, ? extends K> keySelector, @NotNull Function1<? super Short, ? extends V> valueTransform) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(r.u(MapsKt__MapsJVMKt.mapCapacity(sArr.length), 16));
        for (short s10 : sArr) {
            linkedHashMap.put(keySelector.invoke(Short.valueOf(s10)), valueTransform.invoke(Short.valueOf(s10)));
        }
        return linkedHashMap;
    }

    @e1(version = "1.7")
    @oj.i(name = "maxOrThrow")
    public static final double maxOrThrow(@NotNull double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        if (dArr.length == 0) {
            throw new NoSuchElementException();
        }
        double dMax = dArr[0];
        int lastIndex = getLastIndex(dArr);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                dMax = Math.max(dMax, dArr[i10]);
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return dMax;
    }

    @e1(version = "1.7")
    @oj.i(name = "minOrThrow")
    public static final double minOrThrow(@NotNull double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        if (dArr.length != 0) {
            double dMin = dArr[0];
            int lastIndex = getLastIndex(dArr);
            int i10 = 1;
            if (1 <= lastIndex) {
                while (true) {
                    dMin = Math.min(dMin, dArr[i10]);
                    if (i10 == lastIndex) {
                        break;
                    }
                    i10++;
                }
            }
            return dMin;
        }
        throw new NoSuchElementException();
    }

    @e1(version = "1.4")
    public static final void shuffle(@NotNull boolean[] zArr, @NotNull kotlin.random.f random) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        for (int lastIndex = getLastIndex(zArr); lastIndex > 0; lastIndex--) {
            int iM = random.m(lastIndex + 1);
            boolean z10 = zArr[lastIndex];
            zArr[lastIndex] = zArr[iM];
            zArr[iM] = z10;
        }
    }

    @e1(version = "1.4")
    public static final <T> void reverse(@NotNull T[] tArr, int i10, int i11) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        AbstractList.Companion.checkRangeIndexes$kotlin_stdlib(i10, i11, tArr.length);
        int i12 = (i10 + i11) / 2;
        if (i10 == i12) {
            return;
        }
        int i13 = i11 - 1;
        while (i10 < i12) {
            T t10 = tArr[i10];
            tArr[i10] = tArr[i13];
            tArr[i13] = t10;
            i13--;
            i10++;
        }
    }

    public static final short single(@NotNull short[] sArr, @NotNull Function1<? super Short, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Short shValueOf = null;
        boolean z10 = false;
        for (short s10 : sArr) {
            if (predicate.invoke(Short.valueOf(s10)).booleanValue()) {
                if (!z10) {
                    shValueOf = Short.valueOf(s10);
                    z10 = true;
                } else {
                    throw new IllegalArgumentException("Array contains more than one matching element.");
                }
            }
        }
        if (z10) {
            Intrinsics.checkNotNull(shValueOf, "null cannot be cast to non-null type kotlin.Short");
            return shValueOf.shortValue();
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    public static final float last(@NotNull float[] fArr, @NotNull Function1<? super Float, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = fArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i10 = length - 1;
                float f10 = fArr[length];
                if (predicate.invoke(Float.valueOf(f10)).booleanValue()) {
                    return f10;
                }
                if (i10 >= 0) {
                    length = i10;
                }
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @e1(version = "1.4")
    @Nullable
    public static final Character maxWithOrNull(@NotNull char[] cArr, @NotNull Comparator<? super Character> comparator) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (cArr.length == 0) {
            return null;
        }
        char c10 = cArr[0];
        int lastIndex = getLastIndex(cArr);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                char c11 = cArr[i10];
                if (comparator.compare(Character.valueOf(c10), Character.valueOf(c11)) < 0) {
                    c10 = c11;
                }
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return Character.valueOf(c10);
    }

    @e1(version = "1.4")
    @Nullable
    public static final Character minWithOrNull(@NotNull char[] cArr, @NotNull Comparator<? super Character> comparator) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (cArr.length == 0) {
            return null;
        }
        char c10 = cArr[0];
        int lastIndex = getLastIndex(cArr);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                char c11 = cArr[i10];
                if (comparator.compare(Character.valueOf(c10), Character.valueOf(c11)) > 0) {
                    c10 = c11;
                }
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return Character.valueOf(c10);
    }

    @NotNull
    public static final <R, V> List<V> zip(@NotNull float[] fArr, @NotNull Iterable<? extends R> other, @NotNull Function2<? super Float, ? super R, ? extends V> transform) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int length = fArr.length;
        ArrayList arrayList = new ArrayList(Math.min(CollectionsKt__IterablesKt.collectionSizeOrDefault(other, 10), length));
        int i10 = 0;
        for (R r10 : other) {
            if (i10 >= length) {
                break;
            }
            arrayList.add(transform.invoke(Float.valueOf(fArr[i10]), r10));
            i10++;
        }
        return arrayList;
    }

    @NotNull
    public static final <K, V> Map<K, V> associateBy(@NotNull int[] iArr, @NotNull Function1<? super Integer, ? extends K> keySelector, @NotNull Function1<? super Integer, ? extends V> valueTransform) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(r.u(MapsKt__MapsJVMKt.mapCapacity(iArr.length), 16));
        for (int i10 : iArr) {
            linkedHashMap.put(keySelector.invoke(Integer.valueOf(i10)), valueTransform.invoke(Integer.valueOf(i10)));
        }
        return linkedHashMap;
    }

    @NotNull
    public static final <K> List<Character> distinctBy(@NotNull char[] cArr, @NotNull Function1<? super Character, ? extends K> selector) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (char c10 : cArr) {
            if (hashSet.add(selector.invoke(Character.valueOf(c10)))) {
                arrayList.add(Character.valueOf(c10));
            }
        }
        return arrayList;
    }

    @NotNull
    public static final <K> Map<K, List<Double>> groupBy(@NotNull double[] dArr, @NotNull Function1<? super Double, ? extends K> keySelector) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (double d10 : dArr) {
            K kInvoke = keySelector.invoke(Double.valueOf(d10));
            Object arrayList = linkedHashMap.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(kInvoke, arrayList);
            }
            ((List) arrayList).add(Double.valueOf(d10));
        }
        return linkedHashMap;
    }

    @NotNull
    public static final <A extends Appendable> A joinTo(@NotNull boolean[] zArr, @NotNull A buffer, @NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence postfix, int i10, @NotNull CharSequence truncated, @Nullable Function1<? super Boolean, ? extends CharSequence> function1) throws IOException {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(truncated, "truncated");
        buffer.append(prefix);
        int i11 = 0;
        for (boolean z10 : zArr) {
            i11++;
            if (i11 > 1) {
                buffer.append(separator);
            }
            if (i10 >= 0 && i11 > i10) {
                break;
            }
            if (function1 != null) {
                buffer.append(function1.invoke(Boolean.valueOf(z10)));
            } else {
                buffer.append(String.valueOf(z10));
            }
        }
        if (i10 >= 0 && i11 > i10) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    @e1(version = "1.7")
    @oj.i(name = "maxByOrThrow")
    public static final <R extends Comparable<? super R>> double maxByOrThrow(@NotNull double[] dArr, @NotNull Function1<? super Double, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (dArr.length != 0) {
            double d10 = dArr[0];
            int lastIndex = getLastIndex(dArr);
            if (lastIndex != 0) {
                R rInvoke = selector.invoke(Double.valueOf(d10));
                int i10 = 1;
                if (1 <= lastIndex) {
                    while (true) {
                        double d11 = dArr[i10];
                        R rInvoke2 = selector.invoke(Double.valueOf(d11));
                        if (rInvoke.compareTo(rInvoke2) < 0) {
                            d10 = d11;
                            rInvoke = rInvoke2;
                        }
                        if (i10 == lastIndex) {
                            break;
                        }
                        i10++;
                    }
                }
            }
            return d10;
        }
        throw new NoSuchElementException();
    }

    @u0
    @e1(version = "1.4")
    @f
    private static final double maxOf(char[] cArr, Function1<? super Character, Double> selector) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (cArr.length == 0) {
            throw new NoSuchElementException();
        }
        double dDoubleValue = selector.invoke(Character.valueOf(cArr[0])).doubleValue();
        int lastIndex = getLastIndex(cArr);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                dDoubleValue = Math.max(dDoubleValue, selector.invoke(Character.valueOf(cArr[i10])).doubleValue());
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return dDoubleValue;
    }

    @u0
    @e1(version = "1.4")
    @f
    /* JADX INFO: renamed from: maxOfOrNull, reason: collision with other method in class */
    private static final Double m806maxOfOrNull(char[] cArr, Function1<? super Character, Double> selector) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (cArr.length == 0) {
            return null;
        }
        double dDoubleValue = selector.invoke(Character.valueOf(cArr[0])).doubleValue();
        int lastIndex = getLastIndex(cArr);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                dDoubleValue = Math.max(dDoubleValue, selector.invoke(Character.valueOf(cArr[i10])).doubleValue());
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return Double.valueOf(dDoubleValue);
    }

    @u0
    @e1(version = "1.4")
    @f
    private static final <R> R maxOfWith(char[] cArr, Comparator<? super R> comparator, Function1<? super Character, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (cArr.length != 0) {
            R rInvoke = selector.invoke(Character.valueOf(cArr[0]));
            int lastIndex = getLastIndex(cArr);
            int i10 = 1;
            if (1 <= lastIndex) {
                while (true) {
                    R rInvoke2 = selector.invoke(Character.valueOf(cArr[i10]));
                    if (comparator.compare(rInvoke, rInvoke2) < 0) {
                        rInvoke = rInvoke2;
                    }
                    if (i10 == lastIndex) {
                        break;
                    }
                    i10++;
                }
            }
            return rInvoke;
        }
        throw new NoSuchElementException();
    }

    @e1(version = "1.7")
    @oj.i(name = "maxWithOrThrow")
    public static final char maxWithOrThrow(@NotNull char[] cArr, @NotNull Comparator<? super Character> comparator) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (cArr.length != 0) {
            char c10 = cArr[0];
            int lastIndex = getLastIndex(cArr);
            int i10 = 1;
            if (1 <= lastIndex) {
                while (true) {
                    char c11 = cArr[i10];
                    if (comparator.compare(Character.valueOf(c10), Character.valueOf(c11)) < 0) {
                        c10 = c11;
                    }
                    if (i10 == lastIndex) {
                        break;
                    }
                    i10++;
                }
            }
            return c10;
        }
        throw new NoSuchElementException();
    }

    @e1(version = "1.7")
    @oj.i(name = "minByOrThrow")
    public static final <R extends Comparable<? super R>> double minByOrThrow(@NotNull double[] dArr, @NotNull Function1<? super Double, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (dArr.length != 0) {
            int i10 = 7 << 0;
            double d10 = dArr[0];
            int lastIndex = getLastIndex(dArr);
            if (lastIndex != 0) {
                R rInvoke = selector.invoke(Double.valueOf(d10));
                int i11 = 1;
                if (1 <= lastIndex) {
                    while (true) {
                        double d11 = dArr[i11];
                        R rInvoke2 = selector.invoke(Double.valueOf(d11));
                        if (rInvoke.compareTo(rInvoke2) > 0) {
                            d10 = d11;
                            rInvoke = rInvoke2;
                        }
                        if (i11 == lastIndex) {
                            break;
                        }
                        i11++;
                    }
                }
            }
            return d10;
        }
        throw new NoSuchElementException();
    }

    @u0
    @e1(version = "1.4")
    @f
    private static final double minOf(char[] cArr, Function1<? super Character, Double> selector) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (cArr.length != 0) {
            double dDoubleValue = selector.invoke(Character.valueOf(cArr[0])).doubleValue();
            int lastIndex = getLastIndex(cArr);
            int i10 = 1;
            if (1 <= lastIndex) {
                while (true) {
                    dDoubleValue = Math.min(dDoubleValue, selector.invoke(Character.valueOf(cArr[i10])).doubleValue());
                    if (i10 == lastIndex) {
                        break;
                    }
                    i10++;
                }
            }
            return dDoubleValue;
        }
        throw new NoSuchElementException();
    }

    @u0
    @e1(version = "1.4")
    @f
    /* JADX INFO: renamed from: minOfOrNull, reason: collision with other method in class */
    private static final Double m842minOfOrNull(char[] cArr, Function1<? super Character, Double> selector) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (cArr.length == 0) {
            return null;
        }
        double dDoubleValue = selector.invoke(Character.valueOf(cArr[0])).doubleValue();
        int lastIndex = getLastIndex(cArr);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                dDoubleValue = Math.min(dDoubleValue, selector.invoke(Character.valueOf(cArr[i10])).doubleValue());
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return Double.valueOf(dDoubleValue);
    }

    @u0
    @e1(version = "1.4")
    @f
    private static final <R> R minOfWith(char[] cArr, Comparator<? super R> comparator, Function1<? super Character, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (cArr.length != 0) {
            R rInvoke = selector.invoke(Character.valueOf(cArr[0]));
            int lastIndex = getLastIndex(cArr);
            int i10 = 1;
            if (1 <= lastIndex) {
                while (true) {
                    R rInvoke2 = selector.invoke(Character.valueOf(cArr[i10]));
                    if (comparator.compare(rInvoke, rInvoke2) > 0) {
                        rInvoke = rInvoke2;
                    }
                    if (i10 == lastIndex) {
                        break;
                    }
                    i10++;
                }
            }
            return rInvoke;
        }
        throw new NoSuchElementException();
    }

    @e1(version = "1.7")
    @oj.i(name = "minWithOrThrow")
    public static final char minWithOrThrow(@NotNull char[] cArr, @NotNull Comparator<? super Character> comparator) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (cArr.length != 0) {
            char c10 = cArr[0];
            int lastIndex = getLastIndex(cArr);
            int i10 = 1;
            int i11 = 4 ^ 1;
            if (1 <= lastIndex) {
                while (true) {
                    char c11 = cArr[i10];
                    if (comparator.compare(Character.valueOf(c10), Character.valueOf(c11)) > 0) {
                        c10 = c11;
                    }
                    if (i10 == lastIndex) {
                        break;
                    }
                    i10++;
                }
            }
            return c10;
        }
        throw new NoSuchElementException();
    }

    @e1(version = "1.4")
    @f
    private static final List<Character> runningReduce(char[] cArr, Function2<? super Character, ? super Character, Character> operation) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (cArr.length == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        char c10 = cArr[0];
        ArrayList arrayList = new ArrayList(cArr.length);
        arrayList.add(Character.valueOf(c10));
        int length = cArr.length;
        int i10 = 1;
        while (i10 < length) {
            Character chInvoke = operation.invoke(Character.valueOf(c10), Character.valueOf(cArr[i10]));
            char cCharValue = chInvoke.charValue();
            arrayList.add(chInvoke);
            i10++;
            c10 = cCharValue;
        }
        return arrayList;
    }

    @e1(version = "1.4")
    @f
    private static final List<Character> runningReduceIndexed(char[] cArr, n<? super Integer, ? super Character, ? super Character, Character> operation) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (cArr.length == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        char c10 = cArr[0];
        ArrayList arrayList = new ArrayList(cArr.length);
        arrayList.add(Character.valueOf(c10));
        int length = cArr.length;
        int i10 = 1;
        while (i10 < length) {
            Character chInvoke = operation.invoke(Integer.valueOf(i10), Character.valueOf(c10), Character.valueOf(cArr[i10]));
            char cCharValue = chInvoke.charValue();
            arrayList.add(chInvoke);
            i10++;
            c10 = cCharValue;
        }
        return arrayList;
    }

    @NotNull
    public static final List<Double> slice(@NotNull double[] dArr, @NotNull Iterable<Integer> indices) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(indices, "indices");
        int iCollectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(indices, 10);
        if (iCollectionSizeOrDefault == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList(iCollectionSizeOrDefault);
        Iterator<Integer> it = indices.iterator();
        while (it.hasNext()) {
            arrayList.add(Double.valueOf(dArr[it.next().intValue()]));
        }
        return arrayList;
    }

    @NotNull
    public static final <K, M extends Map<? super K, List<Boolean>>> M groupByTo(@NotNull boolean[] zArr, @NotNull M destination, @NotNull Function1<? super Boolean, ? extends K> keySelector) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        for (boolean z10 : zArr) {
            K kInvoke = keySelector.invoke(Boolean.valueOf(z10));
            Object arrayList = destination.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                destination.put(kInvoke, arrayList);
            }
            ((List) arrayList).add(Boolean.valueOf(z10));
        }
        return destination;
    }

    @e1(version = "1.4")
    @Nullable
    public static final Character maxOrNull(@NotNull char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        if (cArr.length == 0) {
            return null;
        }
        char c10 = cArr[0];
        int lastIndex = getLastIndex(cArr);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                char c11 = cArr[i10];
                if (Intrinsics.compare((int) c10, (int) c11) < 0) {
                    c10 = c11;
                }
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return Character.valueOf(c10);
    }

    @e1(version = "1.4")
    @Nullable
    public static final Character minOrNull(@NotNull char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        if (cArr.length == 0) {
            return null;
        }
        char c10 = cArr[0];
        int lastIndex = getLastIndex(cArr);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                char c11 = cArr[i10];
                if (Intrinsics.compare((int) c10, (int) c11) > 0) {
                    c10 = c11;
                }
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return Character.valueOf(c10);
    }

    @NotNull
    public static final Pair<List<Boolean>, List<Boolean>> partition(@NotNull boolean[] zArr, @NotNull Function1<? super Boolean, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (boolean z10 : zArr) {
            if (predicate.invoke(Boolean.valueOf(z10)).booleanValue()) {
                arrayList.add(Boolean.valueOf(z10));
            } else {
                arrayList2.add(Boolean.valueOf(z10));
            }
        }
        return new Pair<>(arrayList, arrayList2);
    }

    @e1(version = "1.4")
    public static final void shuffle(@NotNull char[] cArr, @NotNull kotlin.random.f random) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        for (int lastIndex = getLastIndex(cArr); lastIndex > 0; lastIndex--) {
            int iM = random.m(lastIndex + 1);
            char c10 = cArr[lastIndex];
            cArr[lastIndex] = cArr[iM];
            cArr[iM] = c10;
        }
    }

    @NotNull
    public static final List<Boolean> take(@NotNull boolean[] zArr, int i10) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
        }
        if (i10 == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        if (i10 >= zArr.length) {
            return toList(zArr);
        }
        if (i10 == 1) {
            return CollectionsKt__CollectionsJVMKt.listOf(Boolean.valueOf(zArr[0]));
        }
        ArrayList arrayList = new ArrayList(i10);
        int i11 = 0;
        for (boolean z10 : zArr) {
            arrayList.add(Boolean.valueOf(z10));
            i11++;
            if (i11 == i10) {
                break;
            }
        }
        return arrayList;
    }

    @NotNull
    public static final List<Boolean> takeLast(@NotNull boolean[] zArr, int i10) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
        }
        if (i10 == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        int length = zArr.length;
        if (i10 >= length) {
            return toList(zArr);
        }
        if (i10 == 1) {
            return CollectionsKt__CollectionsJVMKt.listOf(Boolean.valueOf(zArr[length - 1]));
        }
        ArrayList arrayList = new ArrayList(i10);
        for (int i11 = length - i10; i11 < length; i11++) {
            arrayList.add(Boolean.valueOf(zArr[i11]));
        }
        return arrayList;
    }

    @e1(version = "1.7")
    @oj.i(name = "maxOrThrow")
    public static final char maxOrThrow(@NotNull char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        if (cArr.length != 0) {
            char c10 = cArr[0];
            int lastIndex = getLastIndex(cArr);
            int i10 = 1;
            if (1 <= lastIndex) {
                while (true) {
                    char c11 = cArr[i10];
                    if (Intrinsics.compare((int) c10, (int) c11) < 0) {
                        c10 = c11;
                    }
                    if (i10 == lastIndex) {
                        break;
                    }
                    i10++;
                }
            }
            return c10;
        }
        throw new NoSuchElementException();
    }

    @e1(version = "1.7")
    @oj.i(name = "minOrThrow")
    public static final char minOrThrow(@NotNull char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        if (cArr.length != 0) {
            char c10 = cArr[0];
            int lastIndex = getLastIndex(cArr);
            int i10 = 1;
            if (1 <= lastIndex) {
                while (true) {
                    char c11 = cArr[i10];
                    if (Intrinsics.compare((int) c10, (int) c11) > 0) {
                        c10 = c11;
                    }
                    if (i10 == lastIndex) {
                        break;
                    }
                    i10++;
                }
            }
            return c10;
        }
        throw new NoSuchElementException();
    }

    @e1(version = "1.4")
    public static void reverse(@NotNull byte[] bArr, int i10, int i11) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        AbstractList.Companion.checkRangeIndexes$kotlin_stdlib(i10, i11, bArr.length);
        int i12 = (i10 + i11) / 2;
        if (i10 == i12) {
            return;
        }
        int i13 = i11 - 1;
        while (i10 < i12) {
            byte b10 = bArr[i10];
            bArr[i10] = bArr[i13];
            bArr[i13] = b10;
            i13--;
            i10++;
        }
    }

    public static final double last(@NotNull double[] dArr, @NotNull Function1<? super Double, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = dArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i10 = length - 1;
                double d10 = dArr[length];
                if (predicate.invoke(Double.valueOf(d10)).booleanValue()) {
                    return d10;
                }
                if (i10 >= 0) {
                    length = i10;
                }
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @NotNull
    public static final <R, V> List<V> zip(@NotNull double[] dArr, @NotNull Iterable<? extends R> other, @NotNull Function2<? super Double, ? super R, ? extends V> transform) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int length = dArr.length;
        ArrayList arrayList = new ArrayList(Math.min(CollectionsKt__IterablesKt.collectionSizeOrDefault(other, 10), length));
        int i10 = 0;
        for (R r10 : other) {
            if (i10 >= length) {
                break;
            }
            arrayList.add(transform.invoke(Double.valueOf(dArr[i10]), r10));
            i10++;
        }
        return arrayList;
    }

    @NotNull
    public static final <K, V> Map<K, V> associateBy(@NotNull long[] jArr, @NotNull Function1<? super Long, ? extends K> keySelector, @NotNull Function1<? super Long, ? extends V> valueTransform) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(r.u(MapsKt__MapsJVMKt.mapCapacity(jArr.length), 16));
        for (long j10 : jArr) {
            linkedHashMap.put(keySelector.invoke(Long.valueOf(j10)), valueTransform.invoke(Long.valueOf(j10)));
        }
        return linkedHashMap;
    }

    @e1(version = "1.4")
    @Nullable
    public static final <R extends Comparable<? super R>> Double maxByOrNull(@NotNull double[] dArr, @NotNull Function1<? super Double, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (dArr.length == 0) {
            return null;
        }
        double d10 = dArr[0];
        int lastIndex = getLastIndex(dArr);
        if (lastIndex == 0) {
            return Double.valueOf(d10);
        }
        R rInvoke = selector.invoke(Double.valueOf(d10));
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                double d11 = dArr[i10];
                R rInvoke2 = selector.invoke(Double.valueOf(d11));
                if (rInvoke.compareTo(rInvoke2) < 0) {
                    d10 = d11;
                    rInvoke = rInvoke2;
                }
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return Double.valueOf(d10);
    }

    @e1(version = "1.4")
    @Nullable
    public static final <R extends Comparable<? super R>> Double minByOrNull(@NotNull double[] dArr, @NotNull Function1<? super Double, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (dArr.length == 0) {
            return null;
        }
        double d10 = dArr[0];
        int lastIndex = getLastIndex(dArr);
        if (lastIndex == 0) {
            return Double.valueOf(d10);
        }
        R rInvoke = selector.invoke(Double.valueOf(d10));
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                double d11 = dArr[i10];
                R rInvoke2 = selector.invoke(Double.valueOf(d11));
                if (rInvoke.compareTo(rInvoke2) > 0) {
                    d10 = d11;
                    rInvoke = rInvoke2;
                }
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return Double.valueOf(d10);
    }

    public static final int single(@NotNull int[] iArr, @NotNull Function1<? super Integer, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Integer numValueOf = null;
        boolean z10 = false;
        for (int i10 : iArr) {
            if (predicate.invoke(Integer.valueOf(i10)).booleanValue()) {
                if (!z10) {
                    numValueOf = Integer.valueOf(i10);
                    z10 = true;
                } else {
                    throw new IllegalArgumentException("Array contains more than one matching element.");
                }
            }
        }
        if (z10) {
            Intrinsics.checkNotNull(numValueOf, "null cannot be cast to non-null type kotlin.Int");
            return numValueOf.intValue();
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @NotNull
    public static final List<Boolean> slice(@NotNull boolean[] zArr, @NotNull Iterable<Integer> indices) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(indices, "indices");
        int iCollectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(indices, 10);
        if (iCollectionSizeOrDefault == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList(iCollectionSizeOrDefault);
        Iterator<Integer> it = indices.iterator();
        while (it.hasNext()) {
            arrayList.add(Boolean.valueOf(zArr[it.next().intValue()]));
        }
        return arrayList;
    }

    @u0
    @e1(version = "1.4")
    @f
    /* JADX INFO: renamed from: maxOf, reason: collision with other method in class */
    private static final <T> float m793maxOf(T[] tArr, Function1<? super T, Float> selector) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (tArr.length != 0) {
            float fFloatValue = selector.invoke(tArr[0]).floatValue();
            int lastIndex = getLastIndex(tArr);
            int i10 = 1;
            if (1 <= lastIndex) {
                while (true) {
                    fFloatValue = Math.max(fFloatValue, selector.invoke(tArr[i10]).floatValue());
                    if (i10 == lastIndex) {
                        break;
                    }
                    i10++;
                }
            }
            return fFloatValue;
        }
        throw new NoSuchElementException();
    }

    @u0
    @e1(version = "1.4")
    @f
    /* JADX INFO: renamed from: maxOfOrNull, reason: collision with other method in class */
    private static final <T> Float m820maxOfOrNull(T[] tArr, Function1<? super T, Float> selector) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (tArr.length == 0) {
            return null;
        }
        float fFloatValue = selector.invoke(tArr[0]).floatValue();
        int lastIndex = getLastIndex(tArr);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                fFloatValue = Math.max(fFloatValue, selector.invoke(tArr[i10]).floatValue());
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return Float.valueOf(fFloatValue);
    }

    @u0
    @e1(version = "1.4")
    @f
    /* JADX INFO: renamed from: minOf, reason: collision with other method in class */
    private static final <T> float m829minOf(T[] tArr, Function1<? super T, Float> selector) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (tArr.length == 0) {
            throw new NoSuchElementException();
        }
        float fFloatValue = selector.invoke(tArr[0]).floatValue();
        int lastIndex = getLastIndex(tArr);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                fFloatValue = Math.min(fFloatValue, selector.invoke(tArr[i10]).floatValue());
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return fFloatValue;
    }

    @u0
    @e1(version = "1.4")
    @f
    /* JADX INFO: renamed from: minOfOrNull, reason: collision with other method in class */
    private static final <T> Float m856minOfOrNull(T[] tArr, Function1<? super T, Float> selector) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (tArr.length == 0) {
            return null;
        }
        float fFloatValue = selector.invoke(tArr[0]).floatValue();
        int lastIndex = getLastIndex(tArr);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                fFloatValue = Math.min(fFloatValue, selector.invoke(tArr[i10]).floatValue());
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return Float.valueOf(fFloatValue);
    }

    @NotNull
    public static final <A extends Appendable> A joinTo(@NotNull char[] cArr, @NotNull A buffer, @NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence postfix, int i10, @NotNull CharSequence truncated, @Nullable Function1<? super Character, ? extends CharSequence> function1) throws IOException {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(truncated, "truncated");
        buffer.append(prefix);
        int i11 = 0;
        for (char c10 : cArr) {
            i11++;
            if (i11 > 1) {
                buffer.append(separator);
            }
            if (i10 >= 0 && i11 > i10) {
                break;
            }
            if (function1 != null) {
                buffer.append(function1.invoke(Character.valueOf(c10)));
            } else {
                buffer.append(c10);
            }
        }
        if (i10 >= 0 && i11 > i10) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    public static final boolean last(@NotNull boolean[] zArr, @NotNull Function1<? super Boolean, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = zArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i10 = length - 1;
                boolean z10 = zArr[length];
                if (predicate.invoke(Boolean.valueOf(z10)).booleanValue()) {
                    return z10;
                }
                if (i10 >= 0) {
                    length = i10;
                }
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @e1(version = "1.4")
    public static void reverse(@NotNull short[] sArr, int i10, int i11) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        AbstractList.Companion.checkRangeIndexes$kotlin_stdlib(i10, i11, sArr.length);
        int i12 = (i10 + i11) / 2;
        if (i10 == i12) {
            return;
        }
        int i13 = i11 - 1;
        while (i10 < i12) {
            short s10 = sArr[i10];
            sArr[i10] = sArr[i13];
            sArr[i13] = s10;
            i13--;
            i10++;
        }
    }

    @NotNull
    public static final <R, V> List<V> zip(@NotNull boolean[] zArr, @NotNull Iterable<? extends R> other, @NotNull Function2<? super Boolean, ? super R, ? extends V> transform) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int length = zArr.length;
        ArrayList arrayList = new ArrayList(Math.min(CollectionsKt__IterablesKt.collectionSizeOrDefault(other, 10), length));
        int i10 = 0;
        for (R r10 : other) {
            if (i10 >= length) {
                break;
            }
            arrayList.add(transform.invoke(Boolean.valueOf(zArr[i10]), r10));
            i10++;
        }
        return arrayList;
    }

    @NotNull
    public static final <K, V> Map<K, V> associateBy(@NotNull float[] fArr, @NotNull Function1<? super Float, ? extends K> keySelector, @NotNull Function1<? super Float, ? extends V> valueTransform) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(r.u(MapsKt__MapsJVMKt.mapCapacity(fArr.length), 16));
        for (float f10 : fArr) {
            linkedHashMap.put(keySelector.invoke(Float.valueOf(f10)), valueTransform.invoke(Float.valueOf(f10)));
        }
        return linkedHashMap;
    }

    @NotNull
    public static final <K> Map<K, List<Boolean>> groupBy(@NotNull boolean[] zArr, @NotNull Function1<? super Boolean, ? extends K> keySelector) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (boolean z10 : zArr) {
            K kInvoke = keySelector.invoke(Boolean.valueOf(z10));
            Object arrayList = linkedHashMap.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(kInvoke, arrayList);
            }
            ((List) arrayList).add(Boolean.valueOf(z10));
        }
        return linkedHashMap;
    }

    @NotNull
    public static final <K, M extends Map<? super K, List<Character>>> M groupByTo(@NotNull char[] cArr, @NotNull M destination, @NotNull Function1<? super Character, ? extends K> keySelector) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        for (char c10 : cArr) {
            K kInvoke = keySelector.invoke(Character.valueOf(c10));
            Object arrayList = destination.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                destination.put(kInvoke, arrayList);
            }
            ((List) arrayList).add(Character.valueOf(c10));
        }
        return destination;
    }

    @e1(version = "1.7")
    @oj.i(name = "maxByOrThrow")
    public static final <R extends Comparable<? super R>> boolean maxByOrThrow(@NotNull boolean[] zArr, @NotNull Function1<? super Boolean, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (zArr.length != 0) {
            boolean z10 = zArr[0];
            int lastIndex = getLastIndex(zArr);
            if (lastIndex != 0) {
                R rInvoke = selector.invoke(Boolean.valueOf(z10));
                int i10 = 1;
                if (1 <= lastIndex) {
                    while (true) {
                        boolean z11 = zArr[i10];
                        R rInvoke2 = selector.invoke(Boolean.valueOf(z11));
                        if (rInvoke.compareTo(rInvoke2) < 0) {
                            z10 = z11;
                            rInvoke = rInvoke2;
                        }
                        if (i10 == lastIndex) {
                            break;
                        }
                        i10++;
                    }
                }
            }
            return z10;
        }
        throw new NoSuchElementException();
    }

    @e1(version = "1.7")
    @oj.i(name = "minByOrThrow")
    public static final <R extends Comparable<? super R>> boolean minByOrThrow(@NotNull boolean[] zArr, @NotNull Function1<? super Boolean, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (zArr.length == 0) {
            throw new NoSuchElementException();
        }
        boolean z10 = zArr[0];
        int lastIndex = getLastIndex(zArr);
        if (lastIndex != 0) {
            R rInvoke = selector.invoke(Boolean.valueOf(z10));
            int i10 = 1;
            if (1 <= lastIndex) {
                while (true) {
                    boolean z11 = zArr[i10];
                    R rInvoke2 = selector.invoke(Boolean.valueOf(z11));
                    if (rInvoke.compareTo(rInvoke2) > 0) {
                        z10 = z11;
                        rInvoke = rInvoke2;
                    }
                    if (i10 == lastIndex) {
                        break;
                    }
                    i10++;
                }
            }
        }
        return z10;
    }

    @NotNull
    public static final Pair<List<Character>, List<Character>> partition(@NotNull char[] cArr, @NotNull Function1<? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (char c10 : cArr) {
            if (predicate.invoke(Character.valueOf(c10)).booleanValue()) {
                arrayList.add(Character.valueOf(c10));
            } else {
                arrayList2.add(Character.valueOf(c10));
            }
        }
        return new Pair<>(arrayList, arrayList2);
    }

    @NotNull
    public static final List<Character> take(@NotNull char[] cArr, int i10) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
        }
        if (i10 == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        if (i10 >= cArr.length) {
            return toList(cArr);
        }
        if (i10 == 1) {
            return CollectionsKt__CollectionsJVMKt.listOf(Character.valueOf(cArr[0]));
        }
        ArrayList arrayList = new ArrayList(i10);
        int i11 = 0;
        for (char c10 : cArr) {
            arrayList.add(Character.valueOf(c10));
            i11++;
            if (i11 == i10) {
                break;
            }
        }
        return arrayList;
    }

    @NotNull
    public static final List<Character> takeLast(@NotNull char[] cArr, int i10) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
        }
        if (i10 == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        int length = cArr.length;
        if (i10 >= length) {
            return toList(cArr);
        }
        if (i10 == 1) {
            return CollectionsKt__CollectionsJVMKt.listOf(Character.valueOf(cArr[length - 1]));
        }
        ArrayList arrayList = new ArrayList(i10);
        for (int i11 = length - i10; i11 < length; i11++) {
            arrayList.add(Character.valueOf(cArr[i11]));
        }
        return arrayList;
    }

    public static final long single(@NotNull long[] jArr, @NotNull Function1<? super Long, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Long lValueOf = null;
        boolean z10 = false;
        for (long j10 : jArr) {
            if (predicate.invoke(Long.valueOf(j10)).booleanValue()) {
                if (!z10) {
                    lValueOf = Long.valueOf(j10);
                    z10 = true;
                } else {
                    throw new IllegalArgumentException("Array contains more than one matching element.");
                }
            }
        }
        if (!z10) {
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        }
        Intrinsics.checkNotNull(lValueOf, "null cannot be cast to non-null type kotlin.Long");
        return lValueOf.longValue();
    }

    @NotNull
    public static final List<Character> slice(@NotNull char[] cArr, @NotNull Iterable<Integer> indices) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(indices, "indices");
        int iCollectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(indices, 10);
        if (iCollectionSizeOrDefault == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList(iCollectionSizeOrDefault);
        Iterator<Integer> it = indices.iterator();
        while (it.hasNext()) {
            arrayList.add(Character.valueOf(cArr[it.next().intValue()]));
        }
        return arrayList;
    }

    public static final char last(@NotNull char[] cArr, @NotNull Function1<? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int length = cArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i10 = length - 1;
                char c10 = cArr[length];
                if (predicate.invoke(Character.valueOf(c10)).booleanValue()) {
                    return c10;
                }
                if (i10 >= 0) {
                    length = i10;
                }
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @NotNull
    public static final <R, V> List<V> zip(@NotNull char[] cArr, @NotNull Iterable<? extends R> other, @NotNull Function2<? super Character, ? super R, ? extends V> transform) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int length = cArr.length;
        ArrayList arrayList = new ArrayList(Math.min(CollectionsKt__IterablesKt.collectionSizeOrDefault(other, 10), length));
        int i10 = 0;
        for (R r10 : other) {
            if (i10 >= length) {
                break;
            }
            arrayList.add(transform.invoke(Character.valueOf(cArr[i10]), r10));
            i10++;
        }
        return arrayList;
    }

    @NotNull
    public static final <K, V> Map<K, V> associateBy(@NotNull double[] dArr, @NotNull Function1<? super Double, ? extends K> keySelector, @NotNull Function1<? super Double, ? extends V> valueTransform) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(r.u(MapsKt__MapsJVMKt.mapCapacity(dArr.length), 16));
        for (double d10 : dArr) {
            linkedHashMap.put(keySelector.invoke(Double.valueOf(d10)), valueTransform.invoke(Double.valueOf(d10)));
        }
        return linkedHashMap;
    }

    @u0
    @e1(version = "1.4")
    @f
    /* JADX INFO: renamed from: maxOf, reason: collision with other method in class */
    private static final float m787maxOf(byte[] bArr, Function1<? super Byte, Float> selector) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (bArr.length != 0) {
            float fFloatValue = selector.invoke(Byte.valueOf(bArr[0])).floatValue();
            int lastIndex = getLastIndex(bArr);
            int i10 = 1;
            if (1 <= lastIndex) {
                while (true) {
                    fFloatValue = Math.max(fFloatValue, selector.invoke(Byte.valueOf(bArr[i10])).floatValue());
                    if (i10 == lastIndex) {
                        break;
                    }
                    i10++;
                }
            }
            return fFloatValue;
        }
        throw new NoSuchElementException();
    }

    @u0
    @e1(version = "1.4")
    @f
    /* JADX INFO: renamed from: maxOfOrNull, reason: collision with other method in class */
    private static final Float m814maxOfOrNull(byte[] bArr, Function1<? super Byte, Float> selector) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (bArr.length == 0) {
            return null;
        }
        float fFloatValue = selector.invoke(Byte.valueOf(bArr[0])).floatValue();
        int lastIndex = getLastIndex(bArr);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                fFloatValue = Math.max(fFloatValue, selector.invoke(Byte.valueOf(bArr[i10])).floatValue());
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return Float.valueOf(fFloatValue);
    }

    @u0
    @e1(version = "1.4")
    @f
    /* JADX INFO: renamed from: minOf, reason: collision with other method in class */
    private static final float m823minOf(byte[] bArr, Function1<? super Byte, Float> selector) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (bArr.length != 0) {
            float fFloatValue = selector.invoke(Byte.valueOf(bArr[0])).floatValue();
            int lastIndex = getLastIndex(bArr);
            int i10 = 1;
            if (1 <= lastIndex) {
                while (true) {
                    fFloatValue = Math.min(fFloatValue, selector.invoke(Byte.valueOf(bArr[i10])).floatValue());
                    if (i10 == lastIndex) {
                        break;
                    }
                    i10++;
                }
            }
            return fFloatValue;
        }
        throw new NoSuchElementException();
    }

    @u0
    @e1(version = "1.4")
    @f
    /* JADX INFO: renamed from: minOfOrNull, reason: collision with other method in class */
    private static final Float m850minOfOrNull(byte[] bArr, Function1<? super Byte, Float> selector) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (bArr.length == 0) {
            return null;
        }
        float fFloatValue = selector.invoke(Byte.valueOf(bArr[0])).floatValue();
        int lastIndex = getLastIndex(bArr);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                fFloatValue = Math.min(fFloatValue, selector.invoke(Byte.valueOf(bArr[i10])).floatValue());
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return Float.valueOf(fFloatValue);
    }

    @e1(version = "1.4")
    public static void reverse(@NotNull int[] iArr, int i10, int i11) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        AbstractList.Companion.checkRangeIndexes$kotlin_stdlib(i10, i11, iArr.length);
        int i12 = (i10 + i11) / 2;
        if (i10 == i12) {
            return;
        }
        int i13 = i11 - 1;
        while (i10 < i12) {
            int i14 = iArr[i10];
            iArr[i10] = iArr[i13];
            iArr[i13] = i14;
            i13--;
            i10++;
        }
    }

    @e1(version = "1.4")
    @Nullable
    public static final <R extends Comparable<? super R>> Boolean maxByOrNull(@NotNull boolean[] zArr, @NotNull Function1<? super Boolean, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (zArr.length == 0) {
            return null;
        }
        boolean z10 = zArr[0];
        int lastIndex = getLastIndex(zArr);
        if (lastIndex == 0) {
            return Boolean.valueOf(z10);
        }
        R rInvoke = selector.invoke(Boolean.valueOf(z10));
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                boolean z11 = zArr[i10];
                R rInvoke2 = selector.invoke(Boolean.valueOf(z11));
                if (rInvoke.compareTo(rInvoke2) < 0) {
                    z10 = z11;
                    rInvoke = rInvoke2;
                }
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return Boolean.valueOf(z10);
    }

    @e1(version = "1.4")
    @Nullable
    public static final <R extends Comparable<? super R>> Boolean minByOrNull(@NotNull boolean[] zArr, @NotNull Function1<? super Boolean, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (zArr.length == 0) {
            return null;
        }
        boolean z10 = zArr[0];
        int lastIndex = getLastIndex(zArr);
        if (lastIndex == 0) {
            return Boolean.valueOf(z10);
        }
        R rInvoke = selector.invoke(Boolean.valueOf(z10));
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                boolean z11 = zArr[i10];
                R rInvoke2 = selector.invoke(Boolean.valueOf(z11));
                if (rInvoke.compareTo(rInvoke2) > 0) {
                    z10 = z11;
                    rInvoke = rInvoke2;
                }
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return Boolean.valueOf(z10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <T, K, V, M extends Map<? super K, List<V>>> M groupByTo(@NotNull T[] tArr, @NotNull M destination, @NotNull Function1<? super T, ? extends K> keySelector, @NotNull Function1<? super T, ? extends V> valueTransform) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        for (T t10 : tArr) {
            K kInvoke = keySelector.invoke(t10);
            Object arrayList = destination.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                destination.put(kInvoke, arrayList);
            }
            ((List) arrayList).add(valueTransform.invoke(t10));
        }
        return destination;
    }

    @NotNull
    public static final <V> List<V> zip(@NotNull byte[] bArr, @NotNull byte[] other, @NotNull Function2<? super Byte, ? super Byte, ? extends V> transform) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int iMin = Math.min(bArr.length, other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i10 = 0; i10 < iMin; i10++) {
            arrayList.add(transform.invoke(Byte.valueOf(bArr[i10]), Byte.valueOf(other[i10])));
        }
        return arrayList;
    }

    @NotNull
    public static final <K, V> Map<K, V> associateBy(@NotNull boolean[] zArr, @NotNull Function1<? super Boolean, ? extends K> keySelector, @NotNull Function1<? super Boolean, ? extends V> valueTransform) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(r.u(MapsKt__MapsJVMKt.mapCapacity(zArr.length), 16));
        for (boolean z10 : zArr) {
            linkedHashMap.put(keySelector.invoke(Boolean.valueOf(z10)), valueTransform.invoke(Boolean.valueOf(z10)));
        }
        return linkedHashMap;
    }

    @NotNull
    public static final <K> Map<K, List<Character>> groupBy(@NotNull char[] cArr, @NotNull Function1<? super Character, ? extends K> keySelector) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (char c10 : cArr) {
            K kInvoke = keySelector.invoke(Character.valueOf(c10));
            Object arrayList = linkedHashMap.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(kInvoke, arrayList);
            }
            ((List) arrayList).add(Character.valueOf(c10));
        }
        return linkedHashMap;
    }

    @e1(version = "1.7")
    @oj.i(name = "maxByOrThrow")
    public static final <R extends Comparable<? super R>> char maxByOrThrow(@NotNull char[] cArr, @NotNull Function1<? super Character, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (cArr.length == 0) {
            throw new NoSuchElementException();
        }
        char c10 = cArr[0];
        int lastIndex = getLastIndex(cArr);
        if (lastIndex != 0) {
            R rInvoke = selector.invoke(Character.valueOf(c10));
            int i10 = 1;
            if (1 <= lastIndex) {
                while (true) {
                    char c11 = cArr[i10];
                    R rInvoke2 = selector.invoke(Character.valueOf(c11));
                    if (rInvoke.compareTo(rInvoke2) < 0) {
                        c10 = c11;
                        rInvoke = rInvoke2;
                    }
                    if (i10 == lastIndex) {
                        break;
                    }
                    i10++;
                }
            }
        }
        return c10;
    }

    @e1(version = "1.7")
    @oj.i(name = "minByOrThrow")
    public static final <R extends Comparable<? super R>> char minByOrThrow(@NotNull char[] cArr, @NotNull Function1<? super Character, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (cArr.length == 0) {
            throw new NoSuchElementException();
        }
        char c10 = cArr[0];
        int lastIndex = getLastIndex(cArr);
        if (lastIndex != 0) {
            R rInvoke = selector.invoke(Character.valueOf(c10));
            int i10 = 1;
            if (1 <= lastIndex) {
                while (true) {
                    char c11 = cArr[i10];
                    R rInvoke2 = selector.invoke(Character.valueOf(c11));
                    if (rInvoke.compareTo(rInvoke2) > 0) {
                        c10 = c11;
                        rInvoke = rInvoke2;
                    }
                    if (i10 == lastIndex) {
                        break;
                    }
                    i10++;
                }
            }
        }
        return c10;
    }

    public static final float single(@NotNull float[] fArr, @NotNull Function1<? super Float, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Float fValueOf = null;
        boolean z10 = false;
        for (float f10 : fArr) {
            if (predicate.invoke(Float.valueOf(f10)).booleanValue()) {
                if (z10) {
                    throw new IllegalArgumentException("Array contains more than one matching element.");
                }
                fValueOf = Float.valueOf(f10);
                z10 = true;
            }
        }
        if (!z10) {
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        }
        Intrinsics.checkNotNull(fValueOf, "null cannot be cast to non-null type kotlin.Float");
        return fValueOf.floatValue();
    }

    @e1(version = "1.4")
    public static void reverse(@NotNull long[] jArr, int i10, int i11) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        AbstractList.Companion.checkRangeIndexes$kotlin_stdlib(i10, i11, jArr.length);
        int i12 = (i10 + i11) / 2;
        if (i10 == i12) {
            return;
        }
        int i13 = i11 - 1;
        while (i10 < i12) {
            long j10 = jArr[i10];
            jArr[i10] = jArr[i13];
            jArr[i13] = j10;
            i13--;
            i10++;
        }
    }

    @u0
    @e1(version = "1.4")
    @f
    /* JADX INFO: renamed from: maxOf, reason: collision with other method in class */
    private static final float m794maxOf(short[] sArr, Function1<? super Short, Float> selector) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (sArr.length != 0) {
            float fFloatValue = selector.invoke(Short.valueOf(sArr[0])).floatValue();
            int lastIndex = getLastIndex(sArr);
            int i10 = 1;
            if (1 <= lastIndex) {
                while (true) {
                    fFloatValue = Math.max(fFloatValue, selector.invoke(Short.valueOf(sArr[i10])).floatValue());
                    if (i10 == lastIndex) {
                        break;
                    }
                    i10++;
                }
            }
            return fFloatValue;
        }
        throw new NoSuchElementException();
    }

    @u0
    @e1(version = "1.4")
    @f
    /* JADX INFO: renamed from: maxOfOrNull, reason: collision with other method in class */
    private static final Float m821maxOfOrNull(short[] sArr, Function1<? super Short, Float> selector) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (sArr.length == 0) {
            return null;
        }
        float fFloatValue = selector.invoke(Short.valueOf(sArr[0])).floatValue();
        int lastIndex = getLastIndex(sArr);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                fFloatValue = Math.max(fFloatValue, selector.invoke(Short.valueOf(sArr[i10])).floatValue());
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return Float.valueOf(fFloatValue);
    }

    @u0
    @e1(version = "1.4")
    @f
    /* JADX INFO: renamed from: minOf, reason: collision with other method in class */
    private static final float m830minOf(short[] sArr, Function1<? super Short, Float> selector) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (sArr.length != 0) {
            float fFloatValue = selector.invoke(Short.valueOf(sArr[0])).floatValue();
            int lastIndex = getLastIndex(sArr);
            int i10 = 1;
            if (1 <= lastIndex) {
                while (true) {
                    fFloatValue = Math.min(fFloatValue, selector.invoke(Short.valueOf(sArr[i10])).floatValue());
                    if (i10 == lastIndex) {
                        break;
                    }
                    i10++;
                }
            }
            return fFloatValue;
        }
        throw new NoSuchElementException();
    }

    @u0
    @e1(version = "1.4")
    @f
    /* JADX INFO: renamed from: minOfOrNull, reason: collision with other method in class */
    private static final Float m857minOfOrNull(short[] sArr, Function1<? super Short, Float> selector) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (sArr.length == 0) {
            return null;
        }
        float fFloatValue = selector.invoke(Short.valueOf(sArr[0])).floatValue();
        int lastIndex = getLastIndex(sArr);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                fFloatValue = Math.min(fFloatValue, selector.invoke(Short.valueOf(sArr[i10])).floatValue());
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return Float.valueOf(fFloatValue);
    }

    @NotNull
    public static final <V> List<V> zip(@NotNull short[] sArr, @NotNull short[] other, @NotNull Function2<? super Short, ? super Short, ? extends V> transform) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int iMin = Math.min(sArr.length, other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i10 = 0; i10 < iMin; i10++) {
            arrayList.add(transform.invoke(Short.valueOf(sArr[i10]), Short.valueOf(other[i10])));
        }
        return arrayList;
    }

    @NotNull
    public static final <K, V> Map<K, V> associateBy(@NotNull char[] cArr, @NotNull Function1<? super Character, ? extends K> keySelector, @NotNull Function1<? super Character, ? extends V> valueTransform) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(r.u(MapsKt__MapsJVMKt.mapCapacity(cArr.length), 16));
        for (char c10 : cArr) {
            linkedHashMap.put(keySelector.invoke(Character.valueOf(c10)), valueTransform.invoke(Character.valueOf(c10)));
        }
        return linkedHashMap;
    }

    @NotNull
    public static final <V> List<V> zip(@NotNull int[] iArr, @NotNull int[] other, @NotNull Function2<? super Integer, ? super Integer, ? extends V> transform) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int iMin = Math.min(iArr.length, other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i10 = 0; i10 < iMin; i10++) {
            arrayList.add(transform.invoke(Integer.valueOf(iArr[i10]), Integer.valueOf(other[i10])));
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <K, V, M extends Map<? super K, List<V>>> M groupByTo(@NotNull byte[] bArr, @NotNull M destination, @NotNull Function1<? super Byte, ? extends K> keySelector, @NotNull Function1<? super Byte, ? extends V> valueTransform) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        for (byte b10 : bArr) {
            K kInvoke = keySelector.invoke(Byte.valueOf(b10));
            Object arrayList = destination.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                destination.put(kInvoke, arrayList);
            }
            ((List) arrayList).add(valueTransform.invoke(Byte.valueOf(b10)));
        }
        return destination;
    }

    @e1(version = "1.4")
    @Nullable
    public static final <R extends Comparable<? super R>> Character maxByOrNull(@NotNull char[] cArr, @NotNull Function1<? super Character, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (cArr.length == 0) {
            return null;
        }
        char c10 = cArr[0];
        int lastIndex = getLastIndex(cArr);
        if (lastIndex == 0) {
            return Character.valueOf(c10);
        }
        R rInvoke = selector.invoke(Character.valueOf(c10));
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                char c11 = cArr[i10];
                R rInvoke2 = selector.invoke(Character.valueOf(c11));
                if (rInvoke.compareTo(rInvoke2) < 0) {
                    c10 = c11;
                    rInvoke = rInvoke2;
                }
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return Character.valueOf(c10);
    }

    @e1(version = "1.4")
    @Nullable
    public static final <R extends Comparable<? super R>> Character minByOrNull(@NotNull char[] cArr, @NotNull Function1<? super Character, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (cArr.length == 0) {
            boolean z10 = true & false;
            return null;
        }
        char c10 = cArr[0];
        int lastIndex = getLastIndex(cArr);
        if (lastIndex == 0) {
            return Character.valueOf(c10);
        }
        R rInvoke = selector.invoke(Character.valueOf(c10));
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                char c11 = cArr[i10];
                R rInvoke2 = selector.invoke(Character.valueOf(c11));
                if (rInvoke.compareTo(rInvoke2) > 0) {
                    c10 = c11;
                    rInvoke = rInvoke2;
                }
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return Character.valueOf(c10);
    }

    @e1(version = "1.4")
    public static final void reverse(@NotNull float[] fArr, int i10, int i11) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        AbstractList.Companion.checkRangeIndexes$kotlin_stdlib(i10, i11, fArr.length);
        int i12 = (i10 + i11) / 2;
        if (i10 == i12) {
            return;
        }
        int i13 = i11 - 1;
        while (i10 < i12) {
            float f10 = fArr[i10];
            fArr[i10] = fArr[i13];
            fArr[i13] = f10;
            i13--;
            i10++;
        }
    }

    public static final double single(@NotNull double[] dArr, @NotNull Function1<? super Double, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Double dValueOf = null;
        boolean z10 = false;
        for (double d10 : dArr) {
            if (predicate.invoke(Double.valueOf(d10)).booleanValue()) {
                if (z10) {
                    throw new IllegalArgumentException("Array contains more than one matching element.");
                }
                dValueOf = Double.valueOf(d10);
                z10 = true;
            }
        }
        if (!z10) {
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        }
        Intrinsics.checkNotNull(dValueOf, "null cannot be cast to non-null type kotlin.Double");
        return dValueOf.doubleValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <T, K, V> Map<K, List<V>> groupBy(@NotNull T[] tArr, @NotNull Function1<? super T, ? extends K> keySelector, @NotNull Function1<? super T, ? extends V> valueTransform) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (b bVar : tArr) {
            K kInvoke = keySelector.invoke(bVar);
            List<V> arrayList = linkedHashMap.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                linkedHashMap.put(kInvoke, arrayList);
            }
            arrayList.add(valueTransform.invoke(bVar));
        }
        return linkedHashMap;
    }

    @u0
    @e1(version = "1.4")
    @f
    /* JADX INFO: renamed from: maxOf, reason: collision with other method in class */
    private static final float m791maxOf(int[] iArr, Function1<? super Integer, Float> selector) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (iArr.length != 0) {
            float fFloatValue = selector.invoke(Integer.valueOf(iArr[0])).floatValue();
            int lastIndex = getLastIndex(iArr);
            int i10 = 1;
            if (1 <= lastIndex) {
                while (true) {
                    fFloatValue = Math.max(fFloatValue, selector.invoke(Integer.valueOf(iArr[i10])).floatValue());
                    if (i10 == lastIndex) {
                        break;
                    }
                    i10++;
                }
            }
            return fFloatValue;
        }
        throw new NoSuchElementException();
    }

    @u0
    @e1(version = "1.4")
    @f
    /* JADX INFO: renamed from: maxOfOrNull, reason: collision with other method in class */
    private static final Float m818maxOfOrNull(int[] iArr, Function1<? super Integer, Float> selector) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (iArr.length == 0) {
            return null;
        }
        float fFloatValue = selector.invoke(Integer.valueOf(iArr[0])).floatValue();
        int lastIndex = getLastIndex(iArr);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                fFloatValue = Math.max(fFloatValue, selector.invoke(Integer.valueOf(iArr[i10])).floatValue());
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return Float.valueOf(fFloatValue);
    }

    @u0
    @e1(version = "1.4")
    @f
    /* JADX INFO: renamed from: minOf, reason: collision with other method in class */
    private static final float m827minOf(int[] iArr, Function1<? super Integer, Float> selector) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (iArr.length == 0) {
            throw new NoSuchElementException();
        }
        float fFloatValue = selector.invoke(Integer.valueOf(iArr[0])).floatValue();
        int lastIndex = getLastIndex(iArr);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                fFloatValue = Math.min(fFloatValue, selector.invoke(Integer.valueOf(iArr[i10])).floatValue());
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return fFloatValue;
    }

    @u0
    @e1(version = "1.4")
    @f
    /* JADX INFO: renamed from: minOfOrNull, reason: collision with other method in class */
    private static final Float m854minOfOrNull(int[] iArr, Function1<? super Integer, Float> selector) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (iArr.length == 0) {
            return null;
        }
        float fFloatValue = selector.invoke(Integer.valueOf(iArr[0])).floatValue();
        int lastIndex = getLastIndex(iArr);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                fFloatValue = Math.min(fFloatValue, selector.invoke(Integer.valueOf(iArr[i10])).floatValue());
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return Float.valueOf(fFloatValue);
    }

    @NotNull
    public static final <V> List<V> zip(@NotNull long[] jArr, @NotNull long[] other, @NotNull Function2<? super Long, ? super Long, ? extends V> transform) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int iMin = Math.min(jArr.length, other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i10 = 0; i10 < iMin; i10++) {
            arrayList.add(transform.invoke(Long.valueOf(jArr[i10]), Long.valueOf(other[i10])));
        }
        return arrayList;
    }

    @e1(version = "1.4")
    public static final void reverse(@NotNull double[] dArr, int i10, int i11) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        AbstractList.Companion.checkRangeIndexes$kotlin_stdlib(i10, i11, dArr.length);
        int i12 = (i10 + i11) / 2;
        if (i10 == i12) {
            return;
        }
        int i13 = i11 - 1;
        while (i10 < i12) {
            double d10 = dArr[i10];
            dArr[i10] = dArr[i13];
            dArr[i13] = d10;
            i13--;
            i10++;
        }
    }

    @NotNull
    public static final <V> List<V> zip(@NotNull float[] fArr, @NotNull float[] other, @NotNull Function2<? super Float, ? super Float, ? extends V> transform) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int iMin = Math.min(fArr.length, other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i10 = 0; i10 < iMin; i10++) {
            arrayList.add(transform.invoke(Float.valueOf(fArr[i10]), Float.valueOf(other[i10])));
        }
        return arrayList;
    }

    public static final boolean single(@NotNull boolean[] zArr, @NotNull Function1<? super Boolean, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Boolean boolValueOf = null;
        boolean z10 = false;
        for (boolean z11 : zArr) {
            if (predicate.invoke(Boolean.valueOf(z11)).booleanValue()) {
                if (!z10) {
                    boolValueOf = Boolean.valueOf(z11);
                    z10 = true;
                } else {
                    throw new IllegalArgumentException("Array contains more than one matching element.");
                }
            }
        }
        if (z10) {
            Intrinsics.checkNotNull(boolValueOf, "null cannot be cast to non-null type kotlin.Boolean");
            return boolValueOf.booleanValue();
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <K, V, M extends Map<? super K, List<V>>> M groupByTo(@NotNull short[] sArr, @NotNull M destination, @NotNull Function1<? super Short, ? extends K> keySelector, @NotNull Function1<? super Short, ? extends V> valueTransform) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        for (short s10 : sArr) {
            K kInvoke = keySelector.invoke(Short.valueOf(s10));
            Object arrayList = destination.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                destination.put(kInvoke, arrayList);
            }
            ((List) arrayList).add(valueTransform.invoke(Short.valueOf(s10)));
        }
        return destination;
    }

    @u0
    @e1(version = "1.4")
    @f
    /* JADX INFO: renamed from: maxOf, reason: collision with other method in class */
    private static final float m792maxOf(long[] jArr, Function1<? super Long, Float> selector) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (jArr.length != 0) {
            float fFloatValue = selector.invoke(Long.valueOf(jArr[0])).floatValue();
            int lastIndex = getLastIndex(jArr);
            int i10 = 1;
            if (1 <= lastIndex) {
                while (true) {
                    fFloatValue = Math.max(fFloatValue, selector.invoke(Long.valueOf(jArr[i10])).floatValue());
                    if (i10 == lastIndex) {
                        break;
                    }
                    i10++;
                }
            }
            return fFloatValue;
        }
        throw new NoSuchElementException();
    }

    @u0
    @e1(version = "1.4")
    @f
    /* JADX INFO: renamed from: maxOfOrNull, reason: collision with other method in class */
    private static final Float m819maxOfOrNull(long[] jArr, Function1<? super Long, Float> selector) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (jArr.length == 0) {
            return null;
        }
        float fFloatValue = selector.invoke(Long.valueOf(jArr[0])).floatValue();
        int lastIndex = getLastIndex(jArr);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                fFloatValue = Math.max(fFloatValue, selector.invoke(Long.valueOf(jArr[i10])).floatValue());
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return Float.valueOf(fFloatValue);
    }

    @u0
    @e1(version = "1.4")
    @f
    /* JADX INFO: renamed from: minOf, reason: collision with other method in class */
    private static final float m828minOf(long[] jArr, Function1<? super Long, Float> selector) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (jArr.length != 0) {
            float fFloatValue = selector.invoke(Long.valueOf(jArr[0])).floatValue();
            int lastIndex = getLastIndex(jArr);
            int i10 = 1;
            if (1 <= lastIndex) {
                while (true) {
                    fFloatValue = Math.min(fFloatValue, selector.invoke(Long.valueOf(jArr[i10])).floatValue());
                    if (i10 == lastIndex) {
                        break;
                    }
                    i10++;
                }
            }
            return fFloatValue;
        }
        throw new NoSuchElementException();
    }

    @u0
    @e1(version = "1.4")
    @f
    /* JADX INFO: renamed from: minOfOrNull, reason: collision with other method in class */
    private static final Float m855minOfOrNull(long[] jArr, Function1<? super Long, Float> selector) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (jArr.length == 0) {
            return null;
        }
        float fFloatValue = selector.invoke(Long.valueOf(jArr[0])).floatValue();
        int lastIndex = getLastIndex(jArr);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                fFloatValue = Math.min(fFloatValue, selector.invoke(Long.valueOf(jArr[i10])).floatValue());
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return Float.valueOf(fFloatValue);
    }

    @NotNull
    public static final <V> List<V> zip(@NotNull double[] dArr, @NotNull double[] other, @NotNull Function2<? super Double, ? super Double, ? extends V> transform) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int iMin = Math.min(dArr.length, other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i10 = 0; i10 < iMin; i10++) {
            arrayList.add(transform.invoke(Double.valueOf(dArr[i10]), Double.valueOf(other[i10])));
        }
        return arrayList;
    }

    @NotNull
    public static final <K, V> Map<K, List<V>> groupBy(@NotNull byte[] bArr, @NotNull Function1<? super Byte, ? extends K> keySelector, @NotNull Function1<? super Byte, ? extends V> valueTransform) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (byte b10 : bArr) {
            K kInvoke = keySelector.invoke(Byte.valueOf(b10));
            List<V> arrayList = linkedHashMap.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                linkedHashMap.put(kInvoke, arrayList);
            }
            arrayList.add(valueTransform.invoke(Byte.valueOf(b10)));
        }
        return linkedHashMap;
    }

    @e1(version = "1.4")
    public static final void reverse(@NotNull boolean[] zArr, int i10, int i11) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        AbstractList.Companion.checkRangeIndexes$kotlin_stdlib(i10, i11, zArr.length);
        int i12 = (i10 + i11) / 2;
        if (i10 != i12) {
            int i13 = i11 - 1;
            while (i10 < i12) {
                boolean z10 = zArr[i10];
                zArr[i10] = zArr[i13];
                zArr[i13] = z10;
                i13--;
                i10++;
            }
        }
    }

    @NotNull
    public static final <V> List<V> zip(@NotNull boolean[] zArr, @NotNull boolean[] other, @NotNull Function2<? super Boolean, ? super Boolean, ? extends V> transform) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int iMin = Math.min(zArr.length, other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i10 = 0; i10 < iMin; i10++) {
            arrayList.add(transform.invoke(Boolean.valueOf(zArr[i10]), Boolean.valueOf(other[i10])));
        }
        return arrayList;
    }

    public static final char single(@NotNull char[] cArr, @NotNull Function1<? super Character, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Character chValueOf = null;
        boolean z10 = false;
        for (char c10 : cArr) {
            if (predicate.invoke(Character.valueOf(c10)).booleanValue()) {
                if (!z10) {
                    chValueOf = Character.valueOf(c10);
                    z10 = true;
                } else {
                    throw new IllegalArgumentException("Array contains more than one matching element.");
                }
            }
        }
        if (!z10) {
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        }
        Intrinsics.checkNotNull(chValueOf, "null cannot be cast to non-null type kotlin.Char");
        return chValueOf.charValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <K, V, M extends Map<? super K, List<V>>> M groupByTo(@NotNull int[] iArr, @NotNull M destination, @NotNull Function1<? super Integer, ? extends K> keySelector, @NotNull Function1<? super Integer, ? extends V> valueTransform) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        for (int i10 : iArr) {
            K kInvoke = keySelector.invoke(Integer.valueOf(i10));
            Object arrayList = destination.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                destination.put(kInvoke, arrayList);
            }
            ((List) arrayList).add(valueTransform.invoke(Integer.valueOf(i10)));
        }
        return destination;
    }

    @u0
    @e1(version = "1.4")
    @f
    /* JADX INFO: renamed from: maxOf, reason: collision with other method in class */
    private static final float m790maxOf(float[] fArr, Function1<? super Float, Float> selector) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (fArr.length != 0) {
            float fFloatValue = selector.invoke(Float.valueOf(fArr[0])).floatValue();
            int lastIndex = getLastIndex(fArr);
            int i10 = 1;
            if (1 <= lastIndex) {
                while (true) {
                    fFloatValue = Math.max(fFloatValue, selector.invoke(Float.valueOf(fArr[i10])).floatValue());
                    if (i10 == lastIndex) {
                        break;
                    }
                    i10++;
                }
            }
            return fFloatValue;
        }
        throw new NoSuchElementException();
    }

    @u0
    @e1(version = "1.4")
    @f
    /* JADX INFO: renamed from: maxOfOrNull, reason: collision with other method in class */
    private static final Float m817maxOfOrNull(float[] fArr, Function1<? super Float, Float> selector) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (fArr.length == 0) {
            return null;
        }
        float fFloatValue = selector.invoke(Float.valueOf(fArr[0])).floatValue();
        int lastIndex = getLastIndex(fArr);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                fFloatValue = Math.max(fFloatValue, selector.invoke(Float.valueOf(fArr[i10])).floatValue());
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return Float.valueOf(fFloatValue);
    }

    @u0
    @e1(version = "1.4")
    @f
    /* JADX INFO: renamed from: minOf, reason: collision with other method in class */
    private static final float m826minOf(float[] fArr, Function1<? super Float, Float> selector) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (fArr.length != 0) {
            float fFloatValue = selector.invoke(Float.valueOf(fArr[0])).floatValue();
            int lastIndex = getLastIndex(fArr);
            int i10 = 1;
            if (1 <= lastIndex) {
                while (true) {
                    fFloatValue = Math.min(fFloatValue, selector.invoke(Float.valueOf(fArr[i10])).floatValue());
                    if (i10 == lastIndex) {
                        break;
                    }
                    i10++;
                }
            }
            return fFloatValue;
        }
        throw new NoSuchElementException();
    }

    @u0
    @e1(version = "1.4")
    @f
    /* JADX INFO: renamed from: minOfOrNull, reason: collision with other method in class */
    private static final Float m853minOfOrNull(float[] fArr, Function1<? super Float, Float> selector) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (fArr.length == 0) {
            return null;
        }
        float fFloatValue = selector.invoke(Float.valueOf(fArr[0])).floatValue();
        int lastIndex = getLastIndex(fArr);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                fFloatValue = Math.min(fFloatValue, selector.invoke(Float.valueOf(fArr[i10])).floatValue());
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return Float.valueOf(fFloatValue);
    }

    @NotNull
    public static final <V> List<V> zip(@NotNull char[] cArr, @NotNull char[] other, @NotNull Function2<? super Character, ? super Character, ? extends V> transform) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int iMin = Math.min(cArr.length, other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i10 = 0; i10 < iMin; i10++) {
            arrayList.add(transform.invoke(Character.valueOf(cArr[i10]), Character.valueOf(other[i10])));
        }
        return arrayList;
    }

    @e1(version = "1.4")
    public static final void reverse(@NotNull char[] cArr, int i10, int i11) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        AbstractList.Companion.checkRangeIndexes$kotlin_stdlib(i10, i11, cArr.length);
        int i12 = (i10 + i11) / 2;
        if (i10 == i12) {
            return;
        }
        int i13 = i11 - 1;
        while (i10 < i12) {
            char c10 = cArr[i10];
            cArr[i10] = cArr[i13];
            cArr[i13] = c10;
            i13--;
            i10++;
        }
    }

    @NotNull
    public static <T, R> List<Pair<T, R>> zip(@NotNull T[] tArr, @NotNull R[] other) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        int iMin = Math.min(tArr.length, other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i10 = 0; i10 < iMin; i10++) {
            arrayList.add(TuplesKt.to(tArr[i10], other[i10]));
        }
        return arrayList;
    }

    @NotNull
    public static final <K, V> Map<K, List<V>> groupBy(@NotNull short[] sArr, @NotNull Function1<? super Short, ? extends K> keySelector, @NotNull Function1<? super Short, ? extends V> valueTransform) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (short s10 : sArr) {
            K kInvoke = keySelector.invoke(Short.valueOf(s10));
            List<V> arrayList = linkedHashMap.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                linkedHashMap.put(kInvoke, arrayList);
            }
            arrayList.add(valueTransform.invoke(Short.valueOf(s10)));
        }
        return linkedHashMap;
    }

    @u0
    @e1(version = "1.4")
    @f
    /* JADX INFO: renamed from: maxOf, reason: collision with other method in class */
    private static final float m789maxOf(double[] dArr, Function1<? super Double, Float> selector) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (dArr.length == 0) {
            throw new NoSuchElementException();
        }
        float fFloatValue = selector.invoke(Double.valueOf(dArr[0])).floatValue();
        int lastIndex = getLastIndex(dArr);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                fFloatValue = Math.max(fFloatValue, selector.invoke(Double.valueOf(dArr[i10])).floatValue());
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return fFloatValue;
    }

    @u0
    @e1(version = "1.4")
    @f
    /* JADX INFO: renamed from: maxOfOrNull, reason: collision with other method in class */
    private static final Float m816maxOfOrNull(double[] dArr, Function1<? super Double, Float> selector) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (dArr.length == 0) {
            return null;
        }
        float fFloatValue = selector.invoke(Double.valueOf(dArr[0])).floatValue();
        int lastIndex = getLastIndex(dArr);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                fFloatValue = Math.max(fFloatValue, selector.invoke(Double.valueOf(dArr[i10])).floatValue());
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return Float.valueOf(fFloatValue);
    }

    @u0
    @e1(version = "1.4")
    @f
    /* JADX INFO: renamed from: minOf, reason: collision with other method in class */
    private static final float m825minOf(double[] dArr, Function1<? super Double, Float> selector) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (dArr.length != 0) {
            float fFloatValue = selector.invoke(Double.valueOf(dArr[0])).floatValue();
            int lastIndex = getLastIndex(dArr);
            int i10 = 1;
            if (1 <= lastIndex) {
                while (true) {
                    fFloatValue = Math.min(fFloatValue, selector.invoke(Double.valueOf(dArr[i10])).floatValue());
                    if (i10 == lastIndex) {
                        break;
                    }
                    i10++;
                }
            }
            return fFloatValue;
        }
        throw new NoSuchElementException();
    }

    @u0
    @e1(version = "1.4")
    @f
    /* JADX INFO: renamed from: minOfOrNull, reason: collision with other method in class */
    private static final Float m852minOfOrNull(double[] dArr, Function1<? super Double, Float> selector) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (dArr.length == 0) {
            return null;
        }
        float fFloatValue = selector.invoke(Double.valueOf(dArr[0])).floatValue();
        int lastIndex = getLastIndex(dArr);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                fFloatValue = Math.min(fFloatValue, selector.invoke(Double.valueOf(dArr[i10])).floatValue());
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return Float.valueOf(fFloatValue);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <K, V, M extends Map<? super K, List<V>>> M groupByTo(@NotNull long[] jArr, @NotNull M destination, @NotNull Function1<? super Long, ? extends K> keySelector, @NotNull Function1<? super Long, ? extends V> valueTransform) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        for (long j10 : jArr) {
            K kInvoke = keySelector.invoke(Long.valueOf(j10));
            Object arrayList = destination.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                destination.put(kInvoke, arrayList);
            }
            ((List) arrayList).add(valueTransform.invoke(Long.valueOf(j10)));
        }
        return destination;
    }

    @NotNull
    public static final <R> List<Pair<Byte, R>> zip(@NotNull byte[] bArr, @NotNull R[] other) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        int iMin = Math.min(bArr.length, other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i10 = 0; i10 < iMin; i10++) {
            byte b10 = bArr[i10];
            arrayList.add(TuplesKt.to(Byte.valueOf(b10), other[i10]));
        }
        return arrayList;
    }

    @NotNull
    public static final <K, V> Map<K, List<V>> groupBy(@NotNull int[] iArr, @NotNull Function1<? super Integer, ? extends K> keySelector, @NotNull Function1<? super Integer, ? extends V> valueTransform) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (int i10 : iArr) {
            K kInvoke = keySelector.invoke(Integer.valueOf(i10));
            List<V> arrayList = linkedHashMap.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                linkedHashMap.put(kInvoke, arrayList);
            }
            arrayList.add(valueTransform.invoke(Integer.valueOf(i10)));
        }
        return linkedHashMap;
    }

    @u0
    @e1(version = "1.4")
    @f
    /* JADX INFO: renamed from: maxOf, reason: collision with other method in class */
    private static final float m795maxOf(boolean[] zArr, Function1<? super Boolean, Float> selector) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (zArr.length == 0) {
            throw new NoSuchElementException();
        }
        float fFloatValue = selector.invoke(Boolean.valueOf(zArr[0])).floatValue();
        int lastIndex = getLastIndex(zArr);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                fFloatValue = Math.max(fFloatValue, selector.invoke(Boolean.valueOf(zArr[i10])).floatValue());
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return fFloatValue;
    }

    @u0
    @e1(version = "1.4")
    @f
    /* JADX INFO: renamed from: maxOfOrNull, reason: collision with other method in class */
    private static final Float m822maxOfOrNull(boolean[] zArr, Function1<? super Boolean, Float> selector) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (zArr.length == 0) {
            return null;
        }
        float fFloatValue = selector.invoke(Boolean.valueOf(zArr[0])).floatValue();
        int lastIndex = getLastIndex(zArr);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                fFloatValue = Math.max(fFloatValue, selector.invoke(Boolean.valueOf(zArr[i10])).floatValue());
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return Float.valueOf(fFloatValue);
    }

    @u0
    @e1(version = "1.4")
    @f
    /* JADX INFO: renamed from: minOf, reason: collision with other method in class */
    private static final float m831minOf(boolean[] zArr, Function1<? super Boolean, Float> selector) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (zArr.length != 0) {
            float fFloatValue = selector.invoke(Boolean.valueOf(zArr[0])).floatValue();
            int lastIndex = getLastIndex(zArr);
            int i10 = 1;
            if (1 <= lastIndex) {
                while (true) {
                    fFloatValue = Math.min(fFloatValue, selector.invoke(Boolean.valueOf(zArr[i10])).floatValue());
                    if (i10 == lastIndex) {
                        break;
                    }
                    i10++;
                }
            }
            return fFloatValue;
        }
        throw new NoSuchElementException();
    }

    @u0
    @e1(version = "1.4")
    @f
    /* JADX INFO: renamed from: minOfOrNull, reason: collision with other method in class */
    private static final Float m858minOfOrNull(boolean[] zArr, Function1<? super Boolean, Float> selector) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (zArr.length == 0) {
            return null;
        }
        float fFloatValue = selector.invoke(Boolean.valueOf(zArr[0])).floatValue();
        int lastIndex = getLastIndex(zArr);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                fFloatValue = Math.min(fFloatValue, selector.invoke(Boolean.valueOf(zArr[i10])).floatValue());
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return Float.valueOf(fFloatValue);
    }

    @NotNull
    public static final <R> List<Pair<Short, R>> zip(@NotNull short[] sArr, @NotNull R[] other) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        int iMin = Math.min(sArr.length, other.length);
        ArrayList arrayList = new ArrayList(iMin);
        int i10 = 6 ^ 0;
        for (int i11 = 0; i11 < iMin; i11++) {
            short s10 = sArr[i11];
            arrayList.add(TuplesKt.to(Short.valueOf(s10), other[i11]));
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <K, V, M extends Map<? super K, List<V>>> M groupByTo(@NotNull float[] fArr, @NotNull M destination, @NotNull Function1<? super Float, ? extends K> keySelector, @NotNull Function1<? super Float, ? extends V> valueTransform) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        for (float f10 : fArr) {
            K kInvoke = keySelector.invoke(Float.valueOf(f10));
            Object arrayList = destination.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                destination.put(kInvoke, arrayList);
            }
            ((List) arrayList).add(valueTransform.invoke(Float.valueOf(f10)));
        }
        return destination;
    }

    @u0
    @e1(version = "1.4")
    @f
    /* JADX INFO: renamed from: maxOf, reason: collision with other method in class */
    private static final float m788maxOf(char[] cArr, Function1<? super Character, Float> selector) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (cArr.length == 0) {
            throw new NoSuchElementException();
        }
        float fFloatValue = selector.invoke(Character.valueOf(cArr[0])).floatValue();
        int lastIndex = getLastIndex(cArr);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                fFloatValue = Math.max(fFloatValue, selector.invoke(Character.valueOf(cArr[i10])).floatValue());
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return fFloatValue;
    }

    @u0
    @e1(version = "1.4")
    @f
    /* JADX INFO: renamed from: maxOfOrNull, reason: collision with other method in class */
    private static final Float m815maxOfOrNull(char[] cArr, Function1<? super Character, Float> selector) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (cArr.length == 0) {
            return null;
        }
        float fFloatValue = selector.invoke(Character.valueOf(cArr[0])).floatValue();
        int lastIndex = getLastIndex(cArr);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                fFloatValue = Math.max(fFloatValue, selector.invoke(Character.valueOf(cArr[i10])).floatValue());
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return Float.valueOf(fFloatValue);
    }

    @u0
    @e1(version = "1.4")
    @f
    /* JADX INFO: renamed from: minOf, reason: collision with other method in class */
    private static final float m824minOf(char[] cArr, Function1<? super Character, Float> selector) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (cArr.length == 0) {
            throw new NoSuchElementException();
        }
        float fFloatValue = selector.invoke(Character.valueOf(cArr[0])).floatValue();
        int lastIndex = getLastIndex(cArr);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                fFloatValue = Math.min(fFloatValue, selector.invoke(Character.valueOf(cArr[i10])).floatValue());
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return fFloatValue;
    }

    @u0
    @e1(version = "1.4")
    @f
    /* JADX INFO: renamed from: minOfOrNull, reason: collision with other method in class */
    private static final Float m851minOfOrNull(char[] cArr, Function1<? super Character, Float> selector) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (cArr.length == 0) {
            return null;
        }
        float fFloatValue = selector.invoke(Character.valueOf(cArr[0])).floatValue();
        int lastIndex = getLastIndex(cArr);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                fFloatValue = Math.min(fFloatValue, selector.invoke(Character.valueOf(cArr[i10])).floatValue());
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return Float.valueOf(fFloatValue);
    }

    @NotNull
    public static final <R> List<Pair<Integer, R>> zip(@NotNull int[] iArr, @NotNull R[] other) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        int iMin = Math.min(iArr.length, other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i10 = 0; i10 < iMin; i10++) {
            int i11 = iArr[i10];
            arrayList.add(TuplesKt.to(Integer.valueOf(i11), other[i10]));
        }
        return arrayList;
    }

    @NotNull
    public static final <K, V> Map<K, List<V>> groupBy(@NotNull long[] jArr, @NotNull Function1<? super Long, ? extends K> keySelector, @NotNull Function1<? super Long, ? extends V> valueTransform) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (long j10 : jArr) {
            K kInvoke = keySelector.invoke(Long.valueOf(j10));
            List<V> arrayList = linkedHashMap.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                linkedHashMap.put(kInvoke, arrayList);
            }
            arrayList.add(valueTransform.invoke(Long.valueOf(j10)));
        }
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <K, V, M extends Map<? super K, List<V>>> M groupByTo(@NotNull double[] dArr, @NotNull M destination, @NotNull Function1<? super Double, ? extends K> keySelector, @NotNull Function1<? super Double, ? extends V> valueTransform) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        for (double d10 : dArr) {
            K kInvoke = keySelector.invoke(Double.valueOf(d10));
            Object arrayList = destination.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                destination.put(kInvoke, arrayList);
            }
            ((List) arrayList).add(valueTransform.invoke(Double.valueOf(d10)));
        }
        return destination;
    }

    @NotNull
    public static final <R> List<Pair<Long, R>> zip(@NotNull long[] jArr, @NotNull R[] other) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        int iMin = Math.min(jArr.length, other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i10 = 0; i10 < iMin; i10++) {
            long j10 = jArr[i10];
            arrayList.add(TuplesKt.to(Long.valueOf(j10), other[i10]));
        }
        return arrayList;
    }

    @u0
    @e1(version = "1.4")
    @f
    /* JADX INFO: renamed from: maxOf, reason: collision with other method in class */
    private static final <T, R extends Comparable<? super R>> R m802maxOf(T[] tArr, Function1<? super T, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (tArr.length == 0) {
            throw new NoSuchElementException();
        }
        R rInvoke = selector.invoke(tArr[0]);
        int lastIndex = getLastIndex(tArr);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                R rInvoke2 = selector.invoke(tArr[i10]);
                if (rInvoke.compareTo(rInvoke2) < 0) {
                    rInvoke = rInvoke2;
                }
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return rInvoke;
    }

    @u0
    @e1(version = "1.4")
    @f
    private static final <T, R extends Comparable<? super R>> R maxOfOrNull(T[] tArr, Function1<? super T, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (tArr.length == 0) {
            return null;
        }
        R rInvoke = selector.invoke(tArr[0]);
        int lastIndex = getLastIndex(tArr);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                R rInvoke2 = selector.invoke(tArr[i10]);
                if (rInvoke.compareTo(rInvoke2) < 0) {
                    rInvoke = rInvoke2;
                }
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return rInvoke;
    }

    @u0
    @e1(version = "1.4")
    @f
    /* JADX INFO: renamed from: minOf, reason: collision with other method in class */
    private static final <T, R extends Comparable<? super R>> R m838minOf(T[] tArr, Function1<? super T, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (tArr.length != 0) {
            R rInvoke = selector.invoke(tArr[0]);
            int lastIndex = getLastIndex(tArr);
            int i10 = 1;
            if (1 <= lastIndex) {
                while (true) {
                    R rInvoke2 = selector.invoke(tArr[i10]);
                    if (rInvoke.compareTo(rInvoke2) > 0) {
                        rInvoke = rInvoke2;
                    }
                    if (i10 == lastIndex) {
                        break;
                    }
                    i10++;
                }
            }
            return rInvoke;
        }
        throw new NoSuchElementException();
    }

    @u0
    @e1(version = "1.4")
    @f
    private static final <T, R extends Comparable<? super R>> R minOfOrNull(T[] tArr, Function1<? super T, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (tArr.length == 0) {
            return null;
        }
        R rInvoke = selector.invoke(tArr[0]);
        int lastIndex = getLastIndex(tArr);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                R rInvoke2 = selector.invoke(tArr[i10]);
                if (rInvoke.compareTo(rInvoke2) > 0) {
                    rInvoke = rInvoke2;
                }
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return rInvoke;
    }

    @NotNull
    public static final <K, V> Map<K, List<V>> groupBy(@NotNull float[] fArr, @NotNull Function1<? super Float, ? extends K> keySelector, @NotNull Function1<? super Float, ? extends V> valueTransform) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (float f10 : fArr) {
            K kInvoke = keySelector.invoke(Float.valueOf(f10));
            List<V> arrayList = linkedHashMap.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                linkedHashMap.put(kInvoke, arrayList);
            }
            arrayList.add(valueTransform.invoke(Float.valueOf(f10)));
        }
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <K, V, M extends Map<? super K, List<V>>> M groupByTo(@NotNull boolean[] zArr, @NotNull M destination, @NotNull Function1<? super Boolean, ? extends K> keySelector, @NotNull Function1<? super Boolean, ? extends V> valueTransform) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        for (boolean z10 : zArr) {
            K kInvoke = keySelector.invoke(Boolean.valueOf(z10));
            Object arrayList = destination.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                destination.put(kInvoke, arrayList);
            }
            ((List) arrayList).add(valueTransform.invoke(Boolean.valueOf(z10)));
        }
        return destination;
    }

    @NotNull
    public static final <R> List<Pair<Float, R>> zip(@NotNull float[] fArr, @NotNull R[] other) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        int iMin = Math.min(fArr.length, other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i10 = 0; i10 < iMin; i10++) {
            float f10 = fArr[i10];
            arrayList.add(TuplesKt.to(Float.valueOf(f10), other[i10]));
        }
        return arrayList;
    }

    @u0
    @e1(version = "1.4")
    @f
    private static final <R extends Comparable<? super R>> R maxOfOrNull(byte[] bArr, Function1<? super Byte, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (bArr.length == 0) {
            return null;
        }
        R rInvoke = selector.invoke(Byte.valueOf(bArr[0]));
        int lastIndex = getLastIndex(bArr);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                R rInvoke2 = selector.invoke(Byte.valueOf(bArr[i10]));
                if (rInvoke.compareTo(rInvoke2) < 0) {
                    rInvoke = rInvoke2;
                }
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return rInvoke;
    }

    @u0
    @e1(version = "1.4")
    @f
    private static final <R extends Comparable<? super R>> R minOfOrNull(byte[] bArr, Function1<? super Byte, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (bArr.length == 0) {
            return null;
        }
        R rInvoke = selector.invoke(Byte.valueOf(bArr[0]));
        int lastIndex = getLastIndex(bArr);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                R rInvoke2 = selector.invoke(Byte.valueOf(bArr[i10]));
                if (rInvoke.compareTo(rInvoke2) > 0) {
                    rInvoke = rInvoke2;
                }
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return rInvoke;
    }

    @u0
    @e1(version = "1.4")
    @f
    /* JADX INFO: renamed from: maxOf, reason: collision with other method in class */
    private static final <R extends Comparable<? super R>> R m796maxOf(byte[] bArr, Function1<? super Byte, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (bArr.length == 0) {
            throw new NoSuchElementException();
        }
        R rInvoke = selector.invoke(Byte.valueOf(bArr[0]));
        int lastIndex = getLastIndex(bArr);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                R rInvoke2 = selector.invoke(Byte.valueOf(bArr[i10]));
                if (rInvoke.compareTo(rInvoke2) < 0) {
                    rInvoke = rInvoke2;
                }
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return rInvoke;
    }

    @u0
    @e1(version = "1.4")
    @f
    /* JADX INFO: renamed from: minOf, reason: collision with other method in class */
    private static final <R extends Comparable<? super R>> R m832minOf(byte[] bArr, Function1<? super Byte, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (bArr.length != 0) {
            R rInvoke = selector.invoke(Byte.valueOf(bArr[0]));
            int lastIndex = getLastIndex(bArr);
            int i10 = 1;
            if (1 <= lastIndex) {
                while (true) {
                    R rInvoke2 = selector.invoke(Byte.valueOf(bArr[i10]));
                    if (rInvoke.compareTo(rInvoke2) > 0) {
                        rInvoke = rInvoke2;
                    }
                    if (i10 == lastIndex) {
                        break;
                    }
                    i10++;
                }
            }
            return rInvoke;
        }
        throw new NoSuchElementException();
    }

    @NotNull
    public static final <R> List<Pair<Double, R>> zip(@NotNull double[] dArr, @NotNull R[] other) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        int iMin = Math.min(dArr.length, other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i10 = 0; i10 < iMin; i10++) {
            double d10 = dArr[i10];
            arrayList.add(TuplesKt.to(Double.valueOf(d10), other[i10]));
        }
        return arrayList;
    }

    @u0
    @e1(version = "1.4")
    @f
    private static final <R extends Comparable<? super R>> R maxOfOrNull(short[] sArr, Function1<? super Short, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (sArr.length == 0) {
            return null;
        }
        R rInvoke = selector.invoke(Short.valueOf(sArr[0]));
        int lastIndex = getLastIndex(sArr);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                R rInvoke2 = selector.invoke(Short.valueOf(sArr[i10]));
                if (rInvoke.compareTo(rInvoke2) < 0) {
                    rInvoke = rInvoke2;
                }
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return rInvoke;
    }

    @u0
    @e1(version = "1.4")
    @f
    private static final <R extends Comparable<? super R>> R minOfOrNull(short[] sArr, Function1<? super Short, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (sArr.length == 0) {
            boolean z10 = false | false;
            return null;
        }
        R rInvoke = selector.invoke(Short.valueOf(sArr[0]));
        int lastIndex = getLastIndex(sArr);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                R rInvoke2 = selector.invoke(Short.valueOf(sArr[i10]));
                if (rInvoke.compareTo(rInvoke2) > 0) {
                    rInvoke = rInvoke2;
                }
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return rInvoke;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <K, V, M extends Map<? super K, List<V>>> M groupByTo(@NotNull char[] cArr, @NotNull M destination, @NotNull Function1<? super Character, ? extends K> keySelector, @NotNull Function1<? super Character, ? extends V> valueTransform) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        for (char c10 : cArr) {
            K kInvoke = keySelector.invoke(Character.valueOf(c10));
            Object arrayList = destination.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                destination.put(kInvoke, arrayList);
            }
            ((List) arrayList).add(valueTransform.invoke(Character.valueOf(c10)));
        }
        return destination;
    }

    @NotNull
    public static final <K, V> Map<K, List<V>> groupBy(@NotNull double[] dArr, @NotNull Function1<? super Double, ? extends K> keySelector, @NotNull Function1<? super Double, ? extends V> valueTransform) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (double d10 : dArr) {
            K kInvoke = keySelector.invoke(Double.valueOf(d10));
            List<V> arrayList = linkedHashMap.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                linkedHashMap.put(kInvoke, arrayList);
            }
            arrayList.add(valueTransform.invoke(Double.valueOf(d10)));
        }
        return linkedHashMap;
    }

    @u0
    @e1(version = "1.4")
    @f
    /* JADX INFO: renamed from: maxOf, reason: collision with other method in class */
    private static final <R extends Comparable<? super R>> R m803maxOf(short[] sArr, Function1<? super Short, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (sArr.length != 0) {
            R rInvoke = selector.invoke(Short.valueOf(sArr[0]));
            int lastIndex = getLastIndex(sArr);
            int i10 = 1;
            if (1 <= lastIndex) {
                while (true) {
                    R rInvoke2 = selector.invoke(Short.valueOf(sArr[i10]));
                    if (rInvoke.compareTo(rInvoke2) < 0) {
                        rInvoke = rInvoke2;
                    }
                    if (i10 == lastIndex) {
                        break;
                    }
                    i10++;
                }
            }
            return rInvoke;
        }
        throw new NoSuchElementException();
    }

    @u0
    @e1(version = "1.4")
    @f
    /* JADX INFO: renamed from: minOf, reason: collision with other method in class */
    private static final <R extends Comparable<? super R>> R m839minOf(short[] sArr, Function1<? super Short, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (sArr.length != 0) {
            R rInvoke = selector.invoke(Short.valueOf(sArr[0]));
            int lastIndex = getLastIndex(sArr);
            int i10 = 1;
            if (1 <= lastIndex) {
                while (true) {
                    R rInvoke2 = selector.invoke(Short.valueOf(sArr[i10]));
                    if (rInvoke.compareTo(rInvoke2) > 0) {
                        rInvoke = rInvoke2;
                    }
                    if (i10 == lastIndex) {
                        break;
                    }
                    i10++;
                }
            }
            return rInvoke;
        }
        throw new NoSuchElementException();
    }

    @NotNull
    public static final <R> List<Pair<Boolean, R>> zip(@NotNull boolean[] zArr, @NotNull R[] other) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        int iMin = Math.min(zArr.length, other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i10 = 0; i10 < iMin; i10++) {
            boolean z10 = zArr[i10];
            arrayList.add(TuplesKt.to(Boolean.valueOf(z10), other[i10]));
        }
        return arrayList;
    }

    @u0
    @e1(version = "1.4")
    @f
    private static final <R extends Comparable<? super R>> R maxOfOrNull(int[] iArr, Function1<? super Integer, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (iArr.length == 0) {
            return null;
        }
        R rInvoke = selector.invoke(Integer.valueOf(iArr[0]));
        int lastIndex = getLastIndex(iArr);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                R rInvoke2 = selector.invoke(Integer.valueOf(iArr[i10]));
                if (rInvoke.compareTo(rInvoke2) < 0) {
                    rInvoke = rInvoke2;
                }
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return rInvoke;
    }

    @u0
    @e1(version = "1.4")
    @f
    private static final <R extends Comparable<? super R>> R minOfOrNull(int[] iArr, Function1<? super Integer, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (iArr.length == 0) {
            return null;
        }
        R rInvoke = selector.invoke(Integer.valueOf(iArr[0]));
        int lastIndex = getLastIndex(iArr);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                R rInvoke2 = selector.invoke(Integer.valueOf(iArr[i10]));
                if (rInvoke.compareTo(rInvoke2) > 0) {
                    rInvoke = rInvoke2;
                }
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return rInvoke;
    }

    @u0
    @e1(version = "1.4")
    @f
    /* JADX INFO: renamed from: maxOf, reason: collision with other method in class */
    private static final <R extends Comparable<? super R>> R m800maxOf(int[] iArr, Function1<? super Integer, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (iArr.length == 0) {
            throw new NoSuchElementException();
        }
        R rInvoke = selector.invoke(Integer.valueOf(iArr[0]));
        int lastIndex = getLastIndex(iArr);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                R rInvoke2 = selector.invoke(Integer.valueOf(iArr[i10]));
                if (rInvoke.compareTo(rInvoke2) < 0) {
                    rInvoke = rInvoke2;
                }
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return rInvoke;
    }

    @u0
    @e1(version = "1.4")
    @f
    /* JADX INFO: renamed from: minOf, reason: collision with other method in class */
    private static final <R extends Comparable<? super R>> R m836minOf(int[] iArr, Function1<? super Integer, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (iArr.length == 0) {
            throw new NoSuchElementException();
        }
        R rInvoke = selector.invoke(Integer.valueOf(iArr[0]));
        int lastIndex = getLastIndex(iArr);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                R rInvoke2 = selector.invoke(Integer.valueOf(iArr[i10]));
                if (rInvoke.compareTo(rInvoke2) > 0) {
                    rInvoke = rInvoke2;
                }
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return rInvoke;
    }

    @NotNull
    public static final <R> List<Pair<Character, R>> zip(@NotNull char[] cArr, @NotNull R[] other) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        int iMin = Math.min(cArr.length, other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i10 = 0; i10 < iMin; i10++) {
            char c10 = cArr[i10];
            arrayList.add(TuplesKt.to(Character.valueOf(c10), other[i10]));
        }
        return arrayList;
    }

    @NotNull
    public static final <K, V> Map<K, List<V>> groupBy(@NotNull boolean[] zArr, @NotNull Function1<? super Boolean, ? extends K> keySelector, @NotNull Function1<? super Boolean, ? extends V> valueTransform) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (boolean z10 : zArr) {
            K kInvoke = keySelector.invoke(Boolean.valueOf(z10));
            List<V> arrayList = linkedHashMap.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                linkedHashMap.put(kInvoke, arrayList);
            }
            arrayList.add(valueTransform.invoke(Boolean.valueOf(z10)));
        }
        return linkedHashMap;
    }

    @u0
    @e1(version = "1.4")
    @f
    private static final <R extends Comparable<? super R>> R maxOfOrNull(long[] jArr, Function1<? super Long, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (jArr.length == 0) {
            return null;
        }
        R rInvoke = selector.invoke(Long.valueOf(jArr[0]));
        int lastIndex = getLastIndex(jArr);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                R rInvoke2 = selector.invoke(Long.valueOf(jArr[i10]));
                if (rInvoke.compareTo(rInvoke2) < 0) {
                    rInvoke = rInvoke2;
                }
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return rInvoke;
    }

    @u0
    @e1(version = "1.4")
    @f
    private static final <R extends Comparable<? super R>> R minOfOrNull(long[] jArr, Function1<? super Long, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (jArr.length == 0) {
            return null;
        }
        R rInvoke = selector.invoke(Long.valueOf(jArr[0]));
        int lastIndex = getLastIndex(jArr);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                R rInvoke2 = selector.invoke(Long.valueOf(jArr[i10]));
                if (rInvoke.compareTo(rInvoke2) > 0) {
                    rInvoke = rInvoke2;
                }
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return rInvoke;
    }

    @u0
    @e1(version = "1.4")
    @f
    /* JADX INFO: renamed from: maxOf, reason: collision with other method in class */
    private static final <R extends Comparable<? super R>> R m801maxOf(long[] jArr, Function1<? super Long, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (jArr.length == 0) {
            throw new NoSuchElementException();
        }
        int i10 = 7 >> 0;
        R rInvoke = selector.invoke(Long.valueOf(jArr[0]));
        int lastIndex = getLastIndex(jArr);
        int i11 = 1;
        if (1 <= lastIndex) {
            while (true) {
                R rInvoke2 = selector.invoke(Long.valueOf(jArr[i11]));
                if (rInvoke.compareTo(rInvoke2) < 0) {
                    rInvoke = rInvoke2;
                }
                if (i11 == lastIndex) {
                    break;
                }
                i11++;
            }
        }
        return rInvoke;
    }

    @u0
    @e1(version = "1.4")
    @f
    /* JADX INFO: renamed from: minOf, reason: collision with other method in class */
    private static final <R extends Comparable<? super R>> R m837minOf(long[] jArr, Function1<? super Long, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (jArr.length != 0) {
            R rInvoke = selector.invoke(Long.valueOf(jArr[0]));
            int lastIndex = getLastIndex(jArr);
            int i10 = 1;
            if (1 <= lastIndex) {
                while (true) {
                    R rInvoke2 = selector.invoke(Long.valueOf(jArr[i10]));
                    if (rInvoke.compareTo(rInvoke2) > 0) {
                        rInvoke = rInvoke2;
                    }
                    if (i10 == lastIndex) {
                        break;
                    }
                    i10++;
                }
            }
            return rInvoke;
        }
        throw new NoSuchElementException();
    }

    @NotNull
    public static final <T, R> List<Pair<T, R>> zip(@NotNull T[] tArr, @NotNull Iterable<? extends R> other) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        int length = tArr.length;
        ArrayList arrayList = new ArrayList(Math.min(CollectionsKt__IterablesKt.collectionSizeOrDefault(other, 10), length));
        int i10 = 0;
        for (R r10 : other) {
            if (i10 >= length) {
                break;
            }
            arrayList.add(TuplesKt.to(tArr[i10], r10));
            i10++;
        }
        return arrayList;
    }

    @u0
    @e1(version = "1.4")
    @f
    private static final <R extends Comparable<? super R>> R maxOfOrNull(float[] fArr, Function1<? super Float, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (fArr.length == 0) {
            return null;
        }
        R rInvoke = selector.invoke(Float.valueOf(fArr[0]));
        int lastIndex = getLastIndex(fArr);
        int i10 = 1;
        int i11 = 5 & 1;
        if (1 <= lastIndex) {
            while (true) {
                R rInvoke2 = selector.invoke(Float.valueOf(fArr[i10]));
                if (rInvoke.compareTo(rInvoke2) < 0) {
                    rInvoke = rInvoke2;
                }
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return rInvoke;
    }

    @u0
    @e1(version = "1.4")
    @f
    private static final <R extends Comparable<? super R>> R minOfOrNull(float[] fArr, Function1<? super Float, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (fArr.length == 0) {
            return null;
        }
        R rInvoke = selector.invoke(Float.valueOf(fArr[0]));
        int lastIndex = getLastIndex(fArr);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                R rInvoke2 = selector.invoke(Float.valueOf(fArr[i10]));
                if (rInvoke.compareTo(rInvoke2) > 0) {
                    rInvoke = rInvoke2;
                }
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return rInvoke;
    }

    @NotNull
    public static final <K, V> Map<K, List<V>> groupBy(@NotNull char[] cArr, @NotNull Function1<? super Character, ? extends K> keySelector, @NotNull Function1<? super Character, ? extends V> valueTransform) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        Intrinsics.checkNotNullParameter(valueTransform, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (char c10 : cArr) {
            K kInvoke = keySelector.invoke(Character.valueOf(c10));
            List<V> arrayList = linkedHashMap.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                linkedHashMap.put(kInvoke, arrayList);
            }
            arrayList.add(valueTransform.invoke(Character.valueOf(c10)));
        }
        return linkedHashMap;
    }

    @u0
    @e1(version = "1.4")
    @f
    /* JADX INFO: renamed from: maxOf, reason: collision with other method in class */
    private static final <R extends Comparable<? super R>> R m799maxOf(float[] fArr, Function1<? super Float, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (fArr.length != 0) {
            R rInvoke = selector.invoke(Float.valueOf(fArr[0]));
            int lastIndex = getLastIndex(fArr);
            int i10 = 1;
            if (1 <= lastIndex) {
                while (true) {
                    R rInvoke2 = selector.invoke(Float.valueOf(fArr[i10]));
                    if (rInvoke.compareTo(rInvoke2) < 0) {
                        rInvoke = rInvoke2;
                    }
                    if (i10 == lastIndex) {
                        break;
                    }
                    i10++;
                }
            }
            return rInvoke;
        }
        throw new NoSuchElementException();
    }

    @u0
    @e1(version = "1.4")
    @f
    private static final <R extends Comparable<? super R>> R maxOfOrNull(double[] dArr, Function1<? super Double, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (dArr.length == 0) {
            return null;
        }
        R rInvoke = selector.invoke(Double.valueOf(dArr[0]));
        int lastIndex = getLastIndex(dArr);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                R rInvoke2 = selector.invoke(Double.valueOf(dArr[i10]));
                if (rInvoke.compareTo(rInvoke2) < 0) {
                    rInvoke = rInvoke2;
                }
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return rInvoke;
    }

    @u0
    @e1(version = "1.4")
    @f
    /* JADX INFO: renamed from: minOf, reason: collision with other method in class */
    private static final <R extends Comparable<? super R>> R m835minOf(float[] fArr, Function1<? super Float, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (fArr.length != 0) {
            R rInvoke = selector.invoke(Float.valueOf(fArr[0]));
            int lastIndex = getLastIndex(fArr);
            int i10 = 1;
            if (1 <= lastIndex) {
                while (true) {
                    R rInvoke2 = selector.invoke(Float.valueOf(fArr[i10]));
                    if (rInvoke.compareTo(rInvoke2) > 0) {
                        rInvoke = rInvoke2;
                    }
                    if (i10 == lastIndex) {
                        break;
                    }
                    i10++;
                }
            }
            return rInvoke;
        }
        throw new NoSuchElementException();
    }

    @u0
    @e1(version = "1.4")
    @f
    private static final <R extends Comparable<? super R>> R minOfOrNull(double[] dArr, Function1<? super Double, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (dArr.length == 0) {
            return null;
        }
        R rInvoke = selector.invoke(Double.valueOf(dArr[0]));
        int lastIndex = getLastIndex(dArr);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                R rInvoke2 = selector.invoke(Double.valueOf(dArr[i10]));
                if (rInvoke.compareTo(rInvoke2) > 0) {
                    rInvoke = rInvoke2;
                }
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return rInvoke;
    }

    @NotNull
    public static final <R> List<Pair<Byte, R>> zip(@NotNull byte[] bArr, @NotNull Iterable<? extends R> other) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        int length = bArr.length;
        ArrayList arrayList = new ArrayList(Math.min(CollectionsKt__IterablesKt.collectionSizeOrDefault(other, 10), length));
        int i10 = 0;
        for (R r10 : other) {
            if (i10 >= length) {
                break;
            }
            arrayList.add(TuplesKt.to(Byte.valueOf(bArr[i10]), r10));
            i10++;
        }
        return arrayList;
    }

    @u0
    @e1(version = "1.4")
    @f
    private static final <R extends Comparable<? super R>> R maxOfOrNull(boolean[] zArr, Function1<? super Boolean, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (zArr.length == 0) {
            return null;
        }
        R rInvoke = selector.invoke(Boolean.valueOf(zArr[0]));
        int lastIndex = getLastIndex(zArr);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                R rInvoke2 = selector.invoke(Boolean.valueOf(zArr[i10]));
                if (rInvoke.compareTo(rInvoke2) < 0) {
                    rInvoke = rInvoke2;
                }
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return rInvoke;
    }

    @u0
    @e1(version = "1.4")
    @f
    private static final <R extends Comparable<? super R>> R minOfOrNull(boolean[] zArr, Function1<? super Boolean, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (zArr.length == 0) {
            return null;
        }
        R rInvoke = selector.invoke(Boolean.valueOf(zArr[0]));
        int lastIndex = getLastIndex(zArr);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                R rInvoke2 = selector.invoke(Boolean.valueOf(zArr[i10]));
                if (rInvoke.compareTo(rInvoke2) > 0) {
                    rInvoke = rInvoke2;
                }
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return rInvoke;
    }

    @u0
    @e1(version = "1.4")
    @f
    /* JADX INFO: renamed from: maxOf, reason: collision with other method in class */
    private static final <R extends Comparable<? super R>> R m798maxOf(double[] dArr, Function1<? super Double, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (dArr.length != 0) {
            R rInvoke = selector.invoke(Double.valueOf(dArr[0]));
            int lastIndex = getLastIndex(dArr);
            int i10 = 1;
            if (1 <= lastIndex) {
                while (true) {
                    R rInvoke2 = selector.invoke(Double.valueOf(dArr[i10]));
                    if (rInvoke.compareTo(rInvoke2) < 0) {
                        rInvoke = rInvoke2;
                    }
                    if (i10 == lastIndex) {
                        break;
                    }
                    i10++;
                }
            }
            return rInvoke;
        }
        throw new NoSuchElementException();
    }

    @u0
    @e1(version = "1.4")
    @f
    /* JADX INFO: renamed from: minOf, reason: collision with other method in class */
    private static final <R extends Comparable<? super R>> R m834minOf(double[] dArr, Function1<? super Double, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (dArr.length == 0) {
            throw new NoSuchElementException();
        }
        R rInvoke = selector.invoke(Double.valueOf(dArr[0]));
        int lastIndex = getLastIndex(dArr);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                R rInvoke2 = selector.invoke(Double.valueOf(dArr[i10]));
                if (rInvoke.compareTo(rInvoke2) > 0) {
                    rInvoke = rInvoke2;
                }
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return rInvoke;
    }

    @NotNull
    public static final <R> List<Pair<Short, R>> zip(@NotNull short[] sArr, @NotNull Iterable<? extends R> other) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        int length = sArr.length;
        ArrayList arrayList = new ArrayList(Math.min(CollectionsKt__IterablesKt.collectionSizeOrDefault(other, 10), length));
        int i10 = 0;
        for (R r10 : other) {
            if (i10 >= length) {
                break;
            }
            arrayList.add(TuplesKt.to(Short.valueOf(sArr[i10]), r10));
            i10++;
        }
        return arrayList;
    }

    @u0
    @e1(version = "1.4")
    @f
    private static final <R extends Comparable<? super R>> R maxOfOrNull(char[] cArr, Function1<? super Character, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (cArr.length == 0) {
            return null;
        }
        R rInvoke = selector.invoke(Character.valueOf(cArr[0]));
        int lastIndex = getLastIndex(cArr);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                R rInvoke2 = selector.invoke(Character.valueOf(cArr[i10]));
                if (rInvoke.compareTo(rInvoke2) < 0) {
                    rInvoke = rInvoke2;
                }
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return rInvoke;
    }

    @u0
    @e1(version = "1.4")
    @f
    private static final <R extends Comparable<? super R>> R minOfOrNull(char[] cArr, Function1<? super Character, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (cArr.length == 0) {
            return null;
        }
        R rInvoke = selector.invoke(Character.valueOf(cArr[0]));
        int lastIndex = getLastIndex(cArr);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                R rInvoke2 = selector.invoke(Character.valueOf(cArr[i10]));
                if (rInvoke.compareTo(rInvoke2) > 0) {
                    rInvoke = rInvoke2;
                }
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return rInvoke;
    }

    @u0
    @e1(version = "1.4")
    @f
    /* JADX INFO: renamed from: maxOf, reason: collision with other method in class */
    private static final <R extends Comparable<? super R>> R m804maxOf(boolean[] zArr, Function1<? super Boolean, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (zArr.length != 0) {
            R rInvoke = selector.invoke(Boolean.valueOf(zArr[0]));
            int lastIndex = getLastIndex(zArr);
            int i10 = 1;
            if (1 <= lastIndex) {
                while (true) {
                    R rInvoke2 = selector.invoke(Boolean.valueOf(zArr[i10]));
                    if (rInvoke.compareTo(rInvoke2) < 0) {
                        rInvoke = rInvoke2;
                    }
                    if (i10 == lastIndex) {
                        break;
                    }
                    i10++;
                }
            }
            return rInvoke;
        }
        throw new NoSuchElementException();
    }

    @u0
    @e1(version = "1.4")
    @f
    /* JADX INFO: renamed from: minOf, reason: collision with other method in class */
    private static final <R extends Comparable<? super R>> R m840minOf(boolean[] zArr, Function1<? super Boolean, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (zArr.length != 0) {
            R rInvoke = selector.invoke(Boolean.valueOf(zArr[0]));
            int lastIndex = getLastIndex(zArr);
            int i10 = 1;
            if (1 <= lastIndex) {
                while (true) {
                    R rInvoke2 = selector.invoke(Boolean.valueOf(zArr[i10]));
                    if (rInvoke.compareTo(rInvoke2) > 0) {
                        rInvoke = rInvoke2;
                    }
                    if (i10 == lastIndex) {
                        break;
                    }
                    i10++;
                }
            }
            return rInvoke;
        }
        throw new NoSuchElementException();
    }

    @NotNull
    public static final <R> List<Pair<Integer, R>> zip(@NotNull int[] iArr, @NotNull Iterable<? extends R> other) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        int length = iArr.length;
        ArrayList arrayList = new ArrayList(Math.min(CollectionsKt__IterablesKt.collectionSizeOrDefault(other, 10), length));
        int i10 = 0;
        for (R r10 : other) {
            if (i10 >= length) {
                break;
            }
            arrayList.add(TuplesKt.to(Integer.valueOf(iArr[i10]), r10));
            i10++;
        }
        return arrayList;
    }

    @u0
    @e1(version = "1.4")
    @f
    /* JADX INFO: renamed from: maxOf, reason: collision with other method in class */
    private static final <R extends Comparable<? super R>> R m797maxOf(char[] cArr, Function1<? super Character, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (cArr.length == 0) {
            throw new NoSuchElementException();
        }
        R rInvoke = selector.invoke(Character.valueOf(cArr[0]));
        int lastIndex = getLastIndex(cArr);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                R rInvoke2 = selector.invoke(Character.valueOf(cArr[i10]));
                if (rInvoke.compareTo(rInvoke2) < 0) {
                    rInvoke = rInvoke2;
                }
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return rInvoke;
    }

    @u0
    @e1(version = "1.4")
    @f
    /* JADX INFO: renamed from: minOf, reason: collision with other method in class */
    private static final <R extends Comparable<? super R>> R m833minOf(char[] cArr, Function1<? super Character, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (cArr.length != 0) {
            R rInvoke = selector.invoke(Character.valueOf(cArr[0]));
            int lastIndex = getLastIndex(cArr);
            int i10 = 1;
            if (1 <= lastIndex) {
                while (true) {
                    R rInvoke2 = selector.invoke(Character.valueOf(cArr[i10]));
                    if (rInvoke.compareTo(rInvoke2) > 0) {
                        rInvoke = rInvoke2;
                    }
                    if (i10 == lastIndex) {
                        break;
                    }
                    i10++;
                }
            }
            return rInvoke;
        }
        throw new NoSuchElementException();
    }

    @NotNull
    public static final <R> List<Pair<Long, R>> zip(@NotNull long[] jArr, @NotNull Iterable<? extends R> other) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        int length = jArr.length;
        ArrayList arrayList = new ArrayList(Math.min(CollectionsKt__IterablesKt.collectionSizeOrDefault(other, 10), length));
        int i10 = 0;
        for (R r10 : other) {
            if (i10 >= length) {
                break;
            }
            arrayList.add(TuplesKt.to(Long.valueOf(jArr[i10]), r10));
            i10++;
        }
        return arrayList;
    }

    @NotNull
    public static final <R> List<Pair<Float, R>> zip(@NotNull float[] fArr, @NotNull Iterable<? extends R> other) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        int length = fArr.length;
        ArrayList arrayList = new ArrayList(Math.min(CollectionsKt__IterablesKt.collectionSizeOrDefault(other, 10), length));
        int i10 = 0;
        for (R r10 : other) {
            if (i10 >= length) {
                break;
            }
            arrayList.add(TuplesKt.to(Float.valueOf(fArr[i10]), r10));
            i10++;
        }
        return arrayList;
    }

    @NotNull
    public static final <R> List<Pair<Double, R>> zip(@NotNull double[] dArr, @NotNull Iterable<? extends R> other) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        int length = dArr.length;
        ArrayList arrayList = new ArrayList(Math.min(CollectionsKt__IterablesKt.collectionSizeOrDefault(other, 10), length));
        int i10 = 0;
        for (R r10 : other) {
            if (i10 >= length) {
                break;
            }
            arrayList.add(TuplesKt.to(Double.valueOf(dArr[i10]), r10));
            i10++;
        }
        return arrayList;
    }

    @NotNull
    public static final <R> List<Pair<Boolean, R>> zip(@NotNull boolean[] zArr, @NotNull Iterable<? extends R> other) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        int length = zArr.length;
        ArrayList arrayList = new ArrayList(Math.min(CollectionsKt__IterablesKt.collectionSizeOrDefault(other, 10), length));
        int i10 = 0;
        for (R r10 : other) {
            if (i10 >= length) {
                break;
            }
            arrayList.add(TuplesKt.to(Boolean.valueOf(zArr[i10]), r10));
            i10++;
        }
        return arrayList;
    }

    @NotNull
    public static final <R> List<Pair<Character, R>> zip(@NotNull char[] cArr, @NotNull Iterable<? extends R> other) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        int length = cArr.length;
        ArrayList arrayList = new ArrayList(Math.min(CollectionsKt__IterablesKt.collectionSizeOrDefault(other, 10), length));
        int i10 = 0;
        for (R r10 : other) {
            if (i10 >= length) {
                break;
            }
            arrayList.add(TuplesKt.to(Character.valueOf(cArr[i10]), r10));
            i10++;
        }
        return arrayList;
    }

    @NotNull
    public static final List<Pair<Byte, Byte>> zip(@NotNull byte[] bArr, @NotNull byte[] other) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        int iMin = Math.min(bArr.length, other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i10 = 0; i10 < iMin; i10++) {
            arrayList.add(TuplesKt.to(Byte.valueOf(bArr[i10]), Byte.valueOf(other[i10])));
        }
        return arrayList;
    }

    @NotNull
    public static final List<Pair<Short, Short>> zip(@NotNull short[] sArr, @NotNull short[] other) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        int iMin = Math.min(sArr.length, other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i10 = 0; i10 < iMin; i10++) {
            arrayList.add(TuplesKt.to(Short.valueOf(sArr[i10]), Short.valueOf(other[i10])));
        }
        return arrayList;
    }

    @NotNull
    public static final List<Pair<Integer, Integer>> zip(@NotNull int[] iArr, @NotNull int[] other) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        int iMin = Math.min(iArr.length, other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i10 = 0; i10 < iMin; i10++) {
            arrayList.add(TuplesKt.to(Integer.valueOf(iArr[i10]), Integer.valueOf(other[i10])));
        }
        return arrayList;
    }

    @NotNull
    public static final List<Pair<Long, Long>> zip(@NotNull long[] jArr, @NotNull long[] other) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        int iMin = Math.min(jArr.length, other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i10 = 0; i10 < iMin; i10++) {
            arrayList.add(TuplesKt.to(Long.valueOf(jArr[i10]), Long.valueOf(other[i10])));
        }
        return arrayList;
    }

    @NotNull
    public static final List<Pair<Float, Float>> zip(@NotNull float[] fArr, @NotNull float[] other) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        int iMin = Math.min(fArr.length, other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i10 = 0; i10 < iMin; i10++) {
            arrayList.add(TuplesKt.to(Float.valueOf(fArr[i10]), Float.valueOf(other[i10])));
        }
        return arrayList;
    }

    @NotNull
    public static final List<Pair<Double, Double>> zip(@NotNull double[] dArr, @NotNull double[] other) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        int iMin = Math.min(dArr.length, other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i10 = 0; i10 < iMin; i10++) {
            arrayList.add(TuplesKt.to(Double.valueOf(dArr[i10]), Double.valueOf(other[i10])));
        }
        return arrayList;
    }

    @NotNull
    public static final List<Pair<Boolean, Boolean>> zip(@NotNull boolean[] zArr, @NotNull boolean[] other) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        int iMin = Math.min(zArr.length, other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i10 = 0; i10 < iMin; i10++) {
            arrayList.add(TuplesKt.to(Boolean.valueOf(zArr[i10]), Boolean.valueOf(other[i10])));
        }
        return arrayList;
    }

    @NotNull
    public static final List<Pair<Character, Character>> zip(@NotNull char[] cArr, @NotNull char[] other) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        int iMin = Math.min(cArr.length, other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i10 = 0; i10 < iMin; i10++) {
            arrayList.add(TuplesKt.to(Character.valueOf(cArr[i10]), Character.valueOf(other[i10])));
        }
        return arrayList;
    }
}
