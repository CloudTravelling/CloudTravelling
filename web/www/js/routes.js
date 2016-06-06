angular.module('app.routes', [])

.config(function($stateProvider, $urlRouterProvider) {

  // Ionic uses AngularUI Router which uses the concept of states
  // Learn more here: https://github.com/angular-ui/ui-router
  // Set up the various states which the app can be in.
  // Each state's controller can be found in controllers.js
  $stateProvider
    
  

      .state('index', {
    url: '/page2',
    templateUrl: 'templates/index.html',
    controller: 'indexCtrl'
  })

  .state('tabsController.bus', {
    url: '/page3',
    views: {
      'tab2': {
        templateUrl: 'templates/bus.html',
        controller: 'busCtrl'
      }
    }
  })

  .state('tabsController.traffic', {
    url: '/page4',
    views: {
      'tab1': {
        templateUrl: 'templates/traffic.html',
        controller: 'trafficCtrl'
      }
    }
  })

  .state('tabsController.flight', {
    url: '/page6',
    views: {
      'tab3': {
        templateUrl: 'templates/flight.html',
        controller: 'flightCtrl'
      }
    }
  })

  .state('tabsController', {
    url: '/page1',
    templateUrl: 'templates/tabsController.html',
    abstract:true
  })

$urlRouterProvider.otherwise('/page2')

  

});