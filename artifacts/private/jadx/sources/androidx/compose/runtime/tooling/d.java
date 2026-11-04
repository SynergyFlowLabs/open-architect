package androidx.compose.runtime.tooling;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nComposeStackTrace.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComposeStackTrace.kt\nandroidx/compose/runtime/tooling/ComposeStackTraceKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n*L\n1#1,134:1\n2632#2,3:135\n1#3:138\n34#4,5:139\n34#4,5:144\n*S KotlinDebug\n*F\n+ 1 ComposeStackTrace.kt\nandroidx/compose/runtime/tooling/ComposeStackTraceKt\n*L\n39#1:135,3\n66#1:139,5\n128#1:144,5\n*E\n"})
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final String f36685a = "9igjgp";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final boolean f36686b = false;

    /* JADX WARN: Code duplicated, block: B:15:0x0044 A[PHI: r9
      0x0044: PHI (r9v1 java.lang.String) = (r9v0 java.lang.String), (r9v14 java.lang.String) binds: [B:5:0x002b, B:11:0x003b] A[DONT_GENERATE, DONT_INLINE]] */
    public static final void a(@NotNull StringBuilder sb2, @NotNull List<c> list) {
        List listCreateListBuilder = CollectionsKt.createListBuilder();
        List listAsReversed = CollectionsKt.asReversed(list);
        int size = listAsReversed.size();
        String str = null;
        String str2 = null;
        for (int i10 = 0; i10 < size; i10++) {
            c cVar = (c) listAsReversed.get(i10);
            c0 c0VarF = cVar.f();
            String strA = c0VarF.a();
            if (strA != null) {
                str = strA;
            } else {
                strA = c0VarF.g() ? "<lambda>" : null;
                if (strA != null) {
                    str = strA;
                } else if (str == null) {
                    str = "<unknown function>";
                }
            }
            String strF = c0VarF.f();
            if (strF != null) {
                str2 = strF;
            } else if (str2 == null) {
                str2 = "<unknown file>";
            }
            List<v> listB = c0VarF.b();
            String str3 = str + '(' + str2 + AbstractJsonLexerKt.COLON + ((cVar.e() == null || cVar.e().intValue() >= listB.size()) ? "<unknown line>" : String.valueOf(listB.get(cVar.e().intValue()).b())) + ')';
            Intrinsics.checkNotNullExpressionValue(str3, "toString(...)");
            if (!c0VarF.g()) {
            }
            if (!Intrinsics.areEqual(c0VarF.a(), "rememberCompositionContext") || !Intrinsics.areEqual(c0VarF.c(), f36685a)) {
                listCreateListBuilder.add(str3);
            }
        }
        List listAsReversed2 = CollectionsKt.asReversed(CollectionsKt.build(listCreateListBuilder));
        int size2 = listAsReversed2.size();
        for (int i11 = 0; i11 < size2; i11++) {
            sb2.append("\tat " + ((String) listAsReversed2.get(i11)));
            Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
            sb2.append('\n');
            Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
        }
    }

    @NotNull
    public static final Throwable b(@NotNull Throwable th2, @NotNull Function0<? extends List<c>> function0) {
        c(th2, function0);
        return th2;
    }

    public static final boolean c(@NotNull Throwable th2, @NotNull Function0<? extends List<c>> function0) {
        s sVar;
        List<Throwable> listD = kotlin.p.d(th2);
        boolean z10 = false;
        if (!(listD instanceof Collection) || !listD.isEmpty()) {
            Iterator<T> it = listD.iterator();
            while (it.hasNext()) {
                if (((Throwable) it.next()) instanceof s) {
                    return false;
                }
            }
        }
        try {
            List<c> listInvoke = function0.invoke();
            boolean zIsEmpty = listInvoke.isEmpty();
            z10 = !zIsEmpty;
            sVar = !zIsEmpty ? new s(listInvoke) : null;
        } catch (Throwable th3) {
            sVar = th3;
        }
        if (sVar != null) {
            kotlin.p.a(th2, sVar);
        }
        return z10;
    }
}
