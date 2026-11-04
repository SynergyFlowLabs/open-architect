package com.planner5d.library.application;

import android.app.Application;
import android.content.SharedPreferences;
import com.planner5d.library.activity.Main;
import com.planner5d.library.activity.MainCardboard;
import com.planner5d.library.activity.fragment.compareplans.ComparePlansFragment;
import com.planner5d.library.activity.fragment.dialog.FolderSelection;
import com.planner5d.library.activity.fragment.dialog.ProjectConflict;
import com.planner5d.library.activity.fragment.dialog.RemovePersonalData;
import com.planner5d.library.activity.fragment.dialog.authentication.AuthenticationExternalService;
import com.planner5d.library.activity.fragment.dialog.authentication.AuthenticationRemindPasswordSuccess;
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
import com.planner5d.library.database.ApplicationDatabase;
import com.planner5d.library.model.item.builder.ItemBuilder;
import com.planner5d.library.model.item.builder.ItemBuilder_Factory;
import com.planner5d.library.model.manager.statistics.events.StatisticsEventAiDesigner;
import com.planner5d.library.services.download.DownloadService;
import com.planner5d.library.services.exceptions.ErrorMessageParser;
import com.planner5d.library.services.exceptions.ErrorMessageParser_Factory;
import com.planner5d.library.services.exceptions.NetworkErrorUtility;
import com.planner5d.library.services.exceptions.NetworkErrorUtility_Factory;
import com.planner5d.library.services.share.PublicFileProvider;
import com.planner5d.library.widget.carousel.CarouselView;
import com.planner5d.library.widget.colorpicker.ColorPickerCompact;
import com.planner5d.library.widget.editor.popup.itemproperties.ItemPropertiesDrawer;
import com.planner5d.library.widget.preloader.PreloaderBoxV2View;
import com.planner5d.library.widget.preloader.PreloaderBoxView;
import com.planner5d.library.widget.preloader.PreloaderDialogView;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
@dagger.internal.e
public final class m3 {

    private static final class a implements com.planner5d.library.application.c {
        private ij.c<com.planner5d.library.services.utility.w1> A;
        private ij.c<com.planner5d.library.model.converter.json.to.k> A0;
        private ij.c<com.planner5d.library.model.manager.h> A1;
        private ij.c<com.planner5d.library.model.manager.initialization.r.a> A2;
        private ij.c<com.planner5d.library.activity.fragment.dialog.authentication.k1> A3;
        private ij.c<com.planner5d.library.activity.fragment.snapshots.k0> A4;
        private ij.c<com.planner5d.library.model.manager.uploadplan.a> A5;
        private ij.c<com.planner5d.library.activity.fragment.dialog.purchase.f0.b> A6;
        private ij.c<com.planner5d.library.widget.editor.helper.r1> A7;
        private ij.c<com.planner5d.library.model.manager.n1> B;
        private ij.c<com.planner5d.library.model.converter.json.to.t> B0;
        private ij.c<com.planner5d.library.model.manager.v2> B1;
        private ij.c<com.planner5d.library.services.utility.f2> B2;
        private ij.c<com.planner5d.library.model.manager.s4> B3;
        private ij.c<com.planner5d.library.activity.fragment.snapshots.h> B4;
        private ij.c<com.planner5d.library.activity.fragment.feed.interactor.i> B5;
        private com.planner5d.library.activity.fragment.dialog.video.g B6;
        private ij.c<com.planner5d.library.widget.editor.helper.u2> B7;
        private ij.c<com.planner5d.library.model.manager.config.p> C;
        private ij.c<com.planner5d.library.model.converter.json.to.b> C0;
        private ij.c<com.planner5d.library.model.payments.paymentmethod.g> C1;
        private ij.c<com.planner5d.library.model.manager.builtin.l0> C2;
        private ij.c<com.planner5d.library.model.manager.statistics.events.m3> C3;
        private ij.c<ed.a> C4;
        private ij.c<ka.d> C5;
        private ij.c<com.planner5d.library.activity.fragment.dialog.video.f.a> C6;
        private ij.c<com.planner5d.library.widget.editor.interactor.a> C7;
        private ij.c<com.planner5d.library.userimporteddata.n> D;
        private ij.c<com.planner5d.library.model.converter.json.to.o> D0;
        private ij.c<com.planner5d.library.model.payments.paymentmethod.e> D1;
        private ij.c<com.planner5d.library.interactor.k> D2;
        private ij.c<com.planner5d.library.activity.fragment.list.l1> D3;
        private ij.c<com.planner5d.library.model.manager.menu.a> D4;
        private ij.c<com.planner5d.library.model.manager.statistics.events.j3> D5;
        private ij.c<Map<Class<? extends androidx.lifecycle.f2>, com.planner5d.library.services.utility.f<? extends androidx.lifecycle.f2>>> D6;
        private ij.c<cf.a> D7;
        private ij.c<com.planner5d.library.services.utility.c2> E;
        private ij.c<com.planner5d.library.model.manager.builtin.p> E0;
        private ij.c<com.planner5d.library.modules.user.user.t0> E1;
        private ij.c<le.f> E2;
        private ij.c<com.planner5d.library.activity.fragment.projects.g> E3;
        private ij.c<com.planner5d.library.modules.user.user.z> E4;
        private ij.c<com.planner5d.library.feed.data.g> E5;
        private ij.c<com.planner5d.library.services.utility.g1> E6;
        private ij.c<com.planner5d.library.interactor.f0> E7;
        private ij.c<com.planner5d.library.services.utility.g3> F;
        private ij.c<com.planner5d.library.services.bitmaploader.cache.a> F0;
        private ij.c<com.planner5d.library.modules.user.user.u0> F1;
        private ij.c<com.planner5d.library.model.manager.config.source.a> F2;
        private ij.c<com.planner5d.library.activity.fragment.projects.c0> F3;
        private ij.c<com.planner5d.library.activity.fragment.profile.x> F4;
        private ij.c<com.planner5d.library.activity.fragment.feed.interactor.g> F5;
        private ij.c<ud.b> F6;
        private ij.c<le.k> F7;
        private ij.c<com.planner5d.library.modules.user.user.w> G;
        private ij.c<com.planner5d.library.services.bitmaploader.background.b> G0;
        private ij.c<com.planner5d.library.model.manager.payments.j> G1;
        private ij.c<hd.b> G2;
        private ij.c<com.planner5d.library.activity.fragment.projects.z0> G3;
        private ij.c<com.planner5d.library.activity.fragment.profile.edit.n> G4;
        private ij.c<ka.c> G5;
        private ij.c<com.planner5d.library.activity.fragment.list.d0> G6;
        private ij.c<com.planner5d.library.widget.editor.helper.n2.a> G7;
        private ij.c<com.planner5d.library.userimporteddata.g> H;
        private ij.c<com.planner5d.library.services.bitmaploader.d> H0;
        private ij.c<com.planner5d.library.model.manager.payments.k> H1;
        private ij.c<com.planner5d.library.model.manager.crashreporting.v> H2;
        private ij.c<com.planner5d.library.activity.fragment.feed.b> H3;
        private ij.c<com.planner5d.library.activity.fragment.profile.edit.item.e> H4;
        private ij.c<com.planner5d.library.activity.fragment.feed.interactor.e> H5;
        private ij.c<com.planner5d.library.model.manager.config.r> H6;
        private ij.c<com.planner5d.library.widget.editor.helper.g1> H7;
        private ij.c<com.planner5d.library.database.migration.h> I;
        private ij.c<com.planner5d.library.model.manager.builtin.n> I0;
        private ij.c<com.planner5d.library.model.payments.paymentmethod.i> I1;
        private ij.c<com.planner5d.library.model.manager.performancetracing.e> I2;
        private ij.c<com.planner5d.library.feed.data.a> I3;
        private ij.c<com.planner5d.library.activity.fragment.profile.edit.password.f> I4;
        private ij.c<ka.b> I5;
        private ij.c<com.planner5d.library.modules.user.user.a0> I6;
        private ij.c<com.planner5d.library.widget.editor.editor3d.q> I7;
        private ij.c<com.planner5d.library.database.migration.p> J;
        private ij.c<com.planner5d.library.model.manager.w0> J0;
        private ij.c<com.planner5d.library.model.manager.c1> J1;
        private ij.c<com.planner5d.library.model.manager.crashreporting.d0> J2;
        private ij.c<com.planner5d.library.model.manager.b> J3;
        private ij.c<com.planner5d.library.activity.fragment.profile.orders.l> J4;
        private ij.c<com.planner5d.library.feed.data.d> J5;
        private ij.c<com.planner5d.library.model.manager.k1> J6;
        private ij.c<com.planner5d.library.services.licensing.a<?>> J7;
        private ij.c<com.planner5d.library.database.migration.r> K;
        private ij.c<com.planner5d.library.model.manager.y0> K0;
        private ij.c<com.planner5d.library.model.manager.e1> K1;
        private ij.c<com.planner5d.library.model.manager.config.sql.l> K2;
        private ij.c<com.planner5d.library.activity.helper.j2> K3;
        private ij.c<com.planner5d.library.activity.fragment.gallery.k0> K4;
        private ij.c<ic.a> K5;
        private ij.c<com.planner5d.library.model.manager.contest.b> K6;
        private ij.c<com.planner5d.library.activity.helper.i0> K7;
        private ij.c<ad.b> L;
        private ij.c<com.planner5d.library.model.r> L0;
        private ij.c<com.planner5d.library.model.manager.payments.e> L1;
        private ij.c<com.planner5d.library.api.support.l> L2;
        private ij.c<com.planner5d.library.activity.helper.m2> L3;
        private ij.c<com.planner5d.library.activity.fragment.gallery.v> L4;
        private ij.c<com.planner5d.library.feed.usecase.b> L5;
        private ij.c<com.planner5d.library.model.manager.d> L6;
        private ij.c<com.planner5d.library.model.manager.p5> L7;
        private ij.c<ApplicationDatabase.a> M;
        private ij.c<com.planner5d.library.model.manager.builtin.materialsmetadataloading.d.a> M0;
        private ij.c<com.planner5d.library.services.utility.a2> M1;
        private ij.c<com.planner5d.library.api.support.p> M2;
        private ij.c<com.planner5d.library.activity.helper.e> M3;
        private ij.c<com.planner5d.library.activity.fragment.gallery.x> M4;
        private ij.c<com.planner5d.library.model.manager.p> M5;
        private ij.c<com.planner5d.library.activity.helper.x> M6;
        private ij.c<com.planner5d.library.model.converter.json.to.f> M7;
        private ij.c<ApplicationDatabase> N;
        private ij.c<com.planner5d.library.model.manager.builtin.materialsmetadataloading.b.a> N0;
        private ij.c<com.planner5d.library.model.manager.payments.v> N1;
        private ij.c<com.planner5d.library.api.support.b> N2;
        private ij.c<com.planner5d.library.model.manager.favorite.c> N3;
        private ij.c<com.planner5d.library.activity.fragment.gallery.p0> N4;
        private ij.c<com.planner5d.library.activity.fragment.feed.interactor.c> N5;
        private ij.c<com.planner5d.library.model.manager.i2> N6;
        private ij.c<com.planner5d.library.activity.helper.u> N7;
        private ij.c<com.planner5d.library.userimporteddata.b> O;
        private ij.c<com.planner5d.library.model.manager.builtin.v0> O0;
        private ij.c<com.planner5d.library.model.region.h> O1;
        private ij.c<com.planner5d.library.modules.user.user.g1> O2;
        private ij.c<com.planner5d.library.model.manager.favorite.room.a> O3;
        private ij.c<com.planner5d.library.interactor.n0> O4;
        private ij.c<com.planner5d.library.feed.usecase.a> O5;
        private ij.c<com.planner5d.library.model.manager.statistics.events.v3> O6;
        private ij.c<com.planner5d.library.activity.helper.f0> O7;
        private ij.c<com.planner5d.library.model.manager.t1> P;
        private ij.c<com.planner5d.library.model.manager.builtin.g0> P0;
        private ij.c<com.planner5d.library.model.region.j> P1;
        private ij.c<com.planner5d.library.model.manager.project.d0> P2;
        private ij.c<com.planner5d.library.database.model.h> P3;
        private ij.c<le.o> P4;
        private ij.c<com.planner5d.library.activity.fragment.feed.e1> P5;
        private ij.c<com.planner5d.library.model.manager.v4> P6;
        private ij.c<com.planner5d.library.modules.user.user.e0> P7;
        private ij.c<com.planner5d.library.model.manager.u1> Q;
        private ij.c<com.planner5d.library.model.manager.managedfiles.a0> Q0;
        private ij.c<com.planner5d.library.model.region.f> Q1;
        private ij.c<ErrorMessageParser> Q2;
        private ij.c<com.planner5d.library.model.manager.favorite.a> Q3;
        private ij.c<com.planner5d.library.model.i> Q4;
        private ij.c<com.planner5d.library.activity.fragment.smartwizard.t> Q5;
        private ij.c<com.planner5d.library.model.manager.p4> Q6;
        private ij.c<com.planner5d.library.services.v> Q7;
        private ij.c<com.planner5d.library.userimporteddata.i> R;
        private ij.c<com.planner5d.library.services.download.a> R0;
        private ij.c<com.planner5d.library.model.region.b> R1;
        private ij.c<com.planner5d.library.model.manager.b2> R2;
        private ij.c<com.planner5d.library.model.manager.q0> R3;
        private ij.c<com.planner5d.library.activity.fragment.gallery.m> R4;
        private ij.c<com.planner5d.library.activity.fragment.smartwizard.v> R5;
        private ij.c<com.planner5d.library.model.manager.s2> R6;
        private ij.c<com.planner5d.library.activity.helper.m1> R7;
        private ij.c<com.planner5d.library.services.z> S;
        private ij.c<com.planner5d.library.model.manager.j2> S0;
        private ij.c<com.planner5d.library.services.e0> S1;
        private ij.c<com.planner5d.library.model.manager.statistics.events.l3> S2;
        private ij.c<com.planner5d.library.widget.rate.e> S3;
        private ij.c<com.planner5d.library.activity.fragment.gallery.project.k> S4;
        private ij.c<sd.e> S5;
        private ij.c<com.planner5d.library.database.model.chat.b> S6;
        private ij.c<sd.k> S7;
        private ij.c<com.planner5d.library.services.utility.i1> T;
        private ij.c<com.planner5d.library.model.manager.y1> T0;
        private ij.c<com.planner5d.library.model.manager.payments.r> T1;
        private ij.c<com.planner5d.library.services.g0> T2;
        private ij.c<com.planner5d.library.widget.rate.a> T3;
        private ij.c<com.planner5d.library.activity.fragment.dialog.purchase.v> T4;
        private ij.c<oa.d> T5;
        private ij.c<com.planner5d.library.database.model.chat.i> T6;
        private ij.c<com.planner5d.library.model.manager.appupdate.h> T7;
        private ij.c<com.planner5d.library.services.bitmaploader.d.g> U;
        private ij.c<com.planner5d.library.activity.fragment.j> U0;
        private ij.c<com.planner5d.library.model.manager.payments.p> U1;
        private ij.c<com.planner5d.library.model.manager.contest.g> U2;
        private ij.c<com.planner5d.library.widget.rate.g> U3;
        private ij.c<com.planner5d.library.activity.fragment.dialog.purchase.c.a> U4;
        private ij.c<oa.f> U5;
        private ij.c<com.planner5d.library.services.service.b> U6;
        private ij.c<com.planner5d.library.activity.helper.e2> U7;
        private ij.c<com.planner5d.library.services.filedownloader.c.a> V;
        private ij.c<com.planner5d.library.activity.fragment.x> V0;
        private ij.c<com.planner5d.library.modules.user.user.g0> V1;
        private ij.c<com.planner5d.library.model.manager.synchronization.i> V2;
        private ij.c<com.planner5d.library.activity.fragment.startup.e> V3;
        private ij.c<com.planner5d.library.activity.fragment.dialog.purchase.premium.p> V4;
        private ij.c<com.planner5d.library.activity.fragment.smartwizard.roomshape.f> V5;
        private ij.c<com.planner5d.library.model.manager.builtin.y0> V6;
        private ij.c<com.planner5d.library.widget.s1> V7;
        private ij.c<com.planner5d.library.model.manager.k> W;
        private ij.c<com.planner5d.library.model.manager.i> W0;
        private ij.c<com.planner5d.library.model.manager.w1> W1;
        private ij.c<com.planner5d.library.model.manager.c0> W2;
        private ij.c<com.planner5d.library.model.manager.config.n> W3;
        private ij.c<com.planner5d.library.activity.fragment.dialog.purchase.designgenerator.g> W4;
        private ij.c<com.planner5d.library.activity.fragment.smartwizard.dimensions.interactor.a> W5;
        private ij.c<com.planner5d.library.model.manager.c3> W6;
        private ij.c<com.planner5d.library.activity.helper.b2> W7;
        private ij.c<com.planner5d.library.services.backgroundexecutor.g> X;
        private ij.c<com.planner5d.library.services.render.a> X0;
        private ij.c<com.planner5d.library.model.manager.w> X1;
        private ij.c<com.planner5d.library.activity.helper.b0> X2;
        private ij.c<com.planner5d.library.activity.fragment.dialog.purchase.s> X3;
        private ij.c<com.planner5d.library.activity.fragment.dialog.purchase.snapshots.h> X4;
        private ij.c<na.a> X5;
        private ij.c<com.planner5d.library.widget.editor.catalog.g> X6;
        private ij.c<com.planner5d.library.widget.editor.editor3dcardboard.u> X7;
        private ij.c<com.planner5d.library.services.filedownloader.c> Y;
        private ij.c<com.planner5d.library.services.upload.a> Y0;
        private ij.c<com.planner5d.library.model.manager.l> Y1;
        private ij.c<com.planner5d.library.model.manager.b4> Y2;
        private ij.c<ia.d> Y3;
        private ij.c<com.planner5d.library.activity.fragment.dialog.purchase.textures.c> Y4;
        private ij.c<na.b> Y5;
        private ij.c<com.planner5d.library.model.manager.m2> Y6;
        private ij.c<com.planner5d.library.userimporteddata.l> Z;
        private ij.c<com.planner5d.library.services.upload.g> Z0;
        private ij.c<com.planner5d.library.model.manager.managedfiles.d> Z1;
        private ij.c<com.planner5d.library.model.manager.d4> Z2;
        private ij.c<com.planner5d.library.model.manager.statistics.events.t3> Z3;
        private ij.c<com.planner5d.library.activity.fragment.dialog.purchase.recognitions.d> Z4;
        private ij.c<na.c> Z5;
        private ij.c<com.planner5d.library.widget.editor.popup.e> Z6;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final com.planner5d.library.application.b f142616a;

        /* JADX INFO: renamed from: a0, reason: collision with root package name */
        private ij.c<com.planner5d.library.services.utility.p0.a> f142617a0;

        /* JADX INFO: renamed from: a1, reason: collision with root package name */
        private ij.c<com.planner5d.library.database.model.spaces.documents.d> f142618a1;

        /* JADX INFO: renamed from: a2, reason: collision with root package name */
        private ij.c<com.planner5d.library.model.manager.managedfiles.t> f142619a2;

        /* JADX INFO: renamed from: a3, reason: collision with root package name */
        private ij.c<com.planner5d.library.model.manager.d5> f142620a3;

        /* JADX INFO: renamed from: a4, reason: collision with root package name */
        private ij.c<com.planner5d.library.model.manager.statistics.k> f142621a4;

        /* JADX INFO: renamed from: a5, reason: collision with root package name */
        private ij.c<com.planner5d.library.modules.user.user.o0> f142622a5;

        /* JADX INFO: renamed from: a6, reason: collision with root package name */
        private ij.c<com.planner5d.library.activity.fragment.smartwizard.dimensions.t> f142623a6;

        /* JADX INFO: renamed from: a7, reason: collision with root package name */
        private ij.c<com.planner5d.library.widget.editor.controls.a> f142624a7;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Application f142625b;

        /* JADX INFO: renamed from: b0, reason: collision with root package name */
        private ij.c<com.planner5d.library.services.utility.p0> f142626b0;

        /* JADX INFO: renamed from: b1, reason: collision with root package name */
        private ij.c<com.planner5d.library.activity.helper.r> f142627b1;

        /* JADX INFO: renamed from: b2, reason: collision with root package name */
        private ij.c<com.planner5d.library.model.manager.managedfiles.p.a> f142628b2;

        /* JADX INFO: renamed from: b3, reason: collision with root package name */
        private ij.c<com.planner5d.library.model.manager.synchronization.d> f142629b3;

        /* JADX INFO: renamed from: b4, reason: collision with root package name */
        private ij.c<com.planner5d.library.activity.fragment.dialog.y> f142630b4;

        /* JADX INFO: renamed from: b5, reason: collision with root package name */
        private ij.c<com.planner5d.library.activity.fragment.profile.promocode.e> f142631b5;

        /* JADX INFO: renamed from: b6, reason: collision with root package name */
        private ij.c<com.planner5d.library.activity.fragment.smartwizard.roomstyle.interactor.f> f142632b6;

        /* JADX INFO: renamed from: b7, reason: collision with root package name */
        private ij.c<com.planner5d.library.model.manager.u0> f142633b7;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final com.planner5d.library.application.d f142634c;

        /* JADX INFO: renamed from: c0, reason: collision with root package name */
        private ij.c<com.planner5d.library.model.converter.json.from.x> f142635c0;

        /* JADX INFO: renamed from: c1, reason: collision with root package name */
        private ij.c<com.planner5d.library.database.model.spaces.d> f142636c1;

        /* JADX INFO: renamed from: c2, reason: collision with root package name */
        private ij.c<com.planner5d.library.model.manager.initialization.x> f142637c2;

        /* JADX INFO: renamed from: c3, reason: collision with root package name */
        private ij.c<com.planner5d.library.model.converter.json.from.q> f142638c3;

        /* JADX INFO: renamed from: c4, reason: collision with root package name */
        private ij.c<com.planner5d.library.activity.fragment.dialog.z> f142639c4;

        /* JADX INFO: renamed from: c5, reason: collision with root package name */
        private ij.c<com.planner5d.library.activity.fragment.dialog.send_to_gallery.l> f142640c5;

        /* JADX INFO: renamed from: c6, reason: collision with root package name */
        private ij.c<pa.d> f142641c6;

        /* JADX INFO: renamed from: c7, reason: collision with root package name */
        private ij.c<com.planner5d.library.activity.fragment.c0> f142642c7;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final i f142643d;

        /* JADX INFO: renamed from: d0, reason: collision with root package name */
        private ij.c<com.planner5d.library.model.converter.json.from.z> f142644d0;

        /* JADX INFO: renamed from: d1, reason: collision with root package name */
        private ij.c<com.planner5d.library.model.manager.spaces.b> f142645d1;

        /* JADX INFO: renamed from: d2, reason: collision with root package name */
        private ij.c<com.planner5d.library.model.manager.crashreporting.l> f142646d2;

        /* JADX INFO: renamed from: d3, reason: collision with root package name */
        private ij.c<com.planner5d.library.model.manager.project.c> f142647d3;

        /* JADX INFO: renamed from: d4, reason: collision with root package name */
        private ij.c<com.planner5d.library.model.manager.project.h0> f142648d4;

        /* JADX INFO: renamed from: d5, reason: collision with root package name */
        private ij.c<com.planner5d.library.activity.helper.f1> f142649d5;

        /* JADX INFO: renamed from: d6, reason: collision with root package name */
        private ij.c<com.planner5d.library.activity.fragment.smartwizard.roomstyle.interactor.i> f142650d6;

        /* JADX INFO: renamed from: d7, reason: collision with root package name */
        private ij.c<com.planner5d.library.widget.editor.itemactionsbar.h> f142651d7;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final q3 f142652e;

        /* JADX INFO: renamed from: e0, reason: collision with root package name */
        private ij.c<com.planner5d.library.model.converter.json.from.c0> f142653e0;

        /* JADX INFO: renamed from: e1, reason: collision with root package name */
        private ij.c<com.planner5d.library.model.manager.spaces.documents.c> f142654e1;

        /* JADX INFO: renamed from: e2, reason: collision with root package name */
        private ij.c<com.planner5d.library.model.manager.initialization.b0> f142655e2;

        /* JADX INFO: renamed from: e3, reason: collision with root package name */
        private ij.c<com.planner5d.library.model.manager.project.m0.a> f142656e3;

        /* JADX INFO: renamed from: e4, reason: collision with root package name */
        private ij.c<com.planner5d.library.widget.editor.helper.n3> f142657e4;

        /* JADX INFO: renamed from: e5, reason: collision with root package name */
        private ij.c<com.planner5d.library.model.manager.c2> f142658e5;

        /* JADX INFO: renamed from: e6, reason: collision with root package name */
        private ij.c<pa.e> f142659e6;

        /* JADX INFO: renamed from: e7, reason: collision with root package name */
        private ij.c<com.planner5d.library.widget.editor.helper.k2.a> f142660e7;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final j5 f142661f;

        /* JADX INFO: renamed from: f0, reason: collision with root package name */
        private ij.c<dd.a> f142662f0;

        /* JADX INFO: renamed from: f1, reason: collision with root package name */
        private ij.c<com.planner5d.library.services.download.d> f142663f1;

        /* JADX INFO: renamed from: f2, reason: collision with root package name */
        private ij.c<com.planner5d.library.model.manager.statistics.f> f142664f2;

        /* JADX INFO: renamed from: f3, reason: collision with root package name */
        private ij.c<com.planner5d.library.model.manager.project.m0> f142665f3;

        /* JADX INFO: renamed from: f4, reason: collision with root package name */
        private ij.c<com.planner5d.library.widget.editor.helper.o3> f142666f4;

        /* JADX INFO: renamed from: f5, reason: collision with root package name */
        private ij.c<com.planner5d.library.activity.fragment.dialog.snapshots.n> f142667f5;

        /* JADX INFO: renamed from: f6, reason: collision with root package name */
        private ij.c<com.planner5d.library.activity.fragment.smartwizard.roomstyle.interactor.d> f142668f6;

        /* JADX INFO: renamed from: f7, reason: collision with root package name */
        private ij.c<ec.e> f142669f7;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final q4 f142670g;

        /* JADX INFO: renamed from: g0, reason: collision with root package name */
        private ij.c<com.planner5d.library.model.converter.json.from.a> f142671g0;

        /* JADX INFO: renamed from: g1, reason: collision with root package name */
        private ij.c<com.planner5d.library.services.utility.w> f142672g1;

        /* JADX INFO: renamed from: g2, reason: collision with root package name */
        private ij.c<com.planner5d.library.model.manager.statistics.i> f142673g2;

        /* JADX INFO: renamed from: g3, reason: collision with root package name */
        private ij.c<com.planner5d.library.modules.user.user.d> f142674g3;

        /* JADX INFO: renamed from: g4, reason: collision with root package name */
        private ij.c<ia.b> f142675g4;

        /* JADX INFO: renamed from: g5, reason: collision with root package name */
        private ij.c<com.planner5d.library.model.manager.s0> f142676g5;

        /* JADX INFO: renamed from: g6, reason: collision with root package name */
        private ij.c<pa.c> f142677g6;

        /* JADX INFO: renamed from: g7, reason: collision with root package name */
        private ij.c<ac.f> f142678g7;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final u4 f142679h;

        /* JADX INFO: renamed from: h0, reason: collision with root package name */
        private ij.c<com.planner5d.library.model.converter.json.from.o> f142680h0;

        /* JADX INFO: renamed from: h1, reason: collision with root package name */
        private ij.c<com.planner5d.library.model.manager.k5> f142681h1;

        /* JADX INFO: renamed from: h2, reason: collision with root package name */
        private ij.c<com.planner5d.library.model.manager.statistics.g> f142682h2;

        /* JADX INFO: renamed from: h3, reason: collision with root package name */
        private ij.c<com.planner5d.library.model.manager.i1> f142683h3;

        /* JADX INFO: renamed from: h4, reason: collision with root package name */
        private ij.c<com.planner5d.library.activity.fragment.dialog.purchase.t> f142684h4;

        /* JADX INFO: renamed from: h5, reason: collision with root package name */
        private ij.c<com.planner5d.library.activity.fragment.dialog.projectsettings.u0> f142685h5;

        /* JADX INFO: renamed from: h6, reason: collision with root package name */
        private ij.c<ce.b> f142686h6;

        /* JADX INFO: renamed from: h7, reason: collision with root package name */
        private ij.c<bc.c> f142687h7;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final h4 f142688i;

        /* JADX INFO: renamed from: i0, reason: collision with root package name */
        private ij.c<com.planner5d.library.model.converter.json.from.h> f142689i0;

        /* JADX INFO: renamed from: i1, reason: collision with root package name */
        private ij.c<NetworkErrorUtility> f142690i1;

        /* JADX INFO: renamed from: i2, reason: collision with root package name */
        private ij.c<com.planner5d.library.model.manager.statistics.b0> f142691i2;

        /* JADX INFO: renamed from: i3, reason: collision with root package name */
        private ij.c<com.planner5d.library.modules.user.user.m1> f142692i3;

        /* JADX INFO: renamed from: i4, reason: collision with root package name */
        private ij.c<com.planner5d.library.activity.helper.l0> f142693i4;

        /* JADX INFO: renamed from: i5, reason: collision with root package name */
        private ij.c<com.planner5d.library.activity.fragment.dialog.iteminfo.d> f142694i5;

        /* JADX INFO: renamed from: i6, reason: collision with root package name */
        private ij.c<StatisticsEventAiDesigner> f142695i6;

        /* JADX INFO: renamed from: i7, reason: collision with root package name */
        private ij.c<cc.b> f142696i7;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final m4 f142697j;

        /* JADX INFO: renamed from: j0, reason: collision with root package name */
        private ij.c<com.planner5d.library.model.converter.json.from.s> f142698j0;

        /* JADX INFO: renamed from: j1, reason: collision with root package name */
        private ij.c<com.planner5d.library.model.manager.managedfiles.y> f142699j1;

        /* JADX INFO: renamed from: j2, reason: collision with root package name */
        private ij.c<com.planner5d.library.model.manager.initialization.v> f142700j2;

        /* JADX INFO: renamed from: j3, reason: collision with root package name */
        private ij.c<com.planner5d.library.activity.helper.imagechooser.j> f142701j3;

        /* JADX INFO: renamed from: j4, reason: collision with root package name */
        private ij.c<com.planner5d.library.activity.a> f142702j4;

        /* JADX INFO: renamed from: j5, reason: collision with root package name */
        private ij.c<com.planner5d.library.widget.editor.popup.itemproperties.y> f142703j5;

        /* JADX INFO: renamed from: j6, reason: collision with root package name */
        private ij.c<com.planner5d.library.activity.fragment.smartwizard.roomstyle.n> f142704j6;

        /* JADX INFO: renamed from: j7, reason: collision with root package name */
        private ij.c<dc.d<cc.a>> f142705j7;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private final x4 f142706k;

        /* JADX INFO: renamed from: k0, reason: collision with root package name */
        private ij.c<com.planner5d.library.model.converter.json.from.m> f142707k0;

        /* JADX INFO: renamed from: k1, reason: collision with root package name */
        private ij.c<com.planner5d.library.model.manager.builtin.l> f142708k1;

        /* JADX INFO: renamed from: k2, reason: collision with root package name */
        private ij.c<com.planner5d.library.legal.model.manager.a> f142709k2;

        /* JADX INFO: renamed from: k3, reason: collision with root package name */
        private ij.c<com.planner5d.library.widget.editor.helper.a2> f142710k3;

        /* JADX INFO: renamed from: k4, reason: collision with root package name */
        private ij.c<ia.g> f142711k4;

        /* JADX INFO: renamed from: k5, reason: collision with root package name */
        private ij.c<com.planner5d.library.widget.editor.popup.itemproperties.v> f142712k5;

        /* JADX INFO: renamed from: k6, reason: collision with root package name */
        private ij.c<com.planner5d.library.activity.fragment.compareplans.h> f142713k6;

        /* JADX INFO: renamed from: k7, reason: collision with root package name */
        private ij.c<com.planner5d.library.engine.h> f142714k7;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private final a5 f142715l;

        /* JADX INFO: renamed from: l0, reason: collision with root package name */
        private ij.c<com.planner5d.library.model.converter.json.from.j> f142716l0;

        /* JADX INFO: renamed from: l1, reason: collision with root package name */
        private ij.c<com.planner5d.library.model.manager.x2> f142717l1;

        /* JADX INFO: renamed from: l2, reason: collision with root package name */
        private ij.c<com.planner5d.library.model.manager.f2> f142718l2;

        /* JADX INFO: renamed from: l3, reason: collision with root package name */
        private ij.c<com.planner5d.library.model.manager.f> f142719l3;

        /* JADX INFO: renamed from: l4, reason: collision with root package name */
        private ij.c<com.planner5d.library.model.manager.statistics.events.r3> f142720l4;

        /* JADX INFO: renamed from: l5, reason: collision with root package name */
        private ij.c<com.planner5d.library.widget.editor.popup.itemproperties.pages.material.i> f142721l5;

        /* JADX INFO: renamed from: l6, reason: collision with root package name */
        private ij.c<com.planner5d.library.activity.fragment.smartwizard.decorator.interactor.b> f142722l6;

        /* JADX INFO: renamed from: l7, reason: collision with root package name */
        private ij.c<vb.g> f142723l7;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private final t3 f142724m;

        /* JADX INFO: renamed from: m0, reason: collision with root package name */
        private ij.c<com.planner5d.library.model.converter.json.from.u> f142725m0;

        /* JADX INFO: renamed from: m1, reason: collision with root package name */
        private ij.c<com.planner5d.library.model.manager.q2> f142726m1;

        /* JADX INFO: renamed from: m2, reason: collision with root package name */
        private ij.c<com.planner5d.library.modules.user.user.z0> f142727m2;

        /* JADX INFO: renamed from: m3, reason: collision with root package name */
        private ij.c<com.planner5d.library.activity.fragment.startup.x> f142728m3;

        /* JADX INFO: renamed from: m4, reason: collision with root package name */
        private ij.c<com.planner5d.library.model.manager.statistics.events.e4> f142729m4;

        /* JADX INFO: renamed from: m5, reason: collision with root package name */
        private ij.c<com.planner5d.library.widget.editor.popup.itemproperties.pages.availablematerial.k> f142730m5;

        /* JADX INFO: renamed from: m6, reason: collision with root package name */
        private ij.c<ma.a> f142731m6;

        /* JADX INFO: renamed from: m7, reason: collision with root package name */
        private ij.c<cc.f> f142732m7;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final f4 f142733n;

        /* JADX INFO: renamed from: n0, reason: collision with root package name */
        private ij.c<com.planner5d.library.model.converter.json.from.f> f142734n0;

        /* JADX INFO: renamed from: n1, reason: collision with root package name */
        private ij.c<zc.b> f142735n1;

        /* JADX INFO: renamed from: n2, reason: collision with root package name */
        private ij.c<com.planner5d.library.modules.user.user.b1> f142736n2;

        /* JADX INFO: renamed from: n3, reason: collision with root package name */
        private ij.c<com.planner5d.library.activity.fragment.messages.g> f142737n3;

        /* JADX INFO: renamed from: n4, reason: collision with root package name */
        private ij.c<com.planner5d.library.model.manager.payments.b0> f142738n4;

        /* JADX INFO: renamed from: n5, reason: collision with root package name */
        private ij.c<com.planner5d.library.widget.editor.popup.itemproperties.pages.size.q> f142739n5;

        /* JADX INFO: renamed from: n6, reason: collision with root package name */
        private ij.c<ce.a> f142740n6;

        /* JADX INFO: renamed from: n7, reason: collision with root package name */
        private ij.c<dd.c> f142741n7;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private final a f142742o;

        /* JADX INFO: renamed from: o0, reason: collision with root package name */
        private ij.c f142743o0;

        /* JADX INFO: renamed from: o1, reason: collision with root package name */
        private ij.c<com.planner5d.library.model.manager.unlockeditems.d> f142744o1;

        /* JADX INFO: renamed from: o2, reason: collision with root package name */
        private ij.c<com.planner5d.library.modules.user.user.q0> f142745o2;

        /* JADX INFO: renamed from: o3, reason: collision with root package name */
        private ij.c<com.planner5d.library.modules.user.auth.m> f142746o3;

        /* JADX INFO: renamed from: o4, reason: collision with root package name */
        private ij.c<com.planner5d.library.h[]> f142747o4;

        /* JADX INFO: renamed from: o5, reason: collision with root package name */
        private ij.c<com.planner5d.library.widget.editor.popup.itemproperties.interactor.a> f142748o5;

        /* JADX INFO: renamed from: o6, reason: collision with root package name */
        private ij.c<com.planner5d.library.activity.fragment.smartwizard.decorator.l> f142749o6;

        /* JADX INFO: renamed from: o7, reason: collision with root package name */
        private ij.c<com.planner5d.library.widget.editor.editor3d.l> f142750o7;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private ij.c<Application> f142751p;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        private ij.c f142752p0;

        /* JADX INFO: renamed from: p1, reason: collision with root package name */
        private ij.c<com.planner5d.library.model.manager.n5> f142753p1;

        /* JADX INFO: renamed from: p2, reason: collision with root package name */
        private ij.c<com.planner5d.library.model.manager.statistics.d0> f142754p2;

        /* JADX INFO: renamed from: p3, reason: collision with root package name */
        private ij.c<com.planner5d.library.activity.fragment.settings.h> f142755p3;

        /* JADX INFO: renamed from: p4, reason: collision with root package name */
        private ij.c<com.planner5d.library.interactor.g> f142756p4;

        /* JADX INFO: renamed from: p5, reason: collision with root package name */
        private ij.c<af.a> f142757p5;

        /* JADX INFO: renamed from: p6, reason: collision with root package name */
        private ij.c<com.planner5d.library.activity.fragment.intenthandler.b> f142758p6;

        /* JADX INFO: renamed from: p7, reason: collision with root package name */
        private ij.c<com.planner5d.library.activity.fragment.smartwizard.roomstyle.interactor.a> f142759p7;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private ij.c<com.planner5d.library.application.b> f142760q;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        private ij.c<com.planner5d.library.model.converter.json.from.c> f142761q0;

        /* JADX INFO: renamed from: q1, reason: collision with root package name */
        private ij.c<com.planner5d.library.model.manager.config.j> f142762q1;

        /* JADX INFO: renamed from: q2, reason: collision with root package name */
        private ij.c<com.planner5d.library.activity.fragment.dialog.k> f142763q2;

        /* JADX INFO: renamed from: q3, reason: collision with root package name */
        private ij.c<com.planner5d.library.activity.fragment.dialog.authentication.e1> f142764q3;

        /* JADX INFO: renamed from: q4, reason: collision with root package name */
        private ij.c<le.d> f142765q4;

        /* JADX INFO: renamed from: q5, reason: collision with root package name */
        private ij.c<com.planner5d.library.widget.editor.popup.itemproperties.b> f142766q5;

        /* JADX INFO: renamed from: q6, reason: collision with root package name */
        private ij.c<com.planner5d.library.model.manager.statistics.events.n3> f142767q6;

        /* JADX INFO: renamed from: q7, reason: collision with root package name */
        private ij.c<pa.b> f142768q7;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private ij.c<SharedPreferences> f142769r;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        private ij.c f142770r0;

        /* JADX INFO: renamed from: r1, reason: collision with root package name */
        private ij.c<com.planner5d.library.model.manager.unlockeditems.b> f142771r1;

        /* JADX INFO: renamed from: r2, reason: collision with root package name */
        private ij.c<com.planner5d.library.model.manager.initialization.r> f142772r2;

        /* JADX INFO: renamed from: r3, reason: collision with root package name */
        private ij.c<com.planner5d.library.activity.fragment.dialog.authentication.y> f142773r3;

        /* JADX INFO: renamed from: r4, reason: collision with root package name */
        private ij.c<com.planner5d.library.interactor.i> f142774r4;

        /* JADX INFO: renamed from: r5, reason: collision with root package name */
        private ij.c<vb.f> f142775r5;

        /* JADX INFO: renamed from: r6, reason: collision with root package name */
        private ij.c<com.planner5d.library.activity.fragment.spaces.documents.o> f142776r6;

        /* JADX INFO: renamed from: r7, reason: collision with root package name */
        private ij.c<com.planner5d.library.widget.editor.menu.j> f142777r7;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private ij.c<com.planner5d.library.model.manager.config.xml.a> f142778s;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        private ij.c f142779s0;

        /* JADX INFO: renamed from: s1, reason: collision with root package name */
        private ij.c<com.planner5d.library.model.manager.m5> f142780s1;

        /* JADX INFO: renamed from: s2, reason: collision with root package name */
        private ij.c<com.planner5d.library.activity.fragment.n> f142781s2;

        /* JADX INFO: renamed from: s3, reason: collision with root package name */
        private ij.c<com.planner5d.library.activity.fragment.dialog.authentication.c1> f142782s3;

        /* JADX INFO: renamed from: s4, reason: collision with root package name */
        private ij.c<le.e> f142783s4;

        /* JADX INFO: renamed from: s5, reason: collision with root package name */
        private ij.c<com.planner5d.library.engine.p> f142784s5;

        /* JADX INFO: renamed from: s6, reason: collision with root package name */
        private ij.c<com.planner5d.library.activity.fragment.spaces.folder.i> f142785s6;

        /* JADX INFO: renamed from: s7, reason: collision with root package name */
        private ij.c<com.planner5d.library.widget.editor.facade.c0> f142786s7;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private ij.c<com.planner5d.library.services.utility.f1> f142787t;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        private ij.c<ItemBuilder> f142788t0;

        /* JADX INFO: renamed from: t1, reason: collision with root package name */
        private ij.c<sd.b> f142789t1;

        /* JADX INFO: renamed from: t2, reason: collision with root package name */
        private ij.c<com.planner5d.library.modules.user.user.b> f142790t2;

        /* JADX INFO: renamed from: t3, reason: collision with root package name */
        private ij.c<com.planner5d.library.activity.fragment.dialog.authentication.v0> f142791t3;

        /* JADX INFO: renamed from: t4, reason: collision with root package name */
        private ij.c<com.planner5d.library.activity.helper.t0> f142792t4;

        /* JADX INFO: renamed from: t5, reason: collision with root package name */
        private ij.c<com.planner5d.library.widget.editor.popup.itemproperties.pages.texturepreview.n> f142793t5;

        /* JADX INFO: renamed from: t6, reason: collision with root package name */
        private ij.c<com.planner5d.library.activity.fragment.spaces.file.i> f142794t6;

        /* JADX INFO: renamed from: t7, reason: collision with root package name */
        private ij.c<com.planner5d.library.model.manager.uploadplan.g> f142795t7;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private ij.c<com.planner5d.library.application.d> f142796u;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        private ij.c<com.planner5d.library.model.converter.json.to.w> f142797u0;

        /* JADX INFO: renamed from: u1, reason: collision with root package name */
        private ij.c<com.planner5d.library.model.manager.config.source.g> f142798u1;

        /* JADX INFO: renamed from: u2, reason: collision with root package name */
        private ij.c<com.planner5d.library.modules.user.user.y0> f142799u2;

        /* JADX INFO: renamed from: u3, reason: collision with root package name */
        private ij.c<com.planner5d.library.activity.fragment.dialog.authentication.onelink.l> f142800u3;

        /* JADX INFO: renamed from: u4, reason: collision with root package name */
        private ij.c<com.planner5d.library.interactor.s> f142801u4;

        /* JADX INFO: renamed from: u5, reason: collision with root package name */
        private ij.c<com.planner5d.library.widget.editor.projectresources.a> f142802u5;

        /* JADX INFO: renamed from: u6, reason: collision with root package name */
        private ij.c<com.planner5d.library.activity.fragment.spaces.preview.b> f142803u6;

        /* JADX INFO: renamed from: u7, reason: collision with root package name */
        private ij.c<com.planner5d.library.interactor.a> f142804u7;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private ij.c<com.planner5d.library.api.requests.a> f142805v;

        /* JADX INFO: renamed from: v0, reason: collision with root package name */
        private ij.c<com.planner5d.library.model.converter.json.to.z> f142806v0;

        /* JADX INFO: renamed from: v1, reason: collision with root package name */
        private ij.c<com.planner5d.library.model.manager.config.source.g.a> f142807v1;

        /* JADX INFO: renamed from: v2, reason: collision with root package name */
        private ij.c<com.planner5d.library.model.manager.payments.a0> f142808v2;

        /* JADX INFO: renamed from: v3, reason: collision with root package name */
        private ij.c<com.planner5d.library.activity.fragment.dialog.authentication.onelink.v> f142809v3;

        /* JADX INFO: renamed from: v4, reason: collision with root package name */
        private ij.c<le.i> f142810v4;

        /* JADX INFO: renamed from: v5, reason: collision with root package name */
        private ij.c f142811v5;

        /* JADX INFO: renamed from: v6, reason: collision with root package name */
        private ij.c<com.planner5d.library.activity.fragment.projects.n0> f142812v6;

        /* JADX INFO: renamed from: v7, reason: collision with root package name */
        private ij.c<le.a> f142813v7;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        private ij.c<com.planner5d.library.api.b> f142814w;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        private ij.c<com.planner5d.library.model.converter.json.to.m> f142815w0;

        /* JADX INFO: renamed from: w1, reason: collision with root package name */
        private ij.c<com.planner5d.library.model.manager.config.source.l> f142816w1;

        /* JADX INFO: renamed from: w2, reason: collision with root package name */
        private ij.c<com.planner5d.library.model.manager.initialization.z.a> f142817w2;

        /* JADX INFO: renamed from: w3, reason: collision with root package name */
        private ij.c<com.planner5d.library.activity.fragment.dialog.authentication.f0> f142818w3;

        /* JADX INFO: renamed from: w4, reason: collision with root package name */
        private ij.c<com.planner5d.library.activity.helper.z0> f142819w4;

        /* JADX INFO: renamed from: w5, reason: collision with root package name */
        private ij.c<com.planner5d.library.widget.editor.projectresources.e> f142820w5;

        /* JADX INFO: renamed from: w6, reason: collision with root package name */
        private ij.c<com.planner5d.library.activity.fragment.spaces.dashboard.j> f142821w6;

        /* JADX INFO: renamed from: w7, reason: collision with root package name */
        private ij.c<com.planner5d.library.widget.editor.helper.w1> f142822w7;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        private ij.c<com.planner5d.library.api.requests.c> f142823x;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        private ij.c<com.planner5d.library.model.converter.json.to.h> f142824x0;

        /* JADX INFO: renamed from: x1, reason: collision with root package name */
        private ij.c<com.planner5d.library.model.manager.config.source.j> f142825x1;

        /* JADX INFO: renamed from: x2, reason: collision with root package name */
        private ij.c<com.planner5d.library.engine.i> f142826x2;

        /* JADX INFO: renamed from: x3, reason: collision with root package name */
        private ij.c<com.planner5d.library.modules.user.auth.r> f142827x3;

        /* JADX INFO: renamed from: x4, reason: collision with root package name */
        private ij.c<com.planner5d.library.activity.fragment.projects.h> f142828x4;

        /* JADX INFO: renamed from: x5, reason: collision with root package name */
        private ij.c<com.planner5d.library.widget.editor.popup.itemproperties.pages.size.k0> f142829x5;

        /* JADX INFO: renamed from: x6, reason: collision with root package name */
        private ij.c<Map<Class<? extends androidx.lifecycle.f2>, ij.c<androidx.lifecycle.f2>>> f142830x6;

        /* JADX INFO: renamed from: x7, reason: collision with root package name */
        private ij.c<com.planner5d.library.activity.fragment.smartwizard.a> f142831x7;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        private ij.c<com.planner5d.library.modules.user.user.t> f142832y;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        private ij.c<com.planner5d.library.model.converter.json.to.d> f142833y0;

        /* JADX INFO: renamed from: y1, reason: collision with root package name */
        private ij.c<com.planner5d.library.services.utility.t> f142834y1;

        /* JADX INFO: renamed from: y2, reason: collision with root package name */
        private ij.c<com.planner5d.library.model.manager.initialization.t> f142835y2;

        /* JADX INFO: renamed from: y3, reason: collision with root package name */
        private ij.c<com.planner5d.library.modules.user.user.m0> f142836y3;

        /* JADX INFO: renamed from: y4, reason: collision with root package name */
        private ij.c<com.planner5d.library.activity.fragment.projects.w0> f142837y4;

        /* JADX INFO: renamed from: y5, reason: collision with root package name */
        private ij.c<com.planner5d.library.widget.editor.popup.itemproperties.pages.texture.o> f142838y5;

        /* JADX INFO: renamed from: y6, reason: collision with root package name */
        private ij.c<com.planner5d.library.services.utility.g0> f142839y6;

        /* JADX INFO: renamed from: y7, reason: collision with root package name */
        private ij.c<com.planner5d.library.widget.editor.facade.s> f142840y7;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        private ij.c<com.planner5d.library.model.manager.builtin.i> f142841z;

        /* JADX INFO: renamed from: z0, reason: collision with root package name */
        private ij.c<com.planner5d.library.model.converter.json.to.r> f142842z0;

        /* JADX INFO: renamed from: z1, reason: collision with root package name */
        private ij.c<com.planner5d.library.model.manager.config.d> f142843z1;

        /* JADX INFO: renamed from: z2, reason: collision with root package name */
        private ij.c<com.planner5d.library.activity.fragment.startup.a> f142844z2;

        /* JADX INFO: renamed from: z3, reason: collision with root package name */
        private ij.c<com.planner5d.library.activity.fragment.dialog.authentication.privacy.c> f142845z3;

        /* JADX INFO: renamed from: z4, reason: collision with root package name */
        private ij.c<com.planner5d.library.activity.fragment.snapshots.c1> f142846z4;

        /* JADX INFO: renamed from: z5, reason: collision with root package name */
        private ij.c<com.planner5d.library.contest.data.f> f142847z5;

        /* JADX INFO: renamed from: z6, reason: collision with root package name */
        private com.planner5d.library.activity.fragment.dialog.purchase.g0 f142848z6;

        /* JADX INFO: renamed from: z7, reason: collision with root package name */
        private ij.c<com.planner5d.library.model.a> f142849z7;

        @z7.a
        private ComparePlansFragment A3(ComparePlansFragment comparePlansFragment) {
            com.planner5d.library.activity.fragment.compareplans.f.d(comparePlansFragment, this.f142675g4.get());
            com.planner5d.library.activity.fragment.compareplans.f.b(comparePlansFragment, this.f142763q2.get());
            com.planner5d.library.activity.fragment.compareplans.f.f(comparePlansFragment, this.E1.get());
            com.planner5d.library.activity.fragment.compareplans.f.e(comparePlansFragment, this.f142832y.get());
            return comparePlansFragment;
        }

        @z7.a
        private StartupPaywall A4(StartupPaywall startupPaywall) {
            com.planner5d.library.activity.fragment.startup.t.f(startupPaywall, this.T0.get());
            com.planner5d.library.activity.fragment.startup.t.h(startupPaywall, n2());
            com.planner5d.library.activity.fragment.startup.t.g(startupPaywall, this.f142675g4.get());
            com.planner5d.library.activity.fragment.startup.t.b(startupPaywall, b0.c(this.f142643d));
            com.planner5d.library.activity.fragment.startup.t.c(startupPaywall, this.f142781s2.get());
            com.planner5d.library.activity.fragment.startup.t.d(startupPaywall, this.f142762q1.get());
            return startupPaywall;
        }

        @z7.a
        private DecoratorFragment B3(DecoratorFragment decoratorFragment) {
            com.planner5d.library.activity.fragment.projects.f.e(decoratorFragment, m0());
            com.planner5d.library.activity.fragment.projects.f.b(decoratorFragment, P2());
            com.planner5d.library.activity.fragment.projects.f.c(decoratorFragment, R2());
            com.planner5d.library.activity.fragment.smartwizard.decorator.j.c(decoratorFragment, dagger.internal.g.a(this.f142690i1));
            return decoratorFragment;
        }

        @z7.a
        private com.planner5d.library.widget.tab.b B4(com.planner5d.library.widget.tab.b bVar) {
            com.planner5d.library.widget.tab.c.c(bVar, this.F3.get());
            return bVar;
        }

        @z7.a
        private Dimensions C3(Dimensions dimensions) {
            com.planner5d.library.activity.fragment.smartwizard.k.b(dimensions, R2());
            com.planner5d.library.activity.fragment.smartwizard.dimensions.v.b(dimensions, O2());
            com.planner5d.library.activity.fragment.smartwizard.dimensions.v.c(dimensions, this.M7.get());
            com.planner5d.library.activity.fragment.smartwizard.dimensions.v.d(dimensions, this.P.get());
            return dimensions;
        }

        @z7.a
        private UserMessage C4(UserMessage userMessage) {
            com.planner5d.library.activity.fragment.dialog.message.o.b(userMessage, this.B.get());
            return userMessage;
        }

        @z7.a
        private Documents D3(Documents documents) {
            com.planner5d.library.activity.fragment.spaces.documents.q.c(documents, this.f142763q2.get());
            com.planner5d.library.activity.fragment.spaces.documents.q.b(documents, this.G6.get());
            com.planner5d.library.activity.fragment.spaces.documents.q.e(documents, this.T0.get());
            return documents;
        }

        @z7.a
        private WishList D4(WishList wishList) {
            com.planner5d.library.activity.fragment.dialog.wishlist.e.b(wishList, this.f142841z.get());
            com.planner5d.library.activity.fragment.dialog.wishlist.e.f(wishList, this.J6.get());
            com.planner5d.library.activity.fragment.dialog.wishlist.e.d(wishList, this.f142626b0.get());
            com.planner5d.library.activity.fragment.dialog.wishlist.e.e(wishList, this.X2.get());
            com.planner5d.library.activity.fragment.dialog.wishlist.e.c(wishList, this.f142634c);
            com.planner5d.library.activity.fragment.dialog.wishlist.e.h(wishList, this.R2.get());
            com.planner5d.library.activity.fragment.dialog.wishlist.e.j(wishList, w());
            com.planner5d.library.activity.fragment.dialog.wishlist.e.i(wishList, T4());
            return wishList;
        }

        private ua.a E2() {
            return new ua.a(E4());
        }

        @z7.a
        private DownloadService E3(DownloadService downloadService) {
            com.planner5d.library.services.download.f.b(downloadService, dagger.internal.g.a(this.W));
            com.planner5d.library.services.download.f.c(downloadService, this.U6.get());
            com.planner5d.library.services.download.f.e(downloadService, dagger.internal.g.a(this.f142663f1));
            return downloadService;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public com.planner5d.library.model.manager.u1 E4() {
            return k0.c(this.f142643d, this.P.get());
        }

        private com.planner5d.library.widget.editor.editor3dcardboard.g F2() {
            return new com.planner5d.library.widget.editor.editor3dcardboard.g(b0.c(this.f142643d), k3(), this.P.get());
        }

        @z7.a
        private com.planner5d.library.widget.editor.editor3dcardboard.l F3(com.planner5d.library.widget.editor.editor3dcardboard.l lVar) {
            com.planner5d.library.widget.editor.editor3dcardboard.r.x(lVar, this.P2.get());
            com.planner5d.library.widget.editor.editor3dcardboard.r.b(lVar, this.f142616a);
            com.planner5d.library.widget.editor.editor3dcardboard.r.D(lVar, this.f142832y.get());
            com.planner5d.library.widget.editor.editor3dcardboard.r.f(lVar, this.f142634c);
            com.planner5d.library.widget.editor.editor3dcardboard.r.k(lVar, this.f142676g5.get());
            com.planner5d.library.widget.editor.editor3dcardboard.r.o(lVar, this.P.get());
            com.planner5d.library.widget.editor.editor3dcardboard.r.j(lVar, this.X7);
            com.planner5d.library.widget.editor.editor3dcardboard.r.l(lVar, k3());
            com.planner5d.library.widget.editor.editor3dcardboard.r.r(lVar, this.R2.get());
            com.planner5d.library.widget.editor.editor3dcardboard.r.C(lVar, this.f142681h1.get());
            com.planner5d.library.widget.editor.editor3dcardboard.r.m(lVar, this.K0.get());
            com.planner5d.library.widget.editor.editor3dcardboard.r.u(lVar, y3.c(this.f142724m));
            com.planner5d.library.widget.editor.editor3dcardboard.r.v(lVar, this.E.get());
            com.planner5d.library.widget.editor.editor3dcardboard.r.F(lVar, this.E1.get());
            com.planner5d.library.widget.editor.editor3dcardboard.r.B(lVar, this.V2.get());
            com.planner5d.library.widget.editor.editor3dcardboard.r.n(lVar, T2());
            com.planner5d.library.widget.editor.editor3dcardboard.r.i(lVar, R2());
            com.planner5d.library.widget.editor.editor3dcardboard.r.e(lVar, this.f142843z1.get());
            com.planner5d.library.widget.editor.editor3dcardboard.r.A(lVar, n2());
            com.planner5d.library.widget.editor.editor3dcardboard.r.w(lVar, this.I2.get());
            com.planner5d.library.widget.editor.editor3dcardboard.r.d(lVar, F2());
            com.planner5d.library.widget.editor.editor3dcardboard.r.h(lVar, v3.c(this.f142724m));
            com.planner5d.library.widget.editor.editor3dcardboard.r.z(lVar, d4.c(this.f142724m));
            com.planner5d.library.widget.editor.editor3dcardboard.r.p(lVar, z3.c(this.f142724m));
            com.planner5d.library.widget.editor.editor3dcardboard.r.t(lVar, x3.c(this.f142724m));
            com.planner5d.library.widget.editor.editor3dcardboard.r.s(lVar, w3.c(this.f142724m));
            com.planner5d.library.widget.editor.editor3dcardboard.r.y(lVar, c4.c(this.f142724m));
            com.planner5d.library.widget.editor.editor3dcardboard.r.c(lVar, u3.c(this.f142724m));
            com.planner5d.library.widget.editor.editor3dcardboard.r.g(lVar, this.I0.get());
            com.planner5d.library.widget.editor.editor3dcardboard.r.E(lVar, this.f142741n7.get());
            return lVar;
        }

        private com.planner5d.library.services.utility.f2 F4() {
            return new com.planner5d.library.services.utility.f2(E4());
        }

        private com.planner5d.library.widget.editor.catalog.drawer.r G2() {
            return new com.planner5d.library.widget.editor.catalog.drawer.r(this.L6.get(), this.X6.get(), I4(), this.f142762q1.get(), this.f142771r1.get(), this.E1.get(), this.f142693i4.get(), this.f142832y.get());
        }

        @z7.a
        private com.planner5d.library.widget.editor.editor3dcardboard.p G3(com.planner5d.library.widget.editor.editor3dcardboard.p pVar) {
            com.planner5d.library.widget.editor.editor3dcardboard.q.c(pVar, this.f142691i2.get());
            return pVar;
        }

        private com.planner5d.library.activity.fragment.startup.e G4() {
            return new com.planner5d.library.activity.fragment.startup.e(dagger.internal.g.a(this.f142832y), this.f142790t2.get(), n2());
        }

        private com.planner5d.library.widget.editor.catalog.v.c H2() {
            return new com.planner5d.library.widget.editor.catalog.v.c(this.W6.get(), this.X6.get(), I4(), this.f142843z1.get(), this.f142762q1.get());
        }

        @z7.a
        private com.planner5d.library.widget.editor.editor3d.t H3(com.planner5d.library.widget.editor.editor3d.t tVar) {
            com.planner5d.library.widget.editor.editor3d.v.b(tVar, this.I7);
            return tVar;
        }

        private com.planner5d.library.interactor.p H4() {
            return new com.planner5d.library.interactor.p(this.E1.get(), this.f142771r1.get(), this.L6.get(), this.J6.get(), this.f142843z1.get());
        }

        private com.planner5d.library.contest.data.f I2() {
            return new com.planner5d.library.contest.data.f(R1(), this.V0.get(), g3.c(this.f142643d));
        }

        @z7.a
        private Editor3dFragment I3(Editor3dFragment editor3dFragment) {
            com.planner5d.library.activity.fragment.projects.f.e(editor3dFragment, m0());
            com.planner5d.library.activity.fragment.projects.f.b(editor3dFragment, P2());
            com.planner5d.library.activity.fragment.projects.f.c(editor3dFragment, R2());
            return editor3dFragment;
        }

        private le.h I4() {
            return c1.c(this.f142643d, H4());
        }

        private com.planner5d.library.interactor.a J2() {
            return new com.planner5d.library.interactor.a(K2(), this.f142616a, k2(), this.R2.get(), this.E.get(), this.Q2.get());
        }

        @z7.a
        private FeedAllArticlesFragment J3(FeedAllArticlesFragment feedAllArticlesFragment) {
            com.planner5d.library.activity.fragment.feed.k.c(feedAllArticlesFragment, X2());
            com.planner5d.library.activity.fragment.feed.k.d(feedAllArticlesFragment, this.K0.get());
            com.planner5d.library.activity.fragment.feed.k.b(feedAllArticlesFragment, this.f142763q2.get());
            return feedAllArticlesFragment;
        }

        private com.planner5d.library.widget.editor.interactor.a J4() {
            return new com.planner5d.library.widget.editor.interactor.a(this.V2.get(), this.P2.get(), this.f142834y1.get());
        }

        private com.planner5d.library.model.manager.uploadplan.g K2() {
            return v.c(this.f142643d, new com.planner5d.library.model.manager.uploadplan.d());
        }

        @z7.a
        private FeedArticleFragment K3(FeedArticleFragment feedArticleFragment) {
            com.planner5d.library.activity.fragment.feed.q.d(feedArticleFragment, this.E.get());
            com.planner5d.library.activity.fragment.feed.q.b(feedArticleFragment, this.f142616a);
            com.planner5d.library.activity.fragment.feed.q.e(feedArticleFragment, this.L7.get());
            return feedArticleFragment;
        }

        private cf.a K4() {
            return f1.c(this.f142643d, J4());
        }

        private le.a L2() {
            return u.c(this.f142643d, J2());
        }

        @z7.a
        private FeedFragment L3(FeedFragment feedFragment) {
            com.planner5d.library.activity.fragment.feed.k0.b(feedFragment, this.G6.get());
            com.planner5d.library.activity.fragment.feed.k0.i(feedFragment, this.E.get());
            com.planner5d.library.activity.fragment.feed.k0.h(feedFragment, this.R2.get());
            com.planner5d.library.activity.fragment.feed.k0.d(feedFragment, this.f142763q2.get());
            com.planner5d.library.activity.fragment.feed.k0.e(feedFragment, W2());
            com.planner5d.library.activity.fragment.feed.k0.j(feedFragment, this.f142661f.b());
            com.planner5d.library.activity.fragment.feed.k0.f(feedFragment, this.f142762q1.get());
            com.planner5d.library.activity.fragment.feed.k0.c(feedFragment, this.f142834y1.get());
            return feedFragment;
        }

        private ka.b L4() {
            return n1.c(this.f142643d, M4());
        }

        private com.planner5d.library.model.manager.n M2() {
            return new com.planner5d.library.model.manager.n(this.V0.get(), dagger.internal.g.a(this.f142762q1));
        }

        @z7.a
        private com.planner5d.library.widget.editor.popup.floors.f M3(com.planner5d.library.widget.editor.popup.floors.f fVar) {
            com.planner5d.library.widget.editor.popup.floors.h.b(fVar, this.f142763q2.get());
            return fVar;
        }

        private com.planner5d.library.activity.fragment.feed.interactor.e M4() {
            return new com.planner5d.library.activity.fragment.feed.interactor.e(E4(), Z2(), this.E5.get());
        }

        private com.planner5d.library.activity.fragment.profile.a N2() {
            return new com.planner5d.library.activity.fragment.profile.a(this.Q0.get(), b0.c(this.f142643d));
        }

        @z7.a
        private FolderEdit N3(FolderEdit folderEdit) {
            com.planner5d.library.activity.fragment.dialog.titleedit.a.c(folderEdit, this.W2.get());
            com.planner5d.library.activity.fragment.dialog.titleedit.a.e(folderEdit, this.f142832y.get());
            com.planner5d.library.activity.fragment.dialog.titleedit.a.b(folderEdit, b0.c(this.f142643d));
            return folderEdit;
        }

        private com.planner5d.library.interactor.f0 N4() {
            return new com.planner5d.library.interactor.f0(this.P2.get(), R1(), this.V2.get(), l3());
        }

        private com.planner5d.library.widget.editor.editaction.f O2() {
            return new com.planner5d.library.widget.editor.editaction.f(this.f142841z.get());
        }

        @z7.a
        private FolderSelection O3(FolderSelection folderSelection) {
            com.planner5d.library.activity.fragment.dialog.q.b(folderSelection, this.W2.get());
            com.planner5d.library.activity.fragment.dialog.q.e(folderSelection, dagger.internal.g.a(this.P2));
            com.planner5d.library.activity.fragment.dialog.q.f(folderSelection, dagger.internal.g.a(this.Y2));
            com.planner5d.library.activity.fragment.dialog.q.g(folderSelection, dagger.internal.g.a(this.f142832y));
            com.planner5d.library.activity.fragment.dialog.q.c(folderSelection, this.f142626b0.get());
            return folderSelection;
        }

        private le.k O4() {
            return p1.c(this.f142643d, N4());
        }

        private com.planner5d.library.widget.editor.editor3d.l P2() {
            return new com.planner5d.library.widget.editor.editor3d.l(this.f142616a, this.f142676g5.get(), this.P.get(), this.R2.get(), this.f142681h1.get(), this.K0.get(), y3.c(this.f142724m), this.E.get(), t(), v3.c(this.f142724m), d4.c(this.f142724m), z3.c(this.f142724m), x3.c(this.f142724m), w3.c(this.f142724m), u3.c(this.f142724m), this.I0.get(), b4.c(this.f142724m), c4.c(this.f142724m), this.f142741n7.get());
        }

        @z7.a
        private Gallery P3(Gallery gallery) {
            com.planner5d.library.activity.fragment.gallery.n0.c(gallery, this.R2.get());
            return gallery;
        }

        private com.planner5d.library.activity.fragment.gallery.p0 P4() {
            return new com.planner5d.library.activity.fragment.gallery.p0(this.K0.get(), this.Y2.get(), this.R2.get());
        }

        private com.planner5d.library.widget.editor.editor3d.t Q2() {
            return H3(com.planner5d.library.widget.editor.editor3d.u.c());
        }

        @z7.a
        private GalleryPage Q3(GalleryPage galleryPage) {
            com.planner5d.library.activity.fragment.gallery.z.h(galleryPage, this.R3.get());
            com.planner5d.library.activity.fragment.gallery.z.g(galleryPage, this.K0.get());
            com.planner5d.library.activity.fragment.gallery.z.c(galleryPage, this.f142841z.get());
            com.planner5d.library.activity.fragment.gallery.z.b(galleryPage, this.f142634c);
            com.planner5d.library.activity.fragment.gallery.z.f(galleryPage, Y2());
            com.planner5d.library.activity.fragment.gallery.z.j(galleryPage, this.R2.get());
            com.planner5d.library.activity.fragment.gallery.z.d(galleryPage, this.R4.get());
            com.planner5d.library.activity.fragment.gallery.z.e(galleryPage, this.Q3.get());
            com.planner5d.library.activity.fragment.gallery.z.k(galleryPage, this.E.get());
            com.planner5d.library.activity.fragment.gallery.z.l(galleryPage, d5());
            return galleryPage;
        }

        private ka.c Q4() {
            return r1.c(this.f142643d, R4());
        }

        private com.planner5d.library.widget.editor.facade.s R2() {
            return new com.planner5d.library.widget.editor.facade.s(this.V2.get(), this.P2.get(), this.f142832y.get(), k3(), T2(), this.f142642c7.get(), new com.planner5d.library.widget.editor.helper.q2(), this.f142820w5.get(), this.f142841z.get(), this.D.get(), this.J6.get());
        }

        @z7.a
        private GalleryPager R3(GalleryPager galleryPager) {
            com.planner5d.library.activity.fragment.gallery.m0.f(galleryPager, this.R3.get());
            com.planner5d.library.activity.fragment.gallery.m0.e(galleryPager, this.K0.get());
            com.planner5d.library.activity.fragment.gallery.m0.h(galleryPager, this.T0.get());
            com.planner5d.library.activity.fragment.gallery.m0.d(galleryPager, Z2());
            com.planner5d.library.activity.fragment.gallery.m0.l(galleryPager, this.f142832y.get());
            com.planner5d.library.activity.fragment.gallery.m0.k(galleryPager, d5());
            com.planner5d.library.activity.fragment.gallery.m0.j(galleryPager, P4());
            com.planner5d.library.activity.fragment.gallery.m0.i(galleryPager, this.R2.get());
            com.planner5d.library.activity.fragment.gallery.m0.b(galleryPager, this.R4.get());
            com.planner5d.library.activity.fragment.gallery.m0.c(galleryPager, t());
            return galleryPager;
        }

        private com.planner5d.library.activity.fragment.feed.interactor.g R4() {
            return new com.planner5d.library.activity.fragment.feed.interactor.g(E4(), this.E5.get());
        }

        private com.planner5d.library.widget.editor.menu.j S2() {
            return new com.planner5d.library.widget.editor.menu.j(this.f142832y.get(), this.P2.get(), this.R2.get(), this.T0.get(), this.V0.get(), this.f142763q2.get(), this.f142634c, b0.c(this.f142643d), this.f142762q1.get(), this.f142626b0.get(), V2(), this.K0.get());
        }

        @z7.a
        private GalleryProjectFragment S3(GalleryProjectFragment galleryProjectFragment) {
            com.planner5d.library.activity.fragment.gallery.project.f.b(galleryProjectFragment, this.K0.get());
            com.planner5d.library.activity.fragment.gallery.project.f.d(galleryProjectFragment, this.F3.get());
            return galleryProjectFragment;
        }

        private com.planner5d.library.interactor.h0 S4() {
            return new com.planner5d.library.interactor.h0(this.X2.get(), b0.c(this.f142643d));
        }

        private com.planner5d.library.widget.editor.facade.c0 T2() {
            return new com.planner5d.library.widget.editor.facade.c0(this.f142820w5.get(), this.f142841z.get(), this.f142676g5.get(), this.R2.get(), this.P.get(), this.f142633b7.get(), this.X6.get());
        }

        @z7.a
        private com.planner5d.library.activity.helper.f1 T3(com.planner5d.library.activity.helper.f1 f1Var) {
            com.planner5d.library.activity.helper.j1.d(f1Var, this.Y2.get());
            com.planner5d.library.activity.helper.j1.e(f1Var, this.f142832y.get());
            com.planner5d.library.activity.helper.j1.f(f1Var, this.E1.get());
            com.planner5d.library.activity.helper.j1.c(f1Var, this.R2.get());
            return f1Var;
        }

        private le.l T4() {
            return e3.c(this.f142643d, S4());
        }

        private com.planner5d.library.activity.fragment.smartwizard.roomstyle.interactor.a U2() {
            return new com.planner5d.library.activity.fragment.smartwizard.roomstyle.interactor.a(k2(), this.f142625b, this.f142843z1.get(), this.R2.get(), this.f142832y.get());
        }

        @z7.a
        private ImproveSnapshotWithAi U3(ImproveSnapshotWithAi improveSnapshotWithAi) {
            com.planner5d.library.activity.fragment.snapshots.j.e(improveSnapshotWithAi, this.f142675g4.get());
            com.planner5d.library.activity.fragment.snapshots.j.b(improveSnapshotWithAi, this.K0.get());
            com.planner5d.library.activity.fragment.snapshots.j.d(improveSnapshotWithAi, m0());
            return improveSnapshotWithAi;
        }

        private com.planner5d.library.feed.usecase.b U4() {
            return s1.c(this.f142643d, V4());
        }

        private pa.b V2() {
            return x.c(this.f142643d, U2());
        }

        @z7.a
        private ItemInfo V3(ItemInfo itemInfo) {
            com.planner5d.library.activity.fragment.dialog.iteminfo.f.b(itemInfo, this.K0.get());
            com.planner5d.library.activity.fragment.dialog.iteminfo.f.c(itemInfo, this.J6.get());
            com.planner5d.library.activity.fragment.dialog.iteminfo.f.e(itemInfo, w());
            return itemInfo;
        }

        private ic.a V4() {
            return new ic.a(this.J5.get());
        }

        private com.planner5d.library.activity.fragment.feed.holders.a W2() {
            return new com.planner5d.library.activity.fragment.feed.holders.a(this.P2.get(), this.K0.get(), this.B.get(), this.f142633b7.get(), g4.c(this.f142733n), this.U2.get());
        }

        @z7.a
        private LicenseCheck W3(LicenseCheck licenseCheck) {
            com.planner5d.library.activity.fragment.user.d.c(licenseCheck, this.K7.get());
            com.planner5d.library.activity.fragment.user.d.e(licenseCheck, this.T0.get());
            com.planner5d.library.activity.fragment.user.d.f(licenseCheck, w());
            com.planner5d.library.activity.fragment.user.d.b(licenseCheck, this.f142781s2.get());
            return licenseCheck;
        }

        private ka.d W4() {
            return t1.c(this.f142643d, this.B5.get());
        }

        private com.planner5d.library.activity.fragment.feed.e1 X2() {
            return new com.planner5d.library.activity.fragment.feed.e1(this.f142616a, this.V0.get(), this.T0.get(), this.U2.get(), this.R2.get(), this.J3.get(), this.E.get(), this.P.get(), this.f142762q1.get(), I2(), this.V2.get(), this.F3.get(), r4.c(this.f142670g), n2(), W4(), this.D5.get(), this.f142661f.a(), this.f142661f.b(), this.Q2.get(), m3(), s(), this.W2.get(), this.E1.get(), this.P2.get(), this.f142832y.get(), a3(), this.M5.get(), this.f142634c, this.f142781s2.get());
        }

        @z7.a
        private Main X3(Main main) {
            com.planner5d.library.activity.i.j(main, this.f142819w4.get());
            com.planner5d.library.activity.i.i(main, this.f142693i4.get());
            com.planner5d.library.activity.i.d(main, this.f142763q2.get());
            com.planner5d.library.activity.i.n(main, this.V0.get());
            com.planner5d.library.activity.i.l(main, n3());
            com.planner5d.library.activity.i.f(main, this.R0.get());
            com.planner5d.library.activity.i.e(main, this.Y0.get());
            com.planner5d.library.activity.i.c(main, this.f142624a7.get());
            com.planner5d.library.activity.i.b(main, this.f142843z1.get());
            com.planner5d.library.activity.i.q(main, this.F3.get());
            com.planner5d.library.activity.i.o(main, this.Y6.get());
            com.planner5d.library.activity.i.h(main, this.S7.get());
            com.planner5d.library.activity.i.g(main, this.S5.get());
            com.planner5d.library.activity.i.k(main, this.T7.get());
            com.planner5d.library.activity.i.p(main, this.f142827x3.get());
            return main;
        }

        private com.planner5d.library.model.manager.d4 X4() {
            return new com.planner5d.library.model.manager.d4(dagger.internal.g.a(this.Y2), dagger.internal.g.a(this.f142832y), this.X0.get(), n2(), this.X1.get(), b0.c(this.f142643d));
        }

        private com.planner5d.library.activity.fragment.gallery.c Y2() {
            return new com.planner5d.library.activity.fragment.gallery.c(this.R3.get());
        }

        @z7.a
        private MainCardboard Y3(MainCardboard mainCardboard) {
            com.planner5d.library.activity.h.b(mainCardboard, this.f142763q2.get());
            com.planner5d.library.activity.h.c(mainCardboard, o3());
            return mainCardboard;
        }

        private com.planner5d.library.activity.fragment.snapshots.n0 Y4() {
            return new com.planner5d.library.activity.fragment.snapshots.n0(this.f142832y.get(), this.Y2.get(), this.f142762q1.get());
        }

        private com.planner5d.library.model.i Z2() {
            return new com.planner5d.library.model.i(this.f142841z.get());
        }

        @z7.a
        private ManageDataFragment Z3(ManageDataFragment manageDataFragment) {
            com.planner5d.library.activity.fragment.profile.managedata.c.g(manageDataFragment, N2());
            com.planner5d.library.activity.fragment.profile.managedata.c.e(manageDataFragment, this.f142832y.get());
            com.planner5d.library.activity.fragment.profile.managedata.c.f(manageDataFragment, this.f142836y3.get());
            com.planner5d.library.activity.fragment.profile.managedata.c.d(manageDataFragment, this.R2.get());
            com.planner5d.library.activity.fragment.profile.managedata.c.b(manageDataFragment, this.f142634c);
            return manageDataFragment;
        }

        private com.planner5d.library.activity.fragment.snapshots.y0 Z4() {
            return new com.planner5d.library.activity.fragment.snapshots.y0(this.Y2.get());
        }

        private com.planner5d.library.feed.usecase.a a3() {
            return a0.c(this.f142643d, b3());
        }

        @z7.a
        private MessageWithImageDialog a4(MessageWithImageDialog messageWithImageDialog) {
            com.planner5d.library.activity.fragment.dialog.message.f.d(messageWithImageDialog, this.K0.get());
            com.planner5d.library.activity.fragment.dialog.message.f.c(messageWithImageDialog, c3());
            com.planner5d.library.activity.fragment.dialog.message.f.b(messageWithImageDialog, b0.c(this.f142643d));
            return messageWithImageDialog;
        }

        private com.planner5d.library.activity.fragment.snapshots.c1 a5() {
            return new com.planner5d.library.activity.fragment.snapshots.c1(this.T0.get(), this.Y2.get(), X4(), this.f142832y.get(), this.W2.get(), this.f142763q2.get(), this.V0.get(), this.F3.get(), this.f142834y1.get());
        }

        private com.planner5d.library.activity.fragment.feed.interactor.c b3() {
            return new com.planner5d.library.activity.fragment.feed.interactor.c(this.f142616a, this.R3.get(), Q4(), L4(), U4(), n2(), this.M5.get());
        }

        @z7.a
        private OnboardingSignInDialog b4(OnboardingSignInDialog onboardingSignInDialog) {
            com.planner5d.library.activity.fragment.startup.d.c(onboardingSignInDialog, G4());
            return onboardingSignInDialog;
        }

        private com.planner5d.library.model.manager.d5 b5() {
            return new com.planner5d.library.model.manager.d5(this.f142769r.get());
        }

        private com.planner5d.library.interactor.g c3() {
            return new com.planner5d.library.interactor.g(this.f142616a, r4.c(this.f142670g), this.M3.get(), this.f142781s2.get(), this.V0.get(), this.R3.get(), this.f142661f.a(), this.T0.get(), this.U3.get(), G4(), this.f142675g4.get(), c2.c(this.f142643d), this.f142729m4.get(), this.f142808v2.get(), this.f142738n4.get(), this.f142661f.b(), this.f142832y.get(), t2.c(this.f142643d), this.f142763q2.get());
        }

        @z7.a
        private OrdersHistoryFragment c4(OrdersHistoryFragment ordersHistoryFragment) {
            com.planner5d.library.activity.fragment.profile.orders.g.c(ordersHistoryFragment, dagger.internal.g.a(this.f142832y));
            return ordersHistoryFragment;
        }

        private com.planner5d.library.interactor.n0 c5() {
            return new com.planner5d.library.interactor.n0(this.Q3.get(), this.R2.get());
        }

        private le.d d3() {
            return c0.c(this.f142643d, c3());
        }

        @z7.a
        private PreloaderBoxView d4(PreloaderBoxView preloaderBoxView) {
            com.planner5d.library.widget.preloader.s.b(preloaderBoxView, this.f142626b0.get());
            com.planner5d.library.widget.preloader.s.d(preloaderBoxView, m2.c(this.f142643d));
            return preloaderBoxView;
        }

        private le.o d5() {
            return l2.c(this.f142643d, c5());
        }

        private com.planner5d.library.interactor.i e3() {
            return new com.planner5d.library.interactor.i(this.f142781s2.get(), d3(), this.R2.get(), this.V0.get());
        }

        @z7.a
        private PremiumFeaturesDialog e4(PremiumFeaturesDialog premiumFeaturesDialog) {
            com.planner5d.library.activity.fragment.dialog.premiumfeature.d.b(premiumFeaturesDialog, this.f142763q2.get());
            com.planner5d.library.activity.fragment.dialog.premiumfeature.d.d(premiumFeaturesDialog, this.f142675g4.get());
            return premiumFeaturesDialog;
        }

        private com.planner5d.library.widget.editor.helper.g1 f3() {
            return new com.planner5d.library.widget.editor.helper.g1(this.P2.get(), this.f142665f3.get(), this.T0.get(), this.V2.get(), this.f142788t0.get(), this.f142832y.get(), this.f142763q2.get(), this.f142841z.get(), this.Z6.get(), this.f142634c, this.R2.get(), k3(), S2(), this.f142693i4.get(), this.U2.get(), this.V0.get(), this.E1.get(), this.U3.get(), this.f142771r1.get(), this.f142624a7.get(), T2(), h3(), this.P.get(), s4.c(this.f142670g), this.S5.get(), R2(), g3(), this.f142660e7.get(), this.f142626b0.get(), this.I2.get(), g3.c(this.f142643d), t(), j3(), i3(), this.f142762q1.get(), this.f142635c0.get(), this.f142644d0.get());
        }

        @z7.a
        private com.planner5d.library.activity.fragment.dialog.purchase.g f4(com.planner5d.library.activity.fragment.dialog.purchase.g gVar) {
            com.planner5d.library.activity.fragment.dialog.purchase.h.b(gVar, this.f142626b0.get());
            com.planner5d.library.activity.fragment.dialog.purchase.h.c(gVar, this.B.get());
            return gVar;
        }

        private com.planner5d.library.widget.editor.helper.r1 g3() {
            return new com.planner5d.library.widget.editor.helper.r1(n2(), t4.c(this.f142670g), this.V0.get(), this.P2.get(), this.P.get(), this.f142763q2.get(), f3.c(this.f142643d), this.f142738n4.get(), b0.c(this.f142643d), this.f142627b1.get());
        }

        @z7.a
        private ProfileEditFragment g4(ProfileEditFragment profileEditFragment) {
            com.planner5d.library.activity.fragment.profile.edit.j.c(profileEditFragment, this.f142827x3.get());
            return profileEditFragment;
        }

        private com.planner5d.library.widget.editor.helper.w1 h3() {
            return new com.planner5d.library.widget.editor.helper.w1(L2(), this.f142763q2.get(), this.f142661f.b(), this.P.get(), f3.c(this.f142643d));
        }

        @z7.a
        private ProfileFragment h4(ProfileFragment profileFragment) {
            com.planner5d.library.activity.fragment.profile.s.d(profileFragment, this.f142675g4.get());
            com.planner5d.library.activity.fragment.profile.s.c(profileFragment, this.V0.get());
            return profileFragment;
        }

        private com.planner5d.library.widget.editor.helper.n2.a i3() {
            return new com.planner5d.library.widget.editor.helper.n2.a(this.R2.get(), K4(), O4(), this.f142763q2.get(), this.V0.get(), this.f142834y1.get());
        }

        @z7.a
        private Project2D i4(Project2D project2D) {
            com.planner5d.library.activity.fragment.projects.o.b(project2D, f3());
            com.planner5d.library.activity.fragment.projects.o.c(project2D, this.f142710k3.get());
            com.planner5d.library.activity.fragment.projects.o.e(project2D, l4.c(this.f142688i));
            return project2D;
        }

        private com.planner5d.library.widget.editor.helper.u2 j3() {
            return new com.planner5d.library.widget.editor.helper.u2(this.f142762q1.get(), n2(), b0.c(this.f142643d));
        }

        @z7.a
        private Project3D j4(Project3D project3D) {
            com.planner5d.library.activity.fragment.projects.q.b(project3D, Q2());
            return project3D;
        }

        private com.planner5d.library.widget.editor.helper.n3 k3() {
            return new com.planner5d.library.widget.editor.helper.n3(this.P2.get(), this.f142665f3.get(), this.f142648d4.get(), this.f142832y.get(), this.E1.get(), this.R2.get(), this.f142634c);
        }

        @z7.a
        private ProjectConflict k4(ProjectConflict projectConflict) {
            com.planner5d.library.activity.fragment.dialog.h0.e(projectConflict, this.f142665f3.get());
            com.planner5d.library.activity.fragment.dialog.h0.c(projectConflict, k3());
            com.planner5d.library.activity.fragment.dialog.h0.f(projectConflict, this.V2.get());
            com.planner5d.library.activity.fragment.dialog.h0.b(projectConflict, this.f142626b0.get());
            com.planner5d.library.activity.fragment.dialog.h0.g(projectConflict, this.f142832y.get());
            return projectConflict;
        }

        private com.planner5d.library.activity.helper.f1 l3() {
            return T3(com.planner5d.library.activity.helper.i1.c());
        }

        @z7.a
        private ProjectRename l4(ProjectRename projectRename) {
            com.planner5d.library.activity.fragment.dialog.titleedit.b.d(projectRename, this.P2.get());
            com.planner5d.library.activity.fragment.dialog.titleedit.b.e(projectRename, this.f142832y.get());
            com.planner5d.library.activity.fragment.dialog.titleedit.b.b(projectRename, b0.c(this.f142643d));
            return projectRename;
        }

        private com.planner5d.library.activity.fragment.projects.h m3() {
            return new com.planner5d.library.activity.fragment.projects.h(this.E1.get(), this.R2.get(), this.f142634c, this.f142819w4.get());
        }

        @z7.a
        private ProjectSettingsBottomSheetDialog m4(ProjectSettingsBottomSheetDialog projectSettingsBottomSheetDialog) {
            com.planner5d.library.activity.fragment.dialog.projectsettings.q0.b(projectSettingsBottomSheetDialog, this.f142626b0.get());
            com.planner5d.library.activity.fragment.dialog.projectsettings.q0.d(projectSettingsBottomSheetDialog, this.V0.get());
            return projectSettingsBottomSheetDialog;
        }

        private com.planner5d.library.model.manager.initialization.d<Main, com.planner5d.library.activity.helper.e2, com.planner5d.library.activity.helper.f2> n3() {
            return new com.planner5d.library.model.manager.initialization.d<>(this.f142772r2.get(), dagger.internal.g.a(com.planner5d.library.activity.helper.g2.a()), dagger.internal.g.a(this.U7));
        }

        @z7.a
        private Projects n4(Projects projects) {
            com.planner5d.library.activity.fragment.projects.y0.d(projects, this.f142763q2.get());
            com.planner5d.library.activity.fragment.projects.y0.b(projects, this.G6.get());
            com.planner5d.library.activity.fragment.projects.y0.f(projects, this.T0.get());
            com.planner5d.library.activity.fragment.projects.y0.c(projects, this.f142843z1.get());
            return projects;
        }

        private com.planner5d.library.model.manager.initialization.d<MainCardboard, com.planner5d.library.activity.helper.b2, com.planner5d.library.activity.helper.b<MainCardboard>> o3() {
            return new com.planner5d.library.model.manager.initialization.d<>(this.f142772r2.get(), dagger.internal.g.a(com.planner5d.library.activity.helper.c.a()), dagger.internal.g.a(this.W7));
        }

        @z7.a
        private ProjectsPagesFragment o4(ProjectsPagesFragment projectsPagesFragment) {
            com.planner5d.library.activity.fragment.projects.i0.b(projectsPagesFragment, this.S5.get());
            com.planner5d.library.activity.fragment.projects.i0.d(projectsPagesFragment, this.R2.get());
            return projectsPagesFragment;
        }

        private void p3(i iVar, gb.a aVar, a5 a5Var, m5 m5Var, f4 f4Var, q3 q3Var, j5 j5Var, u4 u4Var, q4 q4Var, h4 h4Var, q5 q5Var, g5 g5Var, t3 t3Var, m4 m4Var, o4 o4Var, x4 x4Var, com.planner5d.library.application.b bVar, Application application, com.planner5d.library.application.d dVar) {
            this.f142751p = dagger.internal.k.a(application);
            dagger.internal.h hVarA = dagger.internal.k.a(bVar);
            this.f142760q = hVarA;
            ij.c<SharedPreferences> cVarB = dagger.internal.g.b(u1.a(iVar, hVarA));
            this.f142769r = cVarB;
            this.f142778s = dagger.internal.g.b(com.planner5d.library.model.manager.config.xml.b.a(cVarB));
            this.f142787t = b0.a(iVar);
            this.f142796u = dagger.internal.k.a(dVar);
            this.f142805v = dagger.internal.g.b(com.planner5d.library.api.requests.b.a());
            dagger.internal.f fVar = new dagger.internal.f();
            this.f142814w = fVar;
            this.f142823x = com.planner5d.library.api.requests.d.a(this.f142805v, fVar);
            this.f142832y = new dagger.internal.f();
            this.f142841z = new dagger.internal.f();
            ij.c<com.planner5d.library.services.utility.w1> cVarB2 = dagger.internal.g.b(com.planner5d.library.services.utility.x1.a(this.f142751p));
            this.A = cVarB2;
            this.B = dagger.internal.g.b(com.planner5d.library.model.manager.p1.a(this.f142841z, cVarB2));
            this.C = new dagger.internal.f();
            this.D = dagger.internal.g.b(com.planner5d.library.userimporteddata.o.a());
            this.E = dagger.internal.g.b(com.planner5d.library.services.utility.d2.a());
            this.F = dagger.internal.g.b(k2.a(iVar));
            k3 k3VarA = k3.a(iVar, this.f142832y);
            this.G = k3VarA;
            this.H = dagger.internal.g.b(com.planner5d.library.userimporteddata.h.a(this.f142823x, this.F, k3VarA));
            this.I = p0.a(iVar);
            this.J = e5.a(a5Var);
            this.K = com.planner5d.library.database.migration.s.a(com.planner5d.library.database.migration.c.a(), this.I, this.J);
            p4 p4VarA = p4.a(o4Var);
            this.L = p4VarA;
            com.planner5d.library.database.g gVarA = com.planner5d.library.database.g.a(this.f142751p, this.K, p4VarA);
            this.M = gVarA;
            ij.c<ApplicationDatabase> cVarB3 = dagger.internal.g.b(gb.b.a(aVar, gVarA));
            this.N = cVarB3;
            this.O = dagger.internal.g.b(com.planner5d.library.userimporteddata.c.a(cVarB3));
            dagger.internal.f fVar2 = new dagger.internal.f();
            this.P = fVar2;
            k0 k0VarA = k0.a(iVar, fVar2);
            this.Q = k0VarA;
            this.R = dagger.internal.g.b(com.planner5d.library.userimporteddata.j.a(this.f142751p, this.D, this.E, this.H, this.O, this.F, k0VarA));
            this.S = dagger.internal.g.b(com.planner5d.library.services.a0.a(this.f142751p));
            this.T = dagger.internal.g.b(com.planner5d.library.services.utility.j1.a(this.f142751p));
            this.U = s2.a(iVar);
            this.V = dagger.internal.g.b(q1.a(iVar));
            dagger.internal.f fVar3 = new dagger.internal.f();
            this.W = fVar3;
            ij.c<com.planner5d.library.services.backgroundexecutor.g> cVarB4 = dagger.internal.g.b(com.planner5d.library.services.backgroundexecutor.h.a(this.f142751p, fVar3));
            this.X = cVarB4;
            ij.c<com.planner5d.library.services.filedownloader.c> cVarB5 = dagger.internal.g.b(com.planner5d.library.services.filedownloader.d.a(this.f142751p, this.E, this.T, this.U, this.V, cVarB4));
            this.Y = cVarB5;
            this.Z = dagger.internal.g.b(com.planner5d.library.userimporteddata.m.a(this.S, cVarB5));
            ij.c<com.planner5d.library.services.utility.p0.a> cVarB6 = dagger.internal.g.b(o2.a(iVar, this.P));
            this.f142617a0 = cVarB6;
            ij.c<com.planner5d.library.services.utility.p0> cVarB7 = dagger.internal.g.b(com.planner5d.library.services.utility.b1.a(this.A, cVarB6, this.Q));
            this.f142626b0 = cVarB7;
            ij.c<com.planner5d.library.model.converter.json.from.x> cVarB8 = dagger.internal.g.b(com.planner5d.library.model.converter.json.from.y.a(cVarB7));
            this.f142635c0 = cVarB8;
            ij.c<com.planner5d.library.model.converter.json.from.z> cVarB9 = dagger.internal.g.b(com.planner5d.library.model.converter.json.from.a0.a(cVarB8, this.f142626b0));
            this.f142644d0 = cVarB9;
            ij.c<com.planner5d.library.model.converter.json.from.c0> cVarB10 = dagger.internal.g.b(com.planner5d.library.model.converter.json.from.d0.a(this.f142626b0, cVarB9));
            this.f142653e0 = cVarB10;
            ij.c<dd.a> cVarB11 = dagger.internal.g.b(dd.b.a(this.R, this.Z, this.f142626b0, cVarB10, this.Q));
            this.f142662f0 = cVarB11;
            this.f142671g0 = com.planner5d.library.model.converter.json.from.b.a(this.f142841z, cVarB11);
            this.f142680h0 = dagger.internal.g.b(com.planner5d.library.model.converter.json.from.p.a(this.f142644d0));
            this.f142689i0 = dagger.internal.g.b(com.planner5d.library.model.converter.json.from.i.a(this.f142644d0, this.f142635c0));
            this.f142698j0 = dagger.internal.g.b(com.planner5d.library.model.converter.json.from.t.a(this.f142644d0, this.f142635c0, this.f142841z));
            this.f142707k0 = dagger.internal.g.b(com.planner5d.library.model.converter.json.from.n.a(this.f142644d0));
            this.f142716l0 = dagger.internal.g.b(com.planner5d.library.model.converter.json.from.k.a(this.f142644d0, this.f142841z, this.D, this.f142796u));
            ij.c<com.planner5d.library.model.converter.json.from.u> cVarB12 = dagger.internal.g.b(com.planner5d.library.model.converter.json.from.v.a());
            this.f142725m0 = cVarB12;
            this.f142734n0 = dagger.internal.g.b(com.planner5d.library.model.converter.json.from.g.a(this.f142680h0, this.f142689i0, this.f142698j0, this.f142707k0, this.f142716l0, cVarB12));
            ij.c cVarB13 = dagger.internal.g.b(com.planner5d.library.model.manager.builtin.s.a());
            this.f142743o0 = cVarB13;
            ij.c<com.planner5d.library.model.manager.builtin.i> cVar = this.f142841z;
            this.f142752p0 = dagger.internal.g.b(com.planner5d.library.model.manager.builtin.v.a(cVar, this.f142796u, cVar, this.B, this.f142760q, cVarB13));
            ij.c<com.planner5d.library.model.converter.json.from.c> cVarB14 = dagger.internal.g.b(com.planner5d.library.model.converter.json.from.d.a(this.f142626b0));
            this.f142761q0 = cVarB14;
            this.f142770r0 = dagger.internal.g.b(com.planner5d.library.model.manager.builtin.q0.a(this.f142841z, this.f142671g0, this.f142653e0, this.f142734n0, this.P, this.f142626b0, this.f142752p0, cVarB14));
            this.f142779s0 = dagger.internal.g.b(com.planner5d.library.model.manager.builtin.a0.a(this.f142841z, this.f142752p0, this.f142760q, this.B));
            this.f142788t0 = dagger.internal.g.b(ItemBuilder_Factory.create(this.f142841z, this.P));
            ij.c<com.planner5d.library.model.converter.json.to.w> cVarB15 = dagger.internal.g.b(com.planner5d.library.model.converter.json.to.x.a(this.f142626b0));
            this.f142797u0 = cVarB15;
            ij.c<com.planner5d.library.model.converter.json.to.z> cVarB16 = dagger.internal.g.b(com.planner5d.library.model.converter.json.to.a0.a(cVarB15));
            this.f142806v0 = cVarB16;
            this.f142815w0 = dagger.internal.g.b(com.planner5d.library.model.converter.json.to.n.a(cVarB16));
            this.f142824x0 = dagger.internal.g.b(com.planner5d.library.model.converter.json.to.i.a(this.f142806v0, this.f142841z));
            this.f142833y0 = dagger.internal.g.b(com.planner5d.library.model.converter.json.to.e.a(this.f142806v0));
            this.f142842z0 = dagger.internal.g.b(com.planner5d.library.model.converter.json.to.s.a(this.f142806v0));
            this.A0 = dagger.internal.g.b(com.planner5d.library.model.converter.json.to.l.a(this.f142806v0));
            ij.c<com.planner5d.library.model.converter.json.to.t> cVarB17 = dagger.internal.g.b(com.planner5d.library.model.converter.json.to.u.a());
            this.B0 = cVarB17;
            ij.c<com.planner5d.library.model.converter.json.to.b> cVarB18 = dagger.internal.g.b(com.planner5d.library.model.converter.json.to.c.a(this.f142815w0, this.f142824x0, this.f142833y0, this.f142842z0, this.A0, cVarB17));
            this.C0 = cVarB18;
            this.D0 = dagger.internal.g.b(com.planner5d.library.model.converter.json.to.p.a(this.f142626b0, cVarB18));
            this.E0 = new dagger.internal.f();
            ij.c<com.planner5d.library.services.bitmaploader.cache.a> cVarB19 = dagger.internal.g.b(l.a(iVar));
            this.F0 = cVarB19;
            ij.c<com.planner5d.library.services.bitmaploader.background.b> cVarB20 = dagger.internal.g.b(com.planner5d.library.services.bitmaploader.background.c.a(this.f142751p, cVarB19, this.X));
            this.G0 = cVarB20;
            this.H0 = dagger.internal.g.b(com.planner5d.library.services.bitmaploader.h.a(this.f142751p, cVarB20, this.F0, this.E, this.T, this.U));
            dagger.internal.f fVar4 = new dagger.internal.f();
            this.I0 = fVar4;
            ij.c<com.planner5d.library.model.manager.w0> cVarB21 = dagger.internal.g.b(com.planner5d.library.model.manager.x0.a(fVar4, this.H0));
            this.J0 = cVarB21;
            this.K0 = dagger.internal.g.b(com.planner5d.library.model.manager.z0.a(this.H0, cVarB21));
            com.planner5d.library.model.s sVarA = com.planner5d.library.model.s.a(this.f142626b0);
            this.L0 = sVarA;
            this.M0 = com.planner5d.library.model.manager.builtin.materialsmetadataloading.e.a(this.f142751p, this.U, this.E, this.T, this.S, sVarA);
            com.planner5d.library.model.manager.builtin.materialsmetadataloading.c cVarA = com.planner5d.library.model.manager.builtin.materialsmetadataloading.c.a(this.f142751p, this.U, this.E, this.T, this.S);
            this.N0 = cVarA;
            this.O0 = dagger.internal.g.b(com.planner5d.library.model.manager.builtin.x0.a(this.f142760q, this.C, this.P, this.E, this.S, this.K0, this.f142841z, this.I0, this.M0, cVarA));
            this.P0 = new dagger.internal.f();
            this.Q0 = new dagger.internal.f();
            this.R0 = new dagger.internal.f();
            this.S0 = new dagger.internal.f();
            this.T0 = dagger.internal.g.b(n0.a(iVar));
            ij.c<com.planner5d.library.activity.fragment.j> cVarB22 = dagger.internal.g.b(p.a(iVar));
            this.U0 = cVarB22;
            this.V0 = dagger.internal.g.b(com.planner5d.library.activity.fragment.y.a(this.T0, cVarB22));
            ij.c<com.planner5d.library.model.manager.i> cVarB23 = dagger.internal.g.b(com.planner5d.library.model.manager.j.a(this.C, this.P));
            this.W0 = cVarB23;
            this.X0 = dagger.internal.g.b(com.planner5d.library.services.render.c.a(this.f142760q, this.S0, this.V0, cVarB23, this.f142787t));
            this.Y0 = new dagger.internal.f();
            this.Z0 = dagger.internal.g.b(com.planner5d.library.services.upload.h.a());
            this.f142618a1 = gb.f.a(aVar, this.N);
            this.f142627b1 = dagger.internal.g.b(com.planner5d.library.activity.helper.s.a(this.S));
            gb.h hVarA2 = gb.h.a(aVar, this.N);
            this.f142636c1 = hVarA2;
            ij.c<com.planner5d.library.model.manager.spaces.b> cVarB24 = dagger.internal.g.b(com.planner5d.library.model.manager.spaces.c.a(this.f142626b0, this.C, hVarA2, this.f142823x, this.G));
            this.f142645d1 = cVarB24;
            ij.c<com.planner5d.library.model.manager.spaces.documents.c> cVarB25 = dagger.internal.g.b(com.planner5d.library.model.manager.spaces.documents.f.a(this.f142751p, this.W0, this.Y0, this.Z0, this.f142618a1, this.f142627b1, this.f142787t, this.K0, cVarB24, this.f142823x, this.f142832y, this.f142626b0));
            this.f142654e1 = cVarB25;
            dagger.internal.f.b(this.Y0, dagger.internal.g.b(com.planner5d.library.services.upload.b.a(this.f142760q, cVarB25, this.S0, this.V0, this.Z0, this.f142787t, this.W0)));
            dagger.internal.f.b(this.S0, dagger.internal.g.b(com.planner5d.library.model.manager.k2.a(this.f142760q, this.R0, this.X0, this.Y0)));
            ij.c<com.planner5d.library.services.download.d> cVarB26 = dagger.internal.g.b(com.planner5d.library.services.download.e.a());
            this.f142663f1 = cVarB26;
            dagger.internal.f.b(this.R0, dagger.internal.g.b(com.planner5d.library.services.download.b.a(this.f142760q, this.Q0, this.S0, this.V0, cVarB26, this.f142787t, this.W0)));
            com.planner5d.library.services.utility.x xVarA = com.planner5d.library.services.utility.x.a(this.Q, this.f142787t);
            this.f142672g1 = xVarA;
            this.f142681h1 = dagger.internal.g.b(com.planner5d.library.model.manager.l5.a(this.f142841z, this.K0, this.f142823x, this.f142832y, this.f142760q, this.f142796u, this.O0, this.I0, this.H0, this.P, xVarA));
        }

        @z7.a
        private PublicFileProvider p4(PublicFileProvider publicFileProvider) {
            com.planner5d.library.services.share.a.c(publicFileProvider, dagger.internal.g.a(this.Y2));
            return publicFileProvider;
        }

        private void q3(i iVar, gb.a aVar, a5 a5Var, m5 m5Var, f4 f4Var, q3 q3Var, j5 j5Var, u4 u4Var, q4 q4Var, h4 h4Var, q5 q5Var, g5 g5Var, t3 t3Var, m4 m4Var, o4 o4Var, x4 x4Var, com.planner5d.library.application.b bVar, Application application, com.planner5d.library.application.d dVar) {
            ij.c<NetworkErrorUtility> cVarB = dagger.internal.g.b(NetworkErrorUtility_Factory.create(this.T));
            this.f142690i1 = cVarB;
            this.f142699j1 = dagger.internal.g.b(com.planner5d.library.model.manager.managedfiles.z.a(this.f142760q, this.Y, this.P0, this.R0, this.P, this.f142681h1, this.O0, this.E, cVarB, this.T, this.W0, this.f142787t));
            this.f142708k1 = m.a(iVar, this.f142841z);
            this.f142717l1 = m1.a(iVar, this.f142796u);
            this.f142726m1 = w0.a(iVar, this.f142796u);
            this.f142735n1 = i0.a(iVar, this.f142796u);
            ij.c<com.planner5d.library.model.manager.unlockeditems.d> cVarB2 = dagger.internal.g.b(com.planner5d.library.model.manager.unlockeditems.e.a(this.C));
            this.f142744o1 = cVarB2;
            this.f142753p1 = p2.a(iVar, cVarB2);
            dagger.internal.f fVar = new dagger.internal.f();
            this.f142762q1 = fVar;
            ij.c<com.planner5d.library.model.manager.unlockeditems.b> cVarB3 = dagger.internal.g.b(com.planner5d.library.model.manager.unlockeditems.c.a(this.C, fVar, this.f142787t));
            this.f142771r1 = cVarB3;
            this.f142780s1 = n2.a(iVar, cVarB3);
            this.f142789t1 = dagger.internal.g.b(sd.c.a(this.f142751p));
            ij.c<com.planner5d.library.model.manager.config.source.g> cVarB4 = dagger.internal.g.b(com.planner5d.library.model.manager.config.source.h.a(this.P));
            this.f142798u1 = cVarB4;
            this.f142807v1 = com.planner5d.library.model.manager.config.source.i.a(this.f142789t1, cVarB4);
            this.f142816w1 = dagger.internal.g.b(com.planner5d.library.model.manager.config.source.m.a(this.f142751p, this.f142823x, this.C, this.P, this.G));
            this.f142825x1 = new dagger.internal.f();
            ij.c<com.planner5d.library.services.utility.t> cVarB5 = dagger.internal.g.b(s.a(iVar));
            this.f142834y1 = cVarB5;
            ij.c<com.planner5d.library.model.manager.config.d> cVarB6 = dagger.internal.g.b(com.planner5d.library.model.manager.config.e.a(this.f142796u, this.f142807v1, this.f142816w1, this.f142825x1, this.f142762q1, cVarB5));
            this.f142843z1 = cVarB6;
            this.A1 = dagger.internal.g.b(o.a(iVar, cVarB6));
            i1 i1VarA = i1.a(iVar, this.f142796u);
            this.B1 = i1VarA;
            ij.c<com.planner5d.library.model.payments.paymentmethod.g> cVarB7 = dagger.internal.g.b(com.planner5d.library.model.payments.paymentmethod.h.a(this.f142751p, i1VarA, this.f142787t, this.f142834y1));
            this.C1 = cVarB7;
            this.D1 = dagger.internal.g.b(v0.a(iVar, this.f142726m1, cVarB7));
            dagger.internal.f fVar2 = new dagger.internal.f();
            this.E1 = fVar2;
            this.F1 = w2.a(iVar, fVar2);
            dagger.internal.f fVar3 = new dagger.internal.f();
            this.G1 = fVar3;
            u0 u0VarA = u0.a(iVar, fVar3);
            this.H1 = u0VarA;
            this.I1 = dagger.internal.g.b(com.planner5d.library.model.payments.paymentmethod.j.a(this.F1, u0VarA));
            dagger.internal.f fVar4 = new dagger.internal.f();
            this.J1 = fVar4;
            this.K1 = dagger.internal.g.b(f0.a(iVar, fVar4));
            this.L1 = dagger.internal.g.b(com.planner5d.library.model.manager.payments.f.a(this.f142751p, this.Q));
            ij.c<com.planner5d.library.services.utility.a2> cVarB8 = dagger.internal.g.b(q0.a(iVar));
            this.M1 = cVarB8;
            this.N1 = dagger.internal.g.b(com.planner5d.library.model.manager.payments.w.a(this.f142787t, this.f142834y1, cVarB8, this.G));
            this.O1 = dagger.internal.g.b(com.planner5d.library.model.region.i.a(this.f142751p));
            this.P1 = dagger.internal.g.b(com.planner5d.library.model.region.k.a(this.f142832y));
            this.Q1 = dagger.internal.g.b(com.planner5d.library.model.region.g.a(this.f142751p));
            ij.c<com.planner5d.library.model.region.b> cVarB9 = dagger.internal.g.b(com.planner5d.library.model.region.c.a());
            this.R1 = cVarB9;
            ij.c<com.planner5d.library.services.e0> cVarB10 = dagger.internal.g.b(o1.a(iVar, this.O1, this.P1, this.Q1, cVarB9));
            this.S1 = cVarB10;
            ij.c<com.planner5d.library.model.manager.payments.r> cVarB11 = dagger.internal.g.b(com.planner5d.library.model.manager.payments.s.a(this.f142751p, this.f142834y1, this.f142823x, this.f142690i1, this.E, this.C, this.K1, cVarB10, this.G));
            this.T1 = cVarB11;
            ij.c<com.planner5d.library.model.manager.payments.p> cVarB12 = dagger.internal.g.b(com.planner5d.library.model.manager.payments.q.a(this.f142751p, this.f142626b0, this.K1, this.Q, this.f142690i1, this.L1, this.D1, this.N1, cVarB11, this.F));
            this.U1 = cVarB12;
            dagger.internal.f.b(this.G1, dagger.internal.g.b(com.planner5d.library.model.manager.payments.l.a(this.f142751p, this.A1, this.f142626b0, this.D1, this.I1, cVarB12, this.T1, this.E, this.L1, this.f142726m1, this.N1, this.G, this.f142823x, this.F1, this.Q, this.f142787t)));
            this.V1 = dagger.internal.g.b(com.planner5d.library.modules.user.user.h0.a(this.f142787t, this.f142834y1, com.planner5d.library.services.utility.a3.a(), this.C, this.G1, this.G));
            this.W1 = m0.a(iVar, this.Q0);
            ij.c<com.planner5d.library.model.manager.w> cVarB13 = dagger.internal.g.b(y.a(iVar, this.f142762q1));
            this.X1 = cVarB13;
            dagger.internal.f.b(this.E1, dagger.internal.g.b(com.planner5d.library.modules.user.user.v0.a(this.C, this.f142708k1, this.f142717l1, this.f142726m1, this.f142735n1, this.G, this.f142753p1, this.f142780s1, this.G1, this.U1, this.V1, this.W1, cVarB13)));
            ij.c<com.planner5d.library.model.manager.l> cVarB14 = dagger.internal.g.b(com.planner5d.library.model.manager.m.a(this.N));
            this.Y1 = cVarB14;
            ij.c<com.planner5d.library.model.manager.managedfiles.d> cVarB15 = dagger.internal.g.b(com.planner5d.library.model.manager.managedfiles.e.a(cVarB14));
            this.Z1 = cVarB15;
            ij.c<com.planner5d.library.model.manager.managedfiles.t> cVarB16 = dagger.internal.g.b(com.planner5d.library.model.manager.managedfiles.u.a(cVarB15));
            this.f142619a2 = cVarB16;
            this.f142628b2 = com.planner5d.library.model.manager.managedfiles.s.a(this.f142760q, this.f142699j1, this.f142841z, this.f142832y, this.E1, this.I0, cVarB16, this.C, this.J1, this.f142626b0, this.Q0, this.P0, this.E0, this.f142681h1, this.E);
            this.f142637c2 = dagger.internal.g.b(com.planner5d.library.model.manager.initialization.y.a());
            dagger.internal.f fVar5 = new dagger.internal.f();
            this.f142646d2 = fVar5;
            this.f142655e2 = dagger.internal.g.b(com.planner5d.library.model.manager.initialization.c0.a(this.f142760q, this.C, this.K0, this.f142841z, this.J1, this.f142762q1, fVar5));
            this.f142664f2 = d5.a(a5Var);
            this.f142673g2 = f5.a(a5Var);
            ij.c<com.planner5d.library.model.manager.statistics.g> cVarB17 = dagger.internal.g.b(com.planner5d.library.model.manager.statistics.h.a(this.f142751p));
            this.f142682h2 = cVarB17;
            ij.c<com.planner5d.library.model.manager.statistics.b0> cVarB18 = dagger.internal.g.b(com.planner5d.library.model.manager.statistics.e0.a(this.f142664f2, this.f142673g2, this.f142832y, cVarB17));
            this.f142691i2 = cVarB18;
            this.f142700j2 = dagger.internal.g.b(com.planner5d.library.model.manager.initialization.w.a(cVarB18));
            this.f142709k2 = dagger.internal.g.b(g1.a(iVar));
            this.f142718l2 = dagger.internal.g.b(com.planner5d.library.model.manager.g2.a(this.f142751p, this.C, this.f142626b0));
            this.f142727m2 = dagger.internal.g.b(com.planner5d.library.modules.user.user.a1.a(this.f142760q, this.C));
            this.f142736n2 = dagger.internal.g.b(com.planner5d.library.modules.user.user.c1.a(this.U1));
            this.f142745o2 = dagger.internal.g.b(com.planner5d.library.modules.user.user.s0.a(this.f142823x, this.f142814w));
            h2 h2VarA = h2.a(iVar, this.f142691i2);
            this.f142754p2 = h2VarA;
            this.f142763q2 = dagger.internal.g.b(com.planner5d.library.activity.fragment.dialog.m.a(h2VarA, this.Q));
            this.f142772r2 = new dagger.internal.f();
            ij.c<com.planner5d.library.activity.fragment.n> cVarB19 = dagger.internal.g.b(com.planner5d.library.activity.fragment.o.a(this.f142762q1));
            this.f142781s2 = cVarB19;
            ij.c<com.planner5d.library.modules.user.user.b> cVarB20 = dagger.internal.g.b(com.planner5d.library.modules.user.user.c.a(this.f142745o2, this.f142763q2, this.f142772r2, this.V0, this.C, this.f142832y, this.E1, cVarB19, this.f142787t));
            this.f142790t2 = cVarB20;
            this.f142799u2 = dagger.internal.g.b(com.planner5d.library.modules.user.user.e1.a(this.f142760q, this.C, this.f142727m2, this.f142736n2, this.f142796u, this.f142832y, cVarB20, this.E));
            ij.c<com.planner5d.library.model.manager.payments.a0> cVarB21 = dagger.internal.g.b(h5.a(g5Var));
            this.f142808v2 = cVarB21;
            this.f142817w2 = com.planner5d.library.model.manager.initialization.a0.a(this.f142841z, this.Y1, this.f142832y, this.f142709k2, this.f142681h1, this.f142718l2, this.G1, this.f142799u2, this.f142762q1, cVarB21, this.f142646d2);
            v3 v3VarA = v3.a(t3Var);
            this.f142826x2 = v3VarA;
            this.f142835y2 = com.planner5d.library.model.manager.initialization.u.a(v3VarA);
            ij.c<com.planner5d.library.activity.fragment.startup.a> cVarB22 = dagger.internal.g.b(com.planner5d.library.activity.fragment.startup.b.a(this.f142760q, this.f142709k2, this.f142832y));
            this.f142844z2 = cVarB22;
            k kVarA = k.a(iVar, cVarB22);
            this.A2 = kVarA;
            dagger.internal.f.b(this.f142772r2, dagger.internal.g.b(com.planner5d.library.model.manager.initialization.s.a(this.f142637c2, this.f142655e2, this.f142700j2, this.f142817w2, this.f142835y2, kVarA, this.P)));
            dagger.internal.f.b(this.Q0, dagger.internal.g.b(com.planner5d.library.model.manager.managedfiles.b0.a(this.f142699j1, this.E0, this.f142628b2, this.f142772r2, this.f142787t)));
            dagger.internal.f.b(this.P0, dagger.internal.g.b(com.planner5d.library.model.manager.builtin.h0.a(this.f142760q, this.Y, this.f142823x, this.E0, this.f142841z, this.O0, this.Q0, this.E, this.f142832y)));
            dagger.internal.f.b(this.I0, dagger.internal.g.b(com.planner5d.library.model.manager.builtin.o.a(this.f142760q, this.f142841z, this.P0, this.Q0)));
            dagger.internal.f.b(this.E0, dagger.internal.g.b(com.planner5d.library.model.manager.builtin.q.a(this.f142841z, this.I0, this.C)));
            com.planner5d.library.services.utility.g2 g2VarA = com.planner5d.library.services.utility.g2.a(this.Q);
            this.B2 = g2VarA;
            this.C2 = dagger.internal.g.b(com.planner5d.library.model.manager.builtin.m0.a(this.f142751p, this.f142796u, this.f142841z, this.B, this.Y1, g2VarA));
            com.planner5d.library.interactor.l lVarA = com.planner5d.library.interactor.l.a(this.P, this.Q0, this.S, this.f142787t);
            this.D2 = lVarA;
            a3 a3VarA = a3.a(iVar, lVarA);
            this.E2 = a3VarA;
            dagger.internal.f.b(this.f142841z, dagger.internal.g.b(com.planner5d.library.model.manager.builtin.j.a(this.B, this.C, this.f142770r0, this.f142779s0, this.f142752p0, this.f142743o0, this.f142760q, this.f142788t0, this.D0, this.E0, this.O0, this.Q0, this.E1, this.C2, this.P, this.P0, this.S, a3VarA)));
            dagger.internal.f.b(this.J1, dagger.internal.g.b(com.planner5d.library.model.manager.f1.a(this.f142841z, this.f142626b0, this.f142760q, this.f142823x, this.C, this.f142832y, this.f142727m2, this.f142646d2, this.f142789t1, this.P, this.f142834y1)));
            dagger.internal.f.b(this.P, dagger.internal.g.b(com.planner5d.library.model.manager.v1.a(this.f142823x, this.f142832y, this.f142796u, this.f142760q, this.J1, this.f142646d2, this.f142762q1, this.F)));
            this.F2 = com.planner5d.library.model.manager.config.source.b.a(this.f142796u);
            s3 s3VarA = s3.a(q3Var);
            this.G2 = s3VarA;
            dagger.internal.f.b(this.f142825x1, r5.a(q5Var, this.P, this.F2, this.f142816w1, s3VarA, this.f142807v1));
            dagger.internal.f.b(this.f142762q1, dagger.internal.g.b(com.planner5d.library.model.manager.config.k.a(this.f142796u, this.f142825x1, this.f142787t, this.f142834y1)));
            this.H2 = dagger.internal.g.b(com.planner5d.library.model.manager.crashreporting.w.a(this.f142789t1, this.f142841z, this.J1, this.f142832y));
            ij.c<com.planner5d.library.model.manager.performancetracing.e> cVarB23 = dagger.internal.g.b(z0.a(iVar));
            this.I2 = cVarB23;
            ij.c<com.planner5d.library.model.manager.crashreporting.d0> cVarB24 = dagger.internal.g.b(com.planner5d.library.model.manager.crashreporting.e0.a(this.f142760q, this.f142841z, this.J1, this.f142832y, cVarB23, this.L));
            this.J2 = cVarB24;
            dagger.internal.f.b(this.f142646d2, dagger.internal.g.b(com.planner5d.library.model.manager.crashreporting.m.a(this.f142762q1, this.P, this.f142787t, this.H2, cVarB24)));
            dagger.internal.f.b(this.W, t.a(iVar, this.f142646d2));
            ij.c<com.planner5d.library.model.manager.config.sql.l> cVarB25 = dagger.internal.g.b(com.planner5d.library.model.manager.config.sql.m.a(this.f142751p, this.f142778s, this.f142787t, this.W));
            this.K2 = cVarB25;
            dagger.internal.f.b(this.C, v1.a(iVar, cVarB25));
            ij.c<com.planner5d.library.api.support.l> cVarB26 = dagger.internal.g.b(com.planner5d.library.api.support.m.a(this.C));
            this.L2 = cVarB26;
            com.planner5d.library.api.support.q qVarA = com.planner5d.library.api.support.q.a(this.G, this.C, this.f142626b0, this.f142814w, this.f142751p, this.K1, this.S1, cVarB26);
            this.M2 = qVarA;
            ij.c<com.planner5d.library.api.support.b> cVarB27 = dagger.internal.g.b(com.planner5d.library.api.support.c.a(this.C, qVarA, this.L));
            this.N2 = cVarB27;
            dagger.internal.f.b(this.f142814w, dagger.internal.g.b(a1.a(iVar, cVarB27)));
        }

        @z7.a
        private PurchaseDialog q4(PurchaseDialog purchaseDialog) {
            com.planner5d.library.activity.fragment.dialog.purchase.x.f(purchaseDialog, this.T4.get());
            com.planner5d.library.activity.fragment.dialog.purchase.x.e(purchaseDialog, dagger.internal.g.a(this.W3));
            com.planner5d.library.activity.fragment.dialog.purchase.x.c(purchaseDialog, i4.c(this.f142688i));
            com.planner5d.library.activity.fragment.dialog.purchase.x.b(purchaseDialog, this.Q2.get());
            com.planner5d.library.activity.fragment.dialog.purchase.x.g(purchaseDialog, this.f142691i2.get());
            return purchaseDialog;
        }

        private void r3(i iVar, gb.a aVar, a5 a5Var, m5 m5Var, f4 f4Var, q3 q3Var, j5 j5Var, u4 u4Var, q4 q4Var, h4 h4Var, q5 q5Var, g5 g5Var, t3 t3Var, m4 m4Var, o4 o4Var, x4 x4Var, com.planner5d.library.application.b bVar, Application application, com.planner5d.library.application.d dVar) {
            this.O2 = com.planner5d.library.modules.user.user.h1.a(this.f142832y, this.f142823x, this.f142760q, this.f142762q1);
            this.P2 = new dagger.internal.f();
            ij.c<ErrorMessageParser> cVarB = dagger.internal.g.b(ErrorMessageParser_Factory.create(this.f142751p, this.f142690i1));
            this.Q2 = cVarB;
            this.R2 = dagger.internal.g.b(com.planner5d.library.model.manager.d2.a(cVarB));
            g3 g3VarA = g3.a(iVar);
            this.S2 = g3VarA;
            com.planner5d.library.services.h0 h0VarA = com.planner5d.library.services.h0.a(this.P2, this.f142787t, this.R2, this.K0, g3VarA);
            this.T2 = h0VarA;
            this.U2 = dagger.internal.g.b(com.planner5d.library.model.manager.contest.i.a(this.f142823x, this.f142751p, this.f142626b0, this.C, this.P2, this.G, h0VarA));
            dagger.internal.f fVar = new dagger.internal.f();
            this.V2 = fVar;
            this.W2 = dagger.internal.g.b(com.planner5d.library.model.manager.d0.a(this.f142760q, this.f142626b0, fVar, this.f142672g1));
            this.X2 = dagger.internal.g.b(com.planner5d.library.activity.helper.c0.a(this.f142672g1, this.S));
            dagger.internal.f fVar2 = new dagger.internal.f();
            this.Y2 = fVar2;
            com.planner5d.library.model.manager.f4 f4VarA = com.planner5d.library.model.manager.f4.a(fVar2, this.f142832y, this.X0, this.C, this.X1, this.f142787t);
            this.Z2 = f4VarA;
            dagger.internal.f.b(this.Y2, dagger.internal.g.b(com.planner5d.library.model.manager.g4.a(this.W2, this.K0, this.P2, this.f142626b0, this.D0, this.V2, this.X2, this.f142760q, this.f142796u, this.f142832y, this.R2, this.f142823x, this.Q2, this.V0, this.f142762q1, f4VarA, this.E)));
            com.planner5d.library.model.manager.e5 e5VarA = com.planner5d.library.model.manager.e5.a(this.f142769r);
            this.f142620a3 = e5VarA;
            com.planner5d.library.model.manager.synchronization.e eVarA = com.planner5d.library.model.manager.synchronization.e.a(this.f142760q, this.U2, this.W2, this.P, this.P2, this.C, this.Y2, e5VarA, this.f142823x);
            this.f142629b3 = eVarA;
            dagger.internal.f.b(this.V2, dagger.internal.g.b(com.planner5d.library.model.manager.synchronization.l.a(this.f142832y, eVarA)));
            this.f142638c3 = dagger.internal.g.b(com.planner5d.library.model.converter.json.from.r.a(this.f142626b0, this.f142734n0, this.f142635c0, this.f142671g0, this.R2));
            this.f142647d3 = com.planner5d.library.model.manager.project.d.a(this.K0, this.f142841z);
            h1 h1VarA = h1.a(iVar);
            this.f142656e3 = h1VarA;
            ij.c<com.planner5d.library.model.manager.project.m0> cVarB2 = dagger.internal.g.b(com.planner5d.library.model.manager.project.n0.a(this.P2, this.f142626b0, this.F, h1VarA));
            this.f142665f3 = cVarB2;
            dagger.internal.f.b(this.P2, dagger.internal.g.b(com.planner5d.library.model.manager.project.f0.a(this.V2, this.f142626b0, this.D0, this.f142638c3, this.W2, this.f142841z, this.P, this.X2, this.f142760q, this.Y1, this.f142647d3, cVarB2, this.f142672g1)));
            this.f142674g3 = dagger.internal.g.b(com.planner5d.library.modules.user.user.e.a(this.f142745o2, this.f142763q2, this.f142772r2, this.V0, this.C, this.f142832y, this.E1, this.f142781s2, this.f142787t));
            this.f142683h3 = j4.a(h4Var);
            com.planner5d.library.modules.user.user.n1 n1VarA = com.planner5d.library.modules.user.user.n1.a(this.C, this.P);
            this.f142692i3 = n1VarA;
            dagger.internal.f.b(this.f142832y, dagger.internal.g.b(com.planner5d.library.modules.user.user.y.a(this.f142814w, this.J1, this.f142760q, this.f142796u, this.f142762q1, this.C, this.O2, this.P, this.f142799u2, this.P2, this.W2, this.V2, this.f142691i2, this.Q0, this.f142790t2, this.f142674g3, this.f142745o2, this.f142709k2, this.f142646d2, this.U2, this.f142683h3, n1VarA, this.f142823x, this.U1, this.E1, this.V1, this.Q2, this.B, this.f142787t)));
            this.f142701j3 = dagger.internal.g.b(com.planner5d.library.activity.helper.imagechooser.k.a(this.f142763q2, this.P));
            this.f142710k3 = dagger.internal.g.b(com.planner5d.library.widget.editor.helper.b2.a());
            this.f142719l3 = dagger.internal.g.b(com.planner5d.library.model.manager.g.a(this.f142832y));
            this.f142728m3 = com.planner5d.library.activity.fragment.startup.y.a(this.f142760q, this.f142762q1, this.f142772r2, this.f142709k2, this.f142832y, this.f142844z2, this.E, this.C, this.f142645d1, this.f142692i3);
            this.f142737n3 = com.planner5d.library.activity.fragment.messages.h.a(this.R2);
            ij.c<com.planner5d.library.modules.user.auth.m> cVarB3 = dagger.internal.g.b(com.planner5d.library.modules.user.auth.n.a(this.f142751p, this.E, this.O2, this.f142832y));
            this.f142746o3 = cVarB3;
            this.f142755p3 = com.planner5d.library.activity.fragment.settings.i.a(this.f142832y, this.O2, this.R2, cVarB3);
            this.f142764q3 = com.planner5d.library.activity.fragment.dialog.authentication.f1.a(this.f142691i2, this.f142762q1);
            this.f142773r3 = com.planner5d.library.activity.fragment.dialog.authentication.z.a(this.f142746o3);
            this.f142782s3 = com.planner5d.library.activity.fragment.dialog.authentication.d1.a(this.f142832y, this.f142745o2, this.f142709k2, this.Q2, this.f142790t2);
            this.f142791t3 = com.planner5d.library.activity.fragment.dialog.authentication.w0.a(this.f142832y, this.Q2, this.f142790t2);
            this.f142800u3 = com.planner5d.library.activity.fragment.dialog.authentication.onelink.m.a(this.f142760q, this.f142832y, this.Q2, this.E);
            this.f142809v3 = com.planner5d.library.activity.fragment.dialog.authentication.onelink.w.a(this.f142760q, this.Q2, this.E, this.C, this.f142832y, this.f142709k2);
            this.f142818w3 = com.planner5d.library.activity.fragment.dialog.authentication.g0.a(this.f142832y, this.Q2);
            ij.c<com.planner5d.library.modules.user.auth.r> cVarB4 = dagger.internal.g.b(com.planner5d.library.modules.user.auth.s.a(this.f142751p, this.f142762q1, this.f142787t, this.E));
            this.f142827x3 = cVarB4;
            ij.c<com.planner5d.library.modules.user.user.m0> cVarB5 = dagger.internal.g.b(com.planner5d.library.modules.user.user.n0.a(this.f142823x, this.f142760q, this.f142832y, this.J1, this.f142691i2, this.f142646d2, this.Y1, this.C, this.P2, this.f142772r2, this.f142683h3, this.f142841z, cVarB4, this.f142762q1, this.S, this.P0));
            this.f142836y3 = cVarB5;
            this.f142845z3 = com.planner5d.library.activity.fragment.dialog.authentication.privacy.d.a(this.f142790t2, cVarB5, this.f142832y);
            this.A3 = com.planner5d.library.activity.fragment.dialog.authentication.l1.a(this.f142745o2, this.f142832y);
            this.B3 = k4.a(h4Var);
            h3 h3VarA = h3.a(iVar);
            this.C3 = h3VarA;
            this.D3 = com.planner5d.library.activity.fragment.list.m1.a(this.f142760q, this.f142763q2, this.V2, this.W2, this.f142832y, this.B3, this.f142762q1, this.U2, this.R2, this.V0, this.f142796u, this.B2, this.Q2, this.S2, this.f142654e1, h3VarA);
            this.E3 = k5.a(j5Var);
            this.F3 = dagger.internal.g.b(com.planner5d.library.activity.fragment.projects.d0.a());
            this.G3 = l5.a(j5Var);
            this.H3 = r4.a(q4Var);
            gb.c cVarA = gb.c.a(aVar, this.N);
            this.I3 = cVarA;
            this.J3 = dagger.internal.g.b(com.planner5d.library.model.manager.c.a(this.f142760q, cVarA, this.C, this.f142823x, this.f142832y));
            com.planner5d.library.activity.helper.k2 k2VarA = com.planner5d.library.activity.helper.k2.a(this.R2);
            this.K3 = k2VarA;
            com.planner5d.library.activity.helper.n2 n2VarA = com.planner5d.library.activity.helper.n2.a(k2VarA);
            this.L3 = n2VarA;
            this.M3 = dagger.internal.g.b(com.planner5d.library.activity.helper.f.a(this.J3, this.V0, this.f142787t, n2VarA));
            com.planner5d.library.model.manager.favorite.d dVarA = com.planner5d.library.model.manager.favorite.d.a(this.C, this.f142834y1);
            this.N3 = dVarA;
            com.planner5d.library.model.manager.favorite.room.b bVarA = com.planner5d.library.model.manager.favorite.room.b.a(dVarA, this.N);
            this.O3 = bVarA;
            j0 j0VarA = j0.a(iVar, bVarA);
            this.P3 = j0VarA;
            ij.c<com.planner5d.library.model.manager.favorite.a> cVarB6 = dagger.internal.g.b(com.planner5d.library.model.manager.favorite.b.a(this.f142832y, j0VarA, this.f142823x));
            this.Q3 = cVarB6;
            this.R3 = dagger.internal.g.b(com.planner5d.library.model.manager.r0.a(this.f142841z, cVarB6, this.f142823x, this.Q2, this.Y2, this.f142832y));
            this.S3 = dagger.internal.g.b(com.planner5d.library.widget.rate.f.a(this.f142691i2, this.f142763q2));
            ij.c<com.planner5d.library.widget.rate.a> cVarB7 = dagger.internal.g.b(com.planner5d.library.widget.rate.b.a(this.C));
            this.T3 = cVarB7;
            this.U3 = dagger.internal.g.b(com.planner5d.library.widget.rate.i.a(this.C, this.S3, cVarB7, this.f142787t));
            this.V3 = com.planner5d.library.activity.fragment.startup.f.a(this.f142832y, this.f142790t2, this.C);
            ij.c<com.planner5d.library.model.manager.config.n> cVarB8 = dagger.internal.g.b(com.planner5d.library.model.manager.config.o.a(this.f142762q1, com.planner5d.library.model.manager.config.purchaseplacement.d.a()));
            this.W3 = cVarB8;
            ij.c<com.planner5d.library.activity.fragment.dialog.purchase.s> cVarB9 = dagger.internal.g.b(com.planner5d.library.activity.fragment.dialog.purchase.u.a(this.f142762q1, cVarB8, this.E1, this.G, this.f142763q2));
            this.X3 = cVarB9;
            this.Y3 = ia.e.a(cVarB9);
            this.Z3 = dagger.internal.g.b(d2.a(iVar));
            this.f142621a4 = l1.a(iVar, this.f142691i2);
            com.planner5d.library.activity.fragment.dialog.a0 a0VarA = com.planner5d.library.activity.fragment.dialog.a0.a(this.f142763q2);
            this.f142630b4 = a0VarA;
            this.f142639c4 = b1.a(iVar, a0VarA);
            ij.c<com.planner5d.library.model.manager.project.h0> cVarB10 = dagger.internal.g.b(com.planner5d.library.model.manager.project.i0.a(this.f142751p, this.R3, this.P, this.f142823x, this.f142832y));
            this.f142648d4 = cVarB10;
            com.planner5d.library.widget.editor.helper.p3 p3VarA = com.planner5d.library.widget.editor.helper.p3.a(this.P2, this.f142665f3, cVarB10, this.f142832y, this.E1, this.R2, this.f142796u);
            this.f142657e4 = p3VarA;
            this.f142666f4 = e0.a(iVar, p3VarA);
            dagger.internal.f fVar3 = new dagger.internal.f();
            this.f142675g4 = fVar3;
            j1 j1VarA = j1.a(iVar, fVar3);
            this.f142684h4 = j1VarA;
            ij.c<com.planner5d.library.activity.helper.l0> cVarB11 = dagger.internal.g.b(com.planner5d.library.activity.helper.m0.a(this.f142726m1, this.f142717l1, this.X1, this.Z3, this.f142621a4, this.G1, this.T0, this.f142763q2, this.f142639c4, this.f142666f4, this.V0, j1VarA, this.G, this.f142787t));
            this.f142693i4 = cVarB11;
            j jVarA = j.a(iVar, cVarB11);
            this.f142702j4 = jVarA;
            ia.h hVarA = ia.h.a(jVarA, this.f142808v2);
            this.f142711k4 = hVarA;
            dagger.internal.f.b(this.f142675g4, dagger.internal.g.b(ia.c.a(this.W3, this.X3, this.Y3, hVarA)));
            this.f142720l4 = c2.a(iVar);
            this.f142729m4 = dagger.internal.g.b(g2.a(iVar));
            this.f142738n4 = dagger.internal.g.b(i5.a(g5Var));
            t2 t2VarA = t2.a(iVar);
            this.f142747o4 = t2VarA;
            com.planner5d.library.interactor.h hVarA2 = com.planner5d.library.interactor.h.a(this.f142760q, this.H3, this.M3, this.f142781s2, this.V0, this.R3, this.E3, this.T0, this.U3, this.V3, this.f142675g4, this.f142720l4, this.f142729m4, this.f142808v2, this.f142738n4, this.G3, this.f142832y, t2VarA, this.f142763q2);
            this.f142756p4 = hVarA2;
            c0 c0VarA = c0.a(iVar, hVarA2);
            this.f142765q4 = c0VarA;
            com.planner5d.library.interactor.j jVarA2 = com.planner5d.library.interactor.j.a(this.f142781s2, c0VarA, this.R2, this.V0);
            this.f142774r4 = jVarA2;
            this.f142783s4 = d0.a(iVar, jVarA2);
            this.f142792t4 = dagger.internal.g.b(com.planner5d.library.activity.helper.v0.a(this.f142763q2));
            com.planner5d.library.interactor.t tVarA = com.planner5d.library.interactor.t.a(this.f142626b0, this.P2, this.f142832y, this.f142787t);
            this.f142801u4 = tVarA;
            c3 c3VarA = c3.a(iVar, tVarA);
            this.f142810v4 = c3VarA;
            ij.c<com.planner5d.library.activity.helper.z0> cVarB12 = dagger.internal.g.b(com.planner5d.library.activity.helper.c1.a(this.f142792t4, this.P, c3VarA));
            this.f142819w4 = cVarB12;
            com.planner5d.library.activity.fragment.projects.i iVarA = com.planner5d.library.activity.fragment.projects.i.a(this.E1, this.R2, this.f142796u, cVarB12);
            this.f142828x4 = iVarA;
            this.f142837y4 = com.planner5d.library.activity.fragment.projects.x0.a(this.f142762q1, this.f142763q2, this.W2, this.E3, this.K0, this.T0, this.R2, this.V0, this.B2, this.P2, this.F3, this.G3, this.f142832y, this.f142760q, this.f142796u, this.f142781s2, this.f142783s4, iVarA, this.C, this.E1);
            this.f142846z4 = com.planner5d.library.activity.fragment.snapshots.d1.a(this.T0, this.Y2, this.Z2, this.f142832y, this.W2, this.f142763q2, this.V0, this.F3, this.f142834y1);
            this.A4 = com.planner5d.library.activity.fragment.snapshots.l0.a(this.Z2);
            this.B4 = com.planner5d.library.activity.fragment.snapshots.i.a(this.G, this.F1, this.Y2);
            r3 r3VarA = r3.a(q3Var);
            this.C4 = r3VarA;
            this.D4 = dagger.internal.g.b(com.planner5d.library.model.manager.menu.b.a(this.f142760q, this.E1, this.f142796u, r3VarA, this.f142762q1));
            this.E4 = com.planner5d.library.modules.user.user.b0.a(this.f142823x, this.K0);
        }

        @z7.a
        private PurchasePagePlanRecognitions r4(PurchasePagePlanRecognitions purchasePagePlanRecognitions) {
            com.planner5d.library.activity.fragment.dialog.purchase.recognitions.c.c(purchasePagePlanRecognitions, this.f142661f.b());
            return purchasePagePlanRecognitions;
        }

        private void s3(i iVar, gb.a aVar, a5 a5Var, m5 m5Var, f4 f4Var, q3 q3Var, j5 j5Var, u4 u4Var, q4 q4Var, h4 h4Var, q5 q5Var, g5 g5Var, t3 t3Var, m4 m4Var, o4 o4Var, x4 x4Var, com.planner5d.library.application.b bVar, Application application, com.planner5d.library.application.d dVar) {
            this.F4 = com.planner5d.library.activity.fragment.profile.y.a(this.B3, this.D4, this.f142832y, this.E4, this.E1, this.f142796u, this.f142762q1);
            this.G4 = com.planner5d.library.activity.fragment.profile.edit.p.a(this.f142760q, this.f142832y, this.E4, this.O2, this.f142701j3, this.f142762q1);
            this.H4 = com.planner5d.library.activity.fragment.profile.edit.item.f.a(this.f142832y, this.R2);
            this.I4 = com.planner5d.library.activity.fragment.profile.edit.password.g.a(this.f142832y, this.R2);
            this.J4 = com.planner5d.library.activity.fragment.profile.orders.n.a(this.G1, this.f142832y, this.E1, this.f142626b0, this.f142796u, this.Y2, this.f142751p);
            this.K4 = com.planner5d.library.activity.fragment.gallery.l0.a(this.Q3);
            ij.c<com.planner5d.library.activity.fragment.gallery.v> cVarB = dagger.internal.g.b(com.planner5d.library.activity.fragment.gallery.w.a(this.f142832y, this.f142760q));
            this.L4 = cVarB;
            this.M4 = com.planner5d.library.activity.fragment.gallery.y.a(cVarB, this.f142841z, this.f142834y1);
            this.N4 = com.planner5d.library.activity.fragment.gallery.q0.a(this.K0, this.Y2, this.R2);
            com.planner5d.library.interactor.o0 o0VarA = com.planner5d.library.interactor.o0.a(this.Q3, this.R2);
            this.O4 = o0VarA;
            this.P4 = l2.a(iVar, o0VarA);
            this.Q4 = com.planner5d.library.model.j.a(this.f142841z);
            ij.c<com.planner5d.library.activity.fragment.gallery.m> cVarB2 = dagger.internal.g.b(com.planner5d.library.activity.fragment.gallery.n.a());
            this.R4 = cVarB2;
            this.S4 = com.planner5d.library.activity.fragment.gallery.project.l.a(this.N4, this.P4, this.Q4, this.Q3, this.V0, this.T0, cVarB2, this.f142834y1);
            ij.c<com.planner5d.library.activity.fragment.dialog.purchase.v> cVarB3 = dagger.internal.g.b(com.planner5d.library.activity.fragment.dialog.purchase.w.a(this.f142751p, this.E));
            this.T4 = cVarB3;
            ij.c<com.planner5d.library.activity.fragment.dialog.purchase.c.a> cVarB4 = dagger.internal.g.b(com.planner5d.library.activity.fragment.dialog.purchase.d.a(this.f142760q, this.f142796u, this.G1, cVarB3, this.f142832y));
            this.U4 = cVarB4;
            this.V4 = com.planner5d.library.activity.fragment.dialog.purchase.premium.q.a(cVarB4);
            this.W4 = com.planner5d.library.activity.fragment.dialog.purchase.designgenerator.h.a(this.f142760q, this.B, this.P, this.U4);
            this.X4 = com.planner5d.library.activity.fragment.dialog.purchase.snapshots.i.a(this.K0, this.U4);
            this.Y4 = com.planner5d.library.activity.fragment.dialog.purchase.textures.d.a(this.U4);
            this.Z4 = com.planner5d.library.activity.fragment.dialog.purchase.recognitions.e.a(this.U4);
            com.planner5d.library.modules.user.user.p0 p0VarA = com.planner5d.library.modules.user.user.p0.a(this.E1, this.f142823x);
            this.f142622a5 = p0VarA;
            this.f142631b5 = com.planner5d.library.activity.fragment.profile.promocode.f.a(p0VarA, this.f142832y, this.R2);
            this.f142640c5 = com.planner5d.library.activity.fragment.dialog.send_to_gallery.m.a(this.Y2, this.f142832y, this.P2, this.f142763q2, this.R3, this.f142760q);
            this.f142649d5 = com.planner5d.library.activity.helper.i1.a(this.Y2, this.f142832y, this.E1, this.R2);
            o0 o0VarA2 = o0.a(iVar, this.R2);
            this.f142658e5 = o0VarA2;
            this.f142667f5 = com.planner5d.library.activity.fragment.dialog.snapshots.o.a(this.Y2, this.G, this.X1, this.f142649d5, this.E1, o0VarA2);
            ij.c<com.planner5d.library.model.manager.s0> cVarB5 = dagger.internal.g.b(com.planner5d.library.model.manager.t0.a(this.C));
            this.f142676g5 = cVarB5;
            this.f142685h5 = com.planner5d.library.activity.fragment.dialog.projectsettings.v0.a(this.f142657e4, this.f142832y, this.f142681h1, this.f142718l2, cVarB5, this.f142665f3, this.E1, this.f142762q1, this.P);
            this.f142694i5 = com.planner5d.library.activity.fragment.dialog.iteminfo.e.a(this.f142841z);
            com.planner5d.library.widget.editor.popup.itemproperties.z zVarA = com.planner5d.library.widget.editor.popup.itemproperties.z.a(this.f142797u0, this.f142635c0, this.f142760q, this.f142681h1);
            this.f142703j5 = zVarA;
            this.f142712k5 = com.planner5d.library.widget.editor.popup.itemproperties.w.a(this.f142626b0, this.f142841z, this.f142681h1, zVarA);
            this.f142721l5 = com.planner5d.library.widget.editor.popup.itemproperties.pages.material.j.a(this.f142626b0, this.f142841z);
            this.f142730m5 = com.planner5d.library.widget.editor.popup.itemproperties.pages.availablematerial.l.a(this.f142760q, this.f142626b0, this.f142841z, this.f142681h1);
            this.f142739n5 = com.planner5d.library.widget.editor.popup.itemproperties.pages.size.r.a(this.f142681h1, this.f142718l2, this.f142841z, com.planner5d.library.widget.editor.interactor.f.a(), this.f142762q1);
            com.planner5d.library.widget.editor.popup.itemproperties.interactor.b bVarA = com.planner5d.library.widget.editor.popup.itemproperties.interactor.b.a(this.f142701j3);
            this.f142748o5 = bVarA;
            n nVarA = n.a(iVar, bVarA);
            this.f142757p5 = nVarA;
            this.f142766q5 = dagger.internal.g.b(com.planner5d.library.widget.editor.popup.itemproperties.c.a(nVarA, this.R2, this.f142751p, this.f142787t));
            this.f142775r5 = a4.a(t3Var);
            e4 e4VarA = e4.a(t3Var);
            this.f142784s5 = e4VarA;
            this.f142793t5 = com.planner5d.library.widget.editor.popup.itemproperties.pages.texturepreview.o.a(this.f142766q5, this.f142832y, this.f142681h1, this.E1, this.R2, this.f142826x2, this.f142775r5, e4VarA);
            ij.c<com.planner5d.library.widget.editor.projectresources.a> cVarB6 = dagger.internal.g.b(com.planner5d.library.widget.editor.projectresources.c.a());
            this.f142802u5 = cVarB6;
            com.planner5d.library.widget.editor.projectresources.h hVarA = com.planner5d.library.widget.editor.projectresources.h.a(cVarB6, com.planner5d.library.widget.editor.projectresources.k.a());
            this.f142811v5 = hVarA;
            ij.c<com.planner5d.library.widget.editor.projectresources.e> cVarB7 = dagger.internal.g.b(com.planner5d.library.widget.editor.projectresources.f.a(hVarA));
            this.f142820w5 = cVarB7;
            this.f142829x5 = com.planner5d.library.widget.editor.popup.itemproperties.pages.size.l0.a(this.f142718l2, this.f142841z, this.D, cVarB7, this.P);
            this.f142838y5 = com.planner5d.library.widget.editor.popup.itemproperties.pages.texture.p.a(this.f142719l3);
            this.f142847z5 = com.planner5d.library.contest.data.g.a(this.G, this.V0, this.S2);
            ij.c<com.planner5d.library.model.manager.uploadplan.a> cVarB8 = dagger.internal.g.b(com.planner5d.library.model.manager.uploadplan.c.a());
            this.A5 = cVarB8;
            ij.c<com.planner5d.library.activity.fragment.feed.interactor.i> cVarB9 = dagger.internal.g.b(com.planner5d.library.activity.fragment.feed.interactor.j.a(cVarB8));
            this.B5 = cVarB9;
            this.C5 = t1.a(iVar, cVarB9);
            this.D5 = dagger.internal.g.b(b2.a(iVar));
            ij.c<com.planner5d.library.feed.data.g> cVarB10 = dagger.internal.g.b(com.planner5d.library.feed.data.h.a(this.S));
            this.E5 = cVarB10;
            com.planner5d.library.activity.fragment.feed.interactor.h hVarA2 = com.planner5d.library.activity.fragment.feed.interactor.h.a(this.Q, cVarB10);
            this.F5 = hVarA2;
            this.G5 = r1.a(iVar, hVarA2);
            com.planner5d.library.activity.fragment.feed.interactor.f fVarA = com.planner5d.library.activity.fragment.feed.interactor.f.a(this.Q, this.Q4, this.E5);
            this.H5 = fVarA;
            this.I5 = n1.a(iVar, fVarA);
            ij.c<com.planner5d.library.feed.data.d> cVarB11 = dagger.internal.g.b(com.planner5d.library.feed.data.e.a());
            this.J5 = cVarB11;
            ic.b bVarA2 = ic.b.a(cVarB11);
            this.K5 = bVarA2;
            this.L5 = s1.a(iVar, bVarA2);
            ij.c<com.planner5d.library.model.manager.p> cVarB12 = dagger.internal.g.b(com.planner5d.library.model.manager.q.a(this.Q3, this.R2));
            this.M5 = cVarB12;
            com.planner5d.library.activity.fragment.feed.interactor.d dVarA = com.planner5d.library.activity.fragment.feed.interactor.d.a(this.f142760q, this.R3, this.G5, this.I5, this.L5, this.C, cVarB12);
            this.N5 = dVarA;
            a0 a0VarA = a0.a(iVar, dVarA);
            this.O5 = a0VarA;
            this.P5 = com.planner5d.library.activity.fragment.feed.f1.a(this.f142760q, this.V0, this.T0, this.U2, this.R2, this.J3, this.E, this.P, this.f142762q1, this.f142847z5, this.V2, this.F3, this.H3, this.C, this.C5, this.D5, this.E3, this.G3, this.Q2, this.f142828x4, this.f142783s4, this.W2, this.E1, this.P2, this.f142832y, a0VarA, this.M5, this.f142796u, this.f142781s2);
            com.planner5d.library.activity.fragment.smartwizard.u uVarA = com.planner5d.library.activity.fragment.smartwizard.u.a(this.f142841z);
            this.Q5 = uVarA;
            this.R5 = y1.a(iVar, uVarA);
            this.S5 = dagger.internal.g.b(sd.f.a(this.f142789t1));
            ij.c<oa.d> cVarB13 = dagger.internal.g.b(oa.e.a(this.f142716l0, this.f142671g0));
            this.T5 = cVarB13;
            ij.c<oa.f> cVarB14 = dagger.internal.g.b(y2.a(iVar, cVarB13));
            this.U5 = cVarB14;
            this.V5 = com.planner5d.library.activity.fragment.smartwizard.roomshape.g.a(this.R5, this.V0, this.R2, this.f142763q2, this.f142657e4, this.S5, this.E, this.f142760q, cVarB14, this.D0);
            com.planner5d.library.activity.fragment.smartwizard.dimensions.interactor.b bVarA3 = com.planner5d.library.activity.fragment.smartwizard.dimensions.interactor.b.a(this.f142718l2, this.R5);
            this.W5 = bVarA3;
            this.X5 = d1.a(iVar, bVarA3);
            this.Y5 = q2.a(iVar, com.planner5d.library.activity.fragment.smartwizard.dimensions.interactor.d.a());
            r2 r2VarA = r2.a(iVar, com.planner5d.library.activity.fragment.smartwizard.dimensions.interactor.f.a());
            this.Z5 = r2VarA;
            this.f142623a6 = com.planner5d.library.activity.fragment.smartwizard.dimensions.u.a(this.f142718l2, this.X5, this.Y5, this.P2, r2VarA, this.V0, this.E, this.f142760q, this.f142763q2, this.f142657e4, this.R2, this.S5, this.U5, this.D0, this.f142627b1);
            com.planner5d.library.activity.fragment.smartwizard.roomstyle.interactor.g gVarA = com.planner5d.library.activity.fragment.smartwizard.roomstyle.interactor.g.a(this.P, this.f142823x, this.f142832y);
            this.f142632b6 = gVarA;
            w1 w1VarA = w1.a(iVar, gVarA);
            this.f142641c6 = w1VarA;
            com.planner5d.library.activity.fragment.smartwizard.roomstyle.interactor.j jVarA = com.planner5d.library.activity.fragment.smartwizard.roomstyle.interactor.j.a(this.f142760q, w1VarA, this.R2, this.f142843z1);
            this.f142650d6 = jVarA;
            this.f142659e6 = x1.a(iVar, jVarA);
            com.planner5d.library.activity.fragment.smartwizard.roomstyle.interactor.e eVarA = com.planner5d.library.activity.fragment.smartwizard.roomstyle.interactor.e.a(this.P2, this.f142832y, this.R2);
            this.f142668f6 = eVarA;
            this.f142677g6 = e1.a(iVar, eVarA);
            this.f142686h6 = w4.a(u4Var);
            f3 f3VarA = f3.a(iVar);
            this.f142695i6 = f3VarA;
            this.f142704j6 = com.planner5d.library.activity.fragment.smartwizard.roomstyle.o.a(this.f142659e6, this.f142677g6, this.f142686h6, this.E, this.f142627b1, this.V0, this.f142763q2, this.R2, this.f142657e4, this.S5, f3VarA, this.f142760q);
            this.f142713k6 = com.planner5d.library.activity.fragment.compareplans.i.a(this.f142762q1);
            com.planner5d.library.activity.fragment.smartwizard.decorator.interactor.c cVarA = com.planner5d.library.activity.fragment.smartwizard.decorator.interactor.c.a(this.f142760q, this.f142641c6, this.R2, this.f142843z1);
            this.f142722l6 = cVarA;
            this.f142731m6 = w.a(iVar, cVarA);
            v4 v4VarA = v4.a(u4Var);
            this.f142740n6 = v4VarA;
            this.f142749o6 = com.planner5d.library.activity.fragment.smartwizard.decorator.m.a(this.f142731m6, this.f142677g6, v4VarA, this.E, this.f142627b1, this.V0, this.f142763q2, this.R2, this.f142657e4, this.S5, this.f142695i6, this.f142760q);
            this.f142758p6 = com.planner5d.library.activity.fragment.intenthandler.c.a(this.f142783s4);
            i3 i3VarA = i3.a(iVar);
            this.f142767q6 = i3VarA;
            this.f142776r6 = com.planner5d.library.activity.fragment.spaces.documents.p.a(this.f142654e1, this.T0, this.V0, this.f142627b1, this.f142763q2, i3VarA);
            this.f142785s6 = com.planner5d.library.activity.fragment.spaces.folder.j.a(this.f142654e1, this.f142763q2, this.f142760q, this.f142767q6, this.C3);
            this.f142794t6 = com.planner5d.library.activity.fragment.spaces.file.j.a(this.f142654e1, this.f142627b1, this.f142767q6, this.C3);
            this.f142803u6 = com.planner5d.library.activity.fragment.spaces.preview.c.a(this.f142654e1, this.f142627b1);
            this.f142812v6 = com.planner5d.library.activity.fragment.projects.o0.a(this.f142762q1, this.f142645d1, this.S5);
            this.f142821w6 = com.planner5d.library.activity.fragment.spaces.dashboard.k.a(this.f142762q1, this.f142832y, this.E4, this.f142675g4);
            dagger.internal.n nVarC = dagger.internal.n.c(56).a(com.planner5d.library.activity.fragment.startup.x.class, this.f142728m3).a(com.planner5d.library.activity.fragment.messages.g.class, this.f142737n3).a(com.planner5d.library.activity.fragment.settings.h.class, this.f142755p3).a(com.planner5d.library.activity.fragment.dialog.premiumfeature.b.class, com.planner5d.library.activity.fragment.dialog.premiumfeature.c.a()).a(com.planner5d.library.activity.fragment.dialog.authentication.e1.class, this.f142764q3).a(com.planner5d.library.activity.fragment.dialog.authentication.y.class, this.f142773r3).a(com.planner5d.library.activity.fragment.dialog.authentication.c1.class, this.f142782s3).a(com.planner5d.library.activity.fragment.dialog.authentication.v0.class, this.f142791t3).a(com.planner5d.library.activity.fragment.dialog.authentication.onelink.l.class, this.f142800u3).a(com.planner5d.library.activity.fragment.dialog.authentication.onelink.v.class, this.f142809v3).a(com.planner5d.library.activity.fragment.dialog.authentication.f0.class, this.f142818w3).a(com.planner5d.library.activity.fragment.dialog.authentication.privacy.c.class, this.f142845z3).a(com.planner5d.library.activity.fragment.dialog.authentication.k1.class, this.A3).a(com.planner5d.library.activity.fragment.list.l1.class, this.D3).a(com.planner5d.library.activity.fragment.projects.w0.class, this.f142837y4).a(com.planner5d.library.activity.fragment.snapshots.c1.class, this.f142846z4).a(com.planner5d.library.activity.fragment.snapshots.k0.class, this.A4).a(com.planner5d.library.activity.fragment.snapshots.h.class, this.B4).a(com.planner5d.library.activity.fragment.profile.x.class, this.F4).a(com.planner5d.library.activity.fragment.profile.edit.n.class, this.G4).a(com.planner5d.library.activity.fragment.profile.edit.item.e.class, this.H4).a(com.planner5d.library.activity.fragment.profile.edit.password.f.class, this.I4).a(com.planner5d.library.activity.fragment.profile.orders.l.class, this.J4).a(com.planner5d.library.activity.fragment.gallery.k0.class, this.K4).a(com.planner5d.library.activity.fragment.gallery.x.class, this.M4).a(com.planner5d.library.activity.fragment.gallery.project.k.class, this.S4).a(com.planner5d.library.activity.fragment.dialog.purchase.premium.p.class, this.V4).a(com.planner5d.library.activity.fragment.dialog.purchase.designgenerator.g.class, this.W4).a(com.planner5d.library.activity.fragment.dialog.purchase.snapshots.h.class, this.X4).a(com.planner5d.library.activity.fragment.dialog.purchase.textures.c.class, this.Y4).a(com.planner5d.library.activity.fragment.dialog.purchase.recognitions.d.class, this.Z4).a(com.planner5d.library.activity.fragment.profile.promocode.e.class, this.f142631b5).a(com.planner5d.library.activity.fragment.dialog.send_to_gallery.l.class, this.f142640c5).a(com.planner5d.library.activity.fragment.dialog.snapshots.n.class, this.f142667f5).a(com.planner5d.library.activity.fragment.dialog.projectsettings.u0.class, this.f142685h5).a(com.planner5d.library.activity.fragment.dialog.iteminfo.d.class, this.f142694i5).a(com.planner5d.library.widget.editor.popup.itemproperties.v.class, this.f142712k5).a(com.planner5d.library.widget.editor.popup.itemproperties.pages.material.i.class, this.f142721l5).a(com.planner5d.library.widget.editor.popup.itemproperties.pages.availablematerial.k.class, this.f142730m5).a(com.planner5d.library.widget.editor.popup.itemproperties.pages.size.q.class, this.f142739n5).a(com.planner5d.library.widget.editor.popup.itemproperties.pages.texturepreview.n.class, this.f142793t5).a(com.planner5d.library.widget.editor.popup.itemproperties.pages.size.k0.class, this.f142829x5).a(com.planner5d.library.widget.editor.popup.itemproperties.pages.texture.o.class, this.f142838y5).a(com.planner5d.library.activity.fragment.feed.e1.class, this.P5).a(com.planner5d.library.activity.fragment.smartwizard.roomshape.f.class, this.V5).a(com.planner5d.library.activity.fragment.smartwizard.dimensions.t.class, this.f142623a6).a(com.planner5d.library.activity.fragment.smartwizard.roomstyle.n.class, this.f142704j6).a(com.planner5d.library.activity.fragment.compareplans.h.class, this.f142713k6).a(com.planner5d.library.activity.fragment.smartwizard.decorator.l.class, this.f142749o6).a(com.planner5d.library.activity.fragment.intenthandler.b.class, this.f142758p6).a(com.planner5d.library.activity.fragment.spaces.documents.o.class, this.f142776r6).a(com.planner5d.library.activity.fragment.spaces.folder.i.class, this.f142785s6).a(com.planner5d.library.activity.fragment.spaces.file.i.class, this.f142794t6).a(com.planner5d.library.activity.fragment.spaces.preview.b.class, this.f142803u6).a(com.planner5d.library.activity.fragment.projects.n0.class, this.f142812v6).a(com.planner5d.library.activity.fragment.spaces.dashboard.j.class, this.f142821w6).c();
            this.f142830x6 = nVarC;
            this.f142839y6 = dagger.internal.g.b(com.planner5d.library.services.utility.h0.a(nVarC));
            com.planner5d.library.activity.fragment.dialog.purchase.g0 g0VarA = com.planner5d.library.activity.fragment.dialog.purchase.g0.a(this.f142760q, this.f142832y, this.f142693i4, this.G1, this.R2, this.f142787t);
            this.f142848z6 = g0VarA;
            this.A6 = com.planner5d.library.activity.fragment.dialog.purchase.h0.c(g0VarA);
        }

        @z7.a
        private PurchasePagePremiumReview s4(PurchasePagePremiumReview purchasePagePremiumReview) {
            com.planner5d.library.activity.fragment.dialog.purchase.premium.o.b(purchasePagePremiumReview, this.f142626b0.get());
            com.planner5d.library.activity.fragment.dialog.purchase.premium.o.e(purchasePagePremiumReview, this.E.get());
            com.planner5d.library.activity.fragment.dialog.purchase.premium.o.c(purchasePagePremiumReview, this.P.get());
            return purchasePagePremiumReview;
        }

        private void t3(i iVar, gb.a aVar, a5 a5Var, m5 m5Var, f4 f4Var, q3 q3Var, j5 j5Var, u4 u4Var, q4 q4Var, h4 h4Var, q5 q5Var, g5 g5Var, t3 t3Var, m4 m4Var, o4 o4Var, x4 x4Var, com.planner5d.library.application.b bVar, Application application, com.planner5d.library.application.d dVar) {
            com.planner5d.library.activity.fragment.dialog.video.g gVarA = com.planner5d.library.activity.fragment.dialog.video.g.a();
            this.B6 = gVarA;
            this.C6 = com.planner5d.library.activity.fragment.dialog.video.h.c(gVarA);
            dagger.internal.m mVarC = dagger.internal.m.c(2).a(com.planner5d.library.activity.fragment.dialog.purchase.f0.class, this.A6).a(com.planner5d.library.activity.fragment.dialog.video.f.class, this.C6).c();
            this.D6 = mVarC;
            this.E6 = dagger.internal.v.a(com.planner5d.library.services.utility.h1.a(mVarC, this.f142830x6));
            this.F6 = dagger.internal.g.b(ud.c.a(this.T0, this.V0));
            this.G6 = dagger.internal.g.b(com.planner5d.library.activity.fragment.list.e0.a(this.V2));
            this.H6 = dagger.internal.g.b(com.planner5d.library.model.manager.config.s.a(this.f142751p, this.f142816w1, this.B));
            this.I6 = dagger.internal.g.b(v2.a(iVar, this.E4));
            this.J6 = dagger.internal.g.b(com.planner5d.library.model.manager.l1.a(this.K0, this.f142832y));
            ij.c<com.planner5d.library.model.manager.contest.b> cVarB = dagger.internal.g.b(com.planner5d.library.model.manager.contest.c.a(this.f142841z));
            this.K6 = cVarB;
            this.L6 = dagger.internal.g.b(com.planner5d.library.model.manager.e.a(this.f142841z, cVarB, this.K0));
            this.M6 = dagger.internal.g.b(com.planner5d.library.activity.helper.y.a());
            this.N6 = dagger.internal.g.b(r0.a(iVar, this.f142781s2));
            this.O6 = dagger.internal.g.b(e2.a(iVar));
            com.planner5d.library.model.manager.w4 w4VarA = com.planner5d.library.model.manager.w4.a(this.f142760q, this.P2, this.P, this.J1, this.f142823x, this.f142832y);
            this.P6 = w4VarA;
            this.Q6 = dagger.internal.g.b(com.planner5d.library.model.manager.r4.a(this.H6, this.f142796u, this.E1, this.B, w4VarA));
            this.R6 = dagger.internal.g.b(com.planner5d.library.model.manager.u2.a(this.F1, this.G1, this.C1));
            this.S6 = gb.d.a(aVar, this.N);
            this.T6 = gb.g.a(aVar, this.N);
            this.U6 = dagger.internal.g.b(z.a(iVar, this.f142787t, this.f142834y1));
            com.planner5d.library.model.manager.builtin.a1 a1VarA = com.planner5d.library.model.manager.builtin.a1.a(this.f142841z, this.B, this.f142760q);
            this.V6 = a1VarA;
            this.W6 = dagger.internal.g.b(com.planner5d.library.model.manager.d3.a(this.C, a1VarA, this.f142823x, this.E, this.f142762q1, this.f142832y));
            this.X6 = dagger.internal.g.b(com.planner5d.library.widget.editor.catalog.h.a(this.f142841z, this.L6, this.K6, this.f142834y1, this.E1));
            this.Y6 = dagger.internal.g.b(com.planner5d.library.model.manager.n2.a());
            this.Z6 = dagger.internal.g.b(com.planner5d.library.widget.editor.popup.f.a());
            this.f142624a7 = dagger.internal.g.b(r.a(iVar));
            this.f142633b7 = dagger.internal.g.b(com.planner5d.library.model.manager.v0.a());
            this.f142642c7 = dagger.internal.g.b(com.planner5d.library.activity.fragment.d0.a(this.T0, this.f142676g5, this.R2, this.V0));
            ij.c<com.planner5d.library.widget.editor.itemactionsbar.h> cVarB2 = dagger.internal.g.b(com.planner5d.library.widget.editor.itemactionsbar.i.a(this.f142841z, this.f142763q2, this.f142762q1, this.f142787t));
            this.f142651d7 = cVarB2;
            this.f142660e7 = dagger.internal.g.b(com.planner5d.library.widget.editor.helper.l2.a(cVarB2));
            this.f142669f7 = y3.a(t3Var);
            this.f142678g7 = d4.a(t3Var);
            this.f142687h7 = z3.a(t3Var);
            this.f142696i7 = x3.a(t3Var);
            this.f142705j7 = w3.a(t3Var);
            this.f142714k7 = u3.a(t3Var);
            this.f142723l7 = b4.a(t3Var);
            this.f142732m7 = c4.a(t3Var);
            ij.c<dd.c> cVarB3 = dagger.internal.g.b(dd.d.a(this.D, this.R, this.Z, this.Q));
            this.f142741n7 = cVarB3;
            this.f142750o7 = com.planner5d.library.widget.editor.editor3d.x.a(this.f142760q, this.f142676g5, this.P, this.R2, this.f142681h1, this.K0, this.f142669f7, this.E, this.f142672g1, this.f142826x2, this.f142678g7, this.f142687h7, this.f142696i7, this.f142705j7, this.f142714k7, this.I0, this.f142723l7, this.f142732m7, cVarB3);
            com.planner5d.library.activity.fragment.smartwizard.roomstyle.interactor.c cVarA = com.planner5d.library.activity.fragment.smartwizard.roomstyle.interactor.c.a(this.f142823x, this.f142751p, this.f142843z1, this.R2, this.f142832y);
            this.f142759p7 = cVarA;
            x xVarA = x.a(iVar, cVarA);
            this.f142768q7 = xVarA;
            this.f142777r7 = com.planner5d.library.widget.editor.menu.k.a(this.f142832y, this.P2, this.R2, this.T0, this.V0, this.f142763q2, this.f142796u, this.f142787t, this.f142762q1, this.f142626b0, xVarA, this.K0);
            this.f142786s7 = com.planner5d.library.widget.editor.facade.d0.a(this.f142820w5, this.f142841z, this.f142676g5, this.R2, this.P, this.f142633b7, this.X6);
            v vVarA = v.a(iVar, com.planner5d.library.model.manager.uploadplan.f.a());
            this.f142795t7 = vVarA;
            com.planner5d.library.interactor.b bVarA = com.planner5d.library.interactor.b.a(vVarA, this.f142760q, this.f142823x, this.R2, this.E, this.Q2);
            this.f142804u7 = bVarA;
            u uVarA = u.a(iVar, bVarA);
            this.f142813v7 = uVarA;
            this.f142822w7 = com.planner5d.library.widget.editor.helper.x1.a(uVarA, this.f142763q2, this.G3, this.P, this.f142695i6);
            this.f142831x7 = s4.a(q4Var);
            this.f142840y7 = com.planner5d.library.widget.editor.facade.t.a(this.V2, this.P2, this.f142832y, this.f142657e4, this.f142786s7, this.f142642c7, com.planner5d.library.widget.editor.helper.r2.a(), this.f142820w5, this.f142841z, this.D, this.J6);
            t4 t4VarA = t4.a(q4Var);
            this.f142849z7 = t4VarA;
            this.A7 = com.planner5d.library.widget.editor.helper.s1.a(this.C, t4VarA, this.V0, this.P2, this.P, this.f142763q2, this.f142695i6, this.f142738n4, this.f142787t, this.f142627b1);
            this.B7 = com.planner5d.library.widget.editor.helper.v2.a(this.f142762q1, this.C, this.f142787t);
            com.planner5d.library.widget.editor.interactor.d dVarA = com.planner5d.library.widget.editor.interactor.d.a(this.V2, this.P2, this.f142834y1);
            this.C7 = dVarA;
            this.D7 = f1.a(iVar, dVarA);
            com.planner5d.library.interactor.g0 g0VarA = com.planner5d.library.interactor.g0.a(this.P2, this.G, this.V2, this.f142649d5);
            this.E7 = g0VarA;
            p1 p1VarA = p1.a(iVar, g0VarA);
            this.F7 = p1VarA;
            com.planner5d.library.widget.editor.helper.o2 o2VarA = com.planner5d.library.widget.editor.helper.o2.a(this.R2, this.D7, p1VarA, this.f142763q2, this.V0, this.f142834y1);
            this.G7 = o2VarA;
            com.planner5d.library.widget.editor.helper.w2 w2VarA = com.planner5d.library.widget.editor.helper.w2.a(this.P2, this.f142665f3, this.T0, this.V2, this.f142788t0, this.f142832y, this.f142763q2, this.f142841z, this.Z6, this.f142796u, this.R2, this.f142657e4, this.f142777r7, this.f142693i4, this.U2, this.V0, this.E1, this.U3, this.f142771r1, this.f142624a7, this.f142786s7, this.f142822w7, this.P, this.f142831x7, this.S5, this.f142840y7, this.A7, this.f142660e7, this.f142626b0, this.I2, this.S2, this.f142672g1, this.B7, o2VarA, this.f142762q1, this.f142635c0, this.f142644d0);
            this.H7 = w2VarA;
            this.I7 = com.planner5d.library.widget.editor.editor3d.r.a(this.f142750o7, w2VarA, this.f142710k3);
            h0 h0VarA = h0.a(iVar, this.f142796u);
            this.J7 = h0VarA;
            this.K7 = dagger.internal.g.b(com.planner5d.library.activity.helper.j0.a(this.E1, this.f142796u, h0VarA, this.U1));
            this.L7 = dagger.internal.g.b(u2.a(iVar, this.L3));
            this.M7 = dagger.internal.g.b(com.planner5d.library.model.converter.json.to.g.a());
            this.N7 = com.planner5d.library.activity.helper.v.a(this.Q0);
            this.O7 = com.planner5d.library.activity.helper.g0.a(this.T0, this.E1, this.f142832y, this.f142691i2, this.f142796u, this.f142763q2, this.V0, this.C, this.F3, this.P, this.f142781s2, this.f142843z1);
            this.P7 = com.planner5d.library.modules.user.user.f0.a(this.f142823x, this.C, this.f142787t, this.f142832y);
            l0 l0VarA = l0.a(iVar);
            this.Q7 = l0VarA;
            this.R7 = com.planner5d.library.activity.helper.z1.a(this.T0, this.f142763q2, this.f142832y, this.P7, this.V0, this.S5, l0VarA);
            this.S7 = dagger.internal.g.b(sd.l.a(this.f142789t1, this.f142763q2));
            ij.c<com.planner5d.library.model.manager.appupdate.h> cVarB4 = dagger.internal.g.b(com.planner5d.library.model.manager.appupdate.i.a(this.f142762q1, this.C, this.f142787t));
            this.T7 = cVarB4;
            this.U7 = com.planner5d.library.activity.helper.h2.a(this.N7, this.K7, this.P6, this.P, this.f142832y, this.f142799u2, this.f142691i2, this.V2, this.I0, this.f142762q1, this.O2, this.E, this.O7, this.R7, this.U3, this.f142693i4, this.X2, this.f142792t4, this.f142701j3, this.f142627b1, this.V0, this.S0, this.S7, this.f142720l4, cVarB4);
            ij.c<com.planner5d.library.widget.s1> cVarB5 = dagger.internal.g.b(n5.a(m5Var));
            this.V7 = cVarB5;
            this.W7 = com.planner5d.library.activity.helper.c2.a(this.N7, this.K7, this.P6, this.P, this.f142832y, this.f142799u2, this.f142691i2, this.V2, this.I0, this.f142762q1, this.O2, this.E, cVarB5, this.S0);
            this.X7 = com.planner5d.library.widget.editor.editor3dcardboard.v.a(this.f142796u);
        }

        @z7.a
        private PurchaseRequiredMessage t4(PurchaseRequiredMessage purchaseRequiredMessage) {
            com.planner5d.library.activity.fragment.dialog.message.j.c(purchaseRequiredMessage, this.T0.get());
            com.planner5d.library.activity.fragment.dialog.message.j.d(purchaseRequiredMessage, this.V0.get());
            return purchaseRequiredMessage;
        }

        @z7.a
        private AuthenticationExternalService u3(AuthenticationExternalService authenticationExternalService) {
            com.planner5d.library.activity.fragment.dialog.authentication.a0.d(authenticationExternalService, this.f142827x3.get());
            com.planner5d.library.activity.fragment.dialog.authentication.a0.b(authenticationExternalService, this.f142790t2.get());
            return authenticationExternalService;
        }

        @z7.a
        private RemovePersonalData u4(RemovePersonalData removePersonalData) {
            com.planner5d.library.activity.fragment.dialog.k0.f(removePersonalData, this.f142832y.get());
            com.planner5d.library.activity.fragment.dialog.k0.g(removePersonalData, this.f142836y3.get());
            com.planner5d.library.activity.fragment.dialog.k0.c(removePersonalData, this.R2.get());
            com.planner5d.library.activity.fragment.dialog.k0.e(removePersonalData, w());
            com.planner5d.library.activity.fragment.dialog.k0.d(removePersonalData, C1());
            return removePersonalData;
        }

        @z7.a
        private AuthenticationSignInEnterCode v3(AuthenticationSignInEnterCode authenticationSignInEnterCode) {
            com.planner5d.library.activity.fragment.dialog.authentication.onelink.x.b(authenticationSignInEnterCode, this.f142790t2.get());
            return authenticationSignInEnterCode;
        }

        @z7.a
        private SnapshotPager v4(SnapshotPager snapshotPager) {
            com.planner5d.library.activity.fragment.snapshots.m0.j(snapshotPager, this.Y2.get());
            com.planner5d.library.activity.fragment.snapshots.m0.k(snapshotPager, X4());
            com.planner5d.library.activity.fragment.snapshots.m0.d(snapshotPager, this.W2.get());
            com.planner5d.library.activity.fragment.snapshots.m0.g(snapshotPager, this.T0.get());
            com.planner5d.library.activity.fragment.snapshots.m0.c(snapshotPager, this.f142763q2.get());
            com.planner5d.library.activity.fragment.snapshots.m0.i(snapshotPager, Z4());
            com.planner5d.library.activity.fragment.snapshots.m0.e(snapshotPager, l3());
            com.planner5d.library.activity.fragment.snapshots.m0.l(snapshotPager, Y4());
            com.planner5d.library.activity.fragment.snapshots.m0.m(snapshotPager, this.f142832y.get());
            com.planner5d.library.activity.fragment.snapshots.m0.h(snapshotPager, this.R2.get());
            com.planner5d.library.activity.fragment.snapshots.m0.b(snapshotPager, this.f142616a);
            return snapshotPager;
        }

        @z7.a
        private com.planner5d.library.widget.editor.catalog.drawer.p w3(com.planner5d.library.widget.editor.catalog.drawer.p pVar) {
            com.planner5d.library.widget.editor.catalog.drawer.t.e(pVar, this.f142710k3.get());
            com.planner5d.library.widget.editor.catalog.drawer.t.g(pVar, this.f142675g4.get());
            com.planner5d.library.widget.editor.catalog.drawer.t.d(pVar, this.f142763q2.get());
            com.planner5d.library.widget.editor.catalog.drawer.t.b(pVar, H2());
            com.planner5d.library.widget.editor.catalog.drawer.t.h(pVar, G2());
            com.planner5d.library.widget.editor.catalog.drawer.t.c(pVar, t());
            return pVar;
        }

        @z7.a
        private SnapshotSetupComplete w4(SnapshotSetupComplete snapshotSetupComplete) {
            com.planner5d.library.activity.fragment.dialog.message.m.c(snapshotSetupComplete, this.V0.get());
            com.planner5d.library.activity.fragment.dialog.message.m.d(snapshotSetupComplete, this.F3.get());
            return snapshotSetupComplete;
        }

        @z7.a
        private com.planner5d.library.widget.editor.catalog.z x3(com.planner5d.library.widget.editor.catalog.z zVar) {
            com.planner5d.library.widget.editor.catalog.a0.c(zVar, this.f142710k3.get());
            com.planner5d.library.widget.editor.catalog.a0.b(zVar, t());
            return zVar;
        }

        @z7.a
        private SnapshotSetupDialog x4(SnapshotSetupDialog snapshotSetupDialog) {
            com.planner5d.library.activity.fragment.dialog.snapshots.m.e(snapshotSetupDialog, this.E1.get());
            com.planner5d.library.activity.fragment.dialog.snapshots.m.d(snapshotSetupDialog, this.T0.get());
            com.planner5d.library.activity.fragment.dialog.snapshots.m.b(snapshotSetupDialog, this.f142763q2.get());
            return snapshotSetupDialog;
        }

        @z7.a
        private ChooseRoomShape y3(ChooseRoomShape chooseRoomShape) {
            com.planner5d.library.activity.fragment.smartwizard.k.b(chooseRoomShape, R2());
            return chooseRoomShape;
        }

        @z7.a
        private Snapshots y4(Snapshots snapshots) {
            com.planner5d.library.activity.fragment.snapshots.e1.c(snapshots, a5());
            com.planner5d.library.activity.fragment.snapshots.e1.g(snapshots, Y4());
            com.planner5d.library.activity.fragment.snapshots.e1.d(snapshots, this.f142763q2.get());
            com.planner5d.library.activity.fragment.snapshots.e1.b(snapshots, this.G6.get());
            com.planner5d.library.activity.fragment.snapshots.e1.f(snapshots, this.T0.get());
            return snapshots;
        }

        @z7.a
        private ChooseRoomStyle z3(ChooseRoomStyle chooseRoomStyle) {
            com.planner5d.library.activity.fragment.projects.f.e(chooseRoomStyle, m0());
            com.planner5d.library.activity.fragment.projects.f.b(chooseRoomStyle, P2());
            com.planner5d.library.activity.fragment.projects.f.c(chooseRoomStyle, R2());
            com.planner5d.library.activity.fragment.smartwizard.roomstyle.p.d(chooseRoomStyle, dagger.internal.g.a(this.f142690i1));
            com.planner5d.library.activity.fragment.smartwizard.roomstyle.p.e(chooseRoomStyle, dagger.internal.g.a(this.f142738n4));
            com.planner5d.library.activity.fragment.smartwizard.roomstyle.p.b(chooseRoomStyle, this.K0.get());
            return chooseRoomStyle;
        }

        @z7.a
        private StartupFragment z4(StartupFragment startupFragment) {
            com.planner5d.library.activity.fragment.startup.q.b(startupFragment, this.f142763q2.get());
            com.planner5d.library.activity.fragment.startup.q.c(startupFragment, i4.c(this.f142688i));
            com.planner5d.library.activity.fragment.startup.q.d(startupFragment, n4.c(this.f142697j));
            com.planner5d.library.activity.fragment.startup.q.i(startupFragment, y4.c(this.f142706k));
            com.planner5d.library.activity.fragment.startup.q.f(startupFragment, this.Y6.get());
            com.planner5d.library.activity.fragment.startup.q.g(startupFragment, G4());
            com.planner5d.library.activity.fragment.startup.q.h(startupFragment, this.U3.get());
            return startupFragment;
        }

        @Override // com.planner5d.library.application.c
        public void A(ChooseRoomStyle chooseRoomStyle) {
            z3(chooseRoomStyle);
        }

        @Override // com.planner5d.library.application.c
        public com.planner5d.library.model.manager.payments.a0 A0() {
            return this.f142808v2.get();
        }

        @Override // com.planner5d.library.application.c
        public com.planner5d.library.model.manager.contest.g A1() {
            return this.U2.get();
        }

        @Override // com.planner5d.library.application.c
        public void B(PublicFileProvider publicFileProvider) {
            p4(publicFileProvider);
        }

        @Override // com.planner5d.library.application.c
        public com.planner5d.library.model.manager.config.r B0() {
            return this.H6.get();
        }

        @Override // com.planner5d.library.application.c
        public com.planner5d.library.model.manager.p4 B1() {
            return this.Q6.get();
        }

        @Override // com.planner5d.library.application.c
        public com.planner5d.library.activity.fragment.x C() {
            return this.V0.get();
        }

        @Override // com.planner5d.library.application.c
        public com.planner5d.library.model.manager.b5 C0() {
            return l4.c(this.f142688i);
        }

        @Override // com.planner5d.library.application.c
        public com.planner5d.library.activity.helper.j2 C1() {
            return new com.planner5d.library.activity.helper.j2(this.R2.get());
        }

        @Override // com.planner5d.library.application.c
        public com.planner5d.library.services.service.b D() {
            return this.U6.get();
        }

        @Override // com.planner5d.library.application.c
        public com.planner5d.library.model.manager.y1 D0() {
            return this.T0.get();
        }

        @Override // com.planner5d.library.application.c
        public void D1(com.planner5d.library.widget.editor.editor3dcardboard.p pVar) {
            G3(pVar);
        }

        @Override // com.planner5d.library.application.c
        public void E(FolderEdit folderEdit) {
            N3(folderEdit);
        }

        @Override // com.planner5d.library.application.c
        public void E0(com.planner5d.library.activity.fragment.dialog.purchase.g gVar) {
            f4(gVar);
        }

        @Override // com.planner5d.library.application.c
        public void E1(ManageDataFragment manageDataFragment) {
            Z3(manageDataFragment);
        }

        @Override // com.planner5d.library.application.c
        public StatisticsEventAiDesigner F() {
            return f3.c(this.f142643d);
        }

        @Override // com.planner5d.library.application.c
        public com.planner5d.library.model.manager.statistics.events.j3 F0() {
            return this.D5.get();
        }

        @Override // com.planner5d.library.application.c
        public com.planner5d.library.model.manager.b2 F1() {
            return this.R2.get();
        }

        @Override // com.planner5d.library.application.c
        public void G(DownloadService downloadService) {
            E3(downloadService);
        }

        @Override // com.planner5d.library.application.c
        public com.planner5d.library.modules.user.user.a0 G0() {
            return this.I6.get();
        }

        @Override // com.planner5d.library.application.c
        public void G1(PurchasePagePlanRecognitions purchasePagePlanRecognitions) {
            r4(purchasePagePlanRecognitions);
        }

        @Override // com.planner5d.library.application.c
        public com.planner5d.library.model.manager.k1 H() {
            return this.J6.get();
        }

        @Override // com.planner5d.library.application.c
        public com.planner5d.library.activity.fragment.list.d0 H0() {
            return this.G6.get();
        }

        @Override // com.planner5d.library.application.c
        public void H1(PurchaseDialog purchaseDialog) {
            q4(purchaseDialog);
        }

        @Override // com.planner5d.library.application.c
        public com.planner5d.library.model.manager.y0 I() {
            return this.K0.get();
        }

        @Override // com.planner5d.library.application.c
        public void I0(Message message) {
        }

        @Override // com.planner5d.library.application.c
        public void I1(DocumentEdit documentEdit) {
        }

        @Override // com.planner5d.library.application.c
        public com.planner5d.library.modules.user.auth.r J() {
            return this.f142827x3.get();
        }

        @Override // com.planner5d.library.application.c
        public void J0(Gallery gallery) {
            P3(gallery);
        }

        @Override // com.planner5d.library.application.c
        public com.planner5d.library.model.manager.config.j J1() {
            return this.f142762q1.get();
        }

        @Override // com.planner5d.library.application.c
        public com.planner5d.library.model.manager.l K() {
            return this.Y1.get();
        }

        @Override // com.planner5d.library.application.c
        public void K0(PurchasePageSnapshots purchasePageSnapshots) {
        }

        @Override // com.planner5d.library.application.c
        public com.planner5d.library.activity.helper.imagechooser.j K1() {
            return this.f142701j3.get();
        }

        @Override // com.planner5d.library.application.c
        public void L(LicenseCheck licenseCheck) {
            W3(licenseCheck);
        }

        @Override // com.planner5d.library.application.c
        public com.planner5d.library.activity.fragment.dialog.k L0() {
            return this.f142763q2.get();
        }

        @Override // com.planner5d.library.application.c
        public sd.b L1() {
            return this.f142789t1.get();
        }

        @Override // com.planner5d.library.application.c
        public com.planner5d.library.services.upload.g M() {
            return this.Z0.get();
        }

        @Override // com.planner5d.library.application.c
        public com.planner5d.library.activity.fragment.projects.w0 M0() {
            return new com.planner5d.library.activity.fragment.projects.w0(this.f142762q1.get(), this.f142763q2.get(), this.W2.get(), this.f142661f.a(), this.K0.get(), this.T0.get(), this.R2.get(), this.V0.get(), F4(), this.P2.get(), this.F3.get(), this.f142661f.b(), this.f142832y.get(), this.f142616a, this.f142634c, this.f142781s2.get(), s(), m3(), n2(), this.E1.get());
        }

        @Override // com.planner5d.library.application.c
        public void M1(RemovePersonalData removePersonalData) {
            u4(removePersonalData);
        }

        @Override // com.planner5d.library.application.c
        public void N(Snapshots snapshots) {
            y4(snapshots);
        }

        @Override // com.planner5d.library.application.c
        public com.planner5d.library.activity.helper.z0 N0() {
            return this.f142819w4.get();
        }

        @Override // com.planner5d.library.application.c
        public void N1(MainCardboard mainCardboard) {
            Y3(mainCardboard);
        }

        @Override // com.planner5d.library.application.c
        public void O(ItemPropertiesDrawer itemPropertiesDrawer) {
        }

        @Override // com.planner5d.library.application.c
        public void O0(SendToGallery sendToGallery) {
        }

        @Override // com.planner5d.library.application.c
        public com.planner5d.library.services.utility.p0 O1() {
            return this.f142626b0.get();
        }

        @Override // com.planner5d.library.application.c
        public void P(GalleryPager galleryPager) {
            R3(galleryPager);
        }

        @Override // com.planner5d.library.application.c
        public void P0(FeedArticleFragment feedArticleFragment) {
            K3(feedArticleFragment);
        }

        @Override // com.planner5d.library.application.c
        public void P1(FolderSelection folderSelection) {
            O3(folderSelection);
        }

        @Override // com.planner5d.library.application.c
        public void Q(Dimensions dimensions) {
            C3(dimensions);
        }

        @Override // com.planner5d.library.application.c
        public com.planner5d.library.activity.fragment.l Q0() {
            return new com.planner5d.library.activity.fragment.l();
        }

        @Override // com.planner5d.library.application.c
        public com.planner5d.library.model.manager.synchronization.i Q1() {
            return this.V2.get();
        }

        @Override // com.planner5d.library.application.c
        public com.planner5d.library.services.p R() {
            return i4.c(this.f142688i);
        }

        @Override // com.planner5d.library.application.c
        public com.planner5d.library.model.manager.statistics.events.v3 R0() {
            return this.O6.get();
        }

        @Override // com.planner5d.library.application.c
        public com.planner5d.library.modules.user.user.w R1() {
            return k3.c(this.f142643d, this.f142832y.get());
        }

        @Override // com.planner5d.library.application.c
        public com.planner5d.library.activity.helper.b0 S() {
            return this.X2.get();
        }

        @Override // com.planner5d.library.application.c
        public com.planner5d.library.application.b S0() {
            return this.f142616a;
        }

        @Override // com.planner5d.library.application.c
        public NetworkErrorUtility S1() {
            return this.f142690i1.get();
        }

        @Override // com.planner5d.library.application.c
        public com.planner5d.library.activity.fragment.j T() {
            return this.U0.get();
        }

        @Override // com.planner5d.library.application.c
        public com.planner5d.library.model.manager.k5 T0() {
            return this.f142681h1.get();
        }

        @Override // com.planner5d.library.application.c
        public com.planner5d.library.model.manager.payments.b0 T1() {
            return this.f142738n4.get();
        }

        @Override // com.planner5d.library.application.c
        public com.planner5d.library.model.manager.i1 U() {
            return j4.c(this.f142688i);
        }

        @Override // com.planner5d.library.application.c
        public void U0(ComparePlansFragment comparePlansFragment) {
            A3(comparePlansFragment);
        }

        @Override // com.planner5d.library.application.c
        public com.planner5d.library.application.d U1() {
            return this.f142634c;
        }

        @Override // com.planner5d.library.application.c
        public com.planner5d.library.model.manager.managedfiles.a0 V() {
            return this.Q0.get();
        }

        @Override // com.planner5d.library.application.c
        public void V0(AuthenticationExternalService authenticationExternalService) {
            u3(authenticationExternalService);
        }

        @Override // com.planner5d.library.application.c
        public com.planner5d.library.model.manager.s4 V1() {
            return k4.c(this.f142688i);
        }

        @Override // com.planner5d.library.application.c
        public com.planner5d.library.activity.fragment.feed.b W() {
            return r4.c(this.f142670g);
        }

        @Override // com.planner5d.library.application.c
        public com.planner5d.library.model.manager.c0 W0() {
            return this.W2.get();
        }

        @Override // com.planner5d.library.application.c
        public com.planner5d.library.model.manager.statistics.b0 W1() {
            return this.f142691i2.get();
        }

        @Override // com.planner5d.library.application.c
        public void X(SnapshotSetupDialog snapshotSetupDialog) {
            x4(snapshotSetupDialog);
        }

        @Override // com.planner5d.library.application.c
        public void X0(com.planner5d.library.widget.editor.catalog.z zVar) {
            x3(zVar);
        }

        @Override // com.planner5d.library.application.c
        public void X1(StartupFragment startupFragment) {
            z4(startupFragment);
        }

        @Override // com.planner5d.library.application.c
        public void Y(Editor3dFragment editor3dFragment) {
            I3(editor3dFragment);
        }

        @Override // com.planner5d.library.application.c
        public com.planner5d.library.widget.rate.g Y0() {
            return this.U3.get();
        }

        @Override // com.planner5d.library.application.c
        public com.planner5d.library.activity.fragment.n Y1() {
            return this.f142781s2.get();
        }

        @Override // com.planner5d.library.application.c
        public com.planner5d.library.database.model.chat.f Z() {
            return new com.planner5d.library.database.model.chat.f(dagger.internal.g.a(this.T6));
        }

        @Override // com.planner5d.library.application.c
        public void Z0(com.planner5d.library.widget.editor.editor3dcardboard.l lVar) {
            F3(lVar);
        }

        @Override // com.planner5d.library.application.c
        public com.planner5d.library.model.manager.statistics.events.i3 Z1() {
            return a2.c(this.f142643d);
        }

        @Override // com.planner5d.library.application.c
        public com.planner5d.library.model.manager.statistics.d0 a() {
            return h2.c(this.f142643d, this.f142691i2.get());
        }

        @Override // com.planner5d.library.application.c
        public com.planner5d.library.model.manager.c1 a0() {
            return this.J1.get();
        }

        @Override // com.planner5d.library.application.c
        public void a1(PurchasePagePremiumReview purchasePagePremiumReview) {
            s4(purchasePagePremiumReview);
        }

        @Override // com.planner5d.library.application.c
        public com.planner5d.library.services.utility.c2 a2() {
            return this.E.get();
        }

        @Override // com.planner5d.library.application.c
        public d6 b() {
            return new d(this.f142742o);
        }

        @Override // com.planner5d.library.application.c
        public void b0(AuthenticationRemindPasswordSuccess authenticationRemindPasswordSuccess) {
        }

        @Override // com.planner5d.library.application.c
        public void b1(com.planner5d.library.activity.fragment.spaces.folder.FolderEdit folderEdit) {
        }

        @Override // com.planner5d.library.application.c
        public com.planner5d.library.services.g b2() {
            return new com.planner5d.library.services.g(this.f142763q2.get());
        }

        @Override // com.planner5d.library.application.c
        public t5 c() {
            return new c(this.f142742o);
        }

        @Override // com.planner5d.library.application.c
        public void c0(WishList wishList) {
            D4(wishList);
        }

        @Override // com.planner5d.library.application.c
        public com.planner5d.library.model.manager.f c1() {
            return this.f142719l3.get();
        }

        @Override // com.planner5d.library.application.c
        public void c2(FeedFragment feedFragment) {
            L3(feedFragment);
        }

        @Override // com.planner5d.library.application.c
        public com.planner5d.library.model.manager.t1 d() {
            return this.P.get();
        }

        @Override // com.planner5d.library.application.c
        public void d0(Project3D project3D) {
            j4(project3D);
        }

        @Override // com.planner5d.library.application.c
        public void d1(Documents documents) {
            D3(documents);
        }

        @Override // com.planner5d.library.application.c
        public hd.b d2() {
            return s3.c(this.f142652e);
        }

        @Override // com.planner5d.library.application.c
        public com.planner5d.library.model.manager.push.b e() {
            return b5.c(this.f142715l);
        }

        @Override // com.planner5d.library.application.c
        public void e0(SnapshotPager snapshotPager) {
            v4(snapshotPager);
        }

        @Override // com.planner5d.library.application.c
        public com.planner5d.library.model.manager.crashreporting.l e1() {
            return this.f142646d2.get();
        }

        @Override // com.planner5d.library.application.c
        public void e2(Main main) {
            X3(main);
        }

        @Override // com.planner5d.library.application.c
        public com.planner5d.library.services.y f() {
            return y0.c(this.f142643d, M2());
        }

        @Override // com.planner5d.library.application.c
        public com.planner5d.library.model.manager.d f0() {
            return this.L6.get();
        }

        @Override // com.planner5d.library.application.c
        public com.planner5d.library.model.manager.unlockeditems.b f1() {
            return this.f142771r1.get();
        }

        @Override // com.planner5d.library.application.c
        public void f2(ProjectsPagesFragment projectsPagesFragment) {
            o4(projectsPagesFragment);
        }

        @Override // com.planner5d.library.application.c
        public com.planner5d.library.activity.fragment.dialog.purchase.s g0() {
            return this.X3.get();
        }

        @Override // com.planner5d.library.application.c
        public void g1(com.planner5d.library.widget.tab.b bVar) {
            B4(bVar);
        }

        @Override // com.planner5d.library.application.c
        public com.planner5d.library.model.manager.statistics.events.l3 g2() {
            return g3.c(this.f142643d);
        }

        @Override // com.planner5d.library.application.c
        public com.planner5d.library.api.b getApi() {
            return this.f142814w.get();
        }

        @Override // com.planner5d.library.application.c
        public com.planner5d.library.model.manager.config.d getConfigManager() {
            return this.f142843z1.get();
        }

        @Override // com.planner5d.library.application.c
        public com.planner5d.library.modules.user.user.q0 getUserProperties() {
            return this.f142745o2.get();
        }

        @Override // com.planner5d.library.application.c
        public void h(PreloaderBoxView preloaderBoxView) {
            d4(preloaderBoxView);
        }

        @Override // com.planner5d.library.application.c
        public void h0(Project2D project2D) {
            i4(project2D);
        }

        @Override // com.planner5d.library.application.c
        public void h1(com.planner5d.library.widget.editor.catalog.drawer.p pVar) {
            w3(pVar);
        }

        @Override // com.planner5d.library.application.c
        public void h2(ChooseRoomShape chooseRoomShape) {
            y3(chooseRoomShape);
        }

        @Override // com.planner5d.library.application.c
        public ia.b i() {
            return this.f142675g4.get();
        }

        @Override // com.planner5d.library.application.c
        public void i0(ItemInfo itemInfo) {
            V3(itemInfo);
        }

        @Override // com.planner5d.library.application.c
        public com.planner5d.library.model.manager.payments.j i1() {
            return this.G1.get();
        }

        @Override // com.planner5d.library.application.c
        public com.planner5d.library.modules.user.user.t0 i2() {
            return this.E1.get();
        }

        @Override // com.planner5d.library.application.c
        public com.planner5d.library.model.manager.config.n j() {
            return this.W3.get();
        }

        @Override // com.planner5d.library.application.c
        public void j0(PurchaseRequiredMessage purchaseRequiredMessage) {
            t4(purchaseRequiredMessage);
        }

        @Override // com.planner5d.library.application.c
        public void j1(ProjectRename projectRename) {
            l4(projectRename);
        }

        @Override // com.planner5d.library.application.c
        public void j2(ProjectConflict projectConflict) {
            k4(projectConflict);
        }

        @Override // com.planner5d.library.application.c
        public com.planner5d.library.model.manager.i2 k() {
            return this.N6.get();
        }

        @Override // com.planner5d.library.application.c
        public void k0(com.planner5d.library.widget.editor.popup.floors.f fVar) {
            M3(fVar);
        }

        @Override // com.planner5d.library.application.c
        public com.planner5d.library.services.v k1() {
            return l0.c(this.f142643d);
        }

        @Override // com.planner5d.library.application.c
        public com.planner5d.library.api.requests.c k2() {
            return new com.planner5d.library.api.requests.c(this.f142805v.get(), this.f142814w.get());
        }

        @Override // com.planner5d.library.application.c
        public com.planner5d.library.model.manager.f2 l() {
            return this.f142718l2.get();
        }

        @Override // com.planner5d.library.application.c
        public void l0(GalleryProjectFragment galleryProjectFragment) {
            S3(galleryProjectFragment);
        }

        @Override // com.planner5d.library.application.c
        public com.planner5d.library.services.g0 l1() {
            return new com.planner5d.library.services.g0(this.P2.get(), b0.c(this.f142643d), this.R2.get(), this.K0.get(), g3.c(this.f142643d));
        }

        @Override // com.planner5d.library.application.c
        public com.planner5d.library.model.manager.config.source.l l2() {
            return this.f142816w1.get();
        }

        @Override // com.planner5d.library.application.c
        public void m(DocumentPreview documentPreview) {
        }

        @Override // com.planner5d.library.application.c
        public com.planner5d.library.model.manager.c2 m0() {
            return o0.c(this.f142643d, this.R2.get());
        }

        @Override // com.planner5d.library.application.c
        public com.planner5d.library.services.utility.f1 m1() {
            return b0.c(this.f142643d);
        }

        @Override // com.planner5d.library.application.c
        public com.planner5d.library.modules.user.user.y0 m2() {
            return this.f142799u2.get();
        }

        @Override // com.planner5d.library.application.c
        public com.planner5d.library.services.utility.t n() {
            return this.f142834y1.get();
        }

        @Override // com.planner5d.library.application.c
        public com.planner5d.library.services.utility.c n0() {
            return new com.planner5d.library.services.utility.c(this.f142625b);
        }

        @Override // com.planner5d.library.application.c
        public void n1(MessageWithImageDialog messageWithImageDialog) {
            a4(messageWithImageDialog);
        }

        @Override // com.planner5d.library.application.c
        public com.planner5d.library.model.manager.config.p n2() {
            return v1.c(this.f142643d, this.K2.get());
        }

        @Override // com.planner5d.library.application.c
        public com.planner5d.library.model.manager.synchronization.d o() {
            return new com.planner5d.library.model.manager.synchronization.d(this.f142616a, this.U2.get(), this.W2.get(), dagger.internal.g.a(this.P), this.P2.get(), n2(), this.Y2.get(), b5(), k2());
        }

        @Override // com.planner5d.library.application.c
        public Application o0() {
            return this.f142625b;
        }

        @Override // com.planner5d.library.application.c
        public com.planner5d.library.model.manager.n1 o1() {
            return this.B.get();
        }

        @Override // com.planner5d.library.application.c
        public void o2(AuthenticationSignInEnterCode authenticationSignInEnterCode) {
            v3(authenticationSignInEnterCode);
        }

        @Override // com.planner5d.library.application.c
        public com.planner5d.library.model.manager.statistics.events.c4 p() {
            return j3.c(this.f142643d);
        }

        @Override // com.planner5d.library.application.c
        public com.planner5d.library.model.manager.spaces.documents.c p0() {
            return this.f142654e1.get();
        }

        @Override // com.planner5d.library.application.c
        public com.planner5d.library.services.download.d p1() {
            return this.f142663f1.get();
        }

        @Override // com.planner5d.library.application.c
        public com.planner5d.library.model.manager.statistics.events.e4 p2() {
            return this.f142729m4.get();
        }

        @Override // com.planner5d.library.application.c
        public void q(ProjectSettingsBottomSheetDialog projectSettingsBottomSheetDialog) {
            m4(projectSettingsBottomSheetDialog);
        }

        @Override // com.planner5d.library.application.c
        public void q0(OrdersHistoryFragment ordersHistoryFragment) {
            c4(ordersHistoryFragment);
        }

        @Override // com.planner5d.library.application.c
        public void q1(SnapshotSetupComplete snapshotSetupComplete) {
            w4(snapshotSetupComplete);
        }

        @Override // com.planner5d.library.application.c
        public ud.b q2() {
            return this.F6.get();
        }

        @Override // com.planner5d.library.application.c
        public com.planner5d.library.activity.fragment.list.holders.u r() {
            return new com.planner5d.library.activity.fragment.list.holders.u(this.P2.get(), this.Y2.get(), this.f142626b0.get(), dagger.internal.g.a(this.f142762q1), b0.c(this.f142643d), this.f142654e1.get());
        }

        @Override // com.planner5d.library.application.c
        public com.planner5d.library.services.o0 r0() {
            return y4.c(this.f142706k);
        }

        @Override // com.planner5d.library.application.c
        public com.planner5d.library.widget.editor.helper.a2 r1() {
            return this.f142710k3.get();
        }

        @Override // com.planner5d.library.application.c
        public com.planner5d.library.modules.user.user.t r2() {
            return this.f142832y.get();
        }

        @Override // com.planner5d.library.application.c
        public le.e s() {
            return d0.c(this.f142643d, e3());
        }

        @Override // com.planner5d.library.application.c
        public void s0(FeedAllArticlesFragment feedAllArticlesFragment) {
            J3(feedAllArticlesFragment);
        }

        @Override // com.planner5d.library.application.c
        public com.planner5d.library.model.manager.o1 s1() {
            return g0.c(this.f142643d, this.B.get());
        }

        @Override // com.planner5d.library.application.c
        public com.planner5d.library.activity.fragment.smartwizard.a s2() {
            return s4.c(this.f142670g);
        }

        @Override // com.planner5d.library.application.c
        public com.planner5d.library.services.utility.w t() {
            return new com.planner5d.library.services.utility.w(E4(), b0.c(this.f142643d));
        }

        @Override // com.planner5d.library.application.c
        public com.planner5d.library.activity.helper.r t0() {
            return this.f142627b1.get();
        }

        @Override // com.planner5d.library.application.c
        public void t1(ImproveSnapshotWithAi improveSnapshotWithAi) {
            U3(improveSnapshotWithAi);
        }

        @Override // com.planner5d.library.application.c
        public void t2(Projects projects) {
            n4(projects);
        }

        @Override // com.planner5d.library.application.c
        public com.planner5d.library.model.manager.s2 u() {
            return this.R6.get();
        }

        @Override // com.planner5d.library.application.c
        public void u0(PremiumFeaturesDialog premiumFeaturesDialog) {
            e4(premiumFeaturesDialog);
        }

        @Override // com.planner5d.library.application.c
        public void u1(ProfileEditFragment profileEditFragment) {
            g4(profileEditFragment);
        }

        @Override // com.planner5d.library.application.c
        public com.planner5d.library.model.manager.spaces.b u2() {
            return this.f142645d1.get();
        }

        @Override // com.planner5d.library.application.c
        public void v(StartupPaywall startupPaywall) {
            A4(startupPaywall);
        }

        @Override // com.planner5d.library.application.c
        public void v0(UserMessage userMessage) {
            C4(userMessage);
        }

        @Override // com.planner5d.library.application.c
        public com.planner5d.library.services.utility.g1 v1() {
            return this.E6.get();
        }

        @Override // com.planner5d.library.application.c
        public com.planner5d.library.model.manager.project.d0 v2() {
            return this.P2.get();
        }

        @Override // com.planner5d.library.application.c
        public com.planner5d.library.activity.helper.m2 w() {
            return new com.planner5d.library.activity.helper.m2(C1());
        }

        @Override // com.planner5d.library.application.c
        public com.planner5d.library.model.manager.builtin.i w0() {
            return this.f142841z.get();
        }

        @Override // com.planner5d.library.application.c
        public ErrorMessageParser w1() {
            return this.Q2.get();
        }

        @Override // com.planner5d.library.application.c
        public void w2(ProfileFragment profileFragment) {
            h4(profileFragment);
        }

        @Override // com.planner5d.library.application.c
        public com.planner5d.library.model.manager.statistics.events.r3 x() {
            return c2.c(this.f142643d);
        }

        @Override // com.planner5d.library.application.c
        public androidx.lifecycle.j2.c x0() {
            return this.f142839y6.get();
        }

        @Override // com.planner5d.library.application.c
        public com.planner5d.library.database.model.chat.d x1() {
            return new com.planner5d.library.database.model.chat.d(dagger.internal.g.a(this.S6), E2());
        }

        @Override // com.planner5d.library.application.c
        public void x2(DecoratorFragment decoratorFragment) {
            B3(decoratorFragment);
        }

        @Override // com.planner5d.library.application.c
        public com.planner5d.library.services.t y() {
            return n4.c(this.f142697j);
        }

        @Override // com.planner5d.library.application.c
        public com.planner5d.library.modules.user.user.z0 y0() {
            return this.f142727m2.get();
        }

        @Override // com.planner5d.library.application.c
        public com.planner5d.library.activity.helper.x y1() {
            return this.M6.get();
        }

        @Override // com.planner5d.library.application.c
        public void y2(GalleryPage galleryPage) {
            Q3(galleryPage);
        }

        @Override // com.planner5d.library.application.c
        public com.planner5d.library.model.manager.initialization.r z() {
            return this.f142772r2.get();
        }

        @Override // com.planner5d.library.application.c
        public com.planner5d.library.model.a z0() {
            return t4.c(this.f142670g);
        }

        @Override // com.planner5d.library.application.c
        public ce.b z1() {
            return w4.c(this.f142679h);
        }

        @Override // com.planner5d.library.application.c
        public void z2(OnboardingSignInDialog onboardingSignInDialog) {
            b4(onboardingSignInDialog);
        }

        private a(i iVar, gb.a aVar, a5 a5Var, m5 m5Var, f4 f4Var, q3 q3Var, j5 j5Var, u4 u4Var, q4 q4Var, h4 h4Var, q5 q5Var, g5 g5Var, t3 t3Var, m4 m4Var, o4 o4Var, x4 x4Var, com.planner5d.library.application.b bVar, Application application, com.planner5d.library.application.d dVar) {
            this.f142742o = this;
            this.f142616a = bVar;
            this.f142625b = application;
            this.f142634c = dVar;
            this.f142643d = iVar;
            this.f142652e = q3Var;
            this.f142661f = j5Var;
            this.f142670g = q4Var;
            this.f142679h = u4Var;
            this.f142688i = h4Var;
            this.f142697j = m4Var;
            this.f142706k = x4Var;
            this.f142715l = a5Var;
            this.f142724m = t3Var;
            this.f142733n = f4Var;
            p3(iVar, aVar, a5Var, m5Var, f4Var, q3Var, j5Var, u4Var, q4Var, h4Var, q5Var, g5Var, t3Var, m4Var, o4Var, x4Var, bVar, application, dVar);
            q3(iVar, aVar, a5Var, m5Var, f4Var, q3Var, j5Var, u4Var, q4Var, h4Var, q5Var, g5Var, t3Var, m4Var, o4Var, x4Var, bVar, application, dVar);
            r3(iVar, aVar, a5Var, m5Var, f4Var, q3Var, j5Var, u4Var, q4Var, h4Var, q5Var, g5Var, t3Var, m4Var, o4Var, x4Var, bVar, application, dVar);
            s3(iVar, aVar, a5Var, m5Var, f4Var, q3Var, j5Var, u4Var, q4Var, h4Var, q5Var, g5Var, t3Var, m4Var, o4Var, x4Var, bVar, application, dVar);
            t3(iVar, aVar, a5Var, m5Var, f4Var, q3Var, j5Var, u4Var, q4Var, h4Var, q5Var, g5Var, t3Var, m4Var, o4Var, x4Var, bVar, application, dVar);
        }
    }

    private static final class b implements com.planner5d.library.application.c.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private com.planner5d.library.application.b f142850a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Application f142851b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private com.planner5d.library.application.d f142852c;

        @Override // com.planner5d.library.application.c.a
        public com.planner5d.library.application.c build() {
            dagger.internal.p.a(this.f142850a, com.planner5d.library.application.b.class);
            dagger.internal.p.a(this.f142851b, Application.class);
            dagger.internal.p.a(this.f142852c, com.planner5d.library.application.d.class);
            return new a(new i(), new gb.a(), new a5(), new m5(), new f4(), new q3(), new j5(), new u4(), new q4(), new h4(), new q5(), new g5(), new t3(), new m4(), new o4(), new x4(), this.f142850a, this.f142851b, this.f142852c);
        }

        @Override // com.planner5d.library.application.c.a
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public b d(Application application) {
            this.f142851b = (Application) dagger.internal.p.b(application);
            return this;
        }

        @Override // com.planner5d.library.application.c.a
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public b a(com.planner5d.library.application.b bVar) {
            this.f142850a = (com.planner5d.library.application.b) dagger.internal.p.b(bVar);
            return this;
        }

        @Override // com.planner5d.library.application.c.a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public b c(com.planner5d.library.application.d dVar) {
            this.f142852c = (com.planner5d.library.application.d) dagger.internal.p.b(dVar);
            return this;
        }

        private b() {
        }
    }

    private static final class c implements t5 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final a f142853b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final c f142854c;

        @Override // com.planner5d.library.application.t5
        public com.planner5d.library.model.manager.u1 d() {
            return this.f142853b.E4();
        }

        private c(a aVar) {
            this.f142854c = this;
            this.f142853b = aVar;
        }
    }

    private static final class d implements d6 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final a f142855a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final d f142856b;

        @z7.a
        private CarouselView a(CarouselView carouselView) {
            com.planner5d.library.widget.carousel.c.b(carouselView, (com.planner5d.library.services.bitmaploader.d) this.f142855a.H0.get());
            com.planner5d.library.widget.carousel.c.c(carouselView, b0.c(this.f142855a.f142643d));
            return carouselView;
        }

        @z7.a
        private ColorPickerCompact b(ColorPickerCompact colorPickerCompact) {
            com.planner5d.library.widget.colorpicker.b.b(colorPickerCompact, (com.planner5d.library.services.utility.p0) this.f142855a.f142626b0.get());
            return colorPickerCompact;
        }

        @z7.a
        private PreloaderBoxV2View c(PreloaderBoxV2View preloaderBoxV2View) {
            com.planner5d.library.widget.preloader.m.b(preloaderBoxV2View, dagger.internal.g.a(this.f142855a.f142626b0));
            return preloaderBoxV2View;
        }

        @z7.a
        private PreloaderBoxView d(PreloaderBoxView preloaderBoxView) {
            com.planner5d.library.widget.preloader.s.b(preloaderBoxView, (com.planner5d.library.services.utility.p0) this.f142855a.f142626b0.get());
            com.planner5d.library.widget.preloader.s.d(preloaderBoxView, m2.c(this.f142855a.f142643d));
            return preloaderBoxView;
        }

        @z7.a
        private PreloaderDialogView e(PreloaderDialogView preloaderDialogView) {
            com.planner5d.library.widget.preloader.a0.b(preloaderDialogView, dagger.internal.g.a(this.f142855a.f142626b0));
            return preloaderDialogView;
        }

        @Override // com.planner5d.library.application.d6
        public com.planner5d.library.services.y f() {
            return this.f142855a.f();
        }

        @Override // com.planner5d.library.application.d6
        public com.planner5d.library.services.utility.f1 g() {
            return b0.c(this.f142855a.f142643d);
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
        public com.planner5d.library.model.manager.u1 k() {
            return this.f142855a.E4();
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

        private d(a aVar) {
            this.f142856b = this;
            this.f142855a = aVar;
        }
    }

    private m3() {
    }

    public static com.planner5d.library.application.c.a a() {
        return new b();
    }
}
