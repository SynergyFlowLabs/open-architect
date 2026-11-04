package androidx.preference;

import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class o {

    public static final class a implements Sequence<Preference> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ PreferenceGroup f73122a;

        a(PreferenceGroup preferenceGroup) {
            this.f73122a = preferenceGroup;
        }

        @Override // kotlin.sequences.Sequence
        @NotNull
        public Iterator<Preference> iterator() {
            return o.j(this.f73122a);
        }
    }

    public static final class b implements Iterator<Preference>, qj.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f73123a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ PreferenceGroup f73124b;

        b(PreferenceGroup preferenceGroup) {
            this.f73124b = preferenceGroup;
        }

        @Override // java.util.Iterator
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Preference next() {
            PreferenceGroup preferenceGroup = this.f73124b;
            int i10 = this.f73123a;
            this.f73123a = i10 + 1;
            Preference preferenceI1 = preferenceGroup.I1(i10);
            Intrinsics.checkNotNullExpressionValue(preferenceI1, "getPreference(index++)");
            return preferenceI1;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f73123a < this.f73124b.J1();
        }

        @Override // java.util.Iterator
        public void remove() {
            PreferenceGroup preferenceGroup = this.f73124b;
            int i10 = this.f73123a - 1;
            this.f73123a = i10;
            preferenceGroup.Q1(preferenceGroup.I1(i10));
        }
    }

    public static final boolean a(@NotNull PreferenceGroup preferenceGroup, @NotNull Preference preference) {
        Intrinsics.checkNotNullParameter(preferenceGroup, "<this>");
        Intrinsics.checkNotNullParameter(preference, "preference");
        int iJ1 = preferenceGroup.J1();
        int i10 = 0;
        while (i10 < iJ1) {
            int i11 = i10 + 1;
            if (Intrinsics.areEqual(preferenceGroup.I1(i10), preference)) {
                return true;
            }
            i10 = i11;
        }
        return false;
    }

    public static final void b(@NotNull PreferenceGroup preferenceGroup, @NotNull Function1<? super Preference, Unit> action) {
        Intrinsics.checkNotNullParameter(preferenceGroup, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        int iJ1 = preferenceGroup.J1();
        for (int i10 = 0; i10 < iJ1; i10++) {
            action.invoke(d(preferenceGroup, i10));
        }
    }

    public static final void c(@NotNull PreferenceGroup preferenceGroup, @NotNull Function2<? super Integer, ? super Preference, Unit> action) {
        Intrinsics.checkNotNullParameter(preferenceGroup, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        int iJ1 = preferenceGroup.J1();
        for (int i10 = 0; i10 < iJ1; i10++) {
            action.invoke(Integer.valueOf(i10), d(preferenceGroup, i10));
        }
    }

    @NotNull
    public static final Preference d(@NotNull PreferenceGroup preferenceGroup, int i10) {
        Intrinsics.checkNotNullParameter(preferenceGroup, "<this>");
        Preference preferenceI1 = preferenceGroup.I1(i10);
        Intrinsics.checkNotNullExpressionValue(preferenceI1, "getPreference(index)");
        return preferenceI1;
    }

    @Nullable
    public static final <T extends Preference> T e(@NotNull PreferenceGroup preferenceGroup, @NotNull CharSequence key) {
        Intrinsics.checkNotNullParameter(preferenceGroup, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        return (T) preferenceGroup.F1(key);
    }

    @NotNull
    public static final Sequence<Preference> f(@NotNull PreferenceGroup preferenceGroup) {
        Intrinsics.checkNotNullParameter(preferenceGroup, "<this>");
        return new a(preferenceGroup);
    }

    public static final int g(@NotNull PreferenceGroup preferenceGroup) {
        Intrinsics.checkNotNullParameter(preferenceGroup, "<this>");
        return preferenceGroup.J1();
    }

    public static final boolean h(@NotNull PreferenceGroup preferenceGroup) {
        Intrinsics.checkNotNullParameter(preferenceGroup, "<this>");
        return preferenceGroup.J1() == 0;
    }

    public static final boolean i(@NotNull PreferenceGroup preferenceGroup) {
        Intrinsics.checkNotNullParameter(preferenceGroup, "<this>");
        return preferenceGroup.J1() != 0;
    }

    @NotNull
    public static final Iterator<Preference> j(@NotNull PreferenceGroup preferenceGroup) {
        Intrinsics.checkNotNullParameter(preferenceGroup, "<this>");
        return new b(preferenceGroup);
    }

    public static final void k(@NotNull PreferenceGroup preferenceGroup, @NotNull Preference preference) {
        Intrinsics.checkNotNullParameter(preferenceGroup, "<this>");
        Intrinsics.checkNotNullParameter(preference, "preference");
        preferenceGroup.Q1(preference);
    }

    public static final void l(@NotNull PreferenceGroup preferenceGroup, @NotNull Preference preference) {
        Intrinsics.checkNotNullParameter(preferenceGroup, "<this>");
        Intrinsics.checkNotNullParameter(preference, "preference");
        preferenceGroup.E1(preference);
    }
}
