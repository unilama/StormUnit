package org.webik.storm.StormUnit.trident.mock;

import java.util.ArrayList;
import java.util.List;

import backtype.storm.tuple.Fields;
import backtype.storm.tuple.Values;
import storm.trident.tuple.TridentTuple;
import storm.trident.tuple.TridentTupleView;

public class TupleUtils{

	public static TridentTuple prepareTestTuple( Object... values ){
		return preapareTestTuple( "test", values );
	}

	public static TridentTuple preapareTestTuple( String fieldPrefix, Object... values ){
		
		List<String> fields = new ArrayList<String>();
		
		for( int i=0; i<values.length; i++ ){
			fields.add( fieldPrefix+i );
		}
		
		return new TridentTupleView.FreshOutputFactory( new Fields( fields ) ).create( new Values( values ) );
	}

}
