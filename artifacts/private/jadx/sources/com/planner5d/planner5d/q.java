package com.planner5d.planner5d;

import android.content.SharedPreferences;
import androidx.lifecycle.f2;
import com.planner5d.library.activity.Main;
import com.planner5d.library.activity.MainCardboard;
import com.planner5d.library.activity.fragment.compareplans.ComparePlansFragment;
import com.planner5d.library.activity.fragment.dialog.FolderSelection;
import com.planner5d.library.activity.fragment.dialog.ProjectConflict;
import com.planner5d.library.activity.fragment.dialog.RemovePersonalData;
import com.planner5d.library.activity.fragment.dialog.authentication.AuthenticationExternalService;
import com.planner5d.library.activity.fragment.dialog.authentication.AuthenticationRemindPasswordSuccess;
import com.planner5d.library.activity.fragment.dialog.authentication.d1;
import com.planner5d.library.activity.fragment.dialog.authentication.onelink.AuthenticationSignInEnterCode;
import com.planner5d.library.activity.fragment.dialog.iteminfo.ItemInfo;
import com.planner5d.library.activity.fragment.dialog.message.Message;
import com.planner5d.library.activity.fragment.dialog.message.MessageWithImageDialog;
import com.planner5d.library.activity.fragment.dialog.message.PurchaseRequiredMessage;
import com.planner5d.library.activity.fragment.dialog.message.SnapshotSetupComplete;
import com.planner5d.library.activity.fragment.dialog.message.UserMessage;
import com.planner5d.library.activity.fragment.dialog.premiumfeature.PremiumFeaturesDialog;
import com.planner5d.library.activity.fragment.dialog.projectsettings.ProjectSettingsBottomSheetDialog;
import com.planner5d.library.activity.fragment.dialog.purchase.PurchaseDialog;
import com.planner5d.library.activity.fragment.dialog.purchase.premium.PurchasePagePremiumReview;
import com.planner5d.library.activity.fragment.dialog.purchase.recognitions.PurchasePagePlanRecognitions;
import com.planner5d.library.activity.fragment.dialog.purchase.snapshots.PurchasePageSnapshots;
import com.planner5d.library.activity.fragment.dialog.send_to_gallery.SendToGallery;
import com.planner5d.library.activity.fragment.dialog.snapshots.SnapshotSetupDialog;
import com.planner5d.library.activity.fragment.dialog.titleedit.FolderEdit;
import com.planner5d.library.activity.fragment.dialog.titleedit.ProjectRename;
import com.planner5d.library.activity.fragment.dialog.wishlist.WishList;
import com.planner5d.library.activity.fragment.feed.FeedAllArticlesFragment;
import com.planner5d.library.activity.fragment.feed.FeedArticleFragment;
import com.planner5d.library.activity.fragment.feed.FeedFragment;
import com.planner5d.library.activity.fragment.gallery.Gallery;
import com.planner5d.library.activity.fragment.gallery.GalleryPage;
import com.planner5d.library.activity.fragment.gallery.GalleryPager;
import com.planner5d.library.activity.fragment.gallery.project.GalleryProjectFragment;
import com.planner5d.library.activity.fragment.list.l1;
import com.planner5d.library.activity.fragment.profile.ProfileFragment;
import com.planner5d.library.activity.fragment.profile.edit.ProfileEditFragment;
import com.planner5d.library.activity.fragment.profile.managedata.ManageDataFragment;
import com.planner5d.library.activity.fragment.profile.orders.OrdersHistoryFragment;
import com.planner5d.library.activity.fragment.projects.Editor3dFragment;
import com.planner5d.library.activity.fragment.projects.Project2D;
import com.planner5d.library.activity.fragment.projects.Project3D;
import com.planner5d.library.activity.fragment.projects.Projects;
import com.planner5d.library.activity.fragment.projects.ProjectsPagesFragment;
import com.planner5d.library.activity.fragment.smartwizard.decorator.DecoratorFragment;
import com.planner5d.library.activity.fragment.smartwizard.dimensions.Dimensions;
import com.planner5d.library.activity.fragment.smartwizard.roomshape.ChooseRoomShape;
import com.planner5d.library.activity.fragment.smartwizard.roomstyle.ChooseRoomStyle;
import com.planner5d.library.activity.fragment.snapshots.ImproveSnapshotWithAi;
import com.planner5d.library.activity.fragment.snapshots.SnapshotPager;
import com.planner5d.library.activity.fragment.snapshots.Snapshots;
import com.planner5d.library.activity.fragment.spaces.documents.Documents;
import com.planner5d.library.activity.fragment.spaces.file.DocumentEdit;
import com.planner5d.library.activity.fragment.spaces.preview.DocumentPreview;
import com.planner5d.library.activity.fragment.startup.OnboardingSignInDialog;
import com.planner5d.library.activity.fragment.startup.StartupFragment;
import com.planner5d.library.activity.fragment.startup.StartupPaywall;
import com.planner5d.library.activity.fragment.user.LicenseCheck;
import com.planner5d.library.activity.helper.b2;
import com.planner5d.library.activity.helper.e2;
import com.planner5d.library.activity.helper.g2;
import com.planner5d.library.activity.helper.z0;
import com.planner5d.library.activity.helper.z1;
import com.planner5d.library.application.d6;
import com.planner5d.library.application.e3;
import com.planner5d.library.application.f3;
import com.planner5d.library.application.f6;
import com.planner5d.library.application.h1;
import com.planner5d.library.application.h2;
import com.planner5d.library.application.h3;
import com.planner5d.library.application.i3;
import com.planner5d.library.application.j1;
import com.planner5d.library.application.k3;
import com.planner5d.library.application.l2;
import com.planner5d.library.application.o2;
import com.planner5d.library.application.o4;
import com.planner5d.library.application.p1;
import com.planner5d.library.application.p2;
import com.planner5d.library.application.q1;
import com.planner5d.library.application.q3;
import com.planner5d.library.application.r2;
import com.planner5d.library.application.s3;
import com.planner5d.library.application.t2;
import com.planner5d.library.application.t5;
import com.planner5d.library.application.y2;
import com.planner5d.library.database.ApplicationDatabase;
import com.planner5d.library.model.item.builder.ItemBuilder;
import com.planner5d.library.model.item.builder.ItemBuilder_Factory;
import com.planner5d.library.model.manager.a5;
import com.planner5d.library.model.manager.b4;
import com.planner5d.library.model.manager.b5;
import com.planner5d.library.model.manager.c1;
import com.planner5d.library.model.manager.c3;
import com.planner5d.library.model.manager.c5;
import com.planner5d.library.model.manager.d3;
import com.planner5d.library.model.manager.d4;
import com.planner5d.library.model.manager.d5;
import com.planner5d.library.model.manager.e1;
import com.planner5d.library.model.manager.e5;
import com.planner5d.library.model.manager.f4;
import com.planner5d.library.model.manager.g4;
import com.planner5d.library.model.manager.h4;
import com.planner5d.library.model.manager.i2;
import com.planner5d.library.model.manager.i4;
import com.planner5d.library.model.manager.j2;
import com.planner5d.library.model.manager.k1;
import com.planner5d.library.model.manager.k5;
import com.planner5d.library.model.manager.l5;
import com.planner5d.library.model.manager.m2;
import com.planner5d.library.model.manager.m4;
import com.planner5d.library.model.manager.m5;
import com.planner5d.library.model.manager.n1;
import com.planner5d.library.model.manager.n4;
import com.planner5d.library.model.manager.n5;
import com.planner5d.library.model.manager.o1;
import com.planner5d.library.model.manager.p4;
import com.planner5d.library.model.manager.p5;
import com.planner5d.library.model.manager.q2;
import com.planner5d.library.model.manager.q4;
import com.planner5d.library.model.manager.r4;
import com.planner5d.library.model.manager.s2;
import com.planner5d.library.model.manager.s4;
import com.planner5d.library.model.manager.statistics.events.StatisticsEventAiDesigner;
import com.planner5d.library.model.manager.statistics.events.c4;
import com.planner5d.library.model.manager.statistics.events.e4;
import com.planner5d.library.model.manager.statistics.events.j3;
import com.planner5d.library.model.manager.statistics.events.l3;
import com.planner5d.library.model.manager.statistics.events.m3;
import com.planner5d.library.model.manager.statistics.events.n3;
import com.planner5d.library.model.manager.statistics.events.r3;
import com.planner5d.library.model.manager.statistics.events.t3;
import com.planner5d.library.model.manager.statistics.events.v3;
import com.planner5d.library.model.manager.t1;
import com.planner5d.library.model.manager.u1;
import com.planner5d.library.model.manager.v1;
import com.planner5d.library.model.manager.v2;
import com.planner5d.library.model.manager.v4;
import com.planner5d.library.model.manager.w1;
import com.planner5d.library.model.manager.w2;
import com.planner5d.library.model.manager.w4;
import com.planner5d.library.model.manager.x2;
import com.planner5d.library.model.manager.y1;
import com.planner5d.library.modules.user.user.a1;
import com.planner5d.library.modules.user.user.b1;
import com.planner5d.library.modules.user.user.g1;
import com.planner5d.library.modules.user.user.m1;
import com.planner5d.library.services.download.DownloadService;
import com.planner5d.library.services.exceptions.ErrorMessageParser;
import com.planner5d.library.services.exceptions.ErrorMessageParser_Factory;
import com.planner5d.library.services.exceptions.NetworkErrorUtility;
import com.planner5d.library.services.exceptions.NetworkErrorUtility_Factory;
import com.planner5d.library.services.share.PublicFileProvider;
import com.planner5d.library.services.utility.a2;
import com.planner5d.library.services.utility.a3;
import com.planner5d.library.services.utility.c2;
import com.planner5d.library.services.utility.d2;
import com.planner5d.library.services.utility.f1;
import com.planner5d.library.services.utility.g3;
import com.planner5d.library.services.utility.i1;
import com.planner5d.library.services.utility.x1;
import com.planner5d.library.widget.carousel.CarouselView;
import com.planner5d.library.widget.colorpicker.ColorPickerCompact;
import com.planner5d.library.widget.editor.helper.k2;
import com.planner5d.library.widget.editor.helper.n2;
import com.planner5d.library.widget.editor.helper.o3;
import com.planner5d.library.widget.editor.helper.p3;
import com.planner5d.library.widget.editor.helper.r1;
import com.planner5d.library.widget.editor.helper.u2;
import com.planner5d.library.widget.editor.popup.itemproperties.ItemPropertiesDrawer;
import com.planner5d.library.widget.preloader.PreloaderBoxV2View;
import com.planner5d.library.widget.preloader.PreloaderBoxView;
import com.planner5d.library.widget.preloader.PreloaderDialogView;
import com.planner5d.library.widget.s1;
import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
@dagger.internal.e
public final class q {

    private static final class a implements h0.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private com.planner5d.library.application.b f264543a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private android.app.Application f264544b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private com.planner5d.library.application.d f264545c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private f6 f264546d;

        @Override // com.planner5d.library.application.c.a
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public a d(android.app.Application application) {
            this.f264544b = (android.app.Application) dagger.internal.p.b(application);
            return this;
        }

        @Override // com.planner5d.library.application.c.a
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public a a(com.planner5d.library.application.b bVar) {
            this.f264543a = (com.planner5d.library.application.b) dagger.internal.p.b(bVar);
            return this;
        }

        @Override // com.planner5d.library.application.c.a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public a c(com.planner5d.library.application.d dVar) {
            this.f264545c = (com.planner5d.library.application.d) dagger.internal.p.b(dVar);
            return this;
        }

        @Override // com.planner5d.planner5d.h0.a
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public a b(f6 f6Var) {
            this.f264546d = (f6) dagger.internal.p.b(f6Var);
            return this;
        }

        private a() {
        }

        @Override // com.planner5d.library.application.c.a
        public h0 build() {
            dagger.internal.p.a(this.f264543a, com.planner5d.library.application.b.class);
            dagger.internal.p.a(this.f264544b, android.app.Application.class);
            dagger.internal.p.a(this.f264545c, com.planner5d.library.application.d.class);
            dagger.internal.p.a(this.f264546d, f6.class);
            return new b(new com.planner5d.library.application.i(), new gb.a(), new com.planner5d.planner5d.b(), new com.planner5d.library.application.designoftheday.a(), new u0(), new q3(), new n0(), new f0(), new com.planner5d.library.help.application.c(), new r0(), new t(), new com.planner5d.library.legal.application.c(), new o4(), new com.planner5d.library.spaces.application.c(), this.f264543a, this.f264544b, this.f264545c, this.f264546d);
        }
    }

    private static final class b implements h0 {
        private ij.c<c2> A;
        private ij.c<com.planner5d.library.model.manager.builtin.p> A0;
        private ij.c<com.planner5d.library.modules.user.user.t0> A1;
        private ij.c<b4> A2;
        private ij.c<com.planner5d.library.model.manager.builtin.l0> A3;
        private ij.c<e4> A4;
        private ij.c<com.planner5d.library.widget.editor.popup.itemproperties.pages.material.i> A5;
        private ij.c<ce.b> A6;
        private ij.c<m2> A7;
        private ij.c<b2> A8;
        private ij.c<g3> B;
        private ij.c<com.planner5d.library.services.bitmaploader.cache.a> B0;
        private ij.c<com.planner5d.library.modules.user.user.u0> B1;
        private ij.c<d4> B2;
        private ij.c<com.planner5d.library.interactor.k> B3;
        private ij.c<w2> B4;
        private ij.c<com.planner5d.library.widget.editor.popup.itemproperties.pages.availablematerial.k> B5;
        private ij.c<StatisticsEventAiDesigner> B6;
        private ij.c<com.planner5d.library.widget.editor.popup.e> B7;
        private ij.c<com.planner5d.library.widget.editor.editor3dcardboard.u> B8;
        private ij.c<com.planner5d.library.modules.user.user.w> C;
        private ij.c<com.planner5d.library.services.bitmaploader.background.b> C0;
        private ij.c<com.planner5d.library.model.manager.payments.j> C1;
        private ij.c<d5> C2;
        private ij.c<le.f> C3;
        private ij.c<com.planner5d.library.model.manager.payments.y> C4;
        private ij.c<com.planner5d.library.widget.editor.popup.itemproperties.pages.size.q> C5;
        private ij.c<com.planner5d.library.activity.fragment.smartwizard.roomstyle.n> C6;
        private ij.c<com.planner5d.library.widget.editor.controls.a> C7;
        private ij.c<com.planner5d.library.userimporteddata.g> D;
        private ij.c<com.planner5d.library.services.bitmaploader.d> D0;
        private ij.c<com.planner5d.library.model.manager.payments.k> D1;
        private ij.c<com.planner5d.library.model.manager.synchronization.d> D2;
        private ij.c<com.planner5d.library.model.manager.config.source.a> D3;
        private ij.c<com.planner5d.library.model.manager.payments.b0> D4;
        private ij.c<com.planner5d.library.widget.editor.popup.itemproperties.interactor.a> D5;
        private ij.c<com.planner5d.library.activity.fragment.compareplans.h> D6;
        private ij.c<com.planner5d.library.model.manager.u0> D7;
        private ij.c<com.planner5d.library.database.migration.h> E;
        private ij.c<com.planner5d.library.model.manager.builtin.n> E0;
        private ij.c<com.planner5d.library.model.payments.paymentmethod.i> E1;
        private ij.c<com.planner5d.library.model.converter.json.from.q> E2;
        private ij.c<hd.b> E3;
        private ij.c<com.planner5d.library.h[]> E4;
        private ij.c<af.a> E5;
        private ij.c<com.planner5d.library.activity.fragment.smartwizard.decorator.interactor.b> E6;
        private ij.c<com.planner5d.library.activity.fragment.c0> E7;
        private ij.c<com.planner5d.library.database.migration.p> F;
        private ij.c<com.planner5d.library.model.manager.w0> F0;
        private ij.c<c1> F1;
        private ij.c<com.planner5d.library.model.manager.project.c> F2;
        private ij.c<com.planner5d.library.model.manager.config.h> F3;
        private ij.c<com.planner5d.library.interactor.g> F4;
        private ij.c<com.planner5d.library.widget.editor.popup.itemproperties.b> F5;
        private ij.c<ma.a> F6;
        private ij.c<com.planner5d.library.widget.editor.itemactionsbar.h> F7;
        private ij.c<com.planner5d.library.database.migration.r> G;
        private ij.c<com.planner5d.library.model.manager.y0> G0;
        private ij.c<e1> G1;
        private ij.c<com.planner5d.library.model.manager.project.m0.a> G2;
        private ij.c<com.planner5d.library.model.manager.config.source.growthbook.b> G3;
        private ij.c<le.d> G4;
        private ij.c<vb.f> G5;
        private ij.c<com.planner5d.library.smartwizard.interactor.a> G6;
        private ij.c<k2.a> G7;
        private ij.c<ad.b> H;
        private ij.c<com.planner5d.library.model.r> H0;
        private ij.c<com.planner5d.library.model.manager.payments.e> H1;
        private ij.c<com.planner5d.library.model.manager.project.m0> H2;
        private ij.c<com.planner5d.library.model.manager.config.source.growthbook.d> H3;
        private ij.c<com.planner5d.library.interactor.i> H4;
        private ij.c<com.planner5d.library.engine.p> H5;
        private ij.c<ce.a> H6;
        private ij.c<ec.e> H7;
        private ij.c<ApplicationDatabase.a> I;
        private ij.c<com.planner5d.library.model.manager.builtin.materialsmetadataloading.d.a> I0;
        private ij.c<a2> I1;
        private ij.c<com.planner5d.library.model.manager.favorite.c> I2;
        private ij.c<com.planner5d.library.model.manager.crashreporting.v> I3;
        private ij.c<le.e> I4;
        private ij.c<com.planner5d.library.widget.editor.popup.itemproperties.pages.texturepreview.n> I5;
        private ij.c<com.planner5d.library.activity.fragment.smartwizard.decorator.l> I6;
        private ij.c<ac.f> I7;
        private ij.c<ApplicationDatabase> J;
        private ij.c<com.planner5d.library.model.manager.builtin.materialsmetadataloading.b.a> J0;
        private ij.c<com.planner5d.library.model.manager.payments.v> J1;
        private ij.c<com.planner5d.library.model.manager.favorite.room.a> J2;
        private ij.c<com.planner5d.library.model.manager.performancetracing.e> J3;
        private ij.c<com.planner5d.library.activity.helper.t0> J4;
        private ij.c<com.planner5d.library.widget.editor.projectresources.a> J5;
        private ij.c<com.planner5d.library.activity.fragment.intenthandler.b> J6;
        private ij.c<bc.c> J7;
        private ij.c<com.planner5d.library.userimporteddata.b> K;
        private ij.c<com.planner5d.library.model.manager.builtin.v0> K0;
        private ij.c<com.planner5d.library.model.region.h> K1;
        private ij.c<com.planner5d.library.database.model.h> K2;
        private ij.c<com.planner5d.library.model.manager.crashreporting.d0> K3;
        private ij.c<com.planner5d.library.interactor.s> K4;
        private ij.c K5;
        private ij.c<n3> K6;
        private ij.c<cc.b> K7;
        private ij.c<t1> L;
        private ij.c<com.planner5d.library.model.manager.builtin.g0> L0;
        private ij.c<com.planner5d.library.model.region.j> L1;
        private ij.c<com.planner5d.library.model.manager.favorite.a> L2;
        private ij.c<com.planner5d.library.model.manager.config.sql.l> L3;
        private ij.c<le.i> L4;
        private ij.c<com.planner5d.library.widget.editor.projectresources.e> L5;
        private ij.c<com.planner5d.library.activity.fragment.spaces.documents.o> L6;
        private ij.c<dc.d<cc.a>> L7;
        private ij.c<u1> M;
        private ij.c<com.planner5d.library.model.manager.managedfiles.a0> M0;
        private ij.c<com.planner5d.library.model.region.f> M1;
        private ij.c<com.planner5d.library.model.manager.q0> M2;
        private ij.c<com.planner5d.library.api.support.l> M3;
        private ij.c<z0> M4;
        private ij.c<com.planner5d.library.widget.editor.popup.itemproperties.pages.size.k0> M5;
        private ij.c<com.planner5d.library.activity.fragment.spaces.folder.i> M6;
        private ij.c<com.planner5d.library.engine.h> M7;
        private ij.c<com.planner5d.library.userimporteddata.i> N;
        private ij.c<com.planner5d.library.services.download.a> N0;
        private ij.c<com.planner5d.library.model.region.b> N1;
        private ij.c<com.planner5d.library.model.manager.project.h0> N2;
        private ij.c<com.planner5d.library.api.support.p> N3;
        private ij.c<com.planner5d.library.activity.fragment.projects.h> N4;
        private ij.c<com.planner5d.library.widget.editor.popup.itemproperties.pages.texture.o> N5;
        private ij.c<com.planner5d.library.activity.fragment.spaces.file.i> N6;
        private ij.c<vb.g> N7;
        private ij.c<com.planner5d.library.services.z> O;
        private ij.c<j2> O0;
        private ij.c<com.planner5d.library.services.e0> O1;
        private ij.c<com.planner5d.library.widget.editor.helper.n3> O2;
        private ij.c<com.planner5d.library.api.support.b> O3;
        private ij.c<com.planner5d.library.activity.fragment.projects.w0> O4;
        private ij.c<com.planner5d.library.contest.data.f> O5;
        private ij.c<com.planner5d.library.activity.fragment.spaces.preview.b> O6;
        private ij.c<cc.f> O7;
        private ij.c<i1> P;
        private ij.c<y1> P0;
        private ij.c<com.planner5d.library.model.manager.payments.r> P1;
        private ij.c<o3> P2;
        private ij.c<g1> P3;
        private ij.c<com.planner5d.library.activity.fragment.snapshots.c1> P4;
        private ij.c<com.planner5d.library.model.manager.uploadplan.a> P5;
        private ij.c<com.planner5d.library.activity.fragment.projects.n0> P6;
        private ij.c<dd.c> P7;
        private ij.c<com.planner5d.library.services.bitmaploader.d.g> Q;
        private ij.c<com.planner5d.library.activity.fragment.j> Q0;
        private ij.c<com.planner5d.library.model.manager.payments.p> Q1;
        private ij.c<com.planner5d.library.model.manager.config.n> Q2;
        private ij.c<com.planner5d.library.modules.user.user.d> Q3;
        private ij.c<com.planner5d.library.activity.fragment.snapshots.k0> Q4;
        private ij.c<com.planner5d.library.activity.fragment.feed.interactor.i> Q5;
        private ij.c<com.planner5d.library.activity.fragment.spaces.dashboard.j> Q6;
        private ij.c<com.planner5d.library.widget.editor.editor3d.l> Q7;
        private ij.c<com.planner5d.library.services.filedownloader.c.a> R;
        private ij.c<com.planner5d.library.activity.fragment.x> R0;
        private ij.c<com.planner5d.library.modules.user.user.g0> R1;
        private ij.c<com.planner5d.library.activity.fragment.dialog.purchase.s> R2;
        private ij.c<com.planner5d.library.model.manager.i1> R3;
        private ij.c<com.planner5d.library.activity.fragment.snapshots.h> R4;
        private ij.c<ka.d> R5;
        private ij.c<Map<Class<? extends f2>, ij.c<f2>>> R6;
        private ij.c<com.planner5d.library.activity.fragment.smartwizard.roomstyle.interactor.a> R7;
        private ij.c<com.planner5d.library.model.manager.k> S;
        private ij.c<com.planner5d.library.model.manager.i> S0;
        private ij.c<w1> S1;
        private ij.c<ia.d> S2;
        private ij.c<m1> S3;
        private ij.c<ed.a> S4;
        private ij.c<j3> S5;
        private ij.c<com.planner5d.library.services.utility.g0> S6;
        private ij.c<pa.b> S7;
        private ij.c<com.planner5d.library.services.backgroundexecutor.g> T;
        private ij.c<com.planner5d.library.services.render.a> T0;
        private ij.c<com.planner5d.library.model.manager.w> T1;
        private ij.c<com.planner5d.library.activity.helper.l0> T2;
        private ij.c<com.planner5d.library.activity.helper.imagechooser.j> T3;
        private ij.c<com.planner5d.library.model.manager.menu.a> T4;
        private ij.c<com.planner5d.library.feed.data.g> T5;
        private com.planner5d.library.activity.fragment.dialog.purchase.g0 T6;
        private ij.c<com.planner5d.library.widget.editor.menu.j> T7;
        private ij.c<com.planner5d.library.services.filedownloader.c> U;
        private ij.c<com.planner5d.library.services.upload.a> U0;
        private ij.c<com.planner5d.library.model.manager.l> U1;
        private ij.c<com.planner5d.library.activity.a> U2;
        private ij.c<com.planner5d.library.widget.editor.helper.a2> U3;
        private ij.c<com.planner5d.library.modules.user.user.z> U4;
        private ij.c<com.planner5d.library.activity.fragment.feed.interactor.g> U5;
        private ij.c<com.planner5d.library.activity.fragment.dialog.purchase.f0.b> U6;
        private ij.c<com.planner5d.library.widget.editor.facade.c0> U7;
        private ij.c<com.planner5d.library.userimporteddata.l> V;
        private ij.c<com.planner5d.library.services.upload.g> V0;
        private ij.c<com.planner5d.library.model.manager.managedfiles.d> V1;
        private ij.c<com.planner5d.library.model.manager.payments.a0> V2;
        private ij.c<com.planner5d.library.model.manager.f> V3;
        private ij.c<com.planner5d.library.activity.fragment.profile.x> V4;
        private ij.c<ka.c> V5;
        private com.planner5d.library.activity.fragment.dialog.video.g V6;
        private ij.c<com.planner5d.library.model.manager.uploadplan.g> V7;
        private ij.c<com.planner5d.library.services.utility.p0.a> W;
        private ij.c<com.planner5d.library.database.model.spaces.documents.d> W0;
        private ij.c<com.planner5d.library.model.manager.managedfiles.t> W1;
        private ij.c<ia.g> W2;
        private ij.c<com.planner5d.library.activity.fragment.startup.x> W3;
        private ij.c<com.planner5d.library.activity.fragment.profile.edit.n> W4;
        private ij.c<com.planner5d.library.activity.fragment.feed.interactor.e> W5;
        private ij.c<com.planner5d.library.activity.fragment.dialog.video.f.a> W6;
        private ij.c<com.planner5d.library.interactor.a> W7;
        private ij.c<com.planner5d.library.services.utility.p0> X;
        private ij.c<com.planner5d.library.activity.helper.r> X0;
        private ij.c<com.planner5d.library.model.manager.managedfiles.p.a> X1;
        private ij.c<ia.b> X2;
        private ij.c<com.planner5d.library.activity.fragment.messages.g> X3;
        private ij.c<com.planner5d.library.activity.fragment.profile.edit.item.e> X4;
        private ij.c<ka.b> X5;
        private ij.c<Map<Class<? extends f2>, com.planner5d.library.services.utility.f<? extends f2>>> X6;
        private ij.c<le.a> X7;
        private ij.c<com.planner5d.library.model.converter.json.from.x> Y;
        private ij.c<com.planner5d.library.database.model.spaces.d> Y0;
        private ij.c<com.planner5d.library.model.manager.initialization.x> Y1;
        private ij.c<com.planner5d.library.activity.fragment.dialog.purchase.t> Y2;
        private ij.c<com.planner5d.library.modules.user.auth.m> Y3;
        private ij.c<com.planner5d.library.activity.fragment.profile.edit.password.f> Y4;
        private ij.c<com.planner5d.library.feed.data.d> Y5;
        private ij.c<com.planner5d.library.services.utility.g1> Y6;
        private ij.c<com.planner5d.library.widget.editor.helper.w1> Y7;
        private ij.c<com.planner5d.library.model.converter.json.from.z> Z;
        private ij.c<com.planner5d.library.model.manager.spaces.b> Z0;
        private ij.c<com.planner5d.library.model.manager.crashreporting.l> Z1;
        private ij.c<com.planner5d.library.model.manager.payments.m> Z2;
        private ij.c<com.planner5d.library.activity.fragment.settings.h> Z3;
        private ij.c<com.planner5d.library.activity.fragment.profile.orders.l> Z4;
        private ij.c<ic.a> Z5;
        private ij.c<ud.b> Z6;
        private ij.c<com.planner5d.library.widget.editor.facade.s> Z7;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final com.planner5d.library.application.b f264547a;

        /* JADX INFO: renamed from: a0, reason: collision with root package name */
        private ij.c<com.planner5d.library.model.converter.json.from.c0> f264548a0;

        /* JADX INFO: renamed from: a1, reason: collision with root package name */
        private ij.c<com.planner5d.library.model.manager.spaces.documents.c> f264549a1;

        /* JADX INFO: renamed from: a2, reason: collision with root package name */
        private ij.c<com.planner5d.library.model.manager.initialization.b0> f264550a2;

        /* JADX INFO: renamed from: a3, reason: collision with root package name */
        private ij.c<com.planner5d.library.model.manager.c2> f264551a3;

        /* JADX INFO: renamed from: a4, reason: collision with root package name */
        private ij.c<com.planner5d.library.activity.fragment.dialog.authentication.e1> f264552a4;

        /* JADX INFO: renamed from: a5, reason: collision with root package name */
        private ij.c<com.planner5d.library.activity.fragment.gallery.k0> f264553a5;

        /* JADX INFO: renamed from: a6, reason: collision with root package name */
        private ij.c<com.planner5d.library.feed.usecase.b> f264554a6;

        /* JADX INFO: renamed from: a7, reason: collision with root package name */
        private ij.c<com.planner5d.library.activity.fragment.list.d0> f264555a7;

        /* JADX INFO: renamed from: a8, reason: collision with root package name */
        private ij.c<r1> f264556a8;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final android.app.Application f264557b;

        /* JADX INFO: renamed from: b0, reason: collision with root package name */
        private ij.c<dd.a> f264558b0;

        /* JADX INFO: renamed from: b1, reason: collision with root package name */
        private ij.c<com.planner5d.library.services.download.d> f264559b1;

        /* JADX INFO: renamed from: b2, reason: collision with root package name */
        private ij.c<cd.c> f264560b2;

        /* JADX INFO: renamed from: b3, reason: collision with root package name */
        private ij.c<o1> f264561b3;

        /* JADX INFO: renamed from: b4, reason: collision with root package name */
        private ij.c<com.planner5d.library.activity.fragment.dialog.authentication.y> f264562b4;

        /* JADX INFO: renamed from: b5, reason: collision with root package name */
        private ij.c<com.planner5d.library.activity.fragment.gallery.v> f264563b5;

        /* JADX INFO: renamed from: b6, reason: collision with root package name */
        private ij.c<com.planner5d.library.model.manager.p> f264564b6;

        /* JADX INFO: renamed from: b7, reason: collision with root package name */
        private ij.c<com.planner5d.library.model.manager.config.r> f264565b7;

        /* JADX INFO: renamed from: b8, reason: collision with root package name */
        private ij.c<u2> f264566b8;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final com.planner5d.library.application.d f264567c;

        /* JADX INFO: renamed from: c0, reason: collision with root package name */
        private ij.c<com.planner5d.library.model.converter.json.from.a> f264568c0;

        /* JADX INFO: renamed from: c1, reason: collision with root package name */
        private ij.c<com.planner5d.library.services.utility.w> f264569c1;

        /* JADX INFO: renamed from: c2, reason: collision with root package name */
        private ij.c<com.planner5d.library.model.manager.statistics.devtodev.d.b> f264570c2;

        /* JADX INFO: renamed from: c3, reason: collision with root package name */
        private ij.c<com.planner5d.library.services.i> f264571c3;

        /* JADX INFO: renamed from: c4, reason: collision with root package name */
        private ij.c<com.planner5d.library.activity.fragment.dialog.authentication.c1> f264572c4;

        /* JADX INFO: renamed from: c5, reason: collision with root package name */
        private ij.c<com.planner5d.library.activity.fragment.gallery.x> f264573c5;

        /* JADX INFO: renamed from: c6, reason: collision with root package name */
        private ij.c<com.planner5d.library.activity.fragment.feed.interactor.c> f264574c6;

        /* JADX INFO: renamed from: c7, reason: collision with root package name */
        private ij.c<com.planner5d.library.modules.user.user.a0> f264575c7;

        /* JADX INFO: renamed from: c8, reason: collision with root package name */
        private ij.c<com.planner5d.library.widget.editor.interactor.a> f264576c8;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final com.planner5d.library.application.i f264577d;

        /* JADX INFO: renamed from: d0, reason: collision with root package name */
        private ij.c<com.planner5d.library.model.converter.json.from.o> f264578d0;

        /* JADX INFO: renamed from: d1, reason: collision with root package name */
        private ij.c<k5> f264579d1;

        /* JADX INFO: renamed from: d2, reason: collision with root package name */
        private ij.c<com.planner5d.library.model.manager.statistics.b0> f264580d2;

        /* JADX INFO: renamed from: d3, reason: collision with root package name */
        private ij.c<com.planner5d.library.model.manager.config.attributes.a> f264581d3;

        /* JADX INFO: renamed from: d4, reason: collision with root package name */
        private ij.c<com.planner5d.library.activity.fragment.dialog.authentication.v0> f264582d4;

        /* JADX INFO: renamed from: d5, reason: collision with root package name */
        private ij.c<com.planner5d.library.activity.fragment.gallery.p0> f264583d5;

        /* JADX INFO: renamed from: d6, reason: collision with root package name */
        private ij.c<com.planner5d.library.feed.usecase.a> f264584d6;

        /* JADX INFO: renamed from: d7, reason: collision with root package name */
        private ij.c<k1> f264585d7;

        /* JADX INFO: renamed from: d8, reason: collision with root package name */
        private ij.c<cf.a> f264586d8;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final q3 f264587e;

        /* JADX INFO: renamed from: e0, reason: collision with root package name */
        private ij.c<com.planner5d.library.model.converter.json.from.h> f264588e0;

        /* JADX INFO: renamed from: e1, reason: collision with root package name */
        private ij.c<NetworkErrorUtility> f264589e1;

        /* JADX INFO: renamed from: e2, reason: collision with root package name */
        private ij.c<com.planner5d.library.model.manager.statistics.d0> f264590e2;

        /* JADX INFO: renamed from: e3, reason: collision with root package name */
        private ij.c<com.planner5d.library.model.manager.config.attributes.c> f264591e3;

        /* JADX INFO: renamed from: e4, reason: collision with root package name */
        private ij.c<com.planner5d.library.activity.fragment.dialog.authentication.onelink.l> f264592e4;

        /* JADX INFO: renamed from: e5, reason: collision with root package name */
        private ij.c<com.planner5d.library.interactor.n0> f264593e5;

        /* JADX INFO: renamed from: e6, reason: collision with root package name */
        private ij.c<com.planner5d.library.activity.fragment.feed.e1> f264594e6;

        /* JADX INFO: renamed from: e7, reason: collision with root package name */
        private ij.c<com.planner5d.library.model.manager.contest.b> f264595e7;

        /* JADX INFO: renamed from: e8, reason: collision with root package name */
        private ij.c<com.planner5d.library.interactor.f0> f264596e8;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final n0 f264597f;

        /* JADX INFO: renamed from: f0, reason: collision with root package name */
        private ij.c<com.planner5d.library.model.converter.json.from.s> f264598f0;

        /* JADX INFO: renamed from: f1, reason: collision with root package name */
        private ij.c<com.planner5d.library.model.manager.managedfiles.y> f264599f1;

        /* JADX INFO: renamed from: f2, reason: collision with root package name */
        private ij.c<com.planner5d.library.activity.fragment.dialog.k> f264600f2;

        /* JADX INFO: renamed from: f3, reason: collision with root package name */
        private ij.c<r3> f264601f3;

        /* JADX INFO: renamed from: f4, reason: collision with root package name */
        private ij.c<com.planner5d.library.activity.fragment.dialog.authentication.onelink.v> f264602f4;

        /* JADX INFO: renamed from: f5, reason: collision with root package name */
        private ij.c<le.o> f264603f5;

        /* JADX INFO: renamed from: f6, reason: collision with root package name */
        private ij.c<com.planner5d.library.activity.fragment.smartwizard.t> f264604f6;

        /* JADX INFO: renamed from: f7, reason: collision with root package name */
        private ij.c<com.planner5d.library.model.manager.d> f264605f7;

        /* JADX INFO: renamed from: f8, reason: collision with root package name */
        private ij.c<le.k> f264606f8;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final r0 f264607g;

        /* JADX INFO: renamed from: g0, reason: collision with root package name */
        private ij.c<com.planner5d.library.model.converter.json.from.m> f264608g0;

        /* JADX INFO: renamed from: g1, reason: collision with root package name */
        private ij.c<com.planner5d.library.model.manager.builtin.l> f264609g1;

        /* JADX INFO: renamed from: g2, reason: collision with root package name */
        private ij.c<com.planner5d.library.contest.view.b0> f264610g2;

        /* JADX INFO: renamed from: g3, reason: collision with root package name */
        private ij.c<m4> f264611g3;

        /* JADX INFO: renamed from: g4, reason: collision with root package name */
        private ij.c<com.planner5d.library.activity.fragment.dialog.authentication.f0> f264612g4;

        /* JADX INFO: renamed from: g5, reason: collision with root package name */
        private ij.c<com.planner5d.library.model.i> f264613g5;

        /* JADX INFO: renamed from: g6, reason: collision with root package name */
        private ij.c<com.planner5d.library.activity.fragment.smartwizard.v> f264614g6;

        /* JADX INFO: renamed from: g7, reason: collision with root package name */
        private ij.c<com.planner5d.library.activity.helper.x> f264615g7;

        /* JADX INFO: renamed from: g8, reason: collision with root package name */
        private ij.c<n2.a> f264616g8;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final t f264617h;

        /* JADX INFO: renamed from: h0, reason: collision with root package name */
        private ij.c<com.planner5d.library.model.converter.json.from.j> f264618h0;

        /* JADX INFO: renamed from: h1, reason: collision with root package name */
        private ij.c<x2> f264619h1;

        /* JADX INFO: renamed from: h2, reason: collision with root package name */
        private ij.c<com.planner5d.library.contest.view.vote.a> f264620h2;

        /* JADX INFO: renamed from: h3, reason: collision with root package name */
        private ij.c<h4> f264621h3;

        /* JADX INFO: renamed from: h4, reason: collision with root package name */
        private ij.c<com.planner5d.library.modules.user.auth.r> f264622h4;

        /* JADX INFO: renamed from: h5, reason: collision with root package name */
        private ij.c<com.planner5d.library.activity.fragment.gallery.m> f264623h5;

        /* JADX INFO: renamed from: h6, reason: collision with root package name */
        private ij.c<sd.e> f264624h6;

        /* JADX INFO: renamed from: h7, reason: collision with root package name */
        private ij.c<i2> f264625h7;

        /* JADX INFO: renamed from: h8, reason: collision with root package name */
        private ij.c<com.planner5d.library.widget.editor.helper.g1> f264626h8;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final com.planner5d.library.application.designoftheday.a f264627i;

        /* JADX INFO: renamed from: i0, reason: collision with root package name */
        private ij.c<com.planner5d.library.model.converter.json.from.u> f264628i0;

        /* JADX INFO: renamed from: i1, reason: collision with root package name */
        private ij.c<q2> f264629i1;

        /* JADX INFO: renamed from: i2, reason: collision with root package name */
        private ij.c<com.planner5d.library.model.manager.statistics.appsflyer.d> f264630i2;

        /* JADX INFO: renamed from: i3, reason: collision with root package name */
        private ij.c<com.planner5d.library.model.manager.statistics.i> f264631i3;

        /* JADX INFO: renamed from: i4, reason: collision with root package name */
        private ij.c<com.planner5d.library.modules.user.user.m0> f264632i4;

        /* JADX INFO: renamed from: i5, reason: collision with root package name */
        private ij.c<com.planner5d.library.activity.fragment.gallery.project.k> f264633i5;

        /* JADX INFO: renamed from: i6, reason: collision with root package name */
        private ij.c<oa.d> f264634i6;

        /* JADX INFO: renamed from: i7, reason: collision with root package name */
        private ij.c<v3> f264635i7;

        /* JADX INFO: renamed from: i8, reason: collision with root package name */
        private ij.c<com.planner5d.library.widget.editor.editor3d.q> f264636i8;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final f6 f264637j;

        /* JADX INFO: renamed from: j0, reason: collision with root package name */
        private ij.c<com.planner5d.library.model.converter.json.from.f> f264638j0;

        /* JADX INFO: renamed from: j1, reason: collision with root package name */
        private ij.c<zc.b> f264639j1;

        /* JADX INFO: renamed from: j2, reason: collision with root package name */
        private ij.c<com.planner5d.library.model.manager.statistics.devtodev.d> f264640j2;

        /* JADX INFO: renamed from: j3, reason: collision with root package name */
        private ij.c<com.planner5d.library.model.manager.statistics.g> f264641j3;

        /* JADX INFO: renamed from: j4, reason: collision with root package name */
        private ij.c<com.planner5d.library.activity.fragment.dialog.authentication.privacy.c> f264642j4;

        /* JADX INFO: renamed from: j5, reason: collision with root package name */
        private ij.c<com.planner5d.library.activity.fragment.dialog.purchase.v> f264643j5;

        /* JADX INFO: renamed from: j6, reason: collision with root package name */
        private ij.c<oa.f> f264644j6;

        /* JADX INFO: renamed from: j7, reason: collision with root package name */
        private ij.c<com.planner5d.library.activity.fragment.dialog.s> f264645j7;

        /* JADX INFO: renamed from: j8, reason: collision with root package name */
        private ij.c<com.planner5d.library.services.licensing.a<?>> f264646j8;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private final b f264647k;

        /* JADX INFO: renamed from: k0, reason: collision with root package name */
        private ij.c f264648k0;

        /* JADX INFO: renamed from: k1, reason: collision with root package name */
        private ij.c<com.planner5d.library.model.manager.unlockeditems.d> f264649k1;

        /* JADX INFO: renamed from: k2, reason: collision with root package name */
        private ij.c<com.planner5d.library.model.manager.statistics.debug.c> f264650k2;

        /* JADX INFO: renamed from: k3, reason: collision with root package name */
        private ij.c<com.planner5d.library.model.manager.initialization.v> f264651k3;

        /* JADX INFO: renamed from: k4, reason: collision with root package name */
        private ij.c<com.planner5d.library.activity.fragment.dialog.authentication.k1> f264652k4;

        /* JADX INFO: renamed from: k5, reason: collision with root package name */
        private ij.c<com.planner5d.library.activity.fragment.dialog.purchase.c.a> f264653k5;

        /* JADX INFO: renamed from: k6, reason: collision with root package name */
        private ij.c<com.planner5d.library.activity.fragment.smartwizard.roomshape.f> f264654k6;

        /* JADX INFO: renamed from: k7, reason: collision with root package name */
        private ij.c<com.planner5d.library.services.p> f264655k7;

        /* JADX INFO: renamed from: k8, reason: collision with root package name */
        private ij.c<com.planner5d.library.activity.helper.i0> f264656k8;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private ij.c<android.app.Application> f264657l;

        /* JADX INFO: renamed from: l0, reason: collision with root package name */
        private ij.c f264658l0;

        /* JADX INFO: renamed from: l1, reason: collision with root package name */
        private ij.c<n5> f264659l1;

        /* JADX INFO: renamed from: l2, reason: collision with root package name */
        private ij.c<com.planner5d.library.model.manager.statistics.customerio.c> f264660l2;

        /* JADX INFO: renamed from: l3, reason: collision with root package name */
        private ij.c<com.planner5d.library.legal.model.manager.a> f264661l3;

        /* JADX INFO: renamed from: l4, reason: collision with root package name */
        private ij.c<s4> f264662l4;

        /* JADX INFO: renamed from: l5, reason: collision with root package name */
        private ij.c<com.planner5d.library.activity.fragment.dialog.purchase.premium.p> f264663l5;

        /* JADX INFO: renamed from: l6, reason: collision with root package name */
        private ij.c<com.planner5d.library.activity.fragment.smartwizard.dimensions.interactor.a> f264664l6;

        /* JADX INFO: renamed from: l7, reason: collision with root package name */
        private ij.c<com.planner5d.library.services.t> f264665l7;

        /* JADX INFO: renamed from: l8, reason: collision with root package name */
        private ij.c<com.planner5d.library.application.designoftheday.d> f264666l8;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private ij.c<com.planner5d.library.application.b> f264667m;

        /* JADX INFO: renamed from: m0, reason: collision with root package name */
        private ij.c<com.planner5d.library.model.converter.json.from.c> f264668m0;

        /* JADX INFO: renamed from: m1, reason: collision with root package name */
        private ij.c<com.planner5d.library.model.manager.config.j> f264669m1;

        /* JADX INFO: renamed from: m2, reason: collision with root package name */
        private ij.c<com.planner5d.library.model.manager.statistics.f> f264670m2;

        /* JADX INFO: renamed from: m3, reason: collision with root package name */
        private ij.c<com.planner5d.library.model.manager.f2> f264671m3;

        /* JADX INFO: renamed from: m4, reason: collision with root package name */
        private ij.c<m3> f264672m4;

        /* JADX INFO: renamed from: m5, reason: collision with root package name */
        private ij.c<com.planner5d.library.activity.fragment.dialog.purchase.designgenerator.g> f264673m5;

        /* JADX INFO: renamed from: m6, reason: collision with root package name */
        private ij.c<na.a> f264674m6;

        /* JADX INFO: renamed from: m7, reason: collision with root package name */
        private ij.c<com.planner5d.library.services.o0> f264675m7;

        /* JADX INFO: renamed from: m8, reason: collision with root package name */
        private ij.c<com.planner5d.library.application.designoftheday.f> f264676m8;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private ij.c<SharedPreferences> f264677n;

        /* JADX INFO: renamed from: n0, reason: collision with root package name */
        private ij.c f264678n0;

        /* JADX INFO: renamed from: n1, reason: collision with root package name */
        private ij.c<com.planner5d.library.model.manager.unlockeditems.b> f264679n1;

        /* JADX INFO: renamed from: n2, reason: collision with root package name */
        private ij.c<t3> f264680n2;

        /* JADX INFO: renamed from: n3, reason: collision with root package name */
        private ij.c<com.planner5d.library.modules.user.user.z0> f264681n3;

        /* JADX INFO: renamed from: n4, reason: collision with root package name */
        private ij.c<l1> f264682n4;

        /* JADX INFO: renamed from: n5, reason: collision with root package name */
        private ij.c<com.planner5d.library.activity.fragment.dialog.purchase.snapshots.h> f264683n5;

        /* JADX INFO: renamed from: n6, reason: collision with root package name */
        private ij.c<na.b> f264684n6;

        /* JADX INFO: renamed from: n7, reason: collision with root package name */
        private ij.c<v4> f264685n7;

        /* JADX INFO: renamed from: n8, reason: collision with root package name */
        private ij.c<p5> f264686n8;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private ij.c<com.planner5d.library.model.manager.config.xml.a> f264687o;

        /* JADX INFO: renamed from: o0, reason: collision with root package name */
        private ij.c f264688o0;

        /* JADX INFO: renamed from: o1, reason: collision with root package name */
        private ij.c<m5> f264689o1;

        /* JADX INFO: renamed from: o2, reason: collision with root package name */
        private ij.c<com.planner5d.library.model.manager.statistics.k> f264690o2;

        /* JADX INFO: renamed from: o3, reason: collision with root package name */
        private ij.c<b1> f264691o3;

        /* JADX INFO: renamed from: o4, reason: collision with root package name */
        private ij.c<com.planner5d.library.uploadplan.interactor.n> f264692o4;

        /* JADX INFO: renamed from: o5, reason: collision with root package name */
        private ij.c<com.planner5d.library.activity.fragment.dialog.purchase.textures.c> f264693o5;

        /* JADX INFO: renamed from: o6, reason: collision with root package name */
        private ij.c<na.c> f264694o6;

        /* JADX INFO: renamed from: o7, reason: collision with root package name */
        private ij.c<p4> f264695o7;

        /* JADX INFO: renamed from: o8, reason: collision with root package name */
        private ij.c<com.planner5d.library.model.converter.json.to.f> f264696o8;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private ij.c<f1> f264697p;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        private ij.c<ItemBuilder> f264698p0;

        /* JADX INFO: renamed from: p1, reason: collision with root package name */
        private ij.c<sd.b> f264699p1;

        /* JADX INFO: renamed from: p2, reason: collision with root package name */
        private ij.c<com.planner5d.library.activity.fragment.dialog.y> f264700p2;

        /* JADX INFO: renamed from: p3, reason: collision with root package name */
        private ij.c<com.planner5d.library.modules.user.user.q0> f264701p3;

        /* JADX INFO: renamed from: p4, reason: collision with root package name */
        private ij.c<com.planner5d.library.activity.fragment.projects.g> f264702p4;

        /* JADX INFO: renamed from: p5, reason: collision with root package name */
        private ij.c<com.planner5d.library.activity.fragment.dialog.purchase.recognitions.d> f264703p5;

        /* JADX INFO: renamed from: p6, reason: collision with root package name */
        private ij.c<com.planner5d.library.activity.fragment.smartwizard.dimensions.t> f264704p6;

        /* JADX INFO: renamed from: p7, reason: collision with root package name */
        private ij.c<q4> f264705p7;

        /* JADX INFO: renamed from: p8, reason: collision with root package name */
        private ij.c<com.planner5d.library.activity.helper.u> f264706p8;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private ij.c<com.planner5d.library.application.d> f264707q;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        private ij.c<com.planner5d.library.model.converter.json.to.w> f264708q0;

        /* JADX INFO: renamed from: q1, reason: collision with root package name */
        private ij.c<com.planner5d.library.model.manager.config.source.g> f264709q1;

        /* JADX INFO: renamed from: q2, reason: collision with root package name */
        private ij.c<com.planner5d.library.activity.fragment.dialog.z> f264710q2;

        /* JADX INFO: renamed from: q3, reason: collision with root package name */
        private ij.c<com.planner5d.library.model.manager.initialization.r> f264711q3;

        /* JADX INFO: renamed from: q4, reason: collision with root package name */
        private ij.c<com.planner5d.library.activity.fragment.projects.c0> f264712q4;

        /* JADX INFO: renamed from: q5, reason: collision with root package name */
        private ij.c<com.planner5d.library.modules.user.user.o0> f264713q5;

        /* JADX INFO: renamed from: q6, reason: collision with root package name */
        private ij.c<com.planner5d.library.activity.fragment.smartwizard.roomstyle.interactor.f> f264714q6;

        /* JADX INFO: renamed from: q7, reason: collision with root package name */
        private ij.c<a5> f264715q7;

        /* JADX INFO: renamed from: q8, reason: collision with root package name */
        private ij.c<com.planner5d.library.activity.helper.f0> f264716q8;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private ij.c<com.planner5d.library.api.requests.a> f264717r;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        private ij.c<com.planner5d.library.model.converter.json.to.z> f264718r0;

        /* JADX INFO: renamed from: r1, reason: collision with root package name */
        private ij.c<com.planner5d.library.model.manager.config.source.g.a> f264719r1;

        /* JADX INFO: renamed from: r2, reason: collision with root package name */
        private ij.c<com.planner5d.library.model.manager.project.d0> f264720r2;

        /* JADX INFO: renamed from: r3, reason: collision with root package name */
        private ij.c<com.planner5d.library.activity.fragment.n> f264721r3;

        /* JADX INFO: renamed from: r4, reason: collision with root package name */
        private ij.c<com.planner5d.library.feed.data.a> f264722r4;

        /* JADX INFO: renamed from: r5, reason: collision with root package name */
        private ij.c<com.planner5d.library.activity.fragment.profile.promocode.e> f264723r5;

        /* JADX INFO: renamed from: r6, reason: collision with root package name */
        private ij.c<pa.d> f264724r6;

        /* JADX INFO: renamed from: r7, reason: collision with root package name */
        private ij.c<b5> f264725r7;

        /* JADX INFO: renamed from: r8, reason: collision with root package name */
        private ij.c<com.planner5d.library.modules.user.user.e0> f264726r8;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private ij.c<com.planner5d.library.api.b> f264727s;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        private ij.c<com.planner5d.library.model.converter.json.to.m> f264728s0;

        /* JADX INFO: renamed from: s1, reason: collision with root package name */
        private ij.c<com.planner5d.library.model.manager.config.source.l> f264729s1;

        /* JADX INFO: renamed from: s2, reason: collision with root package name */
        private ij.c<ErrorMessageParser> f264730s2;

        /* JADX INFO: renamed from: s3, reason: collision with root package name */
        private ij.c<com.planner5d.library.modules.user.user.b> f264731s3;

        /* JADX INFO: renamed from: s4, reason: collision with root package name */
        private ij.c<com.planner5d.library.model.manager.b> f264732s4;

        /* JADX INFO: renamed from: s5, reason: collision with root package name */
        private ij.c<com.planner5d.library.activity.fragment.dialog.send_to_gallery.l> f264733s5;

        /* JADX INFO: renamed from: s6, reason: collision with root package name */
        private ij.c<com.planner5d.library.activity.fragment.smartwizard.roomstyle.interactor.i> f264734s6;

        /* JADX INFO: renamed from: s7, reason: collision with root package name */
        private ij.c<s2> f264735s7;

        /* JADX INFO: renamed from: s8, reason: collision with root package name */
        private ij.c<com.planner5d.library.services.v> f264736s8;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private ij.c<com.planner5d.library.api.requests.c> f264737t;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        private ij.c<com.planner5d.library.model.converter.json.to.h> f264738t0;

        /* JADX INFO: renamed from: t1, reason: collision with root package name */
        private ij.c<com.planner5d.library.model.manager.config.source.j> f264739t1;

        /* JADX INFO: renamed from: t2, reason: collision with root package name */
        private ij.c<com.planner5d.library.model.manager.b2> f264740t2;

        /* JADX INFO: renamed from: t3, reason: collision with root package name */
        private ij.c<com.planner5d.library.modules.user.user.y0> f264741t3;

        /* JADX INFO: renamed from: t4, reason: collision with root package name */
        private ij.c<com.planner5d.library.activity.helper.j2> f264742t4;

        /* JADX INFO: renamed from: t5, reason: collision with root package name */
        private ij.c<com.planner5d.library.activity.helper.f1> f264743t5;

        /* JADX INFO: renamed from: t6, reason: collision with root package name */
        private ij.c<pa.e> f264744t6;

        /* JADX INFO: renamed from: t7, reason: collision with root package name */
        private ij.c<com.planner5d.library.database.model.chat.b> f264745t7;

        /* JADX INFO: renamed from: t8, reason: collision with root package name */
        private ij.c<com.planner5d.library.activity.helper.m1> f264746t8;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private ij.c<com.planner5d.library.modules.user.user.t> f264747u;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        private ij.c<com.planner5d.library.model.converter.json.to.d> f264748u0;

        /* JADX INFO: renamed from: u1, reason: collision with root package name */
        private ij.c<com.planner5d.library.services.utility.t> f264749u1;

        /* JADX INFO: renamed from: u2, reason: collision with root package name */
        private ij.c<l3> f264750u2;

        /* JADX INFO: renamed from: u3, reason: collision with root package name */
        private ij.c<com.planner5d.library.model.manager.initialization.z.a> f264751u3;

        /* JADX INFO: renamed from: u4, reason: collision with root package name */
        private ij.c<com.planner5d.library.activity.helper.m2> f264752u4;

        /* JADX INFO: renamed from: u5, reason: collision with root package name */
        private ij.c<com.planner5d.library.activity.fragment.dialog.snapshots.n> f264753u5;

        /* JADX INFO: renamed from: u6, reason: collision with root package name */
        private ij.c<com.planner5d.library.activity.fragment.smartwizard.roomstyle.interactor.d> f264754u6;

        /* JADX INFO: renamed from: u7, reason: collision with root package name */
        private ij.c<com.planner5d.library.database.model.chat.i> f264755u7;

        /* JADX INFO: renamed from: u8, reason: collision with root package name */
        private ij.c<sd.k> f264756u8;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private ij.c<com.planner5d.library.model.manager.builtin.i> f264757v;

        /* JADX INFO: renamed from: v0, reason: collision with root package name */
        private ij.c<com.planner5d.library.model.converter.json.to.r> f264758v0;

        /* JADX INFO: renamed from: v1, reason: collision with root package name */
        private ij.c<com.planner5d.library.model.manager.config.d> f264759v1;

        /* JADX INFO: renamed from: v2, reason: collision with root package name */
        private ij.c<com.planner5d.library.services.g0> f264760v2;

        /* JADX INFO: renamed from: v3, reason: collision with root package name */
        private ij.c<com.planner5d.library.engine.i> f264761v3;

        /* JADX INFO: renamed from: v4, reason: collision with root package name */
        private ij.c<com.planner5d.library.activity.helper.e> f264762v4;

        /* JADX INFO: renamed from: v5, reason: collision with root package name */
        private ij.c<com.planner5d.library.model.manager.s0> f264763v5;

        /* JADX INFO: renamed from: v6, reason: collision with root package name */
        private ij.c<pa.c> f264764v6;

        /* JADX INFO: renamed from: v7, reason: collision with root package name */
        private ij.c<com.planner5d.library.model.manager.push.b> f264765v7;

        /* JADX INFO: renamed from: v8, reason: collision with root package name */
        private ij.c<com.planner5d.library.model.manager.appupdate.h> f264766v8;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        private ij.c<com.planner5d.library.services.utility.w1> f264767w;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        private ij.c<com.planner5d.library.model.converter.json.to.k> f264768w0;

        /* JADX INFO: renamed from: w1, reason: collision with root package name */
        private ij.c<com.planner5d.library.model.manager.h> f264769w1;

        /* JADX INFO: renamed from: w2, reason: collision with root package name */
        private ij.c<com.planner5d.library.model.manager.contest.g> f264770w2;

        /* JADX INFO: renamed from: w3, reason: collision with root package name */
        private ij.c<com.planner5d.library.model.manager.initialization.t> f264771w3;

        /* JADX INFO: renamed from: w4, reason: collision with root package name */
        private ij.c<com.planner5d.library.widget.rate.e> f264772w4;

        /* JADX INFO: renamed from: w5, reason: collision with root package name */
        private ij.c<com.planner5d.library.activity.fragment.dialog.projectsettings.u0> f264773w5;

        /* JADX INFO: renamed from: w6, reason: collision with root package name */
        private ij.c<com.planner5d.library.smartwizard.data.c> f264774w6;

        /* JADX INFO: renamed from: w7, reason: collision with root package name */
        private ij.c<com.planner5d.library.services.service.b> f264775w7;

        /* JADX INFO: renamed from: w8, reason: collision with root package name */
        private ij.c<e2> f264776w8;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        private ij.c<n1> f264777x;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        private ij.c<com.planner5d.library.model.converter.json.to.t> f264778x0;

        /* JADX INFO: renamed from: x1, reason: collision with root package name */
        private ij.c<v2> f264779x1;

        /* JADX INFO: renamed from: x2, reason: collision with root package name */
        private ij.c<com.planner5d.library.model.manager.synchronization.i> f264780x2;

        /* JADX INFO: renamed from: x3, reason: collision with root package name */
        private ij.c<com.planner5d.library.activity.fragment.startup.a> f264781x3;

        /* JADX INFO: renamed from: x4, reason: collision with root package name */
        private ij.c<com.planner5d.library.widget.rate.a> f264782x4;

        /* JADX INFO: renamed from: x5, reason: collision with root package name */
        private ij.c<com.planner5d.library.activity.fragment.dialog.iteminfo.d> f264783x5;

        /* JADX INFO: renamed from: x6, reason: collision with root package name */
        private ij.c<com.planner5d.library.smartwizard.interactor.g> f264784x6;

        /* JADX INFO: renamed from: x7, reason: collision with root package name */
        private ij.c<com.planner5d.library.model.manager.builtin.y0> f264785x7;

        /* JADX INFO: renamed from: x8, reason: collision with root package name */
        private ij.c<com.planner5d.library.services.utility.z0> f264786x8;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        private ij.c<com.planner5d.library.model.manager.config.p> f264787y;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        private ij.c<com.planner5d.library.model.converter.json.to.b> f264788y0;

        /* JADX INFO: renamed from: y1, reason: collision with root package name */
        private ij.c<com.planner5d.library.model.payments.paymentmethod.g> f264789y1;

        /* JADX INFO: renamed from: y2, reason: collision with root package name */
        private ij.c<com.planner5d.library.model.manager.c0> f264790y2;

        /* JADX INFO: renamed from: y3, reason: collision with root package name */
        private ij.c<com.planner5d.library.model.manager.initialization.r.a> f264791y3;

        /* JADX INFO: renamed from: y4, reason: collision with root package name */
        private ij.c<com.planner5d.library.widget.rate.g> f264792y4;

        /* JADX INFO: renamed from: y5, reason: collision with root package name */
        private ij.c<com.planner5d.library.widget.editor.popup.itemproperties.y> f264793y5;

        /* JADX INFO: renamed from: y6, reason: collision with root package name */
        private ij.c<ce.c> f264794y6;

        /* JADX INFO: renamed from: y7, reason: collision with root package name */
        private ij.c<c3> f264795y7;

        /* JADX INFO: renamed from: y8, reason: collision with root package name */
        private ij.c<com.planner5d.library.activity.tutorial.p> f264796y8;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        private ij.c<com.planner5d.library.userimporteddata.n> f264797z;

        /* JADX INFO: renamed from: z0, reason: collision with root package name */
        private ij.c<com.planner5d.library.model.converter.json.to.o> f264798z0;

        /* JADX INFO: renamed from: z1, reason: collision with root package name */
        private ij.c<com.planner5d.library.model.payments.paymentmethod.e> f264799z1;

        /* JADX INFO: renamed from: z2, reason: collision with root package name */
        private ij.c<com.planner5d.library.activity.helper.b0> f264800z2;

        /* JADX INFO: renamed from: z3, reason: collision with root package name */
        private ij.c<com.planner5d.library.services.utility.f2> f264801z3;

        /* JADX INFO: renamed from: z4, reason: collision with root package name */
        private ij.c<com.planner5d.library.activity.fragment.startup.e> f264802z4;

        /* JADX INFO: renamed from: z5, reason: collision with root package name */
        private ij.c<com.planner5d.library.widget.editor.popup.itemproperties.v> f264803z5;

        /* JADX INFO: renamed from: z6, reason: collision with root package name */
        private ij.c<com.planner5d.library.smartwizard.interactor.e> f264804z6;

        /* JADX INFO: renamed from: z7, reason: collision with root package name */
        private ij.c<com.planner5d.library.widget.editor.catalog.g> f264805z7;

        /* JADX INFO: renamed from: z8, reason: collision with root package name */
        private ij.c<s1> f264806z8;

        private AuthenticationSignInEnterCode A3(AuthenticationSignInEnterCode authenticationSignInEnterCode) {
            com.planner5d.library.activity.fragment.dialog.authentication.onelink.x.b(authenticationSignInEnterCode, this.f264731s3.get());
            return authenticationSignInEnterCode;
        }

        private SnapshotPager A4(SnapshotPager snapshotPager) {
            com.planner5d.library.activity.fragment.snapshots.m0.j(snapshotPager, this.A2.get());
            com.planner5d.library.activity.fragment.snapshots.m0.k(snapshotPager, e5());
            com.planner5d.library.activity.fragment.snapshots.m0.d(snapshotPager, this.f264790y2.get());
            com.planner5d.library.activity.fragment.snapshots.m0.g(snapshotPager, this.P0.get());
            com.planner5d.library.activity.fragment.snapshots.m0.c(snapshotPager, this.f264600f2.get());
            com.planner5d.library.activity.fragment.snapshots.m0.i(snapshotPager, g5());
            com.planner5d.library.activity.fragment.snapshots.m0.e(snapshotPager, p3());
            com.planner5d.library.activity.fragment.snapshots.m0.l(snapshotPager, f5());
            com.planner5d.library.activity.fragment.snapshots.m0.m(snapshotPager, this.f264747u.get());
            com.planner5d.library.activity.fragment.snapshots.m0.h(snapshotPager, this.f264740t2.get());
            com.planner5d.library.activity.fragment.snapshots.m0.b(snapshotPager, this.f264547a);
            return snapshotPager;
        }

        private com.planner5d.library.widget.editor.catalog.drawer.p B3(com.planner5d.library.widget.editor.catalog.drawer.p pVar) {
            com.planner5d.library.widget.editor.catalog.drawer.t.e(pVar, this.U3.get());
            com.planner5d.library.widget.editor.catalog.drawer.t.g(pVar, this.X2.get());
            com.planner5d.library.widget.editor.catalog.drawer.t.d(pVar, this.f264600f2.get());
            com.planner5d.library.widget.editor.catalog.drawer.t.b(pVar, H2());
            com.planner5d.library.widget.editor.catalog.drawer.t.h(pVar, G2());
            com.planner5d.library.widget.editor.catalog.drawer.t.c(pVar, t());
            return pVar;
        }

        private SnapshotSetupComplete B4(SnapshotSetupComplete snapshotSetupComplete) {
            com.planner5d.library.activity.fragment.dialog.message.m.c(snapshotSetupComplete, this.R0.get());
            com.planner5d.library.activity.fragment.dialog.message.m.d(snapshotSetupComplete, this.f264712q4.get());
            return snapshotSetupComplete;
        }

        private com.planner5d.library.widget.editor.catalog.z C3(com.planner5d.library.widget.editor.catalog.z zVar) {
            com.planner5d.library.widget.editor.catalog.a0.c(zVar, this.U3.get());
            com.planner5d.library.widget.editor.catalog.a0.b(zVar, t());
            return zVar;
        }

        private SnapshotSetupDialog C4(SnapshotSetupDialog snapshotSetupDialog) {
            com.planner5d.library.activity.fragment.dialog.snapshots.m.e(snapshotSetupDialog, this.A1.get());
            com.planner5d.library.activity.fragment.dialog.snapshots.m.d(snapshotSetupDialog, this.P0.get());
            com.planner5d.library.activity.fragment.dialog.snapshots.m.b(snapshotSetupDialog, this.f264600f2.get());
            return snapshotSetupDialog;
        }

        private ChooseRoomShape D3(ChooseRoomShape chooseRoomShape) {
            com.planner5d.library.activity.fragment.smartwizard.k.b(chooseRoomShape, S2());
            return chooseRoomShape;
        }

        private Snapshots D4(Snapshots snapshots) {
            com.planner5d.library.activity.fragment.snapshots.e1.c(snapshots, h5());
            com.planner5d.library.activity.fragment.snapshots.e1.g(snapshots, f5());
            com.planner5d.library.activity.fragment.snapshots.e1.d(snapshots, this.f264600f2.get());
            com.planner5d.library.activity.fragment.snapshots.e1.b(snapshots, this.f264555a7.get());
            com.planner5d.library.activity.fragment.snapshots.e1.f(snapshots, this.P0.get());
            return snapshots;
        }

        private ua.a E2() {
            return new ua.a(J4());
        }

        private ChooseRoomStyle E3(ChooseRoomStyle chooseRoomStyle) {
            com.planner5d.library.activity.fragment.projects.f.e(chooseRoomStyle, m0());
            com.planner5d.library.activity.fragment.projects.f.b(chooseRoomStyle, Q2());
            com.planner5d.library.activity.fragment.projects.f.c(chooseRoomStyle, S2());
            com.planner5d.library.activity.fragment.smartwizard.roomstyle.p.d(chooseRoomStyle, dagger.internal.g.a(this.f264589e1));
            com.planner5d.library.activity.fragment.smartwizard.roomstyle.p.e(chooseRoomStyle, dagger.internal.g.a(this.D4));
            com.planner5d.library.activity.fragment.smartwizard.roomstyle.p.b(chooseRoomStyle, this.G0.get());
            return chooseRoomStyle;
        }

        private StartupFragment E4(StartupFragment startupFragment) {
            com.planner5d.library.activity.fragment.startup.q.b(startupFragment, this.f264600f2.get());
            com.planner5d.library.activity.fragment.startup.q.c(startupFragment, this.f264655k7.get());
            com.planner5d.library.activity.fragment.startup.q.d(startupFragment, this.f264665l7.get());
            com.planner5d.library.activity.fragment.startup.q.i(startupFragment, this.f264675m7.get());
            com.planner5d.library.activity.fragment.startup.q.f(startupFragment, this.A7.get());
            com.planner5d.library.activity.fragment.startup.q.g(startupFragment, L4());
            com.planner5d.library.activity.fragment.startup.q.h(startupFragment, this.f264792y4.get());
            return startupFragment;
        }

        private com.planner5d.library.widget.editor.editor3dcardboard.g F2() {
            return new com.planner5d.library.widget.editor.editor3dcardboard.g(com.planner5d.library.application.b0.c(this.f264577d), o3(), this.L.get());
        }

        private ComparePlansFragment F3(ComparePlansFragment comparePlansFragment) {
            com.planner5d.library.activity.fragment.compareplans.f.d(comparePlansFragment, this.X2.get());
            com.planner5d.library.activity.fragment.compareplans.f.b(comparePlansFragment, this.f264600f2.get());
            com.planner5d.library.activity.fragment.compareplans.f.f(comparePlansFragment, this.A1.get());
            com.planner5d.library.activity.fragment.compareplans.f.e(comparePlansFragment, this.f264747u.get());
            return comparePlansFragment;
        }

        private StartupPaywall F4(StartupPaywall startupPaywall) {
            com.planner5d.library.activity.fragment.startup.t.f(startupPaywall, this.P0.get());
            com.planner5d.library.activity.fragment.startup.t.h(startupPaywall, n2());
            com.planner5d.library.activity.fragment.startup.t.g(startupPaywall, this.X2.get());
            com.planner5d.library.activity.fragment.startup.t.b(startupPaywall, com.planner5d.library.application.b0.c(this.f264577d));
            com.planner5d.library.activity.fragment.startup.t.c(startupPaywall, this.f264721r3.get());
            com.planner5d.library.activity.fragment.startup.t.d(startupPaywall, this.f264669m1.get());
            return startupPaywall;
        }

        private com.planner5d.library.widget.editor.catalog.drawer.r G2() {
            return new com.planner5d.library.widget.editor.catalog.drawer.r(this.f264605f7.get(), this.f264805z7.get(), N4(), this.f264669m1.get(), this.f264679n1.get(), this.A1.get(), this.T2.get(), this.f264747u.get());
        }

        private DecoratorFragment G3(DecoratorFragment decoratorFragment) {
            com.planner5d.library.activity.fragment.projects.f.e(decoratorFragment, m0());
            com.planner5d.library.activity.fragment.projects.f.b(decoratorFragment, Q2());
            com.planner5d.library.activity.fragment.projects.f.c(decoratorFragment, S2());
            com.planner5d.library.activity.fragment.smartwizard.decorator.j.c(decoratorFragment, dagger.internal.g.a(this.f264589e1));
            return decoratorFragment;
        }

        private com.planner5d.library.widget.tab.b G4(com.planner5d.library.widget.tab.b bVar) {
            com.planner5d.library.widget.tab.c.c(bVar, this.f264712q4.get());
            return bVar;
        }

        private com.planner5d.library.widget.editor.catalog.v.c H2() {
            return new com.planner5d.library.widget.editor.catalog.v.c(this.f264795y7.get(), this.f264805z7.get(), N4(), this.f264759v1.get(), this.f264669m1.get());
        }

        private Dimensions H3(Dimensions dimensions) {
            com.planner5d.library.activity.fragment.smartwizard.k.b(dimensions, S2());
            com.planner5d.library.activity.fragment.smartwizard.dimensions.v.b(dimensions, P2());
            com.planner5d.library.activity.fragment.smartwizard.dimensions.v.c(dimensions, this.f264696o8.get());
            com.planner5d.library.activity.fragment.smartwizard.dimensions.v.d(dimensions, this.L.get());
            return dimensions;
        }

        private UserMessage H4(UserMessage userMessage) {
            com.planner5d.library.activity.fragment.dialog.message.o.b(userMessage, this.f264777x.get());
            return userMessage;
        }

        private com.planner5d.library.contest.data.f I2() {
            return new com.planner5d.library.contest.data.f(R1(), this.R0.get(), com.planner5d.library.application.g3.c(this.f264577d));
        }

        private Documents I3(Documents documents) {
            com.planner5d.library.activity.fragment.spaces.documents.q.c(documents, this.f264600f2.get());
            com.planner5d.library.activity.fragment.spaces.documents.q.b(documents, this.f264555a7.get());
            com.planner5d.library.activity.fragment.spaces.documents.q.e(documents, this.P0.get());
            return documents;
        }

        private WishList I4(WishList wishList) {
            com.planner5d.library.activity.fragment.dialog.wishlist.e.b(wishList, this.f264757v.get());
            com.planner5d.library.activity.fragment.dialog.wishlist.e.f(wishList, this.f264585d7.get());
            com.planner5d.library.activity.fragment.dialog.wishlist.e.d(wishList, this.X.get());
            com.planner5d.library.activity.fragment.dialog.wishlist.e.e(wishList, this.f264800z2.get());
            com.planner5d.library.activity.fragment.dialog.wishlist.e.c(wishList, this.f264567c);
            com.planner5d.library.activity.fragment.dialog.wishlist.e.h(wishList, this.f264740t2.get());
            com.planner5d.library.activity.fragment.dialog.wishlist.e.j(wishList, w());
            com.planner5d.library.activity.fragment.dialog.wishlist.e.i(wishList, a5());
            return wishList;
        }

        private com.planner5d.library.interactor.a J2() {
            return new com.planner5d.library.interactor.a(K2(), this.f264547a, k2(), this.f264740t2.get(), this.A.get(), this.f264730s2.get());
        }

        private DownloadService J3(DownloadService downloadService) {
            com.planner5d.library.services.download.f.b(downloadService, dagger.internal.g.a(this.S));
            com.planner5d.library.services.download.f.c(downloadService, this.f264775w7.get());
            com.planner5d.library.services.download.f.e(downloadService, dagger.internal.g.a(this.f264559b1));
            return downloadService;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public u1 J4() {
            return com.planner5d.library.application.k0.c(this.f264577d, this.L.get());
        }

        private com.planner5d.library.model.manager.uploadplan.g K2() {
            return com.planner5d.library.application.v.c(this.f264577d, new com.planner5d.library.model.manager.uploadplan.d());
        }

        private com.planner5d.library.widget.editor.editor3dcardboard.l K3(com.planner5d.library.widget.editor.editor3dcardboard.l lVar) {
            com.planner5d.library.widget.editor.editor3dcardboard.r.x(lVar, this.f264720r2.get());
            com.planner5d.library.widget.editor.editor3dcardboard.r.b(lVar, this.f264547a);
            com.planner5d.library.widget.editor.editor3dcardboard.r.D(lVar, this.f264747u.get());
            com.planner5d.library.widget.editor.editor3dcardboard.r.f(lVar, this.f264567c);
            com.planner5d.library.widget.editor.editor3dcardboard.r.k(lVar, this.f264763v5.get());
            com.planner5d.library.widget.editor.editor3dcardboard.r.o(lVar, this.L.get());
            com.planner5d.library.widget.editor.editor3dcardboard.r.j(lVar, this.B8);
            com.planner5d.library.widget.editor.editor3dcardboard.r.l(lVar, o3());
            com.planner5d.library.widget.editor.editor3dcardboard.r.r(lVar, this.f264740t2.get());
            com.planner5d.library.widget.editor.editor3dcardboard.r.C(lVar, this.f264579d1.get());
            com.planner5d.library.widget.editor.editor3dcardboard.r.m(lVar, this.G0.get());
            com.planner5d.library.widget.editor.editor3dcardboard.r.u(lVar, y.c(this.f264617h));
            com.planner5d.library.widget.editor.editor3dcardboard.r.v(lVar, this.A.get());
            com.planner5d.library.widget.editor.editor3dcardboard.r.F(lVar, this.A1.get());
            com.planner5d.library.widget.editor.editor3dcardboard.r.B(lVar, this.f264780x2.get());
            com.planner5d.library.widget.editor.editor3dcardboard.r.n(lVar, U2());
            com.planner5d.library.widget.editor.editor3dcardboard.r.i(lVar, S2());
            com.planner5d.library.widget.editor.editor3dcardboard.r.e(lVar, this.f264759v1.get());
            com.planner5d.library.widget.editor.editor3dcardboard.r.A(lVar, n2());
            com.planner5d.library.widget.editor.editor3dcardboard.r.w(lVar, this.J3.get());
            com.planner5d.library.widget.editor.editor3dcardboard.r.d(lVar, F2());
            com.planner5d.library.widget.editor.editor3dcardboard.r.h(lVar, v.c(this.f264617h));
            com.planner5d.library.widget.editor.editor3dcardboard.r.z(lVar, d0.c(this.f264617h));
            com.planner5d.library.widget.editor.editor3dcardboard.r.p(lVar, z.c(this.f264617h));
            com.planner5d.library.widget.editor.editor3dcardboard.r.t(lVar, x.c(this.f264617h));
            com.planner5d.library.widget.editor.editor3dcardboard.r.s(lVar, w.c(this.f264617h));
            com.planner5d.library.widget.editor.editor3dcardboard.r.y(lVar, c0.c(this.f264617h));
            com.planner5d.library.widget.editor.editor3dcardboard.r.c(lVar, u.c(this.f264617h));
            com.planner5d.library.widget.editor.editor3dcardboard.r.g(lVar, this.E0.get());
            com.planner5d.library.widget.editor.editor3dcardboard.r.E(lVar, this.P7.get());
            return lVar;
        }

        private com.planner5d.library.services.utility.f2 K4() {
            return new com.planner5d.library.services.utility.f2(J4());
        }

        private le.a L2() {
            return com.planner5d.library.application.u.c(this.f264577d, J2());
        }

        private com.planner5d.library.widget.editor.editor3dcardboard.p L3(com.planner5d.library.widget.editor.editor3dcardboard.p pVar) {
            com.planner5d.library.widget.editor.editor3dcardboard.q.c(pVar, this.f264580d2.get());
            return pVar;
        }

        private com.planner5d.library.activity.fragment.startup.e L4() {
            return new com.planner5d.library.activity.fragment.startup.e(dagger.internal.g.a(this.f264747u), this.f264731s3.get(), n2());
        }

        private com.planner5d.library.model.manager.n M2() {
            return new com.planner5d.library.model.manager.n(this.R0.get(), dagger.internal.g.a(this.f264669m1));
        }

        private com.planner5d.library.widget.editor.editor3d.t M3(com.planner5d.library.widget.editor.editor3d.t tVar) {
            com.planner5d.library.widget.editor.editor3d.v.b(tVar, this.f264636i8);
            return tVar;
        }

        private com.planner5d.library.interactor.p M4() {
            return new com.planner5d.library.interactor.p(this.A1.get(), this.f264679n1.get(), this.f264605f7.get(), this.f264585d7.get(), this.f264759v1.get());
        }

        private com.planner5d.library.feed.view.holders.b N2() {
            return com.planner5d.library.application.designoftheday.b.c(this.f264627i, this.G0.get(), this.f264666l8.get(), X2());
        }

        private Editor3dFragment N3(Editor3dFragment editor3dFragment) {
            com.planner5d.library.activity.fragment.projects.f.e(editor3dFragment, m0());
            com.planner5d.library.activity.fragment.projects.f.b(editor3dFragment, Q2());
            com.planner5d.library.activity.fragment.projects.f.c(editor3dFragment, S2());
            return editor3dFragment;
        }

        private le.h N4() {
            return com.planner5d.library.application.c1.c(this.f264577d, M4());
        }

        private com.planner5d.library.activity.fragment.profile.a O2() {
            return new com.planner5d.library.activity.fragment.profile.a(this.M0.get(), com.planner5d.library.application.b0.c(this.f264577d));
        }

        private FeedAllArticlesFragment O3(FeedAllArticlesFragment feedAllArticlesFragment) {
            com.planner5d.library.activity.fragment.feed.k.c(feedAllArticlesFragment, Z2());
            com.planner5d.library.activity.fragment.feed.k.d(feedAllArticlesFragment, this.G0.get());
            com.planner5d.library.activity.fragment.feed.k.b(feedAllArticlesFragment, this.f264600f2.get());
            return feedAllArticlesFragment;
        }

        private com.planner5d.library.widget.editor.interactor.a O4() {
            return new com.planner5d.library.widget.editor.interactor.a(this.f264780x2.get(), this.f264720r2.get(), this.f264749u1.get());
        }

        private com.planner5d.library.widget.editor.editaction.f P2() {
            return new com.planner5d.library.widget.editor.editaction.f(this.f264757v.get());
        }

        private FeedArticleFragment P3(FeedArticleFragment feedArticleFragment) {
            com.planner5d.library.activity.fragment.feed.q.d(feedArticleFragment, this.A.get());
            com.planner5d.library.activity.fragment.feed.q.b(feedArticleFragment, this.f264547a);
            com.planner5d.library.activity.fragment.feed.q.e(feedArticleFragment, this.f264686n8.get());
            return feedArticleFragment;
        }

        private cf.a P4() {
            return com.planner5d.library.application.f1.c(this.f264577d, O4());
        }

        private com.planner5d.library.widget.editor.editor3d.l Q2() {
            return new com.planner5d.library.widget.editor.editor3d.l(this.f264547a, this.f264763v5.get(), this.L.get(), this.f264740t2.get(), this.f264579d1.get(), this.G0.get(), y.c(this.f264617h), this.A.get(), t(), v.c(this.f264617h), d0.c(this.f264617h), z.c(this.f264617h), x.c(this.f264617h), w.c(this.f264617h), u.c(this.f264617h), this.E0.get(), b0.c(this.f264617h), c0.c(this.f264617h), this.P7.get());
        }

        private FeedFragment Q3(FeedFragment feedFragment) {
            com.planner5d.library.activity.fragment.feed.k0.b(feedFragment, this.f264555a7.get());
            com.planner5d.library.activity.fragment.feed.k0.i(feedFragment, this.A.get());
            com.planner5d.library.activity.fragment.feed.k0.h(feedFragment, this.f264740t2.get());
            com.planner5d.library.activity.fragment.feed.k0.d(feedFragment, this.f264600f2.get());
            com.planner5d.library.activity.fragment.feed.k0.e(feedFragment, Y2());
            com.planner5d.library.activity.fragment.feed.k0.j(feedFragment, com.planner5d.library.uploadplan.application.e.c());
            com.planner5d.library.activity.fragment.feed.k0.f(feedFragment, this.f264669m1.get());
            com.planner5d.library.activity.fragment.feed.k0.c(feedFragment, this.f264749u1.get());
            return feedFragment;
        }

        private com.planner5d.library.activity.fragment.dialog.purchase.t Q4() {
            return j1.c(this.f264577d, this.X2.get());
        }

        private com.planner5d.library.widget.editor.editor3d.t R2() {
            return M3(com.planner5d.library.widget.editor.editor3d.u.c());
        }

        private com.planner5d.library.widget.editor.popup.floors.f R3(com.planner5d.library.widget.editor.popup.floors.f fVar) {
            com.planner5d.library.widget.editor.popup.floors.h.b(fVar, this.f264600f2.get());
            return fVar;
        }

        private ka.b R4() {
            return com.planner5d.library.application.n1.c(this.f264577d, S4());
        }

        private com.planner5d.library.widget.editor.facade.s S2() {
            return new com.planner5d.library.widget.editor.facade.s(this.f264780x2.get(), this.f264720r2.get(), this.f264747u.get(), o3(), U2(), this.E7.get(), new com.planner5d.library.widget.editor.helper.q2(), this.L5.get(), this.f264757v.get(), this.f264797z.get(), this.f264585d7.get());
        }

        private FolderEdit S3(FolderEdit folderEdit) {
            com.planner5d.library.activity.fragment.dialog.titleedit.a.c(folderEdit, this.f264790y2.get());
            com.planner5d.library.activity.fragment.dialog.titleedit.a.e(folderEdit, this.f264747u.get());
            com.planner5d.library.activity.fragment.dialog.titleedit.a.b(folderEdit, com.planner5d.library.application.b0.c(this.f264577d));
            return folderEdit;
        }

        private com.planner5d.library.activity.fragment.feed.interactor.e S4() {
            return new com.planner5d.library.activity.fragment.feed.interactor.e(J4(), b3(), this.T5.get());
        }

        private com.planner5d.library.widget.editor.menu.j T2() {
            return new com.planner5d.library.widget.editor.menu.j(this.f264747u.get(), this.f264720r2.get(), this.f264740t2.get(), this.P0.get(), this.R0.get(), this.f264600f2.get(), this.f264567c, com.planner5d.library.application.b0.c(this.f264577d), this.f264669m1.get(), this.X.get(), W2(), this.G0.get());
        }

        private FolderSelection T3(FolderSelection folderSelection) {
            com.planner5d.library.activity.fragment.dialog.q.b(folderSelection, this.f264790y2.get());
            com.planner5d.library.activity.fragment.dialog.q.e(folderSelection, dagger.internal.g.a(this.f264720r2));
            com.planner5d.library.activity.fragment.dialog.q.f(folderSelection, dagger.internal.g.a(this.A2));
            com.planner5d.library.activity.fragment.dialog.q.g(folderSelection, dagger.internal.g.a(this.f264747u));
            com.planner5d.library.activity.fragment.dialog.q.c(folderSelection, this.X.get());
            return folderSelection;
        }

        private com.planner5d.library.interactor.f0 T4() {
            return new com.planner5d.library.interactor.f0(this.f264720r2.get(), R1(), this.f264780x2.get(), p3());
        }

        private com.planner5d.library.widget.editor.facade.c0 U2() {
            return new com.planner5d.library.widget.editor.facade.c0(this.L5.get(), this.f264757v.get(), this.f264763v5.get(), this.f264740t2.get(), this.L.get(), this.D7.get(), this.f264805z7.get());
        }

        private Gallery U3(Gallery gallery) {
            com.planner5d.library.activity.fragment.gallery.n0.c(gallery, this.f264740t2.get());
            return gallery;
        }

        private le.k U4() {
            return p1.c(this.f264577d, T4());
        }

        private com.planner5d.library.activity.fragment.smartwizard.roomstyle.interactor.a V2() {
            return new com.planner5d.library.activity.fragment.smartwizard.roomstyle.interactor.a(k2(), this.f264557b, this.f264759v1.get(), this.f264740t2.get(), this.f264747u.get());
        }

        private GalleryPage V3(GalleryPage galleryPage) {
            com.planner5d.library.activity.fragment.gallery.z.h(galleryPage, this.M2.get());
            com.planner5d.library.activity.fragment.gallery.z.g(galleryPage, this.G0.get());
            com.planner5d.library.activity.fragment.gallery.z.c(galleryPage, this.f264757v.get());
            com.planner5d.library.activity.fragment.gallery.z.b(galleryPage, this.f264567c);
            com.planner5d.library.activity.fragment.gallery.z.f(galleryPage, a3());
            com.planner5d.library.activity.fragment.gallery.z.j(galleryPage, this.f264740t2.get());
            com.planner5d.library.activity.fragment.gallery.z.d(galleryPage, this.f264623h5.get());
            com.planner5d.library.activity.fragment.gallery.z.e(galleryPage, this.L2.get());
            com.planner5d.library.activity.fragment.gallery.z.k(galleryPage, this.A.get());
            com.planner5d.library.activity.fragment.gallery.z.l(galleryPage, l5());
            return galleryPage;
        }

        private com.planner5d.library.smartwizard.data.c V4() {
            return new com.planner5d.library.smartwizard.data.c(this.f264557b, new com.planner5d.library.database.manager.a(), k2(), R1());
        }

        private pa.b W2() {
            return com.planner5d.library.application.x.c(this.f264577d, V2());
        }

        private GalleryPager W3(GalleryPager galleryPager) {
            com.planner5d.library.activity.fragment.gallery.m0.f(galleryPager, this.M2.get());
            com.planner5d.library.activity.fragment.gallery.m0.e(galleryPager, this.G0.get());
            com.planner5d.library.activity.fragment.gallery.m0.h(galleryPager, this.P0.get());
            com.planner5d.library.activity.fragment.gallery.m0.d(galleryPager, b3());
            com.planner5d.library.activity.fragment.gallery.m0.l(galleryPager, this.f264747u.get());
            com.planner5d.library.activity.fragment.gallery.m0.k(galleryPager, l5());
            com.planner5d.library.activity.fragment.gallery.m0.j(galleryPager, W4());
            com.planner5d.library.activity.fragment.gallery.m0.i(galleryPager, this.f264740t2.get());
            com.planner5d.library.activity.fragment.gallery.m0.b(galleryPager, this.f264623h5.get());
            com.planner5d.library.activity.fragment.gallery.m0.c(galleryPager, t());
            return galleryPager;
        }

        private com.planner5d.library.activity.fragment.gallery.p0 W4() {
            return new com.planner5d.library.activity.fragment.gallery.p0(this.G0.get(), this.A2.get(), this.f264740t2.get());
        }

        private kc.a X2() {
            return com.planner5d.library.application.designoftheday.c.c(this.f264627i, this.f264676m8.get());
        }

        private GalleryProjectFragment X3(GalleryProjectFragment galleryProjectFragment) {
            com.planner5d.library.activity.fragment.gallery.project.f.b(galleryProjectFragment, this.G0.get());
            com.planner5d.library.activity.fragment.gallery.project.f.d(galleryProjectFragment, this.f264712q4.get());
            return galleryProjectFragment;
        }

        private ka.c X4() {
            return com.planner5d.library.application.r1.c(this.f264577d, Y4());
        }

        private com.planner5d.library.activity.fragment.feed.holders.a Y2() {
            return new com.planner5d.library.activity.fragment.feed.holders.a(this.f264720r2.get(), this.G0.get(), this.f264777x.get(), this.D7.get(), N2(), this.f264770w2.get());
        }

        private com.planner5d.library.activity.helper.f1 Y3(com.planner5d.library.activity.helper.f1 f1Var) {
            com.planner5d.library.activity.helper.j1.d(f1Var, this.A2.get());
            com.planner5d.library.activity.helper.j1.e(f1Var, this.f264747u.get());
            com.planner5d.library.activity.helper.j1.f(f1Var, this.A1.get());
            com.planner5d.library.activity.helper.j1.c(f1Var, this.f264740t2.get());
            return f1Var;
        }

        private com.planner5d.library.activity.fragment.feed.interactor.g Y4() {
            return new com.planner5d.library.activity.fragment.feed.interactor.g(J4(), this.T5.get());
        }

        private com.planner5d.library.activity.fragment.feed.e1 Z2() {
            return new com.planner5d.library.activity.fragment.feed.e1(this.f264547a, this.R0.get(), this.P0.get(), this.f264770w2.get(), this.f264740t2.get(), this.f264732s4.get(), this.A.get(), this.L.get(), this.f264669m1.get(), I2(), this.f264780x2.get(), this.f264712q4.get(), k0.c(), n2(), d5(), this.S5.get(), c3(), com.planner5d.library.uploadplan.application.e.c(), this.f264730s2.get(), q3(), s(), this.f264790y2.get(), this.A1.get(), this.f264720r2.get(), this.f264747u.get(), d3(), this.f264564b6.get(), this.f264567c, this.f264721r3.get());
        }

        private ImproveSnapshotWithAi Z3(ImproveSnapshotWithAi improveSnapshotWithAi) {
            com.planner5d.library.activity.fragment.snapshots.j.e(improveSnapshotWithAi, this.X2.get());
            com.planner5d.library.activity.fragment.snapshots.j.b(improveSnapshotWithAi, this.G0.get());
            com.planner5d.library.activity.fragment.snapshots.j.d(improveSnapshotWithAi, m0());
            return improveSnapshotWithAi;
        }

        private com.planner5d.library.interactor.h0 Z4() {
            return new com.planner5d.library.interactor.h0(this.f264800z2.get(), com.planner5d.library.application.b0.c(this.f264577d));
        }

        private com.planner5d.library.activity.fragment.gallery.c a3() {
            return new com.planner5d.library.activity.fragment.gallery.c(this.M2.get());
        }

        private ItemInfo a4(ItemInfo itemInfo) {
            com.planner5d.library.activity.fragment.dialog.iteminfo.f.b(itemInfo, this.G0.get());
            com.planner5d.library.activity.fragment.dialog.iteminfo.f.c(itemInfo, this.f264585d7.get());
            com.planner5d.library.activity.fragment.dialog.iteminfo.f.e(itemInfo, w());
            return itemInfo;
        }

        private le.l a5() {
            return e3.c(this.f264577d, Z4());
        }

        private com.planner5d.library.model.i b3() {
            return new com.planner5d.library.model.i(this.f264757v.get());
        }

        private LicenseCheck b4(LicenseCheck licenseCheck) {
            com.planner5d.library.activity.fragment.user.d.c(licenseCheck, this.f264656k8.get());
            com.planner5d.library.activity.fragment.user.d.e(licenseCheck, this.P0.get());
            com.planner5d.library.activity.fragment.user.d.f(licenseCheck, w());
            com.planner5d.library.activity.fragment.user.d.b(licenseCheck, this.f264721r3.get());
            return licenseCheck;
        }

        private com.planner5d.library.feed.usecase.b b5() {
            return com.planner5d.library.application.s1.c(this.f264577d, c5());
        }

        private com.planner5d.library.activity.fragment.projects.g c3() {
            return com.planner5d.library.uploadplan.application.d.c(this.f264692o4.get());
        }

        private Main c4(Main main) {
            com.planner5d.library.activity.i.j(main, this.M4.get());
            com.planner5d.library.activity.i.i(main, this.T2.get());
            com.planner5d.library.activity.i.d(main, this.f264600f2.get());
            com.planner5d.library.activity.i.n(main, this.R0.get());
            com.planner5d.library.activity.i.l(main, r3());
            com.planner5d.library.activity.i.f(main, this.N0.get());
            com.planner5d.library.activity.i.e(main, this.U0.get());
            com.planner5d.library.activity.i.c(main, this.C7.get());
            com.planner5d.library.activity.i.b(main, this.f264759v1.get());
            com.planner5d.library.activity.i.q(main, this.f264712q4.get());
            com.planner5d.library.activity.i.o(main, this.A7.get());
            com.planner5d.library.activity.i.h(main, this.f264756u8.get());
            com.planner5d.library.activity.i.g(main, this.f264624h6.get());
            com.planner5d.library.activity.i.k(main, this.f264766v8.get());
            com.planner5d.library.activity.i.p(main, this.f264622h4.get());
            return main;
        }

        private ic.a c5() {
            return new ic.a(this.Y5.get());
        }

        private com.planner5d.library.feed.usecase.a d3() {
            return com.planner5d.library.application.a0.c(this.f264577d, e3());
        }

        private MainCardboard d4(MainCardboard mainCardboard) {
            com.planner5d.library.activity.h.b(mainCardboard, this.f264600f2.get());
            com.planner5d.library.activity.h.c(mainCardboard, s3());
            return mainCardboard;
        }

        private ka.d d5() {
            return com.planner5d.library.application.t1.c(this.f264577d, this.Q5.get());
        }

        private com.planner5d.library.activity.fragment.feed.interactor.c e3() {
            return new com.planner5d.library.activity.fragment.feed.interactor.c(this.f264547a, this.M2.get(), X4(), R4(), b5(), n2(), this.f264564b6.get());
        }

        private ManageDataFragment e4(ManageDataFragment manageDataFragment) {
            com.planner5d.library.activity.fragment.profile.managedata.c.g(manageDataFragment, O2());
            com.planner5d.library.activity.fragment.profile.managedata.c.e(manageDataFragment, this.f264747u.get());
            com.planner5d.library.activity.fragment.profile.managedata.c.f(manageDataFragment, this.f264632i4.get());
            com.planner5d.library.activity.fragment.profile.managedata.c.d(manageDataFragment, this.f264740t2.get());
            com.planner5d.library.activity.fragment.profile.managedata.c.b(manageDataFragment, this.f264567c);
            return manageDataFragment;
        }

        private d4 e5() {
            return new d4(dagger.internal.g.a(this.A2), dagger.internal.g.a(this.f264747u), this.T0.get(), n2(), this.T1.get(), com.planner5d.library.application.b0.c(this.f264577d));
        }

        private com.planner5d.library.smartwizard.interactor.e f3() {
            return new com.planner5d.library.smartwizard.interactor.e(V4(), n5());
        }

        private MessageWithImageDialog f4(MessageWithImageDialog messageWithImageDialog) {
            com.planner5d.library.activity.fragment.dialog.message.f.d(messageWithImageDialog, this.G0.get());
            com.planner5d.library.activity.fragment.dialog.message.f.c(messageWithImageDialog, g3());
            com.planner5d.library.activity.fragment.dialog.message.f.b(messageWithImageDialog, com.planner5d.library.application.b0.c(this.f264577d));
            return messageWithImageDialog;
        }

        private com.planner5d.library.activity.fragment.snapshots.n0 f5() {
            return new com.planner5d.library.activity.fragment.snapshots.n0(this.f264747u.get(), this.A2.get(), this.f264669m1.get());
        }

        private com.planner5d.library.interactor.g g3() {
            return new com.planner5d.library.interactor.g(this.f264547a, k0.c(), this.f264762v4.get(), this.f264721r3.get(), this.R0.get(), this.M2.get(), c3(), this.P0.get(), this.f264792y4.get(), L4(), this.X2.get(), com.planner5d.library.application.c2.c(this.f264577d), this.A4.get(), A0(), T1(), com.planner5d.library.uploadplan.application.e.c(), this.f264747u.get(), t2.c(this.f264577d), this.f264600f2.get());
        }

        private OnboardingSignInDialog g4(OnboardingSignInDialog onboardingSignInDialog) {
            com.planner5d.library.activity.fragment.startup.d.c(onboardingSignInDialog, L4());
            return onboardingSignInDialog;
        }

        private com.planner5d.library.activity.fragment.snapshots.y0 g5() {
            return new com.planner5d.library.activity.fragment.snapshots.y0(this.A2.get());
        }

        private le.d h3() {
            return com.planner5d.library.application.c0.c(this.f264577d, g3());
        }

        private OrdersHistoryFragment h4(OrdersHistoryFragment ordersHistoryFragment) {
            com.planner5d.library.activity.fragment.profile.orders.g.c(ordersHistoryFragment, dagger.internal.g.a(this.f264747u));
            return ordersHistoryFragment;
        }

        private com.planner5d.library.activity.fragment.snapshots.c1 h5() {
            return new com.planner5d.library.activity.fragment.snapshots.c1(this.P0.get(), this.A2.get(), e5(), this.f264747u.get(), this.f264790y2.get(), this.f264600f2.get(), this.R0.get(), this.f264712q4.get(), this.f264749u1.get());
        }

        private com.planner5d.library.interactor.i i3() {
            return new com.planner5d.library.interactor.i(this.f264721r3.get(), h3(), this.f264740t2.get(), this.R0.get());
        }

        private PreloaderBoxView i4(PreloaderBoxView preloaderBoxView) {
            com.planner5d.library.widget.preloader.s.b(preloaderBoxView, this.X.get());
            com.planner5d.library.widget.preloader.s.d(preloaderBoxView, com.planner5d.library.application.m2.c(this.f264577d));
            return preloaderBoxView;
        }

        private com.planner5d.library.model.manager.payments.y i5() {
            return new com.planner5d.library.model.manager.payments.y(this.f264557b, this.T1.get(), this.B4.get(), J4(), m0(), this.A.get(), Q4(), A0());
        }

        private com.planner5d.library.widget.editor.helper.g1 j3() {
            return new com.planner5d.library.widget.editor.helper.g1(this.f264720r2.get(), this.H2.get(), this.P0.get(), this.f264780x2.get(), this.f264698p0.get(), this.f264747u.get(), this.f264600f2.get(), this.f264757v.get(), this.B7.get(), this.f264567c, this.f264740t2.get(), o3(), T2(), this.T2.get(), this.f264770w2.get(), this.R0.get(), this.A1.get(), this.f264792y4.get(), this.f264679n1.get(), this.C7.get(), U2(), l3(), this.L.get(), l0.c(), this.f264624h6.get(), S2(), k3(), this.G7.get(), this.X.get(), this.J3.get(), com.planner5d.library.application.g3.c(this.f264577d), t(), n3(), m3(), this.f264669m1.get(), this.Y.get(), this.Z.get());
        }

        private PremiumFeaturesDialog j4(PremiumFeaturesDialog premiumFeaturesDialog) {
            com.planner5d.library.activity.fragment.dialog.premiumfeature.d.b(premiumFeaturesDialog, this.f264600f2.get());
            com.planner5d.library.activity.fragment.dialog.premiumfeature.d.d(premiumFeaturesDialog, this.X2.get());
            return premiumFeaturesDialog;
        }

        private d5 j5() {
            return new d5(this.f264677n.get());
        }

        private r1 k3() {
            return new r1(n2(), j0.c(), this.R0.get(), this.f264720r2.get(), this.L.get(), this.f264600f2.get(), f3.c(this.f264577d), T1(), com.planner5d.library.application.b0.c(this.f264577d), this.X0.get());
        }

        private com.planner5d.library.activity.fragment.dialog.purchase.g k4(com.planner5d.library.activity.fragment.dialog.purchase.g gVar) {
            com.planner5d.library.activity.fragment.dialog.purchase.h.b(gVar, this.X.get());
            com.planner5d.library.activity.fragment.dialog.purchase.h.c(gVar, this.f264777x.get());
            return gVar;
        }

        private com.planner5d.library.interactor.n0 k5() {
            return new com.planner5d.library.interactor.n0(this.L2.get(), this.f264740t2.get());
        }

        private com.planner5d.library.widget.editor.helper.w1 l3() {
            return new com.planner5d.library.widget.editor.helper.w1(L2(), this.f264600f2.get(), com.planner5d.library.uploadplan.application.e.c(), this.L.get(), f3.c(this.f264577d));
        }

        private ProfileEditFragment l4(ProfileEditFragment profileEditFragment) {
            com.planner5d.library.activity.fragment.profile.edit.j.c(profileEditFragment, this.f264622h4.get());
            return profileEditFragment;
        }

        private le.o l5() {
            return l2.c(this.f264577d, k5());
        }

        private n2.a m3() {
            return new n2.a(this.f264740t2.get(), P4(), U4(), this.f264600f2.get(), this.R0.get(), this.f264749u1.get());
        }

        private ProfileFragment m4(ProfileFragment profileFragment) {
            com.planner5d.library.activity.fragment.profile.s.d(profileFragment, this.X2.get());
            com.planner5d.library.activity.fragment.profile.s.c(profileFragment, this.R0.get());
            return profileFragment;
        }

        private com.planner5d.library.smartwizard.interactor.g m5() {
            return new com.planner5d.library.smartwizard.interactor.g(this.f264557b, s1());
        }

        private u2 n3() {
            return new u2(this.f264669m1.get(), n2(), com.planner5d.library.application.b0.c(this.f264577d));
        }

        private Project2D n4(Project2D project2D) {
            com.planner5d.library.activity.fragment.projects.o.b(project2D, j3());
            com.planner5d.library.activity.fragment.projects.o.c(project2D, this.U3.get());
            com.planner5d.library.activity.fragment.projects.o.e(project2D, this.f264725r7.get());
            return project2D;
        }

        private ce.c n5() {
            return q0.c(this.f264597f, m5());
        }

        private com.planner5d.library.widget.editor.helper.n3 o3() {
            return new com.planner5d.library.widget.editor.helper.n3(this.f264720r2.get(), this.H2.get(), this.N2.get(), this.f264747u.get(), this.A1.get(), this.f264740t2.get(), this.f264567c);
        }

        private Project3D o4(Project3D project3D) {
            com.planner5d.library.activity.fragment.projects.q.b(project3D, R2());
            return project3D;
        }

        private com.planner5d.library.activity.helper.f1 p3() {
            return Y3(com.planner5d.library.activity.helper.i1.c());
        }

        private ProjectConflict p4(ProjectConflict projectConflict) {
            com.planner5d.library.activity.fragment.dialog.h0.e(projectConflict, this.H2.get());
            com.planner5d.library.activity.fragment.dialog.h0.c(projectConflict, o3());
            com.planner5d.library.activity.fragment.dialog.h0.f(projectConflict, this.f264780x2.get());
            com.planner5d.library.activity.fragment.dialog.h0.b(projectConflict, this.X.get());
            com.planner5d.library.activity.fragment.dialog.h0.g(projectConflict, this.f264747u.get());
            return projectConflict;
        }

        private com.planner5d.library.activity.fragment.projects.h q3() {
            return new com.planner5d.library.activity.fragment.projects.h(this.A1.get(), this.f264740t2.get(), this.f264567c, this.M4.get());
        }

        private ProjectRename q4(ProjectRename projectRename) {
            com.planner5d.library.activity.fragment.dialog.titleedit.b.d(projectRename, this.f264720r2.get());
            com.planner5d.library.activity.fragment.dialog.titleedit.b.e(projectRename, this.f264747u.get());
            com.planner5d.library.activity.fragment.dialog.titleedit.b.b(projectRename, com.planner5d.library.application.b0.c(this.f264577d));
            return projectRename;
        }

        private com.planner5d.library.model.manager.initialization.d<Main, e2, com.planner5d.library.activity.helper.f2> r3() {
            return new com.planner5d.library.model.manager.initialization.d<>(this.f264711q3.get(), dagger.internal.g.a(g2.a()), dagger.internal.g.a(this.f264776w8));
        }

        private ProjectSettingsBottomSheetDialog r4(ProjectSettingsBottomSheetDialog projectSettingsBottomSheetDialog) {
            com.planner5d.library.activity.fragment.dialog.projectsettings.q0.b(projectSettingsBottomSheetDialog, this.X.get());
            com.planner5d.library.activity.fragment.dialog.projectsettings.q0.d(projectSettingsBottomSheetDialog, this.R0.get());
            return projectSettingsBottomSheetDialog;
        }

        private com.planner5d.library.model.manager.initialization.d<MainCardboard, b2, com.planner5d.library.activity.helper.b<MainCardboard>> s3() {
            return new com.planner5d.library.model.manager.initialization.d<>(this.f264711q3.get(), dagger.internal.g.a(com.planner5d.library.activity.helper.c.a()), dagger.internal.g.a(this.A8));
        }

        private Projects s4(Projects projects) {
            com.planner5d.library.activity.fragment.projects.y0.d(projects, this.f264600f2.get());
            com.planner5d.library.activity.fragment.projects.y0.b(projects, this.f264555a7.get());
            com.planner5d.library.activity.fragment.projects.y0.f(projects, this.P0.get());
            com.planner5d.library.activity.fragment.projects.y0.c(projects, this.f264759v1.get());
            return projects;
        }

        private void t3(com.planner5d.library.application.i iVar, gb.a aVar, com.planner5d.planner5d.b bVar, com.planner5d.library.application.designoftheday.a aVar2, u0 u0Var, q3 q3Var, n0 n0Var, f0 f0Var, com.planner5d.library.help.application.c cVar, r0 r0Var, t tVar, com.planner5d.library.legal.application.c cVar2, o4 o4Var, com.planner5d.library.spaces.application.c cVar3, com.planner5d.library.application.b bVar2, android.app.Application application, com.planner5d.library.application.d dVar, f6 f6Var) {
            this.f264657l = dagger.internal.k.a(application);
            dagger.internal.h hVarA = dagger.internal.k.a(bVar2);
            this.f264667m = hVarA;
            ij.c<SharedPreferences> cVarB = dagger.internal.g.b(com.planner5d.library.application.u1.a(iVar, hVarA));
            this.f264677n = cVarB;
            this.f264687o = dagger.internal.g.b(com.planner5d.library.model.manager.config.xml.b.a(cVarB));
            this.f264697p = com.planner5d.library.application.b0.a(iVar);
            this.f264707q = dagger.internal.k.a(dVar);
            this.f264717r = dagger.internal.g.b(com.planner5d.library.api.requests.b.a());
            dagger.internal.f fVar = new dagger.internal.f();
            this.f264727s = fVar;
            this.f264737t = com.planner5d.library.api.requests.d.a(this.f264717r, fVar);
            this.f264747u = new dagger.internal.f();
            this.f264757v = new dagger.internal.f();
            ij.c<com.planner5d.library.services.utility.w1> cVarB2 = dagger.internal.g.b(x1.a(this.f264657l));
            this.f264767w = cVarB2;
            this.f264777x = dagger.internal.g.b(com.planner5d.library.model.manager.p1.a(this.f264757v, cVarB2));
            this.f264787y = new dagger.internal.f();
            this.f264797z = dagger.internal.g.b(com.planner5d.library.userimporteddata.o.a());
            this.A = dagger.internal.g.b(d2.a());
            this.B = dagger.internal.g.b(com.planner5d.library.application.k2.a(iVar));
            k3 k3VarA = k3.a(iVar, this.f264747u);
            this.C = k3VarA;
            this.D = dagger.internal.g.b(com.planner5d.library.userimporteddata.h.a(this.f264737t, this.B, k3VarA));
            this.E = com.planner5d.library.application.p0.a(iVar);
            this.F = j.a(bVar, this.f264787y);
            this.G = com.planner5d.library.database.migration.s.a(com.planner5d.library.database.migration.c.a(), this.E, this.F);
            com.planner5d.library.application.p4 p4VarA = com.planner5d.library.application.p4.a(o4Var);
            this.H = p4VarA;
            com.planner5d.library.database.g gVarA = com.planner5d.library.database.g.a(this.f264657l, this.G, p4VarA);
            this.I = gVarA;
            ij.c<ApplicationDatabase> cVarB3 = dagger.internal.g.b(gb.b.a(aVar, gVarA));
            this.J = cVarB3;
            this.K = dagger.internal.g.b(com.planner5d.library.userimporteddata.c.a(cVarB3));
            dagger.internal.f fVar2 = new dagger.internal.f();
            this.L = fVar2;
            com.planner5d.library.application.k0 k0VarA = com.planner5d.library.application.k0.a(iVar, fVar2);
            this.M = k0VarA;
            this.N = dagger.internal.g.b(com.planner5d.library.userimporteddata.j.a(this.f264657l, this.f264797z, this.A, this.D, this.K, this.B, k0VarA));
            this.O = dagger.internal.g.b(com.planner5d.library.services.a0.a(this.f264657l));
            this.P = dagger.internal.g.b(com.planner5d.library.services.utility.j1.a(this.f264657l));
            this.Q = com.planner5d.library.application.s2.a(iVar);
            this.R = dagger.internal.g.b(q1.a(iVar));
            dagger.internal.f fVar3 = new dagger.internal.f();
            this.S = fVar3;
            ij.c<com.planner5d.library.services.backgroundexecutor.g> cVarB4 = dagger.internal.g.b(com.planner5d.library.services.backgroundexecutor.h.a(this.f264657l, fVar3));
            this.T = cVarB4;
            ij.c<com.planner5d.library.services.filedownloader.c> cVarB5 = dagger.internal.g.b(com.planner5d.library.services.filedownloader.d.a(this.f264657l, this.A, this.P, this.Q, this.R, cVarB4));
            this.U = cVarB5;
            this.V = dagger.internal.g.b(com.planner5d.library.userimporteddata.m.a(this.O, cVarB5));
            ij.c<com.planner5d.library.services.utility.p0.a> cVarB6 = dagger.internal.g.b(o2.a(iVar, this.L));
            this.W = cVarB6;
            ij.c<com.planner5d.library.services.utility.p0> cVarB7 = dagger.internal.g.b(com.planner5d.library.services.utility.b1.a(this.f264767w, cVarB6, this.M));
            this.X = cVarB7;
            ij.c<com.planner5d.library.model.converter.json.from.x> cVarB8 = dagger.internal.g.b(com.planner5d.library.model.converter.json.from.y.a(cVarB7));
            this.Y = cVarB8;
            ij.c<com.planner5d.library.model.converter.json.from.z> cVarB9 = dagger.internal.g.b(com.planner5d.library.model.converter.json.from.a0.a(cVarB8, this.X));
            this.Z = cVarB9;
            ij.c<com.planner5d.library.model.converter.json.from.c0> cVarB10 = dagger.internal.g.b(com.planner5d.library.model.converter.json.from.d0.a(this.X, cVarB9));
            this.f264548a0 = cVarB10;
            ij.c<dd.a> cVarB11 = dagger.internal.g.b(dd.b.a(this.N, this.V, this.X, cVarB10, this.M));
            this.f264558b0 = cVarB11;
            this.f264568c0 = com.planner5d.library.model.converter.json.from.b.a(this.f264757v, cVarB11);
            this.f264578d0 = dagger.internal.g.b(com.planner5d.library.model.converter.json.from.p.a(this.Z));
            this.f264588e0 = dagger.internal.g.b(com.planner5d.library.model.converter.json.from.i.a(this.Z, this.Y));
            this.f264598f0 = dagger.internal.g.b(com.planner5d.library.model.converter.json.from.t.a(this.Z, this.Y, this.f264757v));
            this.f264608g0 = dagger.internal.g.b(com.planner5d.library.model.converter.json.from.n.a(this.Z));
            this.f264618h0 = dagger.internal.g.b(com.planner5d.library.model.converter.json.from.k.a(this.Z, this.f264757v, this.f264797z, this.f264707q));
            ij.c<com.planner5d.library.model.converter.json.from.u> cVarB12 = dagger.internal.g.b(com.planner5d.library.model.converter.json.from.v.a());
            this.f264628i0 = cVarB12;
            this.f264638j0 = dagger.internal.g.b(com.planner5d.library.model.converter.json.from.g.a(this.f264578d0, this.f264588e0, this.f264598f0, this.f264608g0, this.f264618h0, cVarB12));
            ij.c cVarB13 = dagger.internal.g.b(com.planner5d.library.model.manager.builtin.s.a());
            this.f264648k0 = cVarB13;
            ij.c<com.planner5d.library.model.manager.builtin.i> cVar4 = this.f264757v;
            this.f264658l0 = dagger.internal.g.b(com.planner5d.library.model.manager.builtin.v.a(cVar4, this.f264707q, cVar4, this.f264777x, this.f264667m, cVarB13));
            ij.c<com.planner5d.library.model.converter.json.from.c> cVarB14 = dagger.internal.g.b(com.planner5d.library.model.converter.json.from.d.a(this.X));
            this.f264668m0 = cVarB14;
            this.f264678n0 = dagger.internal.g.b(com.planner5d.library.model.manager.builtin.q0.a(this.f264757v, this.f264568c0, this.f264548a0, this.f264638j0, this.L, this.X, this.f264658l0, cVarB14));
            this.f264688o0 = dagger.internal.g.b(com.planner5d.library.model.manager.builtin.a0.a(this.f264757v, this.f264658l0, this.f264667m, this.f264777x));
            this.f264698p0 = dagger.internal.g.b(ItemBuilder_Factory.create(this.f264757v, this.L));
            ij.c<com.planner5d.library.model.converter.json.to.w> cVarB15 = dagger.internal.g.b(com.planner5d.library.model.converter.json.to.x.a(this.X));
            this.f264708q0 = cVarB15;
            ij.c<com.planner5d.library.model.converter.json.to.z> cVarB16 = dagger.internal.g.b(com.planner5d.library.model.converter.json.to.a0.a(cVarB15));
            this.f264718r0 = cVarB16;
            this.f264728s0 = dagger.internal.g.b(com.planner5d.library.model.converter.json.to.n.a(cVarB16));
            this.f264738t0 = dagger.internal.g.b(com.planner5d.library.model.converter.json.to.i.a(this.f264718r0, this.f264757v));
            this.f264748u0 = dagger.internal.g.b(com.planner5d.library.model.converter.json.to.e.a(this.f264718r0));
            this.f264758v0 = dagger.internal.g.b(com.planner5d.library.model.converter.json.to.s.a(this.f264718r0));
            this.f264768w0 = dagger.internal.g.b(com.planner5d.library.model.converter.json.to.l.a(this.f264718r0));
            ij.c<com.planner5d.library.model.converter.json.to.t> cVarB17 = dagger.internal.g.b(com.planner5d.library.model.converter.json.to.u.a());
            this.f264778x0 = cVarB17;
            ij.c<com.planner5d.library.model.converter.json.to.b> cVarB18 = dagger.internal.g.b(com.planner5d.library.model.converter.json.to.c.a(this.f264728s0, this.f264738t0, this.f264748u0, this.f264758v0, this.f264768w0, cVarB17));
            this.f264788y0 = cVarB18;
            this.f264798z0 = dagger.internal.g.b(com.planner5d.library.model.converter.json.to.p.a(this.X, cVarB18));
            this.A0 = new dagger.internal.f();
            ij.c<com.planner5d.library.services.bitmaploader.cache.a> cVarB19 = dagger.internal.g.b(com.planner5d.library.application.l.a(iVar));
            this.B0 = cVarB19;
            ij.c<com.planner5d.library.services.bitmaploader.background.b> cVarB20 = dagger.internal.g.b(com.planner5d.library.services.bitmaploader.background.c.a(this.f264657l, cVarB19, this.T));
            this.C0 = cVarB20;
            this.D0 = dagger.internal.g.b(com.planner5d.library.services.bitmaploader.h.a(this.f264657l, cVarB20, this.B0, this.A, this.P, this.Q));
            dagger.internal.f fVar4 = new dagger.internal.f();
            this.E0 = fVar4;
            ij.c<com.planner5d.library.model.manager.w0> cVarB21 = dagger.internal.g.b(com.planner5d.library.model.manager.x0.a(fVar4, this.D0));
            this.F0 = cVarB21;
            this.G0 = dagger.internal.g.b(com.planner5d.library.model.manager.z0.a(this.D0, cVarB21));
            com.planner5d.library.model.s sVarA = com.planner5d.library.model.s.a(this.X);
            this.H0 = sVarA;
            this.I0 = com.planner5d.library.model.manager.builtin.materialsmetadataloading.e.a(this.f264657l, this.Q, this.A, this.P, this.O, sVarA);
            com.planner5d.library.model.manager.builtin.materialsmetadataloading.c cVarA = com.planner5d.library.model.manager.builtin.materialsmetadataloading.c.a(this.f264657l, this.Q, this.A, this.P, this.O);
            this.J0 = cVarA;
            this.K0 = dagger.internal.g.b(com.planner5d.library.model.manager.builtin.x0.a(this.f264667m, this.f264787y, this.L, this.A, this.O, this.G0, this.f264757v, this.E0, this.I0, cVarA));
            this.L0 = new dagger.internal.f();
            this.M0 = new dagger.internal.f();
            this.N0 = new dagger.internal.f();
            this.O0 = new dagger.internal.f();
            this.P0 = dagger.internal.g.b(com.planner5d.library.application.n0.a(iVar));
            ij.c<com.planner5d.library.activity.fragment.j> cVarB22 = dagger.internal.g.b(com.planner5d.library.application.p.a(iVar));
            this.Q0 = cVarB22;
            this.R0 = dagger.internal.g.b(com.planner5d.library.activity.fragment.y.a(this.P0, cVarB22));
            ij.c<com.planner5d.library.model.manager.i> cVarB23 = dagger.internal.g.b(com.planner5d.library.model.manager.j.a(this.f264787y, this.L));
            this.S0 = cVarB23;
            this.T0 = dagger.internal.g.b(com.planner5d.library.services.render.c.a(this.f264667m, this.O0, this.R0, cVarB23, this.f264697p));
            this.U0 = new dagger.internal.f();
            this.V0 = dagger.internal.g.b(com.planner5d.library.services.upload.h.a());
            this.W0 = gb.f.a(aVar, this.J);
            this.X0 = dagger.internal.g.b(com.planner5d.library.activity.helper.s.a(this.O));
            gb.h hVarA2 = gb.h.a(aVar, this.J);
            this.Y0 = hVarA2;
            ij.c<com.planner5d.library.model.manager.spaces.b> cVarB24 = dagger.internal.g.b(com.planner5d.library.model.manager.spaces.c.a(this.X, this.f264787y, hVarA2, this.f264737t, this.C));
            this.Z0 = cVarB24;
            ij.c<com.planner5d.library.model.manager.spaces.documents.c> cVarB25 = dagger.internal.g.b(com.planner5d.library.model.manager.spaces.documents.f.a(this.f264657l, this.S0, this.U0, this.V0, this.W0, this.X0, this.f264697p, this.G0, cVarB24, this.f264737t, this.f264747u, this.X));
            this.f264549a1 = cVarB25;
            dagger.internal.f.b(this.U0, dagger.internal.g.b(com.planner5d.library.services.upload.b.a(this.f264667m, cVarB25, this.O0, this.R0, this.V0, this.f264697p, this.S0)));
            dagger.internal.f.b(this.O0, dagger.internal.g.b(com.planner5d.library.model.manager.k2.a(this.f264667m, this.N0, this.T0, this.U0)));
            ij.c<com.planner5d.library.services.download.d> cVarB26 = dagger.internal.g.b(com.planner5d.library.services.download.e.a());
            this.f264559b1 = cVarB26;
            dagger.internal.f.b(this.N0, dagger.internal.g.b(com.planner5d.library.services.download.b.a(this.f264667m, this.M0, this.O0, this.R0, cVarB26, this.f264697p, this.S0)));
            com.planner5d.library.services.utility.x xVarA = com.planner5d.library.services.utility.x.a(this.M, this.f264697p);
            this.f264569c1 = xVarA;
            this.f264579d1 = dagger.internal.g.b(l5.a(this.f264757v, this.G0, this.f264737t, this.f264747u, this.f264667m, this.f264707q, this.K0, this.E0, this.D0, this.L, xVarA));
        }

        private ProjectsPagesFragment t4(ProjectsPagesFragment projectsPagesFragment) {
            com.planner5d.library.activity.fragment.projects.i0.b(projectsPagesFragment, this.f264624h6.get());
            com.planner5d.library.activity.fragment.projects.i0.d(projectsPagesFragment, this.f264740t2.get());
            return projectsPagesFragment;
        }

        private void u3(com.planner5d.library.application.i iVar, gb.a aVar, com.planner5d.planner5d.b bVar, com.planner5d.library.application.designoftheday.a aVar2, u0 u0Var, q3 q3Var, n0 n0Var, f0 f0Var, com.planner5d.library.help.application.c cVar, r0 r0Var, t tVar, com.planner5d.library.legal.application.c cVar2, o4 o4Var, com.planner5d.library.spaces.application.c cVar3, com.planner5d.library.application.b bVar2, android.app.Application application, com.planner5d.library.application.d dVar, f6 f6Var) {
            ij.c<NetworkErrorUtility> cVarB = dagger.internal.g.b(NetworkErrorUtility_Factory.create(this.P));
            this.f264589e1 = cVarB;
            this.f264599f1 = dagger.internal.g.b(com.planner5d.library.model.manager.managedfiles.z.a(this.f264667m, this.U, this.L0, this.N0, this.L, this.f264579d1, this.K0, this.A, cVarB, this.P, this.S0, this.f264697p));
            this.f264609g1 = com.planner5d.library.application.m.a(iVar, this.f264757v);
            this.f264619h1 = com.planner5d.library.application.m1.a(iVar, this.f264707q);
            this.f264629i1 = com.planner5d.library.application.w0.a(iVar, this.f264707q);
            this.f264639j1 = com.planner5d.library.application.i0.a(iVar, this.f264707q);
            ij.c<com.planner5d.library.model.manager.unlockeditems.d> cVarB2 = dagger.internal.g.b(com.planner5d.library.model.manager.unlockeditems.e.a(this.f264787y));
            this.f264649k1 = cVarB2;
            this.f264659l1 = p2.a(iVar, cVarB2);
            dagger.internal.f fVar = new dagger.internal.f();
            this.f264669m1 = fVar;
            ij.c<com.planner5d.library.model.manager.unlockeditems.b> cVarB3 = dagger.internal.g.b(com.planner5d.library.model.manager.unlockeditems.c.a(this.f264787y, fVar, this.f264697p));
            this.f264679n1 = cVarB3;
            this.f264689o1 = com.planner5d.library.application.n2.a(iVar, cVarB3);
            this.f264699p1 = dagger.internal.g.b(sd.c.a(this.f264657l));
            ij.c<com.planner5d.library.model.manager.config.source.g> cVarB4 = dagger.internal.g.b(com.planner5d.library.model.manager.config.source.h.a(this.L));
            this.f264709q1 = cVarB4;
            this.f264719r1 = com.planner5d.library.model.manager.config.source.i.a(this.f264699p1, cVarB4);
            this.f264729s1 = dagger.internal.g.b(com.planner5d.library.model.manager.config.source.m.a(this.f264657l, this.f264737t, this.f264787y, this.L, this.C));
            this.f264739t1 = new dagger.internal.f();
            ij.c<com.planner5d.library.services.utility.t> cVarB5 = dagger.internal.g.b(com.planner5d.library.application.s.a(iVar));
            this.f264749u1 = cVarB5;
            ij.c<com.planner5d.library.model.manager.config.d> cVarB6 = dagger.internal.g.b(com.planner5d.library.model.manager.config.e.a(this.f264707q, this.f264719r1, this.f264729s1, this.f264739t1, this.f264669m1, cVarB5));
            this.f264759v1 = cVarB6;
            this.f264769w1 = dagger.internal.g.b(com.planner5d.library.application.o.a(iVar, cVarB6));
            com.planner5d.library.application.i1 i1VarA = com.planner5d.library.application.i1.a(iVar, this.f264707q);
            this.f264779x1 = i1VarA;
            ij.c<com.planner5d.library.model.payments.paymentmethod.g> cVarB7 = dagger.internal.g.b(com.planner5d.library.model.payments.paymentmethod.h.a(this.f264657l, i1VarA, this.f264697p, this.f264749u1));
            this.f264789y1 = cVarB7;
            this.f264799z1 = dagger.internal.g.b(com.planner5d.library.application.v0.a(iVar, this.f264629i1, cVarB7));
            dagger.internal.f fVar2 = new dagger.internal.f();
            this.A1 = fVar2;
            this.B1 = com.planner5d.library.application.w2.a(iVar, fVar2);
            dagger.internal.f fVar3 = new dagger.internal.f();
            this.C1 = fVar3;
            com.planner5d.library.application.u0 u0VarA = com.planner5d.library.application.u0.a(iVar, fVar3);
            this.D1 = u0VarA;
            this.E1 = dagger.internal.g.b(com.planner5d.library.model.payments.paymentmethod.j.a(this.B1, u0VarA));
            dagger.internal.f fVar4 = new dagger.internal.f();
            this.F1 = fVar4;
            this.G1 = dagger.internal.g.b(com.planner5d.library.application.f0.a(iVar, fVar4));
            this.H1 = dagger.internal.g.b(com.planner5d.library.model.manager.payments.f.a(this.f264657l, this.M));
            ij.c<a2> cVarB8 = dagger.internal.g.b(com.planner5d.library.application.q0.a(iVar));
            this.I1 = cVarB8;
            this.J1 = dagger.internal.g.b(com.planner5d.library.model.manager.payments.w.a(this.f264697p, this.f264749u1, cVarB8, this.C));
            this.K1 = dagger.internal.g.b(com.planner5d.library.model.region.i.a(this.f264657l));
            this.L1 = dagger.internal.g.b(com.planner5d.library.model.region.k.a(this.f264747u));
            this.M1 = dagger.internal.g.b(com.planner5d.library.model.region.g.a(this.f264657l));
            ij.c<com.planner5d.library.model.region.b> cVarB9 = dagger.internal.g.b(com.planner5d.library.model.region.c.a());
            this.N1 = cVarB9;
            ij.c<com.planner5d.library.services.e0> cVarB10 = dagger.internal.g.b(com.planner5d.library.application.o1.a(iVar, this.K1, this.L1, this.M1, cVarB9));
            this.O1 = cVarB10;
            ij.c<com.planner5d.library.model.manager.payments.r> cVarB11 = dagger.internal.g.b(com.planner5d.library.model.manager.payments.s.a(this.f264657l, this.f264749u1, this.f264737t, this.f264589e1, this.A, this.f264787y, this.G1, cVarB10, this.C));
            this.P1 = cVarB11;
            ij.c<com.planner5d.library.model.manager.payments.p> cVarB12 = dagger.internal.g.b(com.planner5d.library.model.manager.payments.q.a(this.f264657l, this.X, this.G1, this.M, this.f264589e1, this.H1, this.f264799z1, this.J1, cVarB11, this.B));
            this.Q1 = cVarB12;
            dagger.internal.f.b(this.C1, dagger.internal.g.b(com.planner5d.library.model.manager.payments.l.a(this.f264657l, this.f264769w1, this.X, this.f264799z1, this.E1, cVarB12, this.P1, this.A, this.H1, this.f264629i1, this.J1, this.C, this.f264737t, this.B1, this.M, this.f264697p)));
            this.R1 = dagger.internal.g.b(com.planner5d.library.modules.user.user.h0.a(this.f264697p, this.f264749u1, a3.a(), this.f264787y, this.C1, this.C));
            this.S1 = com.planner5d.library.application.m0.a(iVar, this.M0);
            ij.c<com.planner5d.library.model.manager.w> cVarB13 = dagger.internal.g.b(com.planner5d.library.application.y.a(iVar, this.f264669m1));
            this.T1 = cVarB13;
            dagger.internal.f.b(this.A1, dagger.internal.g.b(com.planner5d.library.modules.user.user.v0.a(this.f264787y, this.f264609g1, this.f264619h1, this.f264629i1, this.f264639j1, this.C, this.f264659l1, this.f264689o1, this.C1, this.Q1, this.R1, this.S1, cVarB13)));
            ij.c<com.planner5d.library.model.manager.l> cVarB14 = dagger.internal.g.b(com.planner5d.library.model.manager.m.a(this.J));
            this.U1 = cVarB14;
            ij.c<com.planner5d.library.model.manager.managedfiles.d> cVarB15 = dagger.internal.g.b(com.planner5d.library.model.manager.managedfiles.e.a(cVarB14));
            this.V1 = cVarB15;
            ij.c<com.planner5d.library.model.manager.managedfiles.t> cVarB16 = dagger.internal.g.b(com.planner5d.library.model.manager.managedfiles.u.a(cVarB15));
            this.W1 = cVarB16;
            this.X1 = com.planner5d.library.model.manager.managedfiles.s.a(this.f264667m, this.f264599f1, this.f264757v, this.f264747u, this.A1, this.E0, cVarB16, this.f264787y, this.F1, this.X, this.M0, this.L0, this.A0, this.f264579d1, this.A);
            this.Y1 = dagger.internal.g.b(com.planner5d.library.model.manager.initialization.y.a());
            dagger.internal.f fVar5 = new dagger.internal.f();
            this.Z1 = fVar5;
            this.f264550a2 = dagger.internal.g.b(com.planner5d.library.model.manager.initialization.c0.a(this.f264667m, this.f264787y, this.G0, this.f264757v, this.F1, this.f264669m1, fVar5));
            this.f264560b2 = dagger.internal.g.b(cd.d.a(this.f264657l));
            this.f264570c2 = f.a(bVar, this.f264747u, this.C1);
            dagger.internal.f fVar6 = new dagger.internal.f();
            this.f264580d2 = fVar6;
            h2 h2VarA = h2.a(iVar, fVar6);
            this.f264590e2 = h2VarA;
            this.f264600f2 = dagger.internal.g.b(com.planner5d.library.activity.fragment.dialog.m.a(h2VarA, this.M));
            ij.c<com.planner5d.library.contest.view.b0> cVarB17 = dagger.internal.g.b(com.planner5d.library.application.q.a(iVar, com.planner5d.library.activity.fragment.m.a()));
            this.f264610g2 = cVarB17;
            com.planner5d.library.contest.view.vote.b bVarA = com.planner5d.library.contest.view.vote.b.a(this.f264600f2, this.R0, cVarB17);
            this.f264620h2 = bVarA;
            ij.c<com.planner5d.library.model.manager.statistics.appsflyer.d> cVarB18 = dagger.internal.g.b(com.planner5d.planner5d.c.a(bVar, this.f264667m, bVarA, this.F1, this.L));
            this.f264630i2 = cVarB18;
            this.f264640j2 = dagger.internal.g.b(g.a(bVar, this.f264667m, this.f264570c2, cVarB18, this.L, this.F1, this.f264697p));
            this.f264650k2 = dagger.internal.g.b(com.planner5d.library.model.manager.statistics.debug.d.a());
            ij.c<com.planner5d.library.model.manager.statistics.customerio.c> cVarB19 = dagger.internal.g.b(e.a(bVar, this.f264667m, this.C, this.B1, this.O1, this.f264697p, this.f264749u1));
            this.f264660l2 = cVarB19;
            this.f264670m2 = dagger.internal.g.b(i.a(bVar, this.f264560b2, this.f264640j2, this.f264650k2, cVarB19, this.f264669m1));
            this.f264680n2 = dagger.internal.g.b(com.planner5d.library.application.d2.a(iVar));
            this.f264690o2 = com.planner5d.library.application.l1.a(iVar, this.f264580d2);
            com.planner5d.library.activity.fragment.dialog.a0 a0VarA = com.planner5d.library.activity.fragment.dialog.a0.a(this.f264600f2);
            this.f264700p2 = a0VarA;
            this.f264710q2 = com.planner5d.library.application.b1.a(iVar, a0VarA);
            this.f264720r2 = new dagger.internal.f();
            ij.c<ErrorMessageParser> cVarB20 = dagger.internal.g.b(ErrorMessageParser_Factory.create(this.f264657l, this.f264589e1));
            this.f264730s2 = cVarB20;
            this.f264740t2 = dagger.internal.g.b(com.planner5d.library.model.manager.d2.a(cVarB20));
            com.planner5d.library.application.g3 g3VarA = com.planner5d.library.application.g3.a(iVar);
            this.f264750u2 = g3VarA;
            com.planner5d.library.services.h0 h0VarA = com.planner5d.library.services.h0.a(this.f264720r2, this.f264697p, this.f264740t2, this.G0, g3VarA);
            this.f264760v2 = h0VarA;
            this.f264770w2 = dagger.internal.g.b(com.planner5d.library.model.manager.contest.i.a(this.f264737t, this.f264657l, this.X, this.f264787y, this.f264720r2, this.C, h0VarA));
            dagger.internal.f fVar7 = new dagger.internal.f();
            this.f264780x2 = fVar7;
            this.f264790y2 = dagger.internal.g.b(com.planner5d.library.model.manager.d0.a(this.f264667m, this.X, fVar7, this.f264569c1));
            this.f264800z2 = dagger.internal.g.b(com.planner5d.library.activity.helper.c0.a(this.f264569c1, this.O));
            dagger.internal.f fVar8 = new dagger.internal.f();
            this.A2 = fVar8;
            f4 f4VarA = f4.a(fVar8, this.f264747u, this.T0, this.f264787y, this.T1, this.f264697p);
            this.B2 = f4VarA;
            dagger.internal.f.b(this.A2, dagger.internal.g.b(g4.a(this.f264790y2, this.G0, this.f264720r2, this.X, this.f264798z0, this.f264780x2, this.f264800z2, this.f264667m, this.f264707q, this.f264747u, this.f264740t2, this.f264737t, this.f264730s2, this.R0, this.f264669m1, f4VarA, this.A)));
            e5 e5VarA = e5.a(this.f264677n);
            this.C2 = e5VarA;
            com.planner5d.library.model.manager.synchronization.e eVarA = com.planner5d.library.model.manager.synchronization.e.a(this.f264667m, this.f264770w2, this.f264790y2, this.L, this.f264720r2, this.f264787y, this.A2, e5VarA, this.f264737t);
            this.D2 = eVarA;
            dagger.internal.f.b(this.f264780x2, dagger.internal.g.b(com.planner5d.library.model.manager.synchronization.l.a(this.f264747u, eVarA)));
            this.E2 = dagger.internal.g.b(com.planner5d.library.model.converter.json.from.r.a(this.X, this.f264638j0, this.Y, this.f264568c0, this.f264740t2));
            this.F2 = com.planner5d.library.model.manager.project.d.a(this.G0, this.f264757v);
            h1 h1VarA = h1.a(iVar);
            this.G2 = h1VarA;
            ij.c<com.planner5d.library.model.manager.project.m0> cVarB21 = dagger.internal.g.b(com.planner5d.library.model.manager.project.n0.a(this.f264720r2, this.X, this.B, h1VarA));
            this.H2 = cVarB21;
            dagger.internal.f.b(this.f264720r2, dagger.internal.g.b(com.planner5d.library.model.manager.project.f0.a(this.f264780x2, this.X, this.f264798z0, this.E2, this.f264790y2, this.f264757v, this.L, this.f264800z2, this.f264667m, this.U1, this.F2, cVarB21, this.f264569c1)));
            com.planner5d.library.model.manager.favorite.d dVarA = com.planner5d.library.model.manager.favorite.d.a(this.f264787y, this.f264749u1);
            this.I2 = dVarA;
            com.planner5d.library.model.manager.favorite.room.b bVarA2 = com.planner5d.library.model.manager.favorite.room.b.a(dVarA, this.J);
            this.J2 = bVarA2;
            com.planner5d.library.application.j0 j0VarA = com.planner5d.library.application.j0.a(iVar, bVarA2);
            this.K2 = j0VarA;
            ij.c<com.planner5d.library.model.manager.favorite.a> cVarB22 = dagger.internal.g.b(com.planner5d.library.model.manager.favorite.b.a(this.f264747u, j0VarA, this.f264737t));
            this.L2 = cVarB22;
            ij.c<com.planner5d.library.model.manager.q0> cVarB23 = dagger.internal.g.b(com.planner5d.library.model.manager.r0.a(this.f264757v, cVarB22, this.f264737t, this.f264730s2, this.A2, this.f264747u));
            this.M2 = cVarB23;
            ij.c<com.planner5d.library.model.manager.project.h0> cVarB24 = dagger.internal.g.b(com.planner5d.library.model.manager.project.i0.a(this.f264657l, cVarB23, this.L, this.f264737t, this.f264747u));
            this.N2 = cVarB24;
            p3 p3VarA = p3.a(this.f264720r2, this.H2, cVarB24, this.f264747u, this.A1, this.f264740t2, this.f264707q);
            this.O2 = p3VarA;
            this.P2 = com.planner5d.library.application.e0.a(iVar, p3VarA);
            ij.c<com.planner5d.library.model.manager.config.n> cVarB25 = dagger.internal.g.b(com.planner5d.library.model.manager.config.o.a(this.f264669m1, com.planner5d.library.model.manager.config.purchaseplacement.d.a()));
            this.Q2 = cVarB25;
            ij.c<com.planner5d.library.activity.fragment.dialog.purchase.s> cVarB26 = dagger.internal.g.b(com.planner5d.library.activity.fragment.dialog.purchase.u.a(this.f264669m1, cVarB25, this.A1, this.C, this.f264600f2));
            this.R2 = cVarB26;
            this.S2 = ia.e.a(cVarB26);
            dagger.internal.f fVar9 = new dagger.internal.f();
            this.T2 = fVar9;
            this.U2 = com.planner5d.library.application.j.a(iVar, fVar9);
        }

        private PublicFileProvider u4(PublicFileProvider publicFileProvider) {
            com.planner5d.library.services.share.a.c(publicFileProvider, dagger.internal.g.a(this.A2));
            return publicFileProvider;
        }

        private void v3(com.planner5d.library.application.i iVar, gb.a aVar, com.planner5d.planner5d.b bVar, com.planner5d.library.application.designoftheday.a aVar2, u0 u0Var, q3 q3Var, n0 n0Var, f0 f0Var, com.planner5d.library.help.application.c cVar, r0 r0Var, t tVar, com.planner5d.library.legal.application.c cVar2, o4 o4Var, com.planner5d.library.spaces.application.c cVar3, com.planner5d.library.application.b bVar2, android.app.Application application, com.planner5d.library.application.d dVar, f6 f6Var) {
            dagger.internal.f fVar = new dagger.internal.f();
            this.V2 = fVar;
            ia.h hVarA = ia.h.a(this.U2, fVar);
            this.W2 = hVarA;
            ij.c<ia.b> cVarB = dagger.internal.g.b(ia.c.a(this.Q2, this.R2, this.S2, hVarA));
            this.X2 = cVarB;
            j1 j1VarA = j1.a(iVar, cVarB);
            this.Y2 = j1VarA;
            dagger.internal.f.b(this.T2, dagger.internal.g.b(com.planner5d.library.activity.helper.m0.a(this.f264629i1, this.f264619h1, this.T1, this.f264680n2, this.f264690o2, this.C1, this.P0, this.f264600f2, this.f264710q2, this.P2, this.R0, j1VarA, this.C, this.f264697p)));
            this.Z2 = com.planner5d.library.model.manager.payments.n.a(this.C, this.C1, this.B1);
            this.f264551a3 = com.planner5d.library.application.o0.a(iVar, this.f264740t2);
            this.f264561b3 = com.planner5d.library.application.g0.a(iVar, this.f264777x);
            h hVarA2 = h.a(bVar, this.f264640j2);
            this.f264571c3 = hVarA2;
            ij.c<com.planner5d.library.model.manager.config.attributes.a> cVarB2 = dagger.internal.g.b(com.planner5d.library.model.manager.config.attributes.b.a(this.f264657l, this.f264747u, this.F1, this.f264757v, this.f264561b3, hVarA2, this.K1, this.M1, this.N1, this.L1));
            this.f264581d3 = cVarB2;
            this.f264591e3 = com.planner5d.library.application.x2.a(iVar, cVarB2);
            com.planner5d.library.application.c2 c2VarA = com.planner5d.library.application.c2.a(iVar);
            this.f264601f3 = c2VarA;
            ij.c<m4> cVarB3 = dagger.internal.g.b(n4.a(this.f264657l, this.C1, this.T2, this.Z2, this.C, this.A1, this.f264769w1, this.T1, this.f264551a3, this.f264697p, this.f264590e2, this.f264591e3, c2VarA));
            this.f264611g3 = cVarB3;
            dagger.internal.f.b(this.V2, s0.a(r0Var, cVarB3));
            ij.c<h4> cVarB4 = dagger.internal.g.b(i4.a(this.V2, this.f264697p));
            this.f264621h3 = cVarB4;
            this.f264631i3 = dagger.internal.g.b(k.a(bVar, this.f264630i2, this.f264660l2, cVarB4, this.f264669m1, this.f264670m2));
            ij.c<com.planner5d.library.model.manager.statistics.g> cVarB5 = dagger.internal.g.b(com.planner5d.library.model.manager.statistics.h.a(this.f264657l));
            this.f264641j3 = cVarB5;
            dagger.internal.f.b(this.f264580d2, dagger.internal.g.b(com.planner5d.library.model.manager.statistics.e0.a(this.f264670m2, this.f264631i3, this.f264747u, cVarB5)));
            this.f264651k3 = dagger.internal.g.b(com.planner5d.library.model.manager.initialization.w.a(this.f264580d2));
            this.f264661l3 = dagger.internal.g.b(com.planner5d.library.application.g1.a(iVar));
            this.f264671m3 = dagger.internal.g.b(com.planner5d.library.model.manager.g2.a(this.f264657l, this.f264787y, this.X));
            this.f264681n3 = dagger.internal.g.b(a1.a(this.f264667m, this.f264787y));
            this.f264691o3 = dagger.internal.g.b(com.planner5d.library.modules.user.user.c1.a(this.Q1));
            this.f264701p3 = dagger.internal.g.b(com.planner5d.library.modules.user.user.s0.a(this.f264737t, this.f264727s));
            this.f264711q3 = new dagger.internal.f();
            ij.c<com.planner5d.library.activity.fragment.n> cVarB6 = dagger.internal.g.b(com.planner5d.library.activity.fragment.o.a(this.f264669m1));
            this.f264721r3 = cVarB6;
            ij.c<com.planner5d.library.modules.user.user.b> cVarB7 = dagger.internal.g.b(com.planner5d.library.modules.user.user.c.a(this.f264701p3, this.f264600f2, this.f264711q3, this.R0, this.f264787y, this.f264747u, this.A1, cVarB6, this.f264697p));
            this.f264731s3 = cVarB7;
            ij.c<com.planner5d.library.modules.user.user.y0> cVarB8 = dagger.internal.g.b(com.planner5d.library.modules.user.user.e1.a(this.f264667m, this.f264787y, this.f264681n3, this.f264691o3, this.f264707q, this.f264747u, cVarB7, this.A));
            this.f264741t3 = cVarB8;
            this.f264751u3 = com.planner5d.library.model.manager.initialization.a0.a(this.f264757v, this.U1, this.f264747u, this.f264661l3, this.f264579d1, this.f264671m3, this.C1, cVarB8, this.f264669m1, this.V2, this.Z1);
            v vVarA = v.a(tVar);
            this.f264761v3 = vVarA;
            this.f264771w3 = com.planner5d.library.model.manager.initialization.u.a(vVarA);
            ij.c<com.planner5d.library.activity.fragment.startup.a> cVarB9 = dagger.internal.g.b(com.planner5d.library.activity.fragment.startup.b.a(this.f264667m, this.f264661l3, this.f264747u));
            this.f264781x3 = cVarB9;
            com.planner5d.library.application.k kVarA = com.planner5d.library.application.k.a(iVar, cVarB9);
            this.f264791y3 = kVarA;
            dagger.internal.f.b(this.f264711q3, dagger.internal.g.b(com.planner5d.library.model.manager.initialization.s.a(this.Y1, this.f264550a2, this.f264651k3, this.f264751u3, this.f264771w3, kVarA, this.L)));
            dagger.internal.f.b(this.M0, dagger.internal.g.b(com.planner5d.library.model.manager.managedfiles.b0.a(this.f264599f1, this.A0, this.X1, this.f264711q3, this.f264697p)));
            dagger.internal.f.b(this.L0, dagger.internal.g.b(com.planner5d.library.model.manager.builtin.h0.a(this.f264667m, this.U, this.f264737t, this.A0, this.f264757v, this.K0, this.M0, this.A, this.f264747u)));
            dagger.internal.f.b(this.E0, dagger.internal.g.b(com.planner5d.library.model.manager.builtin.o.a(this.f264667m, this.f264757v, this.L0, this.M0)));
            dagger.internal.f.b(this.A0, dagger.internal.g.b(com.planner5d.library.model.manager.builtin.q.a(this.f264757v, this.E0, this.f264787y)));
            com.planner5d.library.services.utility.g2 g2VarA = com.planner5d.library.services.utility.g2.a(this.M);
            this.f264801z3 = g2VarA;
            this.A3 = dagger.internal.g.b(com.planner5d.library.model.manager.builtin.m0.a(this.f264657l, this.f264707q, this.f264757v, this.f264777x, this.U1, g2VarA));
            com.planner5d.library.interactor.l lVarA = com.planner5d.library.interactor.l.a(this.L, this.M0, this.O, this.f264697p);
            this.B3 = lVarA;
            com.planner5d.library.application.a3 a3VarA = com.planner5d.library.application.a3.a(iVar, lVarA);
            this.C3 = a3VarA;
            dagger.internal.f.b(this.f264757v, dagger.internal.g.b(com.planner5d.library.model.manager.builtin.j.a(this.f264777x, this.f264787y, this.f264678n0, this.f264688o0, this.f264658l0, this.f264648k0, this.f264667m, this.f264698p0, this.f264798z0, this.A0, this.K0, this.M0, this.A1, this.A3, this.L, this.L0, this.O, a3VarA)));
            dagger.internal.f.b(this.F1, dagger.internal.g.b(com.planner5d.library.model.manager.f1.a(this.f264757v, this.X, this.f264667m, this.f264737t, this.f264787y, this.f264747u, this.f264681n3, this.Z1, this.f264699p1, this.L, this.f264749u1)));
            dagger.internal.f.b(this.L, dagger.internal.g.b(v1.a(this.f264737t, this.f264747u, this.f264707q, this.f264667m, this.F1, this.Z1, this.f264669m1, this.B)));
            this.D3 = com.planner5d.library.model.manager.config.source.b.a(this.f264707q);
            this.E3 = s3.a(q3Var);
            ij.c<com.planner5d.library.model.manager.config.h> cVarB10 = dagger.internal.g.b(com.planner5d.library.model.manager.config.i.a());
            this.F3 = cVarB10;
            com.planner5d.library.model.manager.config.source.growthbook.c cVarA = com.planner5d.library.model.manager.config.source.growthbook.c.a(this.f264787y, cVarB10);
            this.G3 = cVarA;
            com.planner5d.library.model.manager.config.source.growthbook.g gVarA = com.planner5d.library.model.manager.config.source.growthbook.g.a(this.f264657l, cVarA, this.f264601f3, this.f264591e3, com.planner5d.library.model.manager.config.source.growthbook.k.a(), this.M, this.f264697p);
            this.H3 = gVarA;
            dagger.internal.f.b(this.f264739t1, g0.a(f0Var, this.L, this.D3, this.f264729s1, this.E3, this.f264719r1, gVarA));
            dagger.internal.f.b(this.f264669m1, dagger.internal.g.b(com.planner5d.library.model.manager.config.k.a(this.f264707q, this.f264739t1, this.f264697p, this.f264749u1)));
            this.I3 = dagger.internal.g.b(com.planner5d.library.model.manager.crashreporting.w.a(this.f264699p1, this.f264757v, this.F1, this.f264747u));
            ij.c<com.planner5d.library.model.manager.performancetracing.e> cVarB11 = dagger.internal.g.b(com.planner5d.library.application.z0.a(iVar));
            this.J3 = cVarB11;
            ij.c<com.planner5d.library.model.manager.crashreporting.d0> cVarB12 = dagger.internal.g.b(com.planner5d.library.model.manager.crashreporting.e0.a(this.f264667m, this.f264757v, this.F1, this.f264747u, cVarB11, this.H));
            this.K3 = cVarB12;
            dagger.internal.f.b(this.Z1, dagger.internal.g.b(com.planner5d.library.model.manager.crashreporting.m.a(this.f264669m1, this.L, this.f264697p, this.I3, cVarB12)));
            dagger.internal.f.b(this.S, com.planner5d.library.application.t.a(iVar, this.Z1));
            ij.c<com.planner5d.library.model.manager.config.sql.l> cVarB13 = dagger.internal.g.b(com.planner5d.library.model.manager.config.sql.m.a(this.f264657l, this.f264687o, this.f264697p, this.S));
            this.L3 = cVarB13;
            dagger.internal.f.b(this.f264787y, com.planner5d.library.application.v1.a(iVar, cVarB13));
            ij.c<com.planner5d.library.api.support.l> cVarB14 = dagger.internal.g.b(com.planner5d.library.api.support.m.a(this.f264787y));
            this.M3 = cVarB14;
            com.planner5d.library.api.support.q qVarA = com.planner5d.library.api.support.q.a(this.C, this.f264787y, this.X, this.f264727s, this.f264657l, this.G1, this.O1, cVarB14);
            this.N3 = qVarA;
            ij.c<com.planner5d.library.api.support.b> cVarB15 = dagger.internal.g.b(com.planner5d.library.api.support.c.a(this.f264787y, qVarA, this.H));
            this.O3 = cVarB15;
            dagger.internal.f.b(this.f264727s, dagger.internal.g.b(com.planner5d.library.application.a1.a(iVar, cVarB15)));
            this.P3 = com.planner5d.library.modules.user.user.h1.a(this.f264747u, this.f264737t, this.f264667m, this.f264669m1);
            this.Q3 = dagger.internal.g.b(com.planner5d.library.modules.user.user.e.a(this.f264701p3, this.f264600f2, this.f264711q3, this.R0, this.f264787y, this.f264747u, this.A1, this.f264721r3, this.f264697p));
            this.R3 = dagger.internal.g.b(com.planner5d.library.help.application.e.a(cVar));
            com.planner5d.library.modules.user.user.n1 n1VarA = com.planner5d.library.modules.user.user.n1.a(this.f264787y, this.L);
            this.S3 = n1VarA;
            dagger.internal.f.b(this.f264747u, dagger.internal.g.b(com.planner5d.library.modules.user.user.y.a(this.f264727s, this.F1, this.f264667m, this.f264707q, this.f264669m1, this.f264787y, this.P3, this.L, this.f264741t3, this.f264720r2, this.f264790y2, this.f264780x2, this.f264580d2, this.M0, this.f264731s3, this.Q3, this.f264701p3, this.f264661l3, this.Z1, this.f264770w2, this.R3, n1VarA, this.f264737t, this.Q1, this.A1, this.R1, this.f264730s2, this.f264777x, this.f264697p)));
            this.T3 = dagger.internal.g.b(com.planner5d.library.activity.helper.imagechooser.k.a(this.f264600f2, this.L));
            this.U3 = dagger.internal.g.b(com.planner5d.library.widget.editor.helper.b2.a());
            this.V3 = dagger.internal.g.b(com.planner5d.library.model.manager.g.a(this.f264747u));
            this.W3 = com.planner5d.library.activity.fragment.startup.y.a(this.f264667m, this.f264669m1, this.f264711q3, this.f264661l3, this.f264747u, this.f264781x3, this.A, this.f264787y, this.Z0, this.S3);
            this.X3 = com.planner5d.library.activity.fragment.messages.h.a(this.f264740t2);
            ij.c<com.planner5d.library.modules.user.auth.m> cVarB16 = dagger.internal.g.b(com.planner5d.library.modules.user.auth.n.a(this.f264657l, this.A, this.P3, this.f264747u));
            this.Y3 = cVarB16;
            this.Z3 = com.planner5d.library.activity.fragment.settings.i.a(this.f264747u, this.P3, this.f264740t2, cVarB16);
            this.f264552a4 = com.planner5d.library.activity.fragment.dialog.authentication.f1.a(this.f264580d2, this.f264669m1);
            this.f264562b4 = com.planner5d.library.activity.fragment.dialog.authentication.z.a(this.Y3);
            this.f264572c4 = d1.a(this.f264747u, this.f264701p3, this.f264661l3, this.f264730s2, this.f264731s3);
            this.f264582d4 = com.planner5d.library.activity.fragment.dialog.authentication.w0.a(this.f264747u, this.f264730s2, this.f264731s3);
            this.f264592e4 = com.planner5d.library.activity.fragment.dialog.authentication.onelink.m.a(this.f264667m, this.f264747u, this.f264730s2, this.A);
            this.f264602f4 = com.planner5d.library.activity.fragment.dialog.authentication.onelink.w.a(this.f264667m, this.f264730s2, this.A, this.f264787y, this.f264747u, this.f264661l3);
            this.f264612g4 = com.planner5d.library.activity.fragment.dialog.authentication.g0.a(this.f264747u, this.f264730s2);
            ij.c<com.planner5d.library.modules.user.auth.r> cVarB17 = dagger.internal.g.b(com.planner5d.library.modules.user.auth.s.a(this.f264657l, this.f264669m1, this.f264697p, this.A));
            this.f264622h4 = cVarB17;
            ij.c<com.planner5d.library.modules.user.user.m0> cVarB18 = dagger.internal.g.b(com.planner5d.library.modules.user.user.n0.a(this.f264737t, this.f264667m, this.f264747u, this.F1, this.f264580d2, this.Z1, this.U1, this.f264787y, this.f264720r2, this.f264711q3, this.R3, this.f264757v, cVarB17, this.f264669m1, this.O, this.L0));
            this.f264632i4 = cVarB18;
            this.f264642j4 = com.planner5d.library.activity.fragment.dialog.authentication.privacy.d.a(this.f264731s3, cVarB18, this.f264747u);
            this.f264652k4 = com.planner5d.library.activity.fragment.dialog.authentication.l1.a(this.f264701p3, this.f264747u);
            this.f264662l4 = dagger.internal.g.b(com.planner5d.library.help.application.f.a(cVar));
            h3 h3VarA = h3.a(iVar);
            this.f264672m4 = h3VarA;
            this.f264682n4 = com.planner5d.library.activity.fragment.list.m1.a(this.f264667m, this.f264600f2, this.f264780x2, this.f264790y2, this.f264747u, this.f264662l4, this.f264669m1, this.f264770w2, this.f264740t2, this.R0, this.f264707q, this.f264801z3, this.f264730s2, this.f264750u2, this.f264549a1, h3VarA);
            ij.c<com.planner5d.library.uploadplan.interactor.n> cVarB19 = dagger.internal.g.b(com.planner5d.library.uploadplan.interactor.o.a(this.f264667m, this.X, this.A, this.f264737t, this.f264747u));
            this.f264692o4 = cVarB19;
            this.f264702p4 = com.planner5d.library.uploadplan.application.d.a(cVarB19);
            this.f264712q4 = dagger.internal.g.b(com.planner5d.library.activity.fragment.projects.d0.a());
            gb.c cVarA2 = gb.c.a(aVar, this.J);
            this.f264722r4 = cVarA2;
            this.f264732s4 = dagger.internal.g.b(com.planner5d.library.model.manager.c.a(this.f264667m, cVarA2, this.f264787y, this.f264737t, this.f264747u));
            com.planner5d.library.activity.helper.k2 k2VarA = com.planner5d.library.activity.helper.k2.a(this.f264740t2);
            this.f264742t4 = k2VarA;
            com.planner5d.library.activity.helper.n2 n2VarA = com.planner5d.library.activity.helper.n2.a(k2VarA);
            this.f264752u4 = n2VarA;
            this.f264762v4 = dagger.internal.g.b(com.planner5d.library.activity.helper.f.a(this.f264732s4, this.R0, this.f264697p, n2VarA));
            this.f264772w4 = dagger.internal.g.b(com.planner5d.library.widget.rate.f.a(this.f264580d2, this.f264600f2));
            ij.c<com.planner5d.library.widget.rate.a> cVarB20 = dagger.internal.g.b(com.planner5d.library.widget.rate.b.a(this.f264787y));
            this.f264782x4 = cVarB20;
            this.f264792y4 = dagger.internal.g.b(com.planner5d.library.widget.rate.i.a(this.f264787y, this.f264772w4, cVarB20, this.f264697p));
        }

        private PurchaseDialog v4(PurchaseDialog purchaseDialog) {
            com.planner5d.library.activity.fragment.dialog.purchase.x.f(purchaseDialog, this.f264643j5.get());
            com.planner5d.library.activity.fragment.dialog.purchase.x.e(purchaseDialog, dagger.internal.g.a(this.Q2));
            com.planner5d.library.activity.fragment.dialog.purchase.x.c(purchaseDialog, this.f264655k7.get());
            com.planner5d.library.activity.fragment.dialog.purchase.x.b(purchaseDialog, this.f264730s2.get());
            com.planner5d.library.activity.fragment.dialog.purchase.x.g(purchaseDialog, this.f264580d2.get());
            return purchaseDialog;
        }

        private void w3(com.planner5d.library.application.i iVar, gb.a aVar, com.planner5d.planner5d.b bVar, com.planner5d.library.application.designoftheday.a aVar2, u0 u0Var, q3 q3Var, n0 n0Var, f0 f0Var, com.planner5d.library.help.application.c cVar, r0 r0Var, t tVar, com.planner5d.library.legal.application.c cVar2, o4 o4Var, com.planner5d.library.spaces.application.c cVar3, com.planner5d.library.application.b bVar2, android.app.Application application, com.planner5d.library.application.d dVar, f6 f6Var) {
            this.f264802z4 = com.planner5d.library.activity.fragment.startup.f.a(this.f264747u, this.f264731s3, this.f264787y);
            this.A4 = dagger.internal.g.b(com.planner5d.library.application.g2.a(iVar));
            ij.c<w2> cVarB = dagger.internal.g.b(com.planner5d.library.application.k1.a(iVar, this.Q2));
            this.B4 = cVarB;
            com.planner5d.library.model.manager.payments.z zVarA = com.planner5d.library.model.manager.payments.z.a(this.f264657l, this.T1, cVarB, this.M, this.f264551a3, this.A, this.Y2, this.V2);
            this.C4 = zVarA;
            this.D4 = t0.a(r0Var, zVarA);
            this.E4 = t2.a(iVar);
            com.planner5d.library.interactor.h hVarA = com.planner5d.library.interactor.h.a(this.f264667m, k0.a(), this.f264762v4, this.f264721r3, this.R0, this.M2, this.f264702p4, this.P0, this.f264792y4, this.f264802z4, this.X2, this.f264601f3, this.A4, this.V2, this.D4, com.planner5d.library.uploadplan.application.e.a(), this.f264747u, this.E4, this.f264600f2);
            this.F4 = hVarA;
            com.planner5d.library.application.c0 c0VarA = com.planner5d.library.application.c0.a(iVar, hVarA);
            this.G4 = c0VarA;
            com.planner5d.library.interactor.j jVarA = com.planner5d.library.interactor.j.a(this.f264721r3, c0VarA, this.f264740t2, this.R0);
            this.H4 = jVarA;
            this.I4 = com.planner5d.library.application.d0.a(iVar, jVarA);
            this.J4 = dagger.internal.g.b(com.planner5d.library.activity.helper.v0.a(this.f264600f2));
            com.planner5d.library.interactor.t tVarA = com.planner5d.library.interactor.t.a(this.X, this.f264720r2, this.f264747u, this.f264697p);
            this.K4 = tVarA;
            com.planner5d.library.application.c3 c3VarA = com.planner5d.library.application.c3.a(iVar, tVarA);
            this.L4 = c3VarA;
            ij.c<z0> cVarB2 = dagger.internal.g.b(com.planner5d.library.activity.helper.c1.a(this.J4, this.L, c3VarA));
            this.M4 = cVarB2;
            this.N4 = com.planner5d.library.activity.fragment.projects.i.a(this.A1, this.f264740t2, this.f264707q, cVarB2);
            this.O4 = com.planner5d.library.activity.fragment.projects.x0.a(this.f264669m1, this.f264600f2, this.f264790y2, this.f264702p4, this.G0, this.P0, this.f264740t2, this.R0, this.f264801z3, this.f264720r2, this.f264712q4, com.planner5d.library.uploadplan.application.e.a(), this.f264747u, this.f264667m, this.f264707q, this.f264721r3, this.I4, this.N4, this.f264787y, this.A1);
            this.P4 = com.planner5d.library.activity.fragment.snapshots.d1.a(this.P0, this.A2, this.B2, this.f264747u, this.f264790y2, this.f264600f2, this.R0, this.f264712q4, this.f264749u1);
            this.Q4 = com.planner5d.library.activity.fragment.snapshots.l0.a(this.B2);
            this.R4 = com.planner5d.library.activity.fragment.snapshots.i.a(this.C, this.B1, this.A2);
            com.planner5d.library.application.r3 r3VarA = com.planner5d.library.application.r3.a(q3Var);
            this.S4 = r3VarA;
            this.T4 = dagger.internal.g.b(com.planner5d.library.model.manager.menu.b.a(this.f264667m, this.A1, this.f264707q, r3VarA, this.f264669m1));
            com.planner5d.library.modules.user.user.b0 b0VarA = com.planner5d.library.modules.user.user.b0.a(this.f264737t, this.G0);
            this.U4 = b0VarA;
            this.V4 = com.planner5d.library.activity.fragment.profile.y.a(this.f264662l4, this.T4, this.f264747u, b0VarA, this.A1, this.f264707q, this.f264669m1);
            this.W4 = com.planner5d.library.activity.fragment.profile.edit.p.a(this.f264667m, this.f264747u, this.U4, this.P3, this.T3, this.f264669m1);
            this.X4 = com.planner5d.library.activity.fragment.profile.edit.item.f.a(this.f264747u, this.f264740t2);
            this.Y4 = com.planner5d.library.activity.fragment.profile.edit.password.g.a(this.f264747u, this.f264740t2);
            this.Z4 = com.planner5d.library.activity.fragment.profile.orders.n.a(this.C1, this.f264747u, this.A1, this.X, this.f264707q, this.A2, this.f264657l);
            this.f264553a5 = com.planner5d.library.activity.fragment.gallery.l0.a(this.L2);
            ij.c<com.planner5d.library.activity.fragment.gallery.v> cVarB3 = dagger.internal.g.b(com.planner5d.library.activity.fragment.gallery.w.a(this.f264747u, this.f264667m));
            this.f264563b5 = cVarB3;
            this.f264573c5 = com.planner5d.library.activity.fragment.gallery.y.a(cVarB3, this.f264757v, this.f264749u1);
            this.f264583d5 = com.planner5d.library.activity.fragment.gallery.q0.a(this.G0, this.A2, this.f264740t2);
            com.planner5d.library.interactor.o0 o0VarA = com.planner5d.library.interactor.o0.a(this.L2, this.f264740t2);
            this.f264593e5 = o0VarA;
            this.f264603f5 = l2.a(iVar, o0VarA);
            this.f264613g5 = com.planner5d.library.model.j.a(this.f264757v);
            ij.c<com.planner5d.library.activity.fragment.gallery.m> cVarB4 = dagger.internal.g.b(com.planner5d.library.activity.fragment.gallery.n.a());
            this.f264623h5 = cVarB4;
            this.f264633i5 = com.planner5d.library.activity.fragment.gallery.project.l.a(this.f264583d5, this.f264603f5, this.f264613g5, this.L2, this.R0, this.P0, cVarB4, this.f264749u1);
            ij.c<com.planner5d.library.activity.fragment.dialog.purchase.v> cVarB5 = dagger.internal.g.b(com.planner5d.library.activity.fragment.dialog.purchase.w.a(this.f264657l, this.A));
            this.f264643j5 = cVarB5;
            ij.c<com.planner5d.library.activity.fragment.dialog.purchase.c.a> cVarB6 = dagger.internal.g.b(com.planner5d.library.activity.fragment.dialog.purchase.d.a(this.f264667m, this.f264707q, this.C1, cVarB5, this.f264747u));
            this.f264653k5 = cVarB6;
            this.f264663l5 = com.planner5d.library.activity.fragment.dialog.purchase.premium.q.a(cVarB6);
            this.f264673m5 = com.planner5d.library.activity.fragment.dialog.purchase.designgenerator.h.a(this.f264667m, this.f264777x, this.L, this.f264653k5);
            this.f264683n5 = com.planner5d.library.activity.fragment.dialog.purchase.snapshots.i.a(this.G0, this.f264653k5);
            this.f264693o5 = com.planner5d.library.activity.fragment.dialog.purchase.textures.d.a(this.f264653k5);
            this.f264703p5 = com.planner5d.library.activity.fragment.dialog.purchase.recognitions.e.a(this.f264653k5);
            com.planner5d.library.modules.user.user.p0 p0VarA = com.planner5d.library.modules.user.user.p0.a(this.A1, this.f264737t);
            this.f264713q5 = p0VarA;
            this.f264723r5 = com.planner5d.library.activity.fragment.profile.promocode.f.a(p0VarA, this.f264747u, this.f264740t2);
            this.f264733s5 = com.planner5d.library.activity.fragment.dialog.send_to_gallery.m.a(this.A2, this.f264747u, this.f264720r2, this.f264600f2, this.M2, this.f264667m);
            com.planner5d.library.activity.helper.i1 i1VarA = com.planner5d.library.activity.helper.i1.a(this.A2, this.f264747u, this.A1, this.f264740t2);
            this.f264743t5 = i1VarA;
            this.f264753u5 = com.planner5d.library.activity.fragment.dialog.snapshots.o.a(this.A2, this.C, this.T1, i1VarA, this.A1, this.f264551a3);
            ij.c<com.planner5d.library.model.manager.s0> cVarB7 = dagger.internal.g.b(com.planner5d.library.model.manager.t0.a(this.f264787y));
            this.f264763v5 = cVarB7;
            this.f264773w5 = com.planner5d.library.activity.fragment.dialog.projectsettings.v0.a(this.O2, this.f264747u, this.f264579d1, this.f264671m3, cVarB7, this.H2, this.A1, this.f264669m1, this.L);
            this.f264783x5 = com.planner5d.library.activity.fragment.dialog.iteminfo.e.a(this.f264757v);
            com.planner5d.library.widget.editor.popup.itemproperties.z zVarA2 = com.planner5d.library.widget.editor.popup.itemproperties.z.a(this.f264708q0, this.Y, this.f264667m, this.f264579d1);
            this.f264793y5 = zVarA2;
            this.f264803z5 = com.planner5d.library.widget.editor.popup.itemproperties.w.a(this.X, this.f264757v, this.f264579d1, zVarA2);
            this.A5 = com.planner5d.library.widget.editor.popup.itemproperties.pages.material.j.a(this.X, this.f264757v);
            this.B5 = com.planner5d.library.widget.editor.popup.itemproperties.pages.availablematerial.l.a(this.f264667m, this.X, this.f264757v, this.f264579d1);
            this.C5 = com.planner5d.library.widget.editor.popup.itemproperties.pages.size.r.a(this.f264579d1, this.f264671m3, this.f264757v, com.planner5d.library.widget.editor.interactor.f.a(), this.f264669m1);
            com.planner5d.library.widget.editor.popup.itemproperties.interactor.b bVarA = com.planner5d.library.widget.editor.popup.itemproperties.interactor.b.a(this.T3);
            this.D5 = bVarA;
            com.planner5d.library.application.n nVarA = com.planner5d.library.application.n.a(iVar, bVarA);
            this.E5 = nVarA;
            this.F5 = dagger.internal.g.b(com.planner5d.library.widget.editor.popup.itemproperties.c.a(nVarA, this.f264740t2, this.f264657l, this.f264697p));
            this.G5 = a0.a(tVar);
            e0 e0VarA = e0.a(tVar);
            this.H5 = e0VarA;
            this.I5 = com.planner5d.library.widget.editor.popup.itemproperties.pages.texturepreview.o.a(this.F5, this.f264747u, this.f264579d1, this.A1, this.f264740t2, this.f264761v3, this.G5, e0VarA);
            ij.c<com.planner5d.library.widget.editor.projectresources.a> cVarB8 = dagger.internal.g.b(com.planner5d.library.widget.editor.projectresources.c.a());
            this.J5 = cVarB8;
            com.planner5d.library.widget.editor.projectresources.h hVarA2 = com.planner5d.library.widget.editor.projectresources.h.a(cVarB8, com.planner5d.library.widget.editor.projectresources.k.a());
            this.K5 = hVarA2;
            ij.c<com.planner5d.library.widget.editor.projectresources.e> cVarB9 = dagger.internal.g.b(com.planner5d.library.widget.editor.projectresources.f.a(hVarA2));
            this.L5 = cVarB9;
            this.M5 = com.planner5d.library.widget.editor.popup.itemproperties.pages.size.l0.a(this.f264671m3, this.f264757v, this.f264797z, cVarB9, this.L);
            this.N5 = com.planner5d.library.widget.editor.popup.itemproperties.pages.texture.p.a(this.V3);
            this.O5 = com.planner5d.library.contest.data.g.a(this.C, this.R0, this.f264750u2);
            ij.c<com.planner5d.library.model.manager.uploadplan.a> cVarB10 = dagger.internal.g.b(com.planner5d.library.model.manager.uploadplan.c.a());
            this.P5 = cVarB10;
            ij.c<com.planner5d.library.activity.fragment.feed.interactor.i> cVarB11 = dagger.internal.g.b(com.planner5d.library.activity.fragment.feed.interactor.j.a(cVarB10));
            this.Q5 = cVarB11;
            this.R5 = com.planner5d.library.application.t1.a(iVar, cVarB11);
            this.S5 = dagger.internal.g.b(com.planner5d.library.application.b2.a(iVar));
            ij.c<com.planner5d.library.feed.data.g> cVarB12 = dagger.internal.g.b(com.planner5d.library.feed.data.h.a(this.O));
            this.T5 = cVarB12;
            com.planner5d.library.activity.fragment.feed.interactor.h hVarA3 = com.planner5d.library.activity.fragment.feed.interactor.h.a(this.M, cVarB12);
            this.U5 = hVarA3;
            this.V5 = com.planner5d.library.application.r1.a(iVar, hVarA3);
            com.planner5d.library.activity.fragment.feed.interactor.f fVarA = com.planner5d.library.activity.fragment.feed.interactor.f.a(this.M, this.f264613g5, this.T5);
            this.W5 = fVarA;
            this.X5 = com.planner5d.library.application.n1.a(iVar, fVarA);
            ij.c<com.planner5d.library.feed.data.d> cVarB13 = dagger.internal.g.b(com.planner5d.library.feed.data.e.a());
            this.Y5 = cVarB13;
            ic.b bVarA2 = ic.b.a(cVarB13);
            this.Z5 = bVarA2;
            this.f264554a6 = com.planner5d.library.application.s1.a(iVar, bVarA2);
            ij.c<com.planner5d.library.model.manager.p> cVarB14 = dagger.internal.g.b(com.planner5d.library.model.manager.q.a(this.L2, this.f264740t2));
            this.f264564b6 = cVarB14;
            com.planner5d.library.activity.fragment.feed.interactor.d dVarA = com.planner5d.library.activity.fragment.feed.interactor.d.a(this.f264667m, this.M2, this.V5, this.X5, this.f264554a6, this.f264787y, cVarB14);
            this.f264574c6 = dVarA;
            this.f264584d6 = com.planner5d.library.application.a0.a(iVar, dVarA);
            this.f264594e6 = com.planner5d.library.activity.fragment.feed.f1.a(this.f264667m, this.R0, this.P0, this.f264770w2, this.f264740t2, this.f264732s4, this.A, this.L, this.f264669m1, this.O5, this.f264780x2, this.f264712q4, k0.a(), this.f264787y, this.R5, this.S5, this.f264702p4, com.planner5d.library.uploadplan.application.e.a(), this.f264730s2, this.N4, this.I4, this.f264790y2, this.A1, this.f264720r2, this.f264747u, this.f264584d6, this.f264564b6, this.f264707q, this.f264721r3);
            com.planner5d.library.activity.fragment.smartwizard.u uVarA = com.planner5d.library.activity.fragment.smartwizard.u.a(this.f264757v);
            this.f264604f6 = uVarA;
            this.f264614g6 = com.planner5d.library.application.y1.a(iVar, uVarA);
            this.f264624h6 = dagger.internal.g.b(sd.f.a(this.f264699p1));
            ij.c<oa.d> cVarB15 = dagger.internal.g.b(oa.e.a(this.f264618h0, this.f264568c0));
            this.f264634i6 = cVarB15;
            ij.c<oa.f> cVarB16 = dagger.internal.g.b(y2.a(iVar, cVarB15));
            this.f264644j6 = cVarB16;
            this.f264654k6 = com.planner5d.library.activity.fragment.smartwizard.roomshape.g.a(this.f264614g6, this.R0, this.f264740t2, this.f264600f2, this.O2, this.f264624h6, this.A, this.f264667m, cVarB16, this.f264798z0);
            com.planner5d.library.activity.fragment.smartwizard.dimensions.interactor.b bVarA3 = com.planner5d.library.activity.fragment.smartwizard.dimensions.interactor.b.a(this.f264671m3, this.f264614g6);
            this.f264664l6 = bVarA3;
            this.f264674m6 = com.planner5d.library.application.d1.a(iVar, bVarA3);
            this.f264684n6 = com.planner5d.library.application.q2.a(iVar, com.planner5d.library.activity.fragment.smartwizard.dimensions.interactor.d.a());
            r2 r2VarA = r2.a(iVar, com.planner5d.library.activity.fragment.smartwizard.dimensions.interactor.f.a());
            this.f264694o6 = r2VarA;
            this.f264704p6 = com.planner5d.library.activity.fragment.smartwizard.dimensions.u.a(this.f264671m3, this.f264674m6, this.f264684n6, this.f264720r2, r2VarA, this.R0, this.A, this.f264667m, this.f264600f2, this.O2, this.f264740t2, this.f264624h6, this.f264644j6, this.f264798z0, this.X0);
            com.planner5d.library.activity.fragment.smartwizard.roomstyle.interactor.g gVarA = com.planner5d.library.activity.fragment.smartwizard.roomstyle.interactor.g.a(this.L, this.f264737t, this.f264747u);
            this.f264714q6 = gVarA;
            com.planner5d.library.application.w1 w1VarA = com.planner5d.library.application.w1.a(iVar, gVarA);
            this.f264724r6 = w1VarA;
            com.planner5d.library.activity.fragment.smartwizard.roomstyle.interactor.j jVarA2 = com.planner5d.library.activity.fragment.smartwizard.roomstyle.interactor.j.a(this.f264667m, w1VarA, this.f264740t2, this.f264759v1);
            this.f264734s6 = jVarA2;
            this.f264744t6 = com.planner5d.library.application.x1.a(iVar, jVarA2);
            this.f264754u6 = com.planner5d.library.activity.fragment.smartwizard.roomstyle.interactor.e.a(this.f264720r2, this.f264747u, this.f264740t2);
        }

        private PurchasePagePlanRecognitions w4(PurchasePagePlanRecognitions purchasePagePlanRecognitions) {
            com.planner5d.library.activity.fragment.dialog.purchase.recognitions.c.c(purchasePagePlanRecognitions, com.planner5d.library.uploadplan.application.e.c());
            return purchasePagePlanRecognitions;
        }

        private void x3(com.planner5d.library.application.i iVar, gb.a aVar, com.planner5d.planner5d.b bVar, com.planner5d.library.application.designoftheday.a aVar2, u0 u0Var, q3 q3Var, n0 n0Var, f0 f0Var, com.planner5d.library.help.application.c cVar, r0 r0Var, t tVar, com.planner5d.library.legal.application.c cVar2, o4 o4Var, com.planner5d.library.spaces.application.c cVar3, com.planner5d.library.application.b bVar2, android.app.Application application, com.planner5d.library.application.d dVar, f6 f6Var) {
            this.f264764v6 = com.planner5d.library.application.e1.a(iVar, this.f264754u6);
            this.f264774w6 = com.planner5d.library.smartwizard.data.d.a(this.f264657l, com.planner5d.library.database.manager.b.a(), this.f264737t, this.C);
            com.planner5d.library.smartwizard.interactor.h hVarA = com.planner5d.library.smartwizard.interactor.h.a(this.f264657l, this.f264561b3);
            this.f264784x6 = hVarA;
            q0 q0VarA = q0.a(n0Var, hVarA);
            this.f264794y6 = q0VarA;
            com.planner5d.library.smartwizard.interactor.f fVarA = com.planner5d.library.smartwizard.interactor.f.a(this.f264774w6, q0VarA);
            this.f264804z6 = fVarA;
            this.A6 = p0.a(n0Var, fVarA);
            f3 f3VarA = f3.a(iVar);
            this.B6 = f3VarA;
            this.C6 = com.planner5d.library.activity.fragment.smartwizard.roomstyle.o.a(this.f264744t6, this.f264764v6, this.A6, this.A, this.X0, this.R0, this.f264600f2, this.f264740t2, this.O2, this.f264624h6, f3VarA, this.f264667m);
            this.D6 = com.planner5d.library.activity.fragment.compareplans.i.a(this.f264669m1);
            com.planner5d.library.activity.fragment.smartwizard.decorator.interactor.c cVarA = com.planner5d.library.activity.fragment.smartwizard.decorator.interactor.c.a(this.f264667m, this.f264724r6, this.f264740t2, this.f264759v1);
            this.E6 = cVarA;
            this.F6 = com.planner5d.library.application.w.a(iVar, cVarA);
            com.planner5d.library.smartwizard.interactor.b bVarA = com.planner5d.library.smartwizard.interactor.b.a(this.T1);
            this.G6 = bVarA;
            o0 o0VarA = o0.a(n0Var, bVarA);
            this.H6 = o0VarA;
            this.I6 = com.planner5d.library.activity.fragment.smartwizard.decorator.m.a(this.F6, this.f264764v6, o0VarA, this.A, this.X0, this.R0, this.f264600f2, this.f264740t2, this.O2, this.f264624h6, this.B6, this.f264667m);
            this.J6 = com.planner5d.library.activity.fragment.intenthandler.c.a(this.I4);
            i3 i3VarA = i3.a(iVar);
            this.K6 = i3VarA;
            this.L6 = com.planner5d.library.activity.fragment.spaces.documents.p.a(this.f264549a1, this.P0, this.R0, this.X0, this.f264600f2, i3VarA);
            this.M6 = com.planner5d.library.activity.fragment.spaces.folder.j.a(this.f264549a1, this.f264600f2, this.f264667m, this.K6, this.f264672m4);
            this.N6 = com.planner5d.library.activity.fragment.spaces.file.j.a(this.f264549a1, this.X0, this.K6, this.f264672m4);
            this.O6 = com.planner5d.library.activity.fragment.spaces.preview.c.a(this.f264549a1, this.X0);
            this.P6 = com.planner5d.library.activity.fragment.projects.o0.a(this.f264669m1, this.Z0, this.f264624h6);
            this.Q6 = com.planner5d.library.activity.fragment.spaces.dashboard.k.a(this.f264669m1, this.f264747u, this.U4, this.X2);
            dagger.internal.n nVarC = dagger.internal.n.c(56).a(com.planner5d.library.activity.fragment.startup.x.class, this.W3).a(com.planner5d.library.activity.fragment.messages.g.class, this.X3).a(com.planner5d.library.activity.fragment.settings.h.class, this.Z3).a(com.planner5d.library.activity.fragment.dialog.premiumfeature.b.class, com.planner5d.library.activity.fragment.dialog.premiumfeature.c.a()).a(com.planner5d.library.activity.fragment.dialog.authentication.e1.class, this.f264552a4).a(com.planner5d.library.activity.fragment.dialog.authentication.y.class, this.f264562b4).a(com.planner5d.library.activity.fragment.dialog.authentication.c1.class, this.f264572c4).a(com.planner5d.library.activity.fragment.dialog.authentication.v0.class, this.f264582d4).a(com.planner5d.library.activity.fragment.dialog.authentication.onelink.l.class, this.f264592e4).a(com.planner5d.library.activity.fragment.dialog.authentication.onelink.v.class, this.f264602f4).a(com.planner5d.library.activity.fragment.dialog.authentication.f0.class, this.f264612g4).a(com.planner5d.library.activity.fragment.dialog.authentication.privacy.c.class, this.f264642j4).a(com.planner5d.library.activity.fragment.dialog.authentication.k1.class, this.f264652k4).a(l1.class, this.f264682n4).a(com.planner5d.library.activity.fragment.projects.w0.class, this.O4).a(com.planner5d.library.activity.fragment.snapshots.c1.class, this.P4).a(com.planner5d.library.activity.fragment.snapshots.k0.class, this.Q4).a(com.planner5d.library.activity.fragment.snapshots.h.class, this.R4).a(com.planner5d.library.activity.fragment.profile.x.class, this.V4).a(com.planner5d.library.activity.fragment.profile.edit.n.class, this.W4).a(com.planner5d.library.activity.fragment.profile.edit.item.e.class, this.X4).a(com.planner5d.library.activity.fragment.profile.edit.password.f.class, this.Y4).a(com.planner5d.library.activity.fragment.profile.orders.l.class, this.Z4).a(com.planner5d.library.activity.fragment.gallery.k0.class, this.f264553a5).a(com.planner5d.library.activity.fragment.gallery.x.class, this.f264573c5).a(com.planner5d.library.activity.fragment.gallery.project.k.class, this.f264633i5).a(com.planner5d.library.activity.fragment.dialog.purchase.premium.p.class, this.f264663l5).a(com.planner5d.library.activity.fragment.dialog.purchase.designgenerator.g.class, this.f264673m5).a(com.planner5d.library.activity.fragment.dialog.purchase.snapshots.h.class, this.f264683n5).a(com.planner5d.library.activity.fragment.dialog.purchase.textures.c.class, this.f264693o5).a(com.planner5d.library.activity.fragment.dialog.purchase.recognitions.d.class, this.f264703p5).a(com.planner5d.library.activity.fragment.profile.promocode.e.class, this.f264723r5).a(com.planner5d.library.activity.fragment.dialog.send_to_gallery.l.class, this.f264733s5).a(com.planner5d.library.activity.fragment.dialog.snapshots.n.class, this.f264753u5).a(com.planner5d.library.activity.fragment.dialog.projectsettings.u0.class, this.f264773w5).a(com.planner5d.library.activity.fragment.dialog.iteminfo.d.class, this.f264783x5).a(com.planner5d.library.widget.editor.popup.itemproperties.v.class, this.f264803z5).a(com.planner5d.library.widget.editor.popup.itemproperties.pages.material.i.class, this.A5).a(com.planner5d.library.widget.editor.popup.itemproperties.pages.availablematerial.k.class, this.B5).a(com.planner5d.library.widget.editor.popup.itemproperties.pages.size.q.class, this.C5).a(com.planner5d.library.widget.editor.popup.itemproperties.pages.texturepreview.n.class, this.I5).a(com.planner5d.library.widget.editor.popup.itemproperties.pages.size.k0.class, this.M5).a(com.planner5d.library.widget.editor.popup.itemproperties.pages.texture.o.class, this.N5).a(com.planner5d.library.activity.fragment.feed.e1.class, this.f264594e6).a(com.planner5d.library.activity.fragment.smartwizard.roomshape.f.class, this.f264654k6).a(com.planner5d.library.activity.fragment.smartwizard.dimensions.t.class, this.f264704p6).a(com.planner5d.library.activity.fragment.smartwizard.roomstyle.n.class, this.C6).a(com.planner5d.library.activity.fragment.compareplans.h.class, this.D6).a(com.planner5d.library.activity.fragment.smartwizard.decorator.l.class, this.I6).a(com.planner5d.library.activity.fragment.intenthandler.b.class, this.J6).a(com.planner5d.library.activity.fragment.spaces.documents.o.class, this.L6).a(com.planner5d.library.activity.fragment.spaces.folder.i.class, this.M6).a(com.planner5d.library.activity.fragment.spaces.file.i.class, this.N6).a(com.planner5d.library.activity.fragment.spaces.preview.b.class, this.O6).a(com.planner5d.library.activity.fragment.projects.n0.class, this.P6).a(com.planner5d.library.activity.fragment.spaces.dashboard.j.class, this.Q6).c();
            this.R6 = nVarC;
            this.S6 = dagger.internal.g.b(com.planner5d.library.services.utility.h0.a(nVarC));
            com.planner5d.library.activity.fragment.dialog.purchase.g0 g0VarA = com.planner5d.library.activity.fragment.dialog.purchase.g0.a(this.f264667m, this.f264747u, this.T2, this.C1, this.f264740t2, this.f264697p);
            this.T6 = g0VarA;
            this.U6 = com.planner5d.library.activity.fragment.dialog.purchase.h0.c(g0VarA);
            com.planner5d.library.activity.fragment.dialog.video.g gVarA = com.planner5d.library.activity.fragment.dialog.video.g.a();
            this.V6 = gVarA;
            this.W6 = com.planner5d.library.activity.fragment.dialog.video.h.c(gVarA);
            dagger.internal.m mVarC = dagger.internal.m.c(2).a(com.planner5d.library.activity.fragment.dialog.purchase.f0.class, this.U6).a(com.planner5d.library.activity.fragment.dialog.video.f.class, this.W6).c();
            this.X6 = mVarC;
            this.Y6 = dagger.internal.v.a(com.planner5d.library.services.utility.h1.a(mVarC, this.R6));
            this.Z6 = dagger.internal.g.b(ud.c.a(this.P0, this.R0));
            this.f264555a7 = dagger.internal.g.b(com.planner5d.library.activity.fragment.list.e0.a(this.f264780x2));
            this.f264565b7 = dagger.internal.g.b(com.planner5d.library.model.manager.config.s.a(this.f264657l, this.f264729s1, this.f264777x));
            this.f264575c7 = dagger.internal.g.b(com.planner5d.library.application.v2.a(iVar, this.U4));
            this.f264585d7 = dagger.internal.g.b(com.planner5d.library.model.manager.l1.a(this.G0, this.f264747u));
            ij.c<com.planner5d.library.model.manager.contest.b> cVarB = dagger.internal.g.b(com.planner5d.library.model.manager.contest.c.a(this.f264757v));
            this.f264595e7 = cVarB;
            this.f264605f7 = dagger.internal.g.b(com.planner5d.library.model.manager.e.a(this.f264757v, cVarB, this.G0));
            this.f264615g7 = dagger.internal.g.b(com.planner5d.library.activity.helper.y.a());
            this.f264625h7 = dagger.internal.g.b(com.planner5d.library.application.r0.a(iVar, this.f264721r3));
            this.f264635i7 = dagger.internal.g.b(com.planner5d.library.application.e2.a(iVar));
            com.planner5d.library.activity.fragment.dialog.t tVarA = com.planner5d.library.activity.fragment.dialog.t.a(this.f264600f2);
            this.f264645j7 = tVarA;
            this.f264655k7 = dagger.internal.g.b(com.planner5d.library.help.application.d.a(cVar, tVarA));
            this.f264665l7 = dagger.internal.g.b(com.planner5d.library.legal.application.d.a(cVar2, com.planner5d.library.legal.view.dialog.b.a()));
            this.f264675m7 = dagger.internal.g.b(com.planner5d.library.spaces.application.d.a(cVar3, com.planner5d.library.spaces.view.b.a()));
            w4 w4VarA = w4.a(this.f264667m, this.f264720r2, this.L, this.F1, this.f264737t, this.f264747u);
            this.f264685n7 = w4VarA;
            ij.c<p4> cVarB2 = dagger.internal.g.b(r4.a(this.f264565b7, this.f264707q, this.A1, this.f264777x, w4VarA));
            this.f264695o7 = cVarB2;
            ij.c<q4> cVarB3 = dagger.internal.g.b(com.planner5d.library.application.i2.a(iVar, cVarB2));
            this.f264705p7 = cVarB3;
            c5 c5VarA = c5.a(this.f264769w1, this.f264787y, cVarB3, this.A, this.f264697p);
            this.f264715q7 = c5VarA;
            this.f264725r7 = dagger.internal.g.b(com.planner5d.library.help.application.g.a(cVar, c5VarA));
            this.f264735s7 = dagger.internal.g.b(com.planner5d.library.model.manager.u2.a(this.B1, this.C1, this.f264789y1));
            this.f264745t7 = gb.d.a(aVar, this.J);
            this.f264755u7 = gb.g.a(aVar, this.J);
            this.f264765v7 = dagger.internal.g.b(com.planner5d.planner5d.d.a(bVar, this.f264667m));
            this.f264775w7 = dagger.internal.g.b(com.planner5d.library.application.z.a(iVar, this.f264697p, this.f264749u1));
            com.planner5d.library.model.manager.builtin.a1 a1VarA = com.planner5d.library.model.manager.builtin.a1.a(this.f264757v, this.f264777x, this.f264667m);
            this.f264785x7 = a1VarA;
            this.f264795y7 = dagger.internal.g.b(d3.a(this.f264787y, a1VarA, this.f264737t, this.A, this.f264669m1, this.f264747u));
            this.f264805z7 = dagger.internal.g.b(com.planner5d.library.widget.editor.catalog.h.a(this.f264757v, this.f264605f7, this.f264595e7, this.f264749u1, this.A1));
            this.A7 = dagger.internal.g.b(com.planner5d.library.model.manager.n2.a());
            this.B7 = dagger.internal.g.b(com.planner5d.library.widget.editor.popup.f.a());
            this.C7 = dagger.internal.g.b(com.planner5d.library.application.r.a(iVar));
            this.D7 = dagger.internal.g.b(com.planner5d.library.model.manager.v0.a());
            this.E7 = dagger.internal.g.b(com.planner5d.library.activity.fragment.d0.a(this.P0, this.f264763v5, this.f264740t2, this.R0));
            ij.c<com.planner5d.library.widget.editor.itemactionsbar.h> cVarB4 = dagger.internal.g.b(com.planner5d.library.widget.editor.itemactionsbar.i.a(this.f264757v, this.f264600f2, this.f264669m1, this.f264697p));
            this.F7 = cVarB4;
            this.G7 = dagger.internal.g.b(com.planner5d.library.widget.editor.helper.l2.a(cVarB4));
            this.H7 = y.a(tVar);
            this.I7 = d0.a(tVar);
            this.J7 = z.a(tVar);
            this.K7 = x.a(tVar);
            this.L7 = w.a(tVar);
            this.M7 = u.a(tVar);
            this.N7 = b0.a(tVar);
            this.O7 = c0.a(tVar);
            ij.c<dd.c> cVarB5 = dagger.internal.g.b(dd.d.a(this.f264797z, this.N, this.V, this.M));
            this.P7 = cVarB5;
            this.Q7 = com.planner5d.library.widget.editor.editor3d.x.a(this.f264667m, this.f264763v5, this.L, this.f264740t2, this.f264579d1, this.G0, this.H7, this.A, this.f264569c1, this.f264761v3, this.I7, this.J7, this.K7, this.L7, this.M7, this.E0, this.N7, this.O7, cVarB5);
            com.planner5d.library.activity.fragment.smartwizard.roomstyle.interactor.c cVarA2 = com.planner5d.library.activity.fragment.smartwizard.roomstyle.interactor.c.a(this.f264737t, this.f264657l, this.f264759v1, this.f264740t2, this.f264747u);
            this.R7 = cVarA2;
            com.planner5d.library.application.x xVarA = com.planner5d.library.application.x.a(iVar, cVarA2);
            this.S7 = xVarA;
            this.T7 = com.planner5d.library.widget.editor.menu.k.a(this.f264747u, this.f264720r2, this.f264740t2, this.P0, this.R0, this.f264600f2, this.f264707q, this.f264697p, this.f264669m1, this.X, xVarA, this.G0);
            this.U7 = com.planner5d.library.widget.editor.facade.d0.a(this.L5, this.f264757v, this.f264763v5, this.f264740t2, this.L, this.D7, this.f264805z7);
            com.planner5d.library.application.v vVarA = com.planner5d.library.application.v.a(iVar, com.planner5d.library.model.manager.uploadplan.f.a());
            this.V7 = vVarA;
            com.planner5d.library.interactor.b bVarA2 = com.planner5d.library.interactor.b.a(vVarA, this.f264667m, this.f264737t, this.f264740t2, this.A, this.f264730s2);
            this.W7 = bVarA2;
            com.planner5d.library.application.u uVarA = com.planner5d.library.application.u.a(iVar, bVarA2);
            this.X7 = uVarA;
            this.Y7 = com.planner5d.library.widget.editor.helper.x1.a(uVarA, this.f264600f2, com.planner5d.library.uploadplan.application.e.a(), this.L, this.B6);
            this.Z7 = com.planner5d.library.widget.editor.facade.t.a(this.f264780x2, this.f264720r2, this.f264747u, this.O2, this.U7, this.E7, com.planner5d.library.widget.editor.helper.r2.a(), this.L5, this.f264757v, this.f264797z, this.f264585d7);
            this.f264556a8 = com.planner5d.library.widget.editor.helper.s1.a(this.f264787y, j0.a(), this.R0, this.f264720r2, this.L, this.f264600f2, this.B6, this.D4, this.f264697p, this.X0);
            this.f264566b8 = com.planner5d.library.widget.editor.helper.v2.a(this.f264669m1, this.f264787y, this.f264697p);
            com.planner5d.library.widget.editor.interactor.d dVarA = com.planner5d.library.widget.editor.interactor.d.a(this.f264780x2, this.f264720r2, this.f264749u1);
            this.f264576c8 = dVarA;
            this.f264586d8 = com.planner5d.library.application.f1.a(iVar, dVarA);
            com.planner5d.library.interactor.g0 g0VarA2 = com.planner5d.library.interactor.g0.a(this.f264720r2, this.C, this.f264780x2, this.f264743t5);
            this.f264596e8 = g0VarA2;
            p1 p1VarA = p1.a(iVar, g0VarA2);
            this.f264606f8 = p1VarA;
            this.f264616g8 = com.planner5d.library.widget.editor.helper.o2.a(this.f264740t2, this.f264586d8, p1VarA, this.f264600f2, this.R0, this.f264749u1);
            com.planner5d.library.widget.editor.helper.w2 w2VarA = com.planner5d.library.widget.editor.helper.w2.a(this.f264720r2, this.H2, this.P0, this.f264780x2, this.f264698p0, this.f264747u, this.f264600f2, this.f264757v, this.B7, this.f264707q, this.f264740t2, this.O2, this.T7, this.T2, this.f264770w2, this.R0, this.A1, this.f264792y4, this.f264679n1, this.C7, this.U7, this.Y7, this.L, l0.a(), this.f264624h6, this.Z7, this.f264556a8, this.G7, this.X, this.J3, this.f264750u2, this.f264569c1, this.f264566b8, this.f264616g8, this.f264669m1, this.Y, this.Z);
            this.f264626h8 = w2VarA;
            this.f264636i8 = com.planner5d.library.widget.editor.editor3d.r.a(this.Q7, w2VarA, this.U3);
            com.planner5d.library.application.h0 h0VarA = com.planner5d.library.application.h0.a(iVar, this.f264707q);
            this.f264646j8 = h0VarA;
            this.f264656k8 = dagger.internal.g.b(com.planner5d.library.activity.helper.j0.a(this.A1, this.f264707q, h0VarA, this.Q1));
            this.f264666l8 = dagger.internal.g.b(com.planner5d.library.application.designoftheday.e.a(this.f264667m, this.R0, this.X5, this.f264554a6));
            this.f264676m8 = dagger.internal.g.b(com.planner5d.library.application.designoftheday.g.a());
            this.f264686n8 = dagger.internal.g.b(com.planner5d.library.application.u2.a(iVar, this.f264752u4));
            this.f264696o8 = dagger.internal.g.b(com.planner5d.library.model.converter.json.to.g.a());
            this.f264706p8 = com.planner5d.library.activity.helper.v.a(this.M0);
            this.f264716q8 = com.planner5d.library.activity.helper.g0.a(this.P0, this.A1, this.f264747u, this.f264580d2, this.f264707q, this.f264600f2, this.R0, this.f264787y, this.f264712q4, this.L, this.f264721r3, this.f264759v1);
        }

        private PurchasePagePremiumReview x4(PurchasePagePremiumReview purchasePagePremiumReview) {
            com.planner5d.library.activity.fragment.dialog.purchase.premium.o.b(purchasePagePremiumReview, this.X.get());
            com.planner5d.library.activity.fragment.dialog.purchase.premium.o.e(purchasePagePremiumReview, this.A.get());
            com.planner5d.library.activity.fragment.dialog.purchase.premium.o.c(purchasePagePremiumReview, this.L.get());
            return purchasePagePremiumReview;
        }

        private void y3(com.planner5d.library.application.i iVar, gb.a aVar, com.planner5d.planner5d.b bVar, com.planner5d.library.application.designoftheday.a aVar2, u0 u0Var, q3 q3Var, n0 n0Var, f0 f0Var, com.planner5d.library.help.application.c cVar, r0 r0Var, t tVar, com.planner5d.library.legal.application.c cVar2, o4 o4Var, com.planner5d.library.spaces.application.c cVar3, com.planner5d.library.application.b bVar2, android.app.Application application, com.planner5d.library.application.d dVar, f6 f6Var) {
            this.f264726r8 = com.planner5d.library.modules.user.user.f0.a(this.f264737t, this.f264787y, this.f264697p, this.f264747u);
            com.planner5d.library.application.l0 l0VarA = com.planner5d.library.application.l0.a(iVar);
            this.f264736s8 = l0VarA;
            this.f264746t8 = z1.a(this.P0, this.f264600f2, this.f264747u, this.f264726r8, this.R0, this.f264624h6, l0VarA);
            this.f264756u8 = dagger.internal.g.b(sd.l.a(this.f264699p1, this.f264600f2));
            ij.c<com.planner5d.library.model.manager.appupdate.h> cVarB = dagger.internal.g.b(com.planner5d.library.model.manager.appupdate.i.a(this.f264669m1, this.f264787y, this.f264697p));
            this.f264766v8 = cVarB;
            this.f264776w8 = com.planner5d.library.activity.helper.h2.a(this.f264706p8, this.f264656k8, this.f264685n7, this.L, this.f264747u, this.f264741t3, this.f264580d2, this.f264780x2, this.E0, this.f264669m1, this.P3, this.A, this.f264716q8, this.f264746t8, this.f264792y4, this.T2, this.f264800z2, this.J4, this.T3, this.X0, this.R0, this.O0, this.f264756u8, this.f264601f3, cVarB);
            v0 v0VarA = v0.a(u0Var, this.X);
            this.f264786x8 = v0VarA;
            ij.c<com.planner5d.library.activity.tutorial.p> cVarB2 = dagger.internal.g.b(com.planner5d.library.activity.tutorial.q.a(this.f264657l, this.f264787y, v0VarA));
            this.f264796y8 = cVarB2;
            ij.c<s1> cVarB3 = dagger.internal.g.b(y0.a(u0Var, cVarB2));
            this.f264806z8 = cVarB3;
            this.A8 = com.planner5d.library.activity.helper.c2.a(this.f264706p8, this.f264656k8, this.f264685n7, this.L, this.f264747u, this.f264741t3, this.f264580d2, this.f264780x2, this.E0, this.f264669m1, this.P3, this.A, cVarB3, this.O0);
            this.B8 = com.planner5d.library.widget.editor.editor3dcardboard.v.a(this.f264707q);
        }

        private PurchaseRequiredMessage y4(PurchaseRequiredMessage purchaseRequiredMessage) {
            com.planner5d.library.activity.fragment.dialog.message.j.c(purchaseRequiredMessage, this.P0.get());
            com.planner5d.library.activity.fragment.dialog.message.j.d(purchaseRequiredMessage, this.R0.get());
            return purchaseRequiredMessage;
        }

        private AuthenticationExternalService z3(AuthenticationExternalService authenticationExternalService) {
            com.planner5d.library.activity.fragment.dialog.authentication.a0.d(authenticationExternalService, this.f264622h4.get());
            com.planner5d.library.activity.fragment.dialog.authentication.a0.b(authenticationExternalService, this.f264731s3.get());
            return authenticationExternalService;
        }

        private RemovePersonalData z4(RemovePersonalData removePersonalData) {
            com.planner5d.library.activity.fragment.dialog.k0.f(removePersonalData, this.f264747u.get());
            com.planner5d.library.activity.fragment.dialog.k0.g(removePersonalData, this.f264632i4.get());
            com.planner5d.library.activity.fragment.dialog.k0.c(removePersonalData, this.f264740t2.get());
            com.planner5d.library.activity.fragment.dialog.k0.e(removePersonalData, w());
            com.planner5d.library.activity.fragment.dialog.k0.d(removePersonalData, C1());
            return removePersonalData;
        }

        @Override // com.planner5d.library.application.c
        public void A(ChooseRoomStyle chooseRoomStyle) {
            E3(chooseRoomStyle);
        }

        @Override // com.planner5d.library.application.c
        public com.planner5d.library.model.manager.payments.a0 A0() {
            return s0.c(this.f264607g, this.f264611g3.get());
        }

        @Override // com.planner5d.library.application.c
        public com.planner5d.library.model.manager.contest.g A1() {
            return this.f264770w2.get();
        }

        @Override // com.planner5d.library.application.c
        public void B(PublicFileProvider publicFileProvider) {
            u4(publicFileProvider);
        }

        @Override // com.planner5d.library.application.c
        public com.planner5d.library.model.manager.config.r B0() {
            return this.f264565b7.get();
        }

        @Override // com.planner5d.library.application.c
        public p4 B1() {
            return this.f264695o7.get();
        }

        @Override // com.planner5d.library.application.c
        public com.planner5d.library.activity.fragment.x C() {
            return this.R0.get();
        }

        @Override // com.planner5d.library.application.c
        public b5 C0() {
            return this.f264725r7.get();
        }

        @Override // com.planner5d.library.application.c
        public com.planner5d.library.activity.helper.j2 C1() {
            return new com.planner5d.library.activity.helper.j2(this.f264740t2.get());
        }

        @Override // com.planner5d.library.application.c
        public com.planner5d.library.services.service.b D() {
            return this.f264775w7.get();
        }

        @Override // com.planner5d.library.application.c
        public y1 D0() {
            return this.P0.get();
        }

        @Override // com.planner5d.library.application.c
        public void D1(com.planner5d.library.widget.editor.editor3dcardboard.p pVar) {
            L3(pVar);
        }

        @Override // com.planner5d.library.application.c
        public void E(FolderEdit folderEdit) {
            S3(folderEdit);
        }

        @Override // com.planner5d.library.application.c
        public void E0(com.planner5d.library.activity.fragment.dialog.purchase.g gVar) {
            k4(gVar);
        }

        @Override // com.planner5d.library.application.c
        public void E1(ManageDataFragment manageDataFragment) {
            e4(manageDataFragment);
        }

        @Override // com.planner5d.library.application.c
        public StatisticsEventAiDesigner F() {
            return f3.c(this.f264577d);
        }

        @Override // com.planner5d.library.application.c
        public j3 F0() {
            return this.S5.get();
        }

        @Override // com.planner5d.library.application.c
        public com.planner5d.library.model.manager.b2 F1() {
            return this.f264740t2.get();
        }

        @Override // com.planner5d.library.application.c
        public void G(DownloadService downloadService) {
            J3(downloadService);
        }

        @Override // com.planner5d.library.application.c
        public com.planner5d.library.modules.user.user.a0 G0() {
            return this.f264575c7.get();
        }

        @Override // com.planner5d.library.application.c
        public void G1(PurchasePagePlanRecognitions purchasePagePlanRecognitions) {
            w4(purchasePagePlanRecognitions);
        }

        @Override // com.planner5d.library.application.c
        public k1 H() {
            return this.f264585d7.get();
        }

        @Override // com.planner5d.library.application.c
        public com.planner5d.library.activity.fragment.list.d0 H0() {
            return this.f264555a7.get();
        }

        @Override // com.planner5d.library.application.c
        public void H1(PurchaseDialog purchaseDialog) {
            v4(purchaseDialog);
        }

        @Override // com.planner5d.library.application.c
        public com.planner5d.library.model.manager.y0 I() {
            return this.G0.get();
        }

        @Override // com.planner5d.library.application.c
        public void I0(Message message) {
        }

        @Override // com.planner5d.library.application.c
        public void I1(DocumentEdit documentEdit) {
        }

        @Override // com.planner5d.library.application.c
        public com.planner5d.library.modules.user.auth.r J() {
            return this.f264622h4.get();
        }

        @Override // com.planner5d.library.application.c
        public void J0(Gallery gallery) {
            U3(gallery);
        }

        @Override // com.planner5d.library.application.c
        public com.planner5d.library.model.manager.config.j J1() {
            return this.f264669m1.get();
        }

        @Override // com.planner5d.library.application.c
        public com.planner5d.library.model.manager.l K() {
            return this.U1.get();
        }

        @Override // com.planner5d.library.application.c
        public void K0(PurchasePageSnapshots purchasePageSnapshots) {
        }

        @Override // com.planner5d.library.application.c
        public com.planner5d.library.activity.helper.imagechooser.j K1() {
            return this.T3.get();
        }

        @Override // com.planner5d.library.application.c
        public void L(LicenseCheck licenseCheck) {
            b4(licenseCheck);
        }

        @Override // com.planner5d.library.application.c
        public com.planner5d.library.activity.fragment.dialog.k L0() {
            return this.f264600f2.get();
        }

        @Override // com.planner5d.library.application.c
        public sd.b L1() {
            return this.f264699p1.get();
        }

        @Override // com.planner5d.library.application.c
        public com.planner5d.library.services.upload.g M() {
            return this.V0.get();
        }

        @Override // com.planner5d.library.application.c
        public com.planner5d.library.activity.fragment.projects.w0 M0() {
            return new com.planner5d.library.activity.fragment.projects.w0(this.f264669m1.get(), this.f264600f2.get(), this.f264790y2.get(), c3(), this.G0.get(), this.P0.get(), this.f264740t2.get(), this.R0.get(), K4(), this.f264720r2.get(), this.f264712q4.get(), com.planner5d.library.uploadplan.application.e.c(), this.f264747u.get(), this.f264547a, this.f264567c, this.f264721r3.get(), s(), q3(), n2(), this.A1.get());
        }

        @Override // com.planner5d.library.application.c
        public void M1(RemovePersonalData removePersonalData) {
            z4(removePersonalData);
        }

        @Override // com.planner5d.library.application.c
        public void N(Snapshots snapshots) {
            D4(snapshots);
        }

        @Override // com.planner5d.library.application.c
        public z0 N0() {
            return this.M4.get();
        }

        @Override // com.planner5d.library.application.c
        public void N1(MainCardboard mainCardboard) {
            d4(mainCardboard);
        }

        @Override // com.planner5d.library.application.c
        public void O(ItemPropertiesDrawer itemPropertiesDrawer) {
        }

        @Override // com.planner5d.library.application.c
        public void O0(SendToGallery sendToGallery) {
        }

        @Override // com.planner5d.library.application.c
        public com.planner5d.library.services.utility.p0 O1() {
            return this.X.get();
        }

        @Override // com.planner5d.library.application.c
        public void P(GalleryPager galleryPager) {
            W3(galleryPager);
        }

        @Override // com.planner5d.library.application.c
        public void P0(FeedArticleFragment feedArticleFragment) {
            P3(feedArticleFragment);
        }

        @Override // com.planner5d.library.application.c
        public void P1(FolderSelection folderSelection) {
            T3(folderSelection);
        }

        @Override // com.planner5d.library.application.c
        public void Q(Dimensions dimensions) {
            H3(dimensions);
        }

        @Override // com.planner5d.library.application.c
        public com.planner5d.library.activity.fragment.l Q0() {
            return new com.planner5d.library.activity.fragment.l();
        }

        @Override // com.planner5d.library.application.c
        public com.planner5d.library.model.manager.synchronization.i Q1() {
            return this.f264780x2.get();
        }

        @Override // com.planner5d.library.application.c
        public com.planner5d.library.services.p R() {
            return this.f264655k7.get();
        }

        @Override // com.planner5d.library.application.c
        public v3 R0() {
            return this.f264635i7.get();
        }

        @Override // com.planner5d.library.application.c
        public com.planner5d.library.modules.user.user.w R1() {
            return k3.c(this.f264577d, this.f264747u.get());
        }

        @Override // com.planner5d.library.application.c
        public com.planner5d.library.activity.helper.b0 S() {
            return this.f264800z2.get();
        }

        @Override // com.planner5d.library.application.c
        public com.planner5d.library.application.b S0() {
            return this.f264547a;
        }

        @Override // com.planner5d.library.application.c
        public NetworkErrorUtility S1() {
            return this.f264589e1.get();
        }

        @Override // com.planner5d.library.application.c
        public com.planner5d.library.activity.fragment.j T() {
            return this.Q0.get();
        }

        @Override // com.planner5d.library.application.c
        public k5 T0() {
            return this.f264579d1.get();
        }

        @Override // com.planner5d.library.application.c
        public com.planner5d.library.model.manager.payments.b0 T1() {
            return t0.c(this.f264607g, i5());
        }

        @Override // com.planner5d.library.application.c
        public com.planner5d.library.model.manager.i1 U() {
            return this.R3.get();
        }

        @Override // com.planner5d.library.application.c
        public void U0(ComparePlansFragment comparePlansFragment) {
            F3(comparePlansFragment);
        }

        @Override // com.planner5d.library.application.c
        public com.planner5d.library.application.d U1() {
            return this.f264567c;
        }

        @Override // com.planner5d.library.application.c
        public com.planner5d.library.model.manager.managedfiles.a0 V() {
            return this.M0.get();
        }

        @Override // com.planner5d.library.application.c
        public void V0(AuthenticationExternalService authenticationExternalService) {
            z3(authenticationExternalService);
        }

        @Override // com.planner5d.library.application.c
        public s4 V1() {
            return this.f264662l4.get();
        }

        @Override // com.planner5d.library.application.c
        public com.planner5d.library.activity.fragment.feed.b W() {
            return k0.c();
        }

        @Override // com.planner5d.library.application.c
        public com.planner5d.library.model.manager.c0 W0() {
            return this.f264790y2.get();
        }

        @Override // com.planner5d.library.application.c
        public com.planner5d.library.model.manager.statistics.b0 W1() {
            return this.f264580d2.get();
        }

        @Override // com.planner5d.library.application.c
        public void X(SnapshotSetupDialog snapshotSetupDialog) {
            C4(snapshotSetupDialog);
        }

        @Override // com.planner5d.library.application.c
        public void X0(com.planner5d.library.widget.editor.catalog.z zVar) {
            C3(zVar);
        }

        @Override // com.planner5d.library.application.c
        public void X1(StartupFragment startupFragment) {
            E4(startupFragment);
        }

        @Override // com.planner5d.library.application.c
        public void Y(Editor3dFragment editor3dFragment) {
            N3(editor3dFragment);
        }

        @Override // com.planner5d.library.application.c
        public com.planner5d.library.widget.rate.g Y0() {
            return this.f264792y4.get();
        }

        @Override // com.planner5d.library.application.c
        public com.planner5d.library.activity.fragment.n Y1() {
            return this.f264721r3.get();
        }

        @Override // com.planner5d.library.application.c
        public com.planner5d.library.database.model.chat.f Z() {
            return new com.planner5d.library.database.model.chat.f(dagger.internal.g.a(this.f264755u7));
        }

        @Override // com.planner5d.library.application.c
        public void Z0(com.planner5d.library.widget.editor.editor3dcardboard.l lVar) {
            K3(lVar);
        }

        @Override // com.planner5d.library.application.c
        public com.planner5d.library.model.manager.statistics.events.i3 Z1() {
            return com.planner5d.library.application.a2.c(this.f264577d);
        }

        @Override // com.planner5d.library.application.c
        public com.planner5d.library.model.manager.statistics.d0 a() {
            return h2.c(this.f264577d, this.f264580d2.get());
        }

        @Override // com.planner5d.library.application.c
        public c1 a0() {
            return this.F1.get();
        }

        @Override // com.planner5d.library.application.c
        public void a1(PurchasePagePremiumReview purchasePagePremiumReview) {
            x4(purchasePagePremiumReview);
        }

        @Override // com.planner5d.library.application.c
        public c2 a2() {
            return this.A.get();
        }

        @Override // com.planner5d.library.application.c
        public d6 b() {
            return new d(this.f264647k);
        }

        @Override // com.planner5d.library.application.c
        public void b0(AuthenticationRemindPasswordSuccess authenticationRemindPasswordSuccess) {
        }

        @Override // com.planner5d.library.application.c
        public void b1(com.planner5d.library.activity.fragment.spaces.folder.FolderEdit folderEdit) {
        }

        @Override // com.planner5d.library.application.c
        public com.planner5d.library.services.g b2() {
            return new com.planner5d.library.services.g(this.f264600f2.get());
        }

        @Override // com.planner5d.library.application.c
        public t5 c() {
            return new c(this.f264647k);
        }

        @Override // com.planner5d.library.application.c
        public void c0(WishList wishList) {
            I4(wishList);
        }

        @Override // com.planner5d.library.application.c
        public com.planner5d.library.model.manager.f c1() {
            return this.V3.get();
        }

        @Override // com.planner5d.library.application.c
        public void c2(FeedFragment feedFragment) {
            Q3(feedFragment);
        }

        @Override // com.planner5d.library.application.c
        public t1 d() {
            return this.L.get();
        }

        @Override // com.planner5d.library.application.c
        public void d0(Project3D project3D) {
            o4(project3D);
        }

        @Override // com.planner5d.library.application.c
        public void d1(Documents documents) {
            I3(documents);
        }

        @Override // com.planner5d.library.application.c
        public hd.b d2() {
            return s3.c(this.f264587e);
        }

        @Override // com.planner5d.library.application.c
        public com.planner5d.library.model.manager.push.b e() {
            return this.f264765v7.get();
        }

        @Override // com.planner5d.library.application.c
        public void e0(SnapshotPager snapshotPager) {
            A4(snapshotPager);
        }

        @Override // com.planner5d.library.application.c
        public com.planner5d.library.model.manager.crashreporting.l e1() {
            return this.Z1.get();
        }

        @Override // com.planner5d.library.application.c
        public void e2(Main main) {
            c4(main);
        }

        @Override // com.planner5d.library.application.c
        public com.planner5d.library.services.y f() {
            return com.planner5d.library.application.y0.c(this.f264577d, M2());
        }

        @Override // com.planner5d.library.application.c
        public com.planner5d.library.model.manager.d f0() {
            return this.f264605f7.get();
        }

        @Override // com.planner5d.library.application.c
        public com.planner5d.library.model.manager.unlockeditems.b f1() {
            return this.f264679n1.get();
        }

        @Override // com.planner5d.library.application.c
        public void f2(ProjectsPagesFragment projectsPagesFragment) {
            t4(projectsPagesFragment);
        }

        @Override // com.planner5d.planner5d.h0
        public f6 g() {
            return this.f264637j;
        }

        @Override // com.planner5d.library.application.c
        public com.planner5d.library.activity.fragment.dialog.purchase.s g0() {
            return this.R2.get();
        }

        @Override // com.planner5d.library.application.c
        public void g1(com.planner5d.library.widget.tab.b bVar) {
            G4(bVar);
        }

        @Override // com.planner5d.library.application.c
        public l3 g2() {
            return com.planner5d.library.application.g3.c(this.f264577d);
        }

        @Override // com.planner5d.library.application.c
        public com.planner5d.library.api.b getApi() {
            return this.f264727s.get();
        }

        @Override // com.planner5d.library.application.c
        public com.planner5d.library.model.manager.config.d getConfigManager() {
            return this.f264759v1.get();
        }

        @Override // com.planner5d.library.application.c
        public com.planner5d.library.modules.user.user.q0 getUserProperties() {
            return this.f264701p3.get();
        }

        @Override // com.planner5d.library.application.c
        public void h(PreloaderBoxView preloaderBoxView) {
            i4(preloaderBoxView);
        }

        @Override // com.planner5d.library.application.c
        public void h0(Project2D project2D) {
            n4(project2D);
        }

        @Override // com.planner5d.library.application.c
        public void h1(com.planner5d.library.widget.editor.catalog.drawer.p pVar) {
            B3(pVar);
        }

        @Override // com.planner5d.library.application.c
        public void h2(ChooseRoomShape chooseRoomShape) {
            D3(chooseRoomShape);
        }

        @Override // com.planner5d.library.application.c
        public ia.b i() {
            return this.X2.get();
        }

        @Override // com.planner5d.library.application.c
        public void i0(ItemInfo itemInfo) {
            a4(itemInfo);
        }

        @Override // com.planner5d.library.application.c
        public com.planner5d.library.model.manager.payments.j i1() {
            return this.C1.get();
        }

        @Override // com.planner5d.library.application.c
        public com.planner5d.library.modules.user.user.t0 i2() {
            return this.A1.get();
        }

        @Override // com.planner5d.library.application.c
        public com.planner5d.library.model.manager.config.n j() {
            return this.Q2.get();
        }

        @Override // com.planner5d.library.application.c
        public void j0(PurchaseRequiredMessage purchaseRequiredMessage) {
            y4(purchaseRequiredMessage);
        }

        @Override // com.planner5d.library.application.c
        public void j1(ProjectRename projectRename) {
            q4(projectRename);
        }

        @Override // com.planner5d.library.application.c
        public void j2(ProjectConflict projectConflict) {
            p4(projectConflict);
        }

        @Override // com.planner5d.library.application.c
        public i2 k() {
            return this.f264625h7.get();
        }

        @Override // com.planner5d.library.application.c
        public void k0(com.planner5d.library.widget.editor.popup.floors.f fVar) {
            R3(fVar);
        }

        @Override // com.planner5d.library.application.c
        public com.planner5d.library.services.v k1() {
            return com.planner5d.library.application.l0.c(this.f264577d);
        }

        @Override // com.planner5d.library.application.c
        public com.planner5d.library.api.requests.c k2() {
            return new com.planner5d.library.api.requests.c(this.f264717r.get(), this.f264727s.get());
        }

        @Override // com.planner5d.library.application.c
        public com.planner5d.library.model.manager.f2 l() {
            return this.f264671m3.get();
        }

        @Override // com.planner5d.library.application.c
        public void l0(GalleryProjectFragment galleryProjectFragment) {
            X3(galleryProjectFragment);
        }

        @Override // com.planner5d.library.application.c
        public com.planner5d.library.services.g0 l1() {
            return new com.planner5d.library.services.g0(this.f264720r2.get(), com.planner5d.library.application.b0.c(this.f264577d), this.f264740t2.get(), this.G0.get(), com.planner5d.library.application.g3.c(this.f264577d));
        }

        @Override // com.planner5d.library.application.c
        public com.planner5d.library.model.manager.config.source.l l2() {
            return this.f264729s1.get();
        }

        @Override // com.planner5d.library.application.c
        public void m(DocumentPreview documentPreview) {
        }

        @Override // com.planner5d.library.application.c
        public com.planner5d.library.model.manager.c2 m0() {
            return com.planner5d.library.application.o0.c(this.f264577d, this.f264740t2.get());
        }

        @Override // com.planner5d.library.application.c
        public f1 m1() {
            return com.planner5d.library.application.b0.c(this.f264577d);
        }

        @Override // com.planner5d.library.application.c
        public com.planner5d.library.modules.user.user.y0 m2() {
            return this.f264741t3.get();
        }

        @Override // com.planner5d.library.application.c
        public com.planner5d.library.services.utility.t n() {
            return this.f264749u1.get();
        }

        @Override // com.planner5d.library.application.c
        public com.planner5d.library.services.utility.c n0() {
            return new com.planner5d.library.services.utility.c(this.f264557b);
        }

        @Override // com.planner5d.library.application.c
        public void n1(MessageWithImageDialog messageWithImageDialog) {
            f4(messageWithImageDialog);
        }

        @Override // com.planner5d.library.application.c
        public com.planner5d.library.model.manager.config.p n2() {
            return com.planner5d.library.application.v1.c(this.f264577d, this.L3.get());
        }

        @Override // com.planner5d.library.application.c
        public com.planner5d.library.model.manager.synchronization.d o() {
            return new com.planner5d.library.model.manager.synchronization.d(this.f264547a, this.f264770w2.get(), this.f264790y2.get(), dagger.internal.g.a(this.L), this.f264720r2.get(), n2(), this.A2.get(), j5(), k2());
        }

        @Override // com.planner5d.library.application.c
        public android.app.Application o0() {
            return this.f264557b;
        }

        @Override // com.planner5d.library.application.c
        public n1 o1() {
            return this.f264777x.get();
        }

        @Override // com.planner5d.library.application.c
        public void o2(AuthenticationSignInEnterCode authenticationSignInEnterCode) {
            A3(authenticationSignInEnterCode);
        }

        @Override // com.planner5d.library.application.c
        public c4 p() {
            return com.planner5d.library.application.j3.c(this.f264577d);
        }

        @Override // com.planner5d.library.application.c
        public com.planner5d.library.model.manager.spaces.documents.c p0() {
            return this.f264549a1.get();
        }

        @Override // com.planner5d.library.application.c
        public com.planner5d.library.services.download.d p1() {
            return this.f264559b1.get();
        }

        @Override // com.planner5d.library.application.c
        public e4 p2() {
            return this.A4.get();
        }

        @Override // com.planner5d.library.application.c
        public void q(ProjectSettingsBottomSheetDialog projectSettingsBottomSheetDialog) {
            r4(projectSettingsBottomSheetDialog);
        }

        @Override // com.planner5d.library.application.c
        public void q0(OrdersHistoryFragment ordersHistoryFragment) {
            h4(ordersHistoryFragment);
        }

        @Override // com.planner5d.library.application.c
        public void q1(SnapshotSetupComplete snapshotSetupComplete) {
            B4(snapshotSetupComplete);
        }

        @Override // com.planner5d.library.application.c
        public ud.b q2() {
            return this.Z6.get();
        }

        @Override // com.planner5d.library.application.c
        public com.planner5d.library.activity.fragment.list.holders.u r() {
            return new com.planner5d.library.activity.fragment.list.holders.u(this.f264720r2.get(), this.A2.get(), this.X.get(), dagger.internal.g.a(this.f264669m1), com.planner5d.library.application.b0.c(this.f264577d), this.f264549a1.get());
        }

        @Override // com.planner5d.library.application.c
        public com.planner5d.library.services.o0 r0() {
            return this.f264675m7.get();
        }

        @Override // com.planner5d.library.application.c
        public com.planner5d.library.widget.editor.helper.a2 r1() {
            return this.U3.get();
        }

        @Override // com.planner5d.library.application.c
        public com.planner5d.library.modules.user.user.t r2() {
            return this.f264747u.get();
        }

        @Override // com.planner5d.library.application.c
        public le.e s() {
            return com.planner5d.library.application.d0.c(this.f264577d, i3());
        }

        @Override // com.planner5d.library.application.c
        public void s0(FeedAllArticlesFragment feedAllArticlesFragment) {
            O3(feedAllArticlesFragment);
        }

        @Override // com.planner5d.library.application.c
        public o1 s1() {
            return com.planner5d.library.application.g0.c(this.f264577d, this.f264777x.get());
        }

        @Override // com.planner5d.library.application.c
        public com.planner5d.library.activity.fragment.smartwizard.a s2() {
            return l0.c();
        }

        @Override // com.planner5d.library.application.c
        public com.planner5d.library.services.utility.w t() {
            return new com.planner5d.library.services.utility.w(J4(), com.planner5d.library.application.b0.c(this.f264577d));
        }

        @Override // com.planner5d.library.application.c
        public com.planner5d.library.activity.helper.r t0() {
            return this.X0.get();
        }

        @Override // com.planner5d.library.application.c
        public void t1(ImproveSnapshotWithAi improveSnapshotWithAi) {
            Z3(improveSnapshotWithAi);
        }

        @Override // com.planner5d.library.application.c
        public void t2(Projects projects) {
            s4(projects);
        }

        @Override // com.planner5d.library.application.c
        public s2 u() {
            return this.f264735s7.get();
        }

        @Override // com.planner5d.library.application.c
        public void u0(PremiumFeaturesDialog premiumFeaturesDialog) {
            j4(premiumFeaturesDialog);
        }

        @Override // com.planner5d.library.application.c
        public void u1(ProfileEditFragment profileEditFragment) {
            l4(profileEditFragment);
        }

        @Override // com.planner5d.library.application.c
        public com.planner5d.library.model.manager.spaces.b u2() {
            return this.Z0.get();
        }

        @Override // com.planner5d.library.application.c
        public void v(StartupPaywall startupPaywall) {
            F4(startupPaywall);
        }

        @Override // com.planner5d.library.application.c
        public void v0(UserMessage userMessage) {
            H4(userMessage);
        }

        @Override // com.planner5d.library.application.c
        public com.planner5d.library.services.utility.g1 v1() {
            return this.Y6.get();
        }

        @Override // com.planner5d.library.application.c
        public com.planner5d.library.model.manager.project.d0 v2() {
            return this.f264720r2.get();
        }

        @Override // com.planner5d.library.application.c
        public com.planner5d.library.activity.helper.m2 w() {
            return new com.planner5d.library.activity.helper.m2(C1());
        }

        @Override // com.planner5d.library.application.c
        public com.planner5d.library.model.manager.builtin.i w0() {
            return this.f264757v.get();
        }

        @Override // com.planner5d.library.application.c
        public ErrorMessageParser w1() {
            return this.f264730s2.get();
        }

        @Override // com.planner5d.library.application.c
        public void w2(ProfileFragment profileFragment) {
            m4(profileFragment);
        }

        @Override // com.planner5d.library.application.c
        public r3 x() {
            return com.planner5d.library.application.c2.c(this.f264577d);
        }

        @Override // com.planner5d.library.application.c
        public androidx.lifecycle.j2.c x0() {
            return this.S6.get();
        }

        @Override // com.planner5d.library.application.c
        public com.planner5d.library.database.model.chat.d x1() {
            return new com.planner5d.library.database.model.chat.d(dagger.internal.g.a(this.f264745t7), E2());
        }

        @Override // com.planner5d.library.application.c
        public void x2(DecoratorFragment decoratorFragment) {
            G3(decoratorFragment);
        }

        @Override // com.planner5d.library.application.c
        public com.planner5d.library.services.t y() {
            return this.f264665l7.get();
        }

        @Override // com.planner5d.library.application.c
        public com.planner5d.library.modules.user.user.z0 y0() {
            return this.f264681n3.get();
        }

        @Override // com.planner5d.library.application.c
        public com.planner5d.library.activity.helper.x y1() {
            return this.f264615g7.get();
        }

        @Override // com.planner5d.library.application.c
        public void y2(GalleryPage galleryPage) {
            V3(galleryPage);
        }

        @Override // com.planner5d.library.application.c
        public com.planner5d.library.model.manager.initialization.r z() {
            return this.f264711q3.get();
        }

        @Override // com.planner5d.library.application.c
        public com.planner5d.library.model.a z0() {
            return j0.c();
        }

        @Override // com.planner5d.library.application.c
        public ce.b z1() {
            return p0.c(this.f264597f, f3());
        }

        @Override // com.planner5d.library.application.c
        public void z2(OnboardingSignInDialog onboardingSignInDialog) {
            g4(onboardingSignInDialog);
        }

        private b(com.planner5d.library.application.i iVar, gb.a aVar, com.planner5d.planner5d.b bVar, com.planner5d.library.application.designoftheday.a aVar2, u0 u0Var, q3 q3Var, n0 n0Var, f0 f0Var, com.planner5d.library.help.application.c cVar, r0 r0Var, t tVar, com.planner5d.library.legal.application.c cVar2, o4 o4Var, com.planner5d.library.spaces.application.c cVar3, com.planner5d.library.application.b bVar2, android.app.Application application, com.planner5d.library.application.d dVar, f6 f6Var) {
            this.f264647k = this;
            this.f264547a = bVar2;
            this.f264557b = application;
            this.f264567c = dVar;
            this.f264577d = iVar;
            this.f264587e = q3Var;
            this.f264597f = n0Var;
            this.f264607g = r0Var;
            this.f264617h = tVar;
            this.f264627i = aVar2;
            this.f264637j = f6Var;
            t3(iVar, aVar, bVar, aVar2, u0Var, q3Var, n0Var, f0Var, cVar, r0Var, tVar, cVar2, o4Var, cVar3, bVar2, application, dVar, f6Var);
            u3(iVar, aVar, bVar, aVar2, u0Var, q3Var, n0Var, f0Var, cVar, r0Var, tVar, cVar2, o4Var, cVar3, bVar2, application, dVar, f6Var);
            v3(iVar, aVar, bVar, aVar2, u0Var, q3Var, n0Var, f0Var, cVar, r0Var, tVar, cVar2, o4Var, cVar3, bVar2, application, dVar, f6Var);
            w3(iVar, aVar, bVar, aVar2, u0Var, q3Var, n0Var, f0Var, cVar, r0Var, tVar, cVar2, o4Var, cVar3, bVar2, application, dVar, f6Var);
            x3(iVar, aVar, bVar, aVar2, u0Var, q3Var, n0Var, f0Var, cVar, r0Var, tVar, cVar2, o4Var, cVar3, bVar2, application, dVar, f6Var);
            y3(iVar, aVar, bVar, aVar2, u0Var, q3Var, n0Var, f0Var, cVar, r0Var, tVar, cVar2, o4Var, cVar3, bVar2, application, dVar, f6Var);
        }
    }

    private static final class c implements t5 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final b f264807b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final c f264808c;

        @Override // com.planner5d.library.application.t5
        public u1 d() {
            return this.f264807b.J4();
        }

        private c(b bVar) {
            this.f264808c = this;
            this.f264807b = bVar;
        }
    }

    private static final class d implements d6 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final b f264809a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final d f264810b;

        private CarouselView a(CarouselView carouselView) {
            com.planner5d.library.widget.carousel.c.b(carouselView, (com.planner5d.library.services.bitmaploader.d) this.f264809a.D0.get());
            com.planner5d.library.widget.carousel.c.c(carouselView, com.planner5d.library.application.b0.c(this.f264809a.f264577d));
            return carouselView;
        }

        private ColorPickerCompact b(ColorPickerCompact colorPickerCompact) {
            com.planner5d.library.widget.colorpicker.b.b(colorPickerCompact, (com.planner5d.library.services.utility.p0) this.f264809a.X.get());
            return colorPickerCompact;
        }

        private PreloaderBoxV2View c(PreloaderBoxV2View preloaderBoxV2View) {
            com.planner5d.library.widget.preloader.m.b(preloaderBoxV2View, dagger.internal.g.a(this.f264809a.X));
            return preloaderBoxV2View;
        }

        private PreloaderBoxView d(PreloaderBoxView preloaderBoxView) {
            com.planner5d.library.widget.preloader.s.b(preloaderBoxView, (com.planner5d.library.services.utility.p0) this.f264809a.X.get());
            com.planner5d.library.widget.preloader.s.d(preloaderBoxView, com.planner5d.library.application.m2.c(this.f264809a.f264577d));
            return preloaderBoxView;
        }

        private PreloaderDialogView e(PreloaderDialogView preloaderDialogView) {
            com.planner5d.library.widget.preloader.a0.b(preloaderDialogView, dagger.internal.g.a(this.f264809a.X));
            return preloaderDialogView;
        }

        @Override // com.planner5d.library.application.d6
        public com.planner5d.library.services.y f() {
            return this.f264809a.f();
        }

        @Override // com.planner5d.library.application.d6
        public f1 g() {
            return com.planner5d.library.application.b0.c(this.f264809a.f264577d);
        }

        @Override // com.planner5d.library.application.d6
        public void h(PreloaderBoxView preloaderBoxView) {
            d(preloaderBoxView);
        }

        @Override // com.planner5d.library.application.d6
        public void i(ColorPickerCompact colorPickerCompact) {
            b(colorPickerCompact);
        }

        @Override // com.planner5d.library.application.d6
        public void j(PreloaderBoxV2View preloaderBoxV2View) {
            c(preloaderBoxV2View);
        }

        @Override // com.planner5d.library.application.d6
        public u1 k() {
            return this.f264809a.J4();
        }

        @Override // com.planner5d.library.application.d6
        public void l(CarouselView carouselView) {
            a(carouselView);
        }

        @Override // com.planner5d.library.application.d6
        public void m(PreloaderDialogView preloaderDialogView) {
            e(preloaderDialogView);
        }

        @Override // com.planner5d.library.application.d6
        public void n(com.github.danielnilsson9.colorpickerview.view.b bVar) {
        }

        private d(b bVar) {
            this.f264810b = this;
            this.f264809a = bVar;
        }
    }

    private q() {
    }

    public static h0.a a() {
        return new a();
    }
}
