package com.planner5d.library.activity.fragment.profile.edit;

import androidx.annotation.f1;
import androidx.annotation.v;
import androidx.compose.runtime.internal.w0;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@w0(parameters = 0)
public final class ProfileEditItem {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f134571g = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private final ProfileEditItemType f134572a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f134573b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private final String f134574c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f134575d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final List<id.e> f134576e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f134577f;

    public enum ProfileEditItemType {
        Name,
        Email;


        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ kotlin.enums.a f134581d = kotlin.enums.c.c(k());

        @NotNull
        public static kotlin.enums.a<ProfileEditItemType> l() {
            return f134581d;
        }
    }

    public ProfileEditItem(@Nullable ProfileEditItemType profileEditItemType, @v int i10, @Nullable String str, @f1 int i11, @NotNull List<id.e> children, boolean z10) {
        Intrinsics.checkNotNullParameter(children, "children");
        this.f134572a = profileEditItemType;
        this.f134573b = i10;
        this.f134574c = str;
        this.f134575d = i11;
        this.f134576e = children;
        this.f134577f = z10;
    }

    public final int a() {
        return this.f134575d;
    }

    @NotNull
    public final List<id.e> b() {
        return this.f134576e;
    }

    public final int c() {
        return this.f134573b;
    }

    @Nullable
    public final String d() {
        return this.f134574c;
    }

    @Nullable
    public final ProfileEditItemType e() {
        return this.f134572a;
    }

    public final boolean f() {
        return this.f134577f;
    }

    public final void g(boolean z10) {
        this.f134577f = z10;
    }

    public /* synthetic */ ProfileEditItem(ProfileEditItemType profileEditItemType, int i10, String str, int i11, List list, boolean z10, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(profileEditItemType, i10, str, i11, (i12 & 16) != 0 ? CollectionsKt.emptyList() : list, (i12 & 32) != 0 ? false : z10);
    }
}
