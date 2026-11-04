package com.google.gson.internal.bind;

import com.google.gson.b0;
import com.google.gson.c0;
import java.io.IOException;
import java.lang.Enum;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
class d<T extends Enum<T>> extends b0<T> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final c0 f125334d = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<String, T> f125335a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<String, T> f125336b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map<T, String> f125337c;

    class a implements c0 {
        a() {
        }

        @Override // com.google.gson.c0
        public <T> b0<T> create(com.google.gson.f fVar, com.google.gson.reflect.a<T> aVar) {
            Class<? super T> rawType = aVar.getRawType();
            a aVar2 = null;
            if (!Enum.class.isAssignableFrom(rawType) || rawType == Enum.class) {
                return null;
            }
            if (!rawType.isEnum()) {
                rawType = rawType.getSuperclass();
            }
            return new d(rawType, aVar2);
        }
    }

    /* synthetic */ d(Class cls, a aVar) {
        this(cls);
    }

    @Override // com.google.gson.b0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public T read(com.google.gson.stream.a aVar) throws IOException {
        if (aVar.x() == com.google.gson.stream.c.NULL) {
            aVar.a7();
            return null;
        }
        String strJc = aVar.jc();
        T t10 = this.f125335a.get(strJc);
        return t10 == null ? this.f125336b.get(strJc) : t10;
    }

    @Override // com.google.gson.b0
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void write(com.google.gson.stream.d dVar, T t10) throws IOException {
        String str;
        if (t10 == null) {
            str = null;
            int i10 = 3 | 0;
        } else {
            str = this.f125337c.get(t10);
        }
        dVar.w0(str);
    }

    private d(Class<T> cls) {
        this.f125335a = new HashMap();
        this.f125336b = new HashMap();
        this.f125337c = new HashMap();
        try {
            Field[] declaredFields = cls.getDeclaredFields();
            int i10 = 0;
            for (Field field : declaredFields) {
                if (field.isEnumConstant()) {
                    declaredFields[i10] = field;
                    i10++;
                }
            }
            Field[] fieldArr = (Field[]) Arrays.copyOf(declaredFields, i10);
            AccessibleObject.setAccessible(fieldArr, true);
            for (Field field2 : fieldArr) {
                Enum r10 = (Enum) field2.get(null);
                String strName = r10.name();
                String string = r10.toString();
                com.google.gson.annotations.c cVar = (com.google.gson.annotations.c) field2.getAnnotation(com.google.gson.annotations.c.class);
                if (cVar != null) {
                    strName = cVar.value();
                    for (String str : cVar.alternate()) {
                        this.f125335a.put(str, (T) r10);
                    }
                }
                this.f125335a.put(strName, (T) r10);
                this.f125336b.put(string, (T) r10);
                this.f125337c.put((T) r10, strName);
            }
        } catch (IllegalAccessException e10) {
            throw new AssertionError(e10);
        }
    }
}
