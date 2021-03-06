package jp.utokyo.shibalab.googletakeoutparser.query;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Event class 
 * @deprecated
 */
public class Events {
	/* ==============================================================
	 * instance fields
	 * ============================================================== */
	/** query list */
	@JsonProperty("event")
	private List<Event> _events;
	

	/* ==============================================================
	 * instance methods
	 * ============================================================== */
	/**
	 * get query list
	 * @return query list
	 */
	public List<Query> listQueries() {
		List<Query> list = new ArrayList<Query>();
		for(Event obj:_events) {
			list.add(obj.getQuery());
		}
		return list;
	}
	
	/* @see java.lang.Object#toString() */
	@Override
	public String toString() { 
		return _events.toString();
	}
	
	
//	/* ==============================================================
//	 * inner class
//	 * ============================================================== */
//	/** class for query list */
//	@JsonIgnoreProperties(ignoreUnknown = true)
//	public class QueryObject {
//		/* instance fields --------------------------------- */
//		/** time-stamp property */
//		@JsonProperty("query")
//		private Query _query;
//
//		/* constructors ------------------------------------ */
//		/**
//		 * initialization
//		 */
//		public QueryObject() {
//			// nothing to do 
//		}
//		
//		/* instance methods -------------------------------- */
//		/**
//		 * get query text
//		 * @return query text
//		 */
//		public Query getQuery() {
//			return _query;
//		}
//	}
}
