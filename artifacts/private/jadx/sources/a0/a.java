package a0;

import androidx.collection.g2;
import androidx.compose.runtime.internal.w0;
import b0.f;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nTextContextMenuBuilderScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextContextMenuBuilderScope.kt\nandroidx/compose/foundation/text/contextmenu/builder/TextContextMenuBuilderScope\n+ 2 ObjectList.kt\nandroidx/collection/ObjectListKt\n+ 3 ObjectList.kt\nandroidx/collection/ObjectList\n+ 4 ObjectList.kt\nandroidx/collection/MutableObjectList\n*L\n1#1,101:1\n1516#2:102\n1516#2:103\n1516#2:104\n287#3,4:105\n98#3,2:109\n287#3,4:111\n100#3,4:115\n292#3:119\n104#3:120\n292#3:123\n465#3:124\n80#3:125\n80#3:126\n919#4,2:121\n919#4,2:127\n919#4,2:129\n919#4,2:131\n*S KotlinDebug\n*F\n+ 1 TextContextMenuBuilderScope.kt\nandroidx/compose/foundation/text/contextmenu/builder/TextContextMenuBuilderScope\n*L\n34#1:102\n35#1:103\n45#1:104\n49#1:105,4\n58#1:109,2\n58#1:111,4\n58#1:115,4\n58#1:119\n58#1:120\n49#1:123\n65#1:124\n65#1:125\n67#1:126\n60#1:121,2\n83#1:127,2\n87#1:129,2\n95#1:131,2\n*E\n"})
public final class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f400c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final g2<b0.b> f401a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final g2<Function1<b0.b, Boolean>> f402b;

    public a() {
        int i10 = 0;
        int i11 = 1;
        DefaultConstructorMarker defaultConstructorMarker = null;
        this.f401a = new g2<>(i10, i11, defaultConstructorMarker);
        this.f402b = new g2<>(i10, i11, defaultConstructorMarker);
    }

    public final void a(@NotNull b0.b bVar) {
        this.f401a.a0(bVar);
    }

    public final void b(@NotNull Function1<? super b0.b, Boolean> function1) {
        this.f402b.a0(function1);
    }

    @NotNull
    public final b0.c c() {
        Object obj = null;
        g2 g2Var = new g2(0, 1, false ? 1 : 0);
        g2<b0.b> g2Var2 = this.f401a;
        Object[] objArr = g2Var2.f12449a;
        int i10 = g2Var2.f12450b;
        int i11 = 0;
        boolean z10 = true;
        b0.b bVar = null;
        while (i11 < i10) {
            b0.b bVar2 = (b0.b) objArr[i11];
            if (!z10 || bVar2 != f.f77497c) {
                if (b.a(bVar2) && b.a(bVar)) {
                    z10 = false;
                } else {
                    if (!b.a(bVar2)) {
                        g2<Function1<b0.b, Boolean>> g2Var3 = this.f402b;
                        Object[] objArr2 = g2Var3.f12449a;
                        int i12 = g2Var3.f12450b;
                        int i13 = 0;
                        while (true) {
                            if (i13 < i12) {
                                if (((Boolean) ((Function1) objArr2[i13]).invoke(bVar2)).booleanValue()) {
                                    i13++;
                                } else {
                                    z10 = false;
                                }
                            }
                        }
                    }
                    g2Var.a0(bVar2);
                    z10 = false;
                    bVar = bVar2;
                }
            }
            i11++;
            z10 = z10;
        }
        if (!g2Var.H()) {
            obj = g2Var.f12449a[g2Var.f12450b - 1];
        }
        if (b.a((b0.b) obj)) {
            g2Var.J0(g2Var.f12450b - 1);
        }
        return new b0.c(g2Var.c());
    }

    public final void d() {
        this.f401a.a0(f.f77497c);
    }
}
