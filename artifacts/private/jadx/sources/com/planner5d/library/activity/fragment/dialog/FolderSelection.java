package com.planner5d.library.activity.fragment.dialog;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.annotation.NonNull;
import com.planner5d.library.database.model.project.Project;
import com.planner5d.library.model.Folder;
import com.planner5d.library.model.manager.b4;
import com.planner5d.library.model.manager.statistics.events.b2;
import com.planner5d.library.model.manager.statistics.events.p3;
import com.planner5d.library.model.manager.statistics.events.u2;
import com.planner5d.library.model.manager.statistics.events.x3;
import com.planner5d.library.services.utility.p0;
import java.util.List;
import rx.Subscriber;

/* JADX INFO: loaded from: classes5.dex */
public class FolderSelection extends ContentDialog<Void> {

    /* JADX INFO: renamed from: o3, reason: collision with root package name */
    @ij.a
    protected com.planner5d.library.model.manager.c0 f131625o3;

    /* JADX INFO: renamed from: p3, reason: collision with root package name */
    @ij.a
    protected fg.e<com.planner5d.library.model.manager.project.d0> f131626p3;

    /* JADX INFO: renamed from: q3, reason: collision with root package name */
    @ij.a
    protected fg.e<b4> f131627q3;

    /* JADX INFO: renamed from: r3, reason: collision with root package name */
    @ij.a
    protected fg.e<com.planner5d.library.modules.user.user.t> f131628r3;

    /* JADX INFO: renamed from: s3, reason: collision with root package name */
    @ij.a
    protected p0 f131629s3;

    /* JADX INFO: renamed from: t3, reason: collision with root package name */
    private ListView f131630t3 = null;

    /* JADX INFO: renamed from: u3, reason: collision with root package name */
    private View f131631u3;

    class a extends com.planner5d.library.services.rx.e<List<Folder>> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ com.planner5d.library.services.utility.j f131632d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f131633e;

        a(com.planner5d.library.services.utility.j jVar, int i10) {
            this.f131632d = jVar;
            this.f131633e = i10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void f() {
            FolderSelection.this.f131631u3.setEnabled(true);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void g(com.planner5d.library.services.utility.j jVar, df.b bVar, int i10, View view) {
            FolderSelection folderSelection = FolderSelection.this;
            folderSelection.setProgress(folderSelection.getString(com.planner5d.library.f.s.yq));
            FolderSelection folderSelection2 = FolderSelection.this;
            folderSelection2.V(folderSelection2.f131628r3.get().a(), jVar.d(com.planner5d.library.services.r.id, 0L), Long.valueOf(jVar.d(com.planner5d.library.services.r.projectId, 0L)), jVar.t(com.planner5d.library.services.r.className, null), bVar.c(), i10);
        }

        @Override // com.planner5d.library.services.rx.e
        public void c(Throwable th2) {
            throw new RuntimeException(th2);
        }

        @Override // com.planner5d.library.services.rx.e, rx.Observer
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public void onNext(List<Folder> list) {
            final df.b bVar = new df.b(list, FolderSelection.this.f131629s3, new df.b.a() { // from class: com.planner5d.library.activity.fragment.dialog.o
                @Override // df.b.a
                public final void a() {
                    this.f132174a.f();
                }
            });
            FolderSelection.this.f131630t3.setAdapter((ListAdapter) bVar);
            View view = FolderSelection.this.f131631u3;
            final com.planner5d.library.services.utility.j jVar = this.f131632d;
            final int i10 = this.f131633e;
            view.setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.activity.fragment.dialog.p
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f132226a.g(jVar, bVar, i10, view2);
                }
            });
        }
    }

    class b extends com.planner5d.library.services.rx.e<gd.b> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Long f131635d;

        b(Long l10) {
            this.f131635d = l10;
        }

        @Override // com.planner5d.library.services.rx.e
        public void c(Throwable th2) {
            u2.D1(com.planner5d.library.model.manager.statistics.events.b4.a.to_folder, p3.b.error, this.f131635d, null, null);
            FolderSelection.this.dismiss();
        }

        @Override // com.planner5d.library.services.rx.e, rx.Observer
        public void onCompleted() {
            u2.D1(com.planner5d.library.model.manager.statistics.events.b4.a.to_folder, p3.b.success, this.f131635d, null, null);
            com.planner5d.library.services.m0.f224429b.t();
            FolderSelection.this.dismiss();
        }
    }

    class c extends com.planner5d.library.services.rx.e<Project> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Long f131637d;

        c(Long l10) {
            this.f131637d = l10;
        }

        @Override // com.planner5d.library.services.rx.e
        public void c(Throwable th2) {
            b2.f216725b.u0(x3.a.to_folder, p3.b.error, this.f131637d);
            FolderSelection.this.dismiss();
        }

        @Override // com.planner5d.library.services.rx.e, rx.Observer
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void onNext(Project project) {
            com.planner5d.library.services.m0.f224430c.t();
        }

        @Override // com.planner5d.library.services.rx.e, rx.Observer
        public void onCompleted() {
            b2.f216725b.u0(x3.a.to_folder, p3.b.success, this.f131637d);
            FolderSelection.this.dismiss();
        }
    }

    public FolderSelection() {
        com.planner5d.library.application.b.r().P1(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void V(id.a aVar, long j10, Long l10, String str, Folder folder, int i10) {
        if (i10 == Folder.f180530c) {
            u2.D1(com.planner5d.library.model.manager.statistics.events.b4.a.to_folder, p3.b.submit, l10, null, null);
            this.f131627q3.get().F0(aVar, j10, str, folder).subscribe((Subscriber<? super gd.b>) new b(l10));
        } else {
            b2.f216725b.u0(x3.a.to_folder, p3.b.submit, l10);
            this.f131626p3.get().J0(aVar, j10, folder).subscribe((Subscriber<? super Project>) new c(l10));
        }
    }

    @Override // com.planner5d.library.activity.fragment.dialog.ContentDialog
    protected View E(@NonNull ViewGroup viewGroup, Bundle bundle) {
        com.planner5d.library.services.utility.j jVar = new com.planner5d.library.services.utility.j(getArguments());
        com.planner5d.library.services.r rVar = com.planner5d.library.services.r.id;
        com.planner5d.library.services.r rVar2 = com.planner5d.library.services.r.folderType;
        if (!jVar.a(rVar, rVar2)) {
            dismiss();
            int i10 = 5 >> 0;
            return null;
        }
        int iC = jVar.c(rVar2, Folder.f180530c);
        this.f131630t3 = new ListView(viewGroup.getContext());
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(com.planner5d.library.f.m.G0, (ViewGroup) this.f131630t3, false);
        this.f131630t3.addFooterView(viewInflate);
        View viewFindViewById = viewInflate.findViewById(com.planner5d.library.f.j.C5);
        this.f131631u3 = viewFindViewById;
        viewFindViewById.setEnabled(false);
        this.f131625o3.C(this.f131628r3.get().a(), com.planner5d.library.model.manager.c0.a.BY_DATE, iC, new int[0]).subscribe((Subscriber<? super List<Folder>>) new a(jVar, iC));
        R(com.planner5d.library.services.textspan.b.d(getString(com.planner5d.library.f.s.mu)), Integer.valueOf(com.planner5d.library.f.h.G8));
        L(viewInflate.findViewById(com.planner5d.library.f.j.f168177k5));
        return this.f131630t3;
    }

    @Override // com.planner5d.library.activity.fragment.dialog.ContentDialog
    protected int G() {
        return com.planner5d.library.f.m.F0;
    }
}
