package com.devtodev.core.logic.people;

import com.devtodev.core.data.consts.Gender;
import com.devtodev.core.logic.SDKClient;
import com.devtodev.core.utils.log.CoreLog;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class People {

    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f98299a;

        a(String str) {
            this.f98299a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            People.this.setUserData("phone", this.f98299a);
        }
    }

    class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Gender f98301a;

        b(Gender gender) {
            this.f98301a = gender;
        }

        @Override // java.lang.Runnable
        public void run() {
            People.this.setUserData(p.a.G, this.f98301a);
        }
    }

    class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f98303a;

        c(int i10) {
            this.f98303a = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            People.this.setUserData("age", Integer.valueOf(this.f98303a));
        }
    }

    class d implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f98305a;

        d(boolean z10) {
            this.f98305a = z10;
        }

        @Override // java.lang.Runnable
        public void run() {
            People.this.setUserData("cheater", Boolean.valueOf(this.f98305a));
        }
    }

    class e implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Map f98307a;

        e(People people, Map map) {
            this.f98307a = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            SDKClient.getInstance().getUsersStorages().getDataStorage().getPlayerPreferences().c(this.f98307a);
        }
    }

    class f implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f98308a;

        f(People people, List list) {
            this.f98308a = list;
        }

        @Override // java.lang.Runnable
        public void run() {
            SDKClient.getInstance().getUsersStorages().getDataStorage().getPlayerPreferences().a(this.f98308a);
        }
    }

    class g implements Runnable {
        g(People people) {
        }

        @Override // java.lang.Runnable
        public void run() {
            SDKClient.getInstance().getUsersStorages().getDataStorage().getPlayerPreferences().a();
        }
    }

    class h implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Map f98309a;

        h(People people, Map map) {
            this.f98309a = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            SDKClient.getInstance().getUsersStorages().getDataStorage().getPlayerPreferences().a(this.f98309a);
        }
    }

    class i implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Map f98310a;

        i(People people, Map map) {
            this.f98310a = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            SDKClient.getInstance().getUsersStorages().getDataStorage().getPlayerPreferences().d(this.f98310a);
        }
    }

    class j implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Map f98311a;

        j(People people, Map map) {
            this.f98311a = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            SDKClient.getInstance().getUsersStorages().getDataStorage().getPlayerPreferences().b(this.f98311a);
        }
    }

    class k implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f98312a;

        k(String str) {
            this.f98312a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            People.this.setUserData("name", this.f98312a);
        }
    }

    class l implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f98314a;

        l(String str) {
            this.f98314a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            People.this.setUserData("email", this.f98314a);
        }
    }

    class m implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f98316a;

        m(String str) {
            this.f98316a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            People.this.setUserData(com.facebook.internal.a.f99676i0, this.f98316a);
        }
    }

    private void a(Runnable runnable) {
        SDKClient.getInstance().addToEventQueue(runnable);
    }

    public void append(String str, Object obj) {
        HashMap map = new HashMap();
        map.put(str, obj);
        append(map);
    }

    public void clearUserData() {
        a(new g(this));
    }

    public int getAge() {
        if (a()) {
            try {
                Object objA = SDKClient.getInstance().getUsersStorages().getDataStorage().getPlayerPreferences().a("age");
                if (objA == null) {
                    return 0;
                }
                return ((Integer) objA).intValue();
            } catch (Exception e10) {
                CoreLog.e("DevToDev", "", e10);
            }
        }
        return 0;
    }

    public String getEmail() {
        if (a()) {
            try {
                Object objA = SDKClient.getInstance().getUsersStorages().getDataStorage().getPlayerPreferences().a("email");
                return objA == null ? "" : (String) objA;
            } catch (Exception e10) {
                CoreLog.e("DevToDev", "", e10);
            }
        }
        return "";
    }

    public Gender getGender() {
        if (!a()) {
            return Gender.Unknown;
        }
        try {
            Object objA = SDKClient.getInstance().getUsersStorages().getDataStorage().getPlayerPreferences().a(p.a.G);
            if (objA == null) {
                return Gender.Unknown;
            }
            int iIntValue = ((Integer) objA).intValue();
            if (iIntValue != 0) {
                return iIntValue != 1 ? Gender.Unknown : Gender.Female;
            }
            return Gender.Male;
        } catch (Exception e10) {
            CoreLog.e("DevToDev", "", e10);
            return Gender.Unknown;
        }
    }

    public String getName() {
        if (a()) {
            try {
                Object objA = SDKClient.getInstance().getUsersStorages().getDataStorage().getPlayerPreferences().a("name");
                return objA == null ? "" : (String) objA;
            } catch (Exception e10) {
                CoreLog.e("DevToDev", "", e10);
            }
        }
        return "";
    }

    public String getPhone() {
        if (a()) {
            try {
                Object objA = SDKClient.getInstance().getUsersStorages().getDataStorage().getPlayerPreferences().a("phone");
                return objA == null ? "" : (String) objA;
            } catch (Exception e10) {
                CoreLog.e("DevToDev", "", e10);
            }
        }
        return "";
    }

    public String getPhoto() {
        if (a()) {
            try {
                Object objA = SDKClient.getInstance().getUsersStorages().getDataStorage().getPlayerPreferences().a(com.facebook.internal.a.f99676i0);
                return objA == null ? "" : (String) objA;
            } catch (Exception e10) {
                CoreLog.e("DevToDev", "", e10);
            }
        }
        return "";
    }

    public void increment(String str, Number number) {
        HashMap map = new HashMap();
        map.put(str, number);
        increment(map);
    }

    public boolean isCheater() {
        if (a()) {
            try {
                Object objA = SDKClient.getInstance().getUsersStorages().getDataStorage().getPlayerPreferences().a("cheater");
                if (objA == null) {
                    return false;
                }
                return ((Boolean) objA).booleanValue();
            } catch (Exception e10) {
                CoreLog.e("DevToDev", "", e10);
            }
        }
        return false;
    }

    public void setAge(int i10) {
        a(new c(i10));
    }

    public void setCheater(boolean z10) {
        a(new d(z10));
    }

    public void setEmail(String str) {
        a(new l(str));
    }

    public void setGender(Gender gender) {
        a(new b(gender));
    }

    public void setName(String str) {
        a(new k(str));
    }

    public void setPhone(String str) {
        a(new a(str));
    }

    public void setPhoto(String str) {
        a(new m(str));
    }

    public void setUserData(String str, Object obj) {
        HashMap map = new HashMap();
        map.put(str, obj);
        setUserData(map);
    }

    public void union(String str, Object obj) {
        HashMap map = new HashMap();
        map.put(str, obj);
        union(map);
    }

    public void unsetUserData(String str) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        unsetUserData(arrayList);
    }

    private boolean a() {
        return SDKClient.getInstance().isInitialized();
    }

    public void append(Map<String, Object> map) {
        a(new h(this, map));
    }

    public void increment(Map<String, Number> map) {
        a(new j(this, map));
    }

    public void setUserData(Map<String, Object> map) {
        a(new e(this, map));
    }

    public void union(Map<String, Object> map) {
        a(new i(this, map));
    }

    public void unsetUserData(List<String> list) {
        a(new f(this, list));
    }
}
