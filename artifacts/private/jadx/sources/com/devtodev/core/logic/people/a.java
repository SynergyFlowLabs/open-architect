package com.devtodev.core.logic.people;

import com.devtodev.core.data.consts.Gender;
import com.devtodev.core.data.metrics.aggregated.a.b;
import com.devtodev.core.logic.SDKClient;
import com.devtodev.core.utils.log.CoreLog;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes3.dex */
public class a implements Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String[] f98318c = {"name", "email", "phone", com.facebook.internal.a.f99676i0, "age", p.a.G, "cheater"};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Object[] f98319d = {"", "", "", "", 0, Gender.Unknown, Boolean.FALSE};
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ConcurrentHashMap<String, Object> f98320a = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private CopyOnWriteArrayList<String> f98321b = new CopyOnWriteArrayList<>();

    Object a(String str) {
        return this.f98320a.get(str);
    }

    void b(Map<String, Number> map) {
        int i10 = 0;
        for (Map.Entry<String, Number> entry : map.entrySet()) {
            String key = entry.getKey();
            if (b(key)) {
                Number value = entry.getValue();
                if (value == null) {
                    CoreLog.i("DevToDev", "Increment value can't be null");
                } else {
                    Object obj = this.f98320a.get(key);
                    if (obj == null) {
                        obj = 0;
                    } else if (!(obj instanceof Number)) {
                        CoreLog.i("DevToDev", "The property value you want to increment is not a Number.");
                    }
                    Object objA = a(obj, value);
                    this.f98320a.put(key, objA);
                    this.f98321b.add(key);
                    i10++;
                    CoreLog.d("DevToDev", "\tnew value '" + key + "' is " + objA);
                }
            }
        }
        if (i10 > 0) {
            CoreLog.i("DevToDev", "User data was successfully incremented");
        }
    }

    public boolean c() {
        return this.f98321b.size() > 0;
    }

    void d(Map<String, Object> map) {
        if (map != null) {
            boolean z10 = false;
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                if (!key.isEmpty() && !c(key)) {
                    Object obj = this.f98320a.get(key);
                    if (obj == null) {
                        if (value instanceof Collection) {
                            this.f98320a.put(key, value);
                        } else {
                            this.f98320a.put(key, new ArrayList(Collections.singletonList(value)));
                        }
                        this.f98321b.add(key);
                    } else if (!(obj instanceof Collection)) {
                        CoreLog.i("DevToDev", "Type mismatch. The value of property to union with must be Collection.");
                    } else if (value instanceof Collection) {
                        for (Object obj2 : (Collection) value) {
                            Collection collection = (Collection) obj;
                            if (!collection.contains(obj2)) {
                                collection.add(obj2);
                                this.f98321b.add(key);
                                z10 = true;
                            }
                        }
                    } else {
                        Collection collection2 = (Collection) obj;
                        if (!collection2.contains(value)) {
                            collection2.add(value);
                            this.f98321b.add(key);
                        }
                    }
                    z10 = true;
                }
            }
            if (z10) {
                CoreLog.i("DevToDev", "User data was union successfully");
            }
        }
    }

    void a(List<String> list) {
        boolean z10 = false;
        boolean z11 = true;
        for (String str : list) {
            if (b(str)) {
                this.f98320a.remove(str);
                this.f98321b.add(str);
                z10 = true;
            }
        }
        if (z10) {
            CoreLog.i("DevToDev", "User data was successfully removed from user profile");
        }
    }

    void c(Map<String, Object> map) {
        boolean z10 = false;
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (b(key) && a(key, value) && !c(key)) {
                if (value instanceof Gender) {
                    this.f98320a.put(key, Integer.valueOf(((Gender) value).getReasonCode()));
                } else {
                    this.f98320a.put(key, value);
                }
                this.f98321b.add(key);
                CoreLog.d("DevToDev", "\tSet '" + key + "' with value '" + value + "'");
                z10 = true;
            }
        }
        if (z10) {
            CoreLog.i("DevToDev", "User data was set successfully");
        }
    }

    void a() {
        Object obj = this.f98320a.get("cheater");
        SDKClient.getInstance().addMetric(new b(null));
        this.f98320a.clear();
        this.f98321b.clear();
        if (obj != null) {
            this.f98320a.put("cheater", obj);
            this.f98321b.add("cheater");
            SDKClient.getInstance().addMetric(b());
        }
        CoreLog.i("DevToDev", "All user data was successfully cleared");
    }

    private boolean c(String str) {
        if (!SDKClient.getInstance().getNetworkStorage().isProfileKeyExcluded(str)) {
            return false;
        }
        CoreLog.i("DevToDev", "Key '" + str + "' was ignored");
        return true;
    }

    public void a(Map<String, Object> map) {
        boolean z10 = false;
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (b(key) && !c(key)) {
                Object arrayList = this.f98320a.get(key);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    this.f98320a.put(key, arrayList);
                }
                if (!(arrayList instanceof Collection)) {
                    CoreLog.i("DevToDev", "Type mismatch. The value of property to append with must be Collection.");
                } else {
                    try {
                        if (value instanceof Collection) {
                            ((Collection) arrayList).addAll((Collection) value);
                        } else {
                            ((Collection) arrayList).add(value);
                        }
                    } catch (Exception e10) {
                        CoreLog.e("DevToDev", "", e10);
                    }
                    this.f98321b.add(key);
                    z10 = true;
                }
            }
        }
        if (z10) {
            CoreLog.i("DevToDev", "User data was appended successfully");
        }
    }

    public b b() {
        if (this.f98321b.size() <= 0) {
            return null;
        }
        HashMap map = new HashMap();
        for (String str : this.f98321b) {
            map.put(str, this.f98320a.get(str) == null ? "[devtodev_null]" : this.f98320a.get(str));
        }
        b bVar = new b(map);
        this.f98321b.clear();
        return bVar;
    }

    private boolean b(String str) {
        if (str.length() != 0) {
            return true;
        }
        CoreLog.i("DevToDev", "Key can't be empty");
        return false;
    }

    public Object a(Object obj, Object obj2) {
        if ((obj instanceof Number) && (obj2 instanceof Number)) {
            if (!(obj instanceof Double) && !(obj2 instanceof Double)) {
                if (!(obj instanceof Float) && !(obj2 instanceof Float)) {
                    if (!(obj instanceof Long) && !(obj2 instanceof Long)) {
                        return Integer.valueOf(((Number) obj).intValue() + ((Number) obj2).intValue());
                    }
                    return Long.valueOf(((Number) obj).longValue() + ((Number) obj2).longValue());
                }
                return Float.valueOf(((Number) obj).floatValue() + ((Number) obj2).floatValue());
            }
            return Double.valueOf(((Number) obj).doubleValue() + ((Number) obj2).doubleValue());
        }
        CoreLog.e("DevToDev", "invalid operands for mathematical operator [+]");
        return obj;
    }

    private boolean a(String str, Object obj) {
        int i10 = 0;
        while (true) {
            String[] strArr = f98318c;
            if (i10 >= strArr.length) {
                return true;
            }
            if (strArr[i10].equalsIgnoreCase(str) && !a(obj, i10)) {
                CoreLog.i("DevToDev", "Key '" + str + "' must be a '" + f98319d[i10].getClass().getSimpleName() + "' type");
                return false;
            }
            i10++;
        }
    }

    private boolean a(Object obj, int i10) {
        switch (i10) {
            case 0:
            case 1:
            case 2:
            case 3:
                return obj instanceof String;
            case 4:
                return obj instanceof Integer;
            case 5:
                return obj instanceof Gender;
            case 6:
                return obj instanceof Boolean;
            default:
                return true;
        }
    }
}
