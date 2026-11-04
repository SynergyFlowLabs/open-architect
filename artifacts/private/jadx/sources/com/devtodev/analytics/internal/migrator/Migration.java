package com.devtodev.analytics.internal.migrator;

import android.content.Context;
import android.content.SharedPreferences;
import com.devtodev.analytics.internal.core.ICoreFactory;
import com.devtodev.analytics.internal.domain.DbModel;
import com.devtodev.analytics.internal.domain.DevToDevUuid;
import com.devtodev.analytics.internal.domain.Project;
import com.devtodev.analytics.internal.domain.User;
import com.devtodev.analytics.internal.domain.events.correncyPayment.PaymentMark;
import com.devtodev.analytics.internal.domain.events.people.PeopleCard;
import com.devtodev.analytics.internal.domain.events.people.PeopleCardKt;
import com.devtodev.analytics.internal.domain.events.people.PeopleParameter;
import com.devtodev.analytics.internal.domain.events.tutorial.TutorialMark;
import com.devtodev.analytics.internal.logger.Logger;
import com.devtodev.analytics.internal.storage.EventParam;
import com.devtodev.analytics.internal.storage.IRepository;
import com.devtodev.analytics.internal.storage.sqlite.ProjectEntry;
import com.devtodev.analytics.internal.storage.sqlite.SqlValue;
import com.devtodev.analytics.internal.utils.JsonPretty;
import com.devtodev.core.logic.UsersStorages;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p.a;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nMigration.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Migration.kt\ncom/devtodev/analytics/internal/migrator/Migration\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,230:1\n766#2:231\n857#2,2:232\n288#2,2:235\n1#3:234\n*S KotlinDebug\n*F\n+ 1 Migration.kt\ncom/devtodev/analytics/internal/migrator/Migration\n*L\n44#1:231\n44#1:232,2\n128#1:235,2\n*E\n"})
public final class Migration implements IMigration {

    @NotNull
    private final Context context;

    @NotNull
    private final ICoreFactory coreFactory;

    @NotNull
    private final String gender;

    @NotNull
    private final String key;

    @NotNull
    private final String prefsName;

    @NotNull
    private final String storage;

    public Migration(@NotNull String key, @NotNull ICoreFactory coreFactory, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(coreFactory, "coreFactory");
        Intrinsics.checkNotNullParameter(context, "context");
        this.key = key;
        this.coreFactory = coreFactory;
        this.context = context;
        this.storage = UsersStorages.NAME;
        this.prefsName = "MyPrefsFile";
        this.gender = a.G;
    }

    private final User createUser(long j10, int i10, String str) {
        String str2;
        Object next;
        List<DbModel> all = this.coreFactory.getUserStorage().getAll(User.Companion.getColumnsTypes());
        Intrinsics.checkNotNull(all, "null cannot be cast to non-null type kotlin.collections.List<com.devtodev.analytics.internal.domain.User>");
        Iterator<T> it = all.iterator();
        while (true) {
            if (!it.hasNext()) {
                str2 = str;
                next = null;
                break;
            }
            next = it.next();
            User user = (User) next;
            if (user.getProjectId() == j10) {
                str2 = str;
                if (Intrinsics.areEqual(user.getUserId(), str2)) {
                    break;
                }
            }
        }
        User user2 = (User) next;
        if (user2 != null) {
            return user2;
        }
        User user3 = new User(0L, j10, i10, null, str2, null, null, null, false, false, false, 1769, null);
        this.coreFactory.getUserStorage().insert(user3);
        return user3;
    }

    private final String defineGender(int i10) {
        if (i10 != 1) {
            return i10 != 2 ? com.facebook.internal.a.f99697t : "Female";
        }
        return "Male";
    }

    private final JSONObject hasJson(JSONObject jSONObject, String str) {
        if (jSONObject.isNull(str)) {
            return null;
        }
        return jSONObject;
    }

    private final String loadCustomUUIDStorage() {
        try {
            return IOUtils.loadUDIDLocally(this.context);
        } catch (Exception unused) {
            return null;
        }
    }

    private final JSONObject loadNativeStorage() {
        IOUtils iOUtils = new IOUtils(this.key, this.context);
        Object objLoadStorage = iOUtils.loadStorage(this.storage, true);
        if (objLoadStorage == null) {
            return new JSONObject();
        }
        JSONObject jSONObjectExtractDataInJson = iOUtils.extractDataInJson(objLoadStorage);
        Intrinsics.checkNotNullExpressionValue(jSONObjectExtractDataInJson, "ioUtils.extractDataInJson(sdk1Base)");
        return jSONObjectExtractDataInJson;
    }

    private final String loadUnityStorage(String str, Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(this.prefsName, 0);
        String string = sharedPreferences != null ? sharedPreferences.getString(str, "") : null;
        return (Intrinsics.areEqual(string, "") || string == null) ? "{}" : string;
    }

    private final void migratePeopleCard(long j10, JSONObject jSONObject) throws JSONException {
        JSONArray jSONArray = new JSONArray();
        Iterator<String> itKeys = jSONObject.keys();
        Intrinsics.checkNotNullExpressionValue(itKeys, "peopleCard.keys()");
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            JSONObject jSONObject2 = new JSONObject();
            if (Intrinsics.areEqual(next, this.gender)) {
                jSONObject2.accumulate(next, defineGender(jSONObject.getInt(next)));
            } else {
                jSONObject2.accumulate(next, jSONObject.get(next));
            }
            jSONArray.put(jSONObject2);
        }
        String string = jSONArray.toString();
        Intrinsics.checkNotNullExpressionValue(string, "peopleCardArr.toString()");
        Map<String, PeopleParameter> mapFromJson = PeopleCardKt.fromJson(string);
        String string2 = jSONArray.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString()");
        this.coreFactory.getPeopleCardRepository().insert(new PeopleCard(1L, j10, string2, mapFromJson, null, true, false, 80, null));
    }

    private final void migrateRealPayment(long j10, JSONArray jSONArray) throws JSONException {
        int length = jSONArray.length();
        int i10 = 0;
        while (i10 < length) {
            String string = jSONArray.getString(i10);
            Intrinsics.checkNotNullExpressionValue(string, "transactionIds.getString(i)");
            long j11 = j10;
            this.coreFactory.getPaymentMarkRepository().insert(new PaymentMark(0L, j11, string, 1, null));
            i10++;
            j10 = j11;
        }
    }

    private final void migrateTutorial(long j10, JSONArray jSONArray) {
        int length = jSONArray.length();
        int i10 = 0;
        while (i10 < length) {
            long j11 = j10;
            this.coreFactory.getTutorialMarkRepository().insert(new TutorialMark(0L, j11, jSONArray.getInt(i10), 1, null));
            i10++;
            j10 = j11;
        }
    }

    private final void updateCustomUUID(String str) {
        IRepository devToDevUuidRepository = this.coreFactory.getDevToDevUuidRepository();
        List<DbModel> all = devToDevUuidRepository.getAll(DevToDevUuid.Companion.getColumnsTypes());
        Intrinsics.checkNotNull(all, "null cannot be cast to non-null type kotlin.collections.List<com.devtodev.analytics.internal.domain.DevToDevUuid>");
        DevToDevUuid devToDevUuid = (DevToDevUuid) CollectionsKt.firstOrNull((List) all);
        DevToDevUuid devToDevUuid2 = new DevToDevUuid(0L, str, 1, null);
        if (devToDevUuid == null) {
            devToDevUuidRepository.insert(devToDevUuid2);
            Logger.debug$default(Logger.INSTANCE, "[Migration] CustomUUID:" + str + " is insert", null, 2, null);
            return;
        }
        devToDevUuidRepository.update(CollectionsKt.listOf(new EventParam("_id", new SqlValue.Long(devToDevUuid.getIdKey()))), devToDevUuid2);
        Logger.debug$default(Logger.INSTANCE, "[Migration] CustomUUID:" + str + " is update", null, 2, null);
    }

    private final void updateProject(Project project, User user, Boolean bool) {
        project.setActiveUserId(Long.valueOf(user.getIdKey()));
        project.setMigrated(true);
        if (bool != null) {
            project.setTrackingAvailable(bool.booleanValue());
        }
        this.coreFactory.getProjectRepository().update(CollectionsKt.listOf(new EventParam(ProjectEntry.applicationKey, new SqlValue.String(project.getApplicationKey()))), project);
    }

    @Override // com.devtodev.analytics.internal.migrator.IMigration
    public void migrateData(@NotNull Project activeProject) {
        Intrinsics.checkNotNullParameter(activeProject, "activeProject");
        try {
            if (activeProject.isMigrated()) {
                return;
            }
            JSONObject jSONObject = new JSONObject(loadUnityStorage(this.key, this.context));
            if (jSONObject.length() == 0) {
                jSONObject = loadNativeStorage();
            }
            if (jSONObject.length() == 0) {
                return;
            }
            List<DbModel> all = this.coreFactory.getUserStorage().getAll(User.Companion.getColumnsTypes());
            Intrinsics.checkNotNull(all, "null cannot be cast to non-null type kotlin.collections.List<com.devtodev.analytics.internal.domain.User>");
            ArrayList arrayList = new ArrayList();
            for (Object obj : all) {
                if (((User) obj).getProjectId() == activeProject.getIdKey()) {
                    arrayList.add(obj);
                }
            }
            if (arrayList.isEmpty()) {
                String strLoadCustomUUIDStorage = loadCustomUUIDStorage();
                if (strLoadCustomUUIDStorage != null) {
                    updateCustomUUID(strLoadCustomUUIDStorage);
                } else {
                    JSONObject jSONObjectHasJson = hasJson(jSONObject, "deviceId");
                    String string = jSONObjectHasJson != null ? jSONObjectHasJson.getString("deviceId") : null;
                    if (string != null) {
                        updateCustomUUID(string);
                        strLoadCustomUUIDStorage = string;
                    }
                }
                JSONObject jSONObjectHasJson2 = hasJson(jSONObject, "level");
                Integer numValueOf = jSONObjectHasJson2 != null ? Integer.valueOf(jSONObjectHasJson2.getInt("level")) : null;
                JSONObject jSONObjectHasJson3 = hasJson(jSONObject, "userId");
                String string2 = jSONObjectHasJson3 != null ? jSONObjectHasJson3.getString("userId") : null;
                JSONObject jSONObjectHasJson4 = hasJson(jSONObject, ProjectEntry.trackingAvailable);
                Boolean boolValueOf = jSONObjectHasJson4 != null ? Boolean.valueOf(jSONObjectHasJson4.getBoolean(ProjectEntry.trackingAvailable)) : null;
                JSONObject jSONObjectHasJson5 = hasJson(jSONObject, "tutorCompletedSteps");
                JSONArray jSONArray = jSONObjectHasJson5 != null ? jSONObjectHasJson5.getJSONArray("tutorCompletedSteps") : null;
                JSONObject jSONObjectHasJson6 = hasJson(jSONObject, "userCard");
                JSONObject jSONObject2 = jSONObjectHasJson6 != null ? jSONObjectHasJson6.getJSONObject("userCard") : null;
                JSONObject jSONObjectHasJson7 = hasJson(jSONObject, "transactionIds");
                JSONArray jSONArray2 = jSONObjectHasJson7 != null ? jSONObjectHasJson7.getJSONArray("transactionIds") : null;
                if (numValueOf == null) {
                    Logger.error$default(Logger.INSTANCE, "Migration failed: level not found", null, 2, null);
                    return;
                }
                if (string2 != null) {
                    strLoadCustomUUIDStorage = string2;
                }
                if (strLoadCustomUUIDStorage == null) {
                    Logger.error$default(Logger.INSTANCE, "Migration failed: userId not found", null, 2, null);
                    return;
                }
                User userCreateUser = createUser(activeProject.getIdKey(), numValueOf.intValue(), strLoadCustomUUIDStorage);
                if (jSONArray2 != null) {
                    migrateRealPayment(activeProject.getIdKey(), jSONArray2);
                }
                if (jSONArray != null) {
                    migrateTutorial(userCreateUser.getIdKey(), jSONArray);
                }
                if (jSONObject2 != null) {
                    migratePeopleCard(userCreateUser.getIdKey(), jSONObject2);
                }
                updateProject(activeProject, userCreateUser, boolValueOf);
                Logger logger = Logger.INSTANCE;
                JsonPretty jsonPretty = JsonPretty.INSTANCE;
                String string3 = jSONObject.toString();
                Intrinsics.checkNotNullExpressionValue(string3, "jsonData.toString()");
                logger.debug("Completely migrate data with data: \n\t" + jsonPretty.toPrettyJson(string3), null);
            }
        } catch (Exception e10) {
            Logger.INSTANCE.error("[Migration]", e10);
        }
    }

    public final void resetMigration$DTDAnalytics_androidRelease(@NotNull Project activeProject) {
        Intrinsics.checkNotNullParameter(activeProject, "activeProject");
        activeProject.setMigrated(false);
        this.coreFactory.getProjectRepository().update(CollectionsKt.listOf(new EventParam(ProjectEntry.applicationKey, new SqlValue.String(activeProject.getApplicationKey()))), activeProject);
    }
}
