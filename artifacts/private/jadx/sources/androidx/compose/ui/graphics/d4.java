package androidx.compose.ui.graphics;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nVertices.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Vertices.kt\nandroidx/compose/ui/graphics/Vertices\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 5 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,68:1\n103#2:69\n35#2,5:70\n104#2:75\n65#3:76\n69#3:79\n60#4:77\n70#4:80\n22#5:78\n22#5:81\n*S KotlinDebug\n*F\n+ 1 Vertices.kt\nandroidx/compose/ui/graphics/Vertices\n*L\n41#1:69\n41#1:70,5\n41#1:75\n61#1:76\n63#1:79\n61#1:77\n63#1:80\n61#1:78\n63#1:81\n*E\n"})
public final class d4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f37720a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final float[] f37721b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final float[] f37722c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final int[] f37723d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final short[] f37724e;

    public /* synthetic */ d4(int i10, List list, List list2, List list3, List list4, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, list, list2, list3, list4);
    }

    private final int[] a(List<q0> list) {
        int size = list.size();
        int[] iArr = new int[size];
        for (int i10 = 0; i10 < size; i10++) {
            iArr[i10] = s0.t(list.get(i10).M());
        }
        return iArr;
    }

    private final float[] b(List<n0.g> list) {
        int size = list.size() * 2;
        float[] fArr = new float[size];
        for (int i10 = 0; i10 < size; i10++) {
            long jB = list.get(i10 / 2).B();
            fArr[i10] = i10 % 2 == 0 ? Float.intBitsToFloat((int) (jB >> 32)) : Float.intBitsToFloat((int) (jB & com.rabbitmq.client.k0.f265952a));
        }
        return fArr;
    }

    @NotNull
    public final int[] c() {
        return this.f37723d;
    }

    @NotNull
    public final short[] d() {
        return this.f37724e;
    }

    @NotNull
    public final float[] e() {
        return this.f37721b;
    }

    @NotNull
    public final float[] f() {
        return this.f37722c;
    }

    public final int g() {
        return this.f37720a;
    }

    private d4(int i10, List<n0.g> list, List<n0.g> list2, List<q0> list3, List<Integer> list4) {
        this.f37720a = i10;
        if (list2.size() != list.size()) {
            w1.b("positions and textureCoordinates lengths must match.");
        }
        if (list3.size() != list.size()) {
            w1.b("positions and colors lengths must match.");
        }
        int size = list4.size();
        for (int i11 = 0; i11 < size; i11++) {
            int iIntValue = list4.get(i11).intValue();
            if (iIntValue < 0 || iIntValue >= list.size()) {
                w1.b("indices values must be valid indices in the positions list.");
                break;
            }
        }
        this.f37721b = b(list);
        this.f37722c = b(list2);
        this.f37723d = a(list3);
        int size2 = list4.size();
        short[] sArr = new short[size2];
        for (int i12 = 0; i12 < size2; i12++) {
            sArr[i12] = (short) list4.get(i12).intValue();
        }
        this.f37724e = sArr;
    }
}
