package f4;

import androidx.work.impl.model.b0;
import androidx.work.impl.model.j;
import androidx.work.impl.model.k;
import androidx.work.impl.model.p;
import androidx.work.impl.model.z;
import androidx.work.v;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nDiagnosticsWorker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DiagnosticsWorker.kt\nandroidx/work/impl/workers/DiagnosticsWorkerKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,88:1\n1855#2,2:89\n*S KotlinDebug\n*F\n+ 1 DiagnosticsWorker.kt\nandroidx/work/impl/workers/DiagnosticsWorkerKt\n*L\n77#1:89,2\n*E\n"})
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final String f274938a;

    static {
        String strI = v.i("DiagnosticsWrkr");
        Intrinsics.checkNotNullExpressionValue(strI, "tagWithPrefix(\"DiagnosticsWrkr\")");
        f274938a = strI;
    }

    private static final String c(androidx.work.impl.model.v vVar, String str, Integer num, String str2) {
        return '\n' + vVar.f76983a + "\t " + vVar.f76985c + "\t " + num + "\t " + vVar.f76984b.name() + "\t " + str + "\t " + str2 + '\t';
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String d(p pVar, b0 b0Var, k kVar, List<androidx.work.impl.model.v> list) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("\n Id \t Class Name\t Job Id\t State\t Unique Name\t Tags\t");
        for (androidx.work.impl.model.v vVar : list) {
            j jVarE = kVar.e(z.a(vVar));
            sb2.append(c(vVar, CollectionsKt.joinToString$default(pVar.b(vVar.f76983a), ",", null, null, 0, null, null, 62, null), jVarE != null ? Integer.valueOf(jVarE.f76956c) : null, CollectionsKt.joinToString$default(b0Var.d(vVar.f76983a), ",", null, null, 0, null, null, 62, null)));
        }
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}
