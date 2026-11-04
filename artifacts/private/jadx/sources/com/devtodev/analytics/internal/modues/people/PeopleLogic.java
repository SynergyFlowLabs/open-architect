package com.devtodev.analytics.internal.modues.people;

import com.devtodev.analytics.internal.core.IServicesFactory;
import com.devtodev.analytics.internal.domain.events.people.CheaterMark;
import com.devtodev.analytics.internal.domain.events.people.People;
import com.devtodev.analytics.internal.domain.events.people.PeopleParameter;
import com.devtodev.analytics.internal.domain.events.people.PeopleParameterBoolean;
import com.devtodev.analytics.internal.domain.events.people.TesterMark;
import com.devtodev.analytics.internal.logger.Logger;
import com.devtodev.analytics.internal.services.IActivityService;
import com.devtodev.analytics.internal.services.IEventsService;
import com.devtodev.analytics.internal.services.IPeopleService;
import com.devtodev.analytics.internal.services.IProjectService;
import com.devtodev.analytics.internal.services.IReportService;
import com.devtodev.analytics.internal.services.IUserService;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.g0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nPeopleLogic.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PeopleLogic.kt\ncom/devtodev/analytics/internal/modues/people/PeopleLogic\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,146:1\n288#2,2:147\n288#2,2:149\n*S KotlinDebug\n*F\n+ 1 PeopleLogic.kt\ncom/devtodev/analytics/internal/modues/people/PeopleLogic\n*L\n72#1:147,2\n77#1:149,2\n*E\n"})
public final class PeopleLogic implements IPeopleLogic {

    @NotNull
    private final IActivityService activityService;

    @NotNull
    private final IEventsService eventsService;

    @NotNull
    private final IPeopleService peopleService;

    @NotNull
    private final IProjectService projectService;

    @NotNull
    private final IReportService reportService;

    @NotNull
    private final IUserService userService;

    /* JADX INFO: renamed from: com.devtodev.analytics.internal.modues.people.PeopleLogic$prepareCallBacks$1, reason: invalid class name */
    public /* synthetic */ class AnonymousClass1 extends g0 implements Function1<Boolean, Unit> {
        public AnonymousClass1(Object obj) {
            super(1, obj, PeopleLogic.class, "generatePeopleEvent", "generatePeopleEvent(Z)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke(bool.booleanValue());
            return Unit.f312394a;
        }

        public final void invoke(boolean z10) {
            ((PeopleLogic) this.receiver).generatePeopleEvent(z10);
        }
    }

    public PeopleLogic(@NotNull IServicesFactory serviceFactory) {
        Intrinsics.checkNotNullParameter(serviceFactory, "serviceFactory");
        this.activityService = serviceFactory.getActivityService();
        this.userService = serviceFactory.getUserService();
        this.peopleService = serviceFactory.getPeopleService();
        this.eventsService = serviceFactory.getEventsService();
        this.reportService = serviceFactory.getReportService();
        this.projectService = serviceFactory.getProjectService();
    }

    private final void generateCheaterEvent(boolean z10) {
        int userLevel = this.userService.getUserLevel();
        Long sessionId = this.activityService.getSessionId();
        if (sessionId == null) {
            int i10 = 6 << 2;
            Logger.error$default(Logger.INSTANCE, "Failed to generate cheater event, sessionId is lost", null, 2, null);
        } else {
            this.eventsService.addEvent(new CheaterMark(sessionId.longValue(), userLevel, z10));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void generatePeopleEvent(boolean z10) {
        Long sessionId;
        Map<String, PeopleParameter> parameters;
        if (this.projectService.getTrackingAvailable()) {
            if ((this.peopleService.isNeedToSend() || z10) && (sessionId = this.activityService.getSessionId()) != null) {
                long jLongValue = sessionId.longValue();
                int userLevel = this.userService.getUserLevel();
                if (this.peopleService.isNeedToClear()) {
                    parameters = null;
                } else {
                    parameters = this.peopleService.getParameters(z10);
                    this.peopleService.clearChangedKeys();
                    if (parameters.isEmpty()) {
                        return;
                    }
                }
                this.eventsService.addEvent(new People(userLevel, jLongValue, parameters, this.userService.getInProgressData()));
                this.peopleService.removeNulls();
                this.peopleService.unmarkUpdated();
                this.peopleService.unmarkCleared();
            }
        }
    }

    private final void generateTesterEvent(boolean z10) {
        int userLevel = this.userService.getUserLevel();
        Long sessionId = this.activityService.getSessionId();
        if (sessionId == null) {
            Logger.error$default(Logger.INSTANCE, "Failed to generate tester event, sessionId is lost", null, 2, null);
        } else {
            this.eventsService.addEvent(new TesterMark(sessionId.longValue(), userLevel, z10));
        }
    }

    @Override // com.devtodev.analytics.internal.modues.people.IPeopleLogic
    public void clearUser() {
        this.peopleService.clearUser();
    }

    @Override // com.devtodev.analytics.internal.modues.people.IPeopleLogic
    public void getValue(@NotNull String key, @NotNull Function1<? super PeopleParameter, Unit> completionHandler) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(completionHandler, "completionHandler");
        if (Intrinsics.areEqual(key, PeopleReservedKeys.Cheater.getValue())) {
            completionHandler.invoke(null);
        } else if (Intrinsics.areEqual(key, PeopleReservedKeys.Tester.getValue())) {
            completionHandler.invoke(null);
        } else {
            this.peopleService.getValue(key, completionHandler);
        }
    }

    @Override // com.devtodev.analytics.internal.modues.people.IPeopleLogic
    public void increment(@NotNull String key, @NotNull PeopleParameter value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        this.peopleService.increment(key, value);
    }

    @Override // com.devtodev.analytics.internal.modues.people.IPeopleLogic
    public void prepareCallBacks() {
        this.peopleService.setOnGeneratePeopleEvent(new AnonymousClass1(this));
    }

    @Override // com.devtodev.analytics.internal.modues.people.IPeopleLogic
    public void setValue(@NotNull String key, @NotNull PeopleParameter value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        if (Intrinsics.areEqual(key, PeopleReservedKeys.Cheater.getValue())) {
            generateCheaterEvent(((PeopleParameterBoolean) value).getValue());
            this.reportService.sendBufferedEvents();
        } else {
            if (Intrinsics.areEqual(key, PeopleReservedKeys.Tester.getValue())) {
                generateTesterEvent(((PeopleParameterBoolean) value).getValue());
                this.reportService.sendBufferedEvents();
                return;
            }
            this.peopleService.setValue(key, value);
            if (this.peopleService.getCustomKeyParamsCount() > this.projectService.getUserCardKeysCount()) {
                this.peopleService.sendPeopleCard();
                this.peopleService.clearCustomParams();
            }
        }
    }

    @Override // com.devtodev.analytics.internal.modues.people.IPeopleLogic
    public void unset(@NotNull List<String> properties) {
        Object obj;
        Object obj2;
        boolean z10;
        Intrinsics.checkNotNullParameter(properties, "properties");
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(properties);
        int size = arrayList.size();
        int i10 = 0;
        do {
            obj = null;
            if (i10 >= size) {
                obj2 = null;
                break;
            } else {
                obj2 = arrayList.get(i10);
                i10++;
            }
        } while (!Intrinsics.areEqual((String) obj2, PeopleReservedKeys.Cheater.getValue()));
        String str = (String) obj2;
        boolean z11 = true;
        if (str != null) {
            generateCheaterEvent(false);
            arrayList.remove(str);
            z10 = true;
        } else {
            z10 = false;
        }
        int size2 = arrayList.size();
        int i11 = 0;
        while (i11 < size2) {
            Object obj3 = arrayList.get(i11);
            i11++;
            if (Intrinsics.areEqual((String) obj3, PeopleReservedKeys.Tester.getValue())) {
                obj = obj3;
                break;
            }
        }
        String str2 = (String) obj;
        if (str2 != null) {
            generateTesterEvent(false);
            arrayList.remove(str2);
        } else {
            z11 = z10;
        }
        if (z11) {
            this.reportService.sendBufferedEvents();
        }
        this.peopleService.unset(properties);
    }
}
