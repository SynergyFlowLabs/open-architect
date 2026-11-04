package kb;

import androidx.annotation.m1;
import com.activeandroid.query.Select;
import com.planner5d.library.database.model.SynchronizedModel;
import com.planner5d.library.database.model.i;
import com.planner5d.library.services.r;
import com.planner5d.library.services.utility.k1;
import com.planner5d.library.services.utility.p0;
import java.util.Date;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nManagerHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ManagerHelper.kt\ncom/planner5d/library/database/model/synchronization/ManagerHelper\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,142:1\n1#2:143\n*E\n"})
public final class a<T extends SynchronizedModel> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final p0 f307611a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Class<T> f307612b;

    public a(@NotNull p0 formatter, @NotNull Class<T> modelClass) {
        Intrinsics.checkNotNullParameter(formatter, "formatter");
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        this.f307611a = formatter;
        this.f307612b = modelClass;
    }

    @m1
    private final T a(id.a aVar, long j10) {
        return (T) new Select().from(this.f307612b).where("user_id = ? AND id = ?", Long.valueOf(aVar.f287075a), Long.valueOf(j10)).executeSingle();
    }

    @m1
    private final T b(id.a aVar, String str) {
        if (str == null) {
            return null;
        }
        return (T) new Select().from(this.f307612b).where("user_id = ? AND uid = ?", Long.valueOf(aVar.f287075a), str).executeSingle();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void e(SynchronizedModel synchronizedModel, JSONObject jSONObject) throws JSONException {
        if (synchronizedModel instanceof i) {
            r rVar = r.udate;
            if (jSONObject.has(rVar.f224891a)) {
                ((i) synchronizedModel).q(this.f307611a.g(jSONObject.getString(rVar.f224891a)));
            }
        }
    }

    @m1
    private final T h(id.a aVar, T t10) {
        t10.userId = aVar.f287075a;
        t10.s();
        t10.save();
        return t10;
    }

    @m1
    @NotNull
    public final List<T> c(@NotNull id.a user) {
        Intrinsics.checkNotNullParameter(user, "user");
        List<T> listExecute = new Select().from(this.f307612b).where("user_id = ? AND (uid IS NULL OR modified_locally = 1 OR deleted = 1)", Long.valueOf(user.f287075a)).execute();
        Intrinsics.checkNotNullExpressionValue(listExecute, "execute(...)");
        return listExecute;
    }

    public final void d(@NotNull T model, @NotNull JSONObject data) throws JSONException {
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(data, "data");
        model.w(data);
        model.deleted = k1.a(data, r.deleted);
    }

    @m1
    public final void f(@NotNull id.a user, @NotNull JSONArray list, @NotNull b<T> manager) throws JSONException {
        Intrinsics.checkNotNullParameter(user, "user");
        Intrinsics.checkNotNullParameter(list, "list");
        Intrinsics.checkNotNullParameter(manager, "manager");
        int length = list.length();
        for (int i10 = 0; i10 < length; i10++) {
            JSONObject jSONObject = list.getJSONObject(i10);
            Intrinsics.checkNotNullExpressionValue(jSONObject, "getJSONObject(...)");
            g(user, jSONObject, manager);
        }
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00e1 A[Catch: Exception -> 0x0032, TryCatch #0 {Exception -> 0x0032, blocks: (B:3:0x0013, B:5:0x001e, B:7:0x002c, B:10:0x0035, B:38:0x00d6, B:40:0x00da, B:43:0x00e1, B:44:0x00e7, B:12:0x003b, B:14:0x004e, B:16:0x0054, B:17:0x0057, B:18:0x0065, B:20:0x0083, B:22:0x008a, B:23:0x008f, B:25:0x0093, B:27:0x0097, B:30:0x00ac, B:32:0x00b8, B:34:0x00bb, B:36:0x00bf, B:37:0x00ce), top: B:56:0x0013 }] */
    /* JADX WARN: Multi-variable type inference failed */
    @m1
    @Nullable
    public final T g(@NotNull id.a user, @NotNull JSONObject data, @NotNull b<T> manager) {
        Object element;
        Object obj;
        Object obj2;
        SynchronizedModel synchronizedModel;
        Object obj3;
        Intrinsics.checkNotNullParameter(user, "user");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(manager, "manager");
        try {
            r rVar = r.tmpId;
            if (data.has(rVar.f224891a)) {
                T t10 = (T) a(user, data.getLong(rVar.f224891a));
                if (t10 != null) {
                    t10.w(data);
                }
                e(t10, data);
                obj3 = t10;
            } else {
                element = (T) this.f307612b.newInstance();
                if (!data.has(r.synchronizedKey.f224891a)) {
                    Intrinsics.checkNotNullExpressionValue(element, "element");
                    manager.d(user, (SynchronizedModel) element, data);
                    Intrinsics.checkNotNull(element);
                    SynchronizedModel synchronizedModelB = b(user, ((SynchronizedModel) element).uid);
                    if (synchronizedModelB != 0) {
                        if (((SynchronizedModel) element).deleted) {
                            obj3 = element;
                            synchronizedModelB.delete();
                            obj3 = element;
                        } else {
                            if ((element instanceof i) && (synchronizedModelB instanceof i)) {
                                Date dateK = ((i) element).k();
                                Date dateK2 = ((i) synchronizedModelB).k();
                                if (dateK != null && dateK2 != null && dateK.getTime() == dateK2.getTime()) {
                                    return (T) element;
                                }
                            }
                            obj3 = element;
                            obj3 = element;
                            obj3 = element;
                            if (synchronizedModelB.modifiedLocally) {
                                ((SynchronizedModel) element).deleted = synchronizedModelB.deleted;
                                obj = element;
                                obj2 = synchronizedModelB;
                            } else {
                                Unit unit = Unit.f312394a;
                                manager.d(user, synchronizedModelB, data);
                                obj3 = (T) synchronizedModelB;
                            }
                        }
                    }
                    synchronizedModel = (SynchronizedModel) obj2;
                    if (synchronizedModel != null && !synchronizedModel.deleted) {
                        if (obj != null) {
                            manager.c(synchronizedModel, (SynchronizedModel) obj);
                        }
                        manager.p(synchronizedModel, data);
                        return (T) h(user, synchronizedModel);
                    }
                    return null;
                }
                T t11 = (SynchronizedModel) element;
                if (t11 != null) {
                    t11.w(data);
                }
                T t12 = (T) b(user, ((SynchronizedModel) element).uid);
                e(t12, data);
                obj3 = t12;
            }
            obj3 = element;
            obj = null;
            obj2 = obj3;
            synchronizedModel = (SynchronizedModel) obj2;
            if (synchronizedModel != null) {
                if (obj != null) {
                    manager.c(synchronizedModel, (SynchronizedModel) obj);
                }
                manager.p(synchronizedModel, data);
                return (T) h(user, synchronizedModel);
            }
        } catch (Exception e10) {
            if (!(e10 instanceof InstantiationException) && !(e10 instanceof IllegalAccessException) && !(e10 instanceof JSONException)) {
                throw e10;
            }
            timber.log.b.f381052a.e(e10);
        }
        return null;
    }

    @NotNull
    public final JSONObject i(@NotNull T model) throws JSONException {
        Intrinsics.checkNotNullParameter(model, "model");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(model.v(), model.uid);
        if (model.uid == null) {
            jSONObject.put(model.u(), model.getId());
        }
        return jSONObject;
    }
}
