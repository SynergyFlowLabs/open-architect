package com.devtodev.analytics.internal.services;

import com.devtodev.analytics.internal.backend.IBackend;
import com.devtodev.analytics.internal.backend.Identifiers;
import com.devtodev.analytics.internal.backend.repository.AnalyticsReport;
import com.devtodev.analytics.internal.domain.DbModel;
import com.devtodev.analytics.internal.domain.EventObject;
import com.devtodev.analytics.internal.domain.Project;
import com.devtodev.analytics.internal.domain.User;
import com.devtodev.analytics.internal.domain.events.IEncodable;
import com.devtodev.analytics.internal.domain.events.reports.Package;
import com.devtodev.analytics.internal.domain.events.reports.Report;
import com.devtodev.analytics.internal.logger.Logger;
import com.devtodev.analytics.internal.managers.IEventController;
import com.devtodev.analytics.internal.managers.IStateManager;
import com.devtodev.analytics.internal.platform.ApplicationData;
import com.devtodev.analytics.internal.queue.QueueManager;
import com.devtodev.analytics.internal.storage.EventParam;
import com.devtodev.analytics.internal.storage.IRepository;
import com.devtodev.analytics.internal.storage.sqlite.RemoverPattern;
import com.devtodev.analytics.internal.storage.sqlite.SqlValue;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.a;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.l0;
import kotlin.k0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nReportService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReportService.kt\ncom/devtodev/analytics/internal/services/ReportService\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,241:1\n1045#2:242\n766#2:243\n857#2,2:244\n1045#2:246\n766#2:247\n857#2,2:248\n1855#2,2:250\n1549#2:252\n1620#2,3:253\n766#2:256\n857#2,2:257\n*S KotlinDebug\n*F\n+ 1 ReportService.kt\ncom/devtodev/analytics/internal/services/ReportService\n*L\n63#1:242\n67#1:243\n67#1:244,2\n92#1:246\n105#1:247\n105#1:248,2\n107#1:250,2\n224#1:252\n224#1:253,3\n227#1:256\n227#1:257,2\n*E\n"})
public final class ReportService implements IReportService {

    @NotNull
    private final IBackend backend;

    @NotNull
    private final IEventController eventController;

    @NotNull
    private final IRepository eventRepository;
    private boolean isSending;
    private List<Long> nowSendingReports;

    @Nullable
    private Function0<Unit> onReportSendAction;

    @NotNull
    private final IRepository reportsRepository;
    private boolean resendWhenFinish;

    @NotNull
    private final IStateManager stateManager;

    /* JADX INFO: renamed from: com.devtodev.analytics.internal.services.ReportService$removeReports$1, reason: invalid class name */
    public static final class AnonymousClass1 extends l0 implements Function0<Unit> {
        final /* synthetic */ Report $report;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Report report) {
            super(0);
            this.$report = report;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f312394a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ReportService.this.reportsRepository.delete(CollectionsKt.listOf(this.$report), CollectionsKt.listOf(new EventParam("_id", new SqlValue.Long(this.$report.getIdKey()))), RemoverPattern.JEST_ONE);
        }
    }

    /* JADX INFO: renamed from: com.devtodev.analytics.internal.services.ReportService$sendFlashEvent$1, reason: invalid class name and case insensitive filesystem */
    public static final class C26101 extends l0 implements Function0<Unit> {
        final /* synthetic */ Identifiers $identifiers;
        final /* synthetic */ Project $project;
        final /* synthetic */ Report $report;
        final /* synthetic */ ReportService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C26101(Report report, ReportService reportService, Project project, Identifiers identifiers) {
            super(0);
            this.$report = report;
            this.this$0 = reportService;
            this.$project = project;
            this.$identifiers = identifiers;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f312394a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            Logger logger = Logger.INSTANCE;
            Logger.info$default(logger, "Trying to send the Report [" + this.$report.getUuid() + "]", null, 2, null);
            if (this.this$0.getBackend().sendAnalytic(this.$project.getApplicationKey(), this.$identifiers, this.$report) instanceof AnalyticsReport.Success) {
                Logger.info$default(logger, "The report [" + this.$report.getUuid() + "] has been sent successfully", null, 2, null);
            }
        }
    }

    /* JADX INFO: renamed from: com.devtodev.analytics.internal.services.ReportService$sendReports$2, reason: invalid class name */
    public static final class AnonymousClass2 extends l0 implements Function0<Unit> {
        public AnonymousClass2() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f312394a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ReportService.this.isSending = false;
            if (ReportService.this.resendWhenFinish) {
                ReportService.this.resendWhenFinish = false;
                ReportService.this.sendSavedReports();
            }
        }
    }

    /* JADX INFO: renamed from: com.devtodev.analytics.internal.services.ReportService$sendSavedReports$2, reason: invalid class name and case insensitive filesystem */
    public static final class C26112 extends l0 implements Function0<Unit> {
        final /* synthetic */ List<Report> $storedReports;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C26112(List<Report> list) {
            super(0);
            this.$storedReports = list;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f312394a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ReportService.this.sendReports(this.$storedReports);
        }
    }

    public ReportService(@NotNull IStateManager stateManager, @NotNull IEventController eventController, @NotNull IRepository reportsRepository, @NotNull IRepository eventRepository, @NotNull IBackend backend) {
        Intrinsics.checkNotNullParameter(stateManager, "stateManager");
        Intrinsics.checkNotNullParameter(eventController, "eventController");
        Intrinsics.checkNotNullParameter(reportsRepository, "reportsRepository");
        Intrinsics.checkNotNullParameter(eventRepository, "eventRepository");
        Intrinsics.checkNotNullParameter(backend, "backend");
        this.stateManager = stateManager;
        this.eventController = eventController;
        this.reportsRepository = reportsRepository;
        this.eventRepository = eventRepository;
        this.backend = backend;
        this.nowSendingReports = Collections.synchronizedList(new ArrayList());
    }

    private final Identifiers clearNotActiveUserBackendIds(Identifiers identifiers, long j10, long j11) {
        if (j10 != j11) {
            identifiers.setDevtodevId(null);
            identifiers.setCrossPlatformDevtodevId(null);
            identifiers.setDevtodevIdTimestamp(null);
        }
        return identifiers;
    }

    private final List<Package> collectPackages(List<EventObject> list) {
        ArrayList arrayList = new ArrayList();
        Project activeProject = this.stateManager.getActiveProject();
        ArrayList arrayList2 = new ArrayList();
        Iterator<EventObject> it = list.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            i10++;
            arrayList2.add(it.next().getEventJson());
            if (arrayList2.size() >= activeProject.getConfiguration().getCountForRequest() || i10 == list.size()) {
                arrayList.add(createPackage(arrayList2));
                arrayList2 = new ArrayList();
            }
        }
        return arrayList;
    }

    private final Package createPackage(List<String> list) {
        ApplicationData applicationData = this.stateManager.getApplicationData();
        return new Package(this.stateManager.getDeviceConstants().getLanguage(), applicationData.getAppVersion(), String.valueOf(applicationData.getCodeVersion()), applicationData.getSdkVersionName(), applicationData.getSdkVersionCode(), applicationData.getBundleId(), applicationData.getPlatformEngine(), applicationData.getInstallSource(), list);
    }

    private final void removeReports(Report report) {
        QueueManager.Companion.runIncoming(new AnonymousClass1(report));
    }

    private final boolean responseHandler(AnalyticsReport analyticsReport, Report report) {
        if (!(analyticsReport instanceof AnalyticsReport.Success)) {
            if (!(analyticsReport instanceof AnalyticsReport.Error)) {
                throw new k0();
            }
            Logger.debug$default(Logger.INSTANCE, "The network queue is stopped", null, 2, null);
            this.nowSendingReports.clear();
            return false;
        }
        Logger.info$default(Logger.INSTANCE, "The report [" + report.getUuid() + "] has been sent successfully", null, 2, null);
        removeReports(report);
        Function0<Unit> onReportSendAction = getOnReportSendAction();
        if (onReportSendAction != null) {
            onReportSendAction.invoke();
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sendReports(List<Report> list) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            Report report = list.get(i10);
            Logger.info$default(Logger.INSTANCE, "Trying to send the Report [" + report.getUuid() + "]", null, 2, null);
            Identifiers identifiers = report.getIdentifiers();
            String appKey = report.getAppKey();
            if (identifiers != null && appKey != null && !responseHandler(this.backend.sendAnalytic(appKey, identifiers, report), report)) {
                QueueManager.Companion.runIncoming(new ReportService$sendReports$1$1(this));
                return;
            }
        }
        QueueManager.Companion.runIncoming(new AnonymousClass2());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sendSavedReports() {
        if (this.isSending) {
            this.resendWhenFinish = true;
            return;
        }
        List<User> listSortedWith = CollectionsKt.sortedWith(this.stateManager.getAllUsers(), new Comparator() { // from class: com.devtodev.analytics.internal.services.ReportService$sendSavedReports$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t10, T t11) {
                Long sessionId = ((User) t10).getSessionId();
                Long lValueOf = Long.valueOf(sessionId != null ? sessionId.longValue() : Long.MAX_VALUE);
                Long sessionId2 = ((User) t11).getSessionId();
                return a.l(lValueOf, Long.valueOf(sessionId2 != null ? sessionId2.longValue() : Long.MAX_VALUE));
            }
        });
        User activeUser = this.stateManager.getActiveUser();
        String applicationKey = this.stateManager.getActiveProject().getApplicationKey();
        ArrayList arrayList = new ArrayList();
        for (User user : listSortedWith) {
            ReportService reportService = this;
            Identifiers identifiersClearNotActiveUserBackendIds = reportService.clearNotActiveUserBackendIds(this.stateManager.getIdentifiers(user), user.getIdKey(), activeUser.getIdKey());
            List<DbModel> all = reportService.reportsRepository.getAll(Report.Companion.getColumnsTypes());
            Intrinsics.checkNotNull(all, "null cannot be cast to non-null type kotlin.collections.List<com.devtodev.analytics.internal.domain.events.reports.Report>");
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : all) {
                if (((Report) obj).getUserId() == user.getIdKey()) {
                    arrayList2.add(obj);
                }
            }
            if (!arrayList2.isEmpty()) {
                int size = arrayList2.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj2 = arrayList2.get(i10);
                    i10++;
                    Report report = (Report) obj2;
                    report.setAppKey(applicationKey);
                    report.setIdentifiers(identifiersClearNotActiveUserBackendIds);
                }
                arrayList.addAll(arrayList2);
                Logger logger = Logger.INSTANCE;
                String userId = user.getUserId();
                if (userId == null) {
                    userId = "";
                }
                Logger.info$default(logger, "Send buffered events for user [" + userId + "]", null, 2, null);
            }
            this = reportService;
        }
        ReportService reportService2 = this;
        if (arrayList.isEmpty()) {
            return;
        }
        reportService2.isSending = true;
        QueueManager.Companion.runNetwork(reportService2.new C26112(arrayList));
    }

    @NotNull
    public final IBackend getBackend() {
        return this.backend;
    }

    @Override // com.devtodev.analytics.internal.services.IReportService
    @Nullable
    public Function0<Unit> getOnReportSendAction() {
        return this.onReportSendAction;
    }

    @NotNull
    public final IStateManager getStateManager() {
        return this.stateManager;
    }

    @Override // com.devtodev.analytics.internal.services.IReportService
    public void removeAllReports() {
        this.reportsRepository.deleteAll();
    }

    @Override // com.devtodev.analytics.internal.services.IReportService
    public void removeInactiveUsers(@NotNull List<User> users) {
        Intrinsics.checkNotNullParameter(users, "users");
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(users, 10));
        Iterator<T> it = users.iterator();
        while (it.hasNext()) {
            arrayList.add(Long.valueOf(((User) it.next()).getIdKey()));
        }
        List<DbModel> all = this.reportsRepository.getAll(Report.Companion.getColumnsTypes());
        Intrinsics.checkNotNull(all, "null cannot be cast to non-null type kotlin.collections.List<com.devtodev.analytics.internal.domain.events.reports.Report>");
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : all) {
            if (arrayList.contains(Long.valueOf(((Report) obj).getUserId()))) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj2 = arrayList2.get(i10);
            i10++;
            arrayList3.add(new EventParam("_id", new SqlValue.Long(((Report) obj2).getIdKey())));
        }
        if (arrayList3.size() != 0) {
            this.reportsRepository.delete(arrayList2, arrayList3, RemoverPattern.JEST_ONE);
        }
    }

    @Override // com.devtodev.analytics.internal.services.IReportService
    public void sendBufferedEvents() {
        if (this.eventController.isReportSendingEnable()) {
            for (User user : CollectionsKt.sortedWith(this.stateManager.getAllUsers(), new Comparator() { // from class: com.devtodev.analytics.internal.services.ReportService$sendBufferedEvents$$inlined$sortedBy$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t10, T t11) {
                    Long sessionId = ((User) t10).getSessionId();
                    Long lValueOf = Long.valueOf(sessionId != null ? sessionId.longValue() : Long.MAX_VALUE);
                    Long sessionId2 = ((User) t11).getSessionId();
                    return a.l(lValueOf, Long.valueOf(sessionId2 != null ? sessionId2.longValue() : Long.MAX_VALUE));
                }
            })) {
                List<DbModel> all = this.eventRepository.getAll(EventObject.Companion.getColumnsTypes());
                Intrinsics.checkNotNull(all, "null cannot be cast to non-null type kotlin.collections.List<com.devtodev.analytics.internal.domain.EventObject>");
                ArrayList arrayList = new ArrayList();
                for (Object obj : all) {
                    if (((EventObject) obj).getUserId() == user.getIdKey()) {
                        arrayList.add(obj);
                    }
                }
                List<EventObject> listRichEventObjects = this.eventController.richEventObjects(arrayList);
                if (!listRichEventObjects.isEmpty()) {
                    long j10 = 0;
                    String str = null;
                    Report report = new Report(j10, user.getIdKey(), str, collectPackages(listRichEventObjects), null, 21, null);
                    report.setPackagesJson(report.getJson());
                    this.reportsRepository.insert(report);
                    ArrayList arrayList2 = new ArrayList();
                    Iterator<EventObject> it = listRichEventObjects.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(new EventParam("_id", new SqlValue.Long(it.next().getIdKey())));
                    }
                    this.eventRepository.delete(listRichEventObjects, arrayList2, RemoverPattern.JEST_ONE);
                }
            }
            sendSavedReports();
        }
    }

    @Override // com.devtodev.analytics.internal.services.IReportService
    public void sendFlashEvent(@NotNull IEncodable event) {
        Intrinsics.checkNotNullParameter(event, "event");
        Project activeProject = this.stateManager.getActiveProject();
        Identifiers identifiers = this.stateManager.getIdentifiers(this.stateManager.getActiveUser());
        QueueManager.Companion.runFlashQueue(new C26101(new Report(0L, 0L, null, CollectionsKt.listOf(createPackage(CollectionsKt.listOf(event.getJson()))), null, 23, null), this, activeProject, identifiers));
    }

    @Override // com.devtodev.analytics.internal.services.IReportService
    public void setOnReportSendAction(@Nullable Function0<Unit> function0) {
        this.onReportSendAction = function0;
    }
}
