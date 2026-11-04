package com.planner5d.library.activity.fragment.list.holders;

import android.content.Context;
import android.view.View;
import com.planner5d.library.activity.fragment.list.l1;
import com.planner5d.library.model.Folder;
import com.planner5d.library.services.utility.k3;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nMainListViewHolderFolders.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainListViewHolderFolders.kt\ncom/planner5d/library/activity/fragment/list/holders/MainListViewHolderFolders\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,30:1\n11165#2:31\n11500#2,3:32\n37#3,2:35\n*S KotlinDebug\n*F\n+ 1 MainListViewHolderFolders.kt\ncom/planner5d/library/activity/fragment/list/holders/MainListViewHolderFolders\n*L\n17#1:31\n17#1:32,3\n17#1:35,2\n*E\n"})
public final class e0 extends a<com.planner5d.library.database.model.j[]> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f134115c = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final l1 f134116b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(@NotNull Context context, @NotNull l1 viewModel) {
        super(new com.planner5d.library.activity.fragment.list.views.b(context));
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        this.f134116b = viewModel;
    }

    private final com.planner5d.library.activity.fragment.list.views.b.a k(final com.planner5d.library.database.model.j jVar) {
        String title = jVar.getTitle();
        if (title == null) {
            title = "";
        }
        return new com.planner5d.library.activity.fragment.list.views.b.a(new k3(title), com.planner5d.library.f.h.I8, Folder.y(jVar.c()) ? com.planner5d.library.f.h.K1 : com.planner5d.library.f.h.J1, new View.OnClickListener() { // from class: com.planner5d.library.activity.fragment.list.holders.d0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                e0.l(this.f134110a, jVar, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(e0 e0Var, com.planner5d.library.database.model.j jVar, View view) {
        e0Var.f134116b.u1(jVar);
    }

    @Override // com.planner5d.library.activity.fragment.list.holders.a
    public void a() {
    }

    @Override // com.planner5d.library.activity.fragment.list.holders.a
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public void g(@Nullable com.planner5d.library.database.model.j[] jVarArr) {
        View view = this.itemView;
        Intrinsics.checkNotNull(view, "null cannot be cast to non-null type com.planner5d.library.activity.fragment.list.views.MainListButtonsView");
        com.planner5d.library.activity.fragment.list.views.b bVar = (com.planner5d.library.activity.fragment.list.views.b) view;
        if (jVarArr == null) {
            jVarArr = new com.planner5d.library.database.model.j[0];
        }
        ArrayList arrayList = new ArrayList(jVarArr.length);
        for (com.planner5d.library.database.model.j jVar : jVarArr) {
            arrayList.add(k(jVar));
        }
        com.planner5d.library.activity.fragment.list.views.b.a[] aVarArr = (com.planner5d.library.activity.fragment.list.views.b.a[]) arrayList.toArray(new com.planner5d.library.activity.fragment.list.views.b.a[0]);
        bVar.setButtons((com.planner5d.library.activity.fragment.list.views.b.a[]) Arrays.copyOf(aVarArr, aVarArr.length));
    }
}
