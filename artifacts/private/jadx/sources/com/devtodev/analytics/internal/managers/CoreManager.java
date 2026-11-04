package com.devtodev.analytics.internal.managers;

import com.devtodev.analytics.internal.domain.DbModel;
import com.devtodev.analytics.internal.domain.Project;
import com.devtodev.analytics.internal.domain.User;
import com.devtodev.analytics.internal.storage.EventParam;
import com.devtodev.analytics.internal.storage.IRepository;
import com.devtodev.analytics.internal.storage.sqlite.ProjectEntry;
import com.devtodev.analytics.internal.storage.sqlite.SqlValue;
import com.devtodev.analytics.internal.utils.StringExtentionsKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pj.n;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nCoreManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoreManager.kt\ncom/devtodev/analytics/internal/managers/CoreManager\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,201:1\n288#2,2:202\n766#2:204\n857#2,2:205\n288#2,2:207\n766#2:209\n857#2,2:210\n*S KotlinDebug\n*F\n+ 1 CoreManager.kt\ncom/devtodev/analytics/internal/managers/CoreManager\n*L\n39#1:202,2\n84#1:204\n84#1:205,2\n87#1:207,2\n97#1:209\n97#1:210,2\n*E\n"})
public final class CoreManager implements ICoreService {

    @Nullable
    private n<? super Long, ? super Long, ? super Long, Unit> onSdkConfigUpdate;

    @NotNull
    private final IRepository projectRepository;

    @NotNull
    private final IRepository userRepository;

    @NotNull
    private final String validAppKey;

    @SourceDebugExtension({"SMAP\nCoreManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoreManager.kt\ncom/devtodev/analytics/internal/managers/CoreManager$CoreHelper\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,201:1\n766#2:202\n857#2,2:203\n288#2,2:205\n288#2,2:207\n1#3:209\n*S KotlinDebug\n*F\n+ 1 CoreManager.kt\ncom/devtodev/analytics/internal/managers/CoreManager$CoreHelper\n*L\n129#1:202\n129#1:203,2\n132#1:205,2\n164#1:207,2\n*E\n"})
    public final class CoreHelper implements ICoreHelper {

        @NotNull
        private final User activeUser;

        @NotNull
        private final Project project;

        @NotNull
        private final List<User> projectUsers;
        private final boolean setByDefault;
        final /* synthetic */ CoreManager this$0;

        @NotNull
        private final String userId;

        public CoreHelper(@NotNull CoreManager coreManager, @NotNull String userId, Project project, boolean z10) {
            Object obj;
            Intrinsics.checkNotNullParameter(userId, "userId");
            Intrinsics.checkNotNullParameter(project, "project");
            this.this$0 = coreManager;
            this.userId = userId;
            this.project = project;
            this.setByDefault = z10;
            List<DbModel> all = coreManager.userRepository.getAll(User.Companion.getColumnsTypes());
            Intrinsics.checkNotNull(all, "null cannot be cast to non-null type kotlin.collections.List<com.devtodev.analytics.internal.domain.User>");
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : all) {
                if (((User) obj2).getProjectId() == this.project.getIdKey()) {
                    arrayList.add(obj2);
                }
            }
            this.projectUsers = arrayList;
            int size = arrayList.size();
            int i10 = 0;
            while (true) {
                if (i10 >= size) {
                    obj = null;
                    break;
                }
                obj = arrayList.get(i10);
                i10++;
                long idKey = ((User) obj).getIdKey();
                Long activeUserId = this.project.getActiveUserId();
                if (activeUserId != null && idKey == activeUserId.longValue()) {
                    break;
                }
            }
            User user = (User) obj;
            this.activeUser = user == null ? createNewUser() : user;
        }

        private final User changeUserState() {
            this.activeUser.setPreviousUserId(this.activeUser.getUserId());
            this.activeUser.setUserId(this.userId);
            this.activeUser.setDefaultUser(this.setByDefault);
            this.this$0.userRepository.update(CollectionsKt.listOf(new EventParam("_id", new SqlValue.Long(this.activeUser.getIdKey()))), this.activeUser);
            this.this$0.resetBackendIdentifiers();
            return this.activeUser;
        }

        private final User createNewUser() {
            User user = new User(0L, this.project.getIdKey(), 0, null, this.userId, null, null, null, this.setByDefault, false, false, 1773, null);
            this.this$0.userRepository.insert(user);
            return user;
        }

        private final User getByAccountingType() {
            Object next;
            Iterator<T> it = this.projectUsers.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!Intrinsics.areEqual(((User) next).getUserId(), this.userId));
            User user = (User) next;
            if (user != null) {
                return user;
            }
            if (!this.project.getConfiguration().getUserCounting()) {
                if (!Intrinsics.areEqual(this.activeUser.getUserId(), this.userId)) {
                    changeUserState();
                }
                return this.activeUser;
            }
            if (this.activeUser.isDefaultUser()) {
                changeUserState();
            } else if (!Intrinsics.areEqual(this.activeUser.getUserId(), this.userId)) {
                return createNewUser();
            }
            return this.activeUser;
        }

        @Override // com.devtodev.analytics.internal.managers.ICoreHelper
        @NotNull
        public User activateUser(@NotNull User currentUser, @NotNull Project project) {
            Intrinsics.checkNotNullParameter(currentUser, "currentUser");
            Intrinsics.checkNotNullParameter(project, "project");
            Long activeUserId = project.getActiveUserId();
            long idKey = currentUser.getIdKey();
            if (activeUserId == null || activeUserId.longValue() != idKey) {
                this.this$0.resetBackendIdentifiers();
                project.setActiveUserId(Long.valueOf(currentUser.getIdKey()));
                this.this$0.projectRepository.update(CollectionsKt.listOf(new EventParam(ProjectEntry.applicationKey, new SqlValue.String(project.getApplicationKey()))), project);
            }
            return currentUser;
        }

        @Override // com.devtodev.analytics.internal.managers.ICoreHelper
        @NotNull
        public User defineActiveUser() {
            if (!this.setByDefault) {
                return getByAccountingType();
            }
            if (this.activeUser.isDefaultUser() && !Intrinsics.areEqual(this.activeUser.getUserId(), this.userId)) {
                changeUserState();
            }
            return this.activeUser;
        }

        @Override // com.devtodev.analytics.internal.managers.ICoreHelper
        @NotNull
        public User defineDefaultUser() {
            return this.activeUser.isDefaultUser() ? this.activeUser : getByAccountingType();
        }
    }

    public CoreManager(@NotNull String validAppKey, @NotNull IRepository projectRepository, @NotNull IRepository userRepository) {
        Intrinsics.checkNotNullParameter(validAppKey, "validAppKey");
        Intrinsics.checkNotNullParameter(projectRepository, "projectRepository");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        this.validAppKey = validAppKey;
        this.projectRepository = projectRepository;
        this.userRepository = userRepository;
    }

    @Override // com.devtodev.analytics.internal.managers.ICoreService
    public void checkUnityUserId(@NotNull String userId, @NotNull Project project) {
        Object obj;
        boolean z10;
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(project, "project");
        List<DbModel> all = this.userRepository.getAll(User.Companion.getColumnsTypes());
        Intrinsics.checkNotNull(all, "null cannot be cast to non-null type kotlin.collections.List<com.devtodev.analytics.internal.domain.User>");
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : all) {
            if (((User) obj2).getProjectId() == project.getIdKey()) {
                arrayList.add(obj2);
            }
        }
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (i11 >= size) {
                obj = null;
                break;
            }
            obj = arrayList.get(i11);
            i11++;
            long idKey = ((User) obj).getIdKey();
            Long activeUserId = project.getActiveUserId();
            if (activeUserId != null && idKey == activeUserId.longValue()) {
                break;
            }
        }
        User user = (User) obj;
        if (user == null) {
            return;
        }
        String userId2 = user.getUserId();
        boolean z11 = true;
        if (userId2 == null || !StringExtentionsKt.isInvalidAdvertisingId(userId2)) {
            z10 = false;
        } else {
            user.setUserId(userId);
            z10 = true;
        }
        ArrayList arrayList2 = new ArrayList();
        int size2 = arrayList.size();
        while (i10 < size2) {
            Object obj3 = arrayList.get(i10);
            i10++;
            if (Intrinsics.areEqual(user.getUserId(), ((User) obj3).getUserId())) {
                arrayList2.add(obj3);
            }
        }
        if (arrayList2.size() > 1) {
            return;
        }
        String previousUserId = user.getPreviousUserId();
        if (previousUserId == null || !StringExtentionsKt.isInvalidAdvertisingId(previousUserId)) {
            z11 = z10;
        } else {
            user.setPreviousUserId(null);
        }
        if (z11) {
            this.userRepository.update(CollectionsKt.listOf(new EventParam("_id", new SqlValue.Long(user.getIdKey()))), user);
        }
    }

    @Override // com.devtodev.analytics.internal.managers.ICoreService
    @NotNull
    public User createOrActivateDefaultUser(@NotNull String userId, @NotNull Project project) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(project, "project");
        CoreHelper coreHelper = new CoreHelper(this, userId, project, true);
        return coreHelper.activateUser(coreHelper.defineDefaultUser(), project);
    }

    @Override // com.devtodev.analytics.internal.managers.ICoreService
    @NotNull
    public Project createOrActivateProject() {
        Object next;
        List<DbModel> all = this.projectRepository.getAll(Project.Companion.getColumnsTypes());
        Intrinsics.checkNotNull(all, "null cannot be cast to non-null type kotlin.collections.List<com.devtodev.analytics.internal.domain.Project>");
        Iterator<T> it = all.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!Intrinsics.areEqual(((Project) next).getApplicationKey(), this.validAppKey));
        Project project = (Project) next;
        if (project != null) {
            return project;
        }
        Project project2 = new Project(0L, this.validAppKey, null, false, null, null, null, null, null, false, false, 2045, null);
        this.projectRepository.insert(project2);
        return project2;
    }

    @Override // com.devtodev.analytics.internal.managers.ICoreService
    @NotNull
    public User createOrActivateUser(@NotNull String userId, @NotNull Project project, boolean z10) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(project, "project");
        CoreHelper coreHelper = new CoreHelper(this, userId, project, z10);
        return coreHelper.activateUser(coreHelper.defineActiveUser(), project);
    }

    @NotNull
    public final List<User> getAllUsers() {
        List all = this.userRepository.getAll(User.Companion.getColumnsTypes());
        Intrinsics.checkNotNull(all, "null cannot be cast to non-null type kotlin.collections.List<com.devtodev.analytics.internal.domain.User>");
        return all;
    }

    @Override // com.devtodev.analytics.internal.managers.ICoreService
    @Nullable
    public n<Long, Long, Long, Unit> getOnSdkConfigUpdate() {
        return this.onSdkConfigUpdate;
    }

    @Override // com.devtodev.analytics.internal.managers.ICoreService
    @NotNull
    public User replaceUserId(@NotNull User user, @NotNull String userId) {
        Intrinsics.checkNotNullParameter(user, "user");
        Intrinsics.checkNotNullParameter(userId, "userId");
        user.setPreviousUserId(user.getUserId());
        user.setUserId(userId);
        user.setDefaultUser(false);
        this.userRepository.update(CollectionsKt.listOf(new EventParam("_id", new SqlValue.Long(user.getIdKey()))), user);
        return user;
    }

    @Override // com.devtodev.analytics.internal.managers.ICoreService
    public void resetBackendIdentifiers() {
        n<Long, Long, Long, Unit> onSdkConfigUpdate = getOnSdkConfigUpdate();
        if (onSdkConfigUpdate != null) {
            onSdkConfigUpdate.invoke(null, null, null);
        }
    }

    @Override // com.devtodev.analytics.internal.managers.ICoreService
    public void setOnSdkConfigUpdate(@Nullable n<? super Long, ? super Long, ? super Long, Unit> nVar) {
        this.onSdkConfigUpdate = nVar;
    }
}
