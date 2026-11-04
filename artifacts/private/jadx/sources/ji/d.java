package ji;

import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.k0;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@SourceDebugExtension({"SMAP\nDebug.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Debug.kt\nio/ktor/http/parsing/DebugKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,41:1\n1869#2,2:42\n1869#2,2:44\n*S KotlinDebug\n*F\n+ 1 Debug.kt\nio/ktor/http/parsing/DebugKt\n*L\n16#1:42,2\n20#1:44,2\n*E\n"})
public final class d {
    public static final void a(@NotNull e eVar, int i10) {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        if (eVar instanceof v) {
            c(i10, "STRING[" + Regex.f313196c.c(((v) eVar).c()) + AbstractJsonLexerKt.END_LIST);
            return;
        }
        if (eVar instanceof s) {
            c(i10, "STRING[" + ((s) eVar).c() + AbstractJsonLexerKt.END_LIST);
            return;
        }
        if (eVar instanceof j) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("NAMED[");
            j jVar = (j) eVar;
            sb2.append(jVar.c());
            sb2.append(AbstractJsonLexerKt.END_LIST);
            c(i10, sb2.toString());
            a(jVar.b(), i10 + 2);
            return;
        }
        if (eVar instanceof t) {
            c(i10, "SEQUENCE");
            Iterator<T> it = ((t) eVar).a().iterator();
            while (it.hasNext()) {
                a((e) it.next(), i10 + 2);
            }
        } else {
            if (!(eVar instanceof k)) {
                if (eVar instanceof i) {
                    c(i10, "MAYBE");
                    a(((i) eVar).b(), i10 + 2);
                    return;
                }
                if (eVar instanceof h) {
                    c(i10, "MANY");
                    a(((h) eVar).b(), i10 + 2);
                    return;
                }
                if (eVar instanceof b) {
                    c(i10, "MANY_NOT_EMPTY");
                    a(((b) eVar).b(), i10 + 2);
                    return;
                }
                if (eVar instanceof a) {
                    c(i10, "ANY_OF[" + Regex.f313196c.c(((a) eVar).c()) + AbstractJsonLexerKt.END_LIST);
                    return;
                }
                if (!(eVar instanceof r)) {
                    throw new k0();
                }
                StringBuilder sb3 = new StringBuilder();
                sb3.append("RANGE[");
                r rVar = (r) eVar;
                sb3.append(rVar.c());
                sb3.append(org.apache.commons.codec.language.l.f335457d);
                sb3.append(rVar.d());
                sb3.append(AbstractJsonLexerKt.END_LIST);
                c(i10, sb3.toString());
                return;
            }
            c(i10, "OR");
            Iterator<T> it2 = ((k) eVar).a().iterator();
            while (it2.hasNext()) {
                a((e) it2.next(), i10 + 2);
            }
        }
    }

    public static /* synthetic */ void b(e eVar, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 0;
        }
        a(eVar, i10);
    }

    private static final void c(int i10, Object obj) {
        System.out.println((Object) (StringsKt.g2(" ", i10) + (i10 / 2) + ": " + obj));
    }
}
