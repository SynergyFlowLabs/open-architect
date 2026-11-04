package com.planner5d.library.activity.fragment.profile.edit;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.w0;
import androidx.lifecycle.o0;
import androidx.recyclerview.widget.RecyclerView;
import com.planner5d.library.activity.fragment.settings.ViewSocial;
import com.planner5d.library.databinding.i7;
import com.planner5d.library.databinding.j7;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@w0(parameters = 0)
public final class l extends RecyclerView.h<RecyclerView.g0> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f134614f = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final o0 f134615a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.activity.fragment.settings.h f134616b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.activity.helper.ui.d f134617c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final b f134618d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private List<ProfileEditItem> f134619e;

    @w0(parameters = 0)
    @SourceDebugExtension({"SMAP\nProfileEditItemsAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProfileEditItemsAdapter.kt\ncom/planner5d/library/activity/fragment/profile/edit/ProfileEditItemsAdapter$ExpandableItemViewHolder\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,101:1\n257#2,2:102\n257#2,2:104\n257#2,2:106\n*S KotlinDebug\n*F\n+ 1 ProfileEditItemsAdapter.kt\ncom/planner5d/library/activity/fragment/profile/edit/ProfileEditItemsAdapter$ExpandableItemViewHolder\n*L\n85#1:102,2\n89#1:104,2\n93#1:106,2\n*E\n"})
    public static final class a extends RecyclerView.g0 {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final int f134620h = 8;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final ViewGroup f134621a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private final i7 f134622b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        private final ImageView f134623c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        private final TextView f134624d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        private final TextView f134625e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @NotNull
        private final ViewSocial f134626f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @NotNull
        private final ImageView f134627g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@NotNull ViewGroup parent) {
            super(LayoutInflater.from(parent.getContext()).inflate(com.planner5d.library.f.m.L8, parent, false));
            Intrinsics.checkNotNullParameter(parent, "parent");
            this.f134621a = parent;
            i7 i7VarA = i7.a(this.itemView);
            Intrinsics.checkNotNullExpressionValue(i7VarA, "bind(...)");
            this.f134622b = i7VarA;
            ImageView profileEditExpandableItemIcon = i7VarA.f159145c;
            Intrinsics.checkNotNullExpressionValue(profileEditExpandableItemIcon, "profileEditExpandableItemIcon");
            this.f134623c = profileEditExpandableItemIcon;
            TextView profileEditExpandableItemTitle = i7VarA.f159146d;
            Intrinsics.checkNotNullExpressionValue(profileEditExpandableItemTitle, "profileEditExpandableItemTitle");
            this.f134624d = profileEditExpandableItemTitle;
            TextView profileEditExpandableItemAdditionalText = i7VarA.f159144b;
            Intrinsics.checkNotNullExpressionValue(profileEditExpandableItemAdditionalText, "profileEditExpandableItemAdditionalText");
            this.f134625e = profileEditExpandableItemAdditionalText;
            ViewSocial profileEditSocial = i7VarA.f159148f;
            Intrinsics.checkNotNullExpressionValue(profileEditSocial, "profileEditSocial");
            this.f134626f = profileEditSocial;
            ImageView profileEditGroupIndicator = i7VarA.f159147e;
            Intrinsics.checkNotNullExpressionValue(profileEditGroupIndicator, "profileEditGroupIndicator");
            this.f134627g = profileEditGroupIndicator;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void i(ProfileEditItem profileEditItem, a aVar, View view) {
            if (profileEditItem.f()) {
                aVar.f134627g.animate().setDuration(200L).rotation(0.0f);
                aVar.f134626f.setVisibility(8);
                profileEditItem.g(false);
            } else {
                aVar.f134627g.animate().setDuration(200L).rotation(180.0f);
                aVar.f134626f.setVisibility(0);
                profileEditItem.g(true);
            }
        }

        public final void h(@NotNull final ProfileEditItem item, @NotNull o0 lifecycleOwner, @NotNull com.planner5d.library.activity.fragment.settings.h userSocialViewModel, @NotNull com.planner5d.library.activity.helper.ui.d uiState) {
            Intrinsics.checkNotNullParameter(item, "item");
            Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
            Intrinsics.checkNotNullParameter(userSocialViewModel, "userSocialViewModel");
            Intrinsics.checkNotNullParameter(uiState, "uiState");
            this.f134623c.setImageResource(item.c());
            this.f134624d.setText(item.d());
            this.f134626f.y(lifecycleOwner, userSocialViewModel, uiState);
            this.f134626f.setVisibility(item.f() ? 0 : 8);
            this.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.activity.fragment.profile.edit.k
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    l.a.i(item, this, view);
                }
            });
            this.f134625e.setText(item.a());
        }

        @NotNull
        public final ViewGroup j() {
            return this.f134621a;
        }
    }

    public interface b {
        void a(@Nullable ProfileEditItem.ProfileEditItemType profileEditItemType);
    }

    @w0(parameters = 0)
    public static final class c extends RecyclerView.g0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f134628b = 8;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final ViewGroup f134629a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(@NotNull ViewGroup parent) {
            super(LayoutInflater.from(parent.getContext()).inflate(com.planner5d.library.f.m.M8, parent, false));
            Intrinsics.checkNotNullParameter(parent, "parent");
            this.f134629a = parent;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void i(b bVar, ProfileEditItem profileEditItem, View view) {
            bVar.a(profileEditItem.e());
        }

        public final void h(@NotNull final ProfileEditItem item, @NotNull final b listener) {
            Intrinsics.checkNotNullParameter(item, "item");
            Intrinsics.checkNotNullParameter(listener, "listener");
            j7 j7VarA = j7.a(this.itemView);
            j7VarA.f159200c.setImageResource(item.c());
            j7VarA.f159201d.setText(item.d());
            j7VarA.getRoot().setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.activity.fragment.profile.edit.m
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    l.c.i(listener, item, view);
                }
            });
            j7VarA.f159199b.setText(item.a());
        }

        @NotNull
        public final ViewGroup j() {
            return this.f134629a;
        }
    }

    public l(@NotNull o0 lifecycleOwner, @NotNull com.planner5d.library.activity.fragment.settings.h userSocialViewModel, @NotNull com.planner5d.library.activity.helper.ui.d uiState, @NotNull b listener) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(userSocialViewModel, "userSocialViewModel");
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f134615a = lifecycleOwner;
        this.f134616b = userSocialViewModel;
        this.f134617c = uiState;
        this.f134618d = listener;
        this.f134619e = CollectionsKt.emptyList();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        return this.f134619e.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemViewType(int i10) {
        return !this.f134619e.get(i10).b().isEmpty() ? 1 : 0;
    }

    public final void h(@NotNull List<ProfileEditItem> listItems) {
        Intrinsics.checkNotNullParameter(listItems, "listItems");
        this.f134619e = listItems;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onBindViewHolder(@NotNull RecyclerView.g0 holder, int i10) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        ProfileEditItem profileEditItem = this.f134619e.get(i10);
        if (profileEditItem.b().isEmpty()) {
            ((c) holder).h(profileEditItem, this.f134618d);
        } else {
            ((a) holder).h(profileEditItem, this.f134615a, this.f134616b, this.f134617c);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    @NotNull
    public RecyclerView.g0 onCreateViewHolder(@NotNull ViewGroup parent, int i10) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return i10 == 1 ? new a(parent) : new c(parent);
    }
}
