package com.planner5d.library.application;

import android.app.Application;
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
import com.planner5d.library.model.manager.statistics.events.StatisticsEventAiDesigner;
import com.planner5d.library.services.download.DownloadService;
import com.planner5d.library.services.exceptions.ErrorMessageParser;
import com.planner5d.library.services.exceptions.NetworkErrorUtility;
import com.planner5d.library.services.share.PublicFileProvider;
import com.planner5d.library.widget.editor.popup.itemproperties.ItemPropertiesDrawer;
import com.planner5d.library.widget.preloader.PreloaderBoxView;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@fg.d(modules = {i.class, v5.class, gb.a.class, a5.class, m5.class, f4.class, q3.class, j5.class, u4.class, q4.class, h4.class, q5.class, g5.class, t3.class, m4.class, o4.class, x4.class})
@ij.f
public interface c {

    @fg.d.a
    public interface a {
        @fg.b
        @NotNull
        a a(@NotNull b bVar);

        @NotNull
        c build();

        @fg.b
        @NotNull
        a c(@NotNull d dVar);

        @fg.b
        @NotNull
        a d(@NotNull Application application);
    }

    void A(@NotNull ChooseRoomStyle chooseRoomStyle);

    @NotNull
    com.planner5d.library.model.manager.payments.a0 A0();

    @NotNull
    com.planner5d.library.model.manager.contest.g A1();

    void B(@NotNull PublicFileProvider publicFileProvider);

    @NotNull
    com.planner5d.library.model.manager.config.r B0();

    @NotNull
    com.planner5d.library.model.manager.p4 B1();

    @NotNull
    com.planner5d.library.activity.fragment.x C();

    @NotNull
    com.planner5d.library.model.manager.b5 C0();

    @NotNull
    com.planner5d.library.activity.helper.j2 C1();

    @NotNull
    com.planner5d.library.services.service.b D();

    @NotNull
    com.planner5d.library.model.manager.y1 D0();

    void D1(@NotNull com.planner5d.library.widget.editor.editor3dcardboard.p pVar);

    void E(@NotNull FolderEdit folderEdit);

    void E0(@NotNull com.planner5d.library.activity.fragment.dialog.purchase.g gVar);

    void E1(@NotNull ManageDataFragment manageDataFragment);

    @NotNull
    StatisticsEventAiDesigner F();

    @NotNull
    com.planner5d.library.model.manager.statistics.events.j3 F0();

    @NotNull
    com.planner5d.library.model.manager.b2 F1();

    void G(@NotNull DownloadService downloadService);

    @NotNull
    com.planner5d.library.modules.user.user.a0 G0();

    void G1(@NotNull PurchasePagePlanRecognitions purchasePagePlanRecognitions);

    @NotNull
    com.planner5d.library.model.manager.k1 H();

    @NotNull
    com.planner5d.library.activity.fragment.list.d0 H0();

    void H1(@NotNull PurchaseDialog purchaseDialog);

    @NotNull
    com.planner5d.library.model.manager.y0 I();

    void I0(@NotNull Message message);

    void I1(@NotNull DocumentEdit documentEdit);

    @NotNull
    com.planner5d.library.modules.user.auth.r J();

    void J0(@NotNull Gallery gallery);

    @NotNull
    com.planner5d.library.model.manager.config.j J1();

    @NotNull
    com.planner5d.library.model.manager.l K();

    void K0(@NotNull PurchasePageSnapshots purchasePageSnapshots);

    @NotNull
    com.planner5d.library.activity.helper.imagechooser.j K1();

    void L(@NotNull LicenseCheck licenseCheck);

    @NotNull
    com.planner5d.library.activity.fragment.dialog.k L0();

    @NotNull
    sd.b L1();

    @NotNull
    com.planner5d.library.services.upload.g M();

    @Nullable
    com.planner5d.library.activity.fragment.projects.w0 M0();

    void M1(@NotNull RemovePersonalData removePersonalData);

    void N(@NotNull Snapshots snapshots);

    @NotNull
    com.planner5d.library.activity.helper.z0 N0();

    void N1(@NotNull MainCardboard mainCardboard);

    void O(@NotNull ItemPropertiesDrawer itemPropertiesDrawer);

    void O0(@NotNull SendToGallery sendToGallery);

    @NotNull
    com.planner5d.library.services.utility.p0 O1();

    void P(@NotNull GalleryPager galleryPager);

    void P0(@NotNull FeedArticleFragment feedArticleFragment);

    void P1(@NotNull FolderSelection folderSelection);

    void Q(@NotNull Dimensions dimensions);

    @NotNull
    com.planner5d.library.activity.fragment.l Q0();

    @NotNull
    com.planner5d.library.model.manager.synchronization.i Q1();

    @NotNull
    com.planner5d.library.services.p R();

    @NotNull
    com.planner5d.library.model.manager.statistics.events.v3 R0();

    @NotNull
    com.planner5d.library.modules.user.user.w R1();

    @NotNull
    com.planner5d.library.activity.helper.b0 S();

    @NotNull
    b S0();

    @NotNull
    NetworkErrorUtility S1();

    @NotNull
    com.planner5d.library.activity.fragment.j T();

    @NotNull
    com.planner5d.library.model.manager.k5 T0();

    @NotNull
    com.planner5d.library.model.manager.payments.b0 T1();

    @NotNull
    com.planner5d.library.model.manager.i1 U();

    void U0(@NotNull ComparePlansFragment comparePlansFragment);

    @NotNull
    d U1();

    @NotNull
    com.planner5d.library.model.manager.managedfiles.a0 V();

    void V0(@NotNull AuthenticationExternalService authenticationExternalService);

    @NotNull
    com.planner5d.library.model.manager.s4 V1();

    @NotNull
    com.planner5d.library.activity.fragment.feed.b W();

    @NotNull
    com.planner5d.library.model.manager.c0 W0();

    @NotNull
    com.planner5d.library.model.manager.statistics.b0 W1();

    void X(@NotNull SnapshotSetupDialog snapshotSetupDialog);

    void X0(@NotNull com.planner5d.library.widget.editor.catalog.z zVar);

    void X1(@NotNull StartupFragment startupFragment);

    void Y(@NotNull Editor3dFragment editor3dFragment);

    @NotNull
    com.planner5d.library.widget.rate.g Y0();

    @NotNull
    com.planner5d.library.activity.fragment.n Y1();

    @NotNull
    com.planner5d.library.database.model.chat.f Z();

    void Z0(@NotNull com.planner5d.library.widget.editor.editor3dcardboard.l lVar);

    @NotNull
    com.planner5d.library.model.manager.statistics.events.i3 Z1();

    @NotNull
    com.planner5d.library.model.manager.statistics.d0 a();

    @NotNull
    com.planner5d.library.model.manager.c1 a0();

    void a1(@NotNull PurchasePagePremiumReview purchasePagePremiumReview);

    @NotNull
    com.planner5d.library.services.utility.c2 a2();

    @NotNull
    d6 b();

    void b0(@NotNull AuthenticationRemindPasswordSuccess authenticationRemindPasswordSuccess);

    void b1(@NotNull com.planner5d.library.activity.fragment.spaces.folder.FolderEdit folderEdit);

    @NotNull
    com.planner5d.library.services.g b2();

    @NotNull
    t5 c();

    void c0(@NotNull WishList wishList);

    @NotNull
    com.planner5d.library.model.manager.f c1();

    void c2(@NotNull FeedFragment feedFragment);

    @NotNull
    com.planner5d.library.model.manager.t1 d();

    void d0(@NotNull Project3D project3D);

    void d1(@NotNull Documents documents);

    @NotNull
    hd.b d2();

    @NotNull
    com.planner5d.library.model.manager.push.b e();

    void e0(@NotNull SnapshotPager snapshotPager);

    @NotNull
    com.planner5d.library.model.manager.crashreporting.l e1();

    void e2(@NotNull Main main);

    @NotNull
    com.planner5d.library.services.y f();

    @NotNull
    com.planner5d.library.model.manager.d f0();

    @NotNull
    com.planner5d.library.model.manager.unlockeditems.b f1();

    void f2(@NotNull ProjectsPagesFragment projectsPagesFragment);

    @NotNull
    com.planner5d.library.activity.fragment.dialog.purchase.s g0();

    void g1(@NotNull com.planner5d.library.widget.tab.b bVar);

    @NotNull
    com.planner5d.library.model.manager.statistics.events.l3 g2();

    @NotNull
    com.planner5d.library.api.b getApi();

    @NotNull
    com.planner5d.library.model.manager.config.d getConfigManager();

    @NotNull
    com.planner5d.library.modules.user.user.q0 getUserProperties();

    void h(@NotNull PreloaderBoxView preloaderBoxView);

    void h0(@NotNull Project2D project2D);

    void h1(@NotNull com.planner5d.library.widget.editor.catalog.drawer.p pVar);

    void h2(@NotNull ChooseRoomShape chooseRoomShape);

    @NotNull
    ia.b i();

    void i0(@NotNull ItemInfo itemInfo);

    @NotNull
    com.planner5d.library.model.manager.payments.j i1();

    @NotNull
    com.planner5d.library.modules.user.user.t0 i2();

    @NotNull
    com.planner5d.library.model.manager.config.n j();

    void j0(@NotNull PurchaseRequiredMessage purchaseRequiredMessage);

    void j1(@NotNull ProjectRename projectRename);

    void j2(@NotNull ProjectConflict projectConflict);

    @NotNull
    com.planner5d.library.model.manager.i2 k();

    void k0(@NotNull com.planner5d.library.widget.editor.popup.floors.f fVar);

    @NotNull
    com.planner5d.library.services.v k1();

    @NotNull
    com.planner5d.library.api.requests.c k2();

    @NotNull
    com.planner5d.library.model.manager.f2 l();

    void l0(@NotNull GalleryProjectFragment galleryProjectFragment);

    @NotNull
    com.planner5d.library.services.g0 l1();

    @NotNull
    com.planner5d.library.model.manager.config.source.l l2();

    void m(@NotNull DocumentPreview documentPreview);

    @NotNull
    com.planner5d.library.model.manager.c2 m0();

    @NotNull
    com.planner5d.library.services.utility.f1 m1();

    @NotNull
    com.planner5d.library.modules.user.user.y0 m2();

    @NotNull
    com.planner5d.library.services.utility.t n();

    @NotNull
    com.planner5d.library.services.utility.c n0();

    void n1(@NotNull MessageWithImageDialog messageWithImageDialog);

    @NotNull
    com.planner5d.library.model.manager.config.p n2();

    @NotNull
    com.planner5d.library.model.manager.synchronization.d o();

    @NotNull
    Application o0();

    @NotNull
    com.planner5d.library.model.manager.n1 o1();

    void o2(@NotNull AuthenticationSignInEnterCode authenticationSignInEnterCode);

    @NotNull
    com.planner5d.library.model.manager.statistics.events.c4 p();

    @NotNull
    com.planner5d.library.model.manager.spaces.documents.c p0();

    @NotNull
    com.planner5d.library.services.download.d p1();

    @NotNull
    com.planner5d.library.model.manager.statistics.events.e4 p2();

    void q(@NotNull ProjectSettingsBottomSheetDialog projectSettingsBottomSheetDialog);

    void q0(@NotNull OrdersHistoryFragment ordersHistoryFragment);

    void q1(@NotNull SnapshotSetupComplete snapshotSetupComplete);

    @NotNull
    ud.b q2();

    @NotNull
    com.planner5d.library.activity.fragment.list.holders.u r();

    @NotNull
    com.planner5d.library.services.o0 r0();

    @NotNull
    com.planner5d.library.widget.editor.helper.a2 r1();

    @NotNull
    com.planner5d.library.modules.user.user.t r2();

    @NotNull
    le.e s();

    void s0(@NotNull FeedAllArticlesFragment feedAllArticlesFragment);

    @NotNull
    com.planner5d.library.model.manager.o1 s1();

    @NotNull
    com.planner5d.library.activity.fragment.smartwizard.a s2();

    @NotNull
    com.planner5d.library.services.utility.w t();

    @NotNull
    com.planner5d.library.activity.helper.r t0();

    void t1(@NotNull ImproveSnapshotWithAi improveSnapshotWithAi);

    void t2(@NotNull Projects projects);

    @NotNull
    com.planner5d.library.model.manager.s2 u();

    void u0(@NotNull PremiumFeaturesDialog premiumFeaturesDialog);

    void u1(@NotNull ProfileEditFragment profileEditFragment);

    @NotNull
    com.planner5d.library.model.manager.spaces.b u2();

    void v(@NotNull StartupPaywall startupPaywall);

    void v0(@NotNull UserMessage userMessage);

    @NotNull
    com.planner5d.library.services.utility.g1 v1();

    @NotNull
    com.planner5d.library.model.manager.project.d0 v2();

    @NotNull
    com.planner5d.library.activity.helper.m2 w();

    @NotNull
    com.planner5d.library.model.manager.builtin.i w0();

    @NotNull
    ErrorMessageParser w1();

    void w2(@NotNull ProfileFragment profileFragment);

    @NotNull
    com.planner5d.library.model.manager.statistics.events.r3 x();

    @NotNull
    androidx.lifecycle.j2.c x0();

    @NotNull
    com.planner5d.library.database.model.chat.d x1();

    void x2(@NotNull DecoratorFragment decoratorFragment);

    @NotNull
    com.planner5d.library.services.t y();

    @NotNull
    com.planner5d.library.modules.user.user.z0 y0();

    @NotNull
    com.planner5d.library.activity.helper.x y1();

    void y2(@NotNull GalleryPage galleryPage);

    @NotNull
    com.planner5d.library.model.manager.initialization.r z();

    @NotNull
    com.planner5d.library.model.a z0();

    @NotNull
    ce.b z1();

    void z2(@NotNull OnboardingSignInDialog onboardingSignInDialog);
}
