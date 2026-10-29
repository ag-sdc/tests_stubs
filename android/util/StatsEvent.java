package android.util;

public final class StatsEvent {
    private StatsEvent() {}
    public static Builder newBuilder() { return new Builder(); }

    public static final class Builder {
        public Builder() {}
        public Builder setAtomId(int atomId) { return this; }
        public Builder writeBoolean(boolean val) { return this; }
        public Builder writeInt(int val) { return this; }
        public Builder writeLong(long val) { return this; }
        public Builder writeFloat(float val) { return this; }
        public Builder writeString(String val) { return this; }
        public Builder writeByteArray(byte[] val) { return this; }
        public Builder writeAttributionChain(int[] uids, String[] tags) { return this; }
        public Builder writeBooleanArray(boolean[] val) { return this; }
        public Builder writeIntArray(int[] val) { return this; }
        public Builder writeLongArray(long[] val) { return this; }
        public Builder writeFloatArray(float[] val) { return this; }
        public Builder writeStringArray(String[] val) { return this; }
        public Builder addBooleanAnnotation(byte id, boolean val) { return this; }
        public Builder addIntAnnotation(byte id, int val) { return this; }
        public Builder usePooledBuffer() { return this; }
        public StatsEvent build() { return new StatsEvent(); }
    }
}
