package androidx.compose.runtime.tooling;

import androidx.compose.runtime.internal.d1;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nSourceInformation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SourceInformation.kt\nandroidx/compose/runtime/tooling/SourceInformationKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n*L\n1#1,354:1\n1#2:355\n91#3:356\n34#3,5:357\n92#3:362\n91#3:363\n34#3,5:364\n92#3:369\n*S KotlinDebug\n*F\n+ 1 SourceInformation.kt\nandroidx/compose/runtime/tooling/SourceInformationKt\n*L\n239#1:356\n239#1:357,5\n239#1:362\n261#1:363\n261#1:364,5\n261#1:369\n*E\n"})
public final class d0 {
    private static final boolean a(b0 b0Var) {
        return b0Var.g() < b0Var.f().length() - 1 && Character.isLetter(b0Var.f().charAt(b0Var.g())) && b0Var.f().charAt(b0Var.g() + 1) == '(';
    }

    private static final List<v> b(b0 b0Var) throws z {
        boolean z10;
        Integer numValueOf;
        ArrayList arrayList = new ArrayList();
        while (!b0Var.c() && !b0Var.h(AbstractJsonLexerKt.COLON)) {
            if (b0Var.h('*')) {
                b0.b(b0Var, 0, 1, null);
                z10 = true;
            } else {
                z10 = false;
            }
            Integer numValueOf2 = !b0Var.h('@') ? Integer.valueOf(b0Var.k("@") + 1) : null;
            b0.b(b0Var, 0, 1, null);
            int iK = b0Var.k("L,:");
            if (b0Var.h('L')) {
                b0.b(b0Var, 0, 1, null);
                numValueOf = Integer.valueOf(b0Var.k(",:"));
            } else {
                numValueOf = null;
            }
            arrayList.add(new v(numValueOf2 != null ? numValueOf2.intValue() : -1, iK, numValueOf != null ? numValueOf.intValue() : -1, z10));
            if (b0Var.h(AbstractJsonLexerKt.COMMA)) {
                b0.b(b0Var, 0, 1, null);
            }
        }
        b0.b(b0Var, 0, 1, null);
        return arrayList;
    }

    private static final List<y> c(b0 b0Var) throws z {
        String strG;
        b0Var.a(2);
        ArrayList arrayList = new ArrayList();
        boolean z10 = false;
        while (!b0Var.c() && !b0Var.h(')')) {
            if (b0Var.h('!')) {
                b0.b(b0Var, 0, 1, null);
                String strL = b0Var.l("!,)");
                if (strL.length() != 0) {
                    int i10 = Integer.parseInt(strL);
                    int i11 = 0;
                    while (i10 > 0) {
                        int size = arrayList.size();
                        int i12 = 0;
                        while (true) {
                            if (i12 >= size) {
                                arrayList.add(new y(i11, null, null, 6, null));
                                i10--;
                                break;
                            }
                            if (((y) arrayList.get(i12)).c() == i11) {
                                i11++;
                                break;
                            }
                            i12++;
                        }
                    }
                } else {
                    z10 = true;
                }
            } else {
                int iK = b0Var.k("!:,)");
                if (b0Var.h(AbstractJsonLexerKt.COLON)) {
                    b0.b(b0Var, 0, 1, null);
                    strG = g(b0Var.l("!,)"));
                } else {
                    strG = null;
                }
                if (z10) {
                    int i13 = 0;
                    while (i13 < iK) {
                        int size2 = arrayList.size();
                        int i14 = 0;
                        while (true) {
                            if (i14 >= size2) {
                                arrayList.add(new y(i13, null, null, 6, null));
                                break;
                            }
                            if (((y) arrayList.get(i14)).c() == i13) {
                                i13++;
                                break;
                            }
                            i14++;
                        }
                    }
                    z10 = false;
                }
                arrayList.add(new y(iK, null, strG, 2, null));
            }
            if (b0Var.h(AbstractJsonLexerKt.COMMA)) {
                b0.b(b0Var, 0, 1, null);
            }
        }
        b0Var.e(')');
        b0.b(b0Var, 0, 1, null);
        return arrayList;
    }

    private static final List<y> d(b0 b0Var) throws z {
        String strG;
        b0Var.a(2);
        ArrayList arrayList = new ArrayList();
        while (!b0Var.c() && !b0Var.h(')')) {
            String strL = b0Var.l(":,)");
            if (b0Var.h(AbstractJsonLexerKt.COLON)) {
                b0.b(b0Var, 0, 1, null);
                strG = g(b0Var.l(",)"));
            } else {
                strG = null;
            }
            arrayList.add(new y(arrayList.size(), strL, strG));
            if (b0Var.h(AbstractJsonLexerKt.COMMA)) {
                b0.b(b0Var, 0, 1, null);
            }
        }
        b0Var.e(')');
        b0.b(b0Var, 0, 1, null);
        return arrayList;
    }

    @e
    @Nullable
    public static final c0 e(@NotNull String str) {
        if (str.length() == 0) {
            return null;
        }
        try {
            return f(str);
        } catch (z e10) {
            d1.a(e10.getMessage(), e10);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x005c  */
    /* JADX WARN: Code duplicated, block: B:29:0x008c  */
    /* JADX WARN: Code duplicated, block: B:31:0x0092  */
    /* JADX WARN: Code duplicated, block: B:32:0x0095  */
    /* JADX WARN: Code duplicated, block: B:34:0x009c  */
    /* JADX WARN: Code duplicated, block: B:42:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:43:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:47:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:50:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:54:0x00b4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x00ae A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:0x00a3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:0x006a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x0065 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x009e A[SYNTHETIC] */
    @NotNull
    public static final c0 f(@NotNull String str) throws z {
        boolean z10;
        boolean z11;
        String strL;
        List<y> listEmptyList;
        List<v> listEmptyList2;
        String strL2;
        char cD;
        int i10;
        b0 b0Var = new b0(str);
        String strM = null;
        if (b0Var.h('C')) {
            b0.b(b0Var, 0, 1, null);
            if (b0Var.h('C')) {
                b0.b(b0Var, 0, 1, null);
                z10 = true;
            } else {
                z10 = false;
            }
            if (b0Var.h('(')) {
                b0.b(b0Var, 0, 1, null);
                strL = b0Var.l(")");
                b0Var.e(')');
                b0.b(b0Var, 0, 1, null);
                z11 = true;
            } else {
                z11 = true;
            }
            listEmptyList = CollectionsKt.emptyList();
            while (a(b0Var)) {
                cD = b0Var.d();
                if (cD != 'N') {
                    listEmptyList = d(b0Var);
                } else if (cD != 'P') {
                    b0Var.a(2);
                    i10 = 0;
                    while (true) {
                        if (i10 > 0 && b0Var.h(')')) {
                            b0Var.e(')');
                            b0.b(b0Var, 0, 1, null);
                            break;
                        }
                        if (!b0Var.c()) {
                            b0Var.n("unexpected end");
                            throw new kotlin.a0();
                        }
                        if (b0Var.h('(')) {
                            i10++;
                        } else if (b0Var.h(')')) {
                            i10--;
                        }
                        b0.b(b0Var, 0, 1, null);
                    }
                } else {
                    listEmptyList = c(b0Var);
                }
            }
            listEmptyList2 = CollectionsKt.emptyList();
            if (b0Var.h(AbstractJsonLexerKt.COLON)) {
                b0.b(b0Var, 0, 1, null);
            } else {
                listEmptyList2 = b(b0Var);
            }
            strL2 = b0Var.l("#");
            if (strL2.length() <= 0) {
                strL2 = null;
            }
            if (b0Var.h('#')) {
                b0.b(b0Var, 0, 1, null);
                strM = b0Var.m();
            }
            String str2 = strL2;
            return new c0(z11, z10, strL, str2, listEmptyList, strM, listEmptyList2, str);
        }
        z10 = false;
        z11 = false;
        strL = null;
        listEmptyList = CollectionsKt.emptyList();
        while (a(b0Var)) {
            cD = b0Var.d();
            if (cD != 'N') {
                listEmptyList = d(b0Var);
            } else if (cD != 'P') {
                b0Var.a(2);
                i10 = 0;
                while (true) {
                    if (i10 > 0) {
                    }
                    if (!b0Var.c()) {
                        b0Var.n("unexpected end");
                        throw new kotlin.a0();
                    }
                    if (b0Var.h('(')) {
                        i10++;
                    } else if (b0Var.h(')')) {
                        i10--;
                    }
                    b0.b(b0Var, 0, 1, null);
                }
            } else {
                listEmptyList = c(b0Var);
            }
        }
        listEmptyList2 = CollectionsKt.emptyList();
        if (b0Var.h(AbstractJsonLexerKt.COLON)) {
            listEmptyList2 = b(b0Var);
        } else {
            b0.b(b0Var, 0, 1, null);
        }
        strL2 = b0Var.l("#");
        if (strL2.length() <= 0) {
            strL2 = null;
        }
        if (b0Var.h('#')) {
            b0.b(b0Var, 0, 1, null);
            strM = b0Var.m();
        }
        String str3 = strL2;
        return new c0(z11, z10, strL, str3, listEmptyList, strM, listEmptyList2, str);
    }

    private static final String g(String str) {
        return StringsKt.o2(str, "c#", "androidx.compose.", false, 4, null);
    }
}
