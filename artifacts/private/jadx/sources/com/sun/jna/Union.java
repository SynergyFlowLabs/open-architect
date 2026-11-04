package com.sun.jna;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public abstract class Union extends Structure {
    private Structure.StructField activeField;

    protected Union() {
    }

    private Structure.StructField findField(Class<?> cls) {
        ensureAllocated();
        for (Structure.StructField structField : fields().values()) {
            if (structField.type.isAssignableFrom(cls)) {
                return structField;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.sun.jna.Structure
    public List<String> getFieldOrder() {
        List<Field> fieldList = getFieldList();
        ArrayList arrayList = new ArrayList(fieldList.size());
        Iterator<Field> it = fieldList.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getName());
        }
        return arrayList;
    }

    @Override // com.sun.jna.Structure
    protected int getNativeAlignment(Class<?> cls, Object obj, boolean z10) {
        return super.getNativeAlignment(cls, obj, true);
    }

    public Object getTypedValue(Class<?> cls) {
        ensureAllocated();
        for (Structure.StructField structField : fields().values()) {
            if (structField.type == cls) {
                this.activeField = structField;
                read();
                return getFieldValue(this.activeField.field);
            }
        }
        throw new IllegalArgumentException("No field of type " + cls + " in " + this);
    }

    @Override // com.sun.jna.Structure
    public Object readField(String str) {
        ensureAllocated();
        setType(str);
        return super.readField(str);
    }

    public void setType(Class<?> cls) {
        ensureAllocated();
        for (Structure.StructField structField : fields().values()) {
            if (structField.type == cls) {
                this.activeField = structField;
                return;
            }
        }
        throw new IllegalArgumentException("No field of type " + cls + " in " + this);
    }

    public Object setTypedValue(Object obj) {
        Structure.StructField structFieldFindField = findField(obj.getClass());
        if (structFieldFindField != null) {
            this.activeField = structFieldFindField;
            setFieldValue(structFieldFindField.field, obj);
            return this;
        }
        throw new IllegalArgumentException("No field of type " + obj.getClass() + " in " + this);
    }

    @Override // com.sun.jna.Structure
    public void writeField(String str) {
        ensureAllocated();
        setType(str);
        super.writeField(str);
    }

    protected Union(Pointer pointer) {
        super(pointer);
    }

    protected Union(Pointer pointer, int i10) {
        super(pointer, i10);
    }

    protected Union(TypeMapper typeMapper) {
        super(typeMapper);
    }

    @Override // com.sun.jna.Structure
    protected Object readField(Structure.StructField structField) {
        if (structField != this.activeField && (Structure.class.isAssignableFrom(structField.type) || String.class.isAssignableFrom(structField.type) || WString.class.isAssignableFrom(structField.type))) {
            return null;
        }
        return super.readField(structField);
    }

    @Override // com.sun.jna.Structure
    public void writeField(String str, Object obj) {
        ensureAllocated();
        setType(str);
        super.writeField(str, obj);
    }

    protected Union(Pointer pointer, int i10, TypeMapper typeMapper) {
        super(pointer, i10, typeMapper);
    }

    public void setType(String str) {
        ensureAllocated();
        Structure.StructField structField = fields().get(str);
        if (structField != null) {
            this.activeField = structField;
            return;
        }
        throw new IllegalArgumentException("No field named " + str + " in " + this);
    }

    @Override // com.sun.jna.Structure
    protected void writeField(Structure.StructField structField) {
        if (structField == this.activeField) {
            super.writeField(structField);
        }
    }
}
