package androidx.compose.ui.graphics.vector;

import androidx.compose.ui.graphics.k2;
import com.rabbitmq.client.k0;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nPathParser.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PathParser.kt\nandroidx/compose/ui/graphics/vector/PathParser\n+ 2 FastFloatParser.kt\nandroidx/compose/ui/graphics/vector/FastFloatParserKt\n+ 3 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,546:1\n152#1,6:550\n41#2:547\n43#2:548\n22#3:549\n*S KotlinDebug\n*F\n+ 1 PathParser.kt\nandroidx/compose/ui/graphics/vector/PathParser\n*L\n135#1:550,6\n129#1:547\n130#1:548\n130#1:549\n*E\n"})
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private ArrayList<h> f38511a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private float[] f38512b = new float[64];

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ArrayList e(j jVar, String str, ArrayList arrayList, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            arrayList = new ArrayList();
        }
        return jVar.d(str, arrayList);
    }

    private final void f(int i10) {
        float[] fArr = this.f38512b;
        if (i10 >= fArr.length) {
            float[] fArr2 = new float[i10 * 2];
            this.f38512b = fArr2;
            ArraysKt.copyInto(fArr, fArr2, 0, 0, fArr.length);
        }
    }

    public static /* synthetic */ k2 i(j jVar, k2 k2Var, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            k2Var = androidx.compose.ui.graphics.u.a();
        }
        return jVar.h(k2Var);
    }

    @NotNull
    public final j a(@NotNull List<? extends h> list) {
        ArrayList<h> arrayList = this.f38511a;
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            this.f38511a = arrayList;
        }
        arrayList.addAll(list);
        return this;
    }

    public final void b() {
        ArrayList<h> arrayList = this.f38511a;
        if (arrayList != null) {
            arrayList.clear();
        }
    }

    @NotNull
    public final j c(@NotNull String str) {
        ArrayList<h> arrayList = this.f38511a;
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            this.f38511a = arrayList;
        } else {
            arrayList.clear();
        }
        d(str, arrayList);
        return this;
    }

    @NotNull
    public final ArrayList<h> d(@NotNull String str, @NotNull ArrayList<h> arrayList) {
        int i10;
        char cCharAt;
        int i11;
        int length = str.length();
        int i12 = 0;
        while (i12 < length && Intrinsics.compare((int) str.charAt(i12), 32) <= 0) {
            i12++;
        }
        while (length > i12 && Intrinsics.compare((int) str.charAt(length - 1), 32) <= 0) {
            length--;
        }
        int i13 = 0;
        while (i12 < length) {
            while (true) {
                i10 = i12 + 1;
                cCharAt = str.charAt(i12);
                int i14 = cCharAt | ' ';
                if ((i14 - 97) * (i14 - 122) <= 0 && i14 != 101) {
                    break;
                }
                if (i10 >= length) {
                    cCharAt = 0;
                    break;
                }
                i12 = i10;
            }
            if (cCharAt != 0) {
                if ((cCharAt | ' ') != 122) {
                    i13 = 0;
                    while (true) {
                        if (i10 >= length || Intrinsics.compare((int) str.charAt(i10), 32) > 0) {
                            long jI = b.i(str, i10, length);
                            i11 = (int) (jI >>> 32);
                            float fIntBitsToFloat = Float.intBitsToFloat((int) (jI & k0.f265952a));
                            if (!Float.isNaN(fIntBitsToFloat)) {
                                float[] fArr = this.f38512b;
                                int i15 = i13 + 1;
                                fArr[i13] = fIntBitsToFloat;
                                if (i15 >= fArr.length) {
                                    float[] fArr2 = new float[i15 * 2];
                                    this.f38512b = fArr2;
                                    ArraysKt.copyInto(fArr, fArr2, 0, 0, fArr.length);
                                }
                                i13 = i15;
                            }
                            while (i11 < length && str.charAt(i11) == ',') {
                                i11++;
                            }
                            if (i11 >= length || Float.isNaN(fIntBitsToFloat)) {
                                break;
                            }
                            i10 = i11;
                        } else {
                            i10++;
                        }
                    }
                    i10 = i11;
                }
                i.a(cCharAt, arrayList, this.f38512b, i13);
            }
            i12 = i10;
        }
        return arrayList;
    }

    @NotNull
    public final List<h> g() {
        ArrayList<h> arrayList = this.f38511a;
        return arrayList != null ? arrayList : CollectionsKt.emptyList();
    }

    @NotNull
    public final k2 h(@NotNull k2 k2Var) {
        k2 k2VarD;
        ArrayList<h> arrayList = this.f38511a;
        return (arrayList == null || (k2VarD = k.d(arrayList, k2Var)) == null) ? androidx.compose.ui.graphics.u.a() : k2VarD;
    }
}
