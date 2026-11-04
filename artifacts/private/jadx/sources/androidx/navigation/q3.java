package androidx.navigation;

import android.os.Bundle;
import androidx.navigation.y1;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nNavigator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Navigator.kt\nandroidx/navigation/Navigator\n+ 2 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n*L\n1#1,260:1\n1317#2,2:261\n*S KotlinDebug\n*F\n+ 1 Navigator.kt\nandroidx/navigation/Navigator\n*L\n154#1:261,2\n*E\n"})
public abstract class q3<D extends y1> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private final String f71219a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private v3 f71220b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f71221c;

    public interface a {
    }

    @Target({ElementType.TYPE, ElementType.ANNOTATION_TYPE})
    @Retention(RetentionPolicy.RUNTIME)
    @jj.f(allowedTargets = {jj.b.ANNOTATION_CLASS, jj.b.CLASS})
    @jj.e(jj.a.RUNTIME)
    public @interface b {
        String value();
    }

    public q3() {
        this.f71219a = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final n0 i(q3 q3Var, w2 w2Var, a aVar, n0 backStackEntry) {
        y1 y1VarG;
        Intrinsics.checkNotNullParameter(backStackEntry, "backStackEntry");
        y1 y1VarF = backStackEntry.f();
        if (y1VarF == null) {
            y1VarF = null;
        }
        if (y1VarF == null || (y1VarG = q3Var.g(y1VarF, backStackEntry.b(), w2Var, aVar)) == null) {
            return null;
        }
        return Intrinsics.areEqual(y1VarG, y1VarF) ? backStackEntry : q3Var.e().b(y1VarG, y1VarG.l(backStackEntry.b()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit l(a3 navOptions) {
        Intrinsics.checkNotNullParameter(navOptions, "$this$navOptions");
        navOptions.z(true);
        return Unit.f312394a;
    }

    @NotNull
    public abstract D c();

    @NotNull
    public final String d() {
        String str = this.f71219a;
        if (str != null) {
            return str;
        }
        String strQ = kotlin.jvm.internal.j1.d(getClass()).Q();
        Intrinsics.checkNotNull(strQ);
        return StringsKt.j4(strQ, "Navigator");
    }

    @NotNull
    protected final v3 e() {
        v3 v3Var = this.f71220b;
        if (v3Var != null) {
            return v3Var;
        }
        throw new IllegalStateException("You cannot access the Navigator's state until the Navigator is attached");
    }

    public final boolean f() {
        return this.f71221c;
    }

    @Nullable
    public y1 g(@NotNull D destination, @Nullable Bundle bundle, @Nullable w2 w2Var, @Nullable a aVar) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        return destination;
    }

    public void h(@NotNull List<n0> entries, @Nullable final w2 w2Var, @Nullable final a aVar) {
        Intrinsics.checkNotNullParameter(entries, "entries");
        Iterator it = kotlin.sequences.o.v0(kotlin.sequences.o.k1(CollectionsKt.asSequence(entries), new Function1() { // from class: androidx.navigation.p3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return q3.i(this.f71216a, w2Var, aVar, (n0) obj);
            }
        })).iterator();
        while (it.hasNext()) {
            e().l((n0) it.next());
        }
    }

    @androidx.annotation.i
    public void j(@NotNull v3 state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.f71220b = state;
        this.f71221c = true;
    }

    public void k(@NotNull n0 backStackEntry) {
        Intrinsics.checkNotNullParameter(backStackEntry, "backStackEntry");
        y1 y1VarF = backStackEntry.f();
        if (y1VarF == null) {
            y1VarF = null;
        }
        if (y1VarF == null) {
            return;
        }
        g(y1VarF, null, b3.a(new Function1() { // from class: androidx.navigation.o3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return q3.l((a3) obj);
            }
        }), null);
        e().g(backStackEntry);
    }

    public void m(@NotNull Bundle savedState) {
        Intrinsics.checkNotNullParameter(savedState, "savedState");
    }

    @Nullable
    public Bundle n() {
        return null;
    }

    public void o(@NotNull n0 popUpTo, boolean z10) {
        Intrinsics.checkNotNullParameter(popUpTo, "popUpTo");
        List<n0> value = e().c().getValue();
        if (!value.contains(popUpTo)) {
            throw new IllegalStateException(("popBackStack was called with " + popUpTo + " which does not exist in back stack " + value).toString());
        }
        ListIterator<n0> listIterator = value.listIterator(value.size());
        n0 n0VarPrevious = null;
        while (p()) {
            n0VarPrevious = listIterator.previous();
            if (Intrinsics.areEqual(n0VarPrevious, popUpTo)) {
                break;
            }
        }
        if (n0VarPrevious != null) {
            e().i(n0VarPrevious, z10);
        }
    }

    public boolean p() {
        return true;
    }

    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP})
    public q3(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f71219a = name;
    }
}
