package androidx.navigation.ui;

import android.view.Menu;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.navigation.e2;
import androidx.navigation.y1;
import java.util.HashSet;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nAppBarConfiguration.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppBarConfiguration.kt\nandroidx/navigation/ui/AppBarConfiguration\n+ 2 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n*L\n1#1,306:1\n1251#2,2:307\n*S KotlinDebug\n*F\n+ 1 AppBarConfiguration.kt\nandroidx/navigation/ui/AppBarConfiguration\n*L\n103#1:307,2\n*E\n"})
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Set<Integer> f71319a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private final androidx.customview.widget.c f71320b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private final b f71321c;

    public interface b {
        boolean a();
    }

    public /* synthetic */ d(Set set, androidx.customview.widget.c cVar, b bVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(set, cVar, bVar);
    }

    @kotlin.l(message = "Use {@link #getOpenableLayout()}.")
    @Nullable
    public final DrawerLayout a() {
        androidx.customview.widget.c cVar = this.f71320b;
        if (cVar instanceof DrawerLayout) {
            return (DrawerLayout) cVar;
        }
        return null;
    }

    @Nullable
    public final b b() {
        return this.f71321c;
    }

    @Nullable
    public final androidx.customview.widget.c c() {
        return this.f71320b;
    }

    @NotNull
    public final Set<Integer> d() {
        return this.f71319a;
    }

    public final boolean e(@NotNull y1 destination) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        for (y1 y1Var : y1.f71443f.e(destination)) {
            if (this.f71319a.contains(Integer.valueOf(y1Var.D())) && (!(y1Var instanceof e2) || destination.D() == e2.f70908i.d((e2) y1Var).D())) {
                return true;
            }
        }
        return false;
    }

    private d(Set<Integer> set, androidx.customview.widget.c cVar, b bVar) {
        this.f71319a = set;
        this.f71320b = cVar;
        this.f71321c = bVar;
    }

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final Set<Integer> f71322a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        private androidx.customview.widget.c f71323b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        private b f71324c;

        public a(@NotNull e2 navGraph) {
            Intrinsics.checkNotNullParameter(navGraph, "navGraph");
            HashSet hashSet = new HashSet();
            this.f71322a = hashSet;
            hashSet.add(Integer.valueOf(e2.f70908i.d(navGraph).D()));
        }

        @NotNull
        public final d a() {
            return new d(this.f71322a, this.f71323b, this.f71324c, null);
        }

        @kotlin.l(message = "Use {@link #setOpenableLayout(Openable)}.")
        @NotNull
        public final a b(@Nullable DrawerLayout drawerLayout) {
            this.f71323b = drawerLayout;
            return this;
        }

        @NotNull
        public final a c(@Nullable b bVar) {
            this.f71324c = bVar;
            return this;
        }

        @NotNull
        public final a d(@Nullable androidx.customview.widget.c cVar) {
            this.f71323b = cVar;
            return this;
        }

        public a(@NotNull Menu topLevelMenu) {
            Intrinsics.checkNotNullParameter(topLevelMenu, "topLevelMenu");
            this.f71322a = new HashSet();
            int size = topLevelMenu.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.f71322a.add(Integer.valueOf(topLevelMenu.getItem(i10).getItemId()));
            }
        }

        public a(@NotNull int... topLevelDestinationIds) {
            Intrinsics.checkNotNullParameter(topLevelDestinationIds, "topLevelDestinationIds");
            this.f71322a = new HashSet();
            for (int i10 : topLevelDestinationIds) {
                this.f71322a.add(Integer.valueOf(i10));
            }
        }

        public a(@NotNull Set<Integer> topLevelDestinationIds) {
            Intrinsics.checkNotNullParameter(topLevelDestinationIds, "topLevelDestinationIds");
            HashSet hashSet = new HashSet();
            this.f71322a = hashSet;
            hashSet.addAll(topLevelDestinationIds);
        }
    }
}
