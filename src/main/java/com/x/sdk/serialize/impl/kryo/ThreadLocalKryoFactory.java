package com.x.sdk.serialize.impl.kryo;

import com.esotericsoftware.kryo.Kryo;


public class ThreadLocalKryoFactory extends KryoFactory {

	private final ThreadLocal<Kryo> holder = new ThreadLocal<Kryo>() {
		@Override
		protected Kryo initialValue() {
			return createKryo();
		}
	};

	public Kryo getKryo() {
		return holder.get();
	}
}
